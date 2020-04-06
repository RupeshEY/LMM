package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/CheckTransferPaymentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CheckTransferPaymentsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/CheckTransferPaymentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckTransferPaymentsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at CheckTransferPaymentsLV.pcf: line 33, column 35
    function sortValue_1 (Payment :  entity.Payment) : java.lang.Object {
      return Payment.Exposure.ClaimOrder
    }
    
    // 'value' attribute on RowIterator at CheckTransferPaymentsLV.pcf: line 75, column 35
    function sortValue_11 (Payment :  entity.Payment) : java.lang.Object {
      return Payment.TransactionAmountReservingAmountPair
    }
    
    // 'value' attribute on RowIterator at CheckTransferPaymentsLV.pcf: line 83, column 34
    function sortValue_13 (Payment :  entity.Payment) : java.lang.Object {
      return Payment.TransactionAmountReservingAmountPair
    }
    
    // 'value' attribute on RowIterator at CheckTransferPaymentsLV.pcf: line 42, column 34
    function sortValue_3 (Payment :  entity.Payment) : java.lang.Object {
      return Payment.Exposure.ClaimOrder
    }
    
    // 'value' attribute on RowIterator at CheckTransferPaymentsLV.pcf: line 48, column 45
    function sortValue_4 (Payment :  entity.Payment) : java.lang.Object {
      return Payment.Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on RowIterator at CheckTransferPaymentsLV.pcf: line 53, column 41
    function sortValue_5 (Payment :  entity.Payment) : java.lang.Object {
      return Payment.CostType
    }
    
    // 'value' attribute on RowIterator at CheckTransferPaymentsLV.pcf: line 58, column 45
    function sortValue_6 (Payment :  entity.Payment) : java.lang.Object {
      return Payment.CostCategory
    }
    
    // 'value' attribute on RowIterator at CheckTransferPaymentsLV.pcf: line 64, column 74
    function sortValue_8 (Payment :  entity.Payment) : java.lang.Object {
      return Payment.ReservingCurrency
    }
    
    // 'value' attribute on RowIterator at CheckTransferPaymentsLV.pcf: line 68, column 37
    function sortValue_9 (Payment :  entity.Payment) : java.lang.Object {
      return Payment.Comments
    }
    
    // 'value' attribute on RowIterator at CheckTransferPaymentsLV.pcf: line 24, column 36
    function value_52 () : entity.Payment[] {
      return Check.Payments
    }
    
    // 'visible' attribute on RowIterator at CheckTransferPaymentsLV.pcf: line 33, column 35
    function visible_0 () : java.lang.Boolean {
      return !displayLink
    }
    
    // 'visible' attribute on RowIterator at CheckTransferPaymentsLV.pcf: line 42, column 34
    function visible_2 () : java.lang.Boolean {
      return displayLink
    }
    
    // 'visible' attribute on RowIterator at CheckTransferPaymentsLV.pcf: line 64, column 74
    function visible_7 () : java.lang.Boolean {
      return gw.util.CCConfigUtil.AllowExplicitReservingCurrency
    }
    
    property get Check () : Check {
      return getRequireValue("Check", 0) as Check
    }
    
    property set Check ($arg :  Check) {
      setRequireValue("Check", 0, $arg)
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get displayLink () : boolean {
      return getRequireValue("displayLink", 0) as java.lang.Boolean
    }
    
    property set displayLink ($arg :  boolean) {
      setRequireValue("displayLink", 0, $arg)
    }
    
    property get reserveLineInputSetHelper () : gw.api.financials.ReserveLineInputSetHelper {
      return getRequireValue("reserveLineInputSetHelper", 0) as gw.api.financials.ReserveLineInputSetHelper
    }
    
    property set reserveLineInputSetHelper ($arg :  gw.api.financials.ReserveLineInputSetHelper) {
      setRequireValue("reserveLineInputSetHelper", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/CheckTransferPaymentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends CheckTransferPaymentsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=ExposureLink) at CheckTransferPaymentsLV.pcf: line 42, column 34
    function action_21 () : void {
      PaymentTransferPopup.push(Payment, Claim, reserveLineInputSetHelper)
    }
    
    // 'action' attribute on CurrencyCell (id=AmountLink) at CheckTransferPaymentsLV.pcf: line 83, column 34
    function action_48 () : void {
      PaymentTransferPopup.push(Payment, Claim, reserveLineInputSetHelper)
    }
    
    // 'action' attribute on TextCell (id=ExposureLink) at CheckTransferPaymentsLV.pcf: line 42, column 34
    function action_dest_22 () : pcf.api.Destination {
      return pcf.PaymentTransferPopup.createDestination(Payment, Claim, reserveLineInputSetHelper)
    }
    
    // 'action' attribute on CurrencyCell (id=AmountLink) at CheckTransferPaymentsLV.pcf: line 83, column 34
    function action_dest_49 () : pcf.api.Destination {
      return pcf.PaymentTransferPopup.createDestination(Payment, Claim, reserveLineInputSetHelper)
    }
    
    // 'outputConversion' attribute on TextCell (id=ExposureNoLink) at CheckTransferPaymentsLV.pcf: line 33, column 35
    function outputConversion_16 (VALUE :  java.lang.Integer) : java.lang.String {
      return (null == VALUE) ? DisplayKey.get("Financials.ReserveLine.NoExposure") : VALUE as String
    }
    
    // 'value' attribute on TextCell (id=ExposureNoLink) at CheckTransferPaymentsLV.pcf: line 33, column 35
    function valueRoot_18 () : java.lang.Object {
      return Payment.Exposure
    }
    
    // 'value' attribute on TypeKeyCell (id=CostType) at CheckTransferPaymentsLV.pcf: line 53, column 41
    function valueRoot_31 () : java.lang.Object {
      return Payment
    }
    
    // 'value' attribute on TextCell (id=ExposureNoLink) at CheckTransferPaymentsLV.pcf: line 33, column 35
    function value_15 () : java.lang.Integer {
      return Payment.Exposure.ClaimOrder
    }
    
    // 'value' attribute on TypeKeyCell (id=Coverage) at CheckTransferPaymentsLV.pcf: line 48, column 45
    function value_26 () : typekey.CoverageType {
      return Payment.Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on TypeKeyCell (id=CostType) at CheckTransferPaymentsLV.pcf: line 53, column 41
    function value_29 () : typekey.CostType {
      return Payment.CostType
    }
    
    // 'value' attribute on TypeKeyCell (id=CostCategory) at CheckTransferPaymentsLV.pcf: line 58, column 45
    function value_32 () : typekey.CostCategory {
      return Payment.CostCategory
    }
    
    // 'value' attribute on TypeKeyCell (id=ReservingCurrency) at CheckTransferPaymentsLV.pcf: line 64, column 74
    function value_36 () : typekey.Currency {
      return Payment.ReservingCurrency
    }
    
    // 'value' attribute on TextCell (id=Comments) at CheckTransferPaymentsLV.pcf: line 68, column 37
    function value_39 () : java.lang.String {
      return Payment.Comments
    }
    
    // 'value' attribute on CurrencyCell (id=AmountNoLink) at CheckTransferPaymentsLV.pcf: line 75, column 35
    function value_43 () : gw.api.financials.IPairedMoney {
      return Payment.TransactionAmountReservingAmountPair
    }
    
    // 'visible' attribute on TextCell (id=ExposureNoLink) at CheckTransferPaymentsLV.pcf: line 33, column 35
    function visible_14 () : java.lang.Boolean {
      return !displayLink
    }
    
    // 'visible' attribute on TextCell (id=ExposureLink) at CheckTransferPaymentsLV.pcf: line 42, column 34
    function visible_19 () : java.lang.Boolean {
      return displayLink
    }
    
    // 'visible' attribute on TypeKeyCell (id=ReservingCurrency) at CheckTransferPaymentsLV.pcf: line 64, column 74
    function visible_35 () : java.lang.Boolean {
      return gw.util.CCConfigUtil.AllowExplicitReservingCurrency
    }
    
    property get Payment () : entity.Payment {
      return getIteratedValue(1) as entity.Payment
    }
    
    
  }
  
  
}