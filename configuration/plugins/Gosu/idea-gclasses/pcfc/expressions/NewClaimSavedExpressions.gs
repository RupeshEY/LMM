package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimSaved.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimSavedExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimSaved.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimSavedExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at NewClaimSaved.pcf: line 18, column 39
    function def_onEnter_0 (def :  pcf.NewClaimSavedDV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on PanelRef at NewClaimSaved.pcf: line 18, column 39
    function def_refreshVariables_1 (def :  pcf.NewClaimSavedDV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'parent' attribute on Page (id=NewClaimSaved) at NewClaimSaved.pcf: line 8, column 72
    static function parent_2 (Claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimMessage.createDestination()
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.NewClaimSaved {
      return super.CurrentLocation as pcf.NewClaimSaved
    }
    
    
  }
  
  
}