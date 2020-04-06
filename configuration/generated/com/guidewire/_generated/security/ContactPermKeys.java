package com.guidewire._generated.security;

import com.guidewire.pl.domain.contact.impl.EditContactPermissionHandler;
import com.guidewire.pl.domain.contact.security.CreateABContactPermissionHandler;
import com.guidewire.pl.domain.contact.security.DeleteABContactPermissionHandler;
import com.guidewire.pl.domain.contact.security.EditABContactPermissionHandler;
import com.guidewire.pl.domain.contact.security.ViewABContactPermissionHandler;
import com.guidewire.pl.system.security.ObjectPermissionKey;
import com.guidewire.pl.system.security.OptionalObjectPermissionKey;
import com.guidewire.pl.system.security.PermissionKey;
import com.guidewire.pl.system.security.StaticPermissionKey;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(comments = "security-config-app.xml;security-config-pl.xml;security-config.xml", date = "", value = "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
public class ContactPermKeys {
  public static final StaticPermissionKey VIEWLOCAL = new StaticPermissionKey("viewlocal", entity.Contact.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("ctcview").withDescription("Permission to view a contact").build());
  
  public static final StaticPermissionKey CREATELOCAL = new StaticPermissionKey("createlocal", entity.Contact.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("ctccreate").withDescription("Permission to create a new contact").build());
  
  public static final ObjectPermissionKey EDITLOCAL = new ObjectPermissionKey("editlocal", entity.Contact.class.getSimpleName(), new EditContactPermissionHandler());
  
  public static final OptionalObjectPermissionKey VIEWAB = new OptionalObjectPermissionKey("viewab", entity.Contact.class.getSimpleName(), new ViewABContactPermissionHandler());
  
  public static final StaticPermissionKey VIEWSEARCHAB = new StaticPermissionKey("viewsearchab", entity.Contact.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("abviewsearch").withDescription("Permission to view the AB search page").build());
  
  public static final OptionalObjectPermissionKey CREATEAB = new OptionalObjectPermissionKey("createab", entity.Contact.class.getSimpleName(), new CreateABContactPermissionHandler());
  
  public static final StaticPermissionKey CREATEPREFERREDAB = new StaticPermissionKey("createpreferredab", entity.Contact.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("abcreatepref").withDescription("Permission to create new preferred vendor AB Contact or change an existing contact to be a preferred vendor").build());
  
  public static final OptionalObjectPermissionKey EDITAB = new OptionalObjectPermissionKey("editab", entity.Contact.class.getSimpleName(), new EditABContactPermissionHandler());
  
  public static final StaticPermissionKey EDITPREFERREDAB = new StaticPermissionKey("editpreferredab", entity.Contact.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("abeditpref").withDescription("Permission to modify a preferred vendor AB Contact").build());
  
  public static final OptionalObjectPermissionKey DELETEAB = new OptionalObjectPermissionKey("deleteab", entity.Contact.class.getSimpleName(), new DeleteABContactPermissionHandler());
  
  public static final StaticPermissionKey DELETEPREFERREDAB = new StaticPermissionKey("deletepreferredab", entity.Contact.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("abdeletepref").withDescription("Permission to delete a preferred vendor AB Contact").build());
  
  public static List<PermissionKey> getPermissionKeys() {
    List<PermissionKey> permissionKeys = new ArrayList<>();
    permissionKeys.add(VIEWLOCAL);
    permissionKeys.add(CREATELOCAL);
    permissionKeys.add(EDITLOCAL);
    permissionKeys.add(VIEWAB);
    permissionKeys.add(VIEWSEARCHAB);
    permissionKeys.add(CREATEAB);
    permissionKeys.add(CREATEPREFERREDAB);
    permissionKeys.add(EDITAB);
    permissionKeys.add(EDITPREFERREDAB);
    permissionKeys.add(DELETEAB);
    permissionKeys.add(DELETEPREFERREDAB);
    return java.util.Collections.unmodifiableList(permissionKeys);
  }
  
  
}