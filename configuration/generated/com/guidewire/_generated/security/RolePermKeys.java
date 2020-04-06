package com.guidewire._generated.security;

import com.guidewire.pl.system.security.OptionalObjectPermissionKey;
import com.guidewire.pl.system.security.PermissionKey;
import com.guidewire.pl.system.security.StaticPermissionKey;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(comments = "security-config-app.xml;security-config-pl.xml;security-config.xml", date = "", value = "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
public class RolePermKeys {
  public static final OptionalObjectPermissionKey VIEW = new OptionalObjectPermissionKey("view", entity.Role.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("roleview").withDescription("Permission to view the list of roles or a role's details").build());
  
  public static final StaticPermissionKey CREATE = new StaticPermissionKey("create", entity.Role.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("rolemanage").withDescription("Permission to create a new role").build());
  
  public static final OptionalObjectPermissionKey EDIT = new OptionalObjectPermissionKey("edit", entity.Role.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("rolemanage").withDescription("Permission to edit an existing role").build());
  
  public static final OptionalObjectPermissionKey DELETE = new OptionalObjectPermissionKey("delete", entity.Role.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("rolemanage").withDescription("Permission to delete a role").build());
  
  public static List<PermissionKey> getPermissionKeys() {
    List<PermissionKey> permissionKeys = new ArrayList<>();
    permissionKeys.add(VIEW);
    permissionKeys.add(CREATE);
    permissionKeys.add(EDIT);
    permissionKeys.add(DELETE);
    return java.util.Collections.unmodifiableList(permissionKeys);
  }
  
  
}