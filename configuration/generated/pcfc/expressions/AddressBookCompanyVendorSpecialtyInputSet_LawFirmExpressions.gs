package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookCompanyVendorSpecialtyInputSet.LawFirm.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookCompanyVendorSpecialtyInputSet_LawFirmExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBookCompanyVendorSpecialtyInputSet.LawFirm.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookCompanyVendorSpecialtyInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyInput (id=LawFirmSpecialty) at AddressBookCompanyVendorSpecialtyInputSet.LawFirm.pcf: line 16, column 43
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      (CompanyVendor as LawFirm).LawFirmSpecialty = (__VALUE_TO_SET as typekey.LegalSpecialty)
    }
    
    // 'value' attribute on TypeKeyInput (id=LawFirmSpecialty) at AddressBookCompanyVendorSpecialtyInputSet.LawFirm.pcf: line 16, column 43
    function valueRoot_3 () : java.lang.Object {
      return (CompanyVendor as LawFirm)
    }
    
    // 'value' attribute on TypeKeyInput (id=LawFirmSpecialty) at AddressBookCompanyVendorSpecialtyInputSet.LawFirm.pcf: line 16, column 43
    function value_0 () : typekey.LegalSpecialty {
      return (CompanyVendor as LawFirm).LawFirmSpecialty
    }
    
    property get CompanyVendor () : CompanyVendor {
      return getRequireValue("CompanyVendor", 0) as CompanyVendor
    }
    
    property set CompanyVendor ($arg :  CompanyVendor) {
      setRequireValue("CompanyVendor", 0, $arg)
    }
    
    
  }
  
  
}