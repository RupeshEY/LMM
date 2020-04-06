package gw.exposure.metric.general

uses gw.api.database.Relop
uses gw.api.exposure.metric.PercentExposureMetricMethodsImpl
uses gw.api.metric.FilteredArray
uses gw.api.metric.MetricUpdateHelper

uses java.util.Date

@Export
class PercentEscalatedActivitiesExposureMetricMethodsImpl extends PercentExposureMetricMethodsImpl {
  
  construct(percentageEscalatedActivitiesExposureMetric : PercentEscalatedActivitiesExposureMetric ) {
    super(percentageEscalatedActivitiesExposureMetric)
  }

  override function updateMetricValue(helper : MetricUpdateHelper) : Date {
    var isNonWCClaim = Metric.Exposure.Claim.LossType != TC_WC
    if (Metric.New or hasModifiedExposureActivities(isNonWCClaim)) {
      var claimant : ClaimContact
      if (isNonWCClaim) {
        claimant = Metric.Exposure.getClaimContactByRole(TC_CLAIMANT)
      }

      var totalActivitiesCount = new FilteredArray<Activity>(Metric.Exposure, "Activities").Count
      if (isNonWCClaim) {
        var claimantActivitiesCount =
            new FilteredArray<Activity>(Metric.Exposure.Claim, "Activities")
                .where("ClaimContact", Equals, claimant)
                .where("Exposure", NotEquals, Metric.Exposure)
                .Count
        totalActivitiesCount += claimantActivitiesCount
      }

      if(totalActivitiesCount != 0) {
        var escalatedActivitiesCount =
            new FilteredArray<Activity>(Metric.Exposure, "Activities")
                .where("Escalated", Equals, true)
                .Count
        if (isNonWCClaim) {
          var claimantActivitiesCount = new FilteredArray<Activity>(Metric.Exposure.Claim, "Activities")
              .where("ClaimContact", Relop.Equals, claimant)
              .where("Escalated", Relop.Equals, true)
              .where("Exposure", Relop.NotEquals, Metric.Exposure)
              .Count
          escalatedActivitiesCount += claimantActivitiesCount
        }

        setValueToRatio(escalatedActivitiesCount, totalActivitiesCount)
      }
    }
    return null
  }

  function hasModifiedExposureActivities(isNonWCClaim : boolean): boolean {
    var modifiedActivities = Metric.Bundle.getAllModifiedBeansOfType(Activity)
    return isNonWCClaim ?
        modifiedActivities.hasMatch( \ a -> a.Exposure == Metric.Exposure or
            (a.ClaimContact != null and a.ClaimContact.Contact == Metric.Exposure.ClaimantDenorm))
        :
        modifiedActivities.hasMatch( \ a -> a.Exposure == Metric.Exposure)
  }
}
