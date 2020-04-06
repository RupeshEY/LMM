package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpClaimAccess.eti;TmpClaimAccess.eix;TmpClaimAccess.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TmpClaimAccessInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, gw.cc.claim.entity.TmpClaimAccess {
  /**
   * Gets the value of the ClaimID field.
   * A foreign key to the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getClaimID();
  
  
  /**
   * Gets the value of the GroupID field.
   * The permitted group.  Exactly one of GroupID, UserID, and SecurityZoneID should be non-null.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getGroupID();
  
  
  /**
   * Gets the value of the Permission field.
   * The type of permission being granted.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimAccessType getPermission();
  
  
  /**
   * Gets the value of the SecurityZoneID field.
   * The permitted security zone.  Exactly one of GroupID, UserID, and SecurityZoneID should be non-null.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getSecurityZoneID();
  
  
  /**
   * Gets the value of the UserID field.
   * The permitted user.  Exactly one of GroupID, UserID, and SecurityZoneID should be non-null.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getUserID();
  
  
  /**
   * Gets the value of the Anyone field.
   * Whether this permission should be granted to everyone.  If true then GroupID, UserID, and SecurityZoneID should be null.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAnyone();
  
  
  /**
   * Sets the value of the Anyone field.
   */
  public void setAnyone(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ClaimID field.
   */
  public void setClaimID(java.lang.Long value);
  
  
  /**
   * Sets the value of the GroupID field.
   */
  public void setGroupID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Permission field.
   */
  public void setPermission(typekey.ClaimAccessType value);
  
  
  /**
   * Sets the value of the SecurityZoneID field.
   */
  public void setSecurityZoneID(java.lang.Long value);
  
  
  /**
   * Sets the value of the UserID field.
   */
  public void setUserID(java.lang.Long value);
  
  
  
}