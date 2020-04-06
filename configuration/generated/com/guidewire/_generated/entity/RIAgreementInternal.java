package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RIAgreement.eti;RIAgreement.eix;RIAgreement.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RIAgreementInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ValidatableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire.pl.system.bundle.UpdateCallback, gw.cc.reinsurance.entity.RIAgreement {
  /**
   * Adds the given element to the RICodings array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRICodings(entity.RICoding element);
  
  
  /**
   * Gets the value of the AgreementName field.
   * Agreement name.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAgreementName();
  
  
  /**
   * Gets the value of the AgreementNumber field.
   * Agreement number.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAgreementNumber();
  
  
  /**
   * Gets the value of the AttachmentPoint field.
   * The lower limit of when coverage starts.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getAttachmentPoint();
  
  
  /**
   * Gets the value of the CededShare field.
   * Percentage of liability ceded to reinsurer.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getCededShare();
  
  
  /**
   * Gets the value of the Claim field.
   * Associated Claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the Currency field.
   * The currency of the Agreement.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency();
  
  
  /**
   * Gets the value of the NotificationThreshold field.
   * At what amount of total incurred loss would the reinsurers like to be notified of individual large losses.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getNotificationThreshold();
  
  
  /**
   * Gets the value of the RIAgreementGroup field.
   * Associated reinsurance agreement group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RIAgreementGroup getRIAgreementGroup();
  
  
  public gw.pl.persistence.core.Key getRIAgreementGroupID();
  
  
  /**
   * Gets the value of the RICodings field.
   * RICodings on this agreement.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RICoding[] getRICodings();
  
  
  /**
   * Gets the value of the RecoveryLimit field.
   * The maximum amount that can be recovered from this agreement. Usually equal to TopOfLayer minus AttachmentPoint.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getRecoveryLimit();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RIAgreement getSubtype();
  
  
  /**
   * Gets the value of the TopOfLayer field.
   * The upper limit of coverage. Counterpart to AttachmentPoint. Labeled as Coverage Limit in the UI to match PolicyCenter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getTopOfLayer();
  
  
  /**
   * Gets the value of the ExceedsNotificationThreshold field.
   * Boolean field to mark an agreement as exceeding the notification threshold.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isExceedsNotificationThreshold();
  
  
  /**
   * Gets the value of the ManagedInExternalSystem field.
   * Boolean field to indicate if this agreement should be edited in CC or another system.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isManagedInExternalSystem();
  
  
  /**
   * Removes the given element from the RICodings array. This is achieved by marking the element for removal.
   */
  public void removeFromRICodings(entity.RICoding element);
  
  
  /**
   * Removes the given element from the RICodings array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRICodings(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the AgreementName field.
   */
  public void setAgreementName(java.lang.String value);
  
  
  /**
   * Sets the value of the AgreementNumber field.
   */
  public void setAgreementNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the AttachmentPoint field.
   */
  public void setAttachmentPoint(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the CededShare field.
   */
  public void setCededShare(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Currency field.
   */
  public void setCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the ExceedsNotificationThreshold field.
   */
  public void setExceedsNotificationThreshold(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ManagedInExternalSystem field.
   */
  public void setManagedInExternalSystem(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the NotificationThreshold field.
   */
  public void setNotificationThreshold(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the RIAgreementGroup field.
   */
  public void setRIAgreementGroup(entity.RIAgreementGroup value);
  
  
  public void setRIAgreementGroupID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the RICodings field.
   */
  public void setRICodings(entity.RICoding[] value);
  
  
  /**
   * Sets the value of the RecoveryLimit field.
   */
  public void setRecoveryLimit(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.RIAgreement value);
  
  
  /**
   * Sets the value of the TopOfLayer field.
   */
  public void setTopOfLayer(gw.api.financials.CurrencyAmount value);
  
  
  
}