package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/contacts/UserContactDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserContactDetailScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/contacts/UserContactDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserContactDetailScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // EditButtons at UserContactDetailScreen.pcf: line 12, column 30
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'pickValue' attribute on EditButtons at UserContactDetailScreen.pcf: line 12, column 30
    function pickValue_0 () : java.lang.Object {
      return Contact
    }
    
    property get Contact () : Contact {
      return getRequireValue("Contact", 0) as Contact
    }
    
    property set Contact ($arg :  Contact) {
      setRequireValue("Contact", 0, $arg)
    }
    
    
  }
  
  
}