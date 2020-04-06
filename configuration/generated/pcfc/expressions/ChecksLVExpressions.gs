package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/ChecksLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ChecksLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/ChecksLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ChecksLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ChecksLV.pcf: line 14, column 65
    function initialValue_0 () : gw.api.database.IQueryBeanResult<CheckView> {
      return gw.api.financials.ClaimFinancialsTransactionsUtil.getChecksQuery(Claim)
    }
    
    // 'value' attribute on RowIterator at ChecksLV.pcf: line 27, column 42
    function sortValue_1 (CheckView :  entity.CheckView) : java.lang.Object {
      return CheckView.CheckNumber
    }
    
    // 'value' attribute on RowIterator at ChecksLV.pcf: line 33, column 36
    function sortValue_2 (CheckView :  entity.CheckView) : java.lang.Object {
      return CheckView.PayTo
    }
    
    // 'sortBy' attribute on RowIterator at ChecksLV.pcf: line 43, column 61
    function sortValue_3 (CheckView :  entity.CheckView) : java.lang.Object {
      return CheckView.GrossClaimAmount
    }
    
    // 'value' attribute on RowIterator at ChecksLV.pcf: line 50, column 40
    function sortValue_4 (CheckView :  entity.CheckView) : java.lang.Object {
      return CheckView.IssueDate
    }
    
    // 'value' attribute on RowIterator at ChecksLV.pcf: line 57, column 48
    function sortValue_5 (CheckView :  entity.CheckView) : java.lang.Object {
      return CheckView.ScheduledSendDate
    }
    
    // 'value' attribute on RowIterator at ChecksLV.pcf: line 64, column 50
    function sortValue_6 (CheckView :  entity.CheckView) : java.lang.Object {
      return CheckView.Status
    }
    
    // 'sortBy' attribute on RowIterator at ChecksLV.pcf: line 73, column 57
    function sortValue_7 (CheckView :  entity.CheckView) : java.lang.Object {
      return CheckView.BulkInvoiceNumber
    }
    
    // 'value' attribute on RowIterator at ChecksLV.pcf: line 19, column 76
    function value_37 () : gw.api.database.IQueryBeanResult<entity.CheckView> {
      return CheckViewList
    }
    
    property get CheckViewList () : gw.api.database.IQueryBeanResult<CheckView> {
      return getVariableValue("CheckViewList", 0) as gw.api.database.IQueryBeanResult<CheckView>
    }
    
    property set CheckViewList ($arg :  gw.api.database.IQueryBeanResult<CheckView>) {
      setVariableValue("CheckViewList", 0, $arg)
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/ChecksLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ChecksLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on CurrencyCell (id=GrossAmount) at ChecksLV.pcf: line 43, column 61
    function action_17 () : void {
      ClaimFinancialsChecksDetail.go(Claim, CheckView.Check)
    }
    
    // 'action' attribute on TextCell (id=BulkInvoice) at ChecksLV.pcf: line 73, column 57
    function action_33 () : void {
      EditBulkInvoiceDetail.go(CheckView.BulkInvoice)
    }
    
    // 'action' attribute on TextCell (id=CheckNumber) at ChecksLV.pcf: line 27, column 42
    function action_9 () : void {
      ClaimFinancialsChecksDetail.go(Claim, CheckView.Check)
    }
    
    // 'action' attribute on TextCell (id=CheckNumber) at ChecksLV.pcf: line 27, column 42
    function action_dest_10 () : pcf.api.Destination {
      return pcf.ClaimFinancialsChecksDetail.createDestination(Claim, CheckView.Check)
    }
    
    // 'action' attribute on CurrencyCell (id=GrossAmount) at ChecksLV.pcf: line 43, column 61
    function action_dest_18 () : pcf.api.Destination {
      return pcf.ClaimFinancialsChecksDetail.createDestination(Claim, CheckView.Check)
    }
    
    // 'action' attribute on TextCell (id=BulkInvoice) at ChecksLV.pcf: line 73, column 57
    function action_dest_34 () : pcf.api.Destination {
      return pcf.EditBulkInvoiceDetail.createDestination(CheckView.BulkInvoice)
    }
    
    // 'available' attribute on TextCell (id=BulkInvoice) at ChecksLV.pcf: line 73, column 57
    function available_30 () : java.lang.Boolean {
      return CheckView.isBulked()
    }
    
    // 'value' attribute on TextCell (id=CheckNumber) at ChecksLV.pcf: line 27, column 42
    function valueRoot_12 () : java.lang.Object {
      return CheckView
    }
    
    // 'value' attribute on TextCell (id=PayTo) at ChecksLV.pcf: line 33, column 36
    function value_13 () : java.lang.String {
      return CheckView.PayTo
    }
    
    // 'value' attribute on CurrencyCell (id=GrossAmount) at ChecksLV.pcf: line 43, column 61
    function value_16 () : gw.api.financials.CurrencyAmountPair {
      return CheckView.GrossCurrencyAmount
    }
    
    // 'value' attribute on DateCell (id=IssueDate) at ChecksLV.pcf: line 50, column 40
    function value_21 () : java.util.Date {
      return CheckView.IssueDate
    }
    
    // 'value' attribute on DateCell (id=ScheduledSendDate) at ChecksLV.pcf: line 57, column 48
    function value_24 () : java.util.Date {
      return CheckView.ScheduledSendDate
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at ChecksLV.pcf: line 64, column 50
    function value_27 () : typekey.TransactionStatus {
      return CheckView.Status
    }
    
    // 'value' attribute on TextCell (id=BulkInvoice) at ChecksLV.pcf: line 73, column 57
    function value_31 () : java.lang.String {
      return CheckView.DisplayedBulkInvoiceNumber
    }
    
    // 'value' attribute on TextCell (id=CheckNumber) at ChecksLV.pcf: line 27, column 42
    function value_8 () : java.lang.String {
      return CheckView.CheckNumber
    }
    
    property get CheckView () : entity.CheckView {
      return getIteratedValue(1) as entity.CheckView
    }
    
    
  }
  
  
}