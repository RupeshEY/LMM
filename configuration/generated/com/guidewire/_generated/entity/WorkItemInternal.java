package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "WorkItem.eti;WorkItem.eix;WorkItem.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface WorkItemInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, com.guidewire.pl.domain.workqueue.WorkItemPublicMethods, com.guidewire.pl.domain.workqueue.impl.WorkItemInternalMethods {
  /**
   * Gets the value of the Attempts field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getAttempts();
  
  
  /**
   * Gets the value of the AvailableSince field.
   * The time after which the work item can be tried. Must be null on failed work items
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getAvailableSince();
  
  
  /**
   * Gets the value of the CheckedOutBy field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCheckedOutBy();
  
  
  /**
   * Gets the value of the CreationTime field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCreationTime();
  
  
  /**
   * Gets the value of the Exception field.
   * Stack trace of the exception
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getException();
  
  
  /**
   * Gets the value of the LastUpdateTime field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getLastUpdateTime();
  
  
  /**
   * Gets the value of the Priority field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getPriority();
  
  
  /**
   * Gets the value of the ProcessHistoryID field.
   * The writer batch job that created this workitem (ProcessHistory).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getProcessHistoryID();
  
  
  /**
   * Gets the value of the Status field.
   * Status of this workitem.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.WorkItemStatusType getStatus();
  
  
  /**
   * Sets the value of the Attempts field.
   */
  public void setAttempts(java.lang.Integer value);
  
  
  /**
   * Sets the value of the AvailableSince field.
   */
  public void setAvailableSince(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the CheckedOutBy field.
   */
  public void setCheckedOutBy(java.lang.String value);
  
  
  /**
   * Sets the value of the CreationTime field.
   */
  public void setCreationTime(java.util.Date value);
  
  
  /**
   * Sets the value of the Exception field.
   */
  public void setException(java.lang.String value);
  
  
  /**
   * Sets the value of the LastUpdateTime field.
   */
  public void setLastUpdateTime(java.util.Date value);
  
  
  /**
   * Sets the value of the Priority field.
   */
  public void setPriority(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ProcessHistoryID field.
   */
  public void setProcessHistoryID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Status field.
   */
  public void setStatus(typekey.WorkItemStatusType value);
  
  
  
}