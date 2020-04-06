package gw.exposure.metric.financials
uses gw.api.exposure.metric.PercentExposureMetricMethodsImpl
uses java.util.Date
uses gw.api.financials.FinancialsCalculations
uses java.math.BigDecimal
uses gw.api.metric.MetricUpdateHelper

@Export
class PercentPaidLossCostsExposureMetricMethodsImpl extends PercentExposureMetricMethodsImpl {
  
  construct(percentPaidLossCostsExposureMetric : PercentPaidLossCostsExposureMetric) {
    super(percentPaidLossCostsExposureMetric)
  }
  
  override function updateMetricValue(helper : MetricUpdateHelper) : Date {
    var exposure = Metric.Exposure
    
    if (helper.updateContainsChangesOfType(Payment) or Metric.New) {
      var claimCostPayment = FinancialsCalculations.getTotalPayments().withExposure( exposure).withCostType(CostType.TC_CLAIMCOST).Amount
      var totalPayment = FinancialsCalculations.getTotalPayments().withExposure( exposure ).Amount
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
