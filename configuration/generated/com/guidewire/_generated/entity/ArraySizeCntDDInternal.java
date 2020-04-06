package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ArraySizeCntDD.eti;ArraySizeCntDD.eix;ArraySizeCntDD.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ArraySizeCntDDInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Gets the value of the ArrayDataDist field.
   * ArrayDataDist for this object.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ArrayDataDist getArrayDataDist();
  
  
  public gw.pl.persistence.core.Key getArrayDataDistID();
  
  
  /**
   * Gets the value of the DistCount field.
   * Count of arrays  of that size.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getDistCount();
  
  
  /**
   * Gets the value of the DistSize field.
   * Size of array.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getDistSize();
  
  
  /**
   * Sets the value of the ArrayDataDist field.
   */
  public void setArrayDataDist(entity.ArrayDataDist value);
  
  
  public void setArrayDataDistID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the DistCount field.
   */
  public void setDistCount(java.lang.Long value);
  
  
  /**
   * Sets the value of the DistSize field.
   */
  public void setDistSize(java.lang.Long value);
  
  
  
}