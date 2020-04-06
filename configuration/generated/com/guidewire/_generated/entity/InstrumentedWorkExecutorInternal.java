package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "InstrumentedWorkExecutor.eti;InstrumentedWorkExecutor.eix;InstrumentedWorkExecutor.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface InstrumentedWorkExecutorInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire.pl.domain.workqueue.impl.InstrumentedWorkExecutorInternalMethods, com.guidewire.pl.system.entity.DoesNotValidateOnCommit {
  /**
   * Gets the value of the AppServerName field.
   * The app server name.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAppServerName();
  
  
  /**
   * Gets the value of the EndTime field.
   * Timestamp when the executor was shutdown.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEndTime();
  
  
  /**
   * Gets the value of the MaxNumberOfWorkers field.
   * Maximum number of parallel workers.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getMaxNumberOfWorkers();
  
  
  /**
   * Gets the value of the StartTime field.
   * Timestamp when the executor was started.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartTime();
  
  
  /**
   * Gets the value of the StopInitiated field.
   * Timestamp when the executor stop was initiated.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStopInitiated();
  
  
  /**
   * Gets the value of the WorkQueueID field.
   * The related writer batch process, identifying this queue.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.BatchProcessType getWorkQueueID();
  
  
  /**
   * Sets the value of the AppServerName field.
   */
  public void setAppServerName(java.lang.String value);
  
  
  /**
   * Sets the value of the EndTime field.
   */
  public void setEndTime(java.util.Date value);
  
  
  /**
   * Sets the value of the MaxNumberOfWorkers field.
   */
  public void setMaxNumberOfWorkers(java.lang.Integer value);
  
  
  /**
   * Sets the value of the StartTime field.
   */
  public void setStartTime(java.util.Date value);
  
  
  /**
   * Sets the value of the StopInitiated field.
   */
  public void setStopInitiated(java.util.Date value);
  
  
  /**
   * Sets the value of the WorkQueueID field.
   */
  public void setWorkQueueID(typekey.BatchProcessType value);
  
  
  
}