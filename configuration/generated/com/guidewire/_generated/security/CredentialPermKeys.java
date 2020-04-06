package com.guidewire._generated.security;

import com.guidewire.pl.system.security.PermissionKey;
import com.guidewire.pl.system.security.StaticPermissionKey;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(comments = "security-config-app.xml;security-config-pl.xml;security-config.xml", date = "", value = "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
public class CredentialPermKeys {
  public static final StaticPermissionKey CREATE = new StaticPermissionKey("create", entity.Credential.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("usercreate").withDescription("Permission to create a new credential").build());
  
  public static final StaticPermissionKey EDIT = new StaticPermissionKey("edit", entity.Credential.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("useredit").withDescription("Permission to edit an existing credential.  Note that a user can always edit their own password").build());
  
  public static final StaticPermissionKey DELETE = new StaticPermissionKey("delete", entity.Credential.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("userdelete").withDescription("Permission to delete a credential").build());
  
  public static List<PermissionKey> getPermissionKeys() {
    List<PermissionKey> permissionKeys = new ArrayList<>();
    permissionKeys.add(CREATE);
    permissionKeys.add(EDIT);
    permissionKeys.add(DELETE);
    return java.util.Collections.unmodifiableList(permissionKeys);
  }
  
  
}