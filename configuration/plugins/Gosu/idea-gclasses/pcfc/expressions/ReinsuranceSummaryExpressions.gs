package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.api.financials.CurrencyAmount
@javax.annotation.Generated("config/web/pcf/claim/reinsurance/ReinsuranceSummary.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ReinsuranceSummaryExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/reinsurance/ReinsuranceSummary.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReinsuranceSummaryExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=ManageExposuresButton) at ReinsuranceSummary.pcf: line 96, column 43
    function action_24 () : void {
      ReinsuranceExposures.go(claim)
    }
    
    // 'action' attribute on ToolbarButton (id=ManageExposuresButton) at ReinsuranceSummary.pcf: line 96, column 43
    function action_dest_25 () : pcf.api.Destination {
      return pcf.ReinsuranceExposures.createDestination(claim)
    }
    
    // 'available' attribute on ToolbarButton (id=AddAgreementButton) at ReinsuranceSummary.pcf: line 86, column 42
    function available_20 () : java.lang.Boolean {
      return claim.Exposures.HasElements and perm.System.riedit
    }
    
    // 'canVisit' attribute on Page (id=ReinsuranceSummary) at ReinsuranceSummary.pcf: line 10, column 81
    static function canVisit_28 (claim :  Claim) : java.lang.Boolean {
      return perm.System.riview
    }
    
    // 'def' attribute on MenuItemSetRef at ReinsuranceSummary.pcf: line 88, column 55
    function def_onEnter_18 (def :  pcf.AddAgreementMenuItemSet) : void {
      def.onEnter( claim )
    }
    
    // 'def' attribute on PanelRef at ReinsuranceSummary.pcf: line 78, column 43
    function def_onEnter_26 (def :  pcf.ReinsuranceSummaryLV) : void {
      def.onEnter(claim)
    }
    
    // 'def' attribute on MenuItemSetRef at ReinsuranceSummary.pcf: line 88, column 55
    function def_refreshVariables_19 (def :  pcf.AddAgreementMenuItemSet) : void {
      def.refreshVariables( claim )
    }
    
    // 'def' attribute on PanelRef at ReinsuranceSummary.pcf: line 78, column 43
    function def_refreshVariables_27 (def :  pcf.ReinsuranceSummaryLV) : void {
      def.refreshVariables(claim)
    }
    
    // Page (id=ReinsuranceSummary) at ReinsuranceSummary.pcf: line 10, column 81
    static function parent_29 (claim :  Claim) : pcf.api.Destination {
      return pcf.Claim.createDestination(claim)
    }
    
    // 'value' attribute on TextInput (id=NetPaidOnClaim) at ReinsuranceSummary.pcf: line 26, column 127
    function value_0 () : java.lang.String {
      return currToString(gw.api.financials.FinancialsCalculations.getSubmittedNetPayments().withClaim(claim).Amount)
    }
    
    // 'value' attribute on TextInput (id=TotalRI) at ReinsuranceSummary.pcf: line 55, column 129
    function value_10 () : java.lang.String {
      return safeCurrToString(gw.api.financials.FinancialsCalculations.getRITotalReinsurance().withClaim(claim).Amount)
    }
    
    // 'value' attribute on TextInput (id=NetNetOnClaim) at ReinsuranceSummary.pcf: line 64, column 159
    function value_12 () : java.lang.String {
      return currToString(nullToZeroInClaimCurrency(gw.api.financials.FinancialsCalculations.getRISubmittedNetNetPayments().withClaim(claim).Amount))
    }
    
    // 'value' attribute on TextInput (id=NetNetReserves) at ReinsuranceSummary.pcf: line 69, column 159
    function value_14 () : java.lang.String {
      return currToString(nullToZeroInClaimCurrency(gw.api.financials.FinancialsCalculations.getRISubmittedNetNetReserves().withClaim(claim).Amount))
    }
    
    // 'value' attribute on TextInput (id=TotalIncurredWithRI) at ReinsuranceSummary.pcf: line 74, column 158
    function value_16 () : java.lang.String {
      return currToString(nullToZeroInClaimCurrency(gw.api.financials.FinancialsCalculations.getRISubmittedTotalIncurred().withClaim(claim).Amount))
    }
    
    // 'value' attribute on TextInput (id=OpenReserves) at ReinsuranceSummary.pcf: line 31, column 132
    function value_2 () : java.lang.String {
      return safeCurrToString(gw.api.financials.FinancialsCalculations.getSubmittedOpenReserves().withClaim(claim).Amount)
    }
    
    // 'value' attribute on TextInput (id=TotalIncurred) at ReinsuranceSummary.pcf: line 36, column 136
    function value_4 () : java.lang.String {
      return safeCurrToString(gw.api.financials.FinancialsCalculations.getSubmittedTotalIncurredNet().withClaim(claim).Amount)
    }
    
    // 'value' attribute on TextInput (id=TotalRIRecoverable) at ReinsuranceSummary.pcf: line 45, column 130
    function value_6 () : java.lang.String {
      return safeCurrToString(gw.api.financials.FinancialsCalculations.getRITotalRecoverables().withClaim(claim).Amount)
    }
    
    // 'value' attribute on TextInput (id=CededReserves) at ReinsuranceSummary.pcf: line 50, column 130
    function value_8 () : java.lang.String {
      return safeCurrToString(gw.api.financials.FinancialsCalculations.getRIOpenCededReserves().withClaim(claim).Amount)
    }
    
    // 'visible' attribute on ToolbarButton (id=AddAgreementButton) at ReinsuranceSummary.pcf: line 86, column 42
    function visible_21 () : java.lang.Boolean {
      return perm.System.riedit
    }
    
    override property get CurrentLocation () : pcf.ReinsuranceSummary {
      return super.CurrentLocation as pcf.ReinsuranceSummary
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    
    function safeCurrToString(val : CurrencyAmount) : String {
      return currToString(nullToZeroInClaimCurrency(val))
    }
    
    function nullToZeroInClaimCurrency (val : CurrencyAmount) : CurrencyAmount {
      return val!=null ? val : 0bd.ofCurrency(claim.Currency)
    }
    
    function currToString (val : CurrencyAmount) : String {
      return gw.api.util.CurrencyUtil.renderAsCurrency(gw.api.util.CurrencyUtil.nz(val), claim.Currency)
    }
    
    
  }
  
  
}