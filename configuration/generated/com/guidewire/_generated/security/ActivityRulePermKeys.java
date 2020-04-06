package com.guidewire._generated.security;

import com.guidewire.pl.system.security.PermissionKey;
import com.guidewire.pl.system.security.StaticPermissionKey;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(comments = "security-config-app.xml;security-config-pl.xml;security-config.xml", date = "", value = "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
public class ActivityRulePermKeys {
  public static final StaticPermissionKey CREATE = new StaticPermissionKey("create", entity.ActivityRule.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("activityruleedit").build());
  
  public static final StaticPermissionKey EDIT = new StaticPermissionKey("edit", entity.ActivityRule.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("activityruleedit").build());
  
  public static final StaticPermissionKey DELETE = new StaticPermissionKey("delete", entity.ActivityRule.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("activityruleedit").build());
  
  public static final StaticPermissionKey VIEW = new StaticPermissionKey("view", entity.ActivityRule.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("activityruleview").build());
  
  public static final StaticPermissionKey IMPORT = new StaticPermissionKey("import", entity.ActivityRule.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("activityruleimport").build());
  
  public static final StaticPermissionKey APPROVE = new StaticPermissionKey("approve", entity.ActivityRule.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("activityruleapprove").build());
  
  public static final StaticPermissionKey DEPLOY = new StaticPermissionKey("deploy", entity.ActivityRule.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("activityruledeploy").build());
  
  public static List<PermissionKey> getPermissionKeys() {
    List<PermissionKey> permissionKeys = new ArrayList<>();
    permissionKeys.add(CREATE);
    permissionKeys.add(EDIT);
    permissionKeys.add(DELETE);
    permissionKeys.add(VIEW);
    permissionKeys.add(IMPORT);
    permissionKeys.add(APPROVE);
    permissionKeys.add(DEPLOY);
    return java.util.Collections.unmodifiableList(permissionKeys);
  }
  
  
}