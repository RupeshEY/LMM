package gw.claim.metric.general

uses gw.api.claim.metric.TimeBasedClaimMetricMethodsImpl
uses gw.api.database.Relop
uses gw.api.locale.DisplayKey
uses gw.api.metric.FilteredArray
uses gw.api.metric.MetricUpdateHelper

uses java.util.Date
uses java.util.List

@Export
class DaysInitialContactWithInsuredClaimMetricMethodsImpl extends TimeBasedClaimMetricMethodsImpl{
  
  private var _contactInsuredPattern : ActivityPattern
  
  construct(daysInitialContactWithInsuredClaimMetric : DaysInitialContactWithInsuredClaimMetric ) {
    super(daysInitialContactWithInsuredClaimMetric, TC_OVERALLCLAIMMETRICS)
  }

  override property get Metric() : DaysInitialContactWithInsuredClaimMetric {
    return super.Metric as DaysInitialContactWithInsuredClaimMetric
  }

  override function updateMetricValue(helper : MetricUpdateHelper) : Date {
    if (Metric.New or helper.updateContainsChangesOfType(Activity) or ReportedDateChanged) {
      Metric.StartTime = null

      var startTimeSet = false
      var firstSkippedActivity: Activity = null
      for(var act in findActivitiesForContactWithInsured()) {
        if (not startTimeSet) {
          // If there is at least one "Contact With Insured" activity (having any Status), then we want to initialize
          // the Metric's StartTime, but we want to do it only once.
          Metric.StartTime = Metric.Claim.ReportedDate
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

    handleClaimStateChange()

    return null
  }

  override property get ApplicableDisplayValue() : String {
    return (Metric.IsOpen or Metric.Skipped or Metric.ActivitySkipped)
            ? DisplayKey.get("Web.Claim.InitialContactWithInsuredClaimMetric.NoContactMade")
            : super.ApplicableDisplayValue
  }
  
  private function findActivitiesForContactWithInsured() : List<Activity> {
    return new FilteredArray<Activity>(Metric.Claim, "Activities")
        .and("Matter", Equals, null)
        .and("Exposure", Equals, null)
        .and("ClaimContact", Equals, null)
        .and("ActivityPattern", Equals, ContactInsuredPattern)
        .orderedByAscending("CloseDate")
        .Contents
  }

  private function hasActivitiesWithPattern(pattern: ActivityPattern) : boolean {
    return new FilteredArray<Activity>(Metric.Claim, "Activities")
        .and("ActivityPattern", Relop.Equals, pattern)
        .Count > 0
  }

  private property get ContactInsuredPattern() : ActivityPattern {

    if (_contactInsuredPattern == null) {
      var claim = this.Metric.Claim
      if (claim.LossType == LossType.TC_WC) {
        var threePointContactEmployer = ActivityPattern.finder.getActivityPatternByCode("three_point_contact_employer")
        if (hasActivitiesWithPattern(threePointContactEmployer)) {
          _contactInsuredPattern = threePointContactEmployer
          return _contactInsuredPattern
        }
      }
      _contactInsuredPattern = ActivityPattern.finder.getActivityPatternByCode("contact_insured")
    }

    return _contactInsuredPattern
  }
}
