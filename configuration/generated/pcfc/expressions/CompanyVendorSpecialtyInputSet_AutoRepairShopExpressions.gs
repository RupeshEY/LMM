package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/CompanyVendorSpecialtyInputSet.AutoRepairShop.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CompanyVendorSpecialtyInputSet_AutoRepairShopExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/CompanyVendorSpecialtyInputSet.AutoRepairShop.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CompanyVendorSpecialtyInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=BusinessLicense) at CompanyVendorSpecialtyInputSet.AutoRepairShop.pcf: line 15, column 49
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      AutoRepairShop.AutoRepairLicense = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=BusinessLicense) at CompanyVendorSpecialtyInputSet.AutoRepairShop.pcf: line 15, column 49
    function valueRoot_3 () : java.lang.Object {
      return AutoRepairShop
    }
    
    // 'value' attribute on TextInput (id=BusinessLicense) at CompanyVendorSpecialtyInputSet.AutoRepairShop.pcf: line 15, column 49
    function value_0 () : java.lang.String {
      return AutoRepairShop.AutoRepairLicense
    }
    
    property get contactHandle () : gw.api.contact.ContactHandle {
      return getRequireValue("contactHandle", 0) as gw.api.contact.ContactHandle
    }
    
    property set contactHandle ($arg :  gw.api.contact.ContactHandle) {
      setRequireValue("contactHandle", 0, $arg)
    }
    
    
          property get AutoRepairShop() : AutoRepairShop { return contactHandle.Contact as AutoRepairShop; }
        
    
    
  }
  
  
}