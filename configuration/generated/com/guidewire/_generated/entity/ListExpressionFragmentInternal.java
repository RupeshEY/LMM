package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ListExpressionFragment.eti;ListExpressionFragment.eix;ListExpressionFragment.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ListExpressionFragmentInternal extends com.guidewire._generated.entity.ExpressionFragmentInternal, com.guidewire.bizrules.codegenerator.GosuTextBuilder<entity.KeyableBean>, com.guidewire.bizrules.domain.ExpressionFragmentDomainMethods, com.guidewire.bizrules.domain.ListExpressionFragmentDomainMethods {
  /**
   * Adds the given element to the Elements array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToElements(entity.ListExpressionFragmentJoin element);
  
  
  /**
   * Gets the value of the Elements field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ListExpressionFragmentJoin[] getElements();
  
  
  /**
   * Gets the value of the GenerateArray field.
   * Whether or not this represents an array instead of a list
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isGenerateArray();
  
  
  /**
   * Removes the given element from the Elements array. This is achieved by marking the element for removal.
   */
  public void removeFromElements(entity.ListExpressionFragmentJoin element);
  
  
  /**
   * Removes the given element from the Elements array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromElements(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Elements field.
   */
  public void setElements(entity.ListExpressionFragmentJoin[] value);
  
  
  /**
   * Sets the value of the GenerateArray field.
   */
  public void setGenerateArray(java.lang.Boolean value);
  
  
  
}