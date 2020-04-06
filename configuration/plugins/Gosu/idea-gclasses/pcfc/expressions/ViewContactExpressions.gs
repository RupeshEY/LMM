package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/exitpoints/ViewContact.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ViewContactExpressions {
  @javax.annotation.Generated("config/web/pcf/exitpoints/ViewContact.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ViewContactExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (abContactDetailURL :  String, addressBookUID :  String) : int {
      return 0
    }
    
    override property get CurrentLocation () : pcf.ViewContact {
      return super.CurrentLocation as pcf.ViewContact
    }
    
    property get abContactDetailURL () : String {
      return getVariableValue("abContactDetailURL", 0) as String
    }
    
    property set abContactDetailURL ($arg :  String) {
      setVariableValue("abContactDetailURL", 0, $arg)
    }
    
    property get addressBookUID () : String {
      return getVariableValue("addressBookUID", 0) as String
    }
    
    property set addressBookUID ($arg :  String) {
      setVariableValue("addressBookUID", 0, $arg)
    }
    
    
  }
  
  
}