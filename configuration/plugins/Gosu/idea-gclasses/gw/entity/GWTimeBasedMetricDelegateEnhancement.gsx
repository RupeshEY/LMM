package gw.entity
uses java.util.Date
uses java.lang.Integer
uses gw.api.metric.TimeBasedMetricMethods
uses java.lang.Comparable

/**
 * Contains the common logic shared by all time based metrics, both claim metrics
 * and exposure metrics. The most important pieces of state are:
 * <ul>
 * <li>StartTime - the time from which we start counting the metric value. If the
 *     StartTime is null then the metric is not applicable meaning its value is
 *     null, it will show up in the UI as N/A and its status (with respect to any
 *     limits) will always be INACTIVE
 * <li>IsOpen and IntegerValue - if IsOpen is true then the metric's value is
 *     changing and can be calculated by subtracting the StartTime from the current
 *     time. If IsOpen is false then the metric has stopped changing and its value
 *     is stored in the IntegerValue field
 * <li>Skipped - if the claim or exposure that owns the metric is closed then the
 *     metric will be closed (IsOpen = false) and Skipped set to true. This is
 *     so we can detect the case where the claim/exposure is reopened. If it is,
 *     and if Skipped is true, then we reopen the metric as well. This flag is
 *     needed to distinguish between the case where the metric is closed
 *     permanently (in which case the claim/exposure reopen should have no effect)
 *     and the case where the metric is closed because the claim/exposure closed
 *     (in which case the claim/exposure reopen should reopen the metric as well)
 * </ul>
 */
@Export
enhancement GWTimeBasedMetricDelegateEnhancement : entity.TimeBasedMetricDelegate {

  /**
   * The current value of the metric. If the metric is open, uses the date
   * calculator to calculate the difference between the start time and now. If
   * the metric is closed returns the IntegerValue. Returns null if the metric
   * is not applicable (StartTime == null).
   */
  public function getValue(metric : TimeBasedMetricMethods) : Integer {
    var result : Integer = null
    if (this.StartTime != null) {
      result = this.IsOpen
              ? metric.DateCalculator.timeBetween(this.StartTime, Date.CurrentDate, metric.BusinessCalendarAddress)
              : this.IntegerValue
    }
    return result
  }

  /**
   * Called after every update to ensure the reach times are correct. The reach
   * times are set to the start time plus the appropriate limit value with the
   * following exceptions:
   * <ul>
   * <li>If the metric is not applicable both reach times are set to null
   * <li>If the metric is closed and start time plus the limit is in the future
   *     then we know the metric will not reach the limit, so we set it to null
   * </ul>
   */
  public function updateMetricLimitReachedTimes(metric : TimeBasedMetricMethods) {
    if (this.IsOpen) {
      metric.MetricAsMetricLimitTimeDelegate.ReachRedTime = calculateReachTime(metric, metric.Limit.RedValue)
      metric.MetricAsMetricLimitTimeDelegate.ReachYellowTime = calculateReachTime(metric, metric.Limit.YellowValue)
    } else {
      metric.MetricAsMetricLimitTimeDelegate.ReachRedTime = calculateReachTimeIfLimitExceeded(metric, metric.Limit.RedValue)
      metric.MetricAsMetricLimitTimeDelegate.ReachYellowTime = calculateReachTimeIfLimitExceeded(metric, metric.Limit.YellowValue)
    }
  }

  /**
   * Closes the metric as of the given time. IsOpen is set to false and the
   * IntegerValue is set to the final time minus the start time.
   */
  public function close(metric : TimeBasedMetricMethods, finalTime : Date) {
    calculateValue(metric, finalTime)
    this.IsOpen = false
    this.Skipped = false
  }

  /**
   * There are three cases:
   * <ul>
   * <li> If the owner is closed and the metric is open then closes the metric and
   *      marks it as skipped.
   * <li> If the owner is open and the metric is closed and skipped then reopen the
   *      metric.
   * <li> If the owner is closed and the metric is closed and skipped and the
   *      start time has changed but the value hasn't, then the value must be
   *      recalculated. Note that a metric is skipped if it is closed because
   *      the owner closed, so in this case updating the metric value is the
   *      responsibility of this method. Normally the rest of the update logic
   *      should detect the change in start time, but in this one case this
   *      method is responsible, as the metric is closed because the owner is
   *      closed.
   * </ul>
   */
  public function handleOwnerStateChange(metric : TimeBasedMetricMethods, ownerIsOpen : boolean, closeTime : Date) {
    if (not ownerIsOpen and this.IsOpen) {
      close(metric, closeTime)
      this.Skipped = true
    } else if (ownerIsOpen and not this.IsOpen and this.Skipped) {
      this.IsOpen = true
      this.IntegerValue = null
      this.Skipped = false
    } else if (skippedValueIsStale(ownerIsOpen)) {
      calculateValue(metric, closeTime)
    }
  }

  private function calculateValue(metric : TimeBasedMetricMethods, finalTime : Date) {
    if (this.StartTime != null and finalTime != null) {
      this.IntegerValue = metric.DateCalculator.timeBetween(this.StartTime, finalTime, metric.BusinessCalendarAddress)
    } else {
      this.IntegerValue = null
    }
  }
  
  private function calculateReachTimeIfLimitExceeded(metric : TimeBasedMetricMethods, limitToReach : Comparable) : Date {
    var valueReached = metric.LimitValue
    return limitToReach != null and valueReached != null and valueReached >= limitToReach
            ? calculateReachTime(metric, limitToReach)
            : null
  }
  
  private function calculateReachTime(metric : TimeBasedMetricMethods, limitToReach : Comparable) : Date {
    return limitToReach != null and this.StartTime != null
            ? metric.DateCalculator.addTime(this.StartTime, limitToReach as Integer, metric.BusinessCalendarAddress)
            : null
  }
  
  private function skippedValueIsStale(ownerIsOpen : boolean) : boolean {
    return not ownerIsOpen and not this.IsOpen and this.Skipped
            and not this.isFieldChanged("IntegerValue")
            and this.isFieldChanged("StartTime")
  }
}
