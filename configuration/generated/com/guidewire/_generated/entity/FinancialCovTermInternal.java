package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "FinancialCovTerm.eti;FinancialCovTerm.eix;FinancialCovTerm.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface FinancialCovTermInternal extends com.guidewire._generated.entity.CovTermInternal, gw.cc.policy.entity.FinancialCovTerm {
  /**
   * Gets the value of the FinancialAmount field.
   * Financial amount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getFinancialAmount();
  
  
  /**
   * Sets the value of the FinancialAmount field.
   */
  public void setFinancialAmount(gw.api.financials.CurrencyAmount value);
  
  
  
}