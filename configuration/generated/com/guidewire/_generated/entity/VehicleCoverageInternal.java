package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "VehicleCoverage.eti;VehicleCoverage.eix;VehicleCoverage.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface VehicleCoverageInternal extends com.guidewire._generated.entity.RUCoverageInternal, gw.cc.policy.entity.VehicleCoverage {
  /**
   * Gets the value of the ClaimAggLimit field.
   * The per incident dollar limit for all PIP coverage.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getClaimAggLimit();
  
  
  /**
   * Gets the value of the NonmedAggLimit field.
   * The dollar limit for all PIP Non-Medical coverage.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getNonmedAggLimit();
  
  
  /**
   * Gets the value of the PersonAggLimit field.
   * The per person dollar limit for all PIP coverage.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getPersonAggLimit();
  
  
  /**
   * Gets the value of the ReplaceAggLimit field.
   * The dollar limit for all PIP Lost Wage and Replacement Services coverage.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getReplaceAggLimit();
  
  
  /**
   * Sets the value of the ClaimAggLimit field.
   */
  public void setClaimAggLimit(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the NonmedAggLimit field.
   */
  public void setNonmedAggLimit(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the PersonAggLimit field.
   */
  public void setPersonAggLimit(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the ReplaceAggLimit field.
   */
  public void setReplaceAggLimit(gw.api.financials.CurrencyAmount value);
  
  
  
}