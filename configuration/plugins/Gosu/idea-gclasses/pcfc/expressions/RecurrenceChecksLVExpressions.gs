package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/RecurrenceChecksLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RecurrenceChecksLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/RecurrenceChecksLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends RecurrenceChecksLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on CurrencyCell (id=Amount) at RecurrenceChecksLV.pcf: line 29, column 61
    function action_8 () : void {
      ClaimFinancialsChecksDetail.go(Check.Claim, Check)
    }
    
    // 'action' attribute on CurrencyCell (id=Amount) at RecurrenceChecksLV.pcf: line 29, column 61
    function action_dest_9 () : pcf.api.Destination {
      return pcf.ClaimFinancialsChecksDetail.createDestination(Check.Claim, Check)
    }
    
    // 'value' attribute on DateCell (id=ScheduledSendDate) at RecurrenceChecksLV.pcf: line 22, column 44
    function valueRoot_6 () : java.lang.Object {
      return Check
    }
    
    // 'value' attribute on TextCell (id=PayTo) at RecurrenceChecksLV.pcf: line 33, column 32
    function value_12 () : java.lang.String {
      return Check.PayTo
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at RecurrenceChecksLV.pcf: line 38, column 50
    function value_15 () : typekey.TransactionStatus {
      return Check.Status
    }
    
    // 'value' attribute on DateCell (id=ScheduledSendDate) at RecurrenceChecksLV.pcf: line 22, column 44
    function value_4 () : java.util.Date {
      return Check.ScheduledSendDate
    }
    
    // 'value' attribute on CurrencyCell (id=Amount) at RecurrenceChecksLV.pcf: line 29, column 61
    function value_7 () : gw.api.financials.CurrencyAmountPair {
      return Check.GrossAmountPair
    }
    
    property get Check () : entity.Check {
      return getIteratedValue(1) as entity.Check
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/RecurrenceChecksLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecurrenceChecksLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at RecurrenceChecksLV.pcf: line 22, column 44
    function sortValue_0 (Check :  entity.Check) : java.lang.Object {
      return Check.ScheduledSendDate
    }
    
    // 'value' attribute on RowIterator at RecurrenceChecksLV.pcf: line 29, column 61
    function sortValue_1 (Check :  entity.Check) : java.lang.Object {
      return Check.GrossAmountPair
    }
    
    // 'value' attribute on RowIterator at RecurrenceChecksLV.pcf: line 33, column 32
    function sortValue_2 (Check :  entity.Check) : java.lang.Object {
      return Check.PayTo
    }
    
    // 'value' attribute on RowIterator at RecurrenceChecksLV.pcf: line 38, column 50
    function sortValue_3 (Check :  entity.Check) : java.lang.Object {
      return Check.Status
    }
    
    // 'value' attribute on RowIterator at RecurrenceChecksLV.pcf: line 16, column 34
    function value_18 () : entity.Check[] {
      return CheckSet.Checks
    }
    
    property get CheckSet () : CheckSet {
      return getRequireValue("CheckSet", 0) as CheckSet
    }
    
    property set CheckSet ($arg :  CheckSet) {
      setRequireValue("CheckSet", 0, $arg)
    }
    
    
  }
  
  
}