package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/ArchiveExcludeDetailsCV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ArchiveExcludeDetailsCV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($archiveCountSummary :  gw.api.archiving.ArchiveCountSummary) : void {
    __widgetOf(this, pcf.ArchiveExcludeDetailsCV, SECTION_WIDGET_CLASS).setVariables(false, {$archiveCountSummary})
  }
  
  function refreshVariables ($archiveCountSummary :  gw.api.archiving.ArchiveCountSummary) : void {
    __widgetOf(this, pcf.ArchiveExcludeDetailsCV, SECTION_WIDGET_CLASS).setVariables(true, {$archiveCountSummary})
  }
  
  
}