package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/financials/DuplicateCheckResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DuplicateCheckResultsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/workspace/financials/DuplicateCheckResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DuplicateCheckResultsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at DuplicateCheckResultsLV.pcf: line 21, column 32
    function sortValue_0 (Check :  entity.Check) : java.lang.Object {
      return Check.PayTo
    }
    
    // 'value' attribute on RowIterator at DuplicateCheckResultsLV.pcf: line 25, column 54
    function sortValue_1 (Check :  entity.Check) : java.lang.Object {
      return Check.FormatAddressSummary(false)
    }
    
    // 'value' attribute on RowIterator at DuplicateCheckResultsLV.pcf: line 29, column 44
    function sortValue_2 (Check :  entity.Check) : java.lang.Object {
      return Check.ScheduledSendDate
    }
    
    // 'value' attribute on RowIterator at DuplicateCheckResultsLV.pcf: line 34, column 50
    function sortValue_3 (Check :  entity.Check) : java.lang.Object {
      return Check.Status
    }
    
    // 'value' attribute on RowIterator at DuplicateCheckResultsLV.pcf: line 39, column 61
    function sortValue_4 (Check :  entity.Check) : java.lang.Object {
      return Check.GrossAmountPair
    }
    
    // 'value' attribute on RowIterator at DuplicateCheckResultsLV.pcf: line 15, column 34
    function value_19 () : entity.Check[] {
      return CheckList
    }
    
    property get CheckList () : Check[] {
      return getRequireValue("CheckList", 0) as Check[]
    }
    
    property set CheckList ($arg :  Check[]) {
      setRequireValue("CheckList", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/workspace/financials/DuplicateCheckResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends DuplicateCheckResultsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=PayTo) at DuplicateCheckResultsLV.pcf: line 21, column 32
    function valueRoot_7 () : java.lang.Object {
      return Check
    }
    
    // 'value' attribute on DateCell (id=ScheduledSendDate) at DuplicateCheckResultsLV.pcf: line 29, column 44
    function value_10 () : java.util.Date {
      return Check.ScheduledSendDate
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at DuplicateCheckResultsLV.pcf: line 34, column 50
    function value_13 () : typekey.TransactionStatus {
      return Check.Status
    }
    
    // 'value' attribute on CurrencyCell (id=Amount) at DuplicateCheckResultsLV.pcf: line 39, column 61
    function value_16 () : gw.api.financials.CurrencyAmountPair {
      return Check.GrossAmountPair
    }
    
    // 'value' attribute on TextCell (id=PayTo) at DuplicateCheckResultsLV.pcf: line 21, column 32
    function value_5 () : java.lang.String {
      return Check.PayTo
    }
    
    // 'value' attribute on TextCell (id=MailingAddress) at DuplicateCheckResultsLV.pcf: line 25, column 54
    function value_8 () : java.lang.String {
      return Check.FormatAddressSummary(false)
    }
    
    property get Check () : entity.Check {
      return getIteratedValue(1) as entity.Check
    }
    
    
  }
  
  
}