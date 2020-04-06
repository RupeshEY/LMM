package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PercentReserveChangeClaimMetric.eti;PercentReserveChangeClaimMetric.eix;PercentReserveChangeClaimMetric.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface PercentReserveChangeClaimMetricInternal extends com.guidewire._generated.entity.PercentClaimMetricInternal {
  /**
   * Gets the value of the InitialReserve field.
   * Initial Reserve Amount of the Claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getInitialReserve();
  
  
  /**
   * Gets the value of the TotalReserveChange field.
   * Total Reserve Amount change
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalReserveChange();
  
  
  /**
   * Sets the value of the InitialReserve field.
   */
  public void setInitialReserve(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TotalReserveChange field.
   */
  public void setTotalReserveChange(java.math.BigDecimal value);
  
  
  
}