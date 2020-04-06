package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/NoClaim.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NoClaimExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/NoClaim.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NoClaimExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at NoClaim.pcf: line 15, column 28
    function def_onEnter_0 (def :  pcf.NoClaimDV) : void {
      def.onEnter()
    }
    
    // 'def' attribute on PanelRef at NoClaim.pcf: line 15, column 28
    function def_refreshVariables_1 (def :  pcf.NoClaimDV) : void {
      def.refreshVariables()
    }
    
    // 'parent' attribute on Page (id=NoClaim) at NoClaim.pcf: line 8, column 59
    static function parent_2 () : pcf.api.Destination {
      return pcf.ClaimMessage.createDestination()
    }
    
    override property get CurrentLocation () : pcf.NoClaim {
      return super.CurrentLocation as pcf.NoClaim
    }
    
    
  }
  
  
}