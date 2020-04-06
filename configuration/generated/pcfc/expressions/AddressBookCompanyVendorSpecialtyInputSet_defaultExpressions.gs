package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookCompanyVendorSpecialtyInputSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookCompanyVendorSpecialtyInputSet_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBookCompanyVendorSpecialtyInputSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookCompanyVendorSpecialtyInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    property get CompanyVendor () : CompanyVendor {
      return getRequireValue("CompanyVendor", 0) as CompanyVendor
    }
    
    property set CompanyVendor ($arg :  CompanyVendor) {
      setRequireValue("CompanyVendor", 0, $arg)
    }
    
    
  }
  
  
}