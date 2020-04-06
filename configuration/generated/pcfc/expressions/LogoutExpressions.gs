package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/util/Logout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LogoutExpressions {
  @javax.annotation.Generated("config/web/pcf/util/Logout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LogoutExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (url :  String) : int {
      return 0
    }
    
    override property get CurrentLocation () : pcf.Logout {
      return super.CurrentLocation as pcf.Logout
    }
    
    property get url () : String {
      return getVariableValue("url", 0) as String
    }
    
    property set url ($arg :  String) {
      setVariableValue("url", 0, $arg)
    }
    
    
  }
  
  
}