package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "WCDenialPeriod.eti;WCDenialPeriod.eix;WCDenialPeriod.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface WCDenialPeriodInternal extends com.guidewire._generated.entity.RetireableInternal, gw.cc.claim.entity.WCDenialPeriod {
  /**
   * Gets the value of the AcceptDocumentTemplate field.
   * The id of an associated document template. The id gets passed to IDocumentTemplateSource to retrieve the DocumentTemplateDescriptor.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAcceptDocumentTemplate();
  
  
  /**
   * Gets the value of the DueDateFormula field.
   * Which formula including which days to include in calculating the TargetDate.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.JurisdictionalFormula getDueDateFormula();
  
  
  /**
   * Gets the value of the EffectiveDate field.
   * Effective Date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEffectiveDate();
  
  
  /**
   * Gets the value of the ExpiryDate field.
   * End or Expiration Date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getExpiryDate();
  
  
  /**
   * Gets the value of the JurisdictionState field.
   * Jurisdiction State. The Jurisdiction must be associated with JurisdictionType.TC_INSURANCE.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Jurisdiction getJurisdictionState();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the RejectDocumentTemplate field.
   * The id of an associated document template. The id gets passed to IDocumentTemplateSource to retrieve the DocumentTemplateDescriptor.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRejectDocumentTemplate();
  
  
  /**
   * Gets the value of the TargetDaysFromLoss field.
   * If Date of Loss is a factor per DueDateFormula, used in conjunction with TargetIncludedDays to calculate the DueDate of the activity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTargetDaysFromLoss();
  
  
  /**
   * Gets the value of the TargetDaysFromNotice field.
   * If Date of Notice is a factor per DueDateFormula, used in conjunction with TargetIncludedDays to calculate the DueDate of the activity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTargetDaysFromNotice();
  
  
  /**
   * Gets the value of the TargetIncludeDays field.
   * Which days to include in calculating the TargetDate.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.IncludeDaysType getTargetIncludeDays();
  
  
  /**
   * Gets the value of the BenefitPaymentAcceptance field.
   * Payment of indemnity benefits implies acceptance of claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isBenefitPaymentAcceptance();
  
  
  /**
   * Sets the value of the AcceptDocumentTemplate field.
   */
  public void setAcceptDocumentTemplate(java.lang.String value);
  
  
  /**
   * Sets the value of the BenefitPaymentAcceptance field.
   */
  public void setBenefitPaymentAcceptance(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the DueDateFormula field.
   */
  public void setDueDateFormula(typekey.JurisdictionalFormula value);
  
  
  /**
   * Sets the value of the EffectiveDate field.
   */
  public void setEffectiveDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ExpiryDate field.
   */
  public void setExpiryDate(java.util.Date value);
  
  
  /**
   * Sets the value of the JurisdictionState field.
   */
  public void setJurisdictionState(typekey.Jurisdiction value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the RejectDocumentTemplate field.
   */
  public void setRejectDocumentTemplate(java.lang.String value);
  
  
  /**
   * Sets the value of the TargetDaysFromLoss field.
   */
  public void setTargetDaysFromLoss(java.lang.Integer value);
  
  
  /**
   * Sets the value of the TargetDaysFromNotice field.
   */
  public void setTargetDaysFromNotice(java.lang.Integer value);
  
  
  /**
   * Sets the value of the TargetIncludeDays field.
   */
  public void setTargetIncludeDays(typekey.IncludeDaysType value);
  
  
  
}