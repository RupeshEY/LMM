package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/shared/NewPaymentDetailDV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewPaymentDetailDV_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/shared/NewPaymentDetailDV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewPaymentDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'available' attribute on ListViewInput at NewPaymentDetailDV.default.pcf: line 75, column 84
    function available_38 () : java.lang.Boolean {
      return Payment.ReserveLine != null
    }
    
    // 'def' attribute on InputSetRef at NewPaymentDetailDV.default.pcf: line 28, column 72
    function def_onEnter_1 (def :  pcf.ReserveLineInputSet) : void {
      def.onEnter(Payment, reserveLineInputSetHelper)
    }
    
    // 'def' attribute on InputSetRef at NewPaymentDetailDV.default.pcf: line 68, column 62
    function def_onEnter_32 (def :  pcf.CheckExchangeRateInputSet) : void {
      def.onEnter(Payment.Check,null)
    }
    
    // 'def' attribute on ListViewInput at NewPaymentDetailDV.default.pcf: line 75, column 84
    function def_onEnter_40 (def :  pcf.EditablePaymentLineItemsLV_default) : void {
      def.onEnter(Payment)
    }
    
    // 'def' attribute on InputSetRef at NewPaymentDetailDV.default.pcf: line 96, column 57
    function def_onEnter_44 (def :  pcf.ServiceRequestInvoiceInputSet_multiple) : void {
      def.onEnter(Wizard, true)
    }
    
    // 'def' attribute on InputSetRef at NewPaymentDetailDV.default.pcf: line 96, column 57
    function def_onEnter_46 (def :  pcf.ServiceRequestInvoiceInputSet_single) : void {
      def.onEnter(Wizard, true)
    }
    
    // 'def' attribute on InputSetRef at NewPaymentDetailDV.default.pcf: line 28, column 72
    function def_refreshVariables_2 (def :  pcf.ReserveLineInputSet) : void {
      def.refreshVariables(Payment, reserveLineInputSetHelper)
    }
    
    // 'def' attribute on InputSetRef at NewPaymentDetailDV.default.pcf: line 68, column 62
    function def_refreshVariables_33 (def :  pcf.CheckExchangeRateInputSet) : void {
      def.refreshVariables(Payment.Check,null)
    }
    
    // 'def' attribute on ListViewInput at NewPaymentDetailDV.default.pcf: line 75, column 84
    function def_refreshVariables_41 (def :  pcf.EditablePaymentLineItemsLV_default) : void {
      def.refreshVariables(Payment)
    }
    
    // 'def' attribute on InputSetRef at NewPaymentDetailDV.default.pcf: line 96, column 57
    function def_refreshVariables_45 (def :  pcf.ServiceRequestInvoiceInputSet_multiple) : void {
      def.refreshVariables(Wizard, true)
    }
    
    // 'def' attribute on InputSetRef at NewPaymentDetailDV.default.pcf: line 96, column 57
    function def_refreshVariables_47 (def :  pcf.ServiceRequestInvoiceInputSet_single) : void {
      def.refreshVariables(Wizard, true)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Payment_Eroding) at NewPaymentDetailDV.default.pcf: line 44, column 98
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      Payment.ErodesReserves = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=Transaction_Comments) at NewPaymentDetailDV.default.pcf: line 56, column 35
    function defaultSetter_22 (__VALUE_TO_SET :  java.lang.Object) : void {
      Payment.Comments = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Payment_Currency) at NewPaymentDetailDV.default.pcf: line 64, column 66
    function defaultSetter_30 (__VALUE_TO_SET :  java.lang.Object) : void {
      Wizard.CheckCurrency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'value' attribute on TypeKeyInput (id=Payment_PaymentType) at NewPaymentDetailDV.default.pcf: line 37, column 42
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      Payment.PaymentType = (__VALUE_TO_SET as typekey.PaymentType)
    }
    
    // 'editable' attribute on TypeKeyInput (id=Payment_Currency) at NewPaymentDetailDV.default.pcf: line 64, column 66
    function editable_24 () : java.lang.Boolean {
      return not Wizard.Check.LinkedToServiceRequests
    }
    
    // 'filter' attribute on TypeKeyInput (id=Payment_PaymentType) at NewPaymentDetailDV.default.pcf: line 37, column 42
    function filter_8 (VALUE :  typekey.PaymentType, VALUES :  typekey.PaymentType[]) : java.lang.Boolean {
      return Wizard.isAllowedPaymentType( Payment, VALUE )
    }
    
    // 'initialValue' attribute on Variable at NewPaymentDetailDV.default.pcf: line 25, column 26
    function initialValue_0 () : Deductible {
      return Payment.SharedDeductible
    }
    
    // 'mode' attribute on ListViewInput at NewPaymentDetailDV.default.pcf: line 75, column 84
    function mode_42 () : java.lang.Object {
      return getMode()
    }
    
    // 'mode' attribute on InputSetRef at NewPaymentDetailDV.default.pcf: line 96, column 57
    function mode_48 () : java.lang.Object {
      return Wizard.Check.ServiceRequestInvoices.Count == 1 ? "single" : "multiple"
    }
    
    // 'requestValidationExpression' attribute on TypeKeyInput (id=Payment_PaymentType) at NewPaymentDetailDV.default.pcf: line 37, column 42
    function requestValidationExpression_4 (VALUE :  typekey.PaymentType) : java.lang.Object {
      return Wizard.validatePaymentType(Payment, VALUE)
    }
    
    // 'toCreateAndAdd' attribute on AddButton (id=ApplyDeductibleButton) at NewPaymentDetailDV.default.pcf: line 88, column 252
    function toCreateAndAdd_37 (CheckedValues :  Object[]) : java.lang.Object {
      return Payment.addDeductibleLineItem()
    }
    
    // 'validationExpression' attribute on ListViewInput at NewPaymentDetailDV.default.pcf: line 75, column 84
    function validationExpression_39 () : java.lang.Object {
      return Payment.getCheckWizardPaymentValidationExpression()
    }
    
    // 'value' attribute on CurrencyInput (id=Transaction_AvailableReserves) at NewPaymentDetailDV.default.pcf: line 51, column 80
    function valueRoot_19 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculationsForEditedTransaction.getAvailableReserves(Payment)
    }
    
    // 'value' attribute on TypeKeyInput (id=Payment_Currency) at NewPaymentDetailDV.default.pcf: line 64, column 66
    function valueRoot_31 () : java.lang.Object {
      return Wizard
    }
    
    // 'value' attribute on TypeKeyInput (id=Payment_PaymentType) at NewPaymentDetailDV.default.pcf: line 37, column 42
    function valueRoot_7 () : java.lang.Object {
      return Payment
    }
    
    // 'value' attribute on BooleanRadioInput (id=Payment_Eroding) at NewPaymentDetailDV.default.pcf: line 44, column 98
    function value_10 () : java.lang.Boolean {
      return Payment.ErodesReserves
    }
    
    // 'value' attribute on CurrencyInput (id=Transaction_AvailableReserves) at NewPaymentDetailDV.default.pcf: line 51, column 80
    function value_16 () : gw.api.financials.IPairedMoney {
      return gw.api.financials.FinancialsCalculationsForEditedTransaction.getAvailableReserves(Payment).ReservingAmountTransactionAmountPair
    }
    
    // 'value' attribute on TextInput (id=Transaction_Comments) at NewPaymentDetailDV.default.pcf: line 56, column 35
    function value_20 () : java.lang.String {
      return Payment.Comments
    }
    
    // 'value' attribute on TypeKeyInput (id=Payment_Currency) at NewPaymentDetailDV.default.pcf: line 64, column 66
    function value_26 () : typekey.Currency {
      return Wizard.CheckCurrency
    }
    
    // 'value' attribute on TypeKeyInput (id=Payment_PaymentType) at NewPaymentDetailDV.default.pcf: line 37, column 42
    function value_3 () : typekey.PaymentType {
      return Payment.PaymentType
    }
    
    // 'visible' attribute on CurrencyInput (id=Transaction_AvailableReserves) at NewPaymentDetailDV.default.pcf: line 51, column 80
    function visible_15 () : java.lang.Boolean {
      return Payment.ReserveLine != null and not Payment.ReserveLine.New
    }
    
    // 'visible' attribute on TypeKeyInput (id=Payment_Currency) at NewPaymentDetailDV.default.pcf: line 64, column 66
    function visible_25 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.isMultiCurrencyMode()
    }
    
    // 'addVisible' attribute on IteratorButtons at NewPaymentDetailDV.default.pcf: line 82, column 90
    function visible_34 () : java.lang.Boolean {
      return gw.api.financials.FinancialsUtil.isAllowMultipleLineItems()
    }
    
    // 'visible' attribute on AddButton (id=ApplyDeductibleButton) at NewPaymentDetailDV.default.pcf: line 88, column 252
    function visible_36 () : java.lang.Boolean {
      return gw.api.financials.FinancialsUtil.isAllowMultipleLineItems() and !Payment.Check.CheckSet.Recurring and deductible != null and !deductible.Paid and !deductible.Waived and gw.api.financials.FinancialsUtil.isUseDeductibleHandling()
    }
    
    // 'visible' attribute on InputSetRef at NewPaymentDetailDV.default.pcf: line 96, column 57
    function visible_43 () : java.lang.Boolean {
      return Wizard.Check.LinkedToServiceRequests
    }
    
    // 'visible' attribute on BooleanRadioInput (id=Payment_Eroding) at NewPaymentDetailDV.default.pcf: line 44, column 98
    function visible_9 () : java.lang.Boolean {
      return !Payment.Exposure.Closed and Payment.PaymentType != PaymentType.TC_SUPPLEMENT
    }
    
    property get Payment () : Payment {
      return getRequireValue("Payment", 0) as Payment
    }
    
    property set Payment ($arg :  Payment) {
      setRequireValue("Payment", 0, $arg)
    }
    
    property get Wizard () : gw.api.financials.CheckWizardInfo {
      return getRequireValue("Wizard", 0) as gw.api.financials.CheckWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.financials.CheckWizardInfo) {
      setRequireValue("Wizard", 0, $arg)
    }
    
    property get deductible () : Deductible {
      return getVariableValue("deductible", 0) as Deductible
    }
    
    property set deductible ($arg :  Deductible) {
      setVariableValue("deductible", 0, $arg)
    }
    
    property get reserveLineInputSetHelper () : gw.api.financials.ReserveLineInputSetHelper {
      return getRequireValue("reserveLineInputSetHelper", 0) as gw.api.financials.ReserveLineInputSetHelper
    }
    
    property set reserveLineInputSetHelper ($arg :  gw.api.financials.ReserveLineInputSetHelper) {
      setRequireValue("reserveLineInputSetHelper", 0, $arg)
    }
    
    
    function getMode() : String {
      if (Payment.LineItems.countWhere(\ t -> t.LineCategory==TC_DEDUCTIBLE) == 1) {
        return "deductible"
      } else {
        return "default"
      }
    }
          
        
    
    
  }
  
  
}