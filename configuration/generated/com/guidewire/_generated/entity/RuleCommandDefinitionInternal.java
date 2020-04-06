package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RuleCommandDefinition.eti;RuleCommandDefinition.eix;RuleCommandDefinition.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RuleCommandDefinitionInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.RuleVersionDependentInternal, com.guidewire._generated.entity.OrderedChildInternal, com.guidewire.bizrules.codegenerator.GosuTextBuilder<entity.KeyableBean>, com.guidewire.bizrules.codegenerator.RuleCommandDefinitionValidationMethods, com.guidewire.bizrules.domain.RuleCommandDefinitionDomainMethods, com.guidewire.bizrules.domain.RulesCascadingRemovable, gw.bizrules.domain.RuleVersionDependent {
  /**
   * Adds the given element to the RuleCommandParameters array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRuleCommandParameters(entity.RuleCommandParameter element);
  
  
  /**
   * Gets the value of the Rule field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Rule getRule();
  
  
  /**
   * Gets the value of the RuleActionKey field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RuleActionKey getRuleActionKey();
  
  
  /**
   * Gets the value of the RuleCommandParameters field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleCommandParameter[] getRuleCommandParameters();
  
  
  public gw.pl.persistence.core.Key getRuleID();
  
  
  /**
   * Removes the given element from the RuleCommandParameters array. This is achieved by marking the element for removal.
   */
  public void removeFromRuleCommandParameters(entity.RuleCommandParameter element);
  
  
  /**
   * Removes the given element from the RuleCommandParameters array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRuleCommandParameters(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Rule field.
   */
  public void setRule(entity.Rule value);
  
  
  /**
   * Sets the value of the RuleActionKey field.
   */
  public void setRuleActionKey(typekey.RuleActionKey value);
  
  
  /**
   * Sets the value of the RuleCommandParameters field.
   */
  public void setRuleCommandParameters(entity.RuleCommandParameter[] value);
  
  
  public void setRuleID(gw.pl.persistence.core.Key value);
  
  
  
}