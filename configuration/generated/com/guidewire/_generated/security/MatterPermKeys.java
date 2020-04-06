package com.guidewire._generated.security;

import com.guidewire.cc.domain.claim.impl.ClaimPermissionHandler;
import com.guidewire.cc.domain.matter.impl.AssignMatterPermissionHandler;
import com.guidewire.cc.domain.matter.impl.EditMatterPermissionHandler;
import com.guidewire.pl.system.security.ObjectPermissionKey;
import com.guidewire.pl.system.security.PermissionKey;
import com.guidewire.pl.system.security.StaticPermissionKey;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(comments = "security-config-app.xml;security-config-pl.xml;security-config.xml", date = "", value = "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
public class MatterPermKeys {
  public static final ObjectPermissionKey ASSIGN = new ObjectPermissionKey("assign", entity.Matter.class.getSimpleName(), new AssignMatterPermissionHandler());
  
  public static final ObjectPermissionKey CLOSE = new ObjectPermissionKey("close", entity.Matter.class.getSimpleName(), new ClaimPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("mttrclose").withDescription("Permission to close a matter").build()));
  
  public static final ObjectPermissionKey EDIT = new ObjectPermissionKey("edit", entity.Matter.class.getSimpleName(), new EditMatterPermissionHandler());
  
  public static final StaticPermissionKey GENERICASSIGN = new StaticPermissionKey("genericassign", entity.Matter.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("mttrraown", "mttrraunown").withDescription("Permission to re-assign some matter").withDisplayKey("Java.Error.Permission.GenericMatterReassign").build());
  
  public static final StaticPermissionKey GENERICASSIGNOWNED = new StaticPermissionKey("genericassignowned", entity.Matter.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("mttrraown").withDescription("Permission to re-assign some owned matter").withDisplayKey("Java.Error.Permission.GenericMatterReassignOwned").build());
  
  public static final StaticPermissionKey GENERICASSIGNUNOWNED = new StaticPermissionKey("genericassignunowned", entity.Matter.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("mttrraunown").withDescription("Permission to re-assign some unowned matter").withDisplayKey("Java.Error.Permission.GenericMatterReassignUnowned").build());
  
  public static final StaticPermissionKey OWN = new StaticPermissionKey("own", entity.Matter.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("mttrown").withDescription("Permission to own matters on a claim").build());
  
  public static final ObjectPermissionKey REOPEN = new ObjectPermissionKey("reopen", entity.Matter.class.getSimpleName(), new ClaimPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("mttrreopen").withDescription("Permission to reopen a matter on a claim").build()));
  
  public static final ObjectPermissionKey VIEW = new ObjectPermissionKey("view", entity.Matter.class.getSimpleName(), new ClaimPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("mttrview").withDescription("Permission to view the list of matters on a claim or an individual matter").build()));
  
  public static List<PermissionKey> getPermissionKeys() {
    List<PermissionKey> permissionKeys = new ArrayList<>();
    permissionKeys.add(ASSIGN);
    permissionKeys.add(CLOSE);
    permissionKeys.add(EDIT);
    permissionKeys.add(GENERICASSIGN);
    permissionKeys.add(GENERICASSIGNOWNED);
    permissionKeys.add(GENERICASSIGNUNOWNED);
    permissionKeys.add(OWN);
    permissionKeys.add(REOPEN);
    permissionKeys.add(VIEW);
    return java.util.Collections.unmodifiableList(permissionKeys);
  }
  
  
}