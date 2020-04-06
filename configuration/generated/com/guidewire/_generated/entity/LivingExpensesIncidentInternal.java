package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LivingExpensesIncident.eti;LivingExpensesIncident.eix;LivingExpensesIncident.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface LivingExpensesIncidentInternal extends com.guidewire._generated.entity.PropertyIncidentInternal, gw.cc.exposure.entity.LivingExpensesIncident {
  /**
   * Gets the value of the StartDate field.
   * The date for which the insured started staying at the lodging provider.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartDate();
  
  
  /**
   * Sets the value of the StartDate field.
   */
  public void setStartDate(java.util.Date value);
  
  
  
}