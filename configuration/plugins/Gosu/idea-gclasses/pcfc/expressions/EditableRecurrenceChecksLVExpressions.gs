package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/EditableRecurrenceChecksLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableRecurrenceChecksLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/EditableRecurrenceChecksLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableRecurrenceChecksLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at EditableRecurrenceChecksLV.pcf: line 18, column 23
    function initialValue_0 () : Check[] {
      return CheckSet.getPrimaryChecksSortedByDate()
    }
    
    // 'value' attribute on RowIterator at EditableRecurrenceChecksLV.pcf: line 37, column 44
    function sortValue_1 (Check :  entity.Check) : java.lang.Object {
      return Check.ScheduledSendDate
    }
    
    // 'value' attribute on RowIterator at EditableRecurrenceChecksLV.pcf: line 45, column 49
    function sortValue_2 (Check :  entity.Check) : java.lang.Object {
      return Check.GrossAmountSettableComponent
    }
    
    // 'value' attribute on RowIterator at EditableRecurrenceChecksLV.pcf: line 50, column 41
    function sortValue_3 (Check :  entity.Check) : java.lang.Object {
      return Check.ServicePdStart
    }
    
    // 'value' attribute on RowIterator at EditableRecurrenceChecksLV.pcf: line 55, column 39
    function sortValue_4 (Check :  entity.Check) : java.lang.Object {
      return Check.ServicePdEnd
    }
    
    // 'toRemove' attribute on RowIterator at EditableRecurrenceChecksLV.pcf: line 25, column 34
    function toRemove_29 (Check :  entity.Check) : void {
      Check.delete(); if (Check.CheckSet.Checks.length > 0) {Check.CheckSet.updateServicePeriods(true)}
    }
    
    // 'value' attribute on RowIterator at EditableRecurrenceChecksLV.pcf: line 25, column 34
    function value_30 () : entity.Check[] {
      return CheckSet.PrimaryChecksSortedByDate
    }
    
    property get CheckList () : Check[] {
      return getVariableValue("CheckList", 0) as Check[]
    }
    
    property set CheckList ($arg :  Check[]) {
      setVariableValue("CheckList", 0, $arg)
    }
    
    property get CheckSet () : CheckSet {
      return getRequireValue("CheckSet", 0) as CheckSet
    }
    
    property set CheckSet ($arg :  CheckSet) {
      setRequireValue("CheckSet", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/EditableRecurrenceChecksLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableRecurrenceChecksLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'condition' attribute on ToolbarFlag at EditableRecurrenceChecksLV.pcf: line 28, column 28
    function condition_5 () : java.lang.Boolean {
      return Check.Editable
    }
    
    // 'value' attribute on DateCell (id=ServicePeriodStart) at EditableRecurrenceChecksLV.pcf: line 50, column 41
    function defaultSetter_19 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.ServicePdStart = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateCell (id=ServicePeriodEnd) at EditableRecurrenceChecksLV.pcf: line 55, column 39
    function defaultSetter_25 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.ServicePdEnd = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateCell (id=ScheduledSendDate) at EditableRecurrenceChecksLV.pcf: line 37, column 44
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.ScheduledSendDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'editable' attribute on CurrencyCell (id=Amount) at EditableRecurrenceChecksLV.pcf: line 45, column 49
    function editable_10 () : java.lang.Boolean {
      return Check.Payments.length == 1 and Check.Payments[0].LineItems.length == 1
    }
    
    // 'editable' attribute on DateCell (id=ServicePeriodStart) at EditableRecurrenceChecksLV.pcf: line 50, column 41
    function editable_15 () : java.lang.Boolean {
      return Check.hasExposureWithServicePeriod()
    }
    
    // 'value' attribute on DateCell (id=ScheduledSendDate) at EditableRecurrenceChecksLV.pcf: line 37, column 44
    function valueRoot_9 () : java.lang.Object {
      return Check
    }
    
    // 'value' attribute on CurrencyCell (id=Amount) at EditableRecurrenceChecksLV.pcf: line 45, column 49
    function value_11 () : gw.api.financials.IMoney {
      return Check.GrossAmountSettableComponent
    }
    
    // 'value' attribute on DateCell (id=ServicePeriodStart) at EditableRecurrenceChecksLV.pcf: line 50, column 41
    function value_16 () : java.util.Date {
      return Check.ServicePdStart
    }
    
    // 'value' attribute on DateCell (id=ServicePeriodEnd) at EditableRecurrenceChecksLV.pcf: line 55, column 39
    function value_22 () : java.util.Date {
      return Check.ServicePdEnd
    }
    
    // 'value' attribute on DateCell (id=ScheduledSendDate) at EditableRecurrenceChecksLV.pcf: line 37, column 44
    function value_6 () : java.util.Date {
      return Check.ScheduledSendDate
    }
    
    property get Check () : entity.Check {
      return getIteratedValue(1) as entity.Check
    }
    
    
  }
  
  
}