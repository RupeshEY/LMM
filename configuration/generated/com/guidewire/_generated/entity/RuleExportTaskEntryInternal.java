package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RuleExportTaskEntry.eti;RuleExportTaskEntry.eix;RuleExportTaskEntry.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RuleExportTaskEntryInternal extends com.guidewire._generated.entity.VersionableInternal {
  /**
   * Gets the value of the RuleVersion field.
   * The exported rule version
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleVersion getRuleVersion();
  
  
  public gw.pl.persistence.core.Key getRuleVersionID();
  
  
  /**
   * Gets the value of the Task field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleExportTask getTask();
  
  
  public gw.pl.persistence.core.Key getTaskID();
  
  
  /**
   * Sets the value of the RuleVersion field.
   */
  public void setRuleVersion(entity.RuleVersion value);
  
  
  public void setRuleVersionID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Task field.
   */
  public void setTask(entity.RuleExportTask value);
  
  
  public void setTaskID(gw.pl.persistence.core.Key value);
  
  
  
}