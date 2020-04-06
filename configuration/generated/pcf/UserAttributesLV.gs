package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/users/UserAttributesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class UserAttributesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($User :  User) : void {
    __widgetOf(this, pcf.UserAttributesLV, SECTION_WIDGET_CLASS).setVariables(false, {$User})
  }
  
  function refreshVariables ($User :  User) : void {
    __widgetOf(this, pcf.UserAttributesLV, SECTION_WIDGET_CLASS).setVariables(true, {$User})
  }
  
  
}