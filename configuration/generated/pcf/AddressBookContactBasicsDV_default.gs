package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookContactBasicsDV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookContactBasicsDV_default extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($contact :  Contact, $externalContactSource :  gw.api.contact.ExternalContactSource, $allowEditContact :  boolean) : void {
    __widgetOf(this, pcf.AddressBookContactBasicsDV_default, SECTION_WIDGET_CLASS).setVariables(false, {$contact, $externalContactSource, $allowEditContact})
  }
  
  function refreshVariables ($contact :  Contact, $externalContactSource :  gw.api.contact.ExternalContactSource, $allowEditContact :  boolean) : void {
    __widgetOf(this, pcf.AddressBookContactBasicsDV_default, SECTION_WIDGET_CLASS).setVariables(true, {$contact, $externalContactSource, $allowEditContact})
  }
  
  
}