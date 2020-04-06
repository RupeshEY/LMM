package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ActivityRuleVersion.eti;ActivityRuleVersion.eix;ActivityRuleVersion.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ActivityRuleVersionInternal extends com.guidewire._generated.entity.RuleVersionInternal, com.guidewire.bizrules.domain.RuleVersionDomainMethods, com.guidewire.bizrules.management.RuleVersionAwareInternal, com.guidewire.bizrules.management.RuleVersionInternalMethods {
  /**
   * Gets the value of the Rule field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ActivityRule getRule();
  
  
  public gw.pl.persistence.core.Key getRuleID();
  
  
  /**
   * Sets the value of the Rule field.
   */
  public void setRule(entity.ActivityRule value);
  
  
  public void setRuleID(gw.pl.persistence.core.Key value);
  
  
  
}