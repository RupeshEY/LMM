package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AppCritPolicyType.eti;AppCritPolicyType.eix;AppCritPolicyType.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface AppCritPolicyTypeInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.RuleVersionDependentInternal, gw.bizrules.domain.RuleVersionDependent {
  /**
   * Gets the value of the ActivityRule field.
   * The associated rule
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ActivityRule getActivityRule();
  
  
  public gw.pl.persistence.core.Key getActivityRuleID();
  
  
  /**
   * Gets the value of the PolicyType field.
   * Policy Type in a rule availability criteria
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PolicyType getPolicyType();
  
  
  /**
   * Sets the value of the ActivityRule field.
   */
  public void setActivityRule(entity.ActivityRule value);
  
  
  public void setActivityRuleID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the PolicyType field.
   */
  public void setPolicyType(typekey.PolicyType value);
  
  
  
}