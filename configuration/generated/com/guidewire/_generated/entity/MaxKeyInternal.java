package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "MaxKey.eti;MaxKey.eix;MaxKey.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface MaxKeyInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal {
  /**
   * Gets the value of the EntityTableName field.
   * Name of table for keyable entity type
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEntityTableName();
  
  
  /**
   * Gets the value of the LockingColumn field.
   * Meaningless column for locking
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLockingColumn();
  
  
  /**
   * Gets the value of the MaxKey field.
   * Current maximum key for the entity type
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getMaxKey();
  
  
  /**
   * Sets the value of the EntityTableName field.
   */
  public void setEntityTableName(java.lang.String value);
  
  
  /**
   * Sets the value of the LockingColumn field.
   */
  public void setLockingColumn(java.lang.Integer value);
  
  
  /**
   * Sets the value of the MaxKey field.
   */
  public void setMaxKey(java.lang.Long value);
  
  
  
}