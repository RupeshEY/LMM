package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/users/UserGroupsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class UserGroupsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($User :  User) : void {
    __widgetOf(this, pcf.UserGroupsLV, SECTION_WIDGET_CLASS).setVariables(false, {$User})
  }
  
  function refreshVariables ($User :  User) : void {
    __widgetOf(this, pcf.UserGroupsLV, SECTION_WIDGET_CLASS).setVariables(true, {$User})
  }
  
  
}