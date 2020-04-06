package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookCompanyVendorSpecialtyInputSet.AutoTowingAgcy.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookCompanyVendorSpecialtyInputSet_AutoTowingAgcy extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($CompanyVendor :  CompanyVendor) : void {
    __widgetOf(this, pcf.AddressBookCompanyVendorSpecialtyInputSet_AutoTowingAgcy, SECTION_WIDGET_CLASS).setVariables(false, {$CompanyVendor})
  }
  
  function refreshVariables ($CompanyVendor :  CompanyVendor) : void {
    __widgetOf(this, pcf.AddressBookCompanyVendorSpecialtyInputSet_AutoTowingAgcy, SECTION_WIDGET_CLASS).setVariables(true, {$CompanyVendor})
  }
  
  
}