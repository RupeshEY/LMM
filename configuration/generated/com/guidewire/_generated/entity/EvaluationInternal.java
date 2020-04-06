package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Evaluation.eti;Evaluation.eix;Evaluation.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface EvaluationInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.ClaimContactRoleOwnerInternal, com.guidewire.cc.domain.claim.ClaimContactRoleOwner, com.guidewire.cc.domain.claim.impl.EvaluationInternal, com.guidewire.cc.domain.relatedto.RelatedToBean, com.guidewire.pl.system.bundle.CommitCallback, gw.cc.claim.entity.Evaluation {
  /**
   * Gets the value of the Amount field.
   * Total evaluation amount.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getAmount();
  
  
  /**
   * Gets the value of the Claim field.
   * Related claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  /**
   * Gets the value of the ClaimContact field.
   * Related claimant (either a person or a company).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimContact getClaimContact();
  
  
  public gw.pl.persistence.core.Key getClaimContactID();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the ClaimantLiability field.
   * Claimant's liability percentage.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getClaimantLiability();
  
  
  /**
   * Gets the value of the ClmtOutOfPocket field.
   * Claimant out of pocket cost.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getClmtOutOfPocket();
  
  
  /**
   * Gets the value of the Diagnostic field.
   * Diagnostic cost - for example, x-ray.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getDiagnostic();
  
  
  /**
   * Gets the value of the Exposure field.
   * Related exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure getExposure();
  
  
  public gw.pl.persistence.core.Key getExposureID();
  
  
  /**
   * Gets the value of the FutureMedical field.
   * Future medical cost.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getFutureMedical();
  
  
  /**
   * Gets the value of the High field.
   * High non-economic cost estimate.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getHigh();
  
  
  /**
   * Gets the value of the HospitalER field.
   * Hospital/Emergency Room cost.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getHospitalER();
  
  
  /**
   * Gets the value of the InsuredLiability field.
   * Insured's liability percentage.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getInsuredLiability();
  
  
  /**
   * Gets the value of the Likely field.
   * Likely non-economic cost estimate.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getLikely();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Low field.
   * Low non-economic cost estimate.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getLow();
  
  
  /**
   * Gets the value of the Matter field.
   * Related matter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Matter getMatter();
  
  
  public gw.pl.persistence.core.Key getMatterID();
  
  
  /**
   * Gets the value of the MedicalEquipment field.
   * Medical equipment cost.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getMedicalEquipment();
  
  
  /**
   * Gets the value of the Name field.
   * Then name or subject of this evaluation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the Other field.
   * Other damages cost.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getOther();
  
  
  /**
   * Gets the value of the OtherLiability field.
   * Other party's liability percentage.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getOtherLiability();
  
  
  /**
   * Gets the value of the PhysicalTherapy field.
   * Physical therapy cost.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getPhysicalTherapy();
  
  
  /**
   * Gets the value of the ServiceRequest field.
   * Associated service request
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequest getServiceRequest();
  
  
  public gw.pl.persistence.core.Key getServiceRequestID();
  
  
  /**
   * Gets the value of the TreatingPhysician field.
   * Treating physician cost.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getTreatingPhysician();
  
  
  /**
   * Sets the value of the Amount field.
   */
  public void setAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  /**
   * Sets the value of the ClaimContact field.
   */
  public void setClaimContact(entity.ClaimContact value);
  
  
  public void setClaimContactID(gw.pl.persistence.core.Key value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClaimantLiability field.
   */
  public void setClaimantLiability(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the ClmtOutOfPocket field.
   */
  public void setClmtOutOfPocket(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the Diagnostic field.
   */
  public void setDiagnostic(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the Exposure field.
   */
  public void setExposure(entity.Exposure value);
  
  
  public void setExposureID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the FutureMedical field.
   */
  public void setFutureMedical(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the High field.
   */
  public void setHigh(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the HospitalER field.
   */
  public void setHospitalER(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the InsuredLiability field.
   */
  public void setInsuredLiability(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the Likely field.
   */
  public void setLikely(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Low field.
   */
  public void setLow(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the Matter field.
   */
  public void setMatter(entity.Matter value);
  
  
  public void setMatterID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the MedicalEquipment field.
   */
  public void setMedicalEquipment(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the Other field.
   */
  public void setOther(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the OtherLiability field.
   */
  public void setOtherLiability(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the PhysicalTherapy field.
   */
  public void setPhysicalTherapy(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the ServiceRequest field.
   */
  public void setServiceRequest(entity.ServiceRequest value);
  
  
  public void setServiceRequestID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the TreatingPhysician field.
   */
  public void setTreatingPhysician(gw.api.financials.CurrencyAmount value);
  
  
  
}