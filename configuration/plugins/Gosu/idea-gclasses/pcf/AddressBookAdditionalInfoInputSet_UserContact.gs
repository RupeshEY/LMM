package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookAdditionalInfoInputSet.UserContact.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookAdditionalInfoInputSet_UserContact extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Contact :  Person, $externalContactSource :  gw.api.contact.ExternalContactSource, $allowEditContact :  boolean) : void {
    __widgetOf(this, pcf.AddressBookAdditionalInfoInputSet_UserContact, SECTION_WIDGET_CLASS).setVariables(false, {$Contact, $externalContactSource, $allowEditContact})
  }
  
  function refreshVariables ($Contact :  Person, $externalContactSource :  gw.api.contact.ExternalContactSource, $allowEditContact :  boolean) : void {
    __widgetOf(this, pcf.AddressBookAdditionalInfoInputSet_UserContact, SECTION_WIDGET_CLASS).setVariables(true, {$Contact, $externalContactSource, $allowEditContact})
  }
  
  
}