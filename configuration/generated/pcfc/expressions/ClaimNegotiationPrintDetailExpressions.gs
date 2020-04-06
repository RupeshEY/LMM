package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/planofaction/ClaimNegotiationPrintDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimNegotiationPrintDetailExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/planofaction/ClaimNegotiationPrintDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNegotiationPrintDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Negotiation :  Negotiation) : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at ClaimNegotiationPrintDetail.pcf: line 20, column 55
    function def_onEnter_0 (def :  pcf.ClaimNegotiationDetailsDV) : void {
      def.onEnter(Negotiation)
    }
    
    // 'def' attribute on PanelRef at ClaimNegotiationPrintDetail.pcf: line 20, column 55
    function def_refreshVariables_1 (def :  pcf.ClaimNegotiationDetailsDV) : void {
      def.refreshVariables(Negotiation)
    }
    
    // 'parent' attribute on Page (id=ClaimNegotiationPrintDetail) at ClaimNegotiationPrintDetail.pcf: line 8, column 76
    static function parent_2 (Negotiation :  Negotiation) : pcf.api.Destination {
      return pcf.ClaimPrintout.createDestination(Negotiation.Claim)
    }
    
    override property get CurrentLocation () : pcf.ClaimNegotiationPrintDetail {
      return super.CurrentLocation as pcf.ClaimNegotiationPrintDetail
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