package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookCompanyVendorSpecialtyInputSet.MedicalCareOrg.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookCompanyVendorSpecialtyInputSet_MedicalCareOrgExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBookCompanyVendorSpecialtyInputSet.MedicalCareOrg.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookCompanyVendorSpecialtyInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyInput (id=MedicalSpecialty) at AddressBookCompanyVendorSpecialtyInputSet.MedicalCareOrg.pcf: line 16, column 42
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      (CompanyVendor as MedicalCareOrg).MedicalOrgSpecialty = (__VALUE_TO_SET as typekey.SpecialtyType)
    }
    
    // 'value' attribute on TypeKeyInput (id=MedicalSpecialty) at AddressBookCompanyVendorSpecialtyInputSet.MedicalCareOrg.pcf: line 16, column 42
    function valueRoot_3 () : java.lang.Object {
      return (CompanyVendor as MedicalCareOrg)
    }
    
    // 'value' attribute on TypeKeyInput (id=MedicalSpecialty) at AddressBookCompanyVendorSpecialtyInputSet.MedicalCareOrg.pcf: line 16, column 42
    function value_0 () : typekey.SpecialtyType {
      return (CompanyVendor as MedicalCareOrg).MedicalOrgSpecialty
    }
    
    property get CompanyVendor () : CompanyVendor {
      return getRequireValue("CompanyVendor", 0) as CompanyVendor
    }
    
    property set CompanyVendor ($arg :  CompanyVendor) {
      setRequireValue("CompanyVendor", 0, $arg)
    }
    
    
  }
  
  
}