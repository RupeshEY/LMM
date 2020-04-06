package gw.api.financials.escalation

uses gw.api.database.DBDateRange
uses gw.api.database.IQueryBeanResult
uses gw.api.database.Query
uses gw.cc.processes.RetryingBatchProcess

uses java.sql.Date

@Export
class BulkInvoiceEscalationMonitor extends RetryingBatchProcess<BulkInvoice> {

  construct() {
    super(BatchProcessType.TC_BULKINVOICEESC)
  }

  override function fetchItemsForProcessing(): IQueryBeanResult<BulkInvoice> {
    return BulkInvoicesQualifyingEscalationQuery.select()
  }

  override function processItem(invoice: BulkInvoice) {
    invoice.requestInvoice();
  }

  override function prepareFailedItemForRetry(invoice: BulkInvoice): BulkInvoice {
    return BulkInvoicesQualifyingEscalationQuery
        .compare(BulkInvoice#ID, Equals, invoice.ID)
        .select().AtMostOneRow
  }

  // Internal Methods
  internal property get BulkInvoicesQualifyingEscalationQuery(): Query<BulkInvoice> {
    var qualifyingInvoicesFinderQuery = Query.make(BulkInvoice)

    // Invoice's status should be BulkInvoiceStatus.TC_AWAITINGSUBMISSION
    qualifyingInvoicesFinderQuery.compare(BulkInvoice#Status, Equals, TC_AWAITINGSUBMISSION)

    // Send date of the Invoice should be today or earlier
    qualifyingInvoicesFinderQuery.compare(BulkInvoice#ScheduledSendDate, new DBDateRange(null, Date.Now, true))

    return qualifyingInvoicesFinderQuery
  }
}