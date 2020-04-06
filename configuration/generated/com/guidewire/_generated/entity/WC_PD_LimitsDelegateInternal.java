package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "WC_PD_LimitsDelegate.eti;WC_PD_LimitsDelegate.eix;WC_PD_LimitsDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface WC_PD_LimitsDelegateInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, com.guidewire.cc.domain.exposure.impl.WC_PD_LimitsDelegateInternal, gw.cc.exposure.entity.WC_PD_LimitsDelegate {
  /**
   * Gets the value of the JurisdictionState field.
   * Jurisdiction State. The Jurisdiction must be associated with JurisdictionType.TC_INSURANCE.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Jurisdiction getJurisdictionState();
  
  
  /**
   * Gets the value of the PD_BenefitEndDate field.
   * PD Benefit Expiration Date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getPD_BenefitEndDate();
  
  
  /**
   * Gets the value of the PD_BenefitStartDate field.
   * PD Benefit Effective Date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getPD_BenefitStartDate();
  
  
  /**
   * Gets the value of the RateComments field.
   * Additional comments.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRateComments();
  
  
  /**
   * Sets the value of the JurisdictionState field.
   */
  public void setJurisdictionState(typekey.Jurisdiction value);
  
  
  /**
   * Sets the value of the PD_BenefitEndDate field.
   */
  public void setPD_BenefitEndDate(java.util.Date value);
  
  
  /**
   * Sets the value of the PD_BenefitStartDate field.
   */
  public void setPD_BenefitStartDate(java.util.Date value);
  
  
  /**
   * Sets the value of the RateComments field.
   */
  public void setRateComments(java.lang.String value);
  
  
  
}