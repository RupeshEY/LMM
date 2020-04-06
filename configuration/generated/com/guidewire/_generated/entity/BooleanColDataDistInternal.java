package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "BooleanColDataDist.eti;BooleanColDataDist.eix;BooleanColDataDist.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface BooleanColDataDistInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Gets the value of the BooleanColumnName field.
   * Name of boolean column.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBooleanColumnName();
  
  
  /**
   * Gets the value of the NumFalse field.
   * Count of # of false values.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getNumFalse();
  
  
  /**
   * Gets the value of the NumNonNull field.
   * Count of # of non null values.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getNumNonNull();
  
  
  /**
   * Gets the value of the NumTrue field.
   * Count of # of true values.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getNumTrue();
  
  
  /**
   * Gets the value of the TableDataDist field.
   * TableDataDist for this object.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TableDataDist getTableDataDist();
  
  
  public gw.pl.persistence.core.Key getTableDataDistID();
  
  
  /**
   * Sets the value of the BooleanColumnName field.
   */
  public void setBooleanColumnName(java.lang.String value);
  
  
  /**
   * Sets the value of the NumFalse field.
   */
  public void setNumFalse(java.lang.Long value);
  
  
  /**
   * Sets the value of the NumNonNull field.
   */
  public void setNumNonNull(java.lang.Long value);
  
  
  /**
   * Sets the value of the NumTrue field.
   */
  public void setNumTrue(java.lang.Long value);
  
  
  /**
   * Sets the value of the TableDataDist field.
   */
  public void setTableDataDist(entity.TableDataDist value);
  
  
  public void setTableDataDistID(gw.pl.persistence.core.Key value);
  
  
  
}