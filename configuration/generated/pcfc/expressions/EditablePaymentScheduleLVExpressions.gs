package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/subrogation/AdverseParty/EditablePaymentScheduleLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditablePaymentScheduleLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/subrogation/AdverseParty/EditablePaymentScheduleLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditablePaymentScheduleLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at EditablePaymentScheduleLV.pcf: line 29, column 56
    function sortValue_0 (SubroPaymentSchedule :  entity.SubroPaymentSchedule) : java.lang.Object {
      return SubroPaymentSchedule.PaymentExpDate
    }
    
    // 'value' attribute on RowIterator at EditablePaymentScheduleLV.pcf: line 38, column 26
    function sortValue_1 (SubroPaymentSchedule :  entity.SubroPaymentSchedule) : java.lang.Object {
      return SubroPaymentSchedule.SubroInstallmentAmount
    }
    
    // '$$sumValue' attribute on RowIterator at EditablePaymentScheduleLV.pcf: line 38, column 26
    function sumValueRoot_3 (SubroPaymentSchedule :  entity.SubroPaymentSchedule) : java.lang.Object {
      return SubroPaymentSchedule
    }
    
    // 'footerSumValue' attribute on RowIterator at EditablePaymentScheduleLV.pcf: line 38, column 26
    function sumValue_2 (SubroPaymentSchedule :  entity.SubroPaymentSchedule) : java.lang.Object {
      return SubroPaymentSchedule.SubroInstallmentAmount
    }
    
    // 'toAdd' attribute on RowIterator at EditablePaymentScheduleLV.pcf: line 21, column 49
    function toAdd_12 (SubroPaymentSchedule :  entity.SubroPaymentSchedule) : void {
      SubroAdverseParty.addToScheduledPayments(SubroPaymentSchedule)
    }
    
    // 'toRemove' attribute on RowIterator at EditablePaymentScheduleLV.pcf: line 21, column 49
    function toRemove_13 (SubroPaymentSchedule :  entity.SubroPaymentSchedule) : void {
      SubroAdverseParty.removeFromScheduledPayments(SubroPaymentSchedule)
    }
    
    // 'value' attribute on RowIterator at EditablePaymentScheduleLV.pcf: line 21, column 49
    function value_14 () : entity.SubroPaymentSchedule[] {
      return SubroAdverseParty.ScheduledPayments
    }
    
    property get SubroAdverseParty () : SubroAdverseParty {
      return getRequireValue("SubroAdverseParty", 0) as SubroAdverseParty
    }
    
    property set SubroAdverseParty ($arg :  SubroAdverseParty) {
      setRequireValue("SubroAdverseParty", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/subrogation/AdverseParty/EditablePaymentScheduleLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditablePaymentScheduleLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on CurrencyCell (id=EstimateAmount) at EditablePaymentScheduleLV.pcf: line 38, column 26
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      SubroPaymentSchedule.SubroInstallmentAmount = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on DateCell (id=PaymentExpDate) at EditablePaymentScheduleLV.pcf: line 29, column 56
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      SubroPaymentSchedule.PaymentExpDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateCell (id=PaymentExpDate) at EditablePaymentScheduleLV.pcf: line 29, column 56
    function valueRoot_7 () : java.lang.Object {
      return SubroPaymentSchedule
    }
    
    // 'value' attribute on DateCell (id=PaymentExpDate) at EditablePaymentScheduleLV.pcf: line 29, column 56
    function value_4 () : java.util.Date {
      return SubroPaymentSchedule.PaymentExpDate
    }
    
    // 'value' attribute on CurrencyCell (id=EstimateAmount) at EditablePaymentScheduleLV.pcf: line 38, column 26
    function value_8 () : gw.api.financials.CurrencyAmount {
      return SubroPaymentSchedule.SubroInstallmentAmount
    }
    
    property get SubroPaymentSchedule () : entity.SubroPaymentSchedule {
      return getIteratedValue(1) as entity.SubroPaymentSchedule
    }
    
    
  }
  
  
}