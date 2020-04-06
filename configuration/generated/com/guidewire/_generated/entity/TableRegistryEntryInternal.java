package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TableRegistryEntry.eti;TableRegistryEntry.eix;TableRegistryEntry.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TableRegistryEntryInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal {
  /**
   * Gets the value of the IdName field.
   * Name of the unique id.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getIdName();
  
  
  /**
   * Gets the value of the TableName field.
   * Name of the table.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTableName();
  
  
  /**
   * Sets the value of the IdName field.
   */
  public void setIdName(java.lang.String value);
  
  
  /**
   * Sets the value of the TableName field.
   */
  public void setTableName(java.lang.String value);
  
  
  
}