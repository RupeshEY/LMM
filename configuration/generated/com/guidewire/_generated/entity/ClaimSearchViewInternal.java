package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimSearchView.eti;ClaimSearchView.eix;ClaimSearchView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimSearchViewInternal extends com.guidewire._generated.entity.ClaimAssignmentViewInternal, gw.cc.claim.ArchivedClaimCompatible, gw.cc.claim.entity.ClaimSearchView {
  /**
   * Gets the value of the AssignedGroup field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAssignedGroup();
  
  
  /**
   * Gets the value of the FuturePayments field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getFuturePayments();
  
  
  /**
   * Gets the value of the RemainingReserves field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getRemainingReserves();
  
  
  /**
   * Gets the value of the ReportedDate field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getReportedDate();
  
  
  /**
   * Gets the value of the TotalPayments field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getTotalPayments();
  
  
  /**
   * Gets the value of the UCR_Ext field.
   * A Unique Claim Reference (UCR) Number
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getUCR_Ext();
  
  
  /**
   * Gets the value of the UMR_Ext field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getUMR_Ext();
  
  
  /**
   * Sets the value of the AssignedGroup field.
   */
  public void setAssignedGroup(java.lang.String value);
  
  
  /**
   * Sets the value of the FuturePayments field.
   */
  public void setFuturePayments(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the RemainingReserves field.
   */
  public void setRemainingReserves(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the ReportedDate field.
   */
  public void setReportedDate(java.util.Date value);
  
  
  /**
   * Sets the value of the TotalPayments field.
   */
  public void setTotalPayments(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the UCR_Ext field.
   */
  public void setUCR_Ext(java.lang.String value);
  
  
  /**
   * Sets the value of the UMR_Ext field.
   */
  public void setUMR_Ext(java.lang.String value);
  
  
  
}