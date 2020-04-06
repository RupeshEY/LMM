package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Retireable.eti;Retireable.eix;Retireable.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RetireableInternal extends com.guidewire._generated.entity.EditableInternal, com.guidewire.pl.domain.persistence.core.RetireablePublicMethods, com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods {
  /**
   * Gets the value of the RetiredValue field.
   * Whether the entity is still in use. A value of 0 means that the entity is not retired. If the entity is retired from active use, this field has a non-zero value equal to the entity's ID. Once an entity is retired, it should not be unretired.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getRetiredValue();
  
  
  /**
   * Sets the value of the RetiredValue field.
   */
  public void setRetiredValue(java.lang.Long value);
  
  
  
}