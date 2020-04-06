package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Workflow.eti;Workflow.eix;Workflow.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface WorkflowInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire.pl.domain.workflow.WorkflowPublicMethods, com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods, com.guidewire.pl.system.bundle.CommitCallback {
  /**
   * Adds the given element to the Activities array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToActivities(entity.Activity element);
  
  
  /**
   * Adds the given element to the Log array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToLog(entity.WorkflowLogEntry element);
  
  
  /**
   * Adds the given element to the SubWorkflowsArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToSubWorkflowsArray(entity.SubWorkflows element);
  
  
  /**
   * Gets the value of the ActiveState field.
   * Specific state of this workflow if active (e.g. running, waitmanual, waitactivity).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.WorkflowActiveState getActiveState();
  
  
  /**
   * Gets the value of the Activities field.
   * Active activities on this workflow.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Activity[] getActivities();
  
  
  /**
   * Gets the value of the Caller field.
   * What workflow called this workflow
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Workflow getCaller();
  
  
  public gw.pl.persistence.core.Key getCallerID();
  
  
  /**
   * Gets the value of the CurrentAction field.
   * What action is the Workflow currently trying to take?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.WorkflowActionType getCurrentAction();
  
  
  /**
   * Gets the value of the CurrentBranch field.
   * ID of the branch the workflow is currently trying to execute.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCurrentBranch();
  
  
  /**
   * Gets the value of the CurrentStep field.
   * ID of the workflow's current step.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCurrentStep();
  
  
  /**
   * Gets the value of the EnteredStep field.
   * Time when the Workflow entered the current step
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEnteredStep();
  
  
  /**
   * Gets the value of the ForceTimeoutBranch field.
   * ID of the next workflow timeout branch to take.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getForceTimeoutBranch();
  
  
  /**
   * Gets the value of the Handler field.
   * What infrastructure handles this Workflow?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.WorkflowHandler getHandler();
  
  
  /**
   * Gets the value of the Log field.
   * Log of what work this Workflow has performed
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.WorkflowLogEntry[] getLog();
  
  
  /**
   * Gets the value of the LogEntryCounter field.
   * Counter for assigning a sort order to log entries
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLogEntryCounter();
  
  
  /**
   * Gets the value of the Message field.
   * Integration message associated with this workflow
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Message getMessage();
  
  
  /**
   * Gets the value of the MessageHistoryID field.
   * Completed integration message associated with this workflow
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getMessageHistoryID();
  
  
  public gw.pl.persistence.core.Key getMessageID();
  
  
  /**
   * Gets the value of the PreviousStep field.
   * ID of the step the workflow was on BEFORE the current step.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPreviousStep();
  
  
  /**
   * Gets the value of the ProcessVersion field.
   * Version of the workflow process used, if this uses an internal workflow
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getProcessVersion();
  
  
  /**
   * Gets the value of the State field.
   * State of this workflow (e.g., 'started', 'completed', etc.)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.WorkflowState getState();
  
  
  /**
   * Gets the value of the StepExecTime field.
   * Total system time spent actively processing the current step, in millis.  Does not include time spent waiting on triggers, activities, or timeouts
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getStepExecTime();
  
  
  /**
   * Gets the value of the SubWorkflowsArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SubWorkflows[] getSubWorkflowsArray();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Workflow getSubtype();
  
  
  /**
   * Gets the value of the TestTime field.
   * What time the Workflow thinks it is
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getTestTime();
  
  
  /**
   * Gets the value of the TimeoutTime field.
   * Date/time when current step will time out.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getTimeoutTime();
  
  
  /**
   * Gets the value of the TriggerInvoked field.
   * Marks the key of a Trigger that was invoked, or null
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.WorkflowTriggerKey getTriggerInvoked();
  
  
  /**
   * Removes the given element from the Activities array. This is achieved by marking the element for removal.
   */
  public void removeFromActivities(entity.Activity element);
  
  
  /**
   * Removes the given element from the Activities array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromActivities(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Log array. This is achieved by marking the element for removal.
   */
  public void removeFromLog(entity.WorkflowLogEntry element);
  
  
  /**
   * Removes the given element from the Log array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromLog(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the SubWorkflowsArray array. This is achieved by marking the element for removal.
   */
  public void removeFromSubWorkflowsArray(entity.SubWorkflows element);
  
  
  /**
   * Removes the given element from the SubWorkflowsArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromSubWorkflowsArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the ActiveState field.
   */
  public void setActiveState(typekey.WorkflowActiveState value);
  
  
  /**
   * Sets the value of the Activities field.
   */
  public void setActivities(entity.Activity[] value);
  
  
  /**
   * Sets the value of the Caller field.
   */
  public void setCaller(entity.Workflow value);
  
  
  public void setCallerID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the CurrentAction field.
   */
  public void setCurrentAction(typekey.WorkflowActionType value);
  
  
  /**
   * Sets the value of the CurrentBranch field.
   */
  public void setCurrentBranch(java.lang.String value);
  
  
  /**
   * Sets the value of the CurrentStep field.
   */
  public void setCurrentStep(java.lang.String value);
  
  
  /**
   * Sets the value of the EnteredStep field.
   */
  public void setEnteredStep(java.util.Date value);
  
  
  /**
   * Sets the value of the ForceTimeoutBranch field.
   */
  public void setForceTimeoutBranch(java.lang.String value);
  
  
  /**
   * Sets the value of the Handler field.
   */
  public void setHandler(typekey.WorkflowHandler value);
  
  
  /**
   * Sets the value of the Log field.
   */
  public void setLog(entity.WorkflowLogEntry[] value);
  
  
  /**
   * Sets the value of the LogEntryCounter field.
   */
  public void setLogEntryCounter(java.lang.Integer value);
  
  
  /**
   * Sets the value of the Message field.
   */
  public void setMessage(entity.Message value);
  
  
  /**
   * Sets the value of the MessageHistoryID field.
   */
  public void setMessageHistoryID(java.lang.Long value);
  
  
  public void setMessageID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the PreviousStep field.
   */
  public void setPreviousStep(java.lang.String value);
  
  
  /**
   * Sets the value of the ProcessVersion field.
   */
  public void setProcessVersion(java.lang.Integer value);
  
  
  /**
   * Sets the value of the State field.
   */
  public void setState(typekey.WorkflowState value);
  
  
  /**
   * Sets the value of the StepExecTime field.
   */
  public void setStepExecTime(java.lang.Long value);
  
  
  /**
   * Sets the value of the SubWorkflowsArray field.
   */
  public void setSubWorkflowsArray(entity.SubWorkflows[] value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.Workflow value);
  
  
  /**
   * Sets the value of the TestTime field.
   */
  public void setTestTime(java.util.Date value);
  
  
  /**
   * Sets the value of the TimeoutTime field.
   */
  public void setTimeoutTime(java.util.Date value);
  
  
  /**
   * Sets the value of the TriggerInvoked field.
   */
  public void setTriggerInvoked(typekey.WorkflowTriggerKey value);
  
  
  
}