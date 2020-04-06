package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookPrimaryAddressInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookPrimaryAddressInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($contact :  Contact) : void {
    __widgetOf(this, pcf.AddressBookPrimaryAddressInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$contact})
  }
  
  function refreshVariables ($contact :  Contact) : void {
    __widgetOf(this, pcf.AddressBookPrimaryAddressInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$contact})
  }
  
  
}