package gw.claim.metric.financials

uses gw.api.claim.metric.IntegerClaimMetricMethodsImpl
uses java.util.Date
uses gw.api.metric.MetricUpdateHelper
uses java.lang.Integer
uses java.util.HashSet

@Export
class ReserveChangeCountClaimMetricMethodsImpl extends IntegerClaimMetricMethodsImpl  {

  construct(reserveChangeCountClaimMetric : ReserveChangeCountClaimMetric) {
    super(reserveChangeCountClaimMetric, TC_CLAIMFINANCIALSMETRICS)
  }

  override property get Metric() : ReserveChangeCountClaimMetric {
    return super.Metric as ReserveChangeCountClaimMetric
  }
  
  override function updateMetricValue(helper : MetricUpdateHelper) : Date {
    if (Metric.New or Metric.IntegerValue == null) {
      Metric.IntegerValue = findPreviousReserveChanges()
    } else {

      var modifiedReserves = Metric.Bundle.getAllModifiedBeansOfType( ReserveSet)
                              .where( \ r -> r.ApprovalStatus == ApprovalStatus.TC_APPROVED and r.Claim == Metric.Claim)

      if (hasCountableReserveSets(modifiedReserves)) {
        Metric.IntegerValue++
      }
    }
    return null
  }
  
  private function hasCountableReserveSets(reserveSets : java.lang.Iterable<ReserveSet>) : boolean {
    for (reserveSet in reserveSets) {
      for (reserve in reserveSet.Reserves) {
        if (!reserve.isInitialReserve()) {
          return true
        }
      }
    }
    return false
  }
  
  private function findPreviousReserveChanges() : Integer {
    var counter = new HashSet<Date>()
    var reservesIt = Metric.Claim.getReservesIterator(false) // this includes beans in the bundle
    for (reserve in reservesIt) {
      if (!reserve.isInitialReserve()) {
        var txnSet = (reserve.TransactionSet)
        if (txnSet.ApprovalDate != null) {
          counter.add(txnSet.ApprovalDate)
        } else if (txnSet.Approved) {
          counter.add(txnSet.CreateTime)
        }
      }
    }
    return counter.Count
  }
}
