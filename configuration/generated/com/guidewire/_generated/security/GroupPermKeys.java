package com.guidewire._generated.security;

import com.guidewire.pl.domain.community.impl.ManageLoadFactorsPermissionHandler;
import com.guidewire.pl.domain.community.impl.ViewLoadFactorsPermissionHandler;
import com.guidewire.pl.system.security.ObjectPermissionKey;
import com.guidewire.pl.system.security.OptionalObjectPermissionKey;
import com.guidewire.pl.system.security.PermissionKey;
import com.guidewire.pl.system.security.StaticPermissionKey;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(comments = "security-config-app.xml;security-config-pl.xml;security-config.xml", date = "", value = "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
public class GroupPermKeys {
  public static final StaticPermissionKey CREATE = new StaticPermissionKey("create", entity.Group.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("groupcreate").withDescription("Permission to create a new group").build());
  
  public static final OptionalObjectPermissionKey VIEW = new OptionalObjectPermissionKey("view", entity.Group.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("groupview").withDescription("Permission to view a group's details").build());
  
  public static final OptionalObjectPermissionKey EDIT = new OptionalObjectPermissionKey("edit", entity.Group.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("groupedit").withDescription("Permission to edit an existing group").build());
  
  public static final OptionalObjectPermissionKey DELETE = new OptionalObjectPermissionKey("delete", entity.Group.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("groupdelete").withDescription("Permission to delete a group").build());
  
  public static final StaticPermissionKey VIEWTREE = new StaticPermissionKey("viewtree", entity.Group.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("grouptreeview").withDescription("Permission to view the user/group tree").build());
  
  public static final StaticPermissionKey VIEWLOADFACTORS = new StaticPermissionKey("viewloadfactors", entity.Group.class.getSimpleName(), new ViewLoadFactorsPermissionHandler());
  
  public static final ObjectPermissionKey MANAGELOADFACTORS = new ObjectPermissionKey("manageloadfactors", entity.Group.class.getSimpleName(), new ManageLoadFactorsPermissionHandler());
  
  public static List<PermissionKey> getPermissionKeys() {
    List<PermissionKey> permissionKeys = new ArrayList<>();
    permissionKeys.add(CREATE);
    permissionKeys.add(VIEW);
    permissionKeys.add(EDIT);
    permissionKeys.add(DELETE);
    permissionKeys.add(VIEWTREE);
    permissionKeys.add(VIEWLOADFACTORS);
    permissionKeys.add(MANAGELOADFACTORS);
    return java.util.Collections.unmodifiableList(permissionKeys);
  }
  
  
}