package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ConditionExpressionFragment.eti;ConditionExpressionFragment.eix;ConditionExpressionFragment.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ConditionExpressionFragmentInternal extends com.guidewire._generated.entity.ExpressionFragmentInternal, com.guidewire.bizrules.codegenerator.GosuTextBuilder<entity.KeyableBean>, com.guidewire.bizrules.domain.ConditionExpressionFragmentDomainMethods, com.guidewire.bizrules.domain.ExpressionFragmentDomainMethods {
  /**
   * Gets the value of the AdditionalSymbolName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAdditionalSymbolName();
  
  
  /**
   * Gets the value of the RuleCondition field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleCondition getRuleCondition();
  
  
  public gw.pl.persistence.core.Key getRuleConditionID();
  
  
  /**
   * Sets the value of the AdditionalSymbolName field.
   */
  public void setAdditionalSymbolName(java.lang.String value);
  
  
  /**
   * Sets the value of the RuleCondition field.
   */
  public void setRuleCondition(entity.RuleCondition value);
  
  
  public void setRuleConditionID(gw.pl.persistence.core.Key value);
  
  
  
}