package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimInAssociation.eti;ClaimInAssociation.eix;ClaimInAssociation.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimInAssociationInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.cc.domain.claimassoc.impl.ClaimInAssociationInternal, gw.cc.claimassoc.entity.ClaimInAssociation {
  /**
   * Gets the value of the ClaimAssociation field.
   * ClaimAssociation which contains the Claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimAssociation getClaimAssociation();
  
  
  public gw.pl.persistence.core.Key getClaimAssociationID();
  
  
  /**
   * Gets the value of the ClaimInfo field.
   * ClaimInfo that belongs to the ClaimAssociation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimInfo getClaimInfo();
  
  
  public gw.pl.persistence.core.Key getClaimInfoID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the PrimaryClaim field.
   * True if the given Claim is the primary Claim of the ClaimAssociation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPrimaryClaim();
  
  
  /**
   * Sets the value of the ClaimAssociation field.
   */
  public void setClaimAssociation(entity.ClaimAssociation value);
  
  
  public void setClaimAssociationID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClaimInfo field.
   */
  public void setClaimInfo(entity.ClaimInfo value);
  
  
  public void setClaimInfoID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the PrimaryClaim field.
   */
  public void setPrimaryClaim(java.lang.Boolean value);
  
  
  
}