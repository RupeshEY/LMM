package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DaysInitialContactWithInsuredClaimMetric.eti;DaysInitialContactWithInsuredClaimMetric.eix;DaysInitialContactWithInsuredClaimMetric.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface DaysInitialContactWithInsuredClaimMetricInternal extends com.guidewire._generated.entity.TimeBasedClaimMetricInternal {
  /**
   * Gets the value of the ActivitySkipped field.
   * Did the user explicitly skip the initial contact with insured activity?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isActivitySkipped();
  
  
  /**
   * Sets the value of the ActivitySkipped field.
   */
  public void setActivitySkipped(java.lang.Boolean value);
  
  
  
}