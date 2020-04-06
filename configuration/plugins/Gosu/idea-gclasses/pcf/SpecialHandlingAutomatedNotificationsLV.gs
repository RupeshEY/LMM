package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/specialhandling/SpecialHandlingAutomatedNotificationsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class SpecialHandlingAutomatedNotificationsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($specialHandling :  SpecialHandling, $permEditNotifications :  boolean) : void {
    __widgetOf(this, pcf.SpecialHandlingAutomatedNotificationsLV, SECTION_WIDGET_CLASS).setVariables(false, {$specialHandling, $permEditNotifications})
  }
  
  function refreshVariables ($specialHandling :  SpecialHandling, $permEditNotifications :  boolean) : void {
    __widgetOf(this, pcf.SpecialHandlingAutomatedNotificationsLV, SECTION_WIDGET_CLASS).setVariables(true, {$specialHandling, $permEditNotifications})
  }
  
  
}