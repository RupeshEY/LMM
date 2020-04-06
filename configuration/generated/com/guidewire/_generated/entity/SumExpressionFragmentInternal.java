package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "SumExpressionFragment.eti;SumExpressionFragment.eix;SumExpressionFragment.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface SumExpressionFragmentInternal extends com.guidewire._generated.entity.FilteredIterableExpressionFragmentInternal, com.guidewire.bizrules.codegenerator.GosuTextBuilder<entity.KeyableBean>, com.guidewire.bizrules.codegenerator.SumExpressionFragmentValidationMethods, com.guidewire.bizrules.domain.ExpressionFragmentDomainMethods, com.guidewire.bizrules.domain.SumExpressionFragmentDomainMethods {
  /**
   * Adds the given element to the NumericTransformExpressionJoinArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToNumericTransformExpressionJoinArray(entity.SumExpressionFragmentJoin element);
  
  
  /**
   * Gets the value of the NumericTransformExpressionJoin field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SumExpressionFragmentJoin getNumericTransformExpressionJoin();
  
  
  /**
   * Gets the value of the NumericTransformExpressionJoinArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SumExpressionFragmentJoin[] getNumericTransformExpressionJoinArray();
  
  
  public gw.pl.persistence.core.Key getNumericTransformExpressionJoinID();
  
  
  /**
   * Removes the given element from the NumericTransformExpressionJoinArray array. This is achieved by marking the element for removal.
   */
  public void removeFromNumericTransformExpressionJoinArray(entity.SumExpressionFragmentJoin element);
  
  
  /**
   * Removes the given element from the NumericTransformExpressionJoinArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromNumericTransformExpressionJoinArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the NumericTransformExpressionJoin field.
   */
  public void setNumericTransformExpressionJoin(entity.SumExpressionFragmentJoin value);
  
  
  /**
   * Sets the value of the NumericTransformExpressionJoinArray field.
   */
  public void setNumericTransformExpressionJoinArray(entity.SumExpressionFragmentJoin[] value);
  
  
  public void setNumericTransformExpressionJoinID(gw.pl.persistence.core.Key value);
  
  
  
}