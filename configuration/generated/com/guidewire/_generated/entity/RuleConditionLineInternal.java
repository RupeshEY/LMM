package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RuleConditionLine.eti;RuleConditionLine.eix;RuleConditionLine.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RuleConditionLineInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.RuleVersionDependentInternal, com.guidewire._generated.entity.OrderedChildInternal, com.guidewire.bizrules.codegenerator.GosuTextBuilder<entity.KeyableBean>, com.guidewire.bizrules.domain.RuleConditionLineDomainMethods, com.guidewire.bizrules.domain.RulesCascadingRemovable, com.guidewire.bizrules.management.RuleVersionAwareInternal, gw.bizrules.domain.RuleVersionDependent {
  /**
   * Gets the value of the BooleanOperator field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RuleBooleanOperator getBooleanOperator();
  
  
  /**
   * Gets the value of the LeftOperand field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ExpressionFragment getLeftOperand();
  
  
  public gw.pl.persistence.core.Key getLeftOperandID();
  
  
  /**
   * Gets the value of the LeftParens field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Parentheses getLeftParens();
  
  
  /**
   * Gets the value of the Operator field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RuleOperator getOperator();
  
  
  /**
   * Gets the value of the RightOperand field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ExpressionFragment getRightOperand();
  
  
  public gw.pl.persistence.core.Key getRightOperandID();
  
  
  /**
   * Gets the value of the RightParens field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Parentheses getRightParens();
  
  
  /**
   * Gets the value of the RuleCondition field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleCondition getRuleCondition();
  
  
  public gw.pl.persistence.core.Key getRuleConditionID();
  
  
  /**
   * Sets the value of the BooleanOperator field.
   */
  public void setBooleanOperator(typekey.RuleBooleanOperator value);
  
  
  /**
   * Sets the value of the LeftOperand field.
   */
  public void setLeftOperand(entity.ExpressionFragment value);
  
  
  public void setLeftOperandID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LeftParens field.
   */
  public void setLeftParens(typekey.Parentheses value);
  
  
  /**
   * Sets the value of the Operator field.
   */
  public void setOperator(typekey.RuleOperator value);
  
  
  /**
   * Sets the value of the RightOperand field.
   */
  public void setRightOperand(entity.ExpressionFragment value);
  
  
  public void setRightOperandID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the RightParens field.
   */
  public void setRightParens(typekey.Parentheses value);
  
  
  /**
   * Sets the value of the RuleCondition field.
   */
  public void setRuleCondition(entity.RuleCondition value);
  
  
  public void setRuleConditionID(gw.pl.persistence.core.Key value);
  
  
  
}