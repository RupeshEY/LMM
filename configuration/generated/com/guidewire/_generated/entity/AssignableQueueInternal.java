package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AssignableQueue.eti;AssignableQueue.eix;AssignableQueue.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface AssignableQueueInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire.pl.domain.assignment.AssignableQueuePublicMethods, com.guidewire.pl.domain.assignment.impl.AssignableQueueInternalMethods, gw.api.assignment.Assignee {
  /**
   * Gets the value of the Description field.
   * The description of what this queue is for.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the Group field.
   * The group to which the queue belongs.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getGroup();
  
  
  public gw.pl.persistence.core.Key getGroupID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the LockingColumn field.
   * Meaningless column for locking
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLockingColumn();
  
  
  /**
   * Gets the value of the Name field.
   * The name of this queue.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the SubGroupVisible field.
   * If true the queue is visible from sub-groups of the group to which it belongs.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isSubGroupVisible();
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the Group field.
   */
  public void setGroup(entity.Group value);
  
  
  public void setGroupID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the LockingColumn field.
   */
  public void setLockingColumn(java.lang.Integer value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the SubGroupVisible field.
   */
  public void setSubGroupVisible(java.lang.Boolean value);
  
  
  
}