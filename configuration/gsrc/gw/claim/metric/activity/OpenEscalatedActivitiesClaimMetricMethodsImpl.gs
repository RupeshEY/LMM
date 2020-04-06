package gw.claim.metric.activity

uses gw.api.claim.metric.IntegerClaimMetricMethodsImpl
uses gw.api.metric.FilteredArray
uses gw.api.metric.MetricUpdateHelper

uses java.util.Date

@Export
class OpenEscalatedActivitiesClaimMetricMethodsImpl extends IntegerClaimMetricMethodsImpl{

  construct(openEscalatedActivitiesExposureMetric : OpenEscalatedActivitiesClaimMetric ) {
    super(openEscalatedActivitiesExposureMetric, TC_CLAIMACTIVITYMETRICS)
  }

  override function updateMetricValue(helper : MetricUpdateHelper) : Date {
    if (Metric.New or helper.updateContainsChangesOfType(Activity)) {
      Metric.IntegerValue =
          new FilteredArray<Activity>(Metric.Claim, "Activities")
              .where("Escalated", Equals, true)
              .where("Status", Equals, ActivityStatus.TC_OPEN)
              .Count
    }

    return null
  }
}
