package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/CompanyVendorSpecialtyInputSet.LawFirm.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CompanyVendorSpecialtyInputSet_LawFirmExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/CompanyVendorSpecialtyInputSet.LawFirm.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CompanyVendorSpecialtyInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyInput (id=LawFirmSpecialty) at CompanyVendorSpecialtyInputSet.LawFirm.pcf: line 16, column 43
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      LawFirm.LawFirmSpecialty = (__VALUE_TO_SET as typekey.LegalSpecialty)
    }
    
    // 'value' attribute on TypeKeyInput (id=LawFirmSpecialty) at CompanyVendorSpecialtyInputSet.LawFirm.pcf: line 16, column 43
    function valueRoot_3 () : java.lang.Object {
      return LawFirm
    }
    
    // 'value' attribute on TypeKeyInput (id=LawFirmSpecialty) at CompanyVendorSpecialtyInputSet.LawFirm.pcf: line 16, column 43
    function value_0 () : typekey.LegalSpecialty {
      return LawFirm.LawFirmSpecialty
    }
    
    property get contactHandle () : gw.api.contact.ContactHandle {
      return getRequireValue("contactHandle", 0) as gw.api.contact.ContactHandle
    }
    
    property set contactHandle ($arg :  gw.api.contact.ContactHandle) {
      setRequireValue("contactHandle", 0, $arg)
    }
    
    
          property get LawFirm() : LawFirm { return contactHandle.Contact as LawFirm; }
        
    
    
  }
  
  
}