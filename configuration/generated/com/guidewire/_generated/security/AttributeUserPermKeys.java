package com.guidewire._generated.security;

import com.guidewire.pl.domain.community.impl.AttributeUserPermissionHandler;
import com.guidewire.pl.system.security.PermissionKey;
import com.guidewire.pl.system.security.StaticPermissionKey;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(comments = "security-config-app.xml;security-config-pl.xml;security-config.xml", date = "", value = "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
public class AttributeUserPermKeys {
  public static final StaticPermissionKey CREATE = new StaticPermissionKey("create", entity.AttributeUser.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("usereditattrs").withDescription("Permission to create a new attribute-user relationship").build());
  
  public static final StaticPermissionKey EDIT = new StaticPermissionKey("edit", entity.AttributeUser.class.getSimpleName(), new AttributeUserPermissionHandler());
  
  public static final StaticPermissionKey DELETE = new StaticPermissionKey("delete", entity.AttributeUser.class.getSimpleName(), new AttributeUserPermissionHandler());
  
  public static List<PermissionKey> getPermissionKeys() {
    List<PermissionKey> permissionKeys = new ArrayList<>();
    permissionKeys.add(CREATE);
    permissionKeys.add(EDIT);
    permissionKeys.add(DELETE);
    return java.util.Collections.unmodifiableList(permissionKeys);
  }
  
  
}