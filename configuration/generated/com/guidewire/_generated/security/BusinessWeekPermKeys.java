package com.guidewire._generated.security;

import com.guidewire.pl.domain.community.impl.BusinessWeekPermissionHandler;
import com.guidewire.pl.system.security.PermissionKey;
import com.guidewire.pl.system.security.StaticPermissionKey;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(comments = "security-config-app.xml;security-config-pl.xml;security-config.xml", date = "", value = "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
public class BusinessWeekPermKeys {
  public static final StaticPermissionKey VIEW = new StaticPermissionKey("view", entity.BusinessWeek.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("buswkview").withDescription("Permission to view a list of BusinessWeeks or BusinessWeek details").build());
  
  public static final StaticPermissionKey CREATE = new StaticPermissionKey("create", entity.BusinessWeek.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("buswkmanage").withDescription("Permission to create a BusinessWeek").build());
  
  public static final StaticPermissionKey EDIT = new StaticPermissionKey("edit", entity.BusinessWeek.class.getSimpleName(), new BusinessWeekPermissionHandler());
  
  public static final StaticPermissionKey DELETE = new StaticPermissionKey("delete", entity.BusinessWeek.class.getSimpleName(), new BusinessWeekPermissionHandler());
  
  public static List<PermissionKey> getPermissionKeys() {
    List<PermissionKey> permissionKeys = new ArrayList<>();
    permissionKeys.add(VIEW);
    permissionKeys.add(CREATE);
    permissionKeys.add(EDIT);
    permissionKeys.add(DELETE);
    return java.util.Collections.unmodifiableList(permissionKeys);
  }
  
  
}