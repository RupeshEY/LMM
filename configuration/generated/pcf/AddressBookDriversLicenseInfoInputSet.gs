package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookDriversLicenseInfoInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookDriversLicenseInfoInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($person :  Person) : void {
    __widgetOf(this, pcf.AddressBookDriversLicenseInfoInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$person})
  }
  
  function refreshVariables ($person :  Person) : void {
    __widgetOf(this, pcf.AddressBookDriversLicenseInfoInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$person})
  }
  
  
}