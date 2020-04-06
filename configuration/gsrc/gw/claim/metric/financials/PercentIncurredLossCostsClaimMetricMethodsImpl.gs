package gw.claim.metric.financials
uses gw.api.financials.FinancialsCalculations
uses java.util.Date
uses java.math.BigDecimal
uses gw.api.claim.metric.PercentClaimMetricMethodsImpl
uses gw.api.metric.MetricUpdateHelper

@Export
class PercentIncurredLossCostsClaimMetricMethodsImpl extends PercentClaimMetricMethodsImpl {
  
  construct(percentIncurredLossCostsClaimMetric : PercentIncurredLossCostsClaimMetric) {
    super(percentIncurredLossCostsClaimMetric, TC_CLAIMFINANCIALSMETRICS)
  }
  
  override function updateMetricValue(helper : MetricUpdateHelper) : Date {
    var claim = Metric.Claim
    
    if (helper.updateContainsChangesOfType(TransactionSet) or Metric.New) {
      var claimCostIncurred = FinancialsCalculations.getTotalIncurredNet().withClaim( claim).withCostType(CostType.TC_CLAIMCOST ).Amount
      var totalIncurred = FinancialsCalculations.getTotalIncurredNet().withClaim( claim ).Amount
      if (totalIncurred == null) {
        Metric.PercentValue = null
      } else if (totalIncurred.Amount.IsZero or claimCostIncurred == null) {
        Metric.PercentValue = BigDecimal.valueOf(0)  
      } else {
        setValueToRatio(claimCostIncurred.getAmount(), totalIncurred.Amount)
      }
    }
    return null
  }

  override property get AscendingLimitOrder() : boolean {
    return false
  }
}
