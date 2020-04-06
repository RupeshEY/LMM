package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/shared/NewCheckPaymentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewCheckPaymentsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/shared/NewCheckPaymentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends NewCheckPaymentsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'outputConversion' attribute on TextCell (id=Exposure) at NewCheckPaymentsLV.pcf: line 30, column 40
    function outputConversion_13 (VALUE :  entity.Exposure) : java.lang.String {
      return ((Payment.ReserveLine != null) ? ((null == VALUE) ? DisplayKey.get("LV.Financials.NewCheckPayments.Payments.Exposure.None") : VALUE.DisplayName) : null)
    }
    
    // 'value' attribute on TextCell (id=Exposure) at NewCheckPaymentsLV.pcf: line 30, column 40
    function valueRoot_15 () : java.lang.Object {
      return Payment
    }
    
    // 'value' attribute on TypeKeyCell (id=Coverage) at NewCheckPaymentsLV.pcf: line 35, column 45
    function valueRoot_18 () : java.lang.Object {
      return Payment.Exposure
    }
    
    // 'value' attribute on TextCell (id=Exposure) at NewCheckPaymentsLV.pcf: line 30, column 40
    function value_12 () : entity.Exposure {
      return Payment.Exposure
    }
    
    // 'value' attribute on TypeKeyCell (id=Coverage) at NewCheckPaymentsLV.pcf: line 35, column 45
    function value_16 () : typekey.CoverageType {
      return Payment.Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on TypeKeyCell (id=CostType) at NewCheckPaymentsLV.pcf: line 40, column 41
    function value_19 () : typekey.CostType {
      return Payment.CostType
    }
    
    // 'value' attribute on TypeKeyCell (id=CostCategory) at NewCheckPaymentsLV.pcf: line 45, column 45
    function value_22 () : typekey.CostCategory {
      return Payment.CostCategory
    }
    
    // 'value' attribute on TypeKeyCell (id=ReservingCurrency) at NewCheckPaymentsLV.pcf: line 51, column 74
    function value_26 () : typekey.Currency {
      return Payment.ReservingCurrency
    }
    
    // 'value' attribute on CurrencyCell (id=Amount) at NewCheckPaymentsLV.pcf: line 58, column 55
    function value_29 () : gw.api.financials.IPairedMoney {
      return Payment.TransactionAmountReservingAmountPair
    }
    
    // 'value' attribute on TypeKeyCell (id=PaymentType) at NewCheckPaymentsLV.pcf: line 63, column 44
    function value_32 () : typekey.PaymentType {
      return Payment.PaymentType
    }
    
    // 'value' attribute on TextCell (id=Comments) at NewCheckPaymentsLV.pcf: line 67, column 37
    function value_35 () : java.lang.String {
      return Payment.Comments
    }
    
    // 'visible' attribute on TypeKeyCell (id=ReservingCurrency) at NewCheckPaymentsLV.pcf: line 51, column 74
    function visible_25 () : java.lang.Boolean {
      return gw.util.CCConfigUtil.AllowExplicitReservingCurrency
    }
    
    property get Payment () : entity.Payment {
      return getIteratedValue(1) as entity.Payment
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/shared/NewCheckPaymentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCheckPaymentsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at NewCheckPaymentsLV.pcf: line 30, column 40
    function sortValue_0 (Payment :  entity.Payment) : java.lang.Object {
      return Payment.Exposure
    }
    
    // 'value' attribute on RowIterator at NewCheckPaymentsLV.pcf: line 35, column 45
    function sortValue_1 (Payment :  entity.Payment) : java.lang.Object {
      return Payment.Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on RowIterator at NewCheckPaymentsLV.pcf: line 40, column 41
    function sortValue_2 (Payment :  entity.Payment) : java.lang.Object {
      return Payment.CostType
    }
    
    // 'value' attribute on RowIterator at NewCheckPaymentsLV.pcf: line 45, column 45
    function sortValue_3 (Payment :  entity.Payment) : java.lang.Object {
      return Payment.CostCategory
    }
    
    // 'value' attribute on RowIterator at NewCheckPaymentsLV.pcf: line 51, column 74
    function sortValue_5 (Payment :  entity.Payment) : java.lang.Object {
      return Payment.ReservingCurrency
    }
    
    // 'value' attribute on RowIterator at NewCheckPaymentsLV.pcf: line 58, column 55
    function sortValue_6 (Payment :  entity.Payment) : java.lang.Object {
      return Payment.TransactionAmountReservingAmountPair
    }
    
    // 'value' attribute on RowIterator at NewCheckPaymentsLV.pcf: line 63, column 44
    function sortValue_7 (Payment :  entity.Payment) : java.lang.Object {
      return Payment.PaymentType
    }
    
    // 'value' attribute on RowIterator at NewCheckPaymentsLV.pcf: line 67, column 37
    function sortValue_8 (Payment :  entity.Payment) : java.lang.Object {
      return Payment.Comments
    }
    
    // '$$sumValue' attribute on RowIterator at NewCheckPaymentsLV.pcf: line 58, column 55
    function sumValueRoot_11 (Payment :  entity.Payment) : java.lang.Object {
      return Payment
    }
    
    // 'footerSumValue' attribute on RowIterator at NewCheckPaymentsLV.pcf: line 58, column 55
    function sumValue_10 (Payment :  entity.Payment) : java.lang.Object {
      return Payment.TransactionAmountReservingAmountPair
    }
    
    // 'toCreateAndAdd' attribute on RowIterator at NewCheckPaymentsLV.pcf: line 23, column 36
    function toCreateAndAdd_38 () : entity.Payment {
      return Wizard.addAdditionalPayment()
    }
    
    // 'toRemove' attribute on RowIterator at NewCheckPaymentsLV.pcf: line 23, column 36
    function toRemove_39 (Payment :  entity.Payment) : void {
      if (Payment.hasDeductibleLineItem()) Payment.unlinkDeductible(); Wizard.deletePayment(Payment)
    }
    
    // 'value' attribute on RowIterator at NewCheckPaymentsLV.pcf: line 23, column 36
    function value_40 () : entity.Payment[] {
      return PaymentList
    }
    
    // 'visible' attribute on RowIterator at NewCheckPaymentsLV.pcf: line 51, column 74
    function visible_4 () : java.lang.Boolean {
      return gw.util.CCConfigUtil.AllowExplicitReservingCurrency
    }
    
    property get PaymentList () : Payment[] {
      return getRequireValue("PaymentList", 0) as Payment[]
    }
    
    property set PaymentList ($arg :  Payment[]) {
      setRequireValue("PaymentList", 0, $arg)
    }
    
    property get Wizard () : gw.api.financials.CheckWizardInfo {
      return getRequireValue("Wizard", 0) as gw.api.financials.CheckWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.financials.CheckWizardInfo) {
      setRequireValue("Wizard", 0, $arg)
    }
    
    
  }
  
  
}