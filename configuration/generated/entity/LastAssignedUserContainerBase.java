package entity;

/**
 * LastAssignedUserContainerBase
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LastAssignedUserContainerBase.eti;LastAssignedUserContainerBase.eix;LastAssignedUserContainerBase.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface LastAssignedUserContainerBase extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.LastAssignedUserContainerBase> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.LastAssignedUserContainerBase>("entity.LastAssignedUserContainerBase");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LASTACTIVITYGRP_DYNPROP = new com.guidewire.commons.metadata.types.LinkDynPropertyInfo("LastActivityGrp", "LastActivityGrpID");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LASTACTIVITYUSER_DYNPROP = new com.guidewire.commons.metadata.types.LinkDynPropertyInfo("LastActivityUser", "LastActivityUserID");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LASTREVIEWGRP_DYNPROP = new com.guidewire.commons.metadata.types.LinkDynPropertyInfo("LastReviewGrp", "LastReviewGrpID");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LASTREVIEWUSER_DYNPROP = new com.guidewire.commons.metadata.types.LinkDynPropertyInfo("LastReviewUser", "LastReviewUserID");
  
  /**
   * Gets the value of the LastActivityGrp field.
   * The id of the last group that was assigned an activity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getLastActivityGrp();
  
  
  /**
   * Gets the value of the LastActivityUser field.
   * The id of the last user that was assigned an activity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getLastActivityUser();
  
  
  /**
   * Gets the value of the LastReviewGrp field.
   * The id of the last group that was assigned an assignment review activity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getLastReviewGrp();
  
  
  /**
   * Gets the value of the LastReviewUser field.
   * The id of the last user that was assigned an assignment review activity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getLastReviewUser();
  
  
  /**
   * Sets the value of the LastActivityGrp field.
   */
  public void setLastActivityGrp(entity.Group value);
  
  
  /**
   * Sets the value of the LastActivityUser field.
   */
  public void setLastActivityUser(entity.User value);
  
  
  /**
   * Sets the value of the LastReviewGrp field.
   */
  public void setLastReviewGrp(entity.Group value);
  
  
  /**
   * Sets the value of the LastReviewUser field.
   */
  public void setLastReviewUser(entity.User value);
  
  
  
}