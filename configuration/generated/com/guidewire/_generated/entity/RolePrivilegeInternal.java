package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RolePrivilege.eti;RolePrivilege.eix;RolePrivilege.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RolePrivilegeInternal extends com.guidewire._generated.entity.VersionableInternal {
  /**
   * Gets the value of the Permission field.
   * Permission granted by the parent role.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SystemPermissionType getPermission();
  
  
  /**
   * Gets the value of the Role field.
   * The parent role.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Role getRole();
  
  
  public gw.pl.persistence.core.Key getRoleID();
  
  
  /**
   * Sets the value of the Permission field.
   */
  public void setPermission(typekey.SystemPermissionType value);
  
  
  /**
   * Sets the value of the Role field.
   */
  public void setRole(entity.Role value);
  
  
  public void setRoleID(gw.pl.persistence.core.Key value);
  
  
  
}