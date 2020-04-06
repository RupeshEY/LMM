package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "WCBenefitParameterSet.eti;WCBenefitParameterSet.eix;WCBenefitParameterSet.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface WCBenefitParameterSetInternal extends com.guidewire._generated.entity.RetireableInternal, gw.cc.exposure.entity.WCBenefitParameterSet {
  /**
   * Adds the given element to the WCBenefitFactors array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToWCBenefitFactors(entity.WCBenefitFactorDetail element);
  
  
  /**
   * Gets the value of the EndDate field.
   * PD Benefit Expiration Date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEndDate();
  
  
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
   * Gets the value of the PPDMax field.
   * Max State PPD limit
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPPDMax();
  
  
  /**
   * Gets the value of the PPDMin field.
   * MinState PPD limit 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPPDMin();
  
  
  /**
   * Gets the value of the PPDPercentOfWages field.
   * The percentage of wages paid for  Permanent Partial Disability  (e.g. 80%)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPPDPercentOfWages();
  
  
  /**
   * Gets the value of the PTDMax field.
   * Max State PTD limit
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPTDMax();
  
  
  /**
   * Gets the value of the PTDMin field.
   * MinState PTD limit 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPTDMin();
  
  
  /**
   * Gets the value of the PTDPercentOfWages field.
   * The percentage of wages paid for Permanent Total Disability  (e.g. 80%)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPTDPercentOfWages();
  
  
  /**
   * Gets the value of the RateComments field.
   * Additional comments.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRateComments();
  
  
  /**
   * Gets the value of the RetroactivePeriod field.
   * The number of days at which the injured worker reimbursed for the Waiting Period presuming worker is still unable to work.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getRetroactivePeriod();
  
  
  /**
   * Gets the value of the StartDate field.
   * PD Benefit Effective Date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartDate();
  
  
  /**
   * Gets the value of the TPDMax field.
   * Max State TPD limit
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTPDMax();
  
  
  /**
   * Gets the value of the TPDMin field.
   * MinState TPD limit 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTPDMin();
  
  
  /**
   * Gets the value of the TPDPercentOfWages field.
   * The percentage of wages paid for Temporary Partial Disability (e.g. 80%)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTPDPercentOfWages();
  
  
  /**
   * Gets the value of the TTDMax field.
   * Max State TTD limit
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTTDMax();
  
  
  /**
   * Gets the value of the TTDMin field.
   * Min State TTD limit 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTTDMin();
  
  
  /**
   * Gets the value of the TTDPercentOfWages field.
   * The percentage of wages paid for Temporary Total Disability (e.g. 80%)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTTDPercentOfWages();
  
  
  /**
   * Gets the value of the WCBenefitFactors field.
   * Used to track comments, notes, special exceptions, etc
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.WCBenefitFactorDetail[] getWCBenefitFactors();
  
  
  /**
   * Gets the value of the WaitingPeriodDays field.
   * Number of days injured worker required to wait before benefits are paid.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getWaitingPeriodDays();
  
  
  /**
   * Gets the value of the PPDMinAdjToAWW field.
   * For PPD, if true and AWW is less than Min then set Min to AWW
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPPDMinAdjToAWW();
  
  
  /**
   * Gets the value of the PTDMinAdjToAWW field.
   * For PTD, if true and AWW is less than Min then set Min to AWW
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPTDMinAdjToAWW();
  
  
  /**
   * Gets the value of the TPDMinAdjToAWW field.
   * For TPD, if true and AWW is less than Min then set Min to AWW
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isTPDMinAdjToAWW();
  
  
  /**
   * Gets the value of the TTDMinAdjToAWW field.
   * For TTD, if true and AWW is less than Min then set Min to AWW
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isTTDMinAdjToAWW();
  
  
  /**
   * Gets the value of the WPNotAppliedToPPD field.
   * If true, Waiting Period is not applied for PPD
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isWPNotAppliedToPPD();
  
  
  /**
   * Gets the value of the WPNotAppliedToPTD field.
   * If true, Waiting Period is not applied for PTD
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isWPNotAppliedToPTD();
  
  
  /**
   * Removes the given element from the WCBenefitFactors array. This is achieved by marking the element for removal.
   */
  public void removeFromWCBenefitFactors(entity.WCBenefitFactorDetail element);
  
  
  /**
   * Removes the given element from the WCBenefitFactors array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromWCBenefitFactors(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the EndDate field.
   */
  public void setEndDate(java.util.Date value);
  
  
  /**
   * Sets the value of the JurisdictionState field.
   */
  public void setJurisdictionState(typekey.Jurisdiction value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the PPDMax field.
   */
  public void setPPDMax(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the PPDMin field.
   */
  public void setPPDMin(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the PPDMinAdjToAWW field.
   */
  public void setPPDMinAdjToAWW(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the PPDPercentOfWages field.
   */
  public void setPPDPercentOfWages(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the PTDMax field.
   */
  public void setPTDMax(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the PTDMin field.
   */
  public void setPTDMin(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the PTDMinAdjToAWW field.
   */
  public void setPTDMinAdjToAWW(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the PTDPercentOfWages field.
   */
  public void setPTDPercentOfWages(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the RateComments field.
   */
  public void setRateComments(java.lang.String value);
  
  
  /**
   * Sets the value of the RetroactivePeriod field.
   */
  public void setRetroactivePeriod(java.lang.Integer value);
  
  
  /**
   * Sets the value of the StartDate field.
   */
  public void setStartDate(java.util.Date value);
  
  
  /**
   * Sets the value of the TPDMax field.
   */
  public void setTPDMax(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TPDMin field.
   */
  public void setTPDMin(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TPDMinAdjToAWW field.
   */
  public void setTPDMinAdjToAWW(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the TPDPercentOfWages field.
   */
  public void setTPDPercentOfWages(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TTDMax field.
   */
  public void setTTDMax(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TTDMin field.
   */
  public void setTTDMin(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TTDMinAdjToAWW field.
   */
  public void setTTDMinAdjToAWW(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the TTDPercentOfWages field.
   */
  public void setTTDPercentOfWages(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the WCBenefitFactors field.
   */
  public void setWCBenefitFactors(entity.WCBenefitFactorDetail[] value);
  
  
  /**
   * Sets the value of the WPNotAppliedToPPD field.
   */
  public void setWPNotAppliedToPPD(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the WPNotAppliedToPTD field.
   */
  public void setWPNotAppliedToPTD(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the WaitingPeriodDays field.
   */
  public void setWaitingPeriodDays(java.lang.Integer value);
  
  
  
}