package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.util.CCConfigUtil
@javax.annotation.Generated("config/web/pcf/claim/financials/summary/ClaimFinancialsSummary.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimFinancialsSummaryExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/summary/ClaimFinancialsSummary.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimFinancialsSummaryExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=ClaimFinancialsSummary) at ClaimFinancialsSummary.pcf: line 9, column 505
    static function canVisit_36 (Claim :  Claim) : java.lang.Boolean {
      return perm.Claim.view(Claim) and perm.System.viewfinsum and perm.Claim.viewtransactiondetails(Claim)
    }
    
    // 'def' attribute on PanelRef (id=financialsPanel) at ClaimFinancialsSummary.pcf: line 40, column 29
    function def_onEnter_21 (def :  pcf.FinancialsSummaryPanelSet_ClaimCostOnly) : void {
      def.onEnter(Claim, useFloatingFinancials, financialSummaryBridge)
    }
    
    // 'def' attribute on PanelRef (id=financialsPanel) at ClaimFinancialsSummary.pcf: line 40, column 29
    function def_onEnter_23 (def :  pcf.FinancialsSummaryPanelSet_Claimant) : void {
      def.onEnter(Claim, useFloatingFinancials, financialSummaryBridge)
    }
    
    // 'def' attribute on PanelRef (id=financialsPanel) at ClaimFinancialsSummary.pcf: line 40, column 29
    function def_onEnter_25 (def :  pcf.FinancialsSummaryPanelSet_Coverage) : void {
      def.onEnter(Claim, useFloatingFinancials, financialSummaryBridge)
    }
    
    // 'def' attribute on PanelRef (id=financialsPanel) at ClaimFinancialsSummary.pcf: line 40, column 29
    function def_onEnter_27 (def :  pcf.FinancialsSummaryPanelSet_Exposure) : void {
      def.onEnter(Claim, useFloatingFinancials, financialSummaryBridge)
    }
    
    // 'def' attribute on PanelRef (id=financialsPanel) at ClaimFinancialsSummary.pcf: line 40, column 29
    function def_onEnter_29 (def :  pcf.FinancialsSummaryPanelSet_ExposureOnly) : void {
      def.onEnter(Claim, useFloatingFinancials, financialSummaryBridge)
    }
    
    // 'def' attribute on PanelRef (id=financialsPanel) at ClaimFinancialsSummary.pcf: line 40, column 29
    function def_onEnter_31 (def :  pcf.FinancialsSummaryPanelSet_RecoveryCategory) : void {
      def.onEnter(Claim, useFloatingFinancials, financialSummaryBridge)
    }
    
    // 'def' attribute on PanelRef (id=financialsPanel) at ClaimFinancialsSummary.pcf: line 40, column 29
    function def_onEnter_33 (def :  pcf.FinancialsSummaryPanelSet_ReservingCurrency) : void {
      def.onEnter(Claim, useFloatingFinancials, financialSummaryBridge)
    }
    
    // 'def' attribute on PanelRef (id=financialsPanel) at ClaimFinancialsSummary.pcf: line 40, column 29
    function def_refreshVariables_22 (def :  pcf.FinancialsSummaryPanelSet_ClaimCostOnly) : void {
      def.refreshVariables(Claim, useFloatingFinancials, financialSummaryBridge)
    }
    
    // 'def' attribute on PanelRef (id=financialsPanel) at ClaimFinancialsSummary.pcf: line 40, column 29
    function def_refreshVariables_24 (def :  pcf.FinancialsSummaryPanelSet_Claimant) : void {
      def.refreshVariables(Claim, useFloatingFinancials, financialSummaryBridge)
    }
    
    // 'def' attribute on PanelRef (id=financialsPanel) at ClaimFinancialsSummary.pcf: line 40, column 29
    function def_refreshVariables_26 (def :  pcf.FinancialsSummaryPanelSet_Coverage) : void {
      def.refreshVariables(Claim, useFloatingFinancials, financialSummaryBridge)
    }
    
    // 'def' attribute on PanelRef (id=financialsPanel) at ClaimFinancialsSummary.pcf: line 40, column 29
    function def_refreshVariables_28 (def :  pcf.FinancialsSummaryPanelSet_Exposure) : void {
      def.refreshVariables(Claim, useFloatingFinancials, financialSummaryBridge)
    }
    
    // 'def' attribute on PanelRef (id=financialsPanel) at ClaimFinancialsSummary.pcf: line 40, column 29
    function def_refreshVariables_30 (def :  pcf.FinancialsSummaryPanelSet_ExposureOnly) : void {
      def.refreshVariables(Claim, useFloatingFinancials, financialSummaryBridge)
    }
    
    // 'def' attribute on PanelRef (id=financialsPanel) at ClaimFinancialsSummary.pcf: line 40, column 29
    function def_refreshVariables_32 (def :  pcf.FinancialsSummaryPanelSet_RecoveryCategory) : void {
      def.refreshVariables(Claim, useFloatingFinancials, financialSummaryBridge)
    }
    
    // 'def' attribute on PanelRef (id=financialsPanel) at ClaimFinancialsSummary.pcf: line 40, column 29
    function def_refreshVariables_34 (def :  pcf.FinancialsSummaryPanelSet_ReservingCurrency) : void {
      def.refreshVariables(Claim, useFloatingFinancials, financialSummaryBridge)
    }
    
    // 'value' attribute on ToolbarRangeInput (id=floatingFinancialsInputWidget) at ClaimFinancialsSummary.pcf: line 64, column 123
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      useFloatingFinancials = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on ToolbarRangeInput (id=FinancialsSummaryRangeInput) at ClaimFinancialsSummary.pcf: line 49, column 42
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      filterOption = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at ClaimFinancialsSummary.pcf: line 18, column 32
    function initialValue_0 () : java.lang.String {
      return gw.api.financials.FinancialsUtil.getFinancialsSummaryOption(Claim)
    }
    
    // 'initialValue' attribute on Variable at ClaimFinancialsSummary.pcf: line 26, column 32
    function initialValue_1 () : java.lang.String {
      return savedOption != null ? savedOption : defaultOption 
    }
    
    // 'initialValue' attribute on Variable at ClaimFinancialsSummary.pcf: line 34, column 64
    function initialValue_2 () : gw.api.financials.summary.FinancialSummaryBridge {
      return new gw.api.financials.summary.FinancialSummaryBridge(Claim, filterOption)
    }
    
    // 'mode' attribute on PanelRef (id=financialsPanel) at ClaimFinancialsSummary.pcf: line 40, column 29
    function mode_35 () : java.lang.Object {
      return filterOption
    }
    
    // 'onChange' attribute on PostOnChange at ClaimFinancialsSummary.pcf: line 67, column 35
    function onChange_11 () : void {
      financialSummaryBridge.changeFilterOption(filterOption, useFloatingFinancials)
    }
    
    // 'onChange' attribute on PostOnChange at ClaimFinancialsSummary.pcf: line 52, column 41
    function onChange_3 () : void {
      gw.api.financials.FinancialsUtil.setFinancialsSummaryOption(Claim, filterOption); financialSummaryBridge.changeFilterOption(filterOption, useFloatingFinancials)
    }
    
    // 'optionLabel' attribute on ToolbarRangeInput (id=floatingFinancialsInputWidget) at ClaimFinancialsSummary.pcf: line 64, column 123
    function optionLabel_17 (VALUE :  java.lang.Boolean) : java.lang.String {
      return getViewAmountsOptionLabel(VALUE)
    }
    
    // 'optionLabel' attribute on ToolbarRangeInput (id=FinancialsSummaryRangeInput) at ClaimFinancialsSummary.pcf: line 49, column 42
    function optionLabel_7 (VALUE :  java.lang.String) : java.lang.String {
      return getFilterOptionLabel(VALUE)
    }
    
    // Page (id=ClaimFinancialsSummary) at ClaimFinancialsSummary.pcf: line 9, column 505
    static function parent_37 (Claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimFinancialsGroup.createDestination(Claim)
    }
    
    // 'title' attribute on Page (id=ClaimFinancialsSummary) at ClaimFinancialsSummary.pcf: line 9, column 505
    static function title_38 (Claim :  Claim) : java.lang.Object {
      return perm.Claim.viewnettotalincurred(Claim) ? DisplayKey.get("JSP.ClaimFinancials.Financials.Incurred", gw.api.util.CurrencyUtil.renderAsCurrency(gw.api.util.Math.Nz(gw.api.financials.FinancialsCalculations.getTotalIncurredNet().withClaim(Claim).Amount.Amount), Claim.Currency), DisplayKey.get("JSP.ClaimFinancials.Financials.Summary")) : DisplayKey.get("JSP.ClaimFinancials.Financials.NoIncurred", DisplayKey.get("JSP.ClaimFinancials.Financials.Summary"))
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=floatingFinancialsInputWidget) at ClaimFinancialsSummary.pcf: line 64, column 123
    function valueRange_18 () : java.lang.Object {
      return {false, true}
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=FinancialsSummaryRangeInput) at ClaimFinancialsSummary.pcf: line 49, column 42
    function valueRange_8 () : java.lang.Object {
      return AvailableFilterOptions
    }
    
    // 'value' attribute on ToolbarRangeInput (id=floatingFinancialsInputWidget) at ClaimFinancialsSummary.pcf: line 64, column 123
    function value_13 () : java.lang.Boolean {
      return useFloatingFinancials
    }
    
    // 'value' attribute on ToolbarRangeInput (id=FinancialsSummaryRangeInput) at ClaimFinancialsSummary.pcf: line 49, column 42
    function value_4 () : java.lang.String {
      return filterOption
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=floatingFinancialsInputWidget) at ClaimFinancialsSummary.pcf: line 64, column 123
    function verifyValueRangeIsAllowedType_19 ($$arg :  java.lang.Boolean[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=floatingFinancialsInputWidget) at ClaimFinancialsSummary.pcf: line 64, column 123
    function verifyValueRangeIsAllowedType_19 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=FinancialsSummaryRangeInput) at ClaimFinancialsSummary.pcf: line 49, column 42
    function verifyValueRangeIsAllowedType_9 ($$arg :  java.lang.String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=FinancialsSummaryRangeInput) at ClaimFinancialsSummary.pcf: line 49, column 42
    function verifyValueRangeIsAllowedType_9 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=FinancialsSummaryRangeInput) at ClaimFinancialsSummary.pcf: line 49, column 42
    function verifyValueRange_10 () : void {
      var __valueRangeArg = AvailableFilterOptions
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_9(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=floatingFinancialsInputWidget) at ClaimFinancialsSummary.pcf: line 64, column 123
    function verifyValueRange_20 () : void {
      var __valueRangeArg = {false, true}
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_19(__valueRangeArg)
    }
    
    // 'visible' attribute on ToolbarRangeInput (id=floatingFinancialsInputWidget) at ClaimFinancialsSummary.pcf: line 64, column 123
    function visible_12 () : java.lang.Boolean {
      return gw.util.CCConfigUtil.EnableMulticurrencyReserving and filterOption != "ReservingCurrency"
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimFinancialsSummary {
      return super.CurrentLocation as pcf.ClaimFinancialsSummary
    }
    
    property get defaultOption () : java.lang.String {
      return getVariableValue("defaultOption", 0) as java.lang.String
    }
    
    property set defaultOption ($arg :  java.lang.String) {
      setVariableValue("defaultOption", 0, $arg)
    }
    
    property get filterOption () : java.lang.String {
      return getVariableValue("filterOption", 0) as java.lang.String
    }
    
    property set filterOption ($arg :  java.lang.String) {
      setVariableValue("filterOption", 0, $arg)
    }
    
    property get financialSummaryBridge () : gw.api.financials.summary.FinancialSummaryBridge {
      return getVariableValue("financialSummaryBridge", 0) as gw.api.financials.summary.FinancialSummaryBridge
    }
    
    property set financialSummaryBridge ($arg :  gw.api.financials.summary.FinancialSummaryBridge) {
      setVariableValue("financialSummaryBridge", 0, $arg)
    }
    
    property get savedOption () : java.lang.String {
      return getVariableValue("savedOption", 0) as java.lang.String
    }
    
    property set savedOption ($arg :  java.lang.String) {
      setVariableValue("savedOption", 0, $arg)
    }
    
    property get useFloatingFinancials () : boolean {
      return getVariableValue("useFloatingFinancials", 0) as java.lang.Boolean
    }
    
    property set useFloatingFinancials ($arg :  boolean) {
      setVariableValue("useFloatingFinancials", 0, $arg)
    }
    
    
    property get AvailableFilterOptions() : java.util.List<String> {
      var options = {"Exposure", "Claimant", "Coverage", "ClaimCostOnly", "ExposureOnly", "RecoveryCategory"}
      
      if(CCConfigUtil.AllowExplicitReservingCurrency) {
        options.add("ReservingCurrency")
      }
      
      return options
    }
    
    function getFilterOptionLabel(option : String) : String {
      switch (option) {
        case "ClaimCostOnly": return DisplayKey.get("Web.Financials.Summary.ClaimCostOnly")
        case "Claimant": return DisplayKey.get("Web.Financials.Summary.Claimant")
        case "Coverage": return DisplayKey.get("Web.Financials.Summary.Coverage")
        case "Exposure": return DisplayKey.get("Web.Financials.Summary.Exposure")
        case "ExposureOnly": return DisplayKey.get("Web.Financials.Summary.ExposureOnly")
        case "ReservingCurrency": return DisplayKey.get("Web.Financials.Summary.ReservingCurrency")
        case "RecoveryCategory": return DisplayKey.get("Web.Financials.Summary.RecoveryCategory")
        default: return null
      }
    }
    
    function getViewAmountsOptionLabel(option : boolean) : String {
      return option ? 
          DisplayKey.get("Web.Financials.Summary.ExchangeRate.Market") : 
          DisplayKey.get("Web.Financials.Summary.ExchangeRate.Fixed")
    }
    
    
  }
  
  
}