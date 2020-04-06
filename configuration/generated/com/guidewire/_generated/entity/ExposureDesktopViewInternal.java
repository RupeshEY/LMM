package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ExposureDesktopView.eti;ExposureDesktopView.eix;ExposureDesktopView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ExposureDesktopViewInternal extends com.guidewire._generated.entity.ExposureAbstractViewInternal, gw.cc.exposure.entity.ExposureDesktopView {
  /**
   * Gets the value of the ClaimClaimant field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getClaimClaimant();
  
  
  public gw.pl.persistence.core.Key getClaimClaimantID();
  
  
  /**
   * Gets the value of the Exposure field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure getExposure();
  
  
  /**
   * Gets the value of the ExposureClaim field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getExposureClaim();
  
  
  public gw.pl.persistence.core.Key getExposureClaimID();
  
  
  public gw.pl.persistence.core.Key getExposureID();
  
  
  /**
   * Sets the value of the ClaimClaimant field.
   */
  public void setClaimClaimant(entity.Contact value);
  
  
  public void setClaimClaimantID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Exposure field.
   */
  public void setExposure(entity.Exposure value);
  
  
  /**
   * Sets the value of the ExposureClaim field.
   */
  public void setExposureClaim(entity.Claim value);
  
  
  public void setExposureClaimID(gw.pl.persistence.core.Key value);
  
  
  public void setExposureID(gw.pl.persistence.core.Key value);
  
  
  
}