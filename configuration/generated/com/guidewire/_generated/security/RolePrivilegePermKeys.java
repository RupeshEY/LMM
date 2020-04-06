package com.guidewire._generated.security;

import com.guidewire.pl.system.security.PermissionKey;
import com.guidewire.pl.system.security.StaticPermissionKey;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(comments = "security-config-app.xml;security-config-pl.xml;security-config.xml", date = "", value = "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
public class RolePrivilegePermKeys {
  public static final StaticPermissionKey CREATE = new StaticPermissionKey("create", entity.RolePrivilege.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("rolemanage").withDescription("Permission to create a new role-privilege mapping").build());
  
  public static final StaticPermissionKey EDIT = new StaticPermissionKey("edit", entity.RolePrivilege.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("rolemanage").withDescription("Permission to edit an existing role-privilege mapping").build());
  
  public static final StaticPermissionKey DELETE = new StaticPermissionKey("delete", entity.RolePrivilege.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("rolemanage").withDescription("Permission to delete a role-privilege mapping").build());
  
  public static List<PermissionKey> getPermissionKeys() {
    List<PermissionKey> permissionKeys = new ArrayList<>();
    permissionKeys.add(CREATE);
    permissionKeys.add(EDIT);
    permissionKeys.add(DELETE);
    return java.util.Collections.unmodifiableList(permissionKeys);
  }
  
  
}