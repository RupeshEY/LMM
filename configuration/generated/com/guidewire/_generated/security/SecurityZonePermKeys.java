package com.guidewire._generated.security;

import com.guidewire.pl.system.security.PermissionKey;
import com.guidewire.pl.system.security.StaticPermissionKey;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(comments = "security-config-app.xml;security-config-pl.xml;security-config.xml", date = "", value = "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
public class SecurityZonePermKeys {
  public static final StaticPermissionKey VIEW = new StaticPermissionKey("view", entity.SecurityZone.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("seczonemanage").withDescription("Permission to view a security zone").build());
  
  public static final StaticPermissionKey CREATE = new StaticPermissionKey("create", entity.SecurityZone.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("seczonemanage").withDescription("Permission to create a new security zone").build());
  
  public static final StaticPermissionKey EDIT = new StaticPermissionKey("edit", entity.SecurityZone.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("seczonemanage").withDescription("Permission to edit an existing security zone").build());
  
  public static final StaticPermissionKey DELETE = new StaticPermissionKey("delete", entity.SecurityZone.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("seczonemanage").withDescription("Permission to delete a security zone").build());
  
  public static List<PermissionKey> getPermissionKeys() {
    List<PermissionKey> permissionKeys = new ArrayList<>();
    permissionKeys.add(VIEW);
    permissionKeys.add(CREATE);
    permissionKeys.add(EDIT);
    permissionKeys.add(DELETE);
    return java.util.Collections.unmodifiableList(permissionKeys);
  }
  
  
}