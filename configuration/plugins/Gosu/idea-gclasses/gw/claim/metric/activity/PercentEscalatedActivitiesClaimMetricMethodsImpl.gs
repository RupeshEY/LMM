package gw.claim.metric.activity

uses gw.api.claim.metric.PercentClaimMetricMethodsImpl
uses gw.api.metric.FilteredArray
uses gw.api.metric.MetricUpdateHelper

uses java.util.Date

@Export
class PercentEscalatedActivitiesClaimMetricMethodsImpl extends PercentClaimMetricMethodsImpl {

  construct(percentageOfEscalatedActivitiesClaimMetric: PercentEscalatedActivitiesClaimMetric ) {
    super(percentageOfEscalatedActivitiesClaimMetric, TC_CLAIMACTIVITYMETRICS)
  }
  
  override function updateMetricValue(helper : MetricUpdateHelper) : Date {
    if (Metric.New or helper.updateContainsChangesOfType(Activity)) {
      var totalActivitiesCount = new FilteredArray<Activity>(Metric.Claim, "Activities").Count
      if(totalActivitiesCount != 0) {
        var escalatedActivitiesCount =
            new FilteredArray<Activity>(Metric.Claim, "Activities")
                .where("Escalated", Equals, true)
                .Count

        setValueToRatio(escalatedActivitiesCount, totalActivitiesCount)
      }
    }

    return null
  }
}
