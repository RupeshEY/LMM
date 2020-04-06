package com.guidewire._generated.security;

import com.guidewire.cc.domain.financials.StaticFinancialsPermissionHandler;
import com.guidewire.pl.system.security.PermissionKey;
import com.guidewire.pl.system.security.StaticPermissionKey;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(comments = "security-config-app.xml;security-config-pl.xml;security-config.xml", date = "", value = "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
public class ExchangeRatePermKeys {
  public static final StaticPermissionKey EDIT = new StaticPermissionKey("edit", entity.ExchangeRate.class.getSimpleName(), new StaticFinancialsPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("exchratemanual").withDescription("Permission to override exchange rate with a custom exchange rate.").withDisplayKey("Java.Error.Permission.EditExchangeRate").build()));
  
  public static List<PermissionKey> getPermissionKeys() {
    List<PermissionKey> permissionKeys = new ArrayList<>();
    permissionKeys.add(EDIT);
    return java.util.Collections.unmodifiableList(permissionKeys);
  }
  
  
}