package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimVacationView.eti;ClaimVacationView.eix;ClaimVacationView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimVacationViewInternal extends com.guidewire._generated.entity.ClaimAssignmentViewInternal, gw.cc.claim.entity.ClaimVacationView {
  /**
   * Gets the value of the TotalIncurredNet field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getTotalIncurredNet();
  
  
  /**
   * Sets the value of the TotalIncurredNet field.
   */
  public void setTotalIncurredNet(gw.api.financials.CurrencyAmount value);
  
  
  
}