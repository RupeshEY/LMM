package com.guidewire._generated.security;

import com.guidewire.cc.domain.claim.impl.ClaimPermissionHandler;
import com.guidewire.cc.domain.policy.impl.PolicyEditPermissionHandler;
import com.guidewire.cc.domain.policy.impl.PolicyMakeEditablePermissionHandler;
import com.guidewire.pl.system.security.ObjectPermissionKey;
import com.guidewire.pl.system.security.PermissionKey;
import com.guidewire.pl.system.security.StaticPermissionKey;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(comments = "security-config-app.xml;security-config-pl.xml;security-config.xml", date = "", value = "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
public class PolicyPermKeys {
  public static final StaticPermissionKey CREATEUNVERIFIEDPOLICY = new StaticPermissionKey("createunverifiedpolicy", entity.Policy.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("plcymakeeditable").withDescription("Permission to create an unverified policy in the new claim wizard").build());
  
  public static final ObjectPermissionKey EDIT = new ObjectPermissionKey("edit", entity.Policy.class.getSimpleName(), new PolicyEditPermissionHandler());
  
  public static final ObjectPermissionKey MAKEEDITABLE = new ObjectPermissionKey("makeeditable", entity.Policy.class.getSimpleName(), new PolicyMakeEditablePermissionHandler());
  
  public static final ObjectPermissionKey VIEW = new ObjectPermissionKey("view", entity.Policy.class.getSimpleName(), new ClaimPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("plcyview").withDescription("Permission to view a policy").build()));
  
  public static List<PermissionKey> getPermissionKeys() {
    List<PermissionKey> permissionKeys = new ArrayList<>();
    permissionKeys.add(CREATEUNVERIFIEDPOLICY);
    permissionKeys.add(EDIT);
    permissionKeys.add(MAKEEDITABLE);
    permissionKeys.add(VIEW);
    return java.util.Collections.unmodifiableList(permissionKeys);
  }
  
  
}