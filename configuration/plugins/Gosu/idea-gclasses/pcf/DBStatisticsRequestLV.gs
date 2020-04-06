package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/DBStatisticsRequestLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DBStatisticsRequestLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($TablePickers :  gw.api.tools.PickerRow[]) : void {
    __widgetOf(this, pcf.DBStatisticsRequestLV, SECTION_WIDGET_CLASS).setVariables(false, {$TablePickers})
  }
  
  function refreshVariables ($TablePickers :  gw.api.tools.PickerRow[]) : void {
    __widgetOf(this, pcf.DBStatisticsRequestLV, SECTION_WIDGET_CLASS).setVariables(true, {$TablePickers})
  }
  
  
}