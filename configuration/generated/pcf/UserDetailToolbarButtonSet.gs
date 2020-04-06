package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/users/UserDetailToolbarButtonSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class UserDetailToolbarButtonSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($user :  User, $linkStatus :  gw.api.contact.ContactSystemLinkStatus, $allowEditInAddressBook :  boolean) : void {
    __widgetOf(this, pcf.UserDetailToolbarButtonSet, SECTION_WIDGET_CLASS).setVariables(false, {$user, $linkStatus, $allowEditInAddressBook})
  }
  
  function refreshVariables ($user :  User, $linkStatus :  gw.api.contact.ContactSystemLinkStatus, $allowEditInAddressBook :  boolean) : void {
    __widgetOf(this, pcf.UserDetailToolbarButtonSet, SECTION_WIDGET_CLASS).setVariables(true, {$user, $linkStatus, $allowEditInAddressBook})
  }
  
  
}