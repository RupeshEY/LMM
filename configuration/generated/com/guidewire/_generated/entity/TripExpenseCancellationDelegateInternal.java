package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TripExpenseCancellationDelegate.eti;TripExpenseCancellationDelegate.eix;TripExpenseCancellationDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TripExpenseCancellationDelegateInternal extends com.guidewire._generated.entity.TripExpenseDelegateInternal, gw.cc.exposure.entity.TripExpenseCancellationDelegate {
  /**
   * Gets the value of the CancellationFees field.
   * Cancellation fees incurred
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getCancellationFees();
  
  
  /**
   * Gets the value of the ReasonForCancellation field.
   * Reason for cancellation
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getReasonForCancellation();
  
  
  /**
   * Gets the value of the CancelOnly field.
   * Indicates if the expense is cancelled without the need for additional arrangements
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCancelOnly();
  
  
  /**
   * Sets the value of the CancelOnly field.
   */
  public void setCancelOnly(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the CancellationFees field.
   */
  public void setCancellationFees(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the ReasonForCancellation field.
   */
  public void setReasonForCancellation(java.lang.String value);
  
  
  
}