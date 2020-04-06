package gw.claim.metric.general

uses gw.api.claim.metric.TimeBasedClaimMetricMethodsImpl
uses java.util.Date
uses gw.api.metric.MetricUpdateHelper

@Export
class DaysOpenClaimMetricMethodsImpl extends TimeBasedClaimMetricMethodsImpl { 
  
  construct(daysOpenClaimMetric : DaysOpenClaimMetric) {
    super(daysOpenClaimMetric, ClaimMetricCategory.TC_OVERALLCLAIMMETRICS)
  }

  override function updateMetricValue(helper : MetricUpdateHelper) : Date {
    Metric.StartTime = Metric.Claim.ReportedDate
    handleClaimStateChange()
    return null
  }
}
