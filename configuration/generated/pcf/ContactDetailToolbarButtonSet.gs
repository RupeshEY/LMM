package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/ContactDetailToolbarButtonSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ContactDetailToolbarButtonSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($contactHandle :  gw.api.contact.ContactHandle, $canAccessLinkButtons :  boolean, $linkStatus :  gw.api.contact.ContactSystemLinkStatus, $canPick :  boolean, $allowEditInAddressBook :  boolean) : void {
    __widgetOf(this, pcf.ContactDetailToolbarButtonSet, SECTION_WIDGET_CLASS).setVariables(false, {$contactHandle, $canAccessLinkButtons, $linkStatus, $canPick, $allowEditInAddressBook})
  }
  
  function refreshVariables ($contactHandle :  gw.api.contact.ContactHandle, $canAccessLinkButtons :  boolean, $linkStatus :  gw.api.contact.ContactSystemLinkStatus, $canPick :  boolean, $allowEditInAddressBook :  boolean) : void {
    __widgetOf(this, pcf.ContactDetailToolbarButtonSet, SECTION_WIDGET_CLASS).setVariables(true, {$contactHandle, $canAccessLinkButtons, $linkStatus, $canPick, $allowEditInAddressBook})
  }
  
  
}