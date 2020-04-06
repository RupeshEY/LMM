package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LoadErrorRow.eti;LoadErrorRow.eix;LoadErrorRow.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface LoadErrorRowInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal {
  /**
   * Gets the value of the ErrorID field.
   * Virtual foreign key to loaderror table
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getErrorID();
  
  
  /**
   * Gets the value of the ErrorRowID field.
   * Load error row ID, to ensure uniqueness.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getErrorRowID();
  
  
  /**
   * Gets the value of the LUWID field.
   * Logical Unit of Work ID, if applicable.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLUWID();
  
  
  /**
   * Gets the value of the RowNumber field.
   * Row number, if applicable.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getRowNumber();
  
  
  /**
   * Sets the value of the ErrorID field.
   */
  public void setErrorID(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ErrorRowID field.
   */
  public void setErrorRowID(java.lang.Integer value);
  
  
  /**
   * Sets the value of the LUWID field.
   */
  public void setLUWID(java.lang.String value);
  
  
  /**
   * Sets the value of the RowNumber field.
   */
  public void setRowNumber(java.lang.Long value);
  
  
  
}