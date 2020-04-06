package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimInfo.eti;ClaimInfo.eix;ClaimInfo.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimInfoInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.RootInfoInternal, com.guidewire._generated.entity.EventAwareInternal, com.guidewire.cc.domain.claim.archiving.impl.ClaimInfoInternal, com.guidewire.cc.domain.purging.Purgeable, gw.api.claim.PurgeClaimInfoMethods, gw.cc.claim.archiving.entity.ClaimInfo {
  java.lang.String CLAIMINFOADDED_EVENT = "ClaimInfoAdded";
  
  java.lang.String CLAIMINFOCHANGED_EVENT = "ClaimInfoChanged";
  
  java.lang.String CLAIMINFOPURGED_EVENT = "ClaimInfoPurged";
  
  java.lang.String CLAIMINFOREMOVED_EVENT = "ClaimInfoRemoved";
  
  /**
   * Adds the given element to the Access array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToAccess(entity.ClaimInfoAccess element);
  
  
  /**
   * Adds the given element to the ClaimAggregateLimitRpts array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToClaimAggregateLimitRpts(entity.ClaimAggregateLimitRpt element);
  
  
  /**
   * Adds the given element to the ClaimInAssociations array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToClaimInAssociations(entity.ClaimInAssociation element);
  
  
  /**
   * Adds the given element to the Contacts array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToContacts(entity.ContactInfo element);
  
  
  /**
   * Adds the given element to the CoverageLineMatchData array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCoverageLineMatchData(entity.CoverageLineMatchDataInfo element);
  
  
  /**
   * Adds the given element to the LossLocationArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToLossLocationArray(entity.LocationInfo element);
  
  
  /**
   * Adds the given element to the PeriodPolicies array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToPeriodPolicies(entity.PeriodPolicy element);
  
  
  /**
   * Gets the value of the Access field.
   * The access control objects for this claim info.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimInfoAccess[] getAccess();
  
  
  /**
   * Gets the value of the Adjuster field.
   * Assigned user on Claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getAdjuster();
  
  
  public gw.pl.persistence.core.Key getAdjusterID();
  
  
  /**
   * Gets the value of the AssignedGroup field.
   * Assigned group on Claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getAssignedGroup();
  
  
  public gw.pl.persistence.core.Key getAssignedGroupID();
  
  
  /**
   * Gets the value of the Claim field.
   * Claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  /**
   * Gets the value of the ClaimAggregateLimitRpts field.
   * Denormalized data for this claim per policyperiod.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimAggregateLimitRpt[] getClaimAggregateLimitRpts();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the ClaimInAssociations field.
   * All the ClaimInAssociation entities for the Claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimInAssociation[] getClaimInAssociations();
  
  
  /**
   * Gets the value of the ClaimNumber field.
   * The external identifier of the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimNumber();
  
  
  /**
   * Gets the value of the Contacts field.
   * all the cached contacts (insured and claimant) for the archived claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ContactInfo[] getContacts();
  
  
  /**
   * Gets the value of the CoverageLineMatchData field.
   * Contains the coverage specifications for which at least one transaction exists on the archived claim. This is used to prevent future aggregate limits from being applied to coverage specifications where an archived claim's transaction would contribute, since it would no longer be possible to calculate the contribution of the archived claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CoverageLineMatchDataInfo[] getCoverageLineMatchData();
  
  
  /**
   * Gets the value of the Currency field.
   * The currency for the claim, copied from the claim when the claim is archived. Always null for active claims. May also be null for pre 8.0 archived claims
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency();
  
  
  /**
   * Gets the value of the JurisdictionState field.
   * The state of jurisdiction. Denormed from claim.JurisdictionState
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Jurisdiction getJurisdictionState();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the LossDate field.
   * Cached LossDate on Claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getLossDate();
  
  
  /**
   * Gets the value of the LossLocation field.
   * The loss location information for the archived claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LocationInfo getLossLocation();
  
  
  /**
   * Gets the value of the LossLocationArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LocationInfo[] getLossLocationArray();
  
  
  /**
   * Gets the value of the LossLocationCode field.
   * Location Code denormed from claim.LossLocationCode
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLossLocationCode();
  
  
  public gw.pl.persistence.core.Key getLossLocationID();
  
  
  /**
   * Gets the value of the NoticeDate field.
   * Cached ReportedDate on Claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getNoticeDate();
  
  
  /**
   * Gets the value of the PeriodPolicies field.
   * Array of PeriodPolicy beans associated with this ClaimInfo - only used internally for getting the PolicyPeriods off a Claim/Policy
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PeriodPolicy[] getPeriodPolicies();
  
  
  /**
   * Gets the value of the PolicyNumber field.
   * Number of the policy (generally a string).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicyNumber();
  
  
  /**
   * Gets the value of the PurgeDate field.
   * Date at which the claim should be purged. Configurations can use this field to decide when to mark the claim for purge, and there are sample Claim Closed and Claim Reopened rules to set it. It is not used by the internal purge logic.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getPurgeDate();
  
  
  /**
   * Gets the value of the RootPublicID field.
   * The public ID of the root.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRootPublicID();
  
  
  /**
   * Gets the value of the UCR_Ext field.
   * A Unique Claim Reference (UCR) Number
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getUCR_Ext();
  
  
  /**
   * Gets the value of the UMR_Ext field.
   * A Unique Market Reference (UMR) Number
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getUMR_Ext();
  
  
  /**
   * Gets the value of the CoverageLineMatchDataInfoValid field.
   * True for archived claims which have an accurate CoverageLineMatchDataInfo array, false otherwise
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCoverageLineMatchDataInfoValid();
  
  
  /**
   * Removes the given element from the Access array. This is achieved by marking the element for removal.
   */
  public void removeFromAccess(entity.ClaimInfoAccess element);
  
  
  /**
   * Removes the given element from the Access array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromAccess(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ClaimAggregateLimitRpts array. This is achieved by marking the element for removal.
   */
  public void removeFromClaimAggregateLimitRpts(entity.ClaimAggregateLimitRpt element);
  
  
  /**
   * Removes the given element from the ClaimAggregateLimitRpts array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClaimAggregateLimitRpts(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ClaimInAssociations array. This is achieved by marking the element for removal.
   */
  public void removeFromClaimInAssociations(entity.ClaimInAssociation element);
  
  
  /**
   * Removes the given element from the ClaimInAssociations array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClaimInAssociations(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Contacts array. This is achieved by marking the element for removal.
   */
  public void removeFromContacts(entity.ContactInfo element);
  
  
  /**
   * Removes the given element from the Contacts array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromContacts(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the CoverageLineMatchData array. This is achieved by marking the element for removal.
   */
  public void removeFromCoverageLineMatchData(entity.CoverageLineMatchDataInfo element);
  
  
  /**
   * Removes the given element from the CoverageLineMatchData array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCoverageLineMatchData(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the LossLocationArray array. This is achieved by marking the element for removal.
   */
  public void removeFromLossLocationArray(entity.LocationInfo element);
  
  
  /**
   * Removes the given element from the LossLocationArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromLossLocationArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the PeriodPolicies array. This is achieved by marking the element for removal.
   */
  public void removeFromPeriodPolicies(entity.PeriodPolicy element);
  
  
  /**
   * Removes the given element from the PeriodPolicies array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromPeriodPolicies(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Access field.
   */
  public void setAccess(entity.ClaimInfoAccess[] value);
  
  
  /**
   * Sets the value of the Adjuster field.
   */
  public void setAdjuster(entity.User value);
  
  
  public void setAdjusterID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the AssignedGroup field.
   */
  public void setAssignedGroup(entity.Group value);
  
  
  public void setAssignedGroupID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  /**
   * Sets the value of the ClaimAggregateLimitRpts field.
   */
  public void setClaimAggregateLimitRpts(entity.ClaimAggregateLimitRpt[] value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClaimInAssociations field.
   */
  public void setClaimInAssociations(entity.ClaimInAssociation[] value);
  
  
  /**
   * Sets the value of the ClaimNumber field.
   */
  public void setClaimNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the Contacts field.
   */
  public void setContacts(entity.ContactInfo[] value);
  
  
  /**
   * Sets the value of the CoverageLineMatchData field.
   */
  public void setCoverageLineMatchData(entity.CoverageLineMatchDataInfo[] value);
  
  
  /**
   * Sets the value of the CoverageLineMatchDataInfoValid field.
   */
  public void setCoverageLineMatchDataInfoValid(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Currency field.
   */
  public void setCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the JurisdictionState field.
   */
  public void setJurisdictionState(typekey.Jurisdiction value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the LossDate field.
   */
  public void setLossDate(java.util.Date value);
  
  
  /**
   * Sets the value of the LossLocation field.
   */
  public void setLossLocation(entity.LocationInfo value);
  
  
  /**
   * Sets the value of the LossLocationArray field.
   */
  public void setLossLocationArray(entity.LocationInfo[] value);
  
  
  /**
   * Sets the value of the LossLocationCode field.
   */
  public void setLossLocationCode(java.lang.String value);
  
  
  public void setLossLocationID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the NoticeDate field.
   */
  public void setNoticeDate(java.util.Date value);
  
  
  /**
   * Sets the value of the PeriodPolicies field.
   */
  public void setPeriodPolicies(entity.PeriodPolicy[] value);
  
  
  /**
   * Sets the value of the PolicyNumber field.
   */
  public void setPolicyNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the PurgeDate field.
   */
  public void setPurgeDate(java.util.Date value);
  
  
  /**
   * Sets the value of the RootPublicID field.
   */
  public void setRootPublicID(java.lang.String value);
  
  
  /**
   * Sets the value of the UCR_Ext field.
   */
  public void setUCR_Ext(java.lang.String value);
  
  
  /**
   * Sets the value of the UMR_Ext field.
   */
  public void setUMR_Ext(java.lang.String value);
  
  
  
}