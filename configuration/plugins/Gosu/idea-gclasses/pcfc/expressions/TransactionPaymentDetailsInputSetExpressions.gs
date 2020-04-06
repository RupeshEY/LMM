package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionPaymentDetailsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TransactionPaymentDetailsInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionPaymentDetailsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionPaymentDetailsInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyInput (id=Check_Status) at TransactionPaymentDetailsInputSet.pcf: line 17, column 46
    function valueRoot_2 () : java.lang.Object {
      return Payment.Check
    }
    
    // 'value' attribute on TypeKeyInput (id=Check_Status) at TransactionPaymentDetailsInputSet.pcf: line 17, column 46
    function value_0 () : typekey.TransactionStatus {
      return Payment.Check.Status
    }
    
    // 'value' attribute on DateInput (id=Check_IssueDate) at TransactionPaymentDetailsInputSet.pcf: line 34, column 40
    function value_12 () : java.util.Date {
      return Payment.Check.IssueDate
    }
    
    // 'value' attribute on TextInput (id=Check_CheckNumber) at TransactionPaymentDetailsInputSet.pcf: line 38, column 42
    function value_15 () : java.lang.String {
      return Payment.Check.CheckNumber
    }
    
    // 'value' attribute on TypeKeyInput (id=Check_BankAccount) at TransactionPaymentDetailsInputSet.pcf: line 43, column 40
    function value_18 () : typekey.BankAccount {
      return Payment.Check.BankAccount
    }
    
    // 'value' attribute on DateInput (id=Check_DateOfService) at TransactionPaymentDetailsInputSet.pcf: line 48, column 64
    function value_22 () : java.util.Date {
      return Payment.Check.DateOfService
    }
    
    // 'value' attribute on TextInput (id=Check_ServicePeriod) at TransactionPaymentDetailsInputSet.pcf: line 53, column 63
    function value_27 () : java.lang.String {
      return Payment.Check.ServicePeriodString
    }
    
    // 'value' attribute on TextInput (id=Check_PayTo) at TransactionPaymentDetailsInputSet.pcf: line 21, column 36
    function value_3 () : java.lang.String {
      return Payment.Check.PayTo
    }
    
    // 'value' attribute on TypeKeyInput (id=Check_PaymentMethod) at TransactionPaymentDetailsInputSet.pcf: line 58, column 42
    function value_31 () : typekey.PaymentMethod {
      return Payment.Check.PaymentMethod
    }
    
    // 'value' attribute on TextInput (id=Check_InvoiceNumber) at TransactionPaymentDetailsInputSet.pcf: line 62, column 44
    function value_34 () : java.lang.String {
      return Payment.Check.InvoiceNumber
    }
    
    // 'value' attribute on CurrencyInput (id=Check_NetAmount) at TransactionPaymentDetailsInputSet.pcf: line 26, column 57
    function value_6 () : gw.api.financials.CurrencyAmountPair {
      return Payment.Check.NetAmountPair
    }
    
    // 'value' attribute on DateInput (id=Check_ScheduledSendDate) at TransactionPaymentDetailsInputSet.pcf: line 30, column 48
    function value_9 () : java.util.Date {
      return Payment.Check.ScheduledSendDate
    }
    
    // 'visible' attribute on DateInput (id=Check_DateOfService) at TransactionPaymentDetailsInputSet.pcf: line 48, column 64
    function visible_21 () : java.lang.Boolean {
      return !Payment.Check.hasExposureWithServicePeriod()
    }
    
    // 'visible' attribute on TextInput (id=Check_ServicePeriod) at TransactionPaymentDetailsInputSet.pcf: line 53, column 63
    function visible_26 () : java.lang.Boolean {
      return Payment.Check.hasExposureWithServicePeriod()
    }
    
    property get Payment () : Payment {
      return getRequireValue("Payment", 0) as Payment
    }
    
    property set Payment ($arg :  Payment) {
      setRequireValue("Payment", 0, $arg)
    }
    
    
  }
  
  
}