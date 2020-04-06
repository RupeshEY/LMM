package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "NumericCovTerm.eti;NumericCovTerm.eix;NumericCovTerm.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface NumericCovTermInternal extends com.guidewire._generated.entity.CovTermInternal, gw.cc.policy.entity.NumericCovTerm {
  /**
   * Gets the value of the NumericValue field.
   * Numeric value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getNumericValue();
  
  
  /**
   * Gets the value of the Units field.
   * Coverage term units
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CovTermModelVal getUnits();
  
  
  /**
   * Sets the value of the NumericValue field.
   */
  public void setNumericValue(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the Units field.
   */
  public void setUnits(typekey.CovTermModelVal value);
  
  
  
}