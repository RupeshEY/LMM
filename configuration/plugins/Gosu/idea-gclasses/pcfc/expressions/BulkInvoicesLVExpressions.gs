package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/desktop/bulkpay/BulkInvoicesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class BulkInvoicesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/desktop/bulkpay/BulkInvoicesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkInvoicesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at BulkInvoicesLV.pcf: line 46, column 46
    function sortValue_0 (bulkInvoice :  entity.BulkInvoice) : java.lang.Object {
      return bulkInvoice.InvoiceNumber
    }
    
    // 'value' attribute on RowIterator at BulkInvoicesLV.pcf: line 52, column 50
    function sortValue_1 (bulkInvoice :  entity.BulkInvoice) : java.lang.Object {
      return bulkInvoice.Status
    }
    
    // 'value' attribute on RowIterator at BulkInvoicesLV.pcf: line 56, column 45
    function sortValue_2 (bulkInvoice :  entity.BulkInvoice) : java.lang.Object {
      return bulkInvoice.ReceivedDate
    }
    
    // 'value' attribute on RowIterator at BulkInvoicesLV.pcf: line 60, column 45
    function sortValue_3 (bulkInvoice :  entity.BulkInvoice) : java.lang.Object {
      return bulkInvoice.ApprovalDate
    }
    
    // 'value' attribute on RowIterator at BulkInvoicesLV.pcf: line 66, column 55
    function sortValue_4 (bulkInvoice :  entity.BulkInvoice) : java.lang.Object {
      return bulkInvoice.TotalTransactionAmount
    }
    
    // 'toRemove' attribute on RowIterator at BulkInvoicesLV.pcf: line 21, column 78
    function toRemove_33 (bulkInvoice :  entity.BulkInvoice) : void {
      bulkInvoice.delete()
    }
    
    // 'value' attribute on RowIterator at BulkInvoicesLV.pcf: line 21, column 78
    function value_34 () : gw.api.database.IQueryBeanResult<entity.BulkInvoice> {
      return bulkInvoices
    }
    
    property get bulkInvoices () : gw.api.database.IQueryBeanResult<BulkInvoice> {
      return getRequireValue("bulkInvoices", 0) as gw.api.database.IQueryBeanResult<BulkInvoice>
    }
    
    property set bulkInvoices ($arg :  gw.api.database.IQueryBeanResult<BulkInvoice>) {
      setRequireValue("bulkInvoices", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/desktop/bulkpay/BulkInvoicesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends BulkInvoicesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=InvoiceNumber) at BulkInvoicesLV.pcf: line 46, column 46
    function action_12 () : void {
      EditBulkInvoiceDetail.drilldown(bulkInvoice)
    }
    
    // 'action' attribute on TypeKeyCell (id=Status) at BulkInvoicesLV.pcf: line 52, column 50
    function action_17 () : void {
      EditBulkInvoiceDetail.drilldown(bulkInvoice)
    }
    
    // 'action' attribute on CurrencyCell (id=TotalAmount) at BulkInvoicesLV.pcf: line 66, column 55
    function action_28 () : void {
      EditBulkInvoiceDetail.drilldown(bulkInvoice)
    }
    
    // 'action' attribute on TextCell (id=InvoiceNumber) at BulkInvoicesLV.pcf: line 46, column 46
    function action_dest_13 () : pcf.api.Destination {
      return pcf.EditBulkInvoiceDetail.createDestination(bulkInvoice)
    }
    
    // 'action' attribute on TypeKeyCell (id=Status) at BulkInvoicesLV.pcf: line 52, column 50
    function action_dest_18 () : pcf.api.Destination {
      return pcf.EditBulkInvoiceDetail.createDestination(bulkInvoice)
    }
    
    // 'action' attribute on CurrencyCell (id=TotalAmount) at BulkInvoicesLV.pcf: line 66, column 55
    function action_dest_29 () : pcf.api.Destination {
      return pcf.EditBulkInvoiceDetail.createDestination(bulkInvoice)
    }
    
    // 'condition' attribute on ToolbarFlag at BulkInvoicesLV.pcf: line 39, column 42
    function condition_10 () : java.lang.Boolean {
      return bulkInvoice.ValidatableOrSubmittable
    }
    
    // 'condition' attribute on ToolbarFlag at BulkInvoicesLV.pcf: line 24, column 27
    function condition_5 () : java.lang.Boolean {
      return bulkInvoice.Deletable
    }
    
    // 'condition' attribute on ToolbarFlag at BulkInvoicesLV.pcf: line 27, column 30
    function condition_6 () : java.lang.Boolean {
      return bulkInvoice.Validateable
    }
    
    // 'condition' attribute on ToolbarFlag at BulkInvoicesLV.pcf: line 30, column 29
    function condition_7 () : java.lang.Boolean {
      return bulkInvoice.Submittable
    }
    
    // 'condition' attribute on ToolbarFlag at BulkInvoicesLV.pcf: line 33, column 27
    function condition_8 () : java.lang.Boolean {
      return bulkInvoice.Stoppable
    }
    
    // 'condition' attribute on ToolbarFlag at BulkInvoicesLV.pcf: line 36, column 26
    function condition_9 () : java.lang.Boolean {
      return bulkInvoice.Voidable
    }
    
    // 'highlighted' attribute on Row at BulkInvoicesLV.pcf: line 41, column 60
    function highlighted_32 () : java.lang.Boolean {
      return bulkInvoice.hasInvalidInvoiceItems()
    }
    
    // 'value' attribute on TextCell (id=InvoiceNumber) at BulkInvoicesLV.pcf: line 46, column 46
    function valueRoot_15 () : java.lang.Object {
      return bulkInvoice
    }
    
    // 'value' attribute on TextCell (id=InvoiceNumber) at BulkInvoicesLV.pcf: line 46, column 46
    function value_11 () : java.lang.String {
      return bulkInvoice.InvoiceNumber
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at BulkInvoicesLV.pcf: line 52, column 50
    function value_16 () : typekey.BulkInvoiceStatus {
      return bulkInvoice.Status
    }
    
    // 'value' attribute on DateCell (id=ReceivedDate) at BulkInvoicesLV.pcf: line 56, column 45
    function value_21 () : java.util.Date {
      return bulkInvoice.ReceivedDate
    }
    
    // 'value' attribute on DateCell (id=ApprovalDate) at BulkInvoicesLV.pcf: line 60, column 45
    function value_24 () : java.util.Date {
      return bulkInvoice.ApprovalDate
    }
    
    // 'value' attribute on CurrencyCell (id=TotalAmount) at BulkInvoicesLV.pcf: line 66, column 55
    function value_27 () : gw.api.financials.CurrencyAmount {
      return bulkInvoice.TotalTransactionAmount
    }
    
    property get bulkInvoice () : entity.BulkInvoice {
      return getIteratedValue(1) as entity.BulkInvoice
    }
    
    
  }
  
  
}