package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TripExpenseDelegate.eti;TripExpenseDelegate.eix;TripExpenseDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TripExpenseDelegateInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, gw.cc.exposure.entity.TripExpenseDelegate {
  /**
   * Gets the value of the AgentFees field.
   * Agent fees incurred
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getAgentFees();
  
  
  /**
   * Gets the value of the Assessment field.
   * Approve, deny or review an expense
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AssessmentAction getAssessment();
  
  
  /**
   * Gets the value of the EndDate field.
   * The ending date/time for this expense
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEndDate();
  
  
  /**
   * Gets the value of the OtherFees field.
   * Other fees incurred
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getOtherFees();
  
  
  /**
   * Gets the value of the PaidAmount field.
   * Original invoiced amount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getPaidAmount();
  
  
  /**
   * Gets the value of the ReasonForDenial field.
   * Reasons for denial
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getReasonForDenial();
  
  
  /**
   * Gets the value of the StartDate field.
   * The starting date/time for this expense
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartDate();
  
  
  /**
   * Sets the value of the AgentFees field.
   */
  public void setAgentFees(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the Assessment field.
   */
  public void setAssessment(typekey.AssessmentAction value);
  
  
  /**
   * Sets the value of the EndDate field.
   */
  public void setEndDate(java.util.Date value);
  
  
  /**
   * Sets the value of the OtherFees field.
   */
  public void setOtherFees(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the PaidAmount field.
   */
  public void setPaidAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the ReasonForDenial field.
   */
  public void setReasonForDenial(java.lang.String value);
  
  
  /**
   * Sets the value of the StartDate field.
   */
  public void setStartDate(java.util.Date value);
  
  
  
}