package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/businessweek/BusinessWeekDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class BusinessWeekDetailScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($businessWeek :  BusinessWeek) : void {
    __widgetOf(this, pcf.BusinessWeekDetailScreen, SECTION_WIDGET_CLASS).setVariables(false, {$businessWeek})
  }
  
  function refreshVariables ($businessWeek :  BusinessWeek) : void {
    __widgetOf(this, pcf.BusinessWeekDetailScreen, SECTION_WIDGET_CLASS).setVariables(true, {$businessWeek})
  }
  
  
}