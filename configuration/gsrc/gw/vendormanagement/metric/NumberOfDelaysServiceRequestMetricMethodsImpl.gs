package gw.vendormanagement.metric
uses java.util.Date
uses gw.api.metric.MetricUpdateHelper
uses gw.api.vendormanagement.metric.IntegerServiceRequestMetricMethodsImpl
uses java.util.List

@Export
class NumberOfDelaysServiceRequestMetricMethodsImpl extends IntegerServiceRequestMetricMethodsImpl {

  construct(numberOfDelaysMetric : NumberOfDelaysServiceRequestMetric) {
    super(numberOfDelaysMetric)
    if (numberOfDelaysMetric.New and numberOfDelaysMetric.ServiceRequest.Progress != TC_DRAFT) {
      if (numberOfDelaysMetric.ServiceRequest.IsPromotion) {
        numberOfDelaysMetric.IntegerValue = numberOfDelaysMetric.ServiceRequest.OriginatingServiceRequest.NumberOfDelaysServiceRequestMetric.IntegerValue
      } else {
        numberOfDelaysMetric.IntegerValue = 0
      }
    }
  }
  
  override property get Metric() : NumberOfDelaysServiceRequestMetric {
    return super.Metric as NumberOfDelaysServiceRequestMetric
  }
  
  override function updateMetricValue(helper : MetricUpdateHelper) : Date {
    if (Metric.ServiceRequest.Progress != TC_DRAFT and (Metric.New or helper.updateContainsChangesOfType(ServiceRequestChange))) {

      Metric.IntegerValue = 0
      var orderedHistory = Metric.ServiceRequest.OrderedHistory
      Metric.IntegerValue += countQuoteECDDelays(orderedHistory.where(\ c -> c.New_ExpectedQuoteCompletionDate != null))
      Metric.IntegerValue += countServiceECDDelays(orderedHistory.where(\ c -> c.New_ExpectedServiceCompletionDate != null))
    }
    return null
  }

  private function countQuoteECDDelays(history : List<ServiceRequestChange>) : int {
    var updateECDChanges = history.where(\ c -> c.Operation == TC_UPDATEQUOTEECD)
    var count = 0
    updateECDChanges.each(\ ch -> {
      var priorDate = history.lastWhere(\ c -> c.Sequence < ch.Sequence).New_ExpectedQuoteCompletionDate
      if (priorDate != null and ch.New_ExpectedQuoteCompletionDate.after(priorDate)) {
        count++
      }
    })
    return count
  }
  
  private function countServiceECDDelays(history : List<ServiceRequestChange>) : int {
    var updateECDChanges = history.where(\ c -> c.Operation == TC_UPDATESERVICEECD)
    var count = 0
    updateECDChanges.each(\ ch -> {
      var priorDate = history.lastWhere(\ c -> c.Sequence < ch.Sequence).New_ExpectedServiceCompletionDate
      if (priorDate != null and ch.New_ExpectedServiceCompletionDate.after(priorDate)) {
        count++
      }
    })
    return count    
  } 
}