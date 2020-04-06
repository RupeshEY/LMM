package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookAdditionalInfoInputSet.Adjudicator.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookAdditionalInfoInputSet_Adjudicator extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($contact :  Person, $externalContactSource :  gw.api.contact.ExternalContactSource, $allowEditContact :  boolean) : void {
    __widgetOf(this, pcf.AddressBookAdditionalInfoInputSet_Adjudicator, SECTION_WIDGET_CLASS).setVariables(false, {$contact, $externalContactSource, $allowEditContact})
  }
  
  function refreshVariables ($contact :  Person, $externalContactSource :  gw.api.contact.ExternalContactSource, $allowEditContact :  boolean) : void {
    __widgetOf(this, pcf.AddressBookAdditionalInfoInputSet_Adjudicator, SECTION_WIDGET_CLASS).setVariables(true, {$contact, $externalContactSource, $allowEditContact})
  }
  
  
}