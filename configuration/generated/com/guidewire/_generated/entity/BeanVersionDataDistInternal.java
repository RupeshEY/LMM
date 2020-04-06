package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "BeanVersionDataDist.eti;BeanVersionDataDist.eix;BeanVersionDataDist.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface BeanVersionDataDistInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Gets the value of the BeanCount field.
   * Count of # of rows with this bean version.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getBeanCount();
  
  
  /**
   * Gets the value of the BeanVersion field.
   * Bean version.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion();
  
  
  /**
   * Gets the value of the TableDataDist field.
   * TableDataDist for this object.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TableDataDist getTableDataDist();
  
  
  public gw.pl.persistence.core.Key getTableDataDistID();
  
  
  /**
   * Sets the value of the BeanCount field.
   */
  public void setBeanCount(java.lang.Long value);
  
  
  /**
   * Sets the value of the BeanVersion field.
   */
  public void setBeanVersion(java.lang.Integer value);
  
  
  /**
   * Sets the value of the TableDataDist field.
   */
  public void setTableDataDist(entity.TableDataDist value);
  
  
  public void setTableDataDistID(gw.pl.persistence.core.Key value);
  
  
  
}