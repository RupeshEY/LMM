package gw.claim.metric.financials

uses gw.api.claim.metric.TimeBasedClaimMetricMethodsImpl
uses gw.api.database.DBFunction
uses gw.api.database.Query
uses gw.api.database.QuerySelectColumns
uses gw.api.locale.DisplayKey
uses gw.api.metric.MetricUpdateHelper
uses gw.api.path.Paths
uses gw.pl.persistence.core.Key

uses java.util.Date
uses gw.api.util.CCDateUtil

@Export
class TimeToFirstPaymentClaimMetricMethodsImpl extends TimeBasedClaimMetricMethodsImpl {

  construct(timeToFirstPaymentClaimMetric : TimeToFirstPaymentClaimMetric) {
    super(timeToFirstPaymentClaimMetric, TC_CLAIMFINANCIALSMETRICS)
  }

  override function updateMetricValue(helper : MetricUpdateHelper) : Date {
    Metric.StartTime = Metric.Claim.ReportedDate
    if (Metric.New or helper.updateContainsChangesOfType(Payment) or ReportedDateChanged) {
      var earliestSubmitTime = calculateEarliestSubmitTime()
      if (earliestSubmitTime != null) {
        close(earliestSubmitTime)
      } else if (not Metric.IsOpen and not Metric.Skipped) {
        // Metric closed, but no payment. Can happen if payment rejected
        Metric.IsOpen = true
        Metric.IntegerValue = null
      }
    }
    handleClaimStateChange()
    return null
  }

  override property get ApplicableDisplayValue() : String {
    return Metric.IsOpen or Metric.Skipped
        ? DisplayKey.get("Web.Claim.TimeToFirstPaymentClaimMetric.NoPaymentMade")
        : super.ApplicableDisplayValue
  }

  private function calculateEarliestSubmitTime() : Date {
    var modifiedPaymentsOnClaim = Metric.Claim.Bundle.getInsertedAndUpdatedBeansOfType(Payment)
        .where( \ p -> p.Claim == Metric.Claim)
    var earliestModifiedActiveCheck = modifiedPaymentsOnClaim.where( \ p ->
            (p.Status == TC_SUBMITTING or p.Status == TC_SUBMITTED) and
            p.CostType == TC_CLAIMCOST
        )
        .orderBy( \ p -> p.Check.ScheduledSendDate ?: p.Check.IssueDate)
        .first()
        .Check
    var earliestModifiedPaymentSubmitDate = earliestModifiedActiveCheck.ScheduledSendDate ?:
        earliestModifiedActiveCheck.IssueDate

    if (Metric.Claim.New) {
      return earliestModifiedPaymentSubmitDate
    }

    var idsOfModifiedPaymentsOnClaim = modifiedPaymentsOnClaim.map( \ p -> p.ID)
    var earliestUnmodifiedNormalPaymentSubmitDate =
        createBaseQueryForEarliestUnmodifiedPaymentSubmitDate(idsOfModifiedPaymentsOnClaim)
            .join(Payment#Check)
            .compare(Check#ScheduledSendDate, NotEquals, null)
            .select({QuerySelectColumns.dbFunction(DBFunction.Min(Paths.make(Payment#Check, Check#ScheduledSendDate)))})
            .transformQueryRow( \ row -> row.getColumn(0) as Date)
            .AtMostOneRow

    var earliestUnmodifiedManualPaymentSubmitDate =
        createBaseQueryForEarliestUnmodifiedPaymentSubmitDate(idsOfModifiedPaymentsOnClaim)
            .join(Payment#Check)
            .compare(Check#ScheduledSendDate, Equals, null)
            .compare(Check#IssueDate, NotEquals, null)
            .select({QuerySelectColumns.dbFunction(DBFunction.Min(Paths.make(Payment#Check, Check#IssueDate)))})
            .transformQueryRow(\row -> row.getColumn(0) as Date)
            .AtMostOneRow

    var earliestUnmodifiedPaymentSubmitDate =
        CCDateUtil.earliestOf(earliestUnmodifiedNormalPaymentSubmitDate, earliestUnmodifiedManualPaymentSubmitDate)
    return CCDateUtil.earliestOf(earliestUnmodifiedPaymentSubmitDate, earliestModifiedPaymentSubmitDate)
  }

  private function createBaseQueryForEarliestUnmodifiedPaymentSubmitDate(paymentIDsToExclude: List<Key>):
      Query<Payment> {
    var paymentQuery = Query.make(Payment)
    paymentQuery.compareNotIn(Payment#ID, paymentIDsToExclude.toTypedArray())
        .compareIn(Payment#Status, {TransactionStatus.TC_SUBMITTING, TransactionStatus.TC_SUBMITTED}.toTypedArray())
        .compare(Payment#CostType, Equals, CostType.TC_CLAIMCOST)
        .compare(Payment#Claim, Equals, Metric.Claim)

    return paymentQuery
  }
}
