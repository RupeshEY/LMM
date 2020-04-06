package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookRelatedContactsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookRelatedContactsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($primaryContact :  Contact, $externalContactSource :  gw.api.contact.ExternalContactSource, $allowEditContact :  boolean) : void {
    __widgetOf(this, pcf.AddressBookRelatedContactsLV, SECTION_WIDGET_CLASS).setVariables(false, {$primaryContact, $externalContactSource, $allowEditContact})
  }
  
  function refreshVariables ($primaryContact :  Contact, $externalContactSource :  gw.api.contact.ExternalContactSource, $allowEditContact :  boolean) : void {
    __widgetOf(this, pcf.AddressBookRelatedContactsLV, SECTION_WIDGET_CLASS).setVariables(true, {$primaryContact, $externalContactSource, $allowEditContact})
  }
  
  
}