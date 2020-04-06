package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "KeyableBean.eti;KeyableBean.eix;KeyableBean.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface KeyableBeanInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, com.guidewire.commons.entity.Keyable, com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods, com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods {
  /**
   * Gets the value of the ID field.
   * Internally managed primary key
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID();
  
  
  /**
   * Gets the value of the PublicID field.
   * ID or primary key of the row in the external system to which this row is mapped
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID();
  
  
  /**
   * Sets the value of the ID field.
   */
  public void setID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the PublicID field.
   */
  public void setPublicID(java.lang.String value);
  
  
  
}