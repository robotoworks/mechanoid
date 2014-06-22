<?xml version="1.0"?>
<globals>
    <global id="projectOut" value="." />
    <global id="manifestOut" value="${manifestDir}" />
    <global id="appCompat" value="${(minApiLevel lt 14)?string('1','')}" />
    <!-- e.g. getSupportActionBar vs. getActionBar -->
    <global id="Support" value="${(minApiLevel lt 14)?string('Support','')}" />
    <global id="srcOut" value="${srcDir}/${slashedPackageName(packageName)}" />
    <global id="resOut" value="${resDir}" />
</globals>
