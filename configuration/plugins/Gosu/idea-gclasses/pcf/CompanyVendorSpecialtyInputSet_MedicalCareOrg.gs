package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/CompanyVendorSpecialtyInputSet.MedicalCareOrg.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CompanyVendorSpecialtyInputSet_MedicalCareOrg extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($contactHandle :  gw.api.contact.ContactHandle) : void {
    __widgetOf(this, pcf.CompanyVendorSpecialtyInputSet_MedicalCareOrg, SECTION_WIDGET_CLASS).setVariables(false, {$contactHandle})
  }
  
  function refreshVariables ($contactHandle :  gw.api.contact.ContactHandle) : void {
    __widgetOf(this, pcf.CompanyVendorSpecialtyInputSet_MedicalCareOrg, SECTION_WIDGET_CLASS).setVariables(true, {$contactHandle})
  }
  
  
}