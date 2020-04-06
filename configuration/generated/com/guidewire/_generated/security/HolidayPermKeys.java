package com.guidewire._generated.security;

import com.guidewire.pl.domain.community.impl.HolidayPermissionHandler;
import com.guidewire.pl.system.security.PermissionKey;
import com.guidewire.pl.system.security.StaticPermissionKey;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(comments = "security-config-app.xml;security-config-pl.xml;security-config.xml", date = "", value = "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
public class HolidayPermKeys {
  public static final StaticPermissionKey VIEW = new StaticPermissionKey("view", entity.Holiday.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("holidayview").withDescription("Permission to view a list of holidays or holiday details").build());
  
  public static final StaticPermissionKey CREATE = new StaticPermissionKey("create", entity.Holiday.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("holidaymanage").withDescription("Permission to create a holiday").build());
  
  public static final StaticPermissionKey EDIT = new StaticPermissionKey("edit", entity.Holiday.class.getSimpleName(), new HolidayPermissionHandler());
  
  public static final StaticPermissionKey DELETE = new StaticPermissionKey("delete", entity.Holiday.class.getSimpleName(), new HolidayPermissionHandler());
  
  public static List<PermissionKey> getPermissionKeys() {
    List<PermissionKey> permissionKeys = new ArrayList<>();
    permissionKeys.add(VIEW);
    permissionKeys.add(CREATE);
    permissionKeys.add(EDIT);
    permissionKeys.add(DELETE);
    return java.util.Collections.unmodifiableList(permissionKeys);
  }
  
  
}