package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/assignment/UserAssignmentCalendarScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class UserAssignmentCalendarScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($User :  User) : void {
    __widgetOf(this, pcf.UserAssignmentCalendarScreen, SECTION_WIDGET_CLASS).setVariables(false, {$User})
  }
  
  function refreshVariables ($User :  User) : void {
    __widgetOf(this, pcf.UserAssignmentCalendarScreen, SECTION_WIDGET_CLASS).setVariables(true, {$User})
  }
  
  
}