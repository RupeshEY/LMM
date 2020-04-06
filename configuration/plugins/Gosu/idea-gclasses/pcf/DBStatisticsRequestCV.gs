package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/DBStatisticsRequestCV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DBStatisticsRequestCV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($PageHelper :  gw.api.tools.DatabaseStatisticsHelper) : void {
    __widgetOf(this, pcf.DBStatisticsRequestCV, SECTION_WIDGET_CLASS).setVariables(false, {$PageHelper})
  }
  
  function refreshVariables ($PageHelper :  gw.api.tools.DatabaseStatisticsHelper) : void {
    __widgetOf(this, pcf.DBStatisticsRequestCV, SECTION_WIDGET_CLASS).setVariables(true, {$PageHelper})
  }
  
  
}