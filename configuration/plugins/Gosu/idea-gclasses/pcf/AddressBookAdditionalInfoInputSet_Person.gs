package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookAdditionalInfoInputSet.Person.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookAdditionalInfoInputSet_Person extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($person :  Person, $externalContactSource :  gw.api.contact.ExternalContactSource, $allowEditContact :  boolean) : void {
    __widgetOf(this, pcf.AddressBookAdditionalInfoInputSet_Person, SECTION_WIDGET_CLASS).setVariables(false, {$person, $externalContactSource, $allowEditContact})
  }
  
  function refreshVariables ($person :  Person, $externalContactSource :  gw.api.contact.ExternalContactSource, $allowEditContact :  boolean) : void {
    __widgetOf(this, pcf.AddressBookAdditionalInfoInputSet_Person, SECTION_WIDGET_CLASS).setVariables(true, {$person, $externalContactSource, $allowEditContact})
  }
  
  
}