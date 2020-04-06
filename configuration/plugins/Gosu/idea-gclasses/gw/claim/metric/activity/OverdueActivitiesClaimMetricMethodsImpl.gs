package gw.claim.metric.activity
uses gw.api.claim.metric.IntegerClaimMetricMethodsImpl
uses java.util.Date
uses gw.api.claim.metric.RecalculateMetrics
uses gw.api.metric.MetricUpdateHelper
uses gw.api.metric.FilteredArray

@Export
class OverdueActivitiesClaimMetricMethodsImpl extends IntegerClaimMetricMethodsImpl implements RecalculateMetrics {

  construct(overdueActivitiesClaimMetric : OverdueActivitiesClaimMetric) {
    super(overdueActivitiesClaimMetric, TC_CLAIMACTIVITYMETRICS)
    // Delegates are created lazily so it's possible IntegerValue is already set even on new entity
    if (overdueActivitiesClaimMetric.New and overdueActivitiesClaimMetric.IntegerValue == null) {
      overdueActivitiesClaimMetric.IntegerValue = 0
    }
  }

  override property get Metric() : OverdueActivitiesClaimMetric {
    return super.Metric as OverdueActivitiesClaimMetric
  }

  override function updateMetricValue(helper : MetricUpdateHelper) : Date {
    return recalculateValue()
  }

  override function recalculate() : Date {
    var result = recalculateValue()
    updateMetricLimitReachedTimes()

    return result
  }

  private function recalculateValue() : Date {
    var startOfToday = Date.CurrentDate.trimToMidnight()

    if (Metric.New or metricIsOverdue(startOfToday) or bundleHasActivities()) {
      Metric.IntegerValue = findOverdueActivityCount(startOfToday)
      Metric.NextOverdueTime = findTimeNextActivityWillBecomeOverdue(startOfToday)
    }

    return Metric.NextOverdueTime
  }
  
  private function metricIsOverdue(threshold: Date) : boolean {
    return Metric.NextOverdueTime != null and Metric.NextOverdueTime <= threshold
  }
  
  private function bundleHasActivities() : boolean {
    return Metric.Bundle.getAllModifiedBeansOfType(Activity).HasElements
  }
  
  private function findOverdueActivityCount(currentTime : Date) : int {
    return new FilteredArray<Activity>(Metric.Claim, "Activities")
      .where("Status", Equals, typekey.ActivityStatus.TC_OPEN)
      .and("TargetDate", LessThan, currentTime)
      .Count
  }

  private function findTimeNextActivityWillBecomeOverdue(currentTime : Date) : Date {
    var nextActivity = new FilteredArray<Activity>(Metric.Claim, "Activities")
      .where("Status", Equals, typekey.ActivityStatus.TC_OPEN)
      .and("TargetDate", GreaterThanOrEquals, currentTime)
      .orderedByAscending("TargetDate")
      .first()
    return startOfNextDay(nextActivity.TargetDate)
  }

  private function startOfNextDay(time : Date) : Date {
    return time != null ? time.trimToMidnight().addBusinessDays(1, Metric.Claim.LossLocation) : null
  }
}
