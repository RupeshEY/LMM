package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RUCoverage.eti;RUCoverage.eix;RUCoverage.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RUCoverageInternal extends com.guidewire._generated.entity.CoverageInternal, gw.cc.policy.entity.RUCoverage {
  /**
   * Gets the value of the RiskUnit field.
   * RiskUnit associated with the coverage.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RiskUnit getRiskUnit();
  
  
  public gw.pl.persistence.core.Key getRiskUnitID();
  
  
  /**
   * Sets the value of the RiskUnit field.
   */
  public void setRiskUnit(entity.RiskUnit value);
  
  
  public void setRiskUnitID(gw.pl.persistence.core.Key value);
  
  
  
}