package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookVendorW9InfoInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookVendorW9InfoInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($contact :  Contact) : void {
    __widgetOf(this, pcf.AddressBookVendorW9InfoInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$contact})
  }
  
  function refreshVariables ($contact :  Contact) : void {
    __widgetOf(this, pcf.AddressBookVendorW9InfoInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$contact})
  }
  
  
}