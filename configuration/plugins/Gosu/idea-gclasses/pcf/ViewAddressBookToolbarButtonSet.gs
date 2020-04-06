package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/ViewAddressBookToolbarButtonSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ViewAddressBookToolbarButtonSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($contactHandle :  gw.api.contact.ContactHandle, $linkStatus :  gw.api.contact.ContactSystemLinkStatus, $allowEditInAddressBook :  boolean) : void {
    __widgetOf(this, pcf.ViewAddressBookToolbarButtonSet, SECTION_WIDGET_CLASS).setVariables(false, {$contactHandle, $linkStatus, $allowEditInAddressBook})
  }
  
  function refreshVariables ($contactHandle :  gw.api.contact.ContactHandle, $linkStatus :  gw.api.contact.ContactSystemLinkStatus, $allowEditInAddressBook :  boolean) : void {
    __widgetOf(this, pcf.ViewAddressBookToolbarButtonSet, SECTION_WIDGET_CLASS).setVariables(true, {$contactHandle, $linkStatus, $allowEditInAddressBook})
  }
  
  
}