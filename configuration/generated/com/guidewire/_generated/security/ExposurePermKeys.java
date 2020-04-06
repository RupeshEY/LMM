package com.guidewire._generated.security;

import com.guidewire.cc.domain.exposure.impl.ExposurePermissionHandlers.Assign;
import com.guidewire.cc.domain.exposure.impl.ExposurePermissionHandlers.Edit;
import com.guidewire.cc.domain.exposure.sec.ExposureRelatedClaimPermissionHandler;
import com.guidewire.pl.system.security.ObjectPermissionKey;
import com.guidewire.pl.system.security.PermissionKey;
import com.guidewire.pl.system.security.StaticPermissionKey;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(comments = "security-config-app.xml;security-config-pl.xml;security-config.xml", date = "", value = "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
public class ExposurePermKeys {
  public static final ObjectPermissionKey ASSIGN = new ObjectPermissionKey("assign", entity.Exposure.class.getSimpleName(), new Assign());
  
  public static final ObjectPermissionKey CLOSE = new ObjectPermissionKey("close", entity.Exposure.class.getSimpleName(), new ExposureRelatedClaimPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("expclose").withDescription("Permission to close an exposure on a claim").build()));
  
  public static final ObjectPermissionKey EDIT = new ObjectPermissionKey("edit", entity.Exposure.class.getSimpleName(), new Edit());
  
  public static final StaticPermissionKey GENERICASSIGN = new StaticPermissionKey("genericassign", entity.Exposure.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("expraown", "expraunown").withDescription("Permission to re-assign some exposure").withDisplayKey("Java.Error.Permission.GenericExposureReassign").build());
  
  public static final StaticPermissionKey GENERICASSIGNOWNED = new StaticPermissionKey("genericassignowned", entity.Exposure.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("expraown").withDescription("Permission to re-assign some owned exposure").withDisplayKey("Java.Error.Permission.GenericExposureReassignOwned").build());
  
  public static final StaticPermissionKey GENERICASSIGNUNOWNED = new StaticPermissionKey("genericassignunowned", entity.Exposure.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("expraunown").withDescription("Permission to re-assign some unowned exposure").withDisplayKey("Java.Error.Permission.GenericExposureReassignUnowned").build());
  
  public static final StaticPermissionKey OWN = new StaticPermissionKey("own", entity.Exposure.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("expown").withDescription("Permission to own exposures").build());
  
  public static final ObjectPermissionKey REOPEN = new ObjectPermissionKey("reopen", entity.Exposure.class.getSimpleName(), new ExposureRelatedClaimPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("expreopen").withDescription("Permission to reopen an exposure on a claim").build()));
  
  public static final ObjectPermissionKey VALIDATE = new ObjectPermissionKey("validate", entity.Exposure.class.getSimpleName(), new ExposureRelatedClaimPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("expvalidate").withDescription("Permission to run validation rules on an exposure").build()));
  
  public static final ObjectPermissionKey VIEW = new ObjectPermissionKey("view", entity.Exposure.class.getSimpleName(), new ExposureRelatedClaimPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("expview").withDescription("Permission to view an exposure on a claim").build()));
  
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
    permissionKeys.add(VALIDATE);
    permissionKeys.add(VIEW);
    return java.util.Collections.unmodifiableList(permissionKeys);
  }
  
  
}