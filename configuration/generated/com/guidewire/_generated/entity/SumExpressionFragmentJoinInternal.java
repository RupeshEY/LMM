package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "SumExpressionFragmentJoin.eti;SumExpressionFragmentJoin.eix;SumExpressionFragmentJoin.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface SumExpressionFragmentJoinInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.RuleVersionDependentInternal, gw.bizrules.domain.RuleVersionDependent {
  /**
   * Gets the value of the NumericTransformExpression field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ExpressionFragment getNumericTransformExpression();
  
  
  public gw.pl.persistence.core.Key getNumericTransformExpressionID();
  
  
  /**
   * Gets the value of the SumExpressionFragment field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SumExpressionFragment getSumExpressionFragment();
  
  
  public gw.pl.persistence.core.Key getSumExpressionFragmentID();
  
  
  /**
   * Sets the value of the NumericTransformExpression field.
   */
  public void setNumericTransformExpression(entity.ExpressionFragment value);
  
  
  public void setNumericTransformExpressionID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the SumExpressionFragment field.
   */
  public void setSumExpressionFragment(entity.SumExpressionFragment value);
  
  
  public void setSumExpressionFragmentID(gw.pl.persistence.core.Key value);
  
  
  
}