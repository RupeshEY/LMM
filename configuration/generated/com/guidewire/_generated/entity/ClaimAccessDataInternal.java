package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimAccessData.eti;ClaimAccessData.eix;ClaimAccessData.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimAccessDataInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, com.guidewire.cc.domain.claim.impl.ClaimAccessDataInternal, gw.cc.claim.entity.ClaimAccessData {
  /**
   * Gets the value of the Group field.
   * The permitted group.  Exactly one of GroupID, UserID, and SecurityZoneID should be non-null.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getGroup();
  
  
  public gw.pl.persistence.core.Key getGroupID();
  
  
  /**
   * Gets the value of the Permission field.
   * The type of permission being granted.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimAccessType getPermission();
  
  
  /**
   * Gets the value of the SecurityZone field.
   * The permitted security zone.  Exactly one of GroupID, UserID, and SecurityZoneID should be non-null.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SecurityZone getSecurityZone();
  
  
  public gw.pl.persistence.core.Key getSecurityZoneID();
  
  
  /**
   * Gets the value of the User field.
   * The permitted user.  Exactly one of GroupID, UserID, and SecurityZoneID should be non-null.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getUser();
  
  
  public gw.pl.persistence.core.Key getUserID();
  
  
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
   * Sets the value of the Group field.
   */
  public void setGroup(entity.Group value);
  
  
  public void setGroupID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Permission field.
   */
  public void setPermission(typekey.ClaimAccessType value);
  
  
  /**
   * Sets the value of the SecurityZone field.
   */
  public void setSecurityZone(entity.SecurityZone value);
  
  
  public void setSecurityZoneID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the User field.
   */
  public void setUser(entity.User value);
  
  
  public void setUserID(gw.pl.persistence.core.Key value);
  
  
  
}