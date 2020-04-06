package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RuleImportAuditRecord.eti;RuleImportAuditRecord.eix;RuleImportAuditRecord.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RuleImportAuditRecordInternal extends com.guidewire._generated.entity.VersionableInternal {
  /**
   * Gets the value of the DeploymentTag field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DeployedRuleTag getDeploymentTag();
  
  
  public gw.pl.persistence.core.Key getDeploymentTagID();
  
  
  /**
   * Gets the value of the GlobalRuleID field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getGlobalRuleID();
  
  
  /**
   * Gets the value of the ImportTime field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getImportTime();
  
  
  /**
   * Gets the value of the ImportUserName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getImportUserName();
  
  
  /**
   * Gets the value of the RuleVersion field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleVersion getRuleVersion();
  
  
  public gw.pl.persistence.core.Key getRuleVersionID();
  
  
  /**
   * Sets the value of the DeploymentTag field.
   */
  public void setDeploymentTag(entity.DeployedRuleTag value);
  
  
  public void setDeploymentTagID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the GlobalRuleID field.
   */
  public void setGlobalRuleID(java.lang.String value);
  
  
  /**
   * Sets the value of the ImportTime field.
   */
  public void setImportTime(java.util.Date value);
  
  
  /**
   * Sets the value of the ImportUserName field.
   */
  public void setImportUserName(java.lang.String value);
  
  
  /**
   * Sets the value of the RuleVersion field.
   */
  public void setRuleVersion(entity.RuleVersion value);
  
  
  public void setRuleVersionID(gw.pl.persistence.core.Key value);
  
  
  
}