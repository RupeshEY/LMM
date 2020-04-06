package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/exitpoints/GoToAB.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class GoToABExpressions {
  @javax.annotation.Generated("config/web/pcf/exitpoints/GoToAB.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GoToABExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (abSystemURL :  String) : int {
      return 0
    }
    
    override property get CurrentLocation () : pcf.GoToAB {
      return super.CurrentLocation as pcf.GoToAB
    }
    
    property get abSystemURL () : String {
      return getVariableValue("abSystemURL", 0) as String
    }
    
    property set abSystemURL ($arg :  String) {
      setVariableValue("abSystemURL", 0, $arg)
    }
    
    
  }
  
  
}