package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/users/UserAssignableDV.exposure.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class UserAssignableDV_exposure extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($User :  User) : void {
    __widgetOf(this, pcf.UserAssignableDV_exposure, SECTION_WIDGET_CLASS).setVariables(false, {$User})
  }
  
  function refreshVariables ($User :  User) : void {
    __widgetOf(this, pcf.UserAssignableDV_exposure, SECTION_WIDGET_CLASS).setVariables(true, {$User})
  }
  
  
}