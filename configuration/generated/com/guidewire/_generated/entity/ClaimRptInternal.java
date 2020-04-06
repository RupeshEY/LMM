package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimRpt.eti;ClaimRpt.eix;ClaimRpt.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimRptInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire.cc.domain.financials.impl.ClaimRptInternal, gw.cc.financials.entity.ClaimRpt {
  /**
   * Gets the value of the AvailableReserves field.
   * The available reserves on a claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getAvailableReserves();
  
  
  /**
   * Gets the value of the AvailableReservesReporting field.
   * The available reserves on a claim, in Reporting/Default Currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getAvailableReservesReporting();
  
  
  /**
   * Gets the value of the Claim field.
   * The claim that the calculations are on.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the FuturePayments field.
   * The future payments total.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getFuturePayments();
  
  
  /**
   * Gets the value of the FuturePaymentsReporting field.
   * The future payments total on a claim, in Reporting/Default Currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getFuturePaymentsReporting();
  
  
  /**
   * Gets the value of the OpenRecoveryReserves field.
   * The open recovery reserves on the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getOpenRecoveryReserves();
  
  
  /**
   * Gets the value of the OpenRecoveryReservesReporting field.
   * The open recovery reserves on a claim, in Reporting/Default Currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getOpenRecoveryReservesReporting();
  
  
  /**
   * Gets the value of the OpenReserves field.
   * The open reserves.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getOpenReserves();
  
  
  /**
   * Gets the value of the OpenReservesReporting field.
   * The open reserves on a claim, in Reporting/Default Currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getOpenReservesReporting();
  
  
  /**
   * Gets the value of the RemainingReserves field.
   * The remaining reserves on a claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getRemainingReserves();
  
  
  /**
   * Gets the value of the RemainingReservesReporting field.
   * The remaining reserves on a claim, in Reporting/Default Currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getRemainingReservesReporting();
  
  
  /**
   * Gets the value of the TotalPayments field.
   * The total payments.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getTotalPayments();
  
  
  /**
   * Gets the value of the TotalPaymentsReporting field.
   * The total payments on a claim, in Reporting/Default Currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getTotalPaymentsReporting();
  
  
  /**
   * Gets the value of the TotalRecoveries field.
   * The total recoveries on a claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getTotalRecoveries();
  
  
  /**
   * Gets the value of the TotalRecoveriesReporting field.
   * The total recoveries on a claim, in Reporting/Default Currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getTotalRecoveriesReporting();
  
  
  /**
   * Sets the value of the AvailableReserves field.
   */
  public void setAvailableReserves(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the AvailableReservesReporting field.
   */
  public void setAvailableReservesReporting(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the FuturePayments field.
   */
  public void setFuturePayments(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the FuturePaymentsReporting field.
   */
  public void setFuturePaymentsReporting(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the OpenRecoveryReserves field.
   */
  public void setOpenRecoveryReserves(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the OpenRecoveryReservesReporting field.
   */
  public void setOpenRecoveryReservesReporting(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the OpenReserves field.
   */
  public void setOpenReserves(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the OpenReservesReporting field.
   */
  public void setOpenReservesReporting(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the RemainingReserves field.
   */
  public void setRemainingReserves(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the RemainingReservesReporting field.
   */
  public void setRemainingReservesReporting(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the TotalPayments field.
   */
  public void setTotalPayments(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the TotalPaymentsReporting field.
   */
  public void setTotalPaymentsReporting(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the TotalRecoveries field.
   */
  public void setTotalRecoveries(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the TotalRecoveriesReporting field.
   */
  public void setTotalRecoveriesReporting(gw.api.financials.CurrencyAmount value);
  
  
  
}