package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "WorkflowStepStats.eti;WorkflowStepStats.eix;WorkflowStepStats.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface WorkflowStepStatsInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire.pl.domain.workflow.WorkflowStepStatsPublicMethods {
  /**
   * Gets the value of the ElapsedTimeMax field.
   * Maximum elapsed time spent processing any occurrence of this step, in millis.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getElapsedTimeMax();
  
  
  /**
   * Gets the value of the ElapsedTimeMean field.
   * Average elapsed time spent processing occurrences of this step, in millis.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getElapsedTimeMean();
  
  
  /**
   * Gets the value of the ElapsedTimeMin field.
   * Minimum elapsed time spent processing any occurrence of this step, in millis.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getElapsedTimeMin();
  
  
  /**
   * Gets the value of the ElapsedTimeStdDev field.
   * Standard deviation of elapsed time spent processing occurrences of this step, in millis.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getElapsedTimeStdDev();
  
  
  /**
   * Gets the value of the EndTime field.
   * End of the statistics aggregation period.  Statistics were computed from steps completing on or before this time.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEndTime();
  
  
  /**
   * Gets the value of the ExecTimeMean field.
   * Average system time spent actively processing occurrences of this step, in millis.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getExecTimeMean();
  
  
  /**
   * Gets the value of the ExecTimeMin field.
   * Minimum system time spent actively processing any occurrence of this step, in millis.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getExecTimeMin();
  
  
  /**
   * Gets the value of the ExecTimeStdDev field.
   * Standard deviation of system time spent actively processing occurrences of this step, in millis.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getExecTimeStdDev();
  
  
  /**
   * Gets the value of the Executions field.
   * Total number of steps that completed within the aggregation period.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getExecutions();
  
  
  /**
   * Gets the value of the ProcessVersion field.
   * Version of the workflow process used, if this uses an internal workflow
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getProcessVersion();
  
  
  /**
   * Gets the value of the ServerID field.
   * The app server ID.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getServerID();
  
  
  /**
   * Gets the value of the StartTime field.
   * Start of the statistics aggregation period.  Statistics were computed from steps completing after this time.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartTime();
  
  
  /**
   * Gets the value of the StepName field.
   * ID of the workflow step.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getStepName();
  
  
  /**
   * Gets the value of the WorkflowType field.
   * Type of the workflow.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Workflow getWorkflowType();
  
  
  /**
   * Gets the value of the execTimeMax field.
   * Maximum system time spent actively processing any occurrence of this step, in millis.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getexecTimeMax();
  
  
  /**
   * Sets the value of the ElapsedTimeMax field.
   */
  public void setElapsedTimeMax(java.lang.Long value);
  
  
  /**
   * Sets the value of the ElapsedTimeMean field.
   */
  public void setElapsedTimeMean(java.lang.Long value);
  
  
  /**
   * Sets the value of the ElapsedTimeMin field.
   */
  public void setElapsedTimeMin(java.lang.Long value);
  
  
  /**
   * Sets the value of the ElapsedTimeStdDev field.
   */
  public void setElapsedTimeStdDev(java.lang.Long value);
  
  
  /**
   * Sets the value of the EndTime field.
   */
  public void setEndTime(java.util.Date value);
  
  
  /**
   * Sets the value of the ExecTimeMean field.
   */
  public void setExecTimeMean(java.lang.Long value);
  
  
  /**
   * Sets the value of the ExecTimeMin field.
   */
  public void setExecTimeMin(java.lang.Long value);
  
  
  /**
   * Sets the value of the ExecTimeStdDev field.
   */
  public void setExecTimeStdDev(java.lang.Long value);
  
  
  /**
   * Sets the value of the Executions field.
   */
  public void setExecutions(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ProcessVersion field.
   */
  public void setProcessVersion(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ServerID field.
   */
  public void setServerID(java.lang.String value);
  
  
  /**
   * Sets the value of the StartTime field.
   */
  public void setStartTime(java.util.Date value);
  
  
  /**
   * Sets the value of the StepName field.
   */
  public void setStepName(java.lang.String value);
  
  
  /**
   * Sets the value of the WorkflowType field.
   */
  public void setWorkflowType(typekey.Workflow value);
  
  
  /**
   * Sets the value of the execTimeMax field.
   */
  public void setexecTimeMax(java.lang.Long value);
  
  
  
}