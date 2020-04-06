package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Policy.eti;Policy.eix;Policy.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface PolicyInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ValidatableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.ClaimContactRoleOwnerInternal, com.guidewire._generated.entity.EventAwareInternal, com.guidewire.cc.domain.claim.ClaimContactRoleOwner, com.guidewire.cc.domain.policy.impl.PolicyInternal, com.guidewire.pl.system.bundle.CommitCallback, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.RemoveCallback, com.guidewire.pl.system.bundle.UpdateCallback, com.guidewire.pl.system.entity.LevelAwareValidatableBean, gw.cc.policy.entity.Policy {
  java.lang.String POLICYADDED_EVENT = "PolicyAdded";
  
  java.lang.String POLICYCHANGED_EVENT = "PolicyChanged";
  
  java.lang.String POLICYREMOVED_EVENT = "PolicyRemoved";
  
  /**
   * Adds the given element to the ClaimArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToClaimArray(entity.Claim element);
  
  
  /**
   * Adds the given element to the ClassCodes array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToClassCodes(entity.ClassCode element);
  
  
  /**
   * Adds the given element to the Contacts array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToContacts(entity.ClaimContact element);
  
  
  /**
   * Adds the given element to the Coverages array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCoverages(entity.PolicyCoverage element);
  
  
  /**
   * Adds the given element to the Endorsements array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToEndorsements(entity.Endorsement element);
  
  
  /**
   * Adds the given element to the PolicyLocations array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToPolicyLocations(entity.PolicyLocation element);
  
  
  /**
   * Adds the given element to the RiskUnits array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRiskUnits(entity.RiskUnit element);
  
  
  /**
   * Adds the given element to the Roles array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRoles(entity.ClaimContactRole element);
  
  
  /**
   * Adds the given element to the StatCodes array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToStatCodes(entity.StatCode element);
  
  
  /**
   * Gets the value of the AccountNumber field.
   * Account number that this Policy belongs to.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAccountNumber();
  
  
  /**
   * Gets the value of the CancellationDate field.
   * Date on which the policy was canceled.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCancellationDate();
  
  
  /**
   * Gets the value of the Claim field.
   * The claim that references this policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  /**
   * Gets the value of the ClaimArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim[] getClaimArray();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the ClassCodes field.
   * List of class codes covered by the Policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClassCode[] getClassCodes();
  
  
  /**
   * Gets the value of the Contacts field.
   * List of contacts associated with this policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimContact[] getContacts();
  
  
  /**
   * Gets the value of the CoverageForm field.
   * Policy's coverage form.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CoverageForm getCoverageForm();
  
  
  /**
   * Gets the value of the Coverages field.
   * List of coverages directly related to the policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PolicyCoverage[] getCoverages();
  
  
  /**
   * Gets the value of the Currency field.
   * The Currency of the policy. When set, the new value is also propagated to Claim.Currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency();
  
  
  /**
   * Gets the value of the CustomerServiceTier field.
   * Service tier behind this policy
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CustomerServiceTier getCustomerServiceTier();
  
  
  /**
   * Gets the value of the EffectiveDate field.
   * Date on which the policy is effective.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEffectiveDate();
  
  
  /**
   * Gets the value of the Endorsements field.
   * List of endorsements for the policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Endorsement[] getEndorsements();
  
  
  /**
   * Gets the value of the ExpirationDate field.
   * Date on which the policy expires.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getExpirationDate();
  
  
  /**
   * Gets the value of the FinancialInterests field.
   * Other financial interests of note.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFinancialInterests();
  
  
  /**
   * Gets the value of the InsuredSICCode field.
   * The insured's SIC code (for workers' comp policies only).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsuredSICCode();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Notes field.
   * Other notes on the policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNotes();
  
  
  /**
   * Gets the value of the OrigEffectiveDate field.
   * First effective date on which the policyholder had coverage.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getOrigEffectiveDate();
  
  
  /**
   * Gets the value of the OtherInsInfo field.
   * Notes about the insured's other insurance.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getOtherInsInfo();
  
  
  /**
   * Gets the value of the Participation field.
   * Participation percentage (for commercial policies only).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getParticipation();
  
  
  /**
   * Gets the value of the PolicyLocations field.
   * The list of all Locations available for use on this Policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PolicyLocation[] getPolicyLocations();
  
  
  /**
   * Gets the value of the PolicyNumber field.
   * Number of the policy (generally a string).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicyNumber();
  
  
  /**
   * Gets the value of the PolicyRatingPlan field.
   * Policy's rating plan (for workers' comp policies only).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PolicyRatingPlan getPolicyRatingPlan();
  
  
  /**
   * Gets the value of the PolicySource field.
   * Source of the policy information.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PolicySource getPolicySource();
  
  
  /**
   * Gets the value of the PolicySuffix field.
   * Indicates each unique period that a policy has been in effect.  (Sometimes called 'Mod' or 'Module.')
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicySuffix();
  
  
  /**
   * Gets the value of the PolicySystemPeriodID field.
   * The id of an associated external policy system period.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getPolicySystemPeriodID();
  
  
  /**
   * Gets the value of the PolicyType field.
   * Type of policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PolicyType getPolicyType();
  
  
  /**
   * Gets the value of the ProducerCode field.
   * Agency that sold the policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getProducerCode();
  
  
  /**
   * Gets the value of the ReportingDate field.
   * Extended reporting date for policies with extended coverage (for commercial policies only).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getReportingDate();
  
  
  /**
   * Gets the value of the RetroactiveDate field.
   * Retroactive date for policies with retroactive coverage (for commercial policies only).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getRetroactiveDate();
  
  
  /**
   * Gets the value of the RiskUnits field.
   * List of risk units covered by the policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RiskUnit[] getRiskUnits();
  
  
  /**
   * Gets the value of the Roles field.
   * The roles that this claimcontact has.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimContactRole[] getRoles();
  
  
  /**
   * Gets the value of the StatCodes field.
   * List of stat lines associated with the policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.StatCode[] getStatCodes();
  
  
  /**
   * Gets the value of the Status field.
   * Status of the policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PolicyStatus getStatus();
  
  
  /**
   * Gets the value of the TotalProperties field.
   * Total number of properties on the master version of the policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTotalProperties();
  
  
  /**
   * Gets the value of the TotalVehicles field.
   * Total number of vehicles on the master version of the policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTotalVehicles();
  
  
  /**
   * Gets the value of the UnderwritingCo field.
   * Underwriting company.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.UnderwritingCompanyType getUnderwritingCo();
  
  
  /**
   * Gets the value of the UnderwritingGroup field.
   * Underwriting group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.UnderwritingGroupType getUnderwritingGroup();
  
  
  /**
   * Gets the value of the ValidationLevel field.
   * Validation level that this object passed (if any) before it was stored.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ValidationLevel getValidationLevel();
  
  
  /**
   * Gets the value of the WCOtherStates field.
   * Other states in which coverage applies (for workers' comp policies only).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getWCOtherStates();
  
  
  /**
   * Gets the value of the WCStates field.
   * States in which coverage applies (for workers' comp policies only).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getWCStates();
  
  
  /**
   * Gets the value of the AssignedRisk field.
   * The policy is an Assigned risk from the state or not.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAssignedRisk();
  
  
  /**
   * Gets the value of the ForeignCoverage field.
   * Whether the insured has foreign coverage.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isForeignCoverage();
  
  
  /**
   * Gets the value of the OtherInsurance field.
   * Whether the insured has other insurance.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isOtherInsurance();
  
  
  /**
   * Gets the value of the ReturnToWorkPrgm field.
   * Return to work program (for workers' comp policies only).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isReturnToWorkPrgm();
  
  
  /**
   * Gets the value of the Verified field.
   * True if no non-internal fields have been changed since this policy was retrieved from external system.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isVerified();
  
  
  /**
   * Removes the given element from the ClaimArray array. This is achieved by marking the element for removal.
   */
  public void removeFromClaimArray(entity.Claim element);
  
  
  /**
   * Removes the given element from the ClaimArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClaimArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ClassCodes array. This is achieved by marking the element for removal.
   */
  public void removeFromClassCodes(entity.ClassCode element);
  
  
  /**
   * Removes the given element from the ClassCodes array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClassCodes(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Contacts array. This is achieved by marking the element for removal.
   */
  public void removeFromContacts(entity.ClaimContact element);
  
  
  /**
   * Removes the given element from the Contacts array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromContacts(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Coverages array. This is achieved by marking the element for removal.
   */
  public void removeFromCoverages(entity.PolicyCoverage element);
  
  
  /**
   * Removes the given element from the Coverages array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCoverages(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Endorsements array. This is achieved by marking the element for removal.
   */
  public void removeFromEndorsements(entity.Endorsement element);
  
  
  /**
   * Removes the given element from the Endorsements array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromEndorsements(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the PolicyLocations array. This is achieved by marking the element for removal.
   */
  public void removeFromPolicyLocations(entity.PolicyLocation element);
  
  
  /**
   * Removes the given element from the PolicyLocations array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromPolicyLocations(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the RiskUnits array. This is achieved by marking the element for removal.
   */
  public void removeFromRiskUnits(entity.RiskUnit element);
  
  
  /**
   * Removes the given element from the RiskUnits array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRiskUnits(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Roles array. This is achieved by marking the element for removal.
   */
  public void removeFromRoles(entity.ClaimContactRole element);
  
  
  /**
   * Removes the given element from the Roles array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRoles(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the StatCodes array. This is achieved by marking the element for removal.
   */
  public void removeFromStatCodes(entity.StatCode element);
  
  
  /**
   * Removes the given element from the StatCodes array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromStatCodes(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the AccountNumber field.
   */
  public void setAccountNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the AssignedRisk field.
   */
  public void setAssignedRisk(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the CancellationDate field.
   */
  public void setCancellationDate(java.util.Date value);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  /**
   * Sets the value of the ClaimArray field.
   */
  public void setClaimArray(entity.Claim[] value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClassCodes field.
   */
  public void setClassCodes(entity.ClassCode[] value);
  
  
  /**
   * Sets the value of the Contacts field.
   */
  public void setContacts(entity.ClaimContact[] value);
  
  
  /**
   * Sets the value of the CoverageForm field.
   */
  public void setCoverageForm(typekey.CoverageForm value);
  
  
  /**
   * Sets the value of the Coverages field.
   */
  public void setCoverages(entity.PolicyCoverage[] value);
  
  
  /**
   * Sets the value of the Currency field.
   */
  public void setCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the CustomerServiceTier field.
   */
  public void setCustomerServiceTier(typekey.CustomerServiceTier value);
  
  
  /**
   * Sets the value of the EffectiveDate field.
   */
  public void setEffectiveDate(java.util.Date value);
  
  
  /**
   * Sets the value of the Endorsements field.
   */
  public void setEndorsements(entity.Endorsement[] value);
  
  
  /**
   * Sets the value of the ExpirationDate field.
   */
  public void setExpirationDate(java.util.Date value);
  
  
  /**
   * Sets the value of the FinancialInterests field.
   */
  public void setFinancialInterests(java.lang.String value);
  
  
  /**
   * Sets the value of the ForeignCoverage field.
   */
  public void setForeignCoverage(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the InsuredSICCode field.
   */
  public void setInsuredSICCode(java.lang.String value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Notes field.
   */
  public void setNotes(java.lang.String value);
  
  
  /**
   * Sets the value of the OrigEffectiveDate field.
   */
  public void setOrigEffectiveDate(java.util.Date value);
  
  
  /**
   * Sets the value of the OtherInsInfo field.
   */
  public void setOtherInsInfo(java.lang.String value);
  
  
  /**
   * Sets the value of the OtherInsurance field.
   */
  public void setOtherInsurance(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Participation field.
   */
  public void setParticipation(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the PolicyLocations field.
   */
  public void setPolicyLocations(entity.PolicyLocation[] value);
  
  
  /**
   * Sets the value of the PolicyNumber field.
   */
  public void setPolicyNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the PolicyRatingPlan field.
   */
  public void setPolicyRatingPlan(typekey.PolicyRatingPlan value);
  
  
  /**
   * Sets the value of the PolicySource field.
   */
  public void setPolicySource(typekey.PolicySource value);
  
  
  /**
   * Sets the value of the PolicySuffix field.
   */
  public void setPolicySuffix(java.lang.String value);
  
  
  /**
   * Sets the value of the PolicySystemPeriodID field.
   */
  public void setPolicySystemPeriodID(java.lang.Long value);
  
  
  /**
   * Sets the value of the PolicyType field.
   */
  public void setPolicyType(typekey.PolicyType value);
  
  
  /**
   * Sets the value of the ProducerCode field.
   */
  public void setProducerCode(java.lang.String value);
  
  
  /**
   * Sets the value of the ReportingDate field.
   */
  public void setReportingDate(java.util.Date value);
  
  
  /**
   * Sets the value of the RetroactiveDate field.
   */
  public void setRetroactiveDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ReturnToWorkPrgm field.
   */
  public void setReturnToWorkPrgm(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the RiskUnits field.
   */
  public void setRiskUnits(entity.RiskUnit[] value);
  
  
  /**
   * Sets the value of the Roles field.
   */
  public void setRoles(entity.ClaimContactRole[] value);
  
  
  /**
   * Sets the value of the StatCodes field.
   */
  public void setStatCodes(entity.StatCode[] value);
  
  
  /**
   * Sets the value of the Status field.
   */
  public void setStatus(typekey.PolicyStatus value);
  
  
  /**
   * Sets the value of the TotalProperties field.
   */
  public void setTotalProperties(java.lang.Integer value);
  
  
  /**
   * Sets the value of the TotalVehicles field.
   */
  public void setTotalVehicles(java.lang.Integer value);
  
  
  /**
   * Sets the value of the UnderwritingCo field.
   */
  public void setUnderwritingCo(typekey.UnderwritingCompanyType value);
  
  
  /**
   * Sets the value of the UnderwritingGroup field.
   */
  public void setUnderwritingGroup(typekey.UnderwritingGroupType value);
  
  
  /**
   * Sets the value of the ValidationLevel field.
   */
  public void setValidationLevel(typekey.ValidationLevel value);
  
  
  /**
   * Sets the value of the Verified field.
   */
  public void setVerified(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the WCOtherStates field.
   */
  public void setWCOtherStates(java.lang.String value);
  
  
  /**
   * Sets the value of the WCStates field.
   */
  public void setWCStates(java.lang.String value);
  
  
  
}