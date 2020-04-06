package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RIAgreementGroup.eti;RIAgreementGroup.eix;RIAgreementGroup.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RIAgreementGroupInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.UpdateCallback, gw.cc.reinsurance.entity.RIAgreementGroup {
  /**
   * Adds the given element to the Agreements array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToAgreements(entity.RIAgreement element);
  
  
  /**
   * Adds the given element to the Exposures array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToExposures(entity.Exposure element);
  
  
  /**
   * Gets the value of the Agreements field.
   * List of reinsurance agreements associated with this agreement group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RIAgreement[] getAgreements();
  
  
  /**
   * Gets the value of the Claim field.
   * Claim associated with the risk.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the Exposures field.
   * List of exposures associated with this reinsurance risk.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure[] getExposures();
  
  
  /**
   * Gets the value of the ExternalRiskID field.
   * Identifier for the risk in an external system. Null if created manually in ClaimCenterS.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getExternalRiskID();
  
  
  /**
   * Gets the value of the RiskName field.
   * Name of the risk.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRiskName();
  
  
  /**
   * Removes the given element from the Agreements array. This is achieved by marking the element for removal.
   */
  public void removeFromAgreements(entity.RIAgreement element);
  
  
  /**
   * Removes the given element from the Agreements array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromAgreements(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Exposures array. This is achieved by marking the element for removal.
   */
  public void removeFromExposures(entity.Exposure element);
  
  
  /**
   * Removes the given element from the Exposures array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromExposures(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Agreements field.
   */
  public void setAgreements(entity.RIAgreement[] value);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Exposures field.
   */
  public void setExposures(entity.Exposure[] value);
  
  
  /**
   * Sets the value of the ExternalRiskID field.
   */
  public void setExternalRiskID(java.lang.String value);
  
  
  /**
   * Sets the value of the RiskName field.
   */
  public void setRiskName(java.lang.String value);
  
  
  
}