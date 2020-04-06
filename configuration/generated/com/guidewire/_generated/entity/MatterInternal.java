package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Matter.eti;Matter.eix;Matter.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface MatterInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ValidatableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.CCAssignableInternal, com.guidewire._generated.entity.ClaimContactRoleOwnerInternal, com.guidewire._generated.entity.EventAwareInternal, com.guidewire.cc.domain.claim.ClaimContactRoleOwner, com.guidewire.cc.domain.matter.impl.MatterInternal, com.guidewire.pl.domain.assignment.AssignablePublicMethods, com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods, com.guidewire.pl.system.bundle.CommitCallback, com.guidewire.pl.system.entity.LevelAwareValidatableBean, com.guidewire.pl.system.entity.PermissionAssignableCheck, gw.api.assignment.CCAssignableMethods, gw.cc.assignment.entity.CCAssignable, gw.cc.matter.entity.Matter {
  java.lang.String MATTERADDED_EVENT = "MatterAdded";
  
  java.lang.String MATTERCHANGED_EVENT = "MatterChanged";
  
  java.lang.String MATTERREMOVED_EVENT = "MatterRemoved";
  
  /**
   * Adds the given element to the BudgetLines array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToBudgetLines(entity.BudgetLine element);
  
  
  /**
   * Adds the given element to the Exposures array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToExposures(entity.MatterExposure element);
  
  
  /**
   * Adds the given element to the Roles array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRoles(entity.ClaimContactRole element);
  
  
  /**
   * Adds the given element to the StatusTypeLines array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToStatusTypeLines(entity.LitStatusTypeLine element);
  
  
  /**
   * Gets the value of the AdDamnumAmount field.
   * Ad Damnum Amount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getAdDamnumAmount();
  
  
  /**
   * Gets the value of the ArbitrationDate field.
   * Current schedule trial date.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getArbitrationDate();
  
  
  /**
   * Gets the value of the ArbitrationRoom field.
   * Room number in the arbitration venue.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getArbitrationRoom();
  
  
  /**
   * Gets the value of the BudgetLines field.
   * An array of budget line records
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BudgetLine[] getBudgetLines();
  
  
  /**
   * Gets the value of the CaseNumber field.
   * Official reference number for the lawsuit
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCaseNumber();
  
  
  /**
   * Gets the value of the Claim field.
   * The claim associated with this legal matter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the CourtDistrict field.
   * Court jurisdictional district
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MatterCourtDistrict getCourtDistrict();
  
  
  /**
   * Gets the value of the CourtType field.
   * Court type
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MatterCourtType getCourtType();
  
  
  /**
   * Gets the value of the DefenseApptDate field.
   * Date the defense counsel was appointed to this matter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDefenseApptDate();
  
  
  /**
   * Gets the value of the DocketNumber field.
   * Court docket number
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDocketNumber();
  
  
  /**
   * Gets the value of the Exposures field.
   * The list of exposures to which this matter relates.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.MatterExposure[] getExposures();
  
  
  /**
   * Gets the value of the FileDate field.
   * Date the trial was filed in court.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getFileDate();
  
  
  /**
   * Gets the value of the FilingDate field.
   * Filing date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getFilingDate();
  
  
  /**
   * Gets the value of the FinalLegalCost field.
   * The final legal cost.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getFinalLegalCost();
  
  
  /**
   * Gets the value of the FinalSettleCost field.
   * The final settlement cost.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getFinalSettleCost();
  
  
  /**
   * Gets the value of the FinalSettleDate field.
   * The actual date of the final settlement (as opposed to the date of the payment).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getFinalSettleDate();
  
  
  /**
   * Gets the value of the HearingDate field.
   * Current scheduled matter hearing date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getHearingDate();
  
  
  /**
   * Gets the value of the HearingRoom field.
   * Room number in the hearing venue.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getHearingRoom();
  
  
  /**
   * Gets the value of the LegalSpecialty field.
   * Legal specialty needed for this matter
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LegalSpecialty getLegalSpecialty();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the MatterCaseNumber field.
   * Case number
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMatterCaseNumber();
  
  
  /**
   * Gets the value of the MatterType field.
   * Type of Matter such as General, Lawsuit, Arbitration, Hearing or Mediation
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MatterType getMatterType();
  
  
  /**
   * Gets the value of the MediationDate field.
   * Date this matter entered mediation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getMediationDate();
  
  
  /**
   * Gets the value of the MediationRoom field.
   * Room number in the mediation venue.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMediationRoom();
  
  
  /**
   * Gets the value of the MethodServed field.
   * Method served
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MatterMethodServed getMethodServed();
  
  
  /**
   * Gets the value of the Name field.
   * Then name for this matter. Typically of the form 'X vs. Y' once the matter goes to trial.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the PrimaryCause field.
   * Why the lawsuit was brought in the first place.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PrimaryCauseType getPrimaryCause();
  
  
  /**
   * Gets the value of the PunitiveAmount field.
   * Punitive damages amount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getPunitiveAmount();
  
  
  /**
   * Gets the value of the ReopenedReason field.
   * The reason for reopening the matter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MatterReopenedReason getReopenedReason();
  
  
  /**
   * Gets the value of the Resolution field.
   * The type of resolution.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ResolutionType getResolution();
  
  
  /**
   * Gets the value of the ResponseDue field.
   * Response Due
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getResponseDue();
  
  
  /**
   * Gets the value of the ResponseFiled field.
   * Response filed
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getResponseFiled();
  
  
  /**
   * Gets the value of the RiskType field.
   * Describes the overall risk on this matter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MatterRiskType getRiskType();
  
  
  /**
   * Gets the value of the Roles field.
   * The roles that this claimcontact has.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimContactRole[] getRoles();
  
  
  /**
   * Gets the value of the Room field.
   * Room number in the venue.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRoom();
  
  
  /**
   * Gets the value of the SentToDefenseDate field.
   * Date this matter was sent to the defense attorney.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getSentToDefenseDate();
  
  
  /**
   * Gets the value of the ServiceDate field.
   * Service date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getServiceDate();
  
  
  /**
   * Gets the value of the StatusTypeLines field.
   * The progression of status type lines on this matter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LitStatusTypeLine[] getStatusTypeLines();
  
  
  /**
   * Gets the value of the SubrogationSummary field.
   * Subrogation information related to this matter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SubrogationSummary getSubrogationSummary();
  
  
  public gw.pl.persistence.core.Key getSubrogationSummaryID();
  
  
  /**
   * Gets the value of the SuitType field.
   * The type of suit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SuitType getSuitType();
  
  
  /**
   * Gets the value of the TrialDate field.
   * Current schedule trial date.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getTrialDate();
  
  
  /**
   * Gets the value of the ValidationLevel field.
   * Validation level the matter passed (if any) the last time it was checked.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ValidationLevel getValidationLevel();
  
  
  /**
   * Gets the value of the VenueRating field.
   * Rating of venue for this matter
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MatterVenueRating getVenueRating();
  
  
  /**
   * Gets the value of the AdDamnumSpecified field.
   * Was Ad Damnum specified?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAdDamnumSpecified();
  
  
  /**
   * Gets the value of the Arbitration field.
   * Whether a suit has gone into arbitration.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isArbitration();
  
  
  /**
   * Gets the value of the DeclaratoryJgmt field.
   * Whether the court has been asked to make a declaratory judgment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isDeclaratoryJgmt();
  
  
  /**
   * Gets the value of the FirstNotice field.
   * Whether the lawsuit was the first notice of the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isFirstNotice();
  
  
  /**
   * Gets the value of the MotionSummaryJgmt field.
   * Whether this matter has a motion for summary judgment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isMotionSummaryJgmt();
  
  
  /**
   * Gets the value of the PunitiveDamages field.
   * Punitive damages?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPunitiveDamages();
  
  
  /**
   * Gets the value of the StructuredSettle field.
   * Whether this matter is a good candidate for structured settlement.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isStructuredSettle();
  
  
  /**
   * Gets the value of the SubroRelated field.
   * Boolean field to mark if Matter related to Subrogation
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isSubroRelated();
  
  
  /**
   * Removes the given element from the BudgetLines array. This is achieved by marking the element for removal.
   */
  public void removeFromBudgetLines(entity.BudgetLine element);
  
  
  /**
   * Removes the given element from the BudgetLines array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromBudgetLines(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Exposures array. This is achieved by marking the element for removal.
   */
  public void removeFromExposures(entity.MatterExposure element);
  
  
  /**
   * Removes the given element from the Exposures array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromExposures(gw.pl.persistence.core.Key elementID);
  
  
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
   * Removes the given element from the StatusTypeLines array. This is achieved by marking the element for removal.
   */
  public void removeFromStatusTypeLines(entity.LitStatusTypeLine element);
  
  
  /**
   * Removes the given element from the StatusTypeLines array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromStatusTypeLines(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the AdDamnumAmount field.
   */
  public void setAdDamnumAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the AdDamnumSpecified field.
   */
  public void setAdDamnumSpecified(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Arbitration field.
   */
  public void setArbitration(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ArbitrationDate field.
   */
  public void setArbitrationDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ArbitrationRoom field.
   */
  public void setArbitrationRoom(java.lang.String value);
  
  
  /**
   * Sets the value of the BudgetLines field.
   */
  public void setBudgetLines(entity.BudgetLine[] value);
  
  
  /**
   * Sets the value of the CaseNumber field.
   */
  public void setCaseNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the CourtDistrict field.
   */
  public void setCourtDistrict(typekey.MatterCourtDistrict value);
  
  
  /**
   * Sets the value of the CourtType field.
   */
  public void setCourtType(typekey.MatterCourtType value);
  
  
  /**
   * Sets the value of the DeclaratoryJgmt field.
   */
  public void setDeclaratoryJgmt(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the DefenseApptDate field.
   */
  public void setDefenseApptDate(java.util.Date value);
  
  
  /**
   * Sets the value of the DocketNumber field.
   */
  public void setDocketNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the Exposures field.
   */
  public void setExposures(entity.MatterExposure[] value);
  
  
  /**
   * Sets the value of the FileDate field.
   */
  public void setFileDate(java.util.Date value);
  
  
  /**
   * Sets the value of the FilingDate field.
   */
  public void setFilingDate(java.util.Date value);
  
  
  /**
   * Sets the value of the FinalLegalCost field.
   */
  public void setFinalLegalCost(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the FinalSettleCost field.
   */
  public void setFinalSettleCost(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the FinalSettleDate field.
   */
  public void setFinalSettleDate(java.util.Date value);
  
  
  /**
   * Sets the value of the FirstNotice field.
   */
  public void setFirstNotice(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the HearingDate field.
   */
  public void setHearingDate(java.util.Date value);
  
  
  /**
   * Sets the value of the HearingRoom field.
   */
  public void setHearingRoom(java.lang.String value);
  
  
  /**
   * Sets the value of the LegalSpecialty field.
   */
  public void setLegalSpecialty(typekey.LegalSpecialty value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the MatterCaseNumber field.
   */
  public void setMatterCaseNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the MatterType field.
   */
  public void setMatterType(typekey.MatterType value);
  
  
  /**
   * Sets the value of the MediationDate field.
   */
  public void setMediationDate(java.util.Date value);
  
  
  /**
   * Sets the value of the MediationRoom field.
   */
  public void setMediationRoom(java.lang.String value);
  
  
  /**
   * Sets the value of the MethodServed field.
   */
  public void setMethodServed(typekey.MatterMethodServed value);
  
  
  /**
   * Sets the value of the MotionSummaryJgmt field.
   */
  public void setMotionSummaryJgmt(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the PrimaryCause field.
   */
  public void setPrimaryCause(typekey.PrimaryCauseType value);
  
  
  /**
   * Sets the value of the PunitiveAmount field.
   */
  public void setPunitiveAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the PunitiveDamages field.
   */
  public void setPunitiveDamages(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ReopenedReason field.
   */
  public void setReopenedReason(typekey.MatterReopenedReason value);
  
  
  /**
   * Sets the value of the Resolution field.
   */
  public void setResolution(typekey.ResolutionType value);
  
  
  /**
   * Sets the value of the ResponseDue field.
   */
  public void setResponseDue(java.util.Date value);
  
  
  /**
   * Sets the value of the ResponseFiled field.
   */
  public void setResponseFiled(java.util.Date value);
  
  
  /**
   * Sets the value of the RiskType field.
   */
  public void setRiskType(typekey.MatterRiskType value);
  
  
  /**
   * Sets the value of the Roles field.
   */
  public void setRoles(entity.ClaimContactRole[] value);
  
  
  /**
   * Sets the value of the Room field.
   */
  public void setRoom(java.lang.String value);
  
  
  /**
   * Sets the value of the SentToDefenseDate field.
   */
  public void setSentToDefenseDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ServiceDate field.
   */
  public void setServiceDate(java.util.Date value);
  
  
  /**
   * Sets the value of the StatusTypeLines field.
   */
  public void setStatusTypeLines(entity.LitStatusTypeLine[] value);
  
  
  /**
   * Sets the value of the StructuredSettle field.
   */
  public void setStructuredSettle(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the SubroRelated field.
   */
  public void setSubroRelated(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the SubrogationSummary field.
   */
  public void setSubrogationSummary(entity.SubrogationSummary value);
  
  
  public void setSubrogationSummaryID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the SuitType field.
   */
  public void setSuitType(typekey.SuitType value);
  
  
  /**
   * Sets the value of the TrialDate field.
   */
  public void setTrialDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ValidationLevel field.
   */
  public void setValidationLevel(typekey.ValidationLevel value);
  
  
  /**
   * Sets the value of the VenueRating field.
   */
  public void setVenueRating(typekey.MatterVenueRating value);
  
  
  
}