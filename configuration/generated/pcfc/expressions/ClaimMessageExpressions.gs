package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/ClaimMessage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimMessageExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/ClaimMessage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimMessageExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // LocationGroup (id=ClaimMessage) at ClaimMessage.pcf: line 11, column 26
    static function firstVisitableChildDestinationMethod_3 () : pcf.api.Destination {
      var dest : pcf.api.Destination
      return null
    }
    
    // 'parent' attribute on LocationGroup (id=ClaimMessage) at ClaimMessage.pcf: line 11, column 26
    static function parent_0 () : pcf.api.Destination {
      return pcf.ClaimTabForward.createDestination()
    }
    
    // 'tabBar' attribute on LocationGroup (id=ClaimMessage) at ClaimMessage.pcf: line 11, column 26
    function tabBar_onEnter_1 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=ClaimMessage) at ClaimMessage.pcf: line 11, column 26
    function tabBar_refreshVariables_2 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.ClaimMessage {
      return super.CurrentLocation as pcf.ClaimMessage
    }
    
    
  }
  
  
}