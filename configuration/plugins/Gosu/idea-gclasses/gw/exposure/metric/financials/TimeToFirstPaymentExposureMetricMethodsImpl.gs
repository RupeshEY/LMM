package gw.exposure.metric.financials

uses gw.api.database.DBFunction
uses gw.api.database.Query
uses gw.api.database.QuerySelectColumns
uses gw.api.locale.DisplayKey
uses gw.api.exposure.metric.TimeBasedExposureMetricMethodsImpl
uses gw.api.metric.MetricUpdateHelper
uses gw.api.path.Paths
uses gw.api.util.CCDateUtil

uses java.util.Date

@Export
class TimeToFirstPaymentExposureMetricMethodsImpl extends TimeBasedExposureMetricMethodsImpl {

  construct(timeToFirstPaymentExposureMetric : TimeToFirstPaymentExposureMetric) {
    super(timeToFirstPaymentExposureMetric)
  }
  
  override function updateMetricValue(helper : MetricUpdateHelper) : Date {
    var exposure = Metric.Exposure
    if (Metric.StartTime == null) {
      Metric.StartTime = Metric.getCreateTime(exposure)
    }
    
    if (Metric.New or helper.updateContainsChangesOfType(Payment)) {
      var earliestSubmitTime = calculateEarliestSubmitTime()
      if (earliestSubmitTime != null) {
        close(earliestSubmitTime)
      }
    }
    
    handleExposureStateChange()
    return null
  }
  
  override property get ApplicableDisplayValue() : String {
    return (Metric.IsOpen or Metric.Skipped)
            ? DisplayKey.get("Web.Claim.TimeToFirstPaymentExposureMetric.NoPaymentMade")
            : super.ApplicableDisplayValue
  }
  
  private function calculateEarliestSubmitTime() : Date {
    var earliestModifiedActiveCheck = Metric.Exposure.Bundle.getInsertedAndUpdatedBeansOfType(Payment)
        .where( \ p ->
            p.Exposure == Metric.Exposure and
            (p.Status == TC_SUBMITTING or p.Status == TC_SUBMITTED) and
            p.CostType == TC_CLAIMCOST
        )
        .orderBy( \ p -> p.Check.ScheduledSendDate ?: p.Check.IssueDate)
        .first()
        .Check
    var earliestModifiedPaymentSubmitDate = earliestModifiedActiveCheck.ScheduledSendDate ?:
        earliestModifiedActiveCheck.IssueDate

    if (Metric.Exposure.New) {
      return earliestModifiedPaymentSubmitDate
    }

    var earliestUnmodifiedNormalPaymentSubmitDate =
        createBaseQueryForEarliestUnmodifiedPaymentSubmitDate()
            .join(Payment#Check)
            .compare(Check#ScheduledSendDate, NotEquals, null)
            .select({QuerySelectColumns.dbFunction(DBFunction.Min(Paths.make(Payment#Check, Check#ScheduledSendDate)))})
            .transformQueryRow(\row -> row.getColumn(0) as Date)
            .AtMostOneRow
                                                 
    var earliestUnmodifiedManualPaymentSubmitDate =
        createBaseQueryForEarliestUnmodifiedPaymentSubmitDate()
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

  private function createBaseQueryForEarliestUnmodifiedPaymentSubmitDate(): Query<Payment> {
    var paymentQuery = Query.make(Payment)
    paymentQuery
        .compareIn(Payment#Status, {TransactionStatus.TC_SUBMITTING, TransactionStatus.TC_SUBMITTED}.toTypedArray())
        .compare(Payment#CostType, Equals, CostType.TC_CLAIMCOST)
        .compare(Payment#Exposure, Equals, Metric.Exposure)

    return paymentQuery
  }
}
