package gw.claim.metric.financials

uses gw.api.claim.metric.MoneyClaimMetricMethodsImpl
uses java.util.Date
uses gw.api.financials.FinancialsCalculations
uses gw.api.metric.MetricUpdateHelper

@Export
class NetTotalIncurredClaimMetricMethodsImpl extends MoneyClaimMetricMethodsImpl {
  
  construct(netTotalIncurredClaimMetric : NetTotalIncurredClaimMetric) {
    super(netTotalIncurredClaimMetric)
  }

  override function updateMetricValue(helper : MetricUpdateHelper) : Date {
    if (helper.updateContainsChangesOfType(TransactionSet) 
        or helper.updateContainsChangesOfType( Payment )
        or Metric.New) {
      Metric.MoneyValue = FinancialsCalculations.getTotalIncurredNet().withClaim(Metric.Claim).Amount
    }
    return null
  }

}
