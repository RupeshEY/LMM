package com.guidewire._generated.security;

import com.guidewire.pl.system.security.PermissionKey;
import gw.entity.IEntityType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated(comments = "security-config-app.xml;security-config-pl.xml;security-config.xml", date = "", value = "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
public class PermKeyAccess {
  public static Map<IEntityType,List<PermissionKey>> getAllPermissionKeys() {
    Map<IEntityType,List<PermissionKey>> allPermissionKeys = new HashMap<>();
    allPermissionKeys.put(entity.Activity.TYPE.get(), ActivityPermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.ActivityPattern.TYPE.get(), ActivityPatternPermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.ActivityRule.TYPE.get(), ActivityRulePermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.Attribute.TYPE.get(), AttributePermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.AttributeUser.TYPE.get(), AttributeUserPermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.AuthorityLimit.TYPE.get(), AuthorityLimitPermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.AuthorityLimitProfile.TYPE.get(), AuthorityLimitProfilePermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.BulkInvoice.TYPE.get(), BulkInvoicePermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.BusinessWeek.TYPE.get(), BusinessWeekPermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.Catastrophe.TYPE.get(), CatastrophePermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.Check.TYPE.get(), CheckPermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.Claim.TYPE.get(), ClaimPermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.ClaimAssociation.TYPE.get(), ClaimAssociationPermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.ClaimInfo.TYPE.get(), ClaimInfoPermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.ClaimMetricLimit.TYPE.get(), ClaimMetricLimitPermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.Contact.TYPE.get(), ContactPermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.Credential.TYPE.get(), CredentialPermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.Document.TYPE.get(), DocumentPermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.Evaluation.TYPE.get(), EvaluationPermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.ExchangeRate.TYPE.get(), ExchangeRatePermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.Exposure.TYPE.get(), ExposurePermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.Group.TYPE.get(), GroupPermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.GroupRegion.TYPE.get(), GroupRegionPermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.GroupUser.TYPE.get(), GroupUserPermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.Holiday.TYPE.get(), HolidayPermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.Incident.TYPE.get(), IncidentPermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.Matter.TYPE.get(), MatterPermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.Negotiation.TYPE.get(), NegotiationPermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.Note.TYPE.get(), NotePermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.Payment.TYPE.get(), PaymentPermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.Policy.TYPE.get(), PolicyPermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.Recovery.TYPE.get(), RecoveryPermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.RecoveryReserve.TYPE.get(), RecoveryReservePermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.RecoveryReserveSet.TYPE.get(), RecoveryReserveSetPermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.RecoverySet.TYPE.get(), RecoverySetPermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.Region.TYPE.get(), RegionPermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.Reserve.TYPE.get(), ReservePermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.ReserveSet.TYPE.get(), ReserveSetPermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.Review.TYPE.get(), ReviewPermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.Role.TYPE.get(), RolePermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.RolePrivilege.TYPE.get(), RolePrivilegePermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.ScriptParameter.TYPE.get(), ScriptParameterPermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.SecurityZone.TYPE.get(), SecurityZonePermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.Subrogation.TYPE.get(), SubrogationPermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.Transaction.TYPE.get(), TransactionPermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.TransactionSet.TYPE.get(), TransactionSetPermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.User.TYPE.get(), UserPermKeys.getPermissionKeys());
    allPermissionKeys.put(entity.UserRole.TYPE.get(), UserRolePermKeys.getPermissionKeys());
    return java.util.Collections.unmodifiableMap(allPermissionKeys);
  }
  
  
}