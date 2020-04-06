package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookContactBasicsDV.Place.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookContactBasicsDV_Place extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($contact :  Contact, $externalContactSource :  gw.api.contact.ExternalContactSource, $allowEditContact :  boolean) : void {
    __widgetOf(this, pcf.AddressBookContactBasicsDV_Place, SECTION_WIDGET_CLASS).setVariables(false, {$contact, $externalContactSource, $allowEditContact})
  }
  
  function refreshVariables ($contact :  Contact, $externalContactSource :  gw.api.contact.ExternalContactSource, $allowEditContact :  boolean) : void {
    __widgetOf(this, pcf.AddressBookContactBasicsDV_Place, SECTION_WIDGET_CLASS).setVariables(true, {$contact, $externalContactSource, $allowEditContact})
  }
  
  
}