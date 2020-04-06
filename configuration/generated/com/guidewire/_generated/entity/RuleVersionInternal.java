package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RuleVersion.eti;RuleVersion.eix;RuleVersion.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RuleVersionInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.RuleVersionAwareInternal, com.guidewire.bizrules.domain.RuleVersionDomainMethods, com.guidewire.bizrules.management.RuleVersionInternalMethods {
  /**
   * Adds the given element to the DeploymentTags array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDeploymentTags(entity.DeployedRuleTag element);
  
  
  /**
   * Adds the given element to the ImportRecordArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToImportRecordArray(entity.RuleImportAuditRecord element);
  
  
  /**
   * Adds the given element to the ParentEdges array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToParentEdges(entity.RuleVersionParentEdge element);
  
  
  /**
   * Gets the value of the CreateSystemId field.
   * Identifier of the system on which the version was created.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCreateSystemId();
  
  
  /**
   * Gets the value of the CreateTime field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCreateTime();
  
  
  /**
   * Gets the value of the CreateUserName field.
   * The name of the user who created this version.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCreateUserName();
  
  
  /**
   * Gets the value of the DeploymentTags field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DeployedRuleTag[] getDeploymentTags();
  
  
  /**
   * Gets the value of the GlobalRuleID field.
   * Identifies the RuleHead to which this version applies.
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
   * Gets the value of the ParentEdges field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleVersionParentEdge[] getParentEdges();
  
  
  /**
   * Gets the value of the Status field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RuleStatus getStatus();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RuleVersion getSubtype();
  
  
  /**
   * Gets the value of the LockedInternal field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isLockedInternal();
  
  
  /**
   * Removes the given element from the DeploymentTags array. This is achieved by marking the element for removal.
   */
  public void removeFromDeploymentTags(entity.DeployedRuleTag element);
  
  
  /**
   * Removes the given element from the DeploymentTags array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDeploymentTags(gw.pl.persistence.core.Key elementID);
  
  
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
   * Removes the given element from the ParentEdges array. This is achieved by marking the element for removal.
   */
  public void removeFromParentEdges(entity.RuleVersionParentEdge element);
  
  
  /**
   * Removes the given element from the ParentEdges array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromParentEdges(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the CreateSystemId field.
   */
  public void setCreateSystemId(java.lang.String value);
  
  
  /**
   * Sets the value of the CreateTime field.
   */
  public void setCreateTime(java.util.Date value);
  
  
  /**
   * Sets the value of the CreateUserName field.
   */
  public void setCreateUserName(java.lang.String value);
  
  
  /**
   * Sets the value of the DeploymentTags field.
   */
  public void setDeploymentTags(entity.DeployedRuleTag[] value);
  
  
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
   * Sets the value of the LockedInternal field.
   */
  public void setLockedInternal(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ParentEdges field.
   */
  public void setParentEdges(entity.RuleVersionParentEdge[] value);
  
  
  /**
   * Sets the value of the Status field.
   */
  public void setStatus(typekey.RuleStatus value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.RuleVersion value);
  
  
  
}