package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/util/GoogleSearch.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class GoogleSearchExpressions {
  @javax.annotation.Generated("config/web/pcf/util/GoogleSearch.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GoogleSearchExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    static function __constructorIndex (SearchText :  String) : int {
      return 1
    }
    
    override property get CurrentLocation () : pcf.GoogleSearch {
      return super.CurrentLocation as pcf.GoogleSearch
    }
    
    property get SearchText () : String {
      return getVariableValue("SearchText", 0) as String
    }
    
    property set SearchText ($arg :  String) {
      setVariableValue("SearchText", 0, $arg)
    }
    
    
  }
  
  
}