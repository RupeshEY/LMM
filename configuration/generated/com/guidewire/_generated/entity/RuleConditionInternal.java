package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RuleCondition.eti;RuleCondition.eix;RuleCondition.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RuleConditionInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.RuleVersionDependentInternal, com.guidewire.bizrules.codegenerator.GosuTextBuilder<entity.KeyableBean>, com.guidewire.bizrules.domain.RuleConditionDomainMethods, com.guidewire.bizrules.domain.RulesCascadingRemovable, gw.bizrules.domain.RuleVersionDependent {
  /**
   * Adds the given element to the ConditionExpressionFragments array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToConditionExpressionFragments(entity.ConditionExpressionFragment element);
  
  
  /**
   * Adds the given element to the RuleArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRuleArray(entity.Rule element);
  
  
  /**
   * Adds the given element to the RuleConditionLines array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRuleConditionLines(entity.RuleConditionLine element);
  
  
  /**
   * Gets the value of the ConditionExpressionFragments field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ConditionExpressionFragment[] getConditionExpressionFragments();
  
  
  /**
   * Gets the value of the Rule field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Rule getRule();
  
  
  /**
   * Gets the value of the RuleArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Rule[] getRuleArray();
  
  
  /**
   * Gets the value of the RuleConditionLines field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleConditionLine[] getRuleConditionLines();
  
  
  public gw.pl.persistence.core.Key getRuleID();
  
  
  /**
   * Gets the value of the Type field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RuleConditionType getType();
  
  
  /**
   * Removes the given element from the ConditionExpressionFragments array. This is achieved by marking the element for removal.
   */
  public void removeFromConditionExpressionFragments(entity.ConditionExpressionFragment element);
  
  
  /**
   * Removes the given element from the ConditionExpressionFragments array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromConditionExpressionFragments(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the RuleArray array. This is achieved by marking the element for removal.
   */
  public void removeFromRuleArray(entity.Rule element);
  
  
  /**
   * Removes the given element from the RuleArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRuleArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the RuleConditionLines array. This is achieved by marking the element for removal.
   */
  public void removeFromRuleConditionLines(entity.RuleConditionLine element);
  
  
  /**
   * Removes the given element from the RuleConditionLines array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRuleConditionLines(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the ConditionExpressionFragments field.
   */
  public void setConditionExpressionFragments(entity.ConditionExpressionFragment[] value);
  
  
  /**
   * Sets the value of the Rule field.
   */
  public void setRule(entity.Rule value);
  
  
  /**
   * Sets the value of the RuleArray field.
   */
  public void setRuleArray(entity.Rule[] value);
  
  
  /**
   * Sets the value of the RuleConditionLines field.
   */
  public void setRuleConditionLines(entity.RuleConditionLine[] value);
  
  
  public void setRuleID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Type field.
   */
  public void setType(typekey.RuleConditionType value);
  
  
  
}