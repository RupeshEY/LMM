package entity;

/**
 * LastAssignedUserContainer
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LastAssignedUserContainer.eti;LastAssignedUserContainer.eix;LastAssignedUserContainer.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface LastAssignedUserContainer extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.LastAssignedUserContainer> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.LastAssignedUserContainer>("entity.LastAssignedUserContainer");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LASTCLAIMGRP_DYNPROP = new com.guidewire.commons.metadata.types.LinkDynPropertyInfo("LastClaimGrp", "LastClaimGrpID");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LASTCLAIMUSER_DYNPROP = new com.guidewire.commons.metadata.types.LinkDynPropertyInfo("LastClaimUser", "LastClaimUserID");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LASTEXPOSUREGRP_DYNPROP = new com.guidewire.commons.metadata.types.LinkDynPropertyInfo("LastExposureGrp", "LastExposureGrpID");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LASTEXPOSUREUSER_DYNPROP = new com.guidewire.commons.metadata.types.LinkDynPropertyInfo("LastExposureUser", "LastExposureUserID");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LASTMATTERGRP_DYNPROP = new com.guidewire.commons.metadata.types.LinkDynPropertyInfo("LastMatterGrp", "LastMatterGrpID");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LASTMATTERUSER_DYNPROP = new com.guidewire.commons.metadata.types.LinkDynPropertyInfo("LastMatterUser", "LastMatterUserID");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LASTSERVICEREQUESTGRP_DYNPROP = new com.guidewire.commons.metadata.types.LinkDynPropertyInfo("LastServiceRequestGrp", "LastServiceRequestGrpID");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LASTSERVICEREQUESTUSER_DYNPROP = new com.guidewire.commons.metadata.types.LinkDynPropertyInfo("LastServiceRequestUser", "LastServiceRequestUserID");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LASTSUBROGATIONGRP_DYNPROP = new com.guidewire.commons.metadata.types.LinkDynPropertyInfo("LastSubrogationGrp", "LastSubrogationGrpID");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LASTSUBROGATIONUSER_DYNPROP = new com.guidewire.commons.metadata.types.LinkDynPropertyInfo("LastSubrogationUser", "LastSubrogationUserID");
  
  /**
   * Gets the value of the LastClaimGrp field.
   * The id of the last group that was assigned a claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getLastClaimGrp();
  
  
  /**
   * Gets the value of the LastClaimUser field.
   * The id of the last user that was assigned a claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getLastClaimUser();
  
  
  /**
   * Gets the value of the LastExposureGrp field.
   * The id of the last group that was assigned an exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getLastExposureGrp();
  
  
  /**
   * Gets the value of the LastExposureUser field.
   * The id of the last user that was assigned an exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getLastExposureUser();
  
  
  /**
   * Gets the value of the LastMatterGrp field.
   * The id of the last group that was assigned a matter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getLastMatterGrp();
  
  
  /**
   * Gets the value of the LastMatterUser field.
   * The id of the last user that was assigned a matter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getLastMatterUser();
  
  
  /**
   * Gets the value of the LastServiceRequestGrp field.
   * The id of the last group that was assigned a service request.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getLastServiceRequestGrp();
  
  
  /**
   * Gets the value of the LastServiceRequestUser field.
   * The id of the last user that was assigned a service request.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getLastServiceRequestUser();
  
  
  /**
   * Gets the value of the LastSubrogationGrp field.
   * The id of the last group that was assigned a subrogation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getLastSubrogationGrp();
  
  
  /**
   * Gets the value of the LastSubrogationUser field.
   * The id of the last user that was assigned a subrogation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getLastSubrogationUser();
  
  
  /**
   * Sets the value of the LastClaimGrp field.
   */
  public void setLastClaimGrp(entity.Group value);
  
  
  /**
   * Sets the value of the LastClaimUser field.
   */
  public void setLastClaimUser(entity.User value);
  
  
  /**
   * Sets the value of the LastExposureGrp field.
   */
  public void setLastExposureGrp(entity.Group value);
  
  
  /**
   * Sets the value of the LastExposureUser field.
   */
  public void setLastExposureUser(entity.User value);
  
  
  /**
   * Sets the value of the LastMatterGrp field.
   */
  public void setLastMatterGrp(entity.Group value);
  
  
  /**
   * Sets the value of the LastMatterUser field.
   */
  public void setLastMatterUser(entity.User value);
  
  
  /**
   * Sets the value of the LastServiceRequestGrp field.
   */
  public void setLastServiceRequestGrp(entity.Group value);
  
  
  /**
   * Sets the value of the LastServiceRequestUser field.
   */
  public void setLastServiceRequestUser(entity.User value);
  
  
  /**
   * Sets the value of the LastSubrogationGrp field.
   */
  public void setLastSubrogationGrp(entity.Group value);
  
  
  /**
   * Sets the value of the LastSubrogationUser field.
   */
  public void setLastSubrogationUser(entity.User value);
  
  
  
}