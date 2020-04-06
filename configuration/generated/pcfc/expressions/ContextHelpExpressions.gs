package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ContextHelp.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ContextHelpExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/ContextHelp.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContextHelpExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'defaultValue' attribute on ExitPointParameter at ContextHelp.pcf: line 14, column 27
    function initialValue_0 () : String {
      return com.guidewire.pl.system.dependency.PLDependencies.WebController.BaseURL
    }
    
    override property get CurrentLocation () : pcf.ContextHelp {
      return super.CurrentLocation as pcf.ContextHelp
    }
    
    property get baseURL () : String {
      return getVariableValue("baseURL", 0) as String
    }
    
    property set baseURL ($arg :  String) {
      setVariableValue("baseURL", 0, $arg)
    }
    
    
  }
  
  
}