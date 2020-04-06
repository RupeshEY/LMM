package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "MonthlyCheckRecurrence.eti;MonthlyCheckRecurrence.eix;MonthlyCheckRecurrence.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface MonthlyCheckRecurrenceInternal extends com.guidewire._generated.entity.CheckRecurrenceInternal, com.guidewire.cc.domain.financials.check.impl.MonthlyCheckRecurrenceInternal, gw.cc.financials.check.entity.MonthlyCheckRecurrence {
  /**
   * Gets the value of the MonthlyFrequency field.
   * A check is made every n month(s).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getMonthlyFrequency();
  
  
  /**
   * Gets the value of the RecurrenceDate field.
   * Day of every month the check is due.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getRecurrenceDate();
  
  
  /**
   * Gets the value of the RecurrenceWeek field.
   * Week in the month the check is due.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RecurrenceWeek getRecurrenceWeek();
  
  
  /**
   * Sets the value of the MonthlyFrequency field.
   */
  public void setMonthlyFrequency(java.lang.Integer value);
  
  
  /**
   * Sets the value of the RecurrenceDate field.
   */
  public void setRecurrenceDate(java.lang.Integer value);
  
  
  /**
   * Sets the value of the RecurrenceWeek field.
   */
  public void setRecurrenceWeek(typekey.RecurrenceWeek value);
  
  
  
}