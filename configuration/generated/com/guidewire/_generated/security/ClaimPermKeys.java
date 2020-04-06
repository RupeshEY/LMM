package com.guidewire._generated.security;

import com.guidewire.cc.domain.claim.impl.AssignClaimPermissionHandler;
import com.guidewire.cc.domain.claim.impl.ClaimAnyPermissionHandler;
import com.guidewire.cc.domain.claim.impl.ClaimFinancialsPermissionHandler;
import com.guidewire.cc.domain.claim.impl.ClaimPermissionHandler;
import com.guidewire.cc.domain.claim.impl.ClaimStatePermissionHandler;
import com.guidewire.cc.domain.claim.impl.CreateAnyTransactionPermissionHandler;
import com.guidewire.cc.domain.claim.impl.CreatePaymentPermissionHandler;
import com.guidewire.cc.domain.claim.impl.CreateRecoveryReservePermissionHandler;
import com.guidewire.cc.domain.claim.impl.CreateReservePermissionHandler;
import com.guidewire.cc.domain.claim.impl.PrintClaimPermissionHandler;
import com.guidewire.cc.domain.claim.impl.ViewConfidentialNotesPermissionHandler;
import com.guidewire.pl.system.security.ObjectPermissionKey;
import com.guidewire.pl.system.security.PermissionKey;
import com.guidewire.pl.system.security.StaticPermissionKey;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(comments = "security-config-app.xml;security-config-pl.xml;security-config.xml", date = "", value = "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
public class ClaimPermKeys {
  public static final StaticPermissionKey ARCHIVE = new StaticPermissionKey("archive", entity.Claim.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("archive").withDescription("Permission to archive a claim").build());
  
  public static final ObjectPermissionKey ASSIGN = new ObjectPermissionKey("assign", entity.Claim.class.getSimpleName(), new AssignClaimPermissionHandler());
  
  public static final ObjectPermissionKey CLOSE = new ObjectPermissionKey("close", entity.Claim.class.getSimpleName(), new ClaimPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimclose").withDescription("Permission to close a claim").build()));
  
  public static final ObjectPermissionKey CLOSEEXPOSURE = new ObjectPermissionKey("closeexposure", entity.Claim.class.getSimpleName(), new ClaimPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("expclose").withDescription("Permission to close an exposure on a claim").build()));
  
  public static final ObjectPermissionKey CLOSEMATTER = new ObjectPermissionKey("closematter", entity.Claim.class.getSimpleName(), new ClaimPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("mttrclose").withDescription("Permission to close a matter on a claim").build()));
  
  public static final StaticPermissionKey CREATE = new StaticPermissionKey("create", entity.Claim.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimcreate").withDescription("Permission to create a new claim").build());
  
  public static final ObjectPermissionKey CREATEACTIVITY = new ObjectPermissionKey("createactivity", entity.Claim.class.getSimpleName(), new ClaimStatePermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("actcreate", "actcreateclsd").withDescription("Permission to create a new activity on the claim. Checks create activity or create activity closed depending on the state of the claim").build()));
  
  public static final ObjectPermissionKey CREATEANYTRANSACTION = new ObjectPermissionKey("createanytransaction", entity.Claim.class.getSimpleName(), new CreateAnyTransactionPermissionHandler());
  
  public static final StaticPermissionKey CREATEASSOCIATION = new StaticPermissionKey("createassociation", entity.Claim.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("assocmanage").withDescription("Permission to create a new association between claims").build());
  
  public static final ObjectPermissionKey CREATEDOCUMENT = new ObjectPermissionKey("createdocument", entity.Claim.class.getSimpleName(), new ClaimStatePermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("doccreate", "doccreateclsd").withDescription("Permission to add a document to the claim. Checks add docs or add docs closed depending on the state of the claim").build()));
  
  public static final ObjectPermissionKey CREATEEVALUATION = new ObjectPermissionKey("createevaluation", entity.Claim.class.getSimpleName(), new ClaimPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("evalcreate").withDescription("Permission to create a new evaluation on a claim").build()));
  
  public static final ObjectPermissionKey CREATEEXPOSURE = new ObjectPermissionKey("createexposure", entity.Claim.class.getSimpleName(), new ClaimStatePermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("expcreate").withDescription("Permission to create new exposures").build()));
  
  public static final ObjectPermissionKey CREATEINCIDENT = new ObjectPermissionKey("createincident", entity.Claim.class.getSimpleName(), new ClaimStatePermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimedit", "claimeditclsd").withDescription("Permission to create a new incident on the claim. Checks edit claim or edit claim closed depending on the state of the claim").build()));
  
  public static final ObjectPermissionKey CREATEMANUALPAYMENT = new ObjectPermissionKey("createmanualpayment", entity.Claim.class.getSimpleName(), new ClaimFinancialsPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("manpaycreate").withDescription("Permission to create a manual payment on a claim").build()));
  
  public static final ObjectPermissionKey CREATEMATTER = new ObjectPermissionKey("creatematter", entity.Claim.class.getSimpleName(), new ClaimPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("mttrcreate").withDescription("Permission to create a new matter on a claim").build()));
  
  public static final ObjectPermissionKey CREATENEGOTIATION = new ObjectPermissionKey("createnegotiation", entity.Claim.class.getSimpleName(), new ClaimPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("ngtncreate").withDescription("Permission to create a new negotiation on a claim").build()));
  
  public static final ObjectPermissionKey CREATENOTE = new ObjectPermissionKey("createnote", entity.Claim.class.getSimpleName(), new ClaimStatePermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("notecreate", "notecreateclsd").withDescription("Permission to add a note to the claim. Checks add notes or add notes closed depending on the state of the claim").build()));
  
  public static final ObjectPermissionKey CREATEPAYMENT = new ObjectPermissionKey("createpayment", entity.Claim.class.getSimpleName(), new CreatePaymentPermissionHandler());
  
  public static final ObjectPermissionKey CREATERECOVERY = new ObjectPermissionKey("createrecovery", entity.Claim.class.getSimpleName(), new ClaimFinancialsPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("reccreate").withDescription("Permission to create a reserve on a claim").build()));
  
  public static final ObjectPermissionKey CREATERECOVERYRESERVE = new ObjectPermissionKey("createrecoveryreserve", entity.Claim.class.getSimpleName(), new CreateRecoveryReservePermissionHandler());
  
  public static final ObjectPermissionKey CREATERESERVE = new ObjectPermissionKey("createreserve", entity.Claim.class.getSimpleName(), new CreateReservePermissionHandler());
  
  public static final ObjectPermissionKey EDIT = new ObjectPermissionKey("edit", entity.Claim.class.getSimpleName(), new ClaimStatePermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimedit", "claimeditclsd").withDescription("Permission to edit the claim. Checks edit claim or edit claim closed depending on the state of the claim").build()));
  
  public static final StaticPermissionKey GENERICASSIGN = new StaticPermissionKey("genericassign", entity.Claim.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimraown", "claimraunown").withDescription("Permission to re-assign some claim").withDisplayKey("Java.Error.Permission.GenericClaimReassign").build());
  
  public static final StaticPermissionKey GENERICASSIGNOWNED = new StaticPermissionKey("genericassignowned", entity.Claim.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimraown").withDescription("Permission to re-assign some owned claim").withDisplayKey("Java.Error.Permission.GenericClaimReassignOwned").build());
  
  public static final StaticPermissionKey GENERICASSIGNUNOWNED = new StaticPermissionKey("genericassignunowned", entity.Claim.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimraunown").withDescription("Permission to re-assign some unowned claim").withDisplayKey("Java.Error.Permission.GenericClaimReassignUnowned").build());
  
  public static final StaticPermissionKey GENERICEDIT = new StaticPermissionKey("genericedit", entity.Claim.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimedit").withDescription("Permission to perform some sort of edit on some claim").build());
  
  public static final StaticPermissionKey GENERICREMOVEFLAG = new StaticPermissionKey("genericremoveflag", entity.Claim.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimremflag").withDescription("Permission to remove the flag on some claim").withDisplayKey("Java.Error.Permission.GenericRemoveFlag").build());
  
  public static final StaticPermissionKey GENERICVIEWACTIVITY = new StaticPermissionKey("genericviewactivity", entity.Claim.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("actview").withDescription("Permission to view activities on some claim").withDisplayKey("Java.Error.Permission.GenericViewActivities").build());
  
  public static final StaticPermissionKey GENERICVIEWCLAIM = new StaticPermissionKey("genericviewclaim", entity.Claim.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimview").withDescription("Permission to view some claim").withDisplayKey("Java.Error.Permission.GenericViewClaim").build());
  
  public static final StaticPermissionKey GENERICVIEWEXPOSURE = new StaticPermissionKey("genericviewexposure", entity.Claim.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("expview").withDescription("Permission to view exposures on some claim").withDisplayKey("Java.Error.Permission.GenericViewExposures").build());
  
  public static final StaticPermissionKey GENERICVIEWMATTER = new StaticPermissionKey("genericviewmatter", entity.Claim.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("mttrview").withDescription("Permission to view matters on some claim").withDisplayKey("Java.Error.Permission.GenericViewMatters").build());
  
  public static final StaticPermissionKey GENERICVIEWNETTOTALINCURRED = new StaticPermissionKey("genericviewnettotalincurred", entity.Claim.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimviewres", "claimviewrec", "claimviewpay").withDescription("Permission to view net total incurred information on a claim").withDisplayKey("Java.Error.Permission.GenericViewTransactions").build());
  
  public static final StaticPermissionKey GENERICVIEWPAYMENTS = new StaticPermissionKey("genericviewpayments", entity.Claim.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimviewpay").withDescription("Permission to view payments (and derived information) on some claim").withDisplayKey("Java.Error.Permission.GenericViewTransactions").build());
  
  public static final StaticPermissionKey GENERICVIEWRECOVERIES = new StaticPermissionKey("genericviewrecoveries", entity.Claim.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimviewrec").withDescription("Permission to view recoveries (and derived information) on some claim").withDisplayKey("Java.Error.Permission.GenericViewTransactions").build());
  
  public static final StaticPermissionKey GENERICVIEWRECOVERYRESERVES = new StaticPermissionKey("genericviewrecoveryreserves", entity.Claim.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimviewrecres").withDescription("Permission to view recovery reserves (and derived information) on some claim").withDisplayKey("Java.Error.Permission.GenericViewTransactions").build());
  
  public static final StaticPermissionKey GENERICVIEWRESERVES = new StaticPermissionKey("genericviewreserves", entity.Claim.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimviewres").withDescription("Permission to view reserves (and derived information) on some claim").withDisplayKey("Java.Error.Permission.GenericViewTransactions").build());
  
  public static final StaticPermissionKey GENERICVIEWTRANSACTIONS = new StaticPermissionKey("genericviewtransactions", entity.Claim.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimviewres", "claimviewrec", "claimviewrecres", "claimviewpay").withDescription("Permission to view transactions on some claim").withDisplayKey("Java.Error.Permission.GenericViewTransactions").build());
  
  public static final ObjectPermissionKey MANAGECLAIMUSERS = new ObjectPermissionKey("manageclaimusers", entity.Claim.class.getSimpleName(), new ClaimStatePermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimusermanage", "claimusermanclsd").withDescription("Permission to manage the parties involved on a claim. Checks claim users manage or claim users manage closed depending on the state of the claim").build()));
  
  public static final ObjectPermissionKey MANAGEPARTIESINVOLVED = new ObjectPermissionKey("managepartiesinvolved", entity.Claim.class.getSimpleName(), new ClaimStatePermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimprtsmanage", "claimprtsmanclsd").withDescription("Permission to manage the parties involved on a claim. Checks claim parties manage or claim parties manage closed depending on the state of the claim").build()));
  
  public static final StaticPermissionKey OWN = new StaticPermissionKey("own", entity.Claim.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimown").withDescription("Permission to own claims").build());
  
  public static final ObjectPermissionKey PRINT = new ObjectPermissionKey("print", entity.Claim.class.getSimpleName(), new PrintClaimPermissionHandler());
  
  public static final StaticPermissionKey PURGE = new StaticPermissionKey("purge", entity.Claim.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("purge").withDescription("Permission to purge a claim").build());
  
  public static final ObjectPermissionKey REMOVEFLAG = new ObjectPermissionKey("removeflag", entity.Claim.class.getSimpleName(), new ClaimPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimremflag").withDescription("Permission to remove the flag on a claim").build()));
  
  public static final ObjectPermissionKey REOPEN = new ObjectPermissionKey("reopen", entity.Claim.class.getSimpleName(), new ClaimPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimreopen").withDescription("Permission to reopen a claim").build()));
  
  public static final ObjectPermissionKey REOPENMATTER = new ObjectPermissionKey("reopenmatter", entity.Claim.class.getSimpleName(), new ClaimPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("mttrreopen").withDescription("Permission to reopen a matter on a claim").build()));
  
  public static final ObjectPermissionKey RETRYMESSAGE = new ObjectPermissionKey("retrymessage", entity.Claim.class.getSimpleName(), new ClaimPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimintegadmin").withDescription("Permission to retry a message on a claim").build()));
  
  public static final ObjectPermissionKey SELECTPOLICY = new ObjectPermissionKey("selectpolicy", entity.Claim.class.getSimpleName(), new ClaimStatePermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimselectplcy", "claimslplcyclsd").withDescription("Permission to select a new policy for an existing claim. Checks select policy or select policy closed depending on the state of the claim").build()));
  
  public static final ObjectPermissionKey VALIDATE = new ObjectPermissionKey("validate", entity.Claim.class.getSimpleName(), new ClaimPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimvalidate").withDescription("Permission to run validation rules on a claim").build()));
  
  public static final ObjectPermissionKey VIEW = new ObjectPermissionKey("view", entity.Claim.class.getSimpleName(), new ClaimPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimview").withDescription("Permission to view a claim").build()));
  
  public static final ObjectPermissionKey VIEWCONFIDENTIALNOTES = new ObjectPermissionKey("viewconfidentialnotes", entity.Claim.class.getSimpleName(), new ViewConfidentialNotesPermissionHandler());
  
  public static final ObjectPermissionKey VIEWNETTOTALINCURRED = new ObjectPermissionKey("viewnettotalincurred", entity.Claim.class.getSimpleName(), new ClaimPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimviewrec", "claimviewres", "claimviewpay").withDescription("Permission to view net total incurred information on a claim").build()));
  
  public static final ObjectPermissionKey VIEWPAYMENTS = new ObjectPermissionKey("viewpayments", entity.Claim.class.getSimpleName(), new ClaimPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimviewpay").withDescription("Permission to view checks and payments (and derived information) on a claim").build()));
  
  public static final ObjectPermissionKey VIEWRECOVERIES = new ObjectPermissionKey("viewrecoveries", entity.Claim.class.getSimpleName(), new ClaimPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimviewrec").withDescription("Permission to view recoveries (and derived information) on a claim").build()));
  
  public static final ObjectPermissionKey VIEWRECOVERYRESERVES = new ObjectPermissionKey("viewrecoveryreserves", entity.Claim.class.getSimpleName(), new ClaimPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimviewrecres").withDescription("Permission to view recovery reserves (and derived information) on a claim").build()));
  
  public static final ObjectPermissionKey VIEWRESERVES = new ObjectPermissionKey("viewreserves", entity.Claim.class.getSimpleName(), new ClaimPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimviewres").withDescription("Permission to view reserves (and derived information) on a claim").build()));
  
  public static final ObjectPermissionKey VIEWSYNCSTATUS = new ObjectPermissionKey("viewsyncstatus", entity.Claim.class.getSimpleName(), new ClaimPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("viewclaimsync").withDescription("Permission to view the sync status of a claim").build()));
  
  public static final ObjectPermissionKey VIEWTRANSACTIONDETAILS = new ObjectPermissionKey("viewtransactiondetails", entity.Claim.class.getSimpleName(), new ClaimAnyPermissionHandler(com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("claimviewres", "claimviewrec", "claimviewrecres", "claimviewpay").withDescription("Permission to view transaction details on a claim").build()));
  
  public static List<PermissionKey> getPermissionKeys() {
    List<PermissionKey> permissionKeys = new ArrayList<>();
    permissionKeys.add(ARCHIVE);
    permissionKeys.add(ASSIGN);
    permissionKeys.add(CLOSE);
    permissionKeys.add(CLOSEEXPOSURE);
    permissionKeys.add(CLOSEMATTER);
    permissionKeys.add(CREATE);
    permissionKeys.add(CREATEACTIVITY);
    permissionKeys.add(CREATEANYTRANSACTION);
    permissionKeys.add(CREATEASSOCIATION);
    permissionKeys.add(CREATEDOCUMENT);
    permissionKeys.add(CREATEEVALUATION);
    permissionKeys.add(CREATEEXPOSURE);
    permissionKeys.add(CREATEINCIDENT);
    permissionKeys.add(CREATEMANUALPAYMENT);
    permissionKeys.add(CREATEMATTER);
    permissionKeys.add(CREATENEGOTIATION);
    permissionKeys.add(CREATENOTE);
    permissionKeys.add(CREATEPAYMENT);
    permissionKeys.add(CREATERECOVERY);
    permissionKeys.add(CREATERECOVERYRESERVE);
    permissionKeys.add(CREATERESERVE);
    permissionKeys.add(EDIT);
    permissionKeys.add(GENERICASSIGN);
    permissionKeys.add(GENERICASSIGNOWNED);
    permissionKeys.add(GENERICASSIGNUNOWNED);
    permissionKeys.add(GENERICEDIT);
    permissionKeys.add(GENERICREMOVEFLAG);
    permissionKeys.add(GENERICVIEWACTIVITY);
    permissionKeys.add(GENERICVIEWCLAIM);
    permissionKeys.add(GENERICVIEWEXPOSURE);
    permissionKeys.add(GENERICVIEWMATTER);
    permissionKeys.add(GENERICVIEWNETTOTALINCURRED);
    permissionKeys.add(GENERICVIEWPAYMENTS);
    permissionKeys.add(GENERICVIEWRECOVERIES);
    permissionKeys.add(GENERICVIEWRECOVERYRESERVES);
    permissionKeys.add(GENERICVIEWRESERVES);
    permissionKeys.add(GENERICVIEWTRANSACTIONS);
    permissionKeys.add(MANAGECLAIMUSERS);
    permissionKeys.add(MANAGEPARTIESINVOLVED);
    permissionKeys.add(OWN);
    permissionKeys.add(PRINT);
    permissionKeys.add(PURGE);
    permissionKeys.add(REMOVEFLAG);
    permissionKeys.add(REOPEN);
    permissionKeys.add(REOPENMATTER);
    permissionKeys.add(RETRYMESSAGE);
    permissionKeys.add(SELECTPOLICY);
    permissionKeys.add(VALIDATE);
    permissionKeys.add(VIEW);
    permissionKeys.add(VIEWCONFIDENTIALNOTES);
    permissionKeys.add(VIEWNETTOTALINCURRED);
    permissionKeys.add(VIEWPAYMENTS);
    permissionKeys.add(VIEWRECOVERIES);
    permissionKeys.add(VIEWRECOVERYRESERVES);
    permissionKeys.add(VIEWRESERVES);
    permissionKeys.add(VIEWSYNCSTATUS);
    permissionKeys.add(VIEWTRANSACTIONDETAILS);
    return java.util.Collections.unmodifiableList(permissionKeys);
  }
  
  
}