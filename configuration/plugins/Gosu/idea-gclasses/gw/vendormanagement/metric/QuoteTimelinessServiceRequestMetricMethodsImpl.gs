package gw.vendormanagement.metric
uses gw.api.locale.DisplayKey
uses gw.api.vendormanagement.metric.TimeBasedServiceRequestMetricMethodsImpl
uses java.util.Date
uses gw.api.metric.MetricUpdateHelper
uses java.lang.Integer

@Export
class QuoteTimelinessServiceRequestMetricMethodsImpl extends TimeBasedServiceRequestMetricMethodsImpl {
  
  construct(timeBasedServiceRequestMetric : TimeBasedServiceRequestMetric) {
    super(timeBasedServiceRequestMetric)
  }

  override function updateMetricValue (helper : MetricUpdateHelper) : Date {
    if (not Metric.ServiceRequest.quoteAllowed()) {
      return null
    }
    
    if (Metric.ServiceRequest.IsPromotion) {
      closeForPromotedServiceRequest()
      return null
    }
    
    if (Metric.New or helper.updateContainsChangesOfType(ServiceRequestChange)) {
      var changes = HistoryChangesWithNewProgressAndQuoteStatusValues
      var instructedChange = changes.firstWhere(\ c -> c.New_Progress == TC_REQUESTED)
      if (instructedChange != null) {
        Metric.StartTime = instructedChange.Timestamp
        updateLimitsIfECDChanged(ServiceRequest#ExpectedQuoteCompletionDate)
        var lastChange = changes.last()
        var terminalChange = ((lastChange.Operation == TC_ADDQUOTE) or (ServiceRequest.TerminalProgressValues.contains(lastChange.New_Progress) and Metric.IsOpen)) ? lastChange : null
        if (terminalChange != null) {
          close(terminalChange.Timestamp)
          var baseValue = BaseValueForLimitCalculation
          Metric.DaysDifferentFromExpected = baseValue == null ? null : Metric.IntegerValue - baseValue
          if (isTerminatedButNotComplete(terminalChange.New_Progress)) {
            Metric.IntegerValue = null
          }
        } else if (lastChange.Operation == TC_REQUESTREQUOTE) {
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
  
  override property get Metric() : QuoteTimelinessServiceRequestMetric {
    return super.Metric as QuoteTimelinessServiceRequestMetric
  }
    
  override property get DefaultUnit() : MetricUnit {
    return TC_DAYS
  }

  // time between start and expected quote completion date
  override property get BaseValueForLimitCalculation() : Integer {
    return (Metric.StartTime == null or Metric.ServiceRequest.ExpectedQuoteCompletionDate == null) ? null
                                                        : DateCalculator.timeBetween(Metric.StartTime, Metric.ServiceRequest.ExpectedQuoteCompletionDate, BusinessCalendarAddress)
  }

  private function closeForPromotedServiceRequest() {
    Metric.StartTime = Metric.ServiceRequest.OriginatingServiceRequest.QuoteTimelinessServiceRequestMetric.StartTime
    resetLimits()
    var closeChange = Metric.ServiceRequest.OriginatingServiceRequest.OrderedHistory.lastWhere(\ h -> h.Operation == TC_ADDQUOTE)
    close(closeChange.Timestamp)
    Metric.DaysDifferentFromExpected = Metric.IntegerValue - Metric.Limit.TargetValue as Integer    
  }
}