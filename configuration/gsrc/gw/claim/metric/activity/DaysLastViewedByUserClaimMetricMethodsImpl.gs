package gw.claim.metric.activity

uses gw.api.claim.metric.TimeBasedClaimMetricMethodsImpl
uses gw.api.metric.FilteredArray
uses gw.api.metric.MetricUpdateHelper

uses java.util.Date

@Export
abstract class DaysLastViewedByUserClaimMetricMethodsImpl<T extends TimeBasedClaimMetric>
    extends TimeBasedClaimMetricMethodsImpl {

  construct(timeBasedClaimMetric : T) {
    super(timeBasedClaimMetric, TC_CLAIMACTIVITYMETRICS)
  }

  override function updateMetricValue(metricUpdateHelper : MetricUpdateHelper) : Date {
    var userChanged = hasUserChanged()

    if (userChanged) {
      Metric.IntegerValue = null
      Metric.StartTime = null
    }

    if (Metric.New or userChanged or metricUpdateHelper.updateContainsChangesOfType(History)) {
      Metric.StartTime = calculateLastViewedDate()
    }

    handleClaimStateChange()

    return null
  }

  protected function calculateLastViewedDate() : Date {
    var filteredHistoryArray = new FilteredArray<History>(Metric.Claim, "History")
        .where("Type", Equals, HistoryType.TC_VIEWING)
        .and("User", Equals, MetricUser)
        .orderedByDescending("EventTimestamp")

    if(Metric.Claim.CloseDate != null) {
      filteredHistoryArray.and("EventTimestamp", LessThan, Metric.Claim.CloseDate)
    }

    return filteredHistoryArray.first().EventTimestamp
  }

  protected abstract function hasUserChanged(): boolean
  protected abstract property get MetricUser(): User
}