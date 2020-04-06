package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimMetricRecalculationTime.eti;ClaimMetricRecalculationTime.eix;ClaimMetricRecalculationTime.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimMetricRecalculationTimeInternal extends com.guidewire._generated.entity.EditableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.api.claim.metric.RecalculateMetrics, gw.cc.claim.metric.entity.ClaimMetricRecalculationTime {
  /**
   * Gets the value of the Claim field.
   * Claim that owns this ClaimMetricRecalculationTime object.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the LockingColumn field.
   * Meaningless column for locking
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLockingColumn();
  
  
  /**
   * Gets the value of the MetricLimitGeneration field.
   * Generation number, used to identify the limits for this claim's metrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getMetricLimitGeneration();
  
  
  /**
   * Gets the value of the NextRecalculationTime field.
   * The time when the claim metrics should next be recalculated.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getNextRecalculationTime();
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LockingColumn field.
   */
  public void setLockingColumn(java.lang.Integer value);
  
  
  /**
   * Sets the value of the MetricLimitGeneration field.
   */
  public void setMetricLimitGeneration(java.lang.Integer value);
  
  
  /**
   * Sets the value of the NextRecalculationTime field.
   */
  public void setNextRecalculationTime(java.util.Date value);
  
  
  
}