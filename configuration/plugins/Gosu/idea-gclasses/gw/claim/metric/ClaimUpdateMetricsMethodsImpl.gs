package gw.claim.metric
uses gw.lang.Export
uses gw.api.claim.ClaimHealthUpdater
uses gw.api.metric.ClaimUpdateMetricsMethods

@Export
class ClaimUpdateMetricsMethodsImpl implements ClaimUpdateMetricsMethods {

  private var _claim : Claim
  construct(claim : Claim) { _claim = claim }

  override function updateClaimMetrics() {
    ClaimHealthUpdater.updateClaim(_claim)
  }
}