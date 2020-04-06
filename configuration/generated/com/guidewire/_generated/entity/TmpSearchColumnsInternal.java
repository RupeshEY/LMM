package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpSearchColumns.eti;TmpSearchColumns.eix;TmpSearchColumns.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TmpSearchColumnsInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal {
  /**
   * Gets the value of the ID field.
   * key id.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getID();
  
  
  /**
   * Gets the value of the IntValue field.
   * for populate int value based search columns
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getIntValue();
  
  
  /**
   * Gets the value of the VarCharValue field.
   * for populate varchar based value based search columns
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getVarCharValue();
  
  
  /**
   * Sets the value of the ID field.
   */
  public void setID(java.lang.Long value);
  
  
  /**
   * Sets the value of the IntValue field.
   */
  public void setIntValue(java.lang.Integer value);
  
  
  /**
   * Sets the value of the VarCharValue field.
   */
  public void setVarCharValue(java.lang.String value);
  
  
  
}