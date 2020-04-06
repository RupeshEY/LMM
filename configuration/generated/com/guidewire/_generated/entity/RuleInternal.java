package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Rule.eti;Rule.eix;Rule.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RuleInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.RuleVersionDependentInternal, com.guidewire.bizrules.domain.RuleDomainMethods, com.guidewire.bizrules.domain.RuleInternalMethods {
  /**
   * Adds the given element to the RuleCommandDefinitions array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRuleCommandDefinitions(entity.RuleCommandDefinition element);
  
  
  /**
   * Adds the given element to the ValidationInfoArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToValidationInfoArray(entity.RuleValidationInfo element);
  
  
  /**
   * Gets the value of the Description field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the Name field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the RuleCommandDefinitions field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleCommandDefinition[] getRuleCommandDefinitions();
  
  
  /**
   * Gets the value of the RuleCondition field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleCondition getRuleCondition();
  
  
  public gw.pl.persistence.core.Key getRuleConditionID();
  
  
  /**
   * Gets the value of the RuleContextDefinitionKey field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RuleContextDefinitionKey getRuleContextDefinitionKey();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Rule getSubtype();
  
  
  /**
   * Gets the value of the TriggeringPointKey field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TriggeringPointKey getTriggeringPointKey();
  
  
  /**
   * Gets the value of the UpdateSystemId field.
   * Identifier of the system on which the rule was updated.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getUpdateSystemId();
  
  
  /**
   * Gets the value of the UpdateTime field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getUpdateTime();
  
  
  /**
   * Gets the value of the UpdateUserName field.
   * The name of the user who updated this rule.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getUpdateUserName();
  
  
  /**
   * Gets the value of the ValidationInfo field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleValidationInfo getValidationInfo();
  
  
  /**
   * Gets the value of the ValidationInfoArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleValidationInfo[] getValidationInfoArray();
  
  
  public gw.pl.persistence.core.Key getValidationInfoID();
  
  
  /**
   * Gets the value of the AvailableToRun field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAvailableToRun();
  
  
  /**
   * Removes the given element from the RuleCommandDefinitions array. This is achieved by marking the element for removal.
   */
  public void removeFromRuleCommandDefinitions(entity.RuleCommandDefinition element);
  
  
  /**
   * Removes the given element from the RuleCommandDefinitions array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRuleCommandDefinitions(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ValidationInfoArray array. This is achieved by marking the element for removal.
   */
  public void removeFromValidationInfoArray(entity.RuleValidationInfo element);
  
  
  /**
   * Removes the given element from the ValidationInfoArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromValidationInfoArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the AvailableToRun field.
   */
  public void setAvailableToRun(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the RuleCommandDefinitions field.
   */
  public void setRuleCommandDefinitions(entity.RuleCommandDefinition[] value);
  
  
  /**
   * Sets the value of the RuleCondition field.
   */
  public void setRuleCondition(entity.RuleCondition value);
  
  
  public void setRuleConditionID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the RuleContextDefinitionKey field.
   */
  public void setRuleContextDefinitionKey(typekey.RuleContextDefinitionKey value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.Rule value);
  
  
  /**
   * Sets the value of the TriggeringPointKey field.
   */
  public void setTriggeringPointKey(typekey.TriggeringPointKey value);
  
  
  /**
   * Sets the value of the UpdateSystemId field.
   */
  public void setUpdateSystemId(java.lang.String value);
  
  
  /**
   * Sets the value of the UpdateTime field.
   */
  public void setUpdateTime(java.util.Date value);
  
  
  /**
   * Sets the value of the UpdateUserName field.
   */
  public void setUpdateUserName(java.lang.String value);
  
  
  /**
   * Sets the value of the ValidationInfo field.
   */
  public void setValidationInfo(entity.RuleValidationInfo value);
  
  
  /**
   * Sets the value of the ValidationInfoArray field.
   */
  public void setValidationInfoArray(entity.RuleValidationInfo[] value);
  
  
  public void setValidationInfoID(gw.pl.persistence.core.Key value);
  
  
  
}