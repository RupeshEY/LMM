package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/businessweek/BusinessWeekDetailDV.CA.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class BusinessWeekDetailDV_CA extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($BusinessWeek :  BusinessWeek) : void {
    __widgetOf(this, pcf.BusinessWeekDetailDV_CA, SECTION_WIDGET_CLASS).setVariables(false, {$BusinessWeek})
  }
  
  function refreshVariables ($BusinessWeek :  BusinessWeek) : void {
    __widgetOf(this, pcf.BusinessWeekDetailDV_CA, SECTION_WIDGET_CLASS).setVariables(true, {$BusinessWeek})
  }
  
  
}