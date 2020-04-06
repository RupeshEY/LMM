package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AssignableForKeySizeCntDD.eti;AssignableForKeySizeCntDD.eix;AssignableForKeySizeCntDD.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface AssignableForKeySizeCntDDInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Gets the value of the AssignableForKeyDataDist field.
   * AssignableForKeyDataDist for this object.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AssignableForKeyDataDist getAssignableForKeyDataDist();
  
  
  public gw.pl.persistence.core.Key getAssignableForKeyDataDistID();
  
  
  /**
   * Gets the value of the DistCount field.
   * Count of sets of that size.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getDistCount();
  
  
  /**
   * Gets the value of the DistSize field.
   * Number of foreign keys for one value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getDistSize();
  
  
  /**
   * Sets the value of the AssignableForKeyDataDist field.
   */
  public void setAssignableForKeyDataDist(entity.AssignableForKeyDataDist value);
  
  
  public void setAssignableForKeyDataDistID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the DistCount field.
   */
  public void setDistCount(java.lang.Long value);
  
  
  /**
   * Sets the value of the DistSize field.
   */
  public void setDistSize(java.lang.Long value);
  
  
  
}