package com.guidewire._generated.security;

import com.guidewire.pl.system.security.PermissionKey;
import com.guidewire.pl.system.security.StaticPermissionKey;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(comments = "security-config-app.xml;security-config-pl.xml;security-config.xml", date = "", value = "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
public class ClaimMetricLimitPermKeys {
  public static final StaticPermissionKey CREATE = new StaticPermissionKey("create", entity.ClaimMetricLimit.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("metriclimitmanage").build());
  
  public static final StaticPermissionKey VIEW = new StaticPermissionKey("view", entity.ClaimMetricLimit.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("metriclimitmanage").build());
  
  public static final StaticPermissionKey EDIT = new StaticPermissionKey("edit", entity.ClaimMetricLimit.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("metriclimitmanage").build());
  
  public static final StaticPermissionKey DELETE = new StaticPermissionKey("delete", entity.ClaimMetricLimit.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("metriclimitmanage").build());
  
  public static List<PermissionKey> getPermissionKeys() {
    List<PermissionKey> permissionKeys = new ArrayList<>();
    permissionKeys.add(CREATE);
    permissionKeys.add(VIEW);
    permissionKeys.add(EDIT);
    permissionKeys.add(DELETE);
    return java.util.Collections.unmodifiableList(permissionKeys);
  }
  
  
}