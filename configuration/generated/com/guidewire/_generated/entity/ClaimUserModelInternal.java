package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimUserModel.eti;ClaimUserModel.eix;ClaimUserModel.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimUserModelInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.cc.domain.claim.impl.ClaimUserModelInternal, gw.cc.claim.entity.ClaimUserModel {
  /**
   * Gets the value of the ClaimUserModelSet field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimUserModelSet getClaimUserModelSet();
  
  
  public gw.pl.persistence.core.Key getClaimUserModelSetID();
  
  
  /**
   * Gets the value of the Group field.
   * The group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getGroup();
  
  
  public gw.pl.persistence.core.Key getGroupID();
  
  
  /**
   * Gets the value of the User field.
   * The user.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getUser();
  
  
  public gw.pl.persistence.core.Key getUserID();
  
  
  /**
   * Sets the value of the ClaimUserModelSet field.
   */
  public void setClaimUserModelSet(entity.ClaimUserModelSet value);
  
  
  public void setClaimUserModelSetID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Group field.
   */
  public void setGroup(entity.Group value);
  
  
  public void setGroupID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the User field.
   */
  public void setUser(entity.User value);
  
  
  public void setUserID(gw.pl.persistence.core.Key value);
  
  
  
}