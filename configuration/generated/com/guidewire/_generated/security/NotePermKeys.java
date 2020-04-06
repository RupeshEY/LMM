package com.guidewire._generated.security;

import com.guidewire.cc.domain.note.impl.NotePermissionHandlers.Delete;
import com.guidewire.cc.domain.note.impl.NotePermissionHandlers.Edit;
import com.guidewire.cc.domain.note.impl.NotePermissionHandlers.EditBody;
import com.guidewire.cc.domain.note.impl.NotePermissionHandlers.View;
import com.guidewire.pl.system.security.ObjectPermissionKey;
import com.guidewire.pl.system.security.PermissionKey;
import com.guidewire.pl.system.security.StaticPermissionKey;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(comments = "security-config-app.xml;security-config-pl.xml;security-config.xml", date = "", value = "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
public class NotePermKeys {
  public static final StaticPermissionKey CREATE = new StaticPermissionKey("create", entity.Note.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("notecreate").withDescription("Permission to create a Note").build());
  
  public static final ObjectPermissionKey VIEW = new ObjectPermissionKey("view", entity.Note.class.getSimpleName(), new View());
  
  public static final ObjectPermissionKey EDIT = new ObjectPermissionKey("edit", entity.Note.class.getSimpleName(), new Edit());
  
  public static final ObjectPermissionKey DELETE = new ObjectPermissionKey("delete", entity.Note.class.getSimpleName(), new Delete());
  
  public static final ObjectPermissionKey EDITBODY = new ObjectPermissionKey("editbody", entity.Note.class.getSimpleName(), new EditBody());
  
  public static List<PermissionKey> getPermissionKeys() {
    List<PermissionKey> permissionKeys = new ArrayList<>();
    permissionKeys.add(CREATE);
    permissionKeys.add(VIEW);
    permissionKeys.add(EDIT);
    permissionKeys.add(DELETE);
    permissionKeys.add(EDITBODY);
    return java.util.Collections.unmodifiableList(permissionKeys);
  }
  
  
}