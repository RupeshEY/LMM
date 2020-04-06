package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Benefits.eti;Benefits.eix;Benefits.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface BenefitsInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.exposure.entity.Benefits {
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
   * Gets the value of the BenefitsEndDate field.
   * Date when benefits end.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getBenefitsEndDate();
  
  
  /**
   * Gets the value of the Description field.
   * Additional information about benefits.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the FirstPaymentDate field.
   * Date 1st payment made
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getFirstPaymentDate();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the MMIDate field.
   * Date when maximum medical improvement was reached (when PPD benefits can start).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getMMIDate();
  
  
  /**
   * Gets the value of the MaxBurialRate field.
   * Maximum burial rate.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getMaxBurialRate();
  
  
  /**
   * Gets the value of the MaxCompRate field.
   * State maximum benefit amount.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getMaxCompRate();
  
  
  /**
   * Gets the value of the MinCompRate field.
   * State minimum benefit amount.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getMinCompRate();
  
  
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
   * Gets the value of the PaidOnTime field.
   * 1st payment - whether made on time or reason why not
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PaidOnTime getPaidOnTime();
  
  
  /**
   * Gets the value of the PaymentFrequency field.
   * Payment frequency for benefits. This differs by state.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PaymentFrequencyType getPaymentFrequency();
  
  
  /**
   * Gets the value of the PaymentLimit field.
   * Payment limit
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getPaymentLimit();
  
  
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
   * Gets the value of the ProviderType field.
   * Type of services provider.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ProviderType getProviderType();
  
  
  /**
   * Gets the value of the RetroPeriod field.
   * Retroactive period.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RetroPeriodType getRetroPeriod();
  
  
  /**
   * Gets the value of the Services field.
   * Services required.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getServices();
  
  
  /**
   * Gets the value of the SettleDate field.
   * Date of settlement.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getSettleDate();
  
  
  /**
   * Gets the value of the SettleMethod field.
   * Method of settlement.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SettleMethod getSettleMethod();
  
  
  /**
   * Gets the value of the WaitPrdBeginDate field.
   * Date when the waiting period begins.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getWaitPrdBeginDate();
  
  
  /**
   * Gets the value of the WaitPrdEndDate field.
   * Date when the waiting period ends.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getWaitPrdEndDate();
  
  
  /**
   * Gets the value of the WaitingPeriod field.
   * Waiting period before benefits begin. This differs by state.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.WaitingPeriodType getWaitingPeriod();
  
  
  /**
   * Gets the value of the WeeklyCompRate field.
   * Weekly compensation rate. This calculation depends on type of benefit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getWeeklyCompRate();
  
  
  /**
   * Gets the value of the WeeklyCompRateInfo field.
   * Rating Information
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getWeeklyCompRateInfo();
  
  
  /**
   * Gets the value of the WaitingPeriodPaid field.
   * Whether the Employer has paid the waiting period
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isWaitingPeriodPaid();
  
  
  /**
   * Sets the value of the BenefitType field.
   */
  public void setBenefitType(typekey.LostWagesBenefitType value);
  
  
  /**
   * Sets the value of the BenefitsBeginDate field.
   */
  public void setBenefitsBeginDate(java.util.Date value);
  
  
  /**
   * Sets the value of the BenefitsEndDate field.
   */
  public void setBenefitsEndDate(java.util.Date value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the FirstPaymentDate field.
   */
  public void setFirstPaymentDate(java.util.Date value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the MMIDate field.
   */
  public void setMMIDate(java.util.Date value);
  
  
  /**
   * Sets the value of the MaxBurialRate field.
   */
  public void setMaxBurialRate(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the MaxCompRate field.
   */
  public void setMaxCompRate(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the MinCompRate field.
   */
  public void setMinCompRate(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the MonthlyCompRate field.
   */
  public void setMonthlyCompRate(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the NumPaymentWeeks field.
   */
  public void setNumPaymentWeeks(java.lang.Integer value);
  
  
  /**
   * Sets the value of the PaidOnTime field.
   */
  public void setPaidOnTime(typekey.PaidOnTime value);
  
  
  /**
   * Sets the value of the PaymentFrequency field.
   */
  public void setPaymentFrequency(typekey.PaymentFrequencyType value);
  
  
  /**
   * Sets the value of the PaymentLimit field.
   */
  public void setPaymentLimit(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the PercentageComp field.
   */
  public void setPercentageComp(java.lang.Integer value);
  
  
  /**
   * Sets the value of the PostInjryWklyWgs field.
   */
  public void setPostInjryWklyWgs(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the ProviderType field.
   */
  public void setProviderType(typekey.ProviderType value);
  
  
  /**
   * Sets the value of the RetroPeriod field.
   */
  public void setRetroPeriod(typekey.RetroPeriodType value);
  
  
  /**
   * Sets the value of the Services field.
   */
  public void setServices(java.lang.String value);
  
  
  /**
   * Sets the value of the SettleDate field.
   */
  public void setSettleDate(java.util.Date value);
  
  
  /**
   * Sets the value of the SettleMethod field.
   */
  public void setSettleMethod(typekey.SettleMethod value);
  
  
  /**
   * Sets the value of the WaitPrdBeginDate field.
   */
  public void setWaitPrdBeginDate(java.util.Date value);
  
  
  /**
   * Sets the value of the WaitPrdEndDate field.
   */
  public void setWaitPrdEndDate(java.util.Date value);
  
  
  /**
   * Sets the value of the WaitingPeriod field.
   */
  public void setWaitingPeriod(typekey.WaitingPeriodType value);
  
  
  /**
   * Sets the value of the WaitingPeriodPaid field.
   */
  public void setWaitingPeriodPaid(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the WeeklyCompRate field.
   */
  public void setWeeklyCompRate(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the WeeklyCompRateInfo field.
   */
  public void setWeeklyCompRateInfo(java.lang.String value);
  
  
  
}