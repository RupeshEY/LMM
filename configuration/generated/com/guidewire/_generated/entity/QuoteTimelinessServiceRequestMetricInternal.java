package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "QuoteTimelinessServiceRequestMetric.eti;QuoteTimelinessServiceRequestMetric.eix;QuoteTimelinessServiceRequestMetric.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface QuoteTimelinessServiceRequestMetricInternal extends com.guidewire._generated.entity.TimeBasedServiceRequestMetricInternal, com.guidewire._generated.entity.ServiceRequestMetricEscalationDelegateInternal {
  /**
   * Gets the value of the DaysDifferentFromExpected field.
   * Difference (in business days or hours) between the actual quote completion date and the expected quote completion date. Only filled out when service request is complete
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getDaysDifferentFromExpected();
  
  
  /**
   * Sets the value of the DaysDifferentFromExpected field.
   */
  public void setDaysDifferentFromExpected(java.lang.Integer value);
  
  
  
}