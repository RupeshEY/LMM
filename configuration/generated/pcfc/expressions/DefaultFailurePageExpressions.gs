package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/util/DefaultFailurePage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DefaultFailurePageExpressions {
  @javax.annotation.Generated("config/web/pcf/util/DefaultFailurePage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DefaultFailurePageExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'def' attribute on ScreenRef at DefaultFailurePage.pcf: line 10, column 28
    function def_onEnter_0 (def :  pcf.BlankScreen) : void {
      def.onEnter()
    }
    
    // 'def' attribute on ScreenRef at DefaultFailurePage.pcf: line 10, column 28
    function def_refreshVariables_1 (def :  pcf.BlankScreen) : void {
      def.refreshVariables()
    }
    
    // 'parent' attribute on Page (id=DefaultFailurePage) at DefaultFailurePage.pcf: line 8, column 68
    static function parent_2 () : pcf.api.Destination {
      return pcf.ErrorGroup.createDestination()
    }
    
    override property get CurrentLocation () : pcf.DefaultFailurePage {
      return super.CurrentLocation as pcf.DefaultFailurePage
    }
    
    
  }
  
  
}