package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Group.eti;Group.eix;Group.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface GroupInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ValidatableInternal, com.guidewire._generated.entity.EventAwareInternal, com.guidewire.cc.domain.community.impl.GroupCoreExtMethods, com.guidewire.pl.domain.community.GroupPublicMethods, com.guidewire.pl.domain.community.impl.GroupInternalMethods, com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.RemoveCallback, com.guidewire.pl.system.bundle.UpdateCallback, gw.api.assignment.Assignee {
  java.lang.String GROUPADDED_EVENT = "GroupAdded";
  
  java.lang.String GROUPCHANGED_EVENT = "GroupChanged";
  
  java.lang.String GROUPREMOVED_EVENT = "GroupRemoved";
  
  /**
   * Adds the given element to the AssignableQueues array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToAssignableQueues(entity.AssignableQueue element);
  
  
  /**
   * Adds the given element to the Name_L10N_ARRAY array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToName_L10N_ARRAY(entity.Group_Name_L10N element);
  
  
  /**
   * Adds the given element to the ParentgroupArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToParentgroupArray(entity.Parentgroup element);
  
  
  /**
   * Adds the given element to the Regions array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRegions(entity.GroupRegion element);
  
  
  /**
   * Adds the given element to the Users array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToUsers(entity.GroupUser element);
  
  
  /**
   * Adds the given element to the VisibilityzoneArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToVisibilityzoneArray(entity.Visibilityzone element);
  
  
  /**
   * Gets the value of the AssignableQueues field.
   * Assignment queues associated with this group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AssignableQueue[] getAssignableQueues();
  
  
  /**
   * Gets the value of the GroupType field.
   * Type of group (describes its function).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.GroupType getGroupType();
  
  
  /**
   * Gets the value of the LoadFactor field.
   * Percentage value of normal workload to be given to this group. This is used for round-robin assignment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLoadFactor();
  
  
  /**
   * Gets the value of the Name field.
   * The group name; this must be unique.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the NameKanji field.
   * The group name in Kanji. Used only for Japanese and will be null otherwise.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNameKanji();
  
  
  /**
   * Gets the value of the Name_L10N_ARRAY field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group_Name_L10N[] getName_L10N_ARRAY();
  
  
  /**
   * Array association for partition Name_L10N_ARRAYByLanguage on array Name_L10N_ARRAY
   */
  public entity.Group_Name_L10N getName_L10N_ARRAYByLanguage(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property);
  
  
  /**
   * Gets the value of the Organization field.
   * The Organization that this group belongs to.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Organization getOrganization();
  
  
  public gw.pl.persistence.core.Key getOrganizationID();
  
  
  /**
   * Gets the value of the Parent field.
   * The group's parent group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getParent();
  
  
  public gw.pl.persistence.core.Key getParentID();
  
  
  /**
   * Gets the value of the ParentgroupArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Parentgroup[] getParentgroupArray();
  
  
  /**
   * Gets the value of the Regions field.
   * Regions associated with this group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.GroupRegion[] getRegions();
  
  
  /**
   * Gets the value of the SecurityZone field.
   * Security zone to which the group belongs.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SecurityZone getSecurityZone();
  
  
  public gw.pl.persistence.core.Key getSecurityZoneID();
  
  
  /**
   * Gets the value of the Supervisor field.
   * Supervisor of the group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getSupervisor();
  
  
  public gw.pl.persistence.core.Key getSupervisorID();
  
  
  /**
   * Gets the value of the Users field.
   * Users belonging to this group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.GroupUser[] getUsers();
  
  
  /**
   * Gets the value of the ValidationLevel field.
   * Validation level that this object passed (if any) before it was stored.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ValidationLevel getValidationLevel();
  
  
  /**
   * Gets the value of the VisibilityZone field.
   * Group that defines the visibility zone for this group. A visibility zone is defined by a direct child of the root group. The visibility zone of the root group will always be null.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getVisibilityZone();
  
  
  public gw.pl.persistence.core.Key getVisibilityZoneID();
  
  
  /**
   * Gets the value of the VisibilityzoneArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Visibilityzone[] getVisibilityzoneArray();
  
  
  /**
   * Gets the value of the WorldVisible field.
   * If true, this group is visible to all users, regardless of what groups they belong to.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isWorldVisible();
  
  
  /**
   * Removes the given element from the AssignableQueues array. This is achieved by marking the element for removal.
   */
  public void removeFromAssignableQueues(entity.AssignableQueue element);
  
  
  /**
   * Removes the given element from the AssignableQueues array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromAssignableQueues(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Name_L10N_ARRAY array. This is achieved by marking the element for removal.
   */
  public void removeFromName_L10N_ARRAY(entity.Group_Name_L10N element);
  
  
  /**
   * Removes the given element from the Name_L10N_ARRAY array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromName_L10N_ARRAY(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ParentgroupArray array. This is achieved by marking the element for removal.
   */
  public void removeFromParentgroupArray(entity.Parentgroup element);
  
  
  /**
   * Removes the given element from the ParentgroupArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromParentgroupArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Regions array. This is achieved by marking the element for removal.
   */
  public void removeFromRegions(entity.GroupRegion element);
  
  
  /**
   * Removes the given element from the Regions array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRegions(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Users array. This is achieved by marking the element for removal.
   */
  public void removeFromUsers(entity.GroupUser element);
  
  
  /**
   * Removes the given element from the Users array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromUsers(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the VisibilityzoneArray array. This is achieved by marking the element for removal.
   */
  public void removeFromVisibilityzoneArray(entity.Visibilityzone element);
  
  
  /**
   * Removes the given element from the VisibilityzoneArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromVisibilityzoneArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the AssignableQueues field.
   */
  public void setAssignableQueues(entity.AssignableQueue[] value);
  
  
  /**
   * Sets the value of the GroupType field.
   */
  public void setGroupType(typekey.GroupType value);
  
  
  /**
   * Sets the value of the LoadFactor field.
   */
  public void setLoadFactor(java.lang.Integer value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the NameKanji field.
   */
  public void setNameKanji(java.lang.String value);
  
  
  /**
   * Sets the value of the Name_L10N_ARRAY field.
   */
  public void setName_L10N_ARRAY(entity.Group_Name_L10N[] value);
  
  
  /**
   * Sets the value of the Organization field.
   */
  public void setOrganization(entity.Organization value);
  
  
  public void setOrganizationID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Parent field.
   */
  public void setParent(entity.Group value);
  
  
  public void setParentID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ParentgroupArray field.
   */
  public void setParentgroupArray(entity.Parentgroup[] value);
  
  
  /**
   * Sets the value of the Regions field.
   */
  public void setRegions(entity.GroupRegion[] value);
  
  
  /**
   * Sets the value of the SecurityZone field.
   */
  public void setSecurityZone(entity.SecurityZone value);
  
  
  public void setSecurityZoneID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Supervisor field.
   */
  public void setSupervisor(entity.User value);
  
  
  public void setSupervisorID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Users field.
   */
  public void setUsers(entity.GroupUser[] value);
  
  
  /**
   * Sets the value of the ValidationLevel field.
   */
  public void setValidationLevel(typekey.ValidationLevel value);
  
  
  /**
   * Sets the value of the VisibilityZone field.
   */
  public void setVisibilityZone(entity.Group value);
  
  
  public void setVisibilityZoneID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the VisibilityzoneArray field.
   */
  public void setVisibilityzoneArray(entity.Visibilityzone[] value);
  
  
  /**
   * Sets the value of the WorldVisible field.
   */
  public void setWorldVisible(java.lang.Boolean value);
  
  
  
}