package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DateBinnedDDDateBin.eti;DateBinnedDDDateBin.eix;DateBinnedDDDateBin.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface DateBinnedDDDateBinInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire.pl.domain.database.impl.DateBinnedDDDateBinInternalMethods {
  /**
   * Gets the value of the Count field.
   * Count of items in this date bin
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getCount();
  
  
  /**
   * Gets the value of the EndDays field.
   * Last day in days +/- date of distribution for this date bin, must be negative or zero if StartDays is negative
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getEndDays();
  
  
  /**
   * Gets the value of the StartDays field.
   * First day in days +/- date of distribution for this date bin, must be positive or zero if EndDays is positive
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getStartDays();
  
  
  /**
   * Gets the value of the Value field.
   * DateBinnedDDValue for this object.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DateBinnedDDValue getValue();
  
  
  public gw.pl.persistence.core.Key getValueID();
  
  
  /**
   * Sets the value of the Count field.
   */
  public void setCount(java.lang.Long value);
  
  
  /**
   * Sets the value of the EndDays field.
   */
  public void setEndDays(java.lang.Integer value);
  
  
  /**
   * Sets the value of the StartDays field.
   */
  public void setStartDays(java.lang.Integer value);
  
  
  /**
   * Sets the value of the Value field.
   */
  public void setValue(entity.DateBinnedDDValue value);
  
  
  public void setValueID(gw.pl.persistence.core.Key value);
  
  
  
}