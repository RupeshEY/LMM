package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ref_WC_TD.eti;ref_WC_TD.eix;ref_WC_TD.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ref_WC_TDInternal extends com.guidewire._generated.entity.RetireableInternal, gw.cc.exposure.entity.ref_WC_TD {
  /**
   * Gets the value of the JurisdictionState field.
   * Jurisdiction State
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
   * Gets the value of the RateComments field.
   * Additional comments.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRateComments();
  
  
  /**
   * Gets the value of the TD_BenefitEndDate field.
   * PD Benefit Expiration Date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getTD_BenefitEndDate();
  
  
  /**
   * Gets the value of the TD_BenefitStartDate field.
   * PD Benefit Effective Date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getTD_BenefitStartDate();
  
  
  /**
   * Gets the value of the TD_Max field.
   * Max State TD limit
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTD_Max();
  
  
  /**
   * Gets the value of the TD_Min field.
   * MinState TD limit 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTD_Min();
  
  
  /**
   * Gets the value of the TTDPercentOfWages field.
   * The percentage of wages paid for TTD (e.g. 80%)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTTDPercentOfWages();
  
  
  /**
   * Gets the value of the TTDMinAdjToAWW field.
   * If true and AWW is less than Min then set Min to AWW
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isTTDMinAdjToAWW();
  
  
  /**
   * Sets the value of the JurisdictionState field.
   */
  public void setJurisdictionState(typekey.Jurisdiction value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the RateComments field.
   */
  public void setRateComments(java.lang.String value);
  
  
  /**
   * Sets the value of the TD_BenefitEndDate field.
   */
  public void setTD_BenefitEndDate(java.util.Date value);
  
  
  /**
   * Sets the value of the TD_BenefitStartDate field.
   */
  public void setTD_BenefitStartDate(java.util.Date value);
  
  
  /**
   * Sets the value of the TD_Max field.
   */
  public void setTD_Max(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TD_Min field.
   */
  public void setTD_Min(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TTDMinAdjToAWW field.
   */
  public void setTTDMinAdjToAWW(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the TTDPercentOfWages field.
   */
  public void setTTDPercentOfWages(java.math.BigDecimal value);
  
  
  
}