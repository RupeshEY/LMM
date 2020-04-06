package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/specialhandling/SpecialHandlingAutomatedActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class SpecialHandlingAutomatedActivitiesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($specialHandling :  SpecialHandling, $permEditActivities :  boolean) : void {
    __widgetOf(this, pcf.SpecialHandlingAutomatedActivitiesLV, SECTION_WIDGET_CLASS).setVariables(false, {$specialHandling, $permEditActivities})
  }
  
  function refreshVariables ($specialHandling :  SpecialHandling, $permEditActivities :  boolean) : void {
    __widgetOf(this, pcf.SpecialHandlingAutomatedActivitiesLV, SECTION_WIDGET_CLASS).setVariables(true, {$specialHandling, $permEditActivities})
  }
  
  
}