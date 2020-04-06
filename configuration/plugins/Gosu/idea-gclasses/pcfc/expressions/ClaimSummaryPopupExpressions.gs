package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/ClaimSummaryPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSummaryPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/ClaimSummaryPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSummaryPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at ClaimSummaryPopup.pcf: line 24, column 42
    function def_onEnter_0 (def :  pcf.ClaimSummaryDV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimSummaryPopup.pcf: line 53, column 67
    function def_onEnter_11 (def :  pcf.ClaimSummaryExposuresLV) : void {
      def.onEnter(Claim, Claim.Exposures)
    }
    
    // 'def' attribute on PanelRef at ClaimSummaryPopup.pcf: line 64, column 59
    function def_onEnter_13 (def :  pcf.PeopleInvolvedLV) : void {
      def.onEnter(Claim, Claim.Contacts)
    }
    
    // 'def' attribute on PanelRef at ClaimSummaryPopup.pcf: line 70, column 51
    function def_onEnter_15 (def :  pcf.ClaimSummaryActivitiesLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimSummaryPopup.pcf: line 77, column 75
    function def_onEnter_18 (def :  pcf.ClaimSummaryMattersLV) : void {
      def.onEnter(Claim.Matters, Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimSummaryPopup.pcf: line 83, column 77
    function def_onEnter_20 (def :  pcf.ClaimSummaryAssociatedClaimsLV) : void {
      def.onEnter(Claim, Claim.Associations)
    }
    
    // 'def' attribute on PanelRef at ClaimSummaryPopup.pcf: line 92, column 104
    function def_onEnter_22 (def :  pcf.NotesLV) : void {
      def.onEnter(excludeConfidentialNotes ? Claim.NonconfidentialNotes : Claim.ViewableNotes)
    }
    
    // 'def' attribute on PanelRef at ClaimSummaryPopup.pcf: line 24, column 42
    function def_refreshVariables_1 (def :  pcf.ClaimSummaryDV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimSummaryPopup.pcf: line 53, column 67
    function def_refreshVariables_12 (def :  pcf.ClaimSummaryExposuresLV) : void {
      def.refreshVariables(Claim, Claim.Exposures)
    }
    
    // 'def' attribute on PanelRef at ClaimSummaryPopup.pcf: line 64, column 59
    function def_refreshVariables_14 (def :  pcf.PeopleInvolvedLV) : void {
      def.refreshVariables(Claim, Claim.Contacts)
    }
    
    // 'def' attribute on PanelRef at ClaimSummaryPopup.pcf: line 70, column 51
    function def_refreshVariables_16 (def :  pcf.ClaimSummaryActivitiesLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimSummaryPopup.pcf: line 77, column 75
    function def_refreshVariables_19 (def :  pcf.ClaimSummaryMattersLV) : void {
      def.refreshVariables(Claim.Matters, Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimSummaryPopup.pcf: line 83, column 77
    function def_refreshVariables_21 (def :  pcf.ClaimSummaryAssociatedClaimsLV) : void {
      def.refreshVariables(Claim, Claim.Associations)
    }
    
    // 'def' attribute on PanelRef at ClaimSummaryPopup.pcf: line 92, column 104
    function def_refreshVariables_23 (def :  pcf.NotesLV) : void {
      def.refreshVariables(excludeConfidentialNotes ? Claim.NonconfidentialNotes : Claim.ViewableNotes)
    }
    
    // 'value' attribute on CurrencyInput (id=ClaimTotalPaid) at ClaimSummaryPopup.pcf: line 45, column 110
    function valueRoot_10 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getTotalPayments().withClaim(Claim)
    }
    
    // 'value' attribute on CurrencyInput (id=ClaimRemainingReserves) at ClaimSummaryPopup.pcf: line 35, column 114
    function valueRoot_4 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRemainingReserves().withClaim(Claim)
    }
    
    // 'value' attribute on CurrencyInput (id=ClaimFuturePayments) at ClaimSummaryPopup.pcf: line 40, column 111
    function valueRoot_7 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getFuturePayments().withClaim(Claim)
    }
    
    // 'value' attribute on CurrencyInput (id=ClaimRemainingReserves) at ClaimSummaryPopup.pcf: line 35, column 114
    function value_2 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRemainingReserves().withClaim(Claim).Amount
    }
    
    // 'value' attribute on CurrencyInput (id=ClaimFuturePayments) at ClaimSummaryPopup.pcf: line 40, column 111
    function value_5 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getFuturePayments().withClaim(Claim).Amount
    }
    
    // 'value' attribute on CurrencyInput (id=ClaimTotalPaid) at ClaimSummaryPopup.pcf: line 45, column 110
    function value_8 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getTotalPayments().withClaim(Claim).Amount
    }
    
    // 'visible' attribute on PanelRef at ClaimSummaryPopup.pcf: line 77, column 75
    function visible_17 () : java.lang.Boolean {
      return perm.Matter.view(Claim) and perm.System.viewmatters
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimSummaryPopup {
      return super.CurrentLocation as pcf.ClaimSummaryPopup
    }
    
    property get excludeConfidentialNotes () : boolean {
      return getVariableValue("excludeConfidentialNotes", 0) as java.lang.Boolean
    }
    
    property set excludeConfidentialNotes ($arg :  boolean) {
      setVariableValue("excludeConfidentialNotes", 0, $arg)
    }
    
    
  }
  
  
}