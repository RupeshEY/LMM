package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "WorkloadDelegate.eti;WorkloadDelegate.eix;WorkloadDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface WorkloadDelegateInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal {
  /**
   * Gets the value of the SupplementalWorkloadWeight field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSupplementalWorkloadWeight();
  
  
  /**
   * Gets the value of the WorkloadUpdated field.
   * Last time user workload was calculated and updated
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getWorkloadUpdated();
  
  
  /**
   * Gets the value of the WorkloadWeight field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getWorkloadWeight();
  
  
  /**
   * Sets the value of the SupplementalWorkloadWeight field.
   */
  public void setSupplementalWorkloadWeight(java.lang.Integer value);
  
  
  /**
   * Sets the value of the WorkloadUpdated field.
   */
  public void setWorkloadUpdated(java.util.Date value);
  
  
  /**
   * Sets the value of the WorkloadWeight field.
   */
  public void setWorkloadWeight(java.lang.Integer value);
  
  
  
}