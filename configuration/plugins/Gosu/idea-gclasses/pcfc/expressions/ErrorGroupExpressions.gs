package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/util/ErrorGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ErrorGroupExpressions {
  @javax.annotation.Generated("config/web/pcf/util/ErrorGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ErrorGroupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // LocationGroup (id=ErrorGroup) at ErrorGroup.pcf: line 8, column 52
    static function firstVisitableChildDestinationMethod_2 () : pcf.api.Destination {
      var dest : pcf.api.Destination
      return null
    }
    
    // 'tabBar' attribute on LocationGroup (id=ErrorGroup) at ErrorGroup.pcf: line 8, column 52
    function tabBar_onEnter_0 (def :  pcf.ErrorTabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=ErrorGroup) at ErrorGroup.pcf: line 8, column 52
    function tabBar_refreshVariables_1 (def :  pcf.ErrorTabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.ErrorGroup {
      return super.CurrentLocation as pcf.ErrorGroup
    }
    
    
  }
  
  
}