#!/usr/bin/ruby

require 'tempfile'
require 'fileutils'
require 'rexml/document'

include REXML

newVersion = ARGV[0]

puts "New version to #{newVersion}"

updateSiteCategories(newVersion)
updateFeatureVersions(newVersion)
updateManifestVersions("plugins/*/META-INF/MANIFEST.MF", newVersion)
updateManifestVersions("libs/*/META-INF/MANIFEST.MF", newVersion)

Dir.glob("features/*/pom.xml") do |entry|
    updatePomVersion(entry, newVersion, true)
end

Dir.glob("releng/*/pom.xml") do |entry|
    updatePomVersion(entry, newVersion, true)
end

Dir.glob("plugins/*/pom.xml") do |entry|
    updatePomVersion(entry, newVersion, true)
end

Dir.glob("libs/*/pom.xml") do |entry|
    updatePomVersion(entry, newVersion, true)
end

updatePomVersion("pom.xml", newVersion, false)

updateDocsVersion("docs/source/conf.py", newVersion)

updateShellScriptMechVersion("build.sh", newVersion)

BEGIN {
    def updateManifestVersions(path, version)
        Dir.glob(path) do |entry|
            
            puts "Updating #{entry} to version #{version}"
            
            tempFile = Tempfile.new("mechanoid.temp")
            
            IO.foreach(entry) { |block|
                if(block =~ /Bundle-Version/)
                    tempFile.syswrite("Bundle-Version: #{version}.qualifier\n")
                    else
                    tempFile.syswrite(block)
                end
            }
            
            tempFile.close()
            
            FileUtils.cp(tempFile.path, entry) if File.size(tempFile.path) > 0
            
            File.delete(tempFile.path)
            
        end
    end
    
    def updateSiteCategories(version)
        Dir.glob("releng/*/category.xml") do |entry|
        
        puts "Updating #{entry} to version #{version}"
        
        xmlfile = File.read(entry)
        xmldoc = Document.new(xmlfile)
        xmldoc.context[:attribute_quote] = :quote
        xmldoc.context[:respect_whitespace] = :all
        
        featureNodes = XPath.match(xmldoc, "//site/feature")
        for n in featureNodes
            n.attributes["version"] = "#{version}.qualifier"
        end
        
        tempFile = Tempfile.new("mechanoid.temp")
        xmldoc.write(tempFile)
        
        tempFile.close
        
        FileUtils.cp(tempFile.path, entry) if File.size(tempFile.path) > 0
        
        File.delete(tempFile.path)
        
        #puts contents.gsub(/(<feature.*?version=").*?(".*?>)/m, "\\1#{version}.qualifier\\2")
    end
    end
    
    def updateFeatureVersions(version)
        Dir.glob("features/*/feature.xml") do |entry|
            
            puts "Updating #{entry} to version #{version}"
            
            xmlfile = File.read(entry)
            xmldoc = Document.new(xmlfile)
            xmldoc.context[:attribute_quote] = :quote
            xmldoc.context[:respect_whitespace] = :all
            
            featureNode = XPath.first(xmldoc, "//feature")
            featureNode.attributes["version"] = "#{version}.qualifier"
            
            tempFile = Tempfile.new("mechanoid.temp")
            xmldoc.write(tempFile)
            
            tempFile.close
            
            FileUtils.cp(tempFile.path, entry) if File.size(tempFile.path) > 0
            
            File.delete(tempFile.path)
            
            #puts contents.gsub(/(<feature.*?version=").*?(".*?>)/m, "\\1#{version}.qualifier\\2")
        end
    end
    
    def updatePomVersion(filePath, version, updateParent)
            puts "Updating #{filePath} to version #{version}"
            
            xmlfile = File.read(filePath)
            xmldoc = Document.new(xmlfile)
            xmldoc.context[:attribute_quote] = :quote
            xmldoc.context[:respect_whitespace] = :all
            
            versionNode = XPath.first(xmldoc, "//project/version")
            versionNode.text = "#{version}-SNAPSHOT"
    
            mechVersionNode = XPath.first(xmldoc, "//project/properties/mechanoid-version")
    
            if(mechVersionNode != nil)
             mechVersionNode.text = "#{version}-SNAPSHOT"
            end
    
            if updateParent == true
                parentVersionNode = XPath.first(xmldoc, "//project/parent/version")
                parentVersionNode.text = "#{version}-SNAPSHOT"
            end
            tempFile = Tempfile.new("mechanoid.temp")
            xmldoc.write(tempFile)
            
            tempFile.close
            
            FileUtils.cp(tempFile.path, filePath) if File.size(tempFile.path) > 0
            
            File.delete(tempFile.path)
    end
    
    def updateDocsVersion(filePath, version)
        puts "Updating #{filePath} to version #{version}"
        
        tempFile = Tempfile.new("mechanoid.temp")
        
        IO.foreach(filePath) { |block|
            if(block =~ /version =/)
                tempFile.syswrite("version = '#{version} ALPHA'\n")
                else
                tempFile.syswrite(block)
            end
        }
        
        tempFile.close()
        
        FileUtils.cp(tempFile.path, filePath) if File.size(tempFile.path) > 0
        
        File.delete(tempFile.path)
    end
    
    def updateShellScriptMechVersion(filePath, version)
        puts "Updating #{filePath} to version #{version}"
        
        tempFile = Tempfile.new("mechanoid.temp")
        
        IO.foreach(filePath) { |block|
            if(block =~ /MECH_VERSION=/)
                tempFile.syswrite("MECH_VERSION=#{version}\n")
                else
                tempFile.syswrite(block)
            end
        }
        
        tempFile.close()
        
        FileUtils.cp(tempFile.path, filePath) if File.size(tempFile.path) > 0
        
        File.delete(tempFile.path)
    end
}

