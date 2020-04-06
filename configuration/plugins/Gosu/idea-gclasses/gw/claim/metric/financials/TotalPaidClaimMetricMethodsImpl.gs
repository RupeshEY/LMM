package gw.claim.metric.financials

uses gw.api.claim.metric.MoneyClaimMetricMethodsImpl
uses gw.api.financials.FinancialsCalculations
uses java.util.Date
uses gw.api.metric.MetricUpdateHelper

@Export
class TotalPaidClaimMetricMethodsImpl extends MoneyClaimMetricMethodsImpl {

  construct(totalPaidClaimMetric : TotalPaidClaimMetric) {
    super(totalPaidClaimMetric)
  }

  override function updateMetricValue(helper : MetricUpdateHelper) : Date {
    if (helper.updateContainsChangesOfType(Payment) 
        or helper.updateContainsChangesOfType( TransactionLineItem )
        or Metric.New) {
      Metric.MoneyValue = FinancialsCalculations.getTotalPayments().withClaim(Metric.Claim).Amount
    }
    return null
  }

}
