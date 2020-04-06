package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/PaymentDeductionsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PaymentDeductionsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/PaymentDeductionsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends PaymentDeductionsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=DeductionType) at PaymentDeductionsLV.pcf: line 22, column 46
    function valueRoot_7 () : java.lang.Object {
      return Deduction
    }
    
    // 'value' attribute on CurrencyCell (id=Amount) at PaymentDeductionsLV.pcf: line 34, column 61
    function value_11 () : gw.api.financials.CurrencyAmountPair {
      return Deduction.TransactionCurrencyAmountComponent
    }
    
    // 'value' attribute on TypeKeyCell (id=DeductionType) at PaymentDeductionsLV.pcf: line 22, column 46
    function value_5 () : typekey.DeductionType {
      return Deduction.DeductionType
    }
    
    // 'value' attribute on TextCell (id=Comments) at PaymentDeductionsLV.pcf: line 26, column 39
    function value_8 () : java.lang.String {
      return Deduction.Comments
    }
    
    property get Deduction () : entity.Deduction {
      return getIteratedValue(1) as entity.Deduction
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/PaymentDeductionsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PaymentDeductionsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at PaymentDeductionsLV.pcf: line 22, column 46
    function sortValue_0 (Deduction :  entity.Deduction) : java.lang.Object {
      return Deduction.DeductionType
    }
    
    // 'value' attribute on RowIterator at PaymentDeductionsLV.pcf: line 26, column 39
    function sortValue_1 (Deduction :  entity.Deduction) : java.lang.Object {
      return Deduction.Comments
    }
    
    // 'value' attribute on RowIterator at PaymentDeductionsLV.pcf: line 34, column 61
    function sortValue_2 (Deduction :  entity.Deduction) : java.lang.Object {
      return Deduction.TransactionCurrencyAmountComponent
    }
    
    // '$$sumValue' attribute on RowIterator at PaymentDeductionsLV.pcf: line 34, column 61
    function sumValueRoot_4 (Deduction :  entity.Deduction) : java.lang.Object {
      return Deduction
    }
    
    // 'footerSumValue' attribute on RowIterator at PaymentDeductionsLV.pcf: line 34, column 61
    function sumValue_3 (Deduction :  entity.Deduction) : java.lang.Object {
      return Deduction.TransactionCurrencyAmountComponent
    }
    
    // 'value' attribute on RowIterator at PaymentDeductionsLV.pcf: line 15, column 38
    function value_14 () : entity.Deduction[] {
      return Check.Deductions
    }
    
    property get Check () : Check {
      return getRequireValue("Check", 0) as Check
    }
    
    property set Check ($arg :  Check) {
      setRequireValue("Check", 0, $arg)
    }
    
    
  }
  
  
}