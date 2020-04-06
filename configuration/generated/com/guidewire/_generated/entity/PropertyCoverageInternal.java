package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PropertyCoverage.eti;PropertyCoverage.eix;PropertyCoverage.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface PropertyCoverageInternal extends com.guidewire._generated.entity.RUCoverageInternal, gw.cc.policy.entity.PropertyCoverage {
  /**
   * Gets the value of the Coinsurance field.
   * Co-insurance percentage.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getCoinsurance();
  
  
  /**
   * Gets the value of the CoverageBasis field.
   * Coverage basis.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CoverageBasis getCoverageBasis();
  
  
  /**
   * Sets the value of the Coinsurance field.
   */
  public void setCoinsurance(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the CoverageBasis field.
   */
  public void setCoverageBasis(typekey.CoverageBasis value);
  
  
  
}