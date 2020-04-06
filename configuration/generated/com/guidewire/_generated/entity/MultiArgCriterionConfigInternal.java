package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "MultiArgCriterionConfig.eti;MultiArgCriterionConfig.eix;MultiArgCriterionConfig.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface MultiArgCriterionConfigInternal extends com.guidewire._generated.entity.BaseCriterionConfigInternal {
  /**
   * Adds the given element to the Values array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToValues(entity.CriterionValue element);
  
  
  /**
   * Gets the value of the Values field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CriterionValue[] getValues();
  
  
  /**
   * Removes the given element from the Values array. This is achieved by marking the element for removal.
   */
  public void removeFromValues(entity.CriterionValue element);
  
  
  /**
   * Removes the given element from the Values array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromValues(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Values field.
   */
  public void setValues(entity.CriterionValue[] value);
  
  
  
}