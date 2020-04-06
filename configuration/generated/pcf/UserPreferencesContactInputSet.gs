package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/preferences/UserPreferencesContactInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class UserPreferencesContactInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($user :  User, $addressOwner :  gw.api.address.AddressOwner) : void {
    __widgetOf(this, pcf.UserPreferencesContactInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$user, $addressOwner})
  }
  
  function refreshVariables ($user :  User, $addressOwner :  gw.api.address.AddressOwner) : void {
    __widgetOf(this, pcf.UserPreferencesContactInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$user, $addressOwner})
  }
  
  
}