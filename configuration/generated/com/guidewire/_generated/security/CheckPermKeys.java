package com.guidewire._generated.security;

import com.guidewire.cc.domain.claim.impl.ClaimPermissionHandler;
import com.guidewire.cc.domain.financials.check.impl.CheckStateDependentPermissionHandler;
import com.guidewire.pl.system.security.ObjectPermissionKey;
import com.guidewire.pl.system.security.PermissionKey;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(comments = "security-config-app.xml;security-config-pl.xml;security-config.xml", date = "", value = "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
public class CheckPermKeys {
  public static final ObjectPermissionKey DELETE = new ObjectPermissionKey("delete", entity.Check.class.getSimpleName(), new CheckStateDependentPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("paydelete", "manpaydelete").withDescription("Permission to delete a check on a claim. Checks delete payment or delete manual payment depending on the type of check").build()));
  
  public static final ObjectPermissionKey EDIT = new ObjectPermissionKey("edit", entity.Check.class.getSimpleName(), new CheckStateDependentPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("payedit", "manpayedit").withDescription("Permission to edit a check on a claim. Checks edit payment or edit manual payment depending on the type of check").build()));
  
  public static final ObjectPermissionKey TRANSFER = new ObjectPermissionKey("transfer", entity.Check.class.getSimpleName(), new CheckStateDependentPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("checktransfer", "manpaydelete").withDescription("Permission to transfer a check on a claim").build()));
  
  public static final ObjectPermissionKey VIEW = new ObjectPermissionKey("view", entity.Check.class.getSimpleName(), new ClaimPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimviewpay").withDescription("Permission to view a check on a claim").build()));
  
  public static List<PermissionKey> getPermissionKeys() {
    List<PermissionKey> permissionKeys = new ArrayList<>();
    permissionKeys.add(DELETE);
    permissionKeys.add(EDIT);
    permissionKeys.add(TRANSFER);
    permissionKeys.add(VIEW);
    return java.util.Collections.unmodifiableList(permissionKeys);
  }
  
  
}