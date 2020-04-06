package gw.vendormanagement.metric
uses gw.api.vendormanagement.metric.TimeBasedServiceRequestMetricMethodsImpl
uses gw.api.metric.MetricUpdateHelper
uses java.util.Date
uses java.util.List

@Export
class SpecialistInitialResponseTimeServiceRequestMetricMethodsImpl extends TimeBasedServiceRequestMetricMethodsImpl {

  // note: a state of in progress implies that the service request was accepted by the vendor
  private var _responseProgressValues = {ServiceRequestProgress.TC_DECLINED, ServiceRequestProgress.TC_INPROGRESS, ServiceRequestProgress.TC_SPECIALISTWAITING, ServiceRequestProgress.TC_WORKCOMPLETE}

  construct(specialistInitialResponseTimeServiceRequestMetric : SpecialistInitialResponseTimeServiceRequestMetric) {
    super(specialistInitialResponseTimeServiceRequestMetric)
  }
  
  override property get Metric() : SpecialistInitialResponseTimeServiceRequestMetric {
    return super.Metric as SpecialistInitialResponseTimeServiceRequestMetric
  }

  override function updateMetricValue(helper : MetricUpdateHelper) : Date {
    if (Metric.New or helper.updateContainsChangesOfType(ServiceRequestChange)) {
      var changes = HistoryChangesWithNewProgressOrExpectedCompletionDateValues
      var firstInstructedChange = changes.firstWhere(\ c -> c.New_Progress == TC_REQUESTED)
      
      if (firstInstructedChange != null) {
        Metric.StartTime = firstInstructedChange.Timestamp
        var firstResponseChange = changes.firstWhere(\ c -> _responseProgressValues.contains(c.New_Progress) or delayWasAdded(c))
        if (firstResponseChange != null) {
          close(firstResponseChange.Timestamp)
        }
      } else {
        Metric.StartTime = null
      }
    }
    handleServiceRequestStateChange()
    return null
  }
  
  override property get DefaultUnit() : MetricUnit {
    return TC_HOURS
  }
  
  /**
   * Returns the history entries that may indicate a change in progress or a delay, with the oldest changes first
   */
  private property get HistoryChangesWithNewProgressOrExpectedCompletionDateValues() : List<ServiceRequestChange> {
    return Metric.ServiceRequest.History.where(\ change -> change.Progress_Chg or change.ExpectedQuoteCompletionDate_Chg or change.ExpectedServiceCompletionDate_Chg).orderBy(\ change -> change.Sequence)
  }
  
  private function delayWasAdded(change : ServiceRequestChange) : boolean {
    return (change.ExpectedQuoteCompletionDate_Chg or change.ExpectedServiceCompletionDate_Chg) and not change.Progress_Chg
  }
}