package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "GroupUser.eti;GroupUser.eix;GroupUser.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface GroupUserInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.EventAwareInternal, com.guidewire.pl.domain.community.GroupUserPublicMethods {
  java.lang.String GROUPUSERADDED_EVENT = "GroupUserAdded";
  
  java.lang.String GROUPUSERCHANGED_EVENT = "GroupUserChanged";
  
  java.lang.String GROUPUSERREMOVED_EVENT = "GroupUserRemoved";
  
  /**
   * Gets the value of the Group field.
   * The associated group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getGroup();
  
  
  public gw.pl.persistence.core.Key getGroupID();
  
  
  /**
   * Gets the value of the GroupUserWorkload field.
   * Assigned workload information for this group user
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.GroupUserWorkload getGroupUserWorkload();
  
  
  public gw.pl.persistence.core.Key getGroupUserWorkloadID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the LoadFactor field.
   * Percentage value of normal workload to be given to this user in this group. This is used for round-robin assignment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLoadFactor();
  
  
  /**
   * Gets the value of the LoadFactorType field.
   * Type of load factor privileges the user has.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LoadFactorType getLoadFactorType();
  
  
  /**
   * Gets the value of the TextField1 field.
   * General-purpose text field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTextField1();
  
  
  /**
   * Gets the value of the TextField2 field.
   * General-purpose text field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTextField2();
  
  
  /**
   * Gets the value of the TextField3 field.
   * General-purpose text field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTextField3();
  
  
  /**
   * Gets the value of the User field.
   * The associated user.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getUser();
  
  
  public gw.pl.persistence.core.Key getUserID();
  
  
  /**
   * Gets the value of the Manager field.
   * Flag indicating whether the user has permission to see activity within the group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isManager();
  
  
  /**
   * Gets the value of the Member field.
   * Flag indicating whether the user is a working member of the group (for purposes of work assignment, for example), as opposed to simply being associated with the group as a manager or other auxiliary person.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isMember();
  
  
  /**
   * Sets the value of the Group field.
   */
  public void setGroup(entity.Group value);
  
  
  public void setGroupID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the GroupUserWorkload field.
   */
  public void setGroupUserWorkload(entity.GroupUserWorkload value);
  
  
  public void setGroupUserWorkloadID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the LoadFactor field.
   */
  public void setLoadFactor(java.lang.Integer value);
  
  
  /**
   * Sets the value of the LoadFactorType field.
   */
  public void setLoadFactorType(typekey.LoadFactorType value);
  
  
  /**
   * Sets the value of the Manager field.
   */
  public void setManager(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Member field.
   */
  public void setMember(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the TextField1 field.
   */
  public void setTextField1(java.lang.String value);
  
  
  /**
   * Sets the value of the TextField2 field.
   */
  public void setTextField2(java.lang.String value);
  
  
  /**
   * Sets the value of the TextField3 field.
   */
  public void setTextField3(java.lang.String value);
  
  
  /**
   * Sets the value of the User field.
   */
  public void setUser(entity.User value);
  
  
  public void setUserID(gw.pl.persistence.core.Key value);
  
  
  
}