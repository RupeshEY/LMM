package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CustomDDColumn.eti;CustomDDColumn.eix;CustomDDColumn.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface CustomDDColumnInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Gets the value of the ColumnName field.
   * Column name.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getColumnName();
  
  
  /**
   * Gets the value of the ColumnOrder field.
   * 1-based ordering of columnname with CDDR.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getColumnOrder();
  
  
  /**
   * Gets the value of the CustomDataDistRequest field.
   * CustomDataDistRequest for this object.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CustomDataDistRequest getCustomDataDistRequest();
  
  
  public gw.pl.persistence.core.Key getCustomDataDistRequestID();
  
  
  /**
   * Gets the value of the ReturnTypeClassName field.
   * Return type class name.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getReturnTypeClassName();
  
  
  /**
   * Sets the value of the ColumnName field.
   */
  public void setColumnName(java.lang.String value);
  
  
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
   * Sets the value of the ReturnTypeClassName field.
   */
  public void setReturnTypeClassName(java.lang.String value);
  
  
  
}