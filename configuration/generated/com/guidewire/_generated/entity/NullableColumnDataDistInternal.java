package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "NullableColumnDataDist.eti;NullableColumnDataDist.eix;NullableColumnDataDist.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface NullableColumnDataDistInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Gets the value of the NullableColName field.
   * Nullable column name.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNullableColName();
  
  
  /**
   * Gets the value of the NumNonnullValues field.
   * Number of non-null values.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getNumNonnullValues();
  
  
  /**
   * Gets the value of the NumValues field.
   * Total number of rows. We have this because column could be on a subtype
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getNumValues();
  
  
  /**
   * Gets the value of the TableDataDist field.
   * TableDataDist for this object.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TableDataDist getTableDataDist();
  
  
  public gw.pl.persistence.core.Key getTableDataDistID();
  
  
  /**
   * Sets the value of the NullableColName field.
   */
  public void setNullableColName(java.lang.String value);
  
  
  /**
   * Sets the value of the NumNonnullValues field.
   */
  public void setNumNonnullValues(java.lang.Long value);
  
  
  /**
   * Sets the value of the NumValues field.
   */
  public void setNumValues(java.lang.Long value);
  
  
  /**
   * Sets the value of the TableDataDist field.
   */
  public void setTableDataDist(entity.TableDataDist value);
  
  
  public void setTableDataDistID(gw.pl.persistence.core.Key value);
  
  
  
}