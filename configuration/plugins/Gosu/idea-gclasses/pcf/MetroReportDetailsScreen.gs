package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/metro/MetroReportDetailsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class MetroReportDetailsScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  Claim, $metroReport :  MetroReport) : void {
    __widgetOf(this, pcf.MetroReportDetailsScreen, SECTION_WIDGET_CLASS).setVariables(false, {$claim, $metroReport})
  }
  
  function refreshVariables ($claim :  Claim, $metroReport :  MetroReport) : void {
    __widgetOf(this, pcf.MetroReportDetailsScreen, SECTION_WIDGET_CLASS).setVariables(true, {$claim, $metroReport})
  }
  
  
}