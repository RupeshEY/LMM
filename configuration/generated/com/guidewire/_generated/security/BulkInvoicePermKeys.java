package com.guidewire._generated.security;

import com.guidewire.pl.system.security.PermissionKey;
import com.guidewire.pl.system.security.StaticPermissionKey;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(comments = "security-config-app.xml;security-config-pl.xml;security-config.xml", date = "", value = "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
public class BulkInvoicePermKeys {
  public static final StaticPermissionKey CREATE = new StaticPermissionKey("create", entity.BulkInvoice.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("bulkinvcreate").withDescription("Permission to create a bulk invoice").build());
  
  public static final StaticPermissionKey DELETE = new StaticPermissionKey("delete", entity.BulkInvoice.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("bulkinvdelete").withDescription("Permission to delete a bulk invoice").build());
  
  public static final StaticPermissionKey EDIT = new StaticPermissionKey("edit", entity.BulkInvoice.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("bulkinvedit").withDescription("Permission to edit a bulk invoice").build());
  
  public static final StaticPermissionKey VIEW = new StaticPermissionKey("view", entity.BulkInvoice.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("bulkinvview").withDescription("Permission to view a bulk invoice").build());
  
  public static List<PermissionKey> getPermissionKeys() {
    List<PermissionKey> permissionKeys = new ArrayList<>();
    permissionKeys.add(CREATE);
    permissionKeys.add(DELETE);
    permissionKeys.add(EDIT);
    permissionKeys.add(VIEW);
    return java.util.Collections.unmodifiableList(permissionKeys);
  }
  
  
}