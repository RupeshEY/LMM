package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookCompanyVendorSpecialtyInputSet.AutoRepairShop.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookCompanyVendorSpecialtyInputSet_AutoRepairShop extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($CompanyVendor :  CompanyVendor) : void {
    __widgetOf(this, pcf.AddressBookCompanyVendorSpecialtyInputSet_AutoRepairShop, SECTION_WIDGET_CLASS).setVariables(false, {$CompanyVendor})
  }
  
  function refreshVariables ($CompanyVendor :  CompanyVendor) : void {
    __widgetOf(this, pcf.AddressBookCompanyVendorSpecialtyInputSet_AutoRepairShop, SECTION_WIDGET_CLASS).setVariables(true, {$CompanyVendor})
  }
  
  
}