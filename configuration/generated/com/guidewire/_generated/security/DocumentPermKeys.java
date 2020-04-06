package com.guidewire._generated.security;

import com.guidewire.cc.domain.document.impl.DocumentPermissionHandlers.Delete;
import com.guidewire.cc.domain.document.impl.DocumentPermissionHandlers.Edit;
import com.guidewire.cc.domain.document.impl.DocumentPermissionHandlers.View;
import com.guidewire.pl.system.security.ObjectPermissionKey;
import com.guidewire.pl.system.security.PermissionKey;
import com.guidewire.pl.system.security.StaticPermissionKey;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(comments = "security-config-app.xml;security-config-pl.xml;security-config.xml", date = "", value = "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
public class DocumentPermKeys {
  public static final StaticPermissionKey CREATE = new StaticPermissionKey("create", entity.Document.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("doccreate", "docmodifyall").withDescription("Permission to create documents").build());
  
  public static final ObjectPermissionKey VIEW = new ObjectPermissionKey("view", entity.Document.class.getSimpleName(), new View());
  
  public static final ObjectPermissionKey EDIT = new ObjectPermissionKey("edit", entity.Document.class.getSimpleName(), new Edit());
  
  public static final ObjectPermissionKey DELETE = new ObjectPermissionKey("delete", entity.Document.class.getSimpleName(), new Delete());
  
  public static final StaticPermissionKey GENERICDELETE = new StaticPermissionKey("genericdelete", entity.Document.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("docdelete", "docmodifyall").withDescription("Permission to delete some documents").build());
  
  public static List<PermissionKey> getPermissionKeys() {
    List<PermissionKey> permissionKeys = new ArrayList<>();
    permissionKeys.add(CREATE);
    permissionKeys.add(VIEW);
    permissionKeys.add(EDIT);
    permissionKeys.add(DELETE);
    permissionKeys.add(GENERICDELETE);
    return java.util.Collections.unmodifiableList(permissionKeys);
  }
  
  
}