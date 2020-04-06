package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookDoctorAdditionalInfoInputSet.Doctor.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookDoctorAdditionalInfoInputSet_Doctor extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($personVendor :  PersonVendor) : void {
    __widgetOf(this, pcf.AddressBookDoctorAdditionalInfoInputSet_Doctor, SECTION_WIDGET_CLASS).setVariables(false, {$personVendor})
  }
  
  function refreshVariables ($personVendor :  PersonVendor) : void {
    __widgetOf(this, pcf.AddressBookDoctorAdditionalInfoInputSet_Doctor, SECTION_WIDGET_CLASS).setVariables(true, {$personVendor})
  }
  
  
}