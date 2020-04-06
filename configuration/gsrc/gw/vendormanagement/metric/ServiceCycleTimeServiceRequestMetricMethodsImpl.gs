package gw.vendormanagement.metric
uses gw.api.vendormanagement.metric.TimeBasedServiceRequestMetricMethodsImpl
uses java.util.Date
uses gw.api.metric.MetricUpdateHelper
uses java.lang.Integer
uses gw.api.util.DateUtil
uses java.util.List

@Export
class ServiceCycleTimeServiceRequestMetricMethodsImpl extends TimeBasedServiceRequestMetricMethodsImpl {

  construct(timeBasedServiceRequestMetric : TimeBasedServiceRequestMetric) {
    super(timeBasedServiceRequestMetric)
  }

  override property get Metric() : ServiceCycleTimeServiceRequestMetric {
    return super.Metric as ServiceCycleTimeServiceRequestMetric
  }
  
  override function updateMetricValue(helper : MetricUpdateHelper) : Date {
    
    if (Metric.New or helper.updateContainsChangesOfType(ServiceRequestChange)) {
      var changes = HistoryChangesWithNewProgressValues
      var firstInstructedChange = changes.firstWhere(\ c -> c.New_Progress == TC_REQUESTED)
      
      if (firstInstructedChange != null) {
        Metric.StartTime = firstInstructedChange.Timestamp
        handleTimeSpentNotWorking(changes)

        var mostRecentChange = changes.last()
        if (ServiceRequest.TerminalProgressValues.contains(mostRecentChange.New_Progress)) {
          var adjustedEndTime = (Metric.WaitingStartTime == null) ? mostRecentChange.Timestamp : Metric.WaitingStartTime
          if (isTerminatedButNotComplete(Metric.ServiceRequest.Progress)) {
            Metric.StartTime = null
          }
          close(adjustedEndTime)
          Metric.IntegerValue = (Metric.IntegerValue == null) ? null : Metric.IntegerValue + Metric.TimeSpentWorking
        } else if (Metric.ServiceRequest.Kind == TC_QUOTEONLY and mostRecentChange.Operation == TC_REQUESTREQUOTE) {
          // if a request requote happened on a quote-only service request, it goes from work complete to in progress & this metric needs to be reopened
          // marking it skipped will reopen it
          Metric.Skipped = true
        }
      } else {
        Metric.StartTime = null
      }
    }
    handleServiceRequestStateChange()
    return null
  }
  
// overriding Value to incorporate waiting time calculation
  override property get Value() : Integer {
    var result : Integer = null
    if (Metric.StartTime != null) {
      result = Metric.IsOpen
              ? calculateTimeSpentWorking()
              : Metric.IntegerValue
    }
    return result
  }

  override property get DefaultUnit() : MetricUnit {
    return TC_HOURS
  }
    
  private function calculateTimeSpentWorking() : Integer {
    var notWaiting = this.DateCalculator.timeBetween(Metric.StartTime, DateUtil.currentDate(), this.BusinessCalendarAddress) + Metric.TimeSpentWorking
    var waiting = Metric.WaitingStartTime != null ? this.DateCalculator.timeBetween(Metric.StartTime, Metric.WaitingStartTime, this.BusinessCalendarAddress) + Metric.TimeSpentWorking : null
    return (Metric.WaitingStartTime == null)
            ? notWaiting
            : waiting
  }

  /**
   * Returns the history entries that indicate a change in progress, with the oldest changes first
   */
  private property get HistoryChangesWithNewProgressValues() : List<ServiceRequestChange> {
    return Metric.ServiceRequest.History.where(\ change -> change.New_Progress != null).orderBy(\ change -> change.Sequence)
  }
  
  private function handleTimeSpentNotWorking(changes : List<ServiceRequestChange>) {
    
    var hoursWorked = 0
  
    for (change in changes) {
      if (change.New_Progress == TC_SPECIALISTWAITING or change.New_Progress == TC_WORKCOMPLETE) {
        var resumedChange = changes.firstWhere(\ c -> (c.New_Progress == TC_INPROGRESS or c.New_Progress == TC_REQUESTED) and c.Sequence > change.Sequence)
        if (resumedChange == null) {
          Metric.WaitingStartTime = change.Timestamp
          break
        } else {
          hoursWorked += this.DateCalculator.timeBetween(Metric.StartTime, change.Timestamp, this.BusinessCalendarAddress)
          Metric.StartTime = resumedChange.Timestamp
          Metric.WaitingStartTime = null
        }
      }     
    }
    Metric.TimeSpentWorking = hoursWorked
  }

}