package com.guidewire._generated.security;

import com.guidewire.cc.domain.claim.impl.ClaimFinancialsPermissionHandler;
import com.guidewire.cc.domain.claim.impl.ClaimPermissionHandler;
import com.guidewire.cc.domain.financials.check.impl.CheckStateDependentPermissionHandler;
import com.guidewire.cc.domain.financials.payment.impl.VoidOrStopPaymentPermissionHandler;
import com.guidewire.pl.system.security.ObjectPermissionKey;
import com.guidewire.pl.system.security.PermissionKey;
import com.guidewire.pl.system.security.StaticPermissionKey;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(comments = "security-config-app.xml;security-config-pl.xml;security-config.xml", date = "", value = "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
public class PaymentPermKeys {
  public static final ObjectPermissionKey DELETE = new ObjectPermissionKey("delete", entity.Payment.class.getSimpleName(), new CheckStateDependentPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("paydelete", "manpaydelete").withDescription("Permission to delete a payment on a claim. Checks delete payment or delete manual payment depending on the type of check the payment is on").build()));
  
  public static final ObjectPermissionKey DELETEMANUAL = new ObjectPermissionKey("deletemanual", entity.Payment.class.getSimpleName(), new ClaimFinancialsPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("manpaydelete").withDescription("Permission to delete a manual payment on a claim").build()));
  
  public static final ObjectPermissionKey DELETENORMAL = new ObjectPermissionKey("deletenormal", entity.Payment.class.getSimpleName(), new ClaimFinancialsPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("paydelete").withDescription("Permission to delete a normal payment on a claim").build()));
  
  public static final ObjectPermissionKey EDIT = new ObjectPermissionKey("edit", entity.Payment.class.getSimpleName(), new CheckStateDependentPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("payedit", "manpayedit").withDescription("Permission to edit a payment on a claim. Checks edit payment or edit manual payment depending on the type of check the payment is on").build()));
  
  public static final ObjectPermissionKey EDITMANUAL = new ObjectPermissionKey("editmanual", entity.Payment.class.getSimpleName(), new ClaimFinancialsPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("manpayedit").withDescription("Permission to edit a manual payment on a claim").build()));
  
  public static final ObjectPermissionKey EDITNORMAL = new ObjectPermissionKey("editnormal", entity.Payment.class.getSimpleName(), new ClaimFinancialsPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("payedit").withDescription("Permission to edit a nromal payment on a claim").build()));
  
  public static final StaticPermissionKey GENERICVIEW = new StaticPermissionKey("genericview", entity.Payment.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimviewpay").withDescription("Permission to view some payments").withDisplayKey("Java.Error.Permission.GenericViewPayments").build());
  
  public static final ObjectPermissionKey RECODE = new ObjectPermissionKey("recode", entity.Payment.class.getSimpleName(), new ClaimFinancialsPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("payrecode").withDescription("Permission to recode a payment on a claim").build()));
  
  public static final ObjectPermissionKey STOP = new ObjectPermissionKey("stop", entity.Payment.class.getSimpleName(), new ClaimFinancialsPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("paystop").withDescription("Permission to stop a payment on a claim").build()));
  
  public static final ObjectPermissionKey VIEW = new ObjectPermissionKey("view", entity.Payment.class.getSimpleName(), new ClaimPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimviewpay").withDescription("Permission to view payments on a claim").build()));
  
  public static final ObjectPermissionKey VOIDPMT = new ObjectPermissionKey("voidpmt", entity.Payment.class.getSimpleName(), new ClaimFinancialsPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("payvoid").withDescription("Permission to void a payment on a claim").build()));
  
  public static final ObjectPermissionKey VOIDCLEAREDPMT = new ObjectPermissionKey("voidclearedpmt", entity.Payment.class.getSimpleName(), new ClaimFinancialsPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("clearedpayvoid").withDescription("Permission to void a cleared payment").build()));
  
  public static final ObjectPermissionKey VOIDORSTOP = new ObjectPermissionKey("voidorstop", entity.Payment.class.getSimpleName(), new VoidOrStopPaymentPermissionHandler());
  
  public static List<PermissionKey> getPermissionKeys() {
    List<PermissionKey> permissionKeys = new ArrayList<>();
    permissionKeys.add(DELETE);
    permissionKeys.add(DELETEMANUAL);
    permissionKeys.add(DELETENORMAL);
    permissionKeys.add(EDIT);
    permissionKeys.add(EDITMANUAL);
    permissionKeys.add(EDITNORMAL);
    permissionKeys.add(GENERICVIEW);
    permissionKeys.add(RECODE);
    permissionKeys.add(STOP);
    permissionKeys.add(VIEW);
    permissionKeys.add(VOIDPMT);
    permissionKeys.add(VOIDCLEAREDPMT);
    permissionKeys.add(VOIDORSTOP);
    return java.util.Collections.unmodifiableList(permissionKeys);
  }
  
  
}