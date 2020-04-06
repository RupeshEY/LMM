package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "SingleArgCriterionConfig.eti;SingleArgCriterionConfig.eix;SingleArgCriterionConfig.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface SingleArgCriterionConfigInternal extends com.guidewire._generated.entity.BaseCriterionConfigInternal {
  /**
   * Adds the given element to the ValueArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToValueArray(entity.CriterionValue element);
  
  
  /**
   * Gets the value of the Value field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CriterionValue getValue();
  
  
  /**
   * Gets the value of the ValueArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CriterionValue[] getValueArray();
  
  
  public gw.pl.persistence.core.Key getValueID();
  
  
  /**
   * Removes the given element from the ValueArray array. This is achieved by marking the element for removal.
   */
  public void removeFromValueArray(entity.CriterionValue element);
  
  
  /**
   * Removes the given element from the ValueArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromValueArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Value field.
   */
  public void setValue(entity.CriterionValue value);
  
  
  /**
   * Sets the value of the ValueArray field.
   */
  public void setValueArray(entity.CriterionValue[] value);
  
  
  public void setValueID(gw.pl.persistence.core.Key value);
  
  
  
}