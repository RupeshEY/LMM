package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "FinancialCriterionMC.eti;FinancialCriterionMC.eix;FinancialCriterionMC.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface FinancialCriterionMCInternal extends com.guidewire._generated.entity.FinancialCriterionInternal, com.guidewire.cc.domain.financials.impl.FinancialCriterionMCInternal, gw.cc.financials.entity.FinancialCriterionMC {
  /**
   * Gets the value of the Currency field.
   * The currency to match for the search, if any.  If no currency is chosen, and system is in multicurrency mode then the search will happen against claim currency amount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency();
  
  
  /**
   * Sets the value of the Currency field.
   */
  public void setCurrency(typekey.Currency value);
  
  
  
}