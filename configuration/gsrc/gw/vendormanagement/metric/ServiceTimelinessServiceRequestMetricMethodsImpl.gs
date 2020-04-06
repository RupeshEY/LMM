package gw.vendormanagement.metric
uses gw.api.locale.DisplayKey
uses gw.api.vendormanagement.metric.TimeBasedServiceRequestMetricMethodsImpl
uses java.util.Date
uses gw.api.metric.MetricUpdateHelper
uses java.lang.Integer
uses java.util.List

@Export
class ServiceTimelinessServiceRequestMetricMethodsImpl extends TimeBasedServiceRequestMetricMethodsImpl {
  
  construct(timeBasedServiceRequestMetric : TimeBasedServiceRequestMetric) {
    super(timeBasedServiceRequestMetric)
  }

  override function updateMetricValue (helper : MetricUpdateHelper) : Date {
    if (Metric.ServiceRequest.Kind == TC_QUOTEONLY) {
      return null
    }
    
    if (Metric.New or helper.updateContainsChangesOfType(ServiceRequestChange)) {
      
      var changes = HistoryChangesWithNewProgressAndQuoteStatusValues
      var startingChange = findStartConditionChange(changes)
      if (startingChange != null) {
        Metric.StartTime = startingChange.Timestamp
        updateLimitsIfECDChanged(ServiceRequest#ExpectedServiceCompletionDate)
        var terminalChange = (ServiceRequest.TerminalProgressValues.contains(changes.last().New_Progress)) ? changes.last() : null
        if (terminalChange != null) {
          close(terminalChange.Timestamp)
          var baseValue = BaseValueForLimitCalculation
          Metric.DaysDifferentFromExpected = baseValue == null ? null : Metric.IntegerValue - baseValue
          if (not Metric.ServiceRequest.IsDone) { // ie Progress != Work Complete
            Metric.IntegerValue = null
          }
          // check if the service request has left work-complete after completion
        } else if (not Metric.IsOpen and not Metric.ServiceRequest.IsDone) {
          Metric.Skipped = true
        }
      } else {
        Metric.StartTime = null
      }
    }
    handleServiceRequestStateChange()
    return null
  }
  
  override property get ApplicableDisplayValue() : String {
    if (not Metric.IsOpen and Metric.IntegerValue != null and not Metric.Skipped) {
      if (Metric.DaysDifferentFromExpected == 0) {
        return DisplayKey.get("Web.ServiceRequest.Metrics.ActualVsExpectedCompletionTime.ClosedOnTime")
      }
      return ((Metric.DaysDifferentFromExpected < 0) 
                             ? DisplayKey.get("Web.ServiceRequest.Metrics.ActualVsExpectedCompletionTime.ClosedEarly", getFormattedTimeAsString(Metric.DaysDifferentFromExpected))
                             : DisplayKey.get("Web.ServiceRequest.Metrics.ActualVsExpectedCompletionTime.ClosedLate", getFormattedTimeAsString(Metric.DaysDifferentFromExpected)))
    }
    
    return (Metric.Skipped) ? getFormattedTimeAsString(Value) : DisplayKey.get("Web.ServiceRequest.Metrics.OpenDisplayValue", getFormattedTimeAsString(Value))
  }
  
  override property get Metric() : ServiceTimelinessServiceRequestMetric {
    return super.Metric as ServiceTimelinessServiceRequestMetric
  }
   
  override property get DefaultUnit() : MetricUnit {
    return TC_DAYS
  }
  
  // time between start and expected service completion date
  override property get BaseValueForLimitCalculation() : Integer {
    return (Metric.StartTime == null or Metric.ServiceRequest.ExpectedServiceCompletionDate == null) ? null 
                                                    : DateCalculator.timeBetween(Metric.StartTime, Metric.ServiceRequest.ExpectedServiceCompletionDate, BusinessCalendarAddress)
  }
  
  private function findStartConditionChange(changes : List<ServiceRequestChange>) : ServiceRequestChange {
    if (Metric.ServiceRequest.Kind == TC_SERVICEONLY) {
      return changes.firstWhere(\ c -> c.New_Progress == TC_REQUESTED)
    } else if (Metric.ServiceRequest.Kind == TC_QUOTEANDSERVICE) {
      return changes.firstWhere(\ c -> c.New_QuoteStatus == TC_APPROVED)
    }
    return null
  }
}
