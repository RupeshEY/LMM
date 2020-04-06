package gw.exposure.metric.general

uses gw.api.database.Relop
uses gw.api.exposure.metric.TimeBasedExposureMetricMethodsImpl
uses gw.api.locale.DisplayKey
uses gw.api.metric.FilteredArray
uses gw.api.metric.MetricUpdateHelper

uses java.util.Date
uses java.util.List

@Export
class DaysInitialContactWithClaimantExposureMetricMethodsImpl extends TimeBasedExposureMetricMethodsImpl {

  private var _contactClaimantPattern : ActivityPattern

  construct(daysInitialContactWithClaimantExposureMetric : DaysInitialContactWithClaimantExposureMetric ) {
    super(daysInitialContactWithClaimantExposureMetric)
  }

  override property get Metric() : DaysInitialContactWithClaimantExposureMetric {
    return super.Metric as DaysInitialContactWithClaimantExposureMetric
  }

  override function updateMetricValue(helper : MetricUpdateHelper) : Date {
    if (Metric.New or helper.updateContainsChangesOfType(Activity)) {
      Metric.StartTime = null

      var startTimeSet = false
      var firstSkippedActivity: Activity = null
      for(var act in findActivitiesForContactWithClaimant()) {
        if (not startTimeSet) {
          // If there is at least one "Contact With Insured" activity (having any Status), then we want to initialize
          // the Metric's StartTime, but we want to do it only once.
          Metric.StartTime = Metric.getCreateTime(Metric.Exposure)
          startTimeSet = true
        }

        if (act.CloseDate == null) {
          continue
        }

        // If there are any completed activities, close the Metric and use the earliest completed Activity's CloseDate
        // as the FinalTime for the Metric. If not, attempt the same using skipped Activities. If none of those exist
        // as well, leave the Metric open.
        if (act.Status == ActivityStatus.TC_COMPLETE) {
          close(act.CloseDate)
          Metric.ActivitySkipped = false
          firstSkippedActivity = null
          break
        } else if (firstSkippedActivity == null and act.Status == TC_SKIPPED) {
          firstSkippedActivity = act
        }
      }

      if (firstSkippedActivity != null) {
        close(firstSkippedActivity.CloseDate)
        Metric.ActivitySkipped = true
      }
    }

    handleExposureStateChange()

    return null
  }

  override property get ApplicableDisplayValue() : String {
    return (Metric.IsOpen or Metric.Skipped or Metric.ActivitySkipped)
            ? DisplayKey.get("Web.Claim.InitialContactWithClaimantExposureMetric.NoContactMade")
            : super.ApplicableDisplayValue
  }

  private function findActivitiesForContactWithClaimant() : List<Activity> {
    return new FilteredArray<Activity>(Metric.Exposure.Claim, "Activities")
        .where("Claim", Equals, Metric.Exposure.Claim)
        .and("Exposure", Equals, Metric.Exposure)
        .and("ActivityPattern", Equals, ContactClaimantPattern)
        .orderedByAscending("CloseDate")
        .Contents
  }

  private property get ContactClaimantPattern() : ActivityPattern {
    if (_contactClaimantPattern == null ) {
      _contactClaimantPattern = ActivityPattern.finder.getActivityPatternByCode("contact_claimant")
    }

    return _contactClaimantPattern
  }
}
