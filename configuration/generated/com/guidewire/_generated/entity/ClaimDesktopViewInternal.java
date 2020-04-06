package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimDesktopView.eti;ClaimDesktopView.eix;ClaimDesktopView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimDesktopViewInternal extends com.guidewire._generated.entity.ClaimAbstractViewInternal, gw.cc.claim.entity.ClaimDesktopView {
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