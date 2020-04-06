package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RuleCommandParameter.eti;RuleCommandParameter.eix;RuleCommandParameter.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RuleCommandParameterInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.RuleVersionDependentInternal, com.guidewire.bizrules.codegenerator.GosuTextBuilder<entity.KeyableBean>, com.guidewire.bizrules.domain.RuleCommandParameterDomainMethods, com.guidewire.bizrules.domain.RulesCascadingRemovable, gw.bizrules.domain.RuleVersionDependent {
  /**
   * Gets the value of the Expression field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ExpressionFragment getExpression();
  
  
  public gw.pl.persistence.core.Key getExpressionID();
  
  
  /**
   * Gets the value of the ParameterName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getParameterName();
  
  
  /**
   * Gets the value of the RuleCommandDefinition field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleCommandDefinition getRuleCommandDefinition();
  
  
  public gw.pl.persistence.core.Key getRuleCommandDefinitionID();
  
  
  /**
   * Sets the value of the Expression field.
   */
  public void setExpression(entity.ExpressionFragment value);
  
  
  public void setExpressionID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ParameterName field.
   */
  public void setParameterName(java.lang.String value);
  
  
  /**
   * Sets the value of the RuleCommandDefinition field.
   */
  public void setRuleCommandDefinition(entity.RuleCommandDefinition value);
  
  
  public void setRuleCommandDefinitionID(gw.pl.persistence.core.Key value);
  
  
  
}