package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ValidationResult.eti;ValidationResult.eix;ValidationResult.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ValidationResultInternal extends com.guidewire._generated.entity.VersionableInternal {
  /**
   * Adds the given element to the EntityValidations array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToEntityValidations(entity.EntityValidation element);
  
  
  /**
   * Gets the value of the EntityValidations field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.EntityValidation[] getEntityValidations();
  
  
  /**
   * Removes the given element from the EntityValidations array. This is achieved by marking the element for removal.
   */
  public void removeFromEntityValidations(entity.EntityValidation element);
  
  
  /**
   * Removes the given element from the EntityValidations array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromEntityValidations(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the EntityValidations field.
   */
  public void setEntityValidations(entity.EntityValidation[] value);
  
  
  
}