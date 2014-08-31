package com.robotoworks.mechanoid;

import org.gradle.api.*;
import org.gradle.api.tasks.Exec;

class MechanoidPlugin implements Plugin<Project> {
    void apply(Project project) {

        project.extensions.create('mechanoid', MechanoidPluginExtension)
        project.afterEvaluate {
            project.task(type: Exec, 'generateMechanoidSources') {
                // TODO: Replace the need for an external path with managed dependency
                if (!project.mechanoid.mechanoidStandaloneJarPath) {
                    throw new GradleException('Mechanoid jar path not defined! \n' +
                            'Please define as following:\n' +
                            'mechanoid {\n ' +
                            'mechanoidStandaloneJarPath \'path-to-jar-file\'\n' +
                            '}')
                }

                if (!project.mechanoid.modelPath) {
                    throw new GradleException('Mechanoid model path not defined! \n' +
                            'Please define as following:\n' +
                            'mechanoid {\n ' +
                            'modelPath \'path-to-model-folder\'\n' +
                            '}')
                }
                inputs.dir project.mechanoid.modelPath

                if (project.mechanoid.outputPath) {
                    outputs.dir project.mechanoid.outputPath
                } else {
                    outputs.dir 'src-gen'
                }

                // TODO: Replace the need for an external path with managed dependency
                ext.arguments = ['-jar',
                                 project.mechanoid.mechanoidStandaloneJarPath]

                if (project.mechanoid.outputPath) {
                    ext.arguments.add '-output'
                    ext.arguments.add project.mechanoid.outputPath
                }
                if (project.mechanoid.stubPath) {
                    ext.arguments.add '-stubs'
                    ext.arguments.add project.mechanoid.stubPath
                }
                if (project.mechanoid.recurse) {
                    ext.arguments.add '-r'
                }

                ext.arguments.add project.mechanoid.modelPath

                args ext.arguments
                executable 'java'

                //store the output instead of printing to the console:
                standardOutput = new ByteArrayOutputStream()

                doLast {
                    project.logger.debug(standardOutput.toString())
                }

            }

            project.preBuild.dependsOn project.generateMechanoidSources
        }
    }
}