package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "UserRole.eti;UserRole.eix;UserRole.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface UserRoleInternal extends com.guidewire._generated.entity.VersionableInternal {
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Role field.
   * Security role granted to the user.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Role getRole();
  
  
  public gw.pl.persistence.core.Key getRoleID();
  
  
  /**
   * Gets the value of the User field.
   * Parent user.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getUser();
  
  
  public gw.pl.persistence.core.Key getUserID();
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Role field.
   */
  public void setRole(entity.Role value);
  
  
  public void setRoleID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the User field.
   */
  public void setUser(entity.User value);
  
  
  public void setUserID(gw.pl.persistence.core.Key value);
  
  
  
}