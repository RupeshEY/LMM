package gw.claim.metric.financials
uses gw.api.financials.FinancialsCalculations
uses java.util.Date
uses java.math.BigDecimal
uses gw.api.claim.metric.PercentClaimMetricMethodsImpl
uses gw.api.metric.MetricUpdateHelper

@Export
class PercentPaidLossCostsClaimMetricMethodsImpl extends PercentClaimMetricMethodsImpl {
  
  construct(percentPaidLossCostsClaimMetric : PercentPaidLossCostsClaimMetric) {
    super(percentPaidLossCostsClaimMetric, TC_CLAIMFINANCIALSMETRICS)
  }
  
  override function updateMetricValue(helper : MetricUpdateHelper) : Date {
    var claim = Metric.Claim
    
    if (helper.updateContainsChangesOfType(Payment) or Metric.New) {
      var claimCostPayment = FinancialsCalculations.getTotalPayments().withClaim( claim).withCostType(CostType.TC_CLAIMCOST ).Amount
      var totalPayment = FinancialsCalculations.getTotalPayments().withClaim( claim ).Amount
      if (totalPayment == null or totalPayment.Amount.IsZero) {
        Metric.PercentValue = null
      } else if (claimCostPayment == null) {
        Metric.PercentValue = BigDecimal.valueOf(0)
      } else {
        setValueToRatio(claimCostPayment.Amount, totalPayment.Amount)
      }
    }
    return null
  }

  override property get AscendingLimitOrder() : boolean {
    return false
  }
}
