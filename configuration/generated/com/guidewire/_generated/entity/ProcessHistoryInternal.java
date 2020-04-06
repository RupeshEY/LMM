package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ProcessHistory.eti;ProcessHistory.eix;ProcessHistory.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ProcessHistoryInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire._generated.entity.EventAwareInternal, com.guidewire.commons.profiler.ProfilerDataSourceInternal, com.guidewire.pl.domain.batchprocessing.impl.ProcessHistoryInternalMethods {
  java.lang.String PROCESSHISTORYADDED_EVENT = "ProcessHistoryAdded";
  
  java.lang.String PROCESSHISTORYCHANGED_EVENT = "ProcessHistoryChanged";
  
  java.lang.String PROCESSHISTORYREMOVED_EVENT = "ProcessHistoryRemoved";
  
  /**
   * Gets the value of the CompleteDate field.
   * The date this process completed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCompleteDate();
  
  
  /**
   * Gets the value of the CreationDate field.
   * The date this process has been requested to start.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCreationDate();
  
  
  /**
   * Gets the value of the Description field.
   * Short description of a run.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the FailedOps field.
   * The number of operations that failed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getFailedOps();
  
  
  /**
   * Gets the value of the FailureReason field.
   * If not successful, the reason the process failed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFailureReason();
  
  
  /**
   * Gets the value of the LeaseId field.
   * The Id of the lease.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLeaseId();
  
  
  /**
   * Gets the value of the OpsPerformed field.
   * The total number of operations the process performed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getOpsPerformed();
  
  
  /**
   * Gets the value of the ProcessType field.
   * The process this entry refers to.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.BatchProcessType getProcessType();
  
  
  /**
   * Gets the value of the ProfilerData field.
   * Raw Profiler data
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.lang.Blob getProfilerData();
  
  
  /**
   * Gets the value of the ReturnValue field.
   * Return value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getReturnValue();
  
  
  /**
   * Gets the value of the ServerId field.
   * Server id.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getServerId();
  
  
  /**
   * Gets the value of the StartDate field.
   * The date this process was actually started.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartDate();
  
  
  /**
   * Gets the value of the InternalFailure field.
   * Whether the failure was internal.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isInternalFailure();
  
  
  /**
   * Gets the value of the NotificationSent field.
   * Completion Notification Sent
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isNotificationSent();
  
  
  /**
   * Gets the value of the RanToCompletion field.
   * Whether or not the process ran to completion, or failed or was interrupted.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isRanToCompletion();
  
  
  /**
   * Gets the value of the Scheduled field.
   * Whether this was a scheduled run
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isScheduled();
  
  
  /**
   * Sets the value of the CompleteDate field.
   */
  public void setCompleteDate(java.util.Date value);
  
  
  /**
   * Sets the value of the CreationDate field.
   */
  public void setCreationDate(java.util.Date value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the FailedOps field.
   */
  public void setFailedOps(java.lang.Integer value);
  
  
  /**
   * Sets the value of the FailureReason field.
   */
  public void setFailureReason(java.lang.String value);
  
  
  /**
   * Sets the value of the InternalFailure field.
   */
  public void setInternalFailure(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the LeaseId field.
   */
  public void setLeaseId(java.lang.String value);
  
  
  /**
   * Sets the value of the NotificationSent field.
   */
  public void setNotificationSent(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the OpsPerformed field.
   */
  public void setOpsPerformed(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ProcessType field.
   */
  public void setProcessType(typekey.BatchProcessType value);
  
  
  /**
   * Sets the value of the ProfilerData field.
   */
  public void setProfilerData(gw.lang.Blob value);
  
  
  /**
   * Sets the value of the RanToCompletion field.
   */
  public void setRanToCompletion(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ReturnValue field.
   */
  public void setReturnValue(java.lang.String value);
  
  
  /**
   * Sets the value of the Scheduled field.
   */
  public void setScheduled(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ServerId field.
   */
  public void setServerId(java.lang.String value);
  
  
  /**
   * Sets the value of the StartDate field.
   */
  public void setStartDate(java.util.Date value);
  
  
  
}