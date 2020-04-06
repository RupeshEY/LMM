package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/planofaction/ClaimNegotiations.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimNegotiationsExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/planofaction/ClaimNegotiations.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNegotiationsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=CN_Add) at ClaimNegotiations.pcf: line 24, column 58
    function action_1 () : void {
      NewNegotiation.go(claim)
    }
    
    // 'action' attribute on ToolbarButton (id=CN_Add) at ClaimNegotiations.pcf: line 24, column 58
    function action_dest_2 () : pcf.api.Destination {
      return pcf.NewNegotiation.createDestination(claim)
    }
    
    // 'canVisit' attribute on Page (id=ClaimNegotiations) at ClaimNegotiations.pcf: line 9, column 76
    static function canVisit_11 (claim :  Claim) : java.lang.Boolean {
      return perm.Claim.view(claim) and perm.Negotiation.view(claim) and perm.System.viewclaimngtns
    }
    
    // Page (id=ClaimNegotiations) at ClaimNegotiations.pcf: line 9, column 76
    static function parent_12 (claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimPlanOfActionGroup.createDestination(claim)
    }
    
    // 'visible' attribute on ToolbarButton (id=CN_Add) at ClaimNegotiations.pcf: line 24, column 58
    function visible_0 () : java.lang.Boolean {
      return perm.Claim.createnegotiation(claim)
    }
    
    // 'removeVisible' attribute on IteratorButtons at ClaimNegotiations.pcf: line 29, column 57
    function visible_3 () : java.lang.Boolean {
      return perm.Negotiation.edit(claim)
    }
    
    override property get CurrentLocation () : pcf.ClaimNegotiations {
      return super.CurrentLocation as pcf.ClaimNegotiations
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/planofaction/ClaimNegotiations.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends ClaimNegotiationsExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimNegotiations.pcf: line 36, column 68
    function def_onEnter_4 (def :  pcf.EditableNegotiationsLV) : void {
      def.onEnter(claim.Negotiations, claim)
    }
    
    // 'def' attribute on PanelRef at ClaimNegotiations.pcf: line 42, column 60
    function def_onEnter_8 (def :  pcf.ClaimNegotiationDetailsDV) : void {
      def.onEnter(negotiation)
    }
    
    // 'def' attribute on PanelRef at ClaimNegotiations.pcf: line 36, column 68
    function def_refreshVariables_5 (def :  pcf.EditableNegotiationsLV) : void {
      def.refreshVariables(claim.Negotiations, claim)
    }
    
    // 'def' attribute on PanelRef at ClaimNegotiations.pcf: line 42, column 60
    function def_refreshVariables_9 (def :  pcf.ClaimNegotiationDetailsDV) : void {
      def.refreshVariables(negotiation)
    }
    
    // EditButtons at ClaimNegotiations.pcf: line 45, column 63
    function label_7 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'title' attribute on Card (id=DetailViewTitleCard) at ClaimNegotiations.pcf: line 40, column 113
    function title_10 () : java.lang.String {
      return DisplayKey.get("Web.ClaimPlanOfAction.Negotiations.DetailViewTitle", negotiation)
    }
    
    // 'editVisible' attribute on EditButtons at ClaimNegotiations.pcf: line 45, column 63
    function visible_6 () : java.lang.Boolean {
      return perm.Negotiation.edit(claim)
    }
    
    property get negotiation () : Negotiation {
      return getCurrentSelection(1) as Negotiation
    }
    
    property set negotiation ($arg :  Negotiation) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  
}