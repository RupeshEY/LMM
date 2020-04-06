package com.guidewire._generated.security;

import com.guidewire.cc.domain.claim.impl.ClaimPermissionHandler;
import com.guidewire.cc.domain.claim.impl.ClaimStatePermissionHandler;
import com.guidewire.pl.system.security.ObjectPermissionKey;
import com.guidewire.pl.system.security.PermissionKey;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(comments = "security-config-app.xml;security-config-pl.xml;security-config.xml", date = "", value = "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
public class NegotiationPermKeys {
  public static final ObjectPermissionKey EDIT = new ObjectPermissionKey("edit", entity.Negotiation.class.getSimpleName(), new ClaimStatePermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("ngtnedit", "ngtneditclsd").withDescription("Permission to edit a negotiation on a claim. Checks Edit Negotiation or Edit Negotiation Claim Closed depending on the state of the claim").build()));
  
  public static final ObjectPermissionKey VIEW = new ObjectPermissionKey("view", entity.Negotiation.class.getSimpleName(), new ClaimPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("ngtnview").withDescription("Permission to view a negotiation on a claim").build()));
  
  public static List<PermissionKey> getPermissionKeys() {
    List<PermissionKey> permissionKeys = new ArrayList<>();
    permissionKeys.add(EDIT);
    permissionKeys.add(VIEW);
    return java.util.Collections.unmodifiableList(permissionKeys);
  }
  
  
}