package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookCompanyVendorAdditionalInfoInputSet_CompanyVendor extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($company :  Company) : void {
    __widgetOf(this, pcf.AddressBookCompanyVendorAdditionalInfoInputSet_CompanyVendor, SECTION_WIDGET_CLASS).setVariables(false, {$company})
  }
  
  function refreshVariables ($company :  Company) : void {
    __widgetOf(this, pcf.AddressBookCompanyVendorAdditionalInfoInputSet_CompanyVendor, SECTION_WIDGET_CLASS).setVariables(true, {$company})
  }
  
  
}