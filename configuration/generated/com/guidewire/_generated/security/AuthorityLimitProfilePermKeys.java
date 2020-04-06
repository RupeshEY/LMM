package com.guidewire._generated.security;

import com.guidewire.pl.system.security.PermissionKey;
import com.guidewire.pl.system.security.StaticPermissionKey;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(comments = "security-config-app.xml;security-config-pl.xml;security-config.xml", date = "", value = "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
public class AuthorityLimitProfilePermKeys {
  public static final StaticPermissionKey CREATE = new StaticPermissionKey("create", entity.AuthorityLimitProfile.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("alpmanage").withDescription("Permission to create a new authority limit profile").build());
  
  public static final StaticPermissionKey DELETE = new StaticPermissionKey("delete", entity.AuthorityLimitProfile.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("alpmanage").withDescription("Permission to delete an authority limit profile").build());
  
  public static final StaticPermissionKey EDIT = new StaticPermissionKey("edit", entity.AuthorityLimitProfile.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("alpmanage").withDescription("Permission to edit an existing authority limit profile").build());
  
  public static final StaticPermissionKey VIEW = new StaticPermissionKey("view", entity.AuthorityLimitProfile.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("alpview").withDescription("Permission to view authority limit profiles").build());
  
  public static List<PermissionKey> getPermissionKeys() {
    List<PermissionKey> permissionKeys = new ArrayList<>();
    permissionKeys.add(CREATE);
    permissionKeys.add(DELETE);
    permissionKeys.add(EDIT);
    permissionKeys.add(VIEW);
    return java.util.Collections.unmodifiableList(permissionKeys);
  }
  
  
}