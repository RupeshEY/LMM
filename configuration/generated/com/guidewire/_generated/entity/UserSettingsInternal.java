package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "UserSettings.eti;UserSettings.eix;UserSettings.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface UserSettingsInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.EventAwareInternal, com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.UpdateCallback {
  java.lang.String USERSETTINGSADDED_EVENT = "UserSettingsAdded";
  
  java.lang.String USERSETTINGSCHANGED_EVENT = "UserSettingsChanged";
  
  java.lang.String USERSETTINGSREMOVED_EVENT = "UserSettingsRemoved";
  
  /**
   * Gets the value of the CancelAlertDismiss field.
   * The date/time when the canceled Activities alert bar was last dismissed
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCancelAlertDismiss();
  
  
  /**
   * Gets the value of the LastNClaims field.
   * Used to store the claims last viewed across sessions; not user controllable.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLastNClaims();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the MinClaimUpdate field.
   * The minimum time between claim update checks, in minutes.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getMinClaimUpdate();
  
  
  /**
   * Gets the value of the NumOpenClaims field.
   * The number of claims to hold in memory.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNumOpenClaims();
  
  
  /**
   * Gets the value of the PrintMargins field.
   * The margin sizes for printing (in inches)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPrintMargins();
  
  
  /**
   * Gets the value of the StartupPage field.
   * The startup page for this user
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.StartupPage getStartupPage();
  
  
  /**
   * Gets the value of the PrintPageNums field.
   * Whether to print page numbers when printing.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPrintPageNums();
  
  
  /**
   * Gets the value of the RotateTables field.
   * Whether to rotate table data when printing.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isRotateTables();
  
  
  /**
   * Gets the value of the ShowPrintPreview field.
   * Whether to show a print preview before printing.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isShowPrintPreview();
  
  
  /**
   * Sets the value of the CancelAlertDismiss field.
   */
  public void setCancelAlertDismiss(java.util.Date value);
  
  
  /**
   * Sets the value of the LastNClaims field.
   */
  public void setLastNClaims(java.lang.String value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the MinClaimUpdate field.
   */
  public void setMinClaimUpdate(java.lang.Integer value);
  
  
  /**
   * Sets the value of the NumOpenClaims field.
   */
  public void setNumOpenClaims(java.lang.Integer value);
  
  
  /**
   * Sets the value of the PrintMargins field.
   */
  public void setPrintMargins(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the PrintPageNums field.
   */
  public void setPrintPageNums(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the RotateTables field.
   */
  public void setRotateTables(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ShowPrintPreview field.
   */
  public void setShowPrintPreview(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the StartupPage field.
   */
  public void setStartupPage(typekey.StartupPage value);
  
  
  
}