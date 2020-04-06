package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimUserModelSet.eti;ClaimUserModelSet.eix;ClaimUserModelSet.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimUserModelSetInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.cc.domain.claim.impl.ClaimUserModelSetInternal, gw.cc.claim.entity.ClaimUserModelSet {
  /**
   * Adds the given element to the ClaimUserModels array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToClaimUserModels(entity.ClaimUserModel element);
  
  
  /**
   * Gets the value of the Claim field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the ClaimUserModels field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimUserModel[] getClaimUserModels();
  
  
  /**
   * Removes the given element from the ClaimUserModels array. This is achieved by marking the element for removal.
   */
  public void removeFromClaimUserModels(entity.ClaimUserModel element);
  
  
  /**
   * Removes the given element from the ClaimUserModels array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClaimUserModels(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClaimUserModels field.
   */
  public void setClaimUserModels(entity.ClaimUserModel[] value);
  
  
  
}