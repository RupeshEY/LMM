package com.guidewire._generated.security;

import com.guidewire.cc.domain.claim.impl.ClaimPermissionHandler;
import com.guidewire.cc.domain.claim.impl.ClaimStatePermissionHandler;
import com.guidewire.pl.system.security.ObjectPermissionKey;
import com.guidewire.pl.system.security.PermissionKey;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(comments = "security-config-app.xml;security-config-pl.xml;security-config.xml", date = "", value = "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
public class IncidentPermKeys {
  public static final ObjectPermissionKey EDIT = new ObjectPermissionKey("edit", entity.Incident.class.getSimpleName(), new ClaimStatePermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimedit", "claimeditclsd").withDescription("Permission to edit the incident. Checks edit claim or edit claim closed depending on the state of the claim").build()));
  
  public static final ObjectPermissionKey VIEW = new ObjectPermissionKey("view", entity.Incident.class.getSimpleName(), new ClaimPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimview").withDescription("Permission to view an incident").build()));
  
  public static List<PermissionKey> getPermissionKeys() {
    List<PermissionKey> permissionKeys = new ArrayList<>();
    permissionKeys.add(EDIT);
    permissionKeys.add(VIEW);
    return java.util.Collections.unmodifiableList(permissionKeys);
  }
  
  
}