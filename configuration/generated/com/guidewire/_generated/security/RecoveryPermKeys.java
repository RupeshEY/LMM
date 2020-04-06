package com.guidewire._generated.security;

import com.guidewire.cc.domain.claim.impl.ClaimFinancialsPermissionHandler;
import com.guidewire.cc.domain.claim.impl.ClaimPermissionHandler;
import com.guidewire.pl.system.security.ObjectPermissionKey;
import com.guidewire.pl.system.security.PermissionKey;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(comments = "security-config-app.xml;security-config-pl.xml;security-config.xml", date = "", value = "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
public class RecoveryPermKeys {
  public static final ObjectPermissionKey DELETE = new ObjectPermissionKey("delete", entity.Recovery.class.getSimpleName(), new ClaimFinancialsPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("recdelete").withDescription("Permission to delete a recovery").build()));
  
  public static final ObjectPermissionKey EDIT = new ObjectPermissionKey("edit", entity.Recovery.class.getSimpleName(), new ClaimFinancialsPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("recedit").withDescription("Permission to edit an existing recovery").build()));
  
  public static final ObjectPermissionKey VIEW = new ObjectPermissionKey("view", entity.Recovery.class.getSimpleName(), new ClaimPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimviewrec").withDescription("Permission to view details of a recovery").build()));
  
  public static final ObjectPermissionKey VOIDREC = new ObjectPermissionKey("voidrec", entity.Recovery.class.getSimpleName(), new ClaimFinancialsPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("recvoid").withDescription("Permission to void a recovery").build()));
  
  public static List<PermissionKey> getPermissionKeys() {
    List<PermissionKey> permissionKeys = new ArrayList<>();
    permissionKeys.add(DELETE);
    permissionKeys.add(EDIT);
    permissionKeys.add(VIEW);
    permissionKeys.add(VOIDREC);
    return java.util.Collections.unmodifiableList(permissionKeys);
  }
  
  
}