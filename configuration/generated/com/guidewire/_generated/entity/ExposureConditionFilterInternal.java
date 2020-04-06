package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ExposureConditionFilter.eti;ExposureConditionFilter.eix;ExposureConditionFilter.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ExposureConditionFilterInternal extends com.guidewire._generated.entity.ConditionFilterInternal {
  /**
   * Gets the value of the CoverageSubType field.
   * The coverage subtype
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CoverageSubtype getCoverageSubType();
  
  
  /**
   * Gets the value of the CoverageType field.
   * The coverage type
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CoverageType getCoverageType();
  
  
  /**
   * Gets the value of the LossPartyType field.
   * The loss party; generally either first or third-party loss.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LossPartyType getLossPartyType();
  
  
  /**
   * Sets the value of the CoverageSubType field.
   */
  public void setCoverageSubType(typekey.CoverageSubtype value);
  
  
  /**
   * Sets the value of the CoverageType field.
   */
  public void setCoverageType(typekey.CoverageType value);
  
  
  /**
   * Sets the value of the LossPartyType field.
   */
  public void setLossPartyType(typekey.LossPartyType value);
  
  
  
}