package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ContribFactor.eti;ContribFactor.eix;ContribFactor.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ContribFactorInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.claim.entity.ContribFactor {
  /**
   * Gets the value of the Claim field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the ContFactText field.
   * When other is selected Text will display to be filled in
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getContFactText();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the PriContributingFactors field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PriContributingFactors getPriContributingFactors();
  
  
  /**
   * Gets the value of the ResContributingFactors field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ResContributingFactors getResContributingFactors();
  
  
  /**
   * Gets the value of the SecContributingFactors field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SecContributingFactors getSecContributingFactors();
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ContFactText field.
   */
  public void setContFactText(java.lang.String value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the PriContributingFactors field.
   */
  public void setPriContributingFactors(typekey.PriContributingFactors value);
  
  
  /**
   * Sets the value of the ResContributingFactors field.
   */
  public void setResContributingFactors(typekey.ResContributingFactors value);
  
  
  /**
   * Sets the value of the SecContributingFactors field.
   */
  public void setSecContributingFactors(typekey.SecContributingFactors value);
  
  
  
}