package entity;

/**
 * ClaimAccessData
 * 
 *         Data about claim-level permission for users and groups.
 *       
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimAccessData.eti;ClaimAccessData.eix;ClaimAccessData.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface ClaimAccessData extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ClaimAccessData> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ClaimAccessData>("entity.ClaimAccessData");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ANYONE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("Anyone", "Anyone");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> GROUP_DYNPROP = new com.guidewire.commons.metadata.types.LinkDynPropertyInfo("Group", "GroupID");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> PERMISSION_DYNPROP = new com.guidewire.commons.metadata.types.TypekeyDynPropertyInfo("Permission", "Permission");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> SECURITYZONE_DYNPROP = new com.guidewire.commons.metadata.types.LinkDynPropertyInfo("SecurityZone", "SecurityZoneID");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> USER_DYNPROP = new com.guidewire.commons.metadata.types.LinkDynPropertyInfo("User", "UserID");
  
  /**
   * Gets the value of the Group field.
   * The permitted group.  Exactly one of GroupID, UserID, and SecurityZoneID should be non-null.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getGroup();
  
  
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
  
  
  /**
   * Gets the value of the User field.
   * The permitted user.  Exactly one of GroupID, UserID, and SecurityZoneID should be non-null.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getUser();
  
  
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
  
  
  /**
   * Sets the value of the Permission field.
   */
  public void setPermission(typekey.ClaimAccessType value);
  
  
  /**
   * Sets the value of the SecurityZone field.
   */
  public void setSecurityZone(entity.SecurityZone value);
  
  
  /**
   * Sets the value of the User field.
   */
  public void setUser(entity.User value);
  
  
  
}