package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/PerfDownloadLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PerfDownloadLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($PageHelper :  gw.api.tools.PerfReportHelper) : void {
    __widgetOf(this, pcf.PerfDownloadLV, SECTION_WIDGET_CLASS).setVariables(false, {$PageHelper})
  }
  
  function refreshVariables ($PageHelper :  gw.api.tools.PerfReportHelper) : void {
    __widgetOf(this, pcf.PerfDownloadLV, SECTION_WIDGET_CLASS).setVariables(true, {$PageHelper})
  }
  
  
}