package gw.claim.metric.activity

@Export
class DaysLastViewedByAdjusterClaimMetricMethodsImpl
    extends DaysLastViewedByUserClaimMetricMethodsImpl<DaysLastViewedByAdjusterClaimMetric> {

  construct(daysLastViewedByAdjusterClaimMetric : DaysLastViewedByAdjusterClaimMetric) {
    super(daysLastViewedByAdjusterClaimMetric)
  }

  override function hasUserChanged(): boolean {
    return Metric.Claim.isFieldChanged(Claim#AssignedUser)
  }

  override property get MetricUser(): User {
    return Metric.Claim.AssignedUser
  }
}
