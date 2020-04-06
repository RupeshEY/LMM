package com.guidewire._generated.security;

import com.guidewire.pl.system.security.PermissionKey;
import com.guidewire.pl.system.security.StaticPermissionKey;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(comments = "security-config-app.xml;security-config-pl.xml;security-config.xml", date = "", value = "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
public class CatastrophePermKeys {
  public static final StaticPermissionKey CREATE = new StaticPermissionKey("create", entity.Catastrophe.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("catmanage").withDescription("Permission to create new catastrophes").build());
  
  public static final StaticPermissionKey DELETE = new StaticPermissionKey("delete", entity.Catastrophe.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("catmanage").withDescription("Permission to delete catastrophes").build());
  
  public static final StaticPermissionKey EDIT = new StaticPermissionKey("edit", entity.Catastrophe.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("catmanage").withDescription("Permission to edit existing catastrophes").build());
  
  public static final StaticPermissionKey VIEW = new StaticPermissionKey("view", entity.Catastrophe.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("catview").withDescription("Permission to view the catastrophe list and catastrophe details").build());
  
  public static List<PermissionKey> getPermissionKeys() {
    List<PermissionKey> permissionKeys = new ArrayList<>();
    permissionKeys.add(CREATE);
    permissionKeys.add(DELETE);
    permissionKeys.add(EDIT);
    permissionKeys.add(VIEW);
    return java.util.Collections.unmodifiableList(permissionKeys);
  }
  
  
}