package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ActivityRuleHead.eti;ActivityRuleHead.eix;ActivityRuleHead.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ActivityRuleHeadInternal extends com.guidewire._generated.entity.RuleHeadInternal, com.guidewire.bizrules.domain.RuleHeadDomainMethods {
  /**
   * Gets the value of the DeployedVersion field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ActivityRuleVersion getDeployedVersion();
  
  
  public gw.pl.persistence.core.Key getDeployedVersionID();
  
  
  /**
   * Gets the value of the HeadVersion field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ActivityRuleVersion getHeadVersion();
  
  
  public gw.pl.persistence.core.Key getHeadVersionID();
  
  
  /**
   * Sets the value of the DeployedVersion field.
   */
  public void setDeployedVersion(entity.ActivityRuleVersion value);
  
  
  public void setDeployedVersionID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the HeadVersion field.
   */
  public void setHeadVersion(entity.ActivityRuleVersion value);
  
  
  public void setHeadVersionID(gw.pl.persistence.core.Key value);
  
  
  
}