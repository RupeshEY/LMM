package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/CompanyVendorSpecialtyInputSet.MedicalCareOrg.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CompanyVendorSpecialtyInputSet_MedicalCareOrgExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/CompanyVendorSpecialtyInputSet.MedicalCareOrg.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CompanyVendorSpecialtyInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyInput (id=MedicalSpecialty) at CompanyVendorSpecialtyInputSet.MedicalCareOrg.pcf: line 25, column 42
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      MedicalCareOrg.MedicalOrgSpecialty = (__VALUE_TO_SET as typekey.SpecialtyType)
    }
    
    // 'value' attribute on TypeKeyInput (id=MedicalSpecialty) at CompanyVendorSpecialtyInputSet.MedicalCareOrg.pcf: line 25, column 42
    function valueRoot_3 () : java.lang.Object {
      return MedicalCareOrg
    }
    
    // 'value' attribute on TypeKeyInput (id=MedicalSpecialty) at CompanyVendorSpecialtyInputSet.MedicalCareOrg.pcf: line 25, column 42
    function value_0 () : typekey.SpecialtyType {
      return MedicalCareOrg.MedicalOrgSpecialty
    }
    
    property get contactHandle () : gw.api.contact.ContactHandle {
      return getRequireValue("contactHandle", 0) as gw.api.contact.ContactHandle
    }
    
    property set contactHandle ($arg :  gw.api.contact.ContactHandle) {
      setRequireValue("contactHandle", 0, $arg)
    }
    
    
          property get MedicalCareOrg() : MedicalCareOrg { return contactHandle.Contact as MedicalCareOrg; }
        
    
    
  }
  
  
}