package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimIndicator.eti;ClaimIndicator.eix;ClaimIndicator.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimIndicatorInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.claim.indicator.entity.ClaimIndicator {
  /**
   * Gets the value of the Claim field.
   * Claim to which this indicator is related.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimIndicator getSubtype();
  
  
  /**
   * Gets the value of the WhenOn field.
   * Time at which this indicator was set to on, or null if indicator off
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getWhenOn();
  
  
  /**
   * Gets the value of the IsOn field.
   * Is this indicator on?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIsOn();
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the IsOn field.
   */
  public void setIsOn(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.ClaimIndicator value);
  
  
  /**
   * Sets the value of the WhenOn field.
   */
  public void setWhenOn(java.util.Date value);
  
  
  
}