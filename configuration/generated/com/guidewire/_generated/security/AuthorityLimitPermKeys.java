package com.guidewire._generated.security;

import com.guidewire.pl.system.security.PermissionKey;
import com.guidewire.pl.system.security.StaticPermissionKey;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(comments = "security-config-app.xml;security-config-pl.xml;security-config.xml", date = "", value = "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
public class AuthorityLimitPermKeys {
  public static final StaticPermissionKey CREATE = new StaticPermissionKey("create", entity.AuthorityLimit.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("usergrantauth").withDescription("Permission to create a new authority limit").build());
  
  public static final StaticPermissionKey DELETE = new StaticPermissionKey("delete", entity.AuthorityLimit.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("usergrantauth").withDescription("Permission to delete an authority limit").build());
  
  public static final StaticPermissionKey EDIT = new StaticPermissionKey("edit", entity.AuthorityLimit.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("usergrantauth").withDescription("Permission to edit an existing authority limit").build());
  
  public static List<PermissionKey> getPermissionKeys() {
    List<PermissionKey> permissionKeys = new ArrayList<>();
    permissionKeys.add(CREATE);
    permissionKeys.add(DELETE);
    permissionKeys.add(EDIT);
    return java.util.Collections.unmodifiableList(permissionKeys);
  }
  
  
}