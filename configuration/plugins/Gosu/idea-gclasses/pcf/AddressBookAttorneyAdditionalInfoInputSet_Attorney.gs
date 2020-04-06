package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookAttorneyAdditionalInfoInputSet.Attorney.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookAttorneyAdditionalInfoInputSet_Attorney extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($personVendor :  PersonVendor) : void {
    __widgetOf(this, pcf.AddressBookAttorneyAdditionalInfoInputSet_Attorney, SECTION_WIDGET_CLASS).setVariables(false, {$personVendor})
  }
  
  function refreshVariables ($personVendor :  PersonVendor) : void {
    __widgetOf(this, pcf.AddressBookAttorneyAdditionalInfoInputSet_Attorney, SECTION_WIDGET_CLASS).setVariables(true, {$personVendor})
  }
  
  
}