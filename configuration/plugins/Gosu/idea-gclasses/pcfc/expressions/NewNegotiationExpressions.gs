package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newother/NewNegotiation.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewNegotiationExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newother/NewNegotiation.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewNegotiationExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    // 'afterCancel' attribute on Page (id=NewNegotiation) at NewNegotiation.pcf: line 13, column 91
    function afterCancel_3 () : void {
      ClaimNegotiationForward.go(claim)
    }
    
    // 'afterCancel' attribute on Page (id=NewNegotiation) at NewNegotiation.pcf: line 13, column 91
    function afterCancel_dest_4 () : pcf.api.Destination {
      return pcf.ClaimNegotiationForward.createDestination(claim)
    }
    
    // 'afterCommit' attribute on Page (id=NewNegotiation) at NewNegotiation.pcf: line 13, column 91
    function afterCommit_5 (TopLocation :  pcf.api.Location) : void {
      ClaimNegotiationForward.go(claim)
    }
    
    // 'canVisit' attribute on Page (id=NewNegotiation) at NewNegotiation.pcf: line 13, column 91
    static function canVisit_6 (claim :  Claim) : java.lang.Boolean {
      return perm.Claim.createnegotiation(claim)
    }
    
    // 'def' attribute on PanelRef at NewNegotiation.pcf: line 27, column 45
    function def_onEnter_1 (def :  pcf.NewNegotiationDV) : void {
      def.onEnter(Negotiation)
    }
    
    // 'def' attribute on PanelRef at NewNegotiation.pcf: line 27, column 45
    function def_refreshVariables_2 (def :  pcf.NewNegotiationDV) : void {
      def.refreshVariables(Negotiation)
    }
    
    // 'initialValue' attribute on Variable at NewNegotiation.pcf: line 22, column 27
    function initialValue_0 () : Negotiation {
      return claim.newNegotiation()
    }
    
    // 'parent' attribute on Page (id=NewNegotiation) at NewNegotiation.pcf: line 13, column 91
    static function parent_7 (claim :  Claim) : pcf.api.Destination {
      return pcf.Claim.createDestination(claim)
    }
    
    override property get CurrentLocation () : pcf.NewNegotiation {
      return super.CurrentLocation as pcf.NewNegotiation
    }
    
    property get Negotiation () : Negotiation {
      return getVariableValue("Negotiation", 0) as Negotiation
    }
    
    property set Negotiation ($arg :  Negotiation) {
      setVariableValue("Negotiation", 0, $arg)
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    
  }
  
  
}