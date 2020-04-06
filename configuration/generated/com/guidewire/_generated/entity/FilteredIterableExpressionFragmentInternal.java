package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "FilteredIterableExpressionFragment.eti;FilteredIterableExpressionFragment.eix;FilteredIterableExpressionFragment.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface FilteredIterableExpressionFragmentInternal extends com.guidewire._generated.entity.ConditionExpressionFragmentInternal, com.guidewire.bizrules.codegenerator.FilteredIterableExpressionFragmentValidationMethods, com.guidewire.bizrules.codegenerator.GosuTextBuilder<entity.KeyableBean>, com.guidewire.bizrules.domain.ExpressionFragmentDomainMethods, com.guidewire.bizrules.domain.FilteredIterableExpressionFragmentDomainMethods {
  /**
   * Adds the given element to the IterableExpressionJoinArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToIterableExpressionJoinArray(entity.FilteredIterableExpressionFragmentJoin element);
  
  
  /**
   * Gets the value of the IterableExpressionJoin field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.FilteredIterableExpressionFragmentJoin getIterableExpressionJoin();
  
  
  /**
   * Gets the value of the IterableExpressionJoinArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.FilteredIterableExpressionFragmentJoin[] getIterableExpressionJoinArray();
  
  
  public gw.pl.persistence.core.Key getIterableExpressionJoinID();
  
  
  /**
   * Removes the given element from the IterableExpressionJoinArray array. This is achieved by marking the element for removal.
   */
  public void removeFromIterableExpressionJoinArray(entity.FilteredIterableExpressionFragmentJoin element);
  
  
  /**
   * Removes the given element from the IterableExpressionJoinArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromIterableExpressionJoinArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the IterableExpressionJoin field.
   */
  public void setIterableExpressionJoin(entity.FilteredIterableExpressionFragmentJoin value);
  
  
  /**
   * Sets the value of the IterableExpressionJoinArray field.
   */
  public void setIterableExpressionJoinArray(entity.FilteredIterableExpressionFragmentJoin[] value);
  
  
  public void setIterableExpressionJoinID(gw.pl.persistence.core.Key value);
  
  
  
}