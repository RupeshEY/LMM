package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "OverdueActivitiesClaimMetric.eti;OverdueActivitiesClaimMetric.eix;OverdueActivitiesClaimMetric.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface OverdueActivitiesClaimMetricInternal extends com.guidewire._generated.entity.IntegerClaimMetricInternal, gw.api.claim.metric.RecalculateMetrics {
  /**
   * Gets the value of the NextOverdueTime field.
   * Time next activity will become overdue.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getNextOverdueTime();
  
  
  /**
   * Sets the value of the NextOverdueTime field.
   */
  public void setNextOverdueTime(java.util.Date value);
  
  
  
}