package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpStagingExposureRpt.eti;TmpStagingExposureRpt.eix;TmpStagingExposureRpt.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TmpStagingExposureRptInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, com.guidewire.cc.domain.financials.impl.TmpStagingExposureRptInternal, gw.cc.financials.entity.TmpStagingExposureRpt {
  /**
   * Gets the value of the AvailableReserves field.
   * The available reserves on an exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getAvailableReserves();
  
  
  /**
   * Gets the value of the AvailableResrvRprtng field.
   * The available reserves on an exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getAvailableResrvRprtng();
  
  
  /**
   * Gets the value of the ClaimID field.
   * This exposure's claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getClaimID();
  
  
  /**
   * Gets the value of the ClaimPublicID field.
   * The public ID for the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimPublicID();
  
  
  /**
   * Gets the value of the ClaimRptID field.
   * The ID for the ClaimRpt record being inserted
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getClaimRptID();
  
  
  /**
   * Gets the value of the ClaimRptPublicID field.
   * The public ID for the ClaimRpt record being inserted.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimRptPublicID();
  
  
  /**
   * Gets the value of the ExposureID field.
   * The exposure that the calculations are on.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getExposureID();
  
  
  /**
   * Gets the value of the ExposurePublicID field.
   * The public ID for the exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getExposurePublicID();
  
  
  /**
   * Gets the value of the ExposureRptID field.
   * The ID for the ExposureRpt record being inserted
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getExposureRptID();
  
  
  /**
   * Gets the value of the ExposureRptPublicID field.
   * The public ID for the ExposureRpt record being inserted.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getExposureRptPublicID();
  
  
  /**
   * Gets the value of the FuturePayments field.
   * The total of awaiting submission payments scheduled to be sent after today.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getFuturePayments();
  
  
  /**
   * Gets the value of the FuturePaymentsRprtng field.
   * The total of awaiting submission payments scheduled to be sent after today.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getFuturePaymentsRprtng();
  
  
  /**
   * Gets the value of the OpenRecoveryResRprtng field.
   * The open recovery reserves on an exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getOpenRecoveryResRprtng();
  
  
  /**
   * Gets the value of the OpenRecoveryReserves field.
   * The open recovery reserves on an exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getOpenRecoveryReserves();
  
  
  /**
   * Gets the value of the OpenReserves field.
   * The open reserves.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getOpenReserves();
  
  
  /**
   * Gets the value of the OpenReservesRprtng field.
   * The open reserves.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getOpenReservesRprtng();
  
  
  /**
   * Gets the value of the RemainingReserves field.
   * The remaining reserves on an exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getRemainingReserves();
  
  
  /**
   * Gets the value of the RemainingResrvRprtng field.
   * The remaining reserves on an exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getRemainingResrvRprtng();
  
  
  /**
   * Gets the value of the TotalPayments field.
   * The total payments.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalPayments();
  
  
  /**
   * Gets the value of the TotalPaymentsRprtng field.
   * The total payments.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalPaymentsRprtng();
  
  
  /**
   * Gets the value of the TotalRecoveries field.
   * The total recoveries on an exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalRecoveries();
  
  
  /**
   * Gets the value of the TotalRecoveriesRprtng field.
   * The total recoveries on an exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalRecoveriesRprtng();
  
  
  /**
   * Sets the value of the AvailableReserves field.
   */
  public void setAvailableReserves(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the AvailableResrvRprtng field.
   */
  public void setAvailableResrvRprtng(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the ClaimID field.
   */
  public void setClaimID(java.lang.Long value);
  
  
  /**
   * Sets the value of the ClaimPublicID field.
   */
  public void setClaimPublicID(java.lang.String value);
  
  
  /**
   * Sets the value of the ClaimRptID field.
   */
  public void setClaimRptID(java.lang.Long value);
  
  
  /**
   * Sets the value of the ClaimRptPublicID field.
   */
  public void setClaimRptPublicID(java.lang.String value);
  
  
  /**
   * Sets the value of the ExposureID field.
   */
  public void setExposureID(java.lang.Long value);
  
  
  /**
   * Sets the value of the ExposurePublicID field.
   */
  public void setExposurePublicID(java.lang.String value);
  
  
  /**
   * Sets the value of the ExposureRptID field.
   */
  public void setExposureRptID(java.lang.Long value);
  
  
  /**
   * Sets the value of the ExposureRptPublicID field.
   */
  public void setExposureRptPublicID(java.lang.String value);
  
  
  /**
   * Sets the value of the FuturePayments field.
   */
  public void setFuturePayments(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the FuturePaymentsRprtng field.
   */
  public void setFuturePaymentsRprtng(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the OpenRecoveryResRprtng field.
   */
  public void setOpenRecoveryResRprtng(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the OpenRecoveryReserves field.
   */
  public void setOpenRecoveryReserves(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the OpenReserves field.
   */
  public void setOpenReserves(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the OpenReservesRprtng field.
   */
  public void setOpenReservesRprtng(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the RemainingReserves field.
   */
  public void setRemainingReserves(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the RemainingResrvRprtng field.
   */
  public void setRemainingResrvRprtng(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TotalPayments field.
   */
  public void setTotalPayments(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TotalPaymentsRprtng field.
   */
  public void setTotalPaymentsRprtng(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TotalRecoveries field.
   */
  public void setTotalRecoveries(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TotalRecoveriesRprtng field.
   */
  public void setTotalRecoveriesRprtng(java.math.BigDecimal value);
  
  
  
}