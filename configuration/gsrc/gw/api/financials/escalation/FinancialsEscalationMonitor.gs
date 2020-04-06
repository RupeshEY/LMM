package gw.api.financials.escalation

uses gw.api.database.DBDateRange
uses gw.api.database.IQueryBeanResult
uses gw.api.database.Query
uses gw.cc.processes.RetryingBatchProcess

uses java.sql.Date

@Export
public class FinancialsEscalationMonitor<T> extends RetryingBatchProcess<Check> {

  construct() {
    super(BatchProcessType.TC_FINANCIALSESC)
  }

  override function fetchItemsForProcessing(): IQueryBeanResult<Check> {
    return ChecksQualifyingEscalationQuery.select()
  }

  override function processItem(check: Check) {
    check.requestCheck()
  }

  override function prepareFailedItemForRetry(check: Check): Check {
    return ChecksQualifyingEscalationQuery
        .compare(Check#ID, Equals, check.ID)
        .select().AtMostOneRow
  }

  // Internal Methods
  internal property get ChecksQualifyingEscalationQuery(): Query<Check> {
    var qualifyingChecksFinderQuery = Query.make(Check)

    // Check's status should be TransactionStatus.TC_AWAITINGSUBMISSION
    qualifyingChecksFinderQuery.compare(Check#Status, Equals, TC_AWAITINGSUBMISSION)

    // Send date of the check should be today or earlier
    qualifyingChecksFinderQuery.compare(Check#ScheduledSendDate, new DBDateRange(null, Date.Now, true))

    /*
     Check should be:
       Not associated with a BulkInvoice (i.e., Check.BulkInvoiceItemInfo should be null)
         -OR-
       If associated with one, then:
         Check.PendEscalationForBulk should be FALSE/null
           -AND-
         Check.BulkInvoiceItemInfo.BulkInvoiceItem.Status should not be DRAFT
    */
    qualifyingChecksFinderQuery.or( \ verifyBIItemOr -> {
      verifyBIItemOr.compare(Check#BulkInvoiceItemInfo, Equals, null)
      verifyBIItemOr.and( \ draftBIItemAnd -> {
        draftBIItemAnd.subselect(Check#BulkInvoiceItemInfo, CompareNotIn, DraftBIItemInfoQuery, BulkInvoiceItemInfo#ID)
        draftBIItemAnd.or( \ pendEscOr -> {
          pendEscOr.compare(Check#PendEscalationForBulk, Equals, false)
          pendEscOr.compare(Check#PendEscalationForBulk, Equals, null)
        })
      })
    })

    return qualifyingChecksFinderQuery
  }

  internal property get DraftBIItemInfoQuery() : Query<BulkInvoiceItemInfo> {
    var draftBulkInvoiceItemInfoQuery = Query.make(BulkInvoiceItemInfo)
    draftBulkInvoiceItemInfoQuery.join(BulkInvoiceItemInfo#BulkInvoiceItem)
        .compare(BulkInvoiceItem#Status, Equals, TC_DRAFT)

    return draftBulkInvoiceItemInfoQuery
  }
}