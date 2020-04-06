package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimAggregateLimitRpt.eti;ClaimAggregateLimitRpt.eix;ClaimAggregateLimitRpt.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimAggregateLimitRptInternal extends com.guidewire._generated.entity.EditableInternal, com.guidewire._generated.entity.AggregateLimitRptDelegateInternal, com.guidewire.cc.domain.aggregatelimit.impl.ClaimAggregateLimitRptInternal, gw.cc.aggregatelimit.entity.ClaimAggregateLimitRpt {
  /**
   * Gets the value of the ClaimInfo field.
   * ClaimInfo with which the aggregate limit is associated.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimInfo getClaimInfo();
  
  
  public gw.pl.persistence.core.Key getClaimInfoID();
  
  
  /**
   * Gets the value of the ErodingPaymentTotal field.
   * The total amount of eroding payment transactions from this claim that apply to the aggregate limit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getErodingPaymentTotal();
  
  
  /**
   * Gets the value of the FutureErodingPaymentTotal field.
   * The total amount of future eroding payment transactions from this claim that apply to the aggregate limit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getFutureErodingPaymentTotal();
  
  
  /**
   * Gets the value of the FutureNonErodingPaymentTotal field.
   * The total amount of future non-eroding payment transactions transactions from this claim that apply to the aggregate limit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getFutureNonErodingPaymentTotal();
  
  
  /**
   * Gets the value of the NonErodingPaymentTotal field.
   * The total amount of non-eroding payment transactions from this claim that apply to the aggregate limit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getNonErodingPaymentTotal();
  
  
  /**
   * Gets the value of the RecoveryReserveTotal field.
   * The total amount of recovery reserve transactions from this claim that apply to the aggregate limit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getRecoveryReserveTotal();
  
  
  /**
   * Gets the value of the RecoveryTotal field.
   * The total amount of recovery transactions from this claim that apply to the aggregate limit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getRecoveryTotal();
  
  
  /**
   * Gets the value of the ReserveTotal field.
   * The total amount of reserve transactions from this claim that apply to the aggregate limit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getReserveTotal();
  
  
  /**
   * Sets the value of the ClaimInfo field.
   */
  public void setClaimInfo(entity.ClaimInfo value);
  
  
  public void setClaimInfoID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ErodingPaymentTotal field.
   */
  public void setErodingPaymentTotal(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the FutureErodingPaymentTotal field.
   */
  public void setFutureErodingPaymentTotal(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the FutureNonErodingPaymentTotal field.
   */
  public void setFutureNonErodingPaymentTotal(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the NonErodingPaymentTotal field.
   */
  public void setNonErodingPaymentTotal(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the RecoveryReserveTotal field.
   */
  public void setRecoveryReserveTotal(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the RecoveryTotal field.
   */
  public void setRecoveryTotal(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the ReserveTotal field.
   */
  public void setReserveTotal(gw.api.financials.CurrencyAmount value);
  
  
  
}