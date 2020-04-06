package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "WorkflowSearchCriteria.eti;WorkflowSearchCriteria.eix;WorkflowSearchCriteria.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface WorkflowSearchCriteriaInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.pl.domain.workflow.WorkflowSearchCriteriaPublicMethods, com.guidewire.pl.domain.workflow.impl.WorkflowSearchCriteriaInternalMethods, java.io.Serializable {
  /**
   * Gets the value of the ActiveState field.
   * The specific state of the workflow if it's active.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.WorkflowActiveState getActiveState();
  
  
  /**
   * Gets the value of the CurrentStep field.
   * Name of the current step the workflow is on.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCurrentStep();
  
  
  /**
   * Gets the value of the Handler field.
   * What infrastructure component is handling the workflow?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.WorkflowHandler getHandler();
  
  
  /**
   * Gets the value of the Parent field.
   * The workflow's parent workflow.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Workflow getParent();
  
  
  public gw.pl.persistence.core.Key getParentID();
  
  
  /**
   * Gets the value of the ProcessVersion field.
   * The version number of the workflow definition.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getProcessVersion();
  
  
  /**
   * Gets the value of the StartDateFrom field.
   * Start date lower bound.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartDateFrom();
  
  
  /**
   * Gets the value of the StartDateTo field.
   * Start date upper bound.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartDateTo();
  
  
  /**
   * Gets the value of the State field.
   * The workflow's current state.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.WorkflowState getState();
  
  
  /**
   * Gets the value of the UpdateDateFrom field.
   * Update date lower bound.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getUpdateDateFrom();
  
  
  /**
   * Gets the value of the UpdateDateTo field.
   * Update date upper bound.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getUpdateDateTo();
  
  
  /**
   * Gets the value of the Workflowtype field.
   * The type of the workflow.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Workflow getWorkflowtype();
  
  
  /**
   * Gets the value of the CheckedOut field.
   * Whether this workflows work item is checked out.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCheckedOut();
  
  
  /**
   * Sets the value of the ActiveState field.
   */
  public void setActiveState(typekey.WorkflowActiveState value);
  
  
  /**
   * Sets the value of the CheckedOut field.
   */
  public void setCheckedOut(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the CurrentStep field.
   */
  public void setCurrentStep(java.lang.String value);
  
  
  /**
   * Sets the value of the Handler field.
   */
  public void setHandler(typekey.WorkflowHandler value);
  
  
  /**
   * Sets the value of the Parent field.
   */
  public void setParent(entity.Workflow value);
  
  
  public void setParentID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ProcessVersion field.
   */
  public void setProcessVersion(java.lang.Integer value);
  
  
  /**
   * Sets the value of the StartDateFrom field.
   */
  public void setStartDateFrom(java.util.Date value);
  
  
  /**
   * Sets the value of the StartDateTo field.
   */
  public void setStartDateTo(java.util.Date value);
  
  
  /**
   * Sets the value of the State field.
   */
  public void setState(typekey.WorkflowState value);
  
  
  /**
   * Sets the value of the UpdateDateFrom field.
   */
  public void setUpdateDateFrom(java.util.Date value);
  
  
  /**
   * Sets the value of the UpdateDateTo field.
   */
  public void setUpdateDateTo(java.util.Date value);
  
  
  /**
   * Sets the value of the Workflowtype field.
   */
  public void setWorkflowtype(typekey.Workflow value);
  
  
  
}