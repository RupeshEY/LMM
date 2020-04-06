package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "SuperviseesCache.eti;SuperviseesCache.eix;SuperviseesCache.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface SuperviseesCacheInternal extends com.guidewire._generated.entity.EditableInternal, com.guidewire.cc.domain.community.impl.SuperviseesCacheInternal, gw.cc.community.entity.SuperviseesCache {
  /**
   * Adds the given element to the SupervisedGroups array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToSupervisedGroups(entity.SupervisedGroup element);
  
  
  /**
   * Adds the given element to the SupervisedUsers array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToSupervisedUsers(entity.SupervisedUser element);
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the SupervisedGroupFP field.
   * Fingerprint of the currently cached supervised groups
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSupervisedGroupFP();
  
  
  /**
   * Gets the value of the SupervisedGroups field.
   * Cache of supervised groups
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SupervisedGroup[] getSupervisedGroups();
  
  
  /**
   * Gets the value of the SupervisedUserFP field.
   * Fingerprint of the currently cached supervised users
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSupervisedUserFP();
  
  
  /**
   * Gets the value of the SupervisedUsers field.
   * Cache of supervised users
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SupervisedUser[] getSupervisedUsers();
  
  
  /**
   * Gets the value of the User field.
   * Owner of this cache
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getUser();
  
  
  public gw.pl.persistence.core.Key getUserID();
  
  
  /**
   * Removes the given element from the SupervisedGroups array. This is achieved by marking the element for removal.
   */
  public void removeFromSupervisedGroups(entity.SupervisedGroup element);
  
  
  /**
   * Removes the given element from the SupervisedGroups array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromSupervisedGroups(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the SupervisedUsers array. This is achieved by marking the element for removal.
   */
  public void removeFromSupervisedUsers(entity.SupervisedUser element);
  
  
  /**
   * Removes the given element from the SupervisedUsers array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromSupervisedUsers(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the SupervisedGroupFP field.
   */
  public void setSupervisedGroupFP(java.lang.String value);
  
  
  /**
   * Sets the value of the SupervisedGroups field.
   */
  public void setSupervisedGroups(entity.SupervisedGroup[] value);
  
  
  /**
   * Sets the value of the SupervisedUserFP field.
   */
  public void setSupervisedUserFP(java.lang.String value);
  
  
  /**
   * Sets the value of the SupervisedUsers field.
   */
  public void setSupervisedUsers(entity.SupervisedUser[] value);
  
  
  /**
   * Sets the value of the User field.
   */
  public void setUser(entity.User value);
  
  
  public void setUserID(gw.pl.persistence.core.Key value);
  
  
  
}