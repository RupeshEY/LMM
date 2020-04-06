package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Assignable.eti;Assignable.eix;Assignable.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface AssignableInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, com.guidewire.pl.domain.assignment.AssignablePublicMethods, com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods, com.guidewire.pl.system.entity.PermissionAssignableCheck {
  /**
   * Gets the value of the AssignedByUser field.
   * User who assigned this entity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getAssignedByUser();
  
  
  public gw.pl.persistence.core.Key getAssignedByUserID();
  
  
  /**
   * Gets the value of the AssignedGroup field.
   * Group to which this entity is assigned; null if none assigned
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getAssignedGroup();
  
  
  public gw.pl.persistence.core.Key getAssignedGroupID();
  
  
  /**
   * Gets the value of the AssignedQueue field.
   * Either the Queue to which this entity is assigned (if AssignmentStatus is 'assigned'), the Queue to which the system suggests assignment (if AssignmentStatus is 'manual'), or null if none assigned. Only one of AssignedUserID or AssignedQueueID should be non null.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AssignableQueue getAssignedQueue();
  
  
  public gw.pl.persistence.core.Key getAssignedQueueID();
  
  
  /**
   * Gets the value of the AssignedUser field.
   * Either the User to which this entity is assigned (if AssignmentStatus is 'assigned'), the User to which the system suggests assignment (if AssignmentStatus is 'manual'), or null if none assigned. Only one of AssignedUserID or AssignedQueueID should be non null.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getAssignedUser();
  
  
  public gw.pl.persistence.core.Key getAssignedUserID();
  
  
  /**
   * Gets the value of the AssignmentDate field.
   * Time when entity last assigned
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getAssignmentDate();
  
  
  /**
   * Gets the value of the AssignmentStatus field.
   * Typelist describing assignment status.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AssignmentStatus getAssignmentStatus();
  
  
  /**
   * Gets the value of the CloseDate field.
   * Date and time when this entity was closed. (Not applicable to all assignable entities)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCloseDate();
  
  
  /**
   * Gets the value of the PreviousGroup field.
   * Group to which this entity was previously assigned.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getPreviousGroup();
  
  
  public gw.pl.persistence.core.Key getPreviousGroupID();
  
  
  /**
   * Gets the value of the PreviousQueue field.
   * Queue to which this entity was previously assigned.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AssignableQueue getPreviousQueue();
  
  
  public gw.pl.persistence.core.Key getPreviousQueueID();
  
  
  /**
   * Gets the value of the PreviousUser field.
   * User to which this entity was previously assigned.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getPreviousUser();
  
  
  public gw.pl.persistence.core.Key getPreviousUserID();
  
  
  /**
   * Sets the value of the AssignedByUser field.
   */
  public void setAssignedByUser(entity.User value);
  
  
  public void setAssignedByUserID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the AssignedGroup field.
   */
  public void setAssignedGroup(entity.Group value);
  
  
  public void setAssignedGroupID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the AssignedQueue field.
   */
  public void setAssignedQueue(entity.AssignableQueue value);
  
  
  public void setAssignedQueueID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the AssignedUser field.
   */
  public void setAssignedUser(entity.User value);
  
  
  public void setAssignedUserID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the AssignmentDate field.
   */
  public void setAssignmentDate(java.util.Date value);
  
  
  /**
   * Sets the value of the AssignmentStatus field.
   */
  public void setAssignmentStatus(typekey.AssignmentStatus value);
  
  
  /**
   * Sets the value of the CloseDate field.
   */
  public void setCloseDate(java.util.Date value);
  
  
  /**
   * Sets the value of the PreviousGroup field.
   */
  public void setPreviousGroup(entity.Group value);
  
  
  public void setPreviousGroupID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the PreviousQueue field.
   */
  public void setPreviousQueue(entity.AssignableQueue value);
  
  
  public void setPreviousQueueID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the PreviousUser field.
   */
  public void setPreviousUser(entity.User value);
  
  
  public void setPreviousUserID(gw.pl.persistence.core.Key value);
  
  
  
}