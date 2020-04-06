package com.guidewire._generated.security;

import com.guidewire.pl.system.security.PermissionKey;
import com.guidewire.pl.system.security.StaticPermissionKey;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(comments = "security-config-app.xml;security-config-pl.xml;security-config.xml", date = "", value = "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
public class ClaimAssociationPermKeys {
  public static final StaticPermissionKey DELETE = new StaticPermissionKey("delete", entity.ClaimAssociation.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("assocmanage").withDescription("Permission to delete an association from a claim").build());
  
  public static final StaticPermissionKey EDIT = new StaticPermissionKey("edit", entity.ClaimAssociation.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("assocmanage").withDescription("Permission to edit an existing association on a claim").build());
  
  public static final StaticPermissionKey VIEW = new StaticPermissionKey("view", entity.ClaimAssociation.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("assocview").withDescription("Permission to view the associations on a claim or details on one association").build());
  
  public static List<PermissionKey> getPermissionKeys() {
    List<PermissionKey> permissionKeys = new ArrayList<>();
    permissionKeys.add(DELETE);
    permissionKeys.add(EDIT);
    permissionKeys.add(VIEW);
    return java.util.Collections.unmodifiableList(permissionKeys);
  }
  
  
}