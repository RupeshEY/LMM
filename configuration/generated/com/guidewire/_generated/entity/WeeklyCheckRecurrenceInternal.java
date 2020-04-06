package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "WeeklyCheckRecurrence.eti;WeeklyCheckRecurrence.eix;WeeklyCheckRecurrence.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface WeeklyCheckRecurrenceInternal extends com.guidewire._generated.entity.CheckRecurrenceInternal, gw.cc.financials.check.entity.WeeklyCheckRecurrence {
  /**
   * Gets the value of the WeeklyFrequency field.
   * A check is made every n week(s).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getWeeklyFrequency();
  
  
  /**
   * Sets the value of the WeeklyFrequency field.
   */
  public void setWeeklyFrequency(java.lang.Integer value);
  
  
  
}