package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "SpecialHandlingPreviousAmount.eti;SpecialHandlingPreviousAmount.eix;SpecialHandlingPreviousAmount.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface SpecialHandlingPreviousAmountInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.specialhandling.entity.SpecialHandlingPreviousAmount {
  /**
   * Gets the value of the FinancialThreshold field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.FinancialThreshold getFinancialThreshold();
  
  
  /**
   * Gets the value of the PreviousAmount field.
   * Previous value used by special handling triggers
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getPreviousAmount();
  
  
  /**
   * Gets the value of the SpecialHandlingFinancialState field.
   * The special handling financial state entity that this is associated with.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SpecialHandlingFinancialState getSpecialHandlingFinancialState();
  
  
  public gw.pl.persistence.core.Key getSpecialHandlingFinancialStateID();
  
  
  /**
   * Sets the value of the FinancialThreshold field.
   */
  public void setFinancialThreshold(typekey.FinancialThreshold value);
  
  
  /**
   * Sets the value of the PreviousAmount field.
   */
  public void setPreviousAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the SpecialHandlingFinancialState field.
   */
  public void setSpecialHandlingFinancialState(entity.SpecialHandlingFinancialState value);
  
  
  public void setSpecialHandlingFinancialStateID(gw.pl.persistence.core.Key value);
  
  
  
}