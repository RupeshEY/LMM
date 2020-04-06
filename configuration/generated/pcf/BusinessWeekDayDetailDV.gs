package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/businessweek/BusinessWeekDayDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class BusinessWeekDayDetailDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($businessWeek :  BusinessWeek) : void {
    __widgetOf(this, pcf.BusinessWeekDayDetailDV, SECTION_WIDGET_CLASS).setVariables(false, {$businessWeek})
  }
  
  function refreshVariables ($businessWeek :  BusinessWeek) : void {
    __widgetOf(this, pcf.BusinessWeekDayDetailDV, SECTION_WIDGET_CLASS).setVariables(true, {$businessWeek})
  }
  
  
}