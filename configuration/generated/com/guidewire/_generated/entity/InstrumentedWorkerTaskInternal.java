package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "InstrumentedWorkerTask.eti;InstrumentedWorkerTask.eix;InstrumentedWorkerTask.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface InstrumentedWorkerTaskInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire.commons.profiler.ProfilerDataSourceInternal, com.guidewire.pl.domain.workqueue.InstrumentedWorkerTaskPublicMethods, com.guidewire.pl.domain.workqueue.impl.InstrumentedWorkerTaskInternalMethods, com.guidewire.pl.system.entity.DoesNotValidateOnCommit {
  /**
   * Gets the value of the Cdcs field.
   * The number of exceptions caught during workitem processing.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getCdcs();
  
  
  /**
   * Gets the value of the ConsecutiveExceptions field.
   * Count of the number of consecutive work items that resulted in an exception.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getConsecutiveExceptions();
  
  
  /**
   * Gets the value of the CustomInstrumentationData field.
   * Optional custom instrumentation
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCustomInstrumentationData();
  
  
  /**
   * Gets the value of the EndTime field.
   * Timestamp when the instance was shutdown.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEndTime();
  
  
  /**
   * Gets the value of the Exceptions field.
   * The number of exceptions caught during workitem processing.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getExceptions();
  
  
  /**
   * Gets the value of the InstanceNumber field.
   * The instance number on this app server.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getInstanceNumber();
  
  
  /**
   * Gets the value of the InstrumentedWorkExecutorID field.
   * Executor instance that created this task.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getInstrumentedWorkExecutorID();
  
  
  /**
   * Gets the value of the ManagementElapsed field.
   * The number of milliseconds spent managing the work queue.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getManagementElapsed();
  
  
  /**
   * Gets the value of the OrphansAdopted field.
   * The number of orphaned workitems reclaimed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getOrphansAdopted();
  
  
  /**
   * Gets the value of the ProcessHistoryID field.
   * The writer batch job that created all workitem processed by this run.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getProcessHistoryID();
  
  
  /**
   * Gets the value of the ProfilerData field.
   * Raw Profiler data
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.lang.Blob getProfilerData();
  
  
  /**
   * Gets the value of the StartTime field.
   * Timestamp when the instance was started.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartTime();
  
  
  /**
   * Gets the value of the WorkElapsed field.
   * The number of milliseconds spent processing work items.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getWorkElapsed();
  
  
  /**
   * Gets the value of the WorkitemsCheckedOut field.
   * The number of workitems checked out.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getWorkitemsCheckedOut();
  
  
  /**
   * Gets the value of the WorkitemsFailed field.
   * The number of workitems marked as failed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getWorkitemsFailed();
  
  
  /**
   * Gets the value of the WorkitemsProcessed field.
   * The number of workitems processed successfully.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getWorkitemsProcessed();
  
  
  /**
   * Gets the value of the WorkitemsProcessedAfterCdc field.
   * The number of workitems processed after previous attempt failed with CDC.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getWorkitemsProcessedAfterCdc();
  
  
  /**
   * Gets the value of the WorkitemsProcessedAfterError field.
   * The number of workitems processed after previous attempt failed with some kind of error (including CDC).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getWorkitemsProcessedAfterError();
  
  
  /**
   * Gets the value of the WorkitemsSkipped field.
   * The number of workitems skipped.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getWorkitemsSkipped();
  
  
  /**
   * Gets the value of the RanToCompletion field.
   * Whether the worker batch ran to completion, or failed or was interrupted.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isRanToCompletion();
  
  
  /**
   * Sets the value of the Cdcs field.
   */
  public void setCdcs(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ConsecutiveExceptions field.
   */
  public void setConsecutiveExceptions(java.lang.Integer value);
  
  
  /**
   * Sets the value of the CustomInstrumentationData field.
   */
  public void setCustomInstrumentationData(java.lang.String value);
  
  
  /**
   * Sets the value of the EndTime field.
   */
  public void setEndTime(java.util.Date value);
  
  
  /**
   * Sets the value of the Exceptions field.
   */
  public void setExceptions(java.lang.Integer value);
  
  
  /**
   * Sets the value of the InstanceNumber field.
   */
  public void setInstanceNumber(java.lang.Integer value);
  
  
  /**
   * Sets the value of the InstrumentedWorkExecutorID field.
   */
  public void setInstrumentedWorkExecutorID(java.lang.Long value);
  
  
  /**
   * Sets the value of the ManagementElapsed field.
   */
  public void setManagementElapsed(java.lang.Long value);
  
  
  /**
   * Sets the value of the OrphansAdopted field.
   */
  public void setOrphansAdopted(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ProcessHistoryID field.
   */
  public void setProcessHistoryID(java.lang.Long value);
  
  
  /**
   * Sets the value of the ProfilerData field.
   */
  public void setProfilerData(gw.lang.Blob value);
  
  
  /**
   * Sets the value of the RanToCompletion field.
   */
  public void setRanToCompletion(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the StartTime field.
   */
  public void setStartTime(java.util.Date value);
  
  
  /**
   * Sets the value of the WorkElapsed field.
   */
  public void setWorkElapsed(java.lang.Long value);
  
  
  /**
   * Sets the value of the WorkitemsCheckedOut field.
   */
  public void setWorkitemsCheckedOut(java.lang.Integer value);
  
  
  /**
   * Sets the value of the WorkitemsFailed field.
   */
  public void setWorkitemsFailed(java.lang.Integer value);
  
  
  /**
   * Sets the value of the WorkitemsProcessed field.
   */
  public void setWorkitemsProcessed(java.lang.Integer value);
  
  
  /**
   * Sets the value of the WorkitemsProcessedAfterCdc field.
   */
  public void setWorkitemsProcessedAfterCdc(java.lang.Integer value);
  
  
  /**
   * Sets the value of the WorkitemsProcessedAfterError field.
   */
  public void setWorkitemsProcessedAfterError(java.lang.Integer value);
  
  
  /**
   * Sets the value of the WorkitemsSkipped field.
   */
  public void setWorkitemsSkipped(java.lang.Integer value);
  
  
  
}