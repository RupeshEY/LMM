package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "EntityValidation.eti;EntityValidation.eix;EntityValidation.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface EntityValidationInternal extends com.guidewire._generated.entity.VersionableInternal {
  /**
   * Adds the given element to the FieldValidations array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToFieldValidations(entity.FieldValidation element);
  
  
  /**
   * Adds the given element to the GeneralValidations array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToGeneralValidations(entity.GeneralValidation element);
  
  
  /**
   * Gets the value of the EntityId field.
   * ID of the entity
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getEntityId();
  
  
  /**
   * Gets the value of the EntityType field.
   * What kind of entity
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEntityType();
  
  
  /**
   * Gets the value of the FieldValidations field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.FieldValidation[] getFieldValidations();
  
  
  /**
   * Gets the value of the GeneralValidations field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.GeneralValidation[] getGeneralValidations();
  
  
  /**
   * Gets the value of the OwningValidationResult field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ValidationResult getOwningValidationResult();
  
  
  public gw.pl.persistence.core.Key getOwningValidationResultID();
  
  
  /**
   * Removes the given element from the FieldValidations array. This is achieved by marking the element for removal.
   */
  public void removeFromFieldValidations(entity.FieldValidation element);
  
  
  /**
   * Removes the given element from the FieldValidations array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromFieldValidations(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the GeneralValidations array. This is achieved by marking the element for removal.
   */
  public void removeFromGeneralValidations(entity.GeneralValidation element);
  
  
  /**
   * Removes the given element from the GeneralValidations array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromGeneralValidations(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the EntityId field.
   */
  public void setEntityId(java.lang.Long value);
  
  
  /**
   * Sets the value of the EntityType field.
   */
  public void setEntityType(java.lang.String value);
  
  
  /**
   * Sets the value of the FieldValidations field.
   */
  public void setFieldValidations(entity.FieldValidation[] value);
  
  
  /**
   * Sets the value of the GeneralValidations field.
   */
  public void setGeneralValidations(entity.GeneralValidation[] value);
  
  
  /**
   * Sets the value of the OwningValidationResult field.
   */
  public void setOwningValidationResult(entity.ValidationResult value);
  
  
  public void setOwningValidationResultID(gw.pl.persistence.core.Key value);
  
  
  
}