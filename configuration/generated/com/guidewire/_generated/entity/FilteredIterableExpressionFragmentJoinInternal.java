package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "FilteredIterableExpressionFragmentJoin.eti;FilteredIterableExpressionFragmentJoin.eix;FilteredIterableExpressionFragmentJoin.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface FilteredIterableExpressionFragmentJoinInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.RuleVersionDependentInternal, gw.bizrules.domain.RuleVersionDependent {
  /**
   * Gets the value of the FilteredIterableExpressionFragment field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.FilteredIterableExpressionFragment getFilteredIterableExpressionFragment();
  
  
  public gw.pl.persistence.core.Key getFilteredIterableExpressionFragmentID();
  
  
  /**
   * Gets the value of the IterableExpression field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ExpressionFragment getIterableExpression();
  
  
  public gw.pl.persistence.core.Key getIterableExpressionID();
  
  
  /**
   * Sets the value of the FilteredIterableExpressionFragment field.
   */
  public void setFilteredIterableExpressionFragment(entity.FilteredIterableExpressionFragment value);
  
  
  public void setFilteredIterableExpressionFragmentID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the IterableExpression field.
   */
  public void setIterableExpression(entity.ExpressionFragment value);
  
  
  public void setIterableExpressionID(gw.pl.persistence.core.Key value);
  
  
  
}