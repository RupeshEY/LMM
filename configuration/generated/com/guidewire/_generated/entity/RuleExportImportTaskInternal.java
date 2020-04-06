package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RuleExportImportTask.eti;RuleExportImportTask.eix;RuleExportImportTask.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RuleExportImportTaskInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.bizrules.domain.RuleExportImportTaskDomainMethods {
  /**
   * Gets the value of the BatchProcessCompleted field.
   * The date the batch process processed the task.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getBatchProcessCompleted();
  
  
  /**
   * Gets the value of the BatchProcessID field.
   * The batch process that processes this task.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getBatchProcessID();
  
  
  /**
   * Gets the value of the RuleData field.
   * The serialized rules
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleData getRuleData();
  
  
  public gw.pl.persistence.core.Key getRuleDataID();
  
  
  /**
   * Gets the value of the RuleVersionType field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RuleVersion getRuleVersionType();
  
  
  /**
   * Gets the value of the StartTime field.
   * The time this task started.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartTime();
  
  
  /**
   * Gets the value of the StartedBy field.
   * The user who started the task.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getStartedBy();
  
  
  public gw.pl.persistence.core.Key getStartedByID();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RuleExportImportTask getSubtype();
  
  
  /**
   * Gets the value of the TerminationRequested field.
   * The date this task requested to terminate.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getTerminationRequested();
  
  
  /**
   * Sets the value of the BatchProcessCompleted field.
   */
  public void setBatchProcessCompleted(java.util.Date value);
  
  
  /**
   * Sets the value of the BatchProcessID field.
   */
  public void setBatchProcessID(java.lang.Long value);
  
  
  /**
   * Sets the value of the RuleData field.
   */
  public void setRuleData(entity.RuleData value);
  
  
  public void setRuleDataID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the RuleVersionType field.
   */
  public void setRuleVersionType(typekey.RuleVersion value);
  
  
  /**
   * Sets the value of the StartTime field.
   */
  public void setStartTime(java.util.Date value);
  
  
  /**
   * Sets the value of the StartedBy field.
   */
  public void setStartedBy(entity.User value);
  
  
  public void setStartedByID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.RuleExportImportTask value);
  
  
  /**
   * Sets the value of the TerminationRequested field.
   */
  public void setTerminationRequested(java.util.Date value);
  
  
  
}