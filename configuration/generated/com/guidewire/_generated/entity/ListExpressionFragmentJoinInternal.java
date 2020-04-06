package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ListExpressionFragmentJoin.eti;ListExpressionFragmentJoin.eix;ListExpressionFragmentJoin.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ListExpressionFragmentJoinInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.RuleVersionDependentInternal, com.guidewire._generated.entity.OrderedChildInternal, gw.bizrules.domain.RuleVersionDependent {
  /**
   * Gets the value of the ExpressionFragment field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ExpressionFragment getExpressionFragment();
  
  
  public gw.pl.persistence.core.Key getExpressionFragmentID();
  
  
  /**
   * Gets the value of the ListExpressionFragment field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ListExpressionFragment getListExpressionFragment();
  
  
  public gw.pl.persistence.core.Key getListExpressionFragmentID();
  
  
  /**
   * Sets the value of the ExpressionFragment field.
   */
  public void setExpressionFragment(entity.ExpressionFragment value);
  
  
  public void setExpressionFragmentID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ListExpressionFragment field.
   */
  public void setListExpressionFragment(entity.ListExpressionFragment value);
  
  
  public void setListExpressionFragmentID(gw.pl.persistence.core.Key value);
  
  
  
}