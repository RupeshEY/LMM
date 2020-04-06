package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookBusinessContactInfoInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookBusinessContactInfoInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($businessContact :  Contact, $externalContactSource :  gw.api.contact.ExternalContactSource, $allowEditContact :  boolean) : void {
    __widgetOf(this, pcf.AddressBookBusinessContactInfoInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$businessContact, $externalContactSource, $allowEditContact})
  }
  
  function refreshVariables ($businessContact :  Contact, $externalContactSource :  gw.api.contact.ExternalContactSource, $allowEditContact :  boolean) : void {
    __widgetOf(this, pcf.AddressBookBusinessContactInfoInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$businessContact, $externalContactSource, $allowEditContact})
  }
  
  
}