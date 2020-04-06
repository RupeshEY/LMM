package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DeployedRuleTag.eti;DeployedRuleTag.eix;DeployedRuleTag.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface DeployedRuleTagInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.RuleVersionDependentInternal, gw.bizrules.domain.RuleVersionDependent {
  /**
   * Adds the given element to the ImportRecordArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToImportRecordArray(entity.RuleImportAuditRecord element);
  
  
  /**
   * Gets the value of the Deployed field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDeployed();
  
  
  /**
   * Gets the value of the DeployedByUserName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDeployedByUserName();
  
  
  /**
   * Gets the value of the DeploymentId field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDeploymentId();
  
  
  /**
   * Gets the value of the GlobalRuleID field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getGlobalRuleID();
  
  
  /**
   * Gets the value of the ImportRecord field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleImportAuditRecord getImportRecord();
  
  
  /**
   * Gets the value of the ImportRecordArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleImportAuditRecord[] getImportRecordArray();
  
  
  public gw.pl.persistence.core.Key getImportRecordID();
  
  
  /**
   * Gets the value of the RuleVersion field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleVersion getRuleVersion();
  
  
  public gw.pl.persistence.core.Key getRuleVersionID();
  
  
  /**
   * Gets the value of the VersionNumber field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getVersionNumber();
  
  
  /**
   * Gets the value of the Importing field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isImporting();
  
  
  /**
   * Removes the given element from the ImportRecordArray array. This is achieved by marking the element for removal.
   */
  public void removeFromImportRecordArray(entity.RuleImportAuditRecord element);
  
  
  /**
   * Removes the given element from the ImportRecordArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromImportRecordArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Deployed field.
   */
  public void setDeployed(java.util.Date value);
  
  
  /**
   * Sets the value of the DeployedByUserName field.
   */
  public void setDeployedByUserName(java.lang.String value);
  
  
  /**
   * Sets the value of the DeploymentId field.
   */
  public void setDeploymentId(java.lang.String value);
  
  
  /**
   * Sets the value of the GlobalRuleID field.
   */
  public void setGlobalRuleID(java.lang.String value);
  
  
  /**
   * Sets the value of the ImportRecord field.
   */
  public void setImportRecord(entity.RuleImportAuditRecord value);
  
  
  /**
   * Sets the value of the ImportRecordArray field.
   */
  public void setImportRecordArray(entity.RuleImportAuditRecord[] value);
  
  
  public void setImportRecordID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Importing field.
   */
  public void setImporting(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the RuleVersion field.
   */
  public void setRuleVersion(entity.RuleVersion value);
  
  
  public void setRuleVersionID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the VersionNumber field.
   */
  public void setVersionNumber(java.lang.Integer value);
  
  
  
}