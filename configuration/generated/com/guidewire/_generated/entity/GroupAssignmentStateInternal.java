package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "GroupAssignmentState.eti;GroupAssignmentState.eix;GroupAssignmentState.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface GroupAssignmentStateInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.LastAssignedUserContainerBaseInternal, com.guidewire._generated.entity.LastAssignedUserContainerInternal {
  /**
   * Adds the given element to the Users array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToUsers(entity.GroupUserAssignmentState element);
  
  
  /**
   * Gets the value of the ActivityLoad field.
   * The current load of the group for activities.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getActivityLoad();
  
  
  /**
   * Gets the value of the ClaimLoad field.
   * The current load of the group for claims.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getClaimLoad();
  
  
  /**
   * Gets the value of the ExposureLoad field.
   * The current load of the group for exposures.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getExposureLoad();
  
  
  /**
   * Gets the value of the Group field.
   * The group this state is tracking.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getGroup();
  
  
  public gw.pl.persistence.core.Key getGroupID();
  
  
  /**
   * Gets the value of the GroupType field.
   * The group type this state is tracking.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.GroupType getGroupType();
  
  
  /**
   * Gets the value of the LockingColumn field.
   * Meaningless column for locking
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLockingColumn();
  
  
  /**
   * Gets the value of the MatterLoad field.
   * The current load of the group for matters.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getMatterLoad();
  
  
  /**
   * Gets the value of the ReviewLoad field.
   * The current load of the group for assignment review activities.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getReviewLoad();
  
  
  /**
   * Gets the value of the ServiceRequestLoad field.
   * The current load of the group for service requests.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getServiceRequestLoad();
  
  
  /**
   * Gets the value of the SubrogationLoad field.
   * The current load of the group for subrogations.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSubrogationLoad();
  
  
  /**
   * Gets the value of the Users field.
   * Users belonging to this group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.GroupUserAssignmentState[] getUsers();
  
  
  /**
   * Gets the value of the IncludeSubGroups field.
   * Is this assignment state for just this group, or does it include the sub groups as well.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIncludeSubGroups();
  
  
  /**
   * Removes the given element from the Users array. This is achieved by marking the element for removal.
   */
  public void removeFromUsers(entity.GroupUserAssignmentState element);
  
  
  /**
   * Removes the given element from the Users array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromUsers(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the ActivityLoad field.
   */
  public void setActivityLoad(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ClaimLoad field.
   */
  public void setClaimLoad(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ExposureLoad field.
   */
  public void setExposureLoad(java.lang.Integer value);
  
  
  /**
   * Sets the value of the Group field.
   */
  public void setGroup(entity.Group value);
  
  
  public void setGroupID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the GroupType field.
   */
  public void setGroupType(typekey.GroupType value);
  
  
  /**
   * Sets the value of the IncludeSubGroups field.
   */
  public void setIncludeSubGroups(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the LockingColumn field.
   */
  public void setLockingColumn(java.lang.Integer value);
  
  
  /**
   * Sets the value of the MatterLoad field.
   */
  public void setMatterLoad(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ReviewLoad field.
   */
  public void setReviewLoad(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ServiceRequestLoad field.
   */
  public void setServiceRequestLoad(java.lang.Integer value);
  
  
  /**
   * Sets the value of the SubrogationLoad field.
   */
  public void setSubrogationLoad(java.lang.Integer value);
  
  
  /**
   * Sets the value of the Users field.
   */
  public void setUsers(entity.GroupUserAssignmentState[] value);
  
  
  
}