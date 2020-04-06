package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "EncryptedColumnRegistryEntry.eti;EncryptedColumnRegistryEntry.eix;EncryptedColumnRegistryEntry.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface EncryptedColumnRegistryEntryInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal {
  /**
   * Gets the value of the ColumnName field.
   * Name of the column
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getColumnName();
  
  
  /**
   * Gets the value of the TableName field.
   * Name of the table.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTableName();
  
  
  /**
   * Sets the value of the ColumnName field.
   */
  public void setColumnName(java.lang.String value);
  
  
  /**
   * Sets the value of the TableName field.
   */
  public void setTableName(java.lang.String value);
  
  
  
}