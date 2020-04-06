package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Coverage.eti;Coverage.eix;Coverage.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface CoverageInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.EventAwareInternal, com.guidewire.cc.domain.policy.impl.CoverageInternal, com.guidewire.pl.system.bundle.RemoveCallback, com.guidewire.pl.system.bundle.UpdateCallback, gw.api.policy.CoverageMethods, gw.cc.policy.entity.Coverage {
  java.lang.String COVERAGEADDED_EVENT = "CoverageAdded";
  
  java.lang.String COVERAGECHANGED_EVENT = "CoverageChanged";
  
  java.lang.String COVERAGEREMOVED_EVENT = "CoverageRemoved";
  
  /**
   * Adds the given element to the ClaimDeductibleArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToClaimDeductibleArray(entity.Deductible element);
  
  
  /**
   * Adds the given element to the CovTerms array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCovTerms(entity.CovTerm element);
  
  
  /**
   * Gets the value of the ClaimDeductible field.
   * Deductible entity to be applied to a payment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Deductible getClaimDeductible();
  
  
  /**
   * Gets the value of the ClaimDeductibleArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Deductible[] getClaimDeductibleArray();
  
  
  public gw.pl.persistence.core.Key getClaimDeductibleID();
  
  
  /**
   * Gets the value of the CovTerms field.
   * Additional terms and conditions associated with this Coverage.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CovTerm[] getCovTerms();
  
  
  /**
   * Gets the value of the Currency field.
   * The currency of the coverage. Once set, this value can be updated only when CoverageMethods.allowCurrencyChange() returns true.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency();
  
  
  /**
   * Gets the value of the Deductible field.
   * Deductible for this coverage.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getDeductible();
  
  
  /**
   * Gets the value of the EffectiveDate field.
   * Date on which the coverage is effective.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEffectiveDate();
  
  
  /**
   * Gets the value of the ExpirationDate field.
   * Date on which the coverage is expired.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getExpirationDate();
  
  
  /**
   * Gets the value of the ExposureLimit field.
   * Dollar limit per exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getExposureLimit();
  
  
  /**
   * Gets the value of the IncidentLimit field.
   * Dollar limit per incident.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getIncidentLimit();
  
  
  /**
   * Gets the value of the LimitsIndicator field.
   * Whether a coverage type can be combined.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LimitsIndicator getLimitsIndicator();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Notes field.
   * Additional notes on this coverage.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNotes();
  
  
  /**
   * Gets the value of the Policy field.
   * Policy to which the coverage belongs.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Policy getPolicy();
  
  
  public gw.pl.persistence.core.Key getPolicyID();
  
  
  /**
   * Gets the value of the PolicySystemId field.
   * Identifier for the coverage in an external policy system
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicySystemId();
  
  
  /**
   * Gets the value of the State field.
   * The state in which this coverage is applicable, if state-specific.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.State getState();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Coverage getSubtype();
  
  
  /**
   * Gets the value of the Type field.
   * Type of coverage.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CoverageType getType();
  
  
  /**
   * Removes the given element from the ClaimDeductibleArray array. This is achieved by marking the element for removal.
   */
  public void removeFromClaimDeductibleArray(entity.Deductible element);
  
  
  /**
   * Removes the given element from the ClaimDeductibleArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClaimDeductibleArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the CovTerms array. This is achieved by marking the element for removal.
   */
  public void removeFromCovTerms(entity.CovTerm element);
  
  
  /**
   * Removes the given element from the CovTerms array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCovTerms(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the ClaimDeductible field.
   */
  public void setClaimDeductible(entity.Deductible value);
  
  
  /**
   * Sets the value of the ClaimDeductibleArray field.
   */
  public void setClaimDeductibleArray(entity.Deductible[] value);
  
  
  public void setClaimDeductibleID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the CovTerms field.
   */
  public void setCovTerms(entity.CovTerm[] value);
  
  
  /**
   * Sets the value of the Currency field.
   */
  public void setCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the Deductible field.
   */
  public void setDeductible(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the EffectiveDate field.
   */
  public void setEffectiveDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ExpirationDate field.
   */
  public void setExpirationDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ExposureLimit field.
   */
  public void setExposureLimit(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the IncidentLimit field.
   */
  public void setIncidentLimit(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the LimitsIndicator field.
   */
  public void setLimitsIndicator(typekey.LimitsIndicator value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Notes field.
   */
  public void setNotes(java.lang.String value);
  
  
  /**
   * Sets the value of the Policy field.
   */
  public void setPolicy(entity.Policy value);
  
  
  public void setPolicyID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the PolicySystemId field.
   */
  public void setPolicySystemId(java.lang.String value);
  
  
  /**
   * Sets the value of the State field.
   */
  public void setState(typekey.State value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.Coverage value);
  
  
  /**
   * Sets the value of the Type field.
   */
  public void setType(typekey.CoverageType value);
  
  
  
}