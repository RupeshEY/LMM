package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/users/UserRegionLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class UserRegionLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($User :  User) : void {
    __widgetOf(this, pcf.UserRegionLV, SECTION_WIDGET_CLASS).setVariables(false, {$User})
  }
  
  function refreshVariables ($User :  User) : void {
    __widgetOf(this, pcf.UserRegionLV, SECTION_WIDGET_CLASS).setVariables(true, {$User})
  }
  
  
}