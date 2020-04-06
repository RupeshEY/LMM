package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "BenefitPeriod.eti;BenefitPeriod.eix;BenefitPeriod.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface BenefitPeriodInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.exposure.entity.BenefitPeriod {
  /**
   * Gets the value of the BenefitType field.
   * Type of lost wages benefit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LostWagesBenefitType getBenefitType();
  
  
  /**
   * Gets the value of the BenefitsBeginDate field.
   * Date when benefits start.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getBenefitsBeginDate();
  
  
  /**
   * Gets the value of the Description field.
   * Additional information.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the Exposure field.
   * The related exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure getExposure();
  
  
  public gw.pl.persistence.core.Key getExposureID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the MonthlyCompRate field.
   * Monthly compensation rate. This calculation depends on the type of benefit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getMonthlyCompRate();
  
  
  /**
   * Gets the value of the NumPaymentWeeks field.
   * Number of weeks benefits will be paid. This differs by state.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNumPaymentWeeks();
  
  
  /**
   * Gets the value of the PercentageComp field.
   * Percentage compensability.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getPercentageComp();
  
  
  /**
   * Gets the value of the PostInjryWklyWgs field.
   * Weekly wages post-injury.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getPostInjryWklyWgs();
  
  
  /**
   * Gets the value of the WeeklyCompRate field.
   * Weekly compensation rate. This calculation depends on type of benefit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getWeeklyCompRate();
  
  
  /**
   * Sets the value of the BenefitType field.
   */
  public void setBenefitType(typekey.LostWagesBenefitType value);
  
  
  /**
   * Sets the value of the BenefitsBeginDate field.
   */
  public void setBenefitsBeginDate(java.util.Date value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the Exposure field.
   */
  public void setExposure(entity.Exposure value);
  
  
  public void setExposureID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the MonthlyCompRate field.
   */
  public void setMonthlyCompRate(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the NumPaymentWeeks field.
   */
  public void setNumPaymentWeeks(java.lang.Integer value);
  
  
  /**
   * Sets the value of the PercentageComp field.
   */
  public void setPercentageComp(java.lang.Integer value);
  
  
  /**
   * Sets the value of the PostInjryWklyWgs field.
   */
  public void setPostInjryWklyWgs(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the WeeklyCompRate field.
   */
  public void setWeeklyCompRate(gw.api.financials.CurrencyAmount value);
  
  
  
}