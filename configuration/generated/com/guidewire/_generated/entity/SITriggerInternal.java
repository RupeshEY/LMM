package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "SITrigger.eti;SITrigger.eix;SITrigger.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface SITriggerInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.claim.entity.SITrigger {
  /**
   * Gets the value of the AdditionalInformation field.
   * Additional information being tracked.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAdditionalInformation();
  
  
  /**
   * Gets the value of the Claim field.
   * Foreign key to Claim entity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the Exposure field.
   * Foreign key to exposure table.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure getExposure();
  
  
  public gw.pl.persistence.core.Key getExposureID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the PointValue field.
   * Point value of this trigger - as defined in rules.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getPointValue();
  
  
  /**
   * Gets the value of the TriggerDescription field.
   * Rule that was triggered.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTriggerDescription();
  
  
  /**
   * Sets the value of the AdditionalInformation field.
   */
  public void setAdditionalInformation(java.lang.String value);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Exposure field.
   */
  public void setExposure(entity.Exposure value);
  
  
  public void setExposureID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the PointValue field.
   */
  public void setPointValue(java.lang.Integer value);
  
  
  /**
   * Sets the value of the TriggerDescription field.
   */
  public void setTriggerDescription(java.lang.String value);
  
  
  
}