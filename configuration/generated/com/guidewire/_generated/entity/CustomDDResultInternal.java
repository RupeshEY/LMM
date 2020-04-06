package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CustomDDResult.eti;CustomDDResult.eix;CustomDDResult.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface CustomDDResultInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Gets the value of the ColumnOrder field.
   * 1-based ordering of column of result within CDDR results.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getColumnOrder();
  
  
  /**
   * Gets the value of the CustomDataDistRequest field.
   * CustomDDRColumnName for this object.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CustomDataDistRequest getCustomDataDistRequest();
  
  
  public gw.pl.persistence.core.Key getCustomDataDistRequestID();
  
  
  /**
   * Gets the value of the ResultValue field.
   * Result value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getResultValue();
  
  
  /**
   * Gets the value of the RowOrder field.
   * 1-based ordering of row of result within CDDR results.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getRowOrder();
  
  
  /**
   * Sets the value of the ColumnOrder field.
   */
  public void setColumnOrder(java.lang.Integer value);
  
  
  /**
   * Sets the value of the CustomDataDistRequest field.
   */
  public void setCustomDataDistRequest(entity.CustomDataDistRequest value);
  
  
  public void setCustomDataDistRequestID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ResultValue field.
   */
  public void setResultValue(java.lang.String value);
  
  
  /**
   * Sets the value of the RowOrder field.
   */
  public void setRowOrder(java.lang.Integer value);
  
  
  
}