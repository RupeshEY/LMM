package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ReinsuranceThreshold.eti;ReinsuranceThreshold.eix;ReinsuranceThreshold.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ReinsuranceThresholdInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire.cc.domain.claim.impl.ReinsuranceThresholdInternal, gw.cc.claim.entity.ReinsuranceThreshold {
  /**
   * Adds the given element to the CoverageTypes array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCoverageTypes(entity.ReinsuranceCoverage element);
  
  
  /**
   * Adds the given element to the LossCauses array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToLossCauses(entity.ReinsuranceLossCause element);
  
  
  /**
   * Gets the value of the CoverageTypes field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ReinsuranceCoverage[] getCoverageTypes();
  
  
  /**
   * Gets the value of the EndDate field.
   * End Date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEndDate();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the LossCauses field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ReinsuranceLossCause[] getLossCauses();
  
  
  /**
   * Gets the value of the LossType field.
   * Type of loss.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LossType getLossType();
  
  
  /**
   * Gets the value of the PolicyType field.
   * Type of policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PolicyType getPolicyType();
  
  
  /**
   * Gets the value of the ReportingThreshold field.
   * Reinsurance reporting threshold percentage for which a claim is marked reinsurance reportable.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getReportingThreshold();
  
  
  /**
   * Gets the value of the StartDate field.
   * Start Date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartDate();
  
  
  /**
   * Gets the value of the ThresholdValue field.
   * Reinsurance threshold value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getThresholdValue();
  
  
  /**
   * Gets the value of the TreatyType field.
   * Type of reinsurance treaty.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ReinsuranceTreatyType getTreatyType();
  
  
  /**
   * Removes the given element from the CoverageTypes array. This is achieved by marking the element for removal.
   */
  public void removeFromCoverageTypes(entity.ReinsuranceCoverage element);
  
  
  /**
   * Removes the given element from the CoverageTypes array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCoverageTypes(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the LossCauses array. This is achieved by marking the element for removal.
   */
  public void removeFromLossCauses(entity.ReinsuranceLossCause element);
  
  
  /**
   * Removes the given element from the LossCauses array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromLossCauses(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the CoverageTypes field.
   */
  public void setCoverageTypes(entity.ReinsuranceCoverage[] value);
  
  
  /**
   * Sets the value of the EndDate field.
   */
  public void setEndDate(java.util.Date value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the LossCauses field.
   */
  public void setLossCauses(entity.ReinsuranceLossCause[] value);
  
  
  /**
   * Sets the value of the LossType field.
   */
  public void setLossType(typekey.LossType value);
  
  
  /**
   * Sets the value of the PolicyType field.
   */
  public void setPolicyType(typekey.PolicyType value);
  
  
  /**
   * Sets the value of the ReportingThreshold field.
   */
  public void setReportingThreshold(java.lang.Integer value);
  
  
  /**
   * Sets the value of the StartDate field.
   */
  public void setStartDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ThresholdValue field.
   */
  public void setThresholdValue(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TreatyType field.
   */
  public void setTreatyType(typekey.ReinsuranceTreatyType value);
  
  
  
}