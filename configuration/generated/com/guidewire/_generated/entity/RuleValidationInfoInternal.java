package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RuleValidationInfo.eti;RuleValidationInfo.eix;RuleValidationInfo.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RuleValidationInfoInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.bizrules.domain.RuleValidationInfoInternalMethods {
  /**
   * Gets the value of the Rule field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Rule getRule();
  
  
  public gw.pl.persistence.core.Key getRuleID();
  
  
  /**
   * Gets the value of the Valid field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isValid();
  
  
  /**
   * Sets the value of the Rule field.
   */
  public void setRule(entity.Rule value);
  
  
  public void setRuleID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Valid field.
   */
  public void setValid(java.lang.Boolean value);
  
  
  
}