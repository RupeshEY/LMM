package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/contacts/ContactDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ContactDetailScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($contactHandle :  gw.api.contact.ContactHandle, $canAccessLinkButtons :  boolean, $showRoles :  boolean, $linkStatus :  gw.api.contact.ContactSystemLinkStatus, $claim :  Claim, $canPick :  boolean, $showRelatedObjects :  boolean, $allowEditInAddressBook :  boolean) : void {
    __widgetOf(this, pcf.ContactDetailScreen, SECTION_WIDGET_CLASS).setVariables(false, {$contactHandle, $canAccessLinkButtons, $showRoles, $linkStatus, $claim, $canPick, $showRelatedObjects, $allowEditInAddressBook})
  }
  
  function refreshVariables ($contactHandle :  gw.api.contact.ContactHandle, $canAccessLinkButtons :  boolean, $showRoles :  boolean, $linkStatus :  gw.api.contact.ContactSystemLinkStatus, $claim :  Claim, $canPick :  boolean, $showRelatedObjects :  boolean, $allowEditInAddressBook :  boolean) : void {
    __widgetOf(this, pcf.ContactDetailScreen, SECTION_WIDGET_CLASS).setVariables(true, {$contactHandle, $canAccessLinkButtons, $showRoles, $linkStatus, $claim, $canPick, $showRelatedObjects, $allowEditInAddressBook})
  }
  
  
}