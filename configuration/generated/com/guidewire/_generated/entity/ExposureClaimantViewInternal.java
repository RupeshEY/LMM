package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ExposureClaimantView.eti;ExposureClaimantView.eix;ExposureClaimantView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ExposureClaimantViewInternal extends com.guidewire._generated.entity.KeyableBeanInternal, gw.cc.exposure.entity.ExposureClaimantView {
  /**
   * Gets the value of the ClaimID field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the ClaimantName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimantName();
  
  
  /**
   * Sets the value of the ClaimID field.
   */
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClaimantName field.
   */
  public void setClaimantName(java.lang.String value);
  
  
  
}