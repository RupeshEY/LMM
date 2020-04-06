package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "GenericGroupColumnNameDataDist.eti;GenericGroupColumnNameDataDist.eix;GenericGroupColumnNameDataDist.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface GenericGroupColumnNameDataDistInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Gets the value of the ColumnName field.
   * Name of column.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getColumnName();
  
  
  /**
   * Gets the value of the GenericGroupDataDist field.
   * GenericGroupDataDist for this object.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.GenericGroupDataDist getGenericGroupDataDist();
  
  
  public gw.pl.persistence.core.Key getGenericGroupDataDistID();
  
  
  /**
   * Sets the value of the ColumnName field.
   */
  public void setColumnName(java.lang.String value);
  
  
  /**
   * Sets the value of the GenericGroupDataDist field.
   */
  public void setGenericGroupDataDist(entity.GenericGroupDataDist value);
  
  
  public void setGenericGroupDataDistID(gw.pl.persistence.core.Key value);
  
  
  
}