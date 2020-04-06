package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CopyOnWriteMetricLimitDelegate.eti;CopyOnWriteMetricLimitDelegate.eix;CopyOnWriteMetricLimitDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface CopyOnWriteMetricLimitDelegateInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, com.guidewire.cc.domain.metric.impl.CopyOnWriteMetricLimitDelegateInternal, gw.cc.metric.entity.CopyOnWriteMetricLimitDelegate {
  /**
   * Gets the value of the CreatedGeneration field.
   * Generation number at which this limit was created
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getCreatedGeneration();
  
  
  /**
   * Gets the value of the RetiredDate field.
   * Date at which this limit was retired, or null if still active.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getRetiredDate();
  
  
  /**
   * Gets the value of the RetiredGeneration field.
   * Generation number at which this limit was retired, or null if still active
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getRetiredGeneration();
  
  
  /**
   * Sets the value of the CreatedGeneration field.
   */
  public void setCreatedGeneration(java.lang.Integer value);
  
  
  /**
   * Sets the value of the RetiredDate field.
   */
  public void setRetiredDate(java.util.Date value);
  
  
  /**
   * Sets the value of the RetiredGeneration field.
   */
  public void setRetiredGeneration(java.lang.Integer value);
  
  
  
}