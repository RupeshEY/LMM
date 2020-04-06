package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "FinancialsRptUpgrade.eti;FinancialsRptUpgrade.eix;FinancialsRptUpgrade.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface FinancialsRptUpgradeInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, gw.cc.financials.entity.FinancialsRptUpgrade {
  /**
   * Gets the value of the Claim field.
   * Claim id.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getClaim();
  
  
  /**
   * Gets the value of the ErdngUnappPmtsRprtng field.
   * All pending-approval eroding payments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getErdngUnappPmtsRprtng();
  
  
  /**
   * Gets the value of the ErodingUnapprvdPmts field.
   * All pending-approval eroding payments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getErodingUnapprvdPmts();
  
  
  /**
   * Gets the value of the Exposure field.
   * Exposure id.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getExposure();
  
  
  /**
   * Gets the value of the ForExAdjustments field.
   * All foreign exchange adjustments to payments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getForExAdjustments();
  
  
  /**
   * Gets the value of the ForExAdjustmentsRprtng field.
   * All foreign exchange adjustments to payments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getForExAdjustmentsRprtng();
  
  
  /**
   * Gets the value of the FtrErodngPmtsRprtng field.
   * All FutureDated eroding payments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getFtrErodngPmtsRprtng();
  
  
  /**
   * Gets the value of the FtrNonErodngPmtsRprtng field.
   * All FutureDated non-eroding payments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getFtrNonErodngPmtsRprtng();
  
  
  /**
   * Gets the value of the FutureErodingPmts field.
   * All FutureDated eroding payments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getFutureErodingPmts();
  
  
  /**
   * Gets the value of the FutureNonErodingPmts field.
   * All FutureDated non-eroding payments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getFutureNonErodingPmts();
  
  
  /**
   * Gets the value of the TotalErodingPmts field.
   * All awaiting-submission and committed eroding payments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalErodingPmts();
  
  
  /**
   * Gets the value of the TotalNonErodingPmts field.
   * All awaiting-submission and committed non-eroding payments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalNonErodingPmts();
  
  
  /**
   * Gets the value of the TotalPayments field.
   * All (eroding and non-eroding) awaiting-submission and committed payments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalPayments();
  
  
  /**
   * Gets the value of the TotalPaymentsRprtng field.
   * All (eroding and non-eroding) awaiting-submission and committed payments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalPaymentsRprtng();
  
  
  /**
   * Gets the value of the TotalRecReservesRprtng field.
   * All committed recovery-reserves
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalRecReservesRprtng();
  
  
  /**
   * Gets the value of the TotalRecoveries field.
   * All committed recoveries
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalRecoveries();
  
  
  /**
   * Gets the value of the TotalRecoveriesRprtng field.
   * All committed recoveries
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalRecoveriesRprtng();
  
  
  /**
   * Gets the value of the TotalRecoveryReserves field.
   * All committed recovery-reserves
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalRecoveryReserves();
  
  
  /**
   * Gets the value of the TotalReserves field.
   * All awaiting-submission and commited reserves
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalReserves();
  
  
  /**
   * Gets the value of the TotalReservesRprtng field.
   * All awaiting-submission and commited reserves
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalReservesRprtng();
  
  
  /**
   * Gets the value of the TotlErdngPmtsRprtng field.
   * All awaiting-submission and committed eroding payments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotlErdngPmtsRprtng();
  
  
  /**
   * Gets the value of the TotlNonErdngPmtsRprtng field.
   * All awaiting-submission and committed non-eroding payments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotlNonErdngPmtsRprtng();
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(java.lang.Long value);
  
  
  /**
   * Sets the value of the ErdngUnappPmtsRprtng field.
   */
  public void setErdngUnappPmtsRprtng(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the ErodingUnapprvdPmts field.
   */
  public void setErodingUnapprvdPmts(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the Exposure field.
   */
  public void setExposure(java.lang.Long value);
  
  
  /**
   * Sets the value of the ForExAdjustments field.
   */
  public void setForExAdjustments(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the ForExAdjustmentsRprtng field.
   */
  public void setForExAdjustmentsRprtng(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the FtrErodngPmtsRprtng field.
   */
  public void setFtrErodngPmtsRprtng(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the FtrNonErodngPmtsRprtng field.
   */
  public void setFtrNonErodngPmtsRprtng(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the FutureErodingPmts field.
   */
  public void setFutureErodingPmts(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the FutureNonErodingPmts field.
   */
  public void setFutureNonErodingPmts(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TotalErodingPmts field.
   */
  public void setTotalErodingPmts(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TotalNonErodingPmts field.
   */
  public void setTotalNonErodingPmts(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TotalPayments field.
   */
  public void setTotalPayments(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TotalPaymentsRprtng field.
   */
  public void setTotalPaymentsRprtng(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TotalRecReservesRprtng field.
   */
  public void setTotalRecReservesRprtng(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TotalRecoveries field.
   */
  public void setTotalRecoveries(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TotalRecoveriesRprtng field.
   */
  public void setTotalRecoveriesRprtng(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TotalRecoveryReserves field.
   */
  public void setTotalRecoveryReserves(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TotalReserves field.
   */
  public void setTotalReserves(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TotalReservesRprtng field.
   */
  public void setTotalReservesRprtng(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TotlErdngPmtsRprtng field.
   */
  public void setTotlErdngPmtsRprtng(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TotlNonErdngPmtsRprtng field.
   */
  public void setTotlNonErdngPmtsRprtng(java.math.BigDecimal value);
  
  
  
}