package com.guidewire._generated.security;

import com.guidewire.pl.system.security.PermissionKey;
import com.guidewire.pl.system.security.StaticPermissionKey;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(comments = "security-config-app.xml;security-config-pl.xml;security-config.xml", date = "", value = "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
public class ScriptParameterPermKeys {
  public static final StaticPermissionKey VIEW = new StaticPermissionKey("view", entity.ScriptParameter.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("scrprmview").withDescription("Permission to view the script parameter list and script parameter details").build());
  
  public static final StaticPermissionKey CREATE = new StaticPermissionKey("create", entity.ScriptParameter.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("scrprmmanage").withDescription("Permission to create new script parameters").build());
  
  public static final StaticPermissionKey EDIT = new StaticPermissionKey("edit", entity.ScriptParameter.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("scrprmmanage").withDescription("Permission to edit existing script parameters").build());
  
  public static final StaticPermissionKey DELETE = new StaticPermissionKey("delete", entity.ScriptParameter.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("scrprmmanage").withDescription("Permission to delete script parameters").build());
  
  public static List<PermissionKey> getPermissionKeys() {
    List<PermissionKey> permissionKeys = new ArrayList<>();
    permissionKeys.add(VIEW);
    permissionKeys.add(CREATE);
    permissionKeys.add(EDIT);
    permissionKeys.add(DELETE);
    return java.util.Collections.unmodifiableList(permissionKeys);
  }
  
  
}