package gw.claim.metric.activity

uses gw.api.database.Query

@Export
class DaysLastViewedBySupervisorClaimMetricMethodsImpl
    extends DaysLastViewedByUserClaimMetricMethodsImpl<DaysLastViewedBySupervisorClaimMetric> {

  construct(daysLastViewedBySupervisorClaimMetric: DaysLastViewedBySupervisorClaimMetric) {
    super(daysLastViewedBySupervisorClaimMetric)
  }

  override function hasUserChanged(): boolean {
    return fetchOriginalGroup().Supervisor != Metric.Claim.AssignedGroup.Supervisor
  }

  override property get MetricUser(): User {
    return Metric.Claim.AssignedGroup.Supervisor
  }

  private function fetchOriginalGroup() : Group {
    var groupID = Metric.Claim.getOriginalValue("AssignedGroup")
    if(groupID != null) {
      return Query.make(Group).compare("ID", Equals, groupID).select().getFirstResult()
    }

    return null
  }

}
