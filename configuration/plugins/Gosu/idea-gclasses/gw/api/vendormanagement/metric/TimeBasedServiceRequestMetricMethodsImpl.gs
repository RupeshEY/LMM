package gw.api.vendormanagement.metric
uses gw.api.locale.DisplayKey
uses gw.api.metric.TimeBasedMetricMethods
uses gw.api.metric.DateCalculator
uses java.lang.Integer
uses java.lang.Comparable
uses java.util.Date
uses gw.api.metric.DateCalculators
uses gw.api.util.Math
uses java.math.BigDecimal
uses java.math.RoundingMode
uses gw.lang.reflect.features.PropertyReference
uses java.util.List

@Export
class TimeBasedServiceRequestMetricMethodsImpl extends ServiceRequestMetricMethodsImpl implements TimeBasedMetricMethods {

  construct(timeBasedServiceRequestMetric : TimeBasedServiceRequestMetric) {
    super(timeBasedServiceRequestMetric)
  }

  override public function updateMetricLimitReachedTimes() {
    Metric.updateMetricLimitReachedTimes(this)
  }

  override property get Metric() : TimeBasedServiceRequestMetric {
    return super.Metric as TimeBasedServiceRequestMetric
  }
    
  override property get Value() : Integer {
    return Metric.getValue(this) 
  }

  override property get ApplicableDisplayValue() : String {
    return Metric.IsOpen
            ? DisplayKey.get("Web.ServiceRequest.Metrics.OpenDisplayValue", getFormattedTimeAsString(Value))
            : getFormattedTimeAsString(Value)
  }

  override property get IsNegative() : boolean {
    return Value < 0
  }

  override function formatTargetValue(targetValue : Comparable) : String {
    return Metric.getApplicableDisplayValue(targetValue as Integer)
  }

  override property get DisplayTargetValue() : String {  
    var targetValue = Limit.TargetValue
    return targetValue != null ? getFormattedTimeAsString(targetValue as Integer) : ""
  }

  override property get DefaultUnit() : MetricUnit {
    return TC_DAYS
  }  

  override function calculateLimitValue(limitVal : BigDecimal, limitType : ServiceRequestMetricLimitType) : Comparable {
    if (BaseValueForLimitCalculation == null) {
      return null 
    }
    // BaseValueForLimitCalculation is calculated as an Integer (# of hours or days) for time based metrics
    if (limitType == TC_ABSOLUTEOFFSET) {
      return (limitVal as Integer) + (BaseValueForLimitCalculation as Integer)
    } else if (limitType == TC_PERCENTAGEOFFSET) {
      return limitVal.divide(BigDecimal.valueOf(100)).multiply(BaseValueForLimitCalculation as Integer).setScale(0, RoundingMode.UP)
    } 
    return limitVal
  }
    
  /**
   * Returns the calculator used by the metric for date calculations.
   * Default is BUSINESS_HOURS for service request time-based metrics.
   */
  override property get DateCalculator() : DateCalculator {
    if (Unit == TC_DAYS) {
      return DateCalculators.BUSINESS_DAYS
    } else if (Unit == TC_HOURS) {
      return DateCalculators.BUSINESS_HOURS
    }
    throw notSupported()
  }
  
  override property get BusinessCalendarAddress() : Address {
    return Metric.ServiceRequest.Claim.LossLocation
  }
  
  /**
   * Will return X day(s) or X hour(s) based on the unit of the metric
   */
  protected function getFormattedTimeAsString(time : int) : String {
    if (Unit == TC_DAYS) {
      return (time == 0) ? DisplayKey.get("Date.NumWithDays", 0) : Date.formatToXDaysAndYHours(Math.abs(time) as int, 0)
    } else if (Unit == TC_HOURS) {
      return Date.formatToXDaysAndYHours(0, Math.abs(time) as int)
    }
    throw notSupported()    
  }
  
  protected function close(finalTime : Date) {
    Metric.close(this, finalTime)
  }
  
  protected function handleServiceRequestStateChange() {
    Metric.handleOwnerStateChange(this, not (Metric.ServiceRequest.Terminated or Metric.ServiceRequest.Claim.Closed), findTerminatedDate())
  }
  
  /**
   * Returns the history entries that indicate a change in progress or quote status, with the oldest changes first
   */
  protected property get HistoryChangesWithNewProgressAndQuoteStatusValues() : List<ServiceRequestChange> {
    return Metric.ServiceRequest.History.where(\ change -> change.New_Progress != null or change.New_QuoteStatus != null).orderBy(\ change -> change.Sequence)
  }

  protected function isTerminatedButNotComplete(progress : ServiceRequestProgress) : boolean {
    return ServiceRequest.TerminalProgressValues.contains(progress) and progress != TC_WORKCOMPLETE
  }

  /**
   * For actual vs. expected completion date metrics.  If the expected completion date (ECD) changes and the limits depend 
   * on that date, they need to be updated.  In addition, if the metric implements escalation and the ECD has moved the 
   * metric to a "good" status, the escalation flag needs to be reset.
   */
  protected function updateLimitsIfECDChanged(ecdField : PropertyReference<ServiceRequest, Date>) {
    if (Metric.ServiceRequest.isFieldChanged(ecdField)) {
      var oldStatus = Metric.Status
      resetLimits()
      if (Metric.Status != oldStatus and oldStatus == RED and (Metric.Status == YELLOW or Metric.Status == GREEN) and Metric typeis ServiceRequestMetricEscalationDelegate) {
        Metric.Escalated = false
      }
    }
  }
  
  private function findTerminatedDate() : Date {
    if (ServiceRequest.TerminalProgressValues.contains(Metric.ServiceRequest.Progress)) {
      var sortedHistory = Metric.ServiceRequest.History.sortBy(\ h -> h.Sequence)
      var terminalChange = sortedHistory.lastWhere(\ h -> h.New_Progress == h.ServiceRequest.Progress)
      return (terminalChange != null) ? terminalChange.Timestamp : sortedHistory.last().Timestamp
    } else if (Metric.ServiceRequest.Claim.Closed) {
      return Metric.ServiceRequest.Claim.CloseDate
    }
    return null
  }

}