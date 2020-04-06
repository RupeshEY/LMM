package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LargeLossClaimIndicator.eti;LargeLossClaimIndicator.eix;LargeLossClaimIndicator.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface LargeLossClaimIndicatorInternal extends com.guidewire._generated.entity.ClaimIndicatorInternal {
  /**
   * Gets the value of the NetTotalIncurred field.
   * Net Total Incurred
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getNetTotalIncurred();
  
  
  /**
   * Sets the value of the NetTotalIncurred field.
   */
  public void setNetTotalIncurred(gw.api.financials.CurrencyAmount value);
  
  
  
}