package gw.claim.metric.financials
uses java.util.Date
uses java.math.BigDecimal
uses gw.api.claim.metric.PercentClaimMetricMethodsImpl
uses gw.api.metric.MetricUpdateHelper
uses gw.util.GosuObjectUtil

@Export
class PercentReserveChangeClaimMetricMethodsImpl extends PercentClaimMetricMethodsImpl {  
  
  construct(percentReserveChangeClaimMetric : PercentReserveChangeClaimMetric) {
    super(percentReserveChangeClaimMetric, TC_CLAIMFINANCIALSMETRICS)
  }
  
  override property get Metric() : PercentReserveChangeClaimMetric {
    return super.Metric as PercentReserveChangeClaimMetric
  }
  
  override function updateMetricValue(helper : MetricUpdateHelper) : Date {
    initialize()
    var claim = Metric.Claim
    
    if (Metric.New) {
      // calculate value for data in db
      var reservesIt = claim.getReservesIterator(false) // this includes beans in the bundle
      for (reserve in reservesIt) {
        accountForReserve(reserve)
      }
    } else {
      var modifiedReserveSets = Metric.Bundle.getAllModifiedBeansOfType(ReserveSet)
                                  .where( \ r -> r.ApprovalStatus == ApprovalStatus.TC_APPROVED and r.Claim == Metric.Claim )
      for (reserveSet in modifiedReserveSets) {
        for (reserve in reserveSet.Reserves) {
          accountForReserve(reserve)
        }
      }
    }

    if (Metric.InitialReserve == null or Metric.InitialReserve.IsZero) {
      Metric.PercentValue = null // no initial reserve, so ratio is undefined
    } else {    
      setValueToRatio(Metric.TotalReserveChange != null ? Metric.TotalReserveChange : BigDecimal.ZERO, Metric.InitialReserve) 
    }
    return null
  }
  
  private function accountForReserve(reserve : Reserve) {
    if (reserve.TransactionSet.Approved) {
      if (reserve.isInitialReserve()) {
        Metric.InitialReserve = Metric.InitialReserve.add(reserve.Amount)
      } else {
        Metric.TotalReserveChange = (GosuObjectUtil.defaultIfNull(Metric.TotalReserveChange, BigDecimal.ZERO) as BigDecimal).add(reserve.Amount)
      }
    }
  }
  
  private function initialize() {
    if (Metric.InitialReserve == null) {
      Metric.InitialReserve = BigDecimal.ZERO
      Metric.PercentValue = null
      Metric.TotalReserveChange = BigDecimal.ZERO
    }
  }
}
