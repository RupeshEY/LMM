package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ActivityDesktopView.eti;ActivityDesktopView.eix;ActivityDesktopView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ActivityDesktopViewInternal extends com.guidewire._generated.entity.ActivityViewInternal, com.guidewire.pl.system.entity.PermissionAssignableCheck, gw.cc.activity.entity.ActivityDesktopView {
  /**
   * Gets the value of the AssignmentDate field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getAssignmentDate();
  
  
  /**
   * Gets the value of the ClaimClaimantName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimClaimantName();
  
  
  /**
   * Gets the value of the ClaimContactID field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getClaimContactID();
  
  
  /**
   * Gets the value of the ClaimContactName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimContactName();
  
  
  /**
   * Gets the value of the ClaimInsured field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getClaimInsured();
  
  
  public gw.pl.persistence.core.Key getClaimInsuredID();
  
  
  /**
   * Gets the value of the ExposureClaimantName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getExposureClaimantName();
  
  
  /**
   * Gets the value of the ExposureID field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getExposureID();
  
  
  /**
   * Gets the value of the ExposureName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getExposureName();
  
  
  /**
   * Gets the value of the Mandatory field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isMandatory();
  
  
  /**
   * Sets the value of the AssignmentDate field.
   */
  public void setAssignmentDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ClaimClaimantName field.
   */
  public void setClaimClaimantName(java.lang.String value);
  
  
  /**
   * Sets the value of the ClaimContactID field.
   */
  public void setClaimContactID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClaimContactName field.
   */
  public void setClaimContactName(java.lang.String value);
  
  
  /**
   * Sets the value of the ClaimInsured field.
   */
  public void setClaimInsured(entity.Contact value);
  
  
  public void setClaimInsuredID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ExposureClaimantName field.
   */
  public void setExposureClaimantName(java.lang.String value);
  
  
  /**
   * Sets the value of the ExposureID field.
   */
  public void setExposureID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ExposureName field.
   */
  public void setExposureName(java.lang.String value);
  
  
  /**
   * Sets the value of the Mandatory field.
   */
  public void setMandatory(java.lang.Boolean value);
  
  
  
}