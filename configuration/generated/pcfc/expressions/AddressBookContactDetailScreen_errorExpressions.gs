package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/AddressBookContactDetailScreen.error.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookContactDetailScreen_errorExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/AddressBookContactDetailScreen.error.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactDetailScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    property get abcHelper () : gw.pcf.AddressBookContactHelper {
      return getRequireValue("abcHelper", 0) as gw.pcf.AddressBookContactHelper
    }
    
    property set abcHelper ($arg :  gw.pcf.AddressBookContactHelper) {
      setRequireValue("abcHelper", 0, $arg)
    }
    
    
  }
  
  
}