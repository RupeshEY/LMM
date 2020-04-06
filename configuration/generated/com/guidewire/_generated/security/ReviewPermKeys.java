package com.guidewire._generated.security;

import com.guidewire.cc.domain.contact.impl.ReviewDeletePermissionHandler;
import com.guidewire.pl.system.security.ObjectPermissionKey;
import com.guidewire.pl.system.security.PermissionKey;
import com.guidewire.pl.system.security.StaticPermissionKey;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(comments = "security-config-app.xml;security-config-pl.xml;security-config.xml", date = "", value = "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
public class ReviewPermKeys {
  public static final StaticPermissionKey CREATE = new StaticPermissionKey("create", entity.Review.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("reviewcreate").withDescription("Permission to create new Reviews").build());
  
  public static final ObjectPermissionKey DELETE = new ObjectPermissionKey("delete", entity.Review.class.getSimpleName(), new ReviewDeletePermissionHandler());
  
  public static final StaticPermissionKey EDIT = new StaticPermissionKey("edit", entity.Review.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("reviewedit").withDescription("Permission to edit existing Reviews").build());
  
  public static final StaticPermissionKey LIST = new StaticPermissionKey("list", entity.Review.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("reviewviewlist").withDescription("Permission to see the Reviews tab and see the list of Reviews for a given Contact").build());
  
  public static final StaticPermissionKey VIEW = new StaticPermissionKey("view", entity.Review.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("reviewviewdetail").withDescription("Permission to view the details page of existing Reviews").build());
  
  public static List<PermissionKey> getPermissionKeys() {
    List<PermissionKey> permissionKeys = new ArrayList<>();
    permissionKeys.add(CREATE);
    permissionKeys.add(DELETE);
    permissionKeys.add(EDIT);
    permissionKeys.add(LIST);
    permissionKeys.add(VIEW);
    return java.util.Collections.unmodifiableList(permissionKeys);
  }
  
  
}