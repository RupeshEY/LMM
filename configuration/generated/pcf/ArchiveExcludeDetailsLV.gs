package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/ArchiveExcludeDetailsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ArchiveExcludeDetailsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($archiveDetails :  gw.api.archiving.ArchiveDetails) : void {
    __widgetOf(this, pcf.ArchiveExcludeDetailsLV, SECTION_WIDGET_CLASS).setVariables(false, {$archiveDetails})
  }
  
  function refreshVariables ($archiveDetails :  gw.api.archiving.ArchiveDetails) : void {
    __widgetOf(this, pcf.ArchiveExcludeDetailsLV, SECTION_WIDGET_CLASS).setVariables(true, {$archiveDetails})
  }
  
  
}