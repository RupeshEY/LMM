package gw.api.metric
uses java.lang.Comparable
uses java.math.BigDecimal

/**
 * This interface delegate is intended to provide access points to metrics that may need to 
 * calculate the value of the associated limits.  The method of calculation can vary by metric and 
 * limit type, so it's better handled by the individual metrics.
 */
@Export
structure CalculatedLimitMethods {

  /**
   * The value that limit calculations are based on, for example the expected number of days to complete the service.
   */
  property get BaseValueForLimitCalculation() : Comparable
    
  /**
   * Calculates a single limit value given the offset value (from the limit object matched to the 
   * service request) and the type of the limit.
   */
  function calculateLimitValue(limitVal : BigDecimal, limitType : ServiceRequestMetricLimitType) : Comparable
}
