package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/shared/ReserveSetLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ReserveSetLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/shared/ReserveSetLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ReserveSetLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on CurrencyCell (id=Amount) at ReserveSetLV.pcf: line 68, column 55
    function action_32 () : void {
      ClaimFinancialsTransactionsDetail.goInMain(Reserve.Claim, Reserve)
    }
    
    // 'action' attribute on CurrencyCell (id=Amount) at ReserveSetLV.pcf: line 68, column 55
    function action_dest_33 () : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactionsDetail.createDestination(Reserve.Claim, Reserve)
    }
    
    // 'value' attribute on TypeKeyCell (id=Coverage) at ReserveSetLV.pcf: line 38, column 45
    function valueRoot_17 () : java.lang.Object {
      return Reserve.Exposure
    }
    
    // 'value' attribute on TypeKeyCell (id=CostType) at ReserveSetLV.pcf: line 44, column 41
    function valueRoot_20 () : java.lang.Object {
      return Reserve
    }
    
    // 'value' attribute on CurrencyCell (id=OpenReserves) at ReserveSetLV.pcf: line 60, column 132
    function valueRoot_30 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getOpenReserves().withReserveLine(Reserve.ReserveLine)
    }
    
    // 'value' attribute on TextCell (id=Exposure) at ReserveSetLV.pcf: line 32, column 161
    function value_13 () : java.lang.String {
      return Reserve.Exposure.FullDescription == null ? DisplayKey.get("Web.Financials.Exposure.ClaimLevel") : Reserve.Exposure.FullDescription
    }
    
    // 'value' attribute on TypeKeyCell (id=Coverage) at ReserveSetLV.pcf: line 38, column 45
    function value_15 () : typekey.CoverageType {
      return Reserve.Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on TypeKeyCell (id=CostType) at ReserveSetLV.pcf: line 44, column 41
    function value_18 () : typekey.CostType {
      return Reserve.CostType
    }
    
    // 'value' attribute on TypeKeyCell (id=CostCategories) at ReserveSetLV.pcf: line 49, column 45
    function value_21 () : typekey.CostCategory {
      return Reserve.CostCategory
    }
    
    // 'value' attribute on TypeKeyCell (id=ReservingCurrency) at ReserveSetLV.pcf: line 55, column 74
    function value_25 () : typekey.Currency {
      return Reserve.ReservingCurrency
    }
    
    // 'value' attribute on CurrencyCell (id=OpenReserves) at ReserveSetLV.pcf: line 60, column 132
    function value_28 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getOpenReserves().withReserveLine(Reserve.ReserveLine).ReservingAmount
    }
    
    // 'value' attribute on CurrencyCell (id=Amount) at ReserveSetLV.pcf: line 68, column 55
    function value_31 () : gw.api.financials.IPairedMoney {
      return Reserve.TransactionAmountReservingAmountPair
    }
    
    // 'visible' attribute on TypeKeyCell (id=ReservingCurrency) at ReserveSetLV.pcf: line 55, column 74
    function visible_24 () : java.lang.Boolean {
      return gw.util.CCConfigUtil.AllowExplicitReservingCurrency
    }
    
    property get Reserve () : entity.Reserve {
      return getIteratedValue(1) as entity.Reserve
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/financials/shared/ReserveSetLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReserveSetLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ReserveSetLV.pcf: line 14, column 23
    function initialValue_0 () : boolean {
      return gw.api.financials.TransactionWizardHelper.haveSingleTransactionCurrency(ReserveList.toList())
    }
    
    // 'initialValue' attribute on Variable at ReserveSetLV.pcf: line 19, column 23
    function initialValue_1 () : boolean {
      return gw.api.financials.TransactionWizardHelper.haveSingleReservingCurrency(ReserveList.toList())
    }
    
    // 'footerLabel' attribute on RowIterator at ReserveSetLV.pcf: line 32, column 161
    function label_10 () : java.lang.Object {
      return (haveSingleTransactionCurrency or haveSingleReservingCurrency) ? DisplayKey.get("LV.Financials.Total") : null
    }
    
    // 'value' attribute on RowIterator at ReserveSetLV.pcf: line 32, column 161
    function sortValue_2 (Reserve :  entity.Reserve) : java.lang.Object {
      return Reserve.Exposure.FullDescription == null ? DisplayKey.get("Web.Financials.Exposure.ClaimLevel") : Reserve.Exposure.FullDescription
    }
    
    // 'value' attribute on RowIterator at ReserveSetLV.pcf: line 38, column 45
    function sortValue_3 (Reserve :  entity.Reserve) : java.lang.Object {
      return Reserve.Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on RowIterator at ReserveSetLV.pcf: line 44, column 41
    function sortValue_4 (Reserve :  entity.Reserve) : java.lang.Object {
      return Reserve.CostType
    }
    
    // 'value' attribute on RowIterator at ReserveSetLV.pcf: line 49, column 45
    function sortValue_5 (Reserve :  entity.Reserve) : java.lang.Object {
      return Reserve.CostCategory
    }
    
    // 'value' attribute on RowIterator at ReserveSetLV.pcf: line 55, column 74
    function sortValue_7 (Reserve :  entity.Reserve) : java.lang.Object {
      return Reserve.ReservingCurrency
    }
    
    // 'value' attribute on RowIterator at ReserveSetLV.pcf: line 60, column 132
    function sortValue_8 (Reserve :  entity.Reserve) : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getOpenReserves().withReserveLine(Reserve.ReserveLine).ReservingAmount
    }
    
    // 'value' attribute on RowIterator at ReserveSetLV.pcf: line 68, column 55
    function sortValue_9 (Reserve :  entity.Reserve) : java.lang.Object {
      return Reserve.TransactionAmountReservingAmountPair
    }
    
    // 'footerSumValue' attribute on RowIterator at ReserveSetLV.pcf: line 68, column 55
    function sumValue_12 (Reserve :  entity.Reserve) : java.lang.Object {
      return gw.api.financials.TransactionWizardHelper.getAmountForSumComputation(Reserve, haveSingleReservingCurrency, haveSingleTransactionCurrency)
    }
    
    // 'value' attribute on RowIterator at ReserveSetLV.pcf: line 25, column 36
    function value_36 () : entity.Reserve[] {
      return ReserveList
    }
    
    // 'visible' attribute on RowIterator at ReserveSetLV.pcf: line 55, column 74
    function visible_6 () : java.lang.Boolean {
      return gw.util.CCConfigUtil.AllowExplicitReservingCurrency
    }
    
    property get ReserveList () : Reserve[] {
      return getRequireValue("ReserveList", 0) as Reserve[]
    }
    
    property set ReserveList ($arg :  Reserve[]) {
      setRequireValue("ReserveList", 0, $arg)
    }
    
    property get haveSingleReservingCurrency () : boolean {
      return getVariableValue("haveSingleReservingCurrency", 0) as java.lang.Boolean
    }
    
    property set haveSingleReservingCurrency ($arg :  boolean) {
      setVariableValue("haveSingleReservingCurrency", 0, $arg)
    }
    
    property get haveSingleTransactionCurrency () : boolean {
      return getVariableValue("haveSingleTransactionCurrency", 0) as java.lang.Boolean
    }
    
    property set haveSingleTransactionCurrency ($arg :  boolean) {
      setVariableValue("haveSingleTransactionCurrency", 0, $arg)
    }
    
    
  }
  
  
}