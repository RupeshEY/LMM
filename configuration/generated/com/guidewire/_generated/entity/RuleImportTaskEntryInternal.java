package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RuleImportTaskEntry.eti;RuleImportTaskEntry.eix;RuleImportTaskEntry.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RuleImportTaskEntryInternal extends com.guidewire._generated.entity.VersionableInternal {
  /**
   * Adds the given element to the HeadArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToHeadArray(entity.RuleHead element);
  
  
  /**
   * Gets the value of the ChosenSide field.
   * The NewHeadVersion is an exact copy of the given import side
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RuleImportSide getChosenSide();
  
  
  /**
   * Gets the value of the ExistingVersion field.
   * The existing version.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleVersion getExistingVersion();
  
  
  public gw.pl.persistence.core.Key getExistingVersionID();
  
  
  /**
   * Gets the value of the Head field.
   * The rule head
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleHead getHead();
  
  
  /**
   * Gets the value of the HeadArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleHead[] getHeadArray();
  
  
  public gw.pl.persistence.core.Key getHeadID();
  
  
  /**
   * Gets the value of the ImportedVersion field.
   * The imported rule version.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleVersion getImportedVersion();
  
  
  public gw.pl.persistence.core.Key getImportedVersionID();
  
  
  /**
   * Gets the value of the NewHeadVersion field.
   * The new head version
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleVersion getNewHeadVersion();
  
  
  public gw.pl.persistence.core.Key getNewHeadVersionID();
  
  
  /**
   * Gets the value of the RuleName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRuleName();
  
  
  /**
   * Gets the value of the Status field.
   * The current import entry status
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RuleImportStatus getStatus();
  
  
  /**
   * Gets the value of the Task field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleImportTask getTask();
  
  
  public gw.pl.persistence.core.Key getTaskID();
  
  
  /**
   * Removes the given element from the HeadArray array. This is achieved by marking the element for removal.
   */
  public void removeFromHeadArray(entity.RuleHead element);
  
  
  /**
   * Removes the given element from the HeadArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromHeadArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the ChosenSide field.
   */
  public void setChosenSide(typekey.RuleImportSide value);
  
  
  /**
   * Sets the value of the ExistingVersion field.
   */
  public void setExistingVersion(entity.RuleVersion value);
  
  
  public void setExistingVersionID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Head field.
   */
  public void setHead(entity.RuleHead value);
  
  
  /**
   * Sets the value of the HeadArray field.
   */
  public void setHeadArray(entity.RuleHead[] value);
  
  
  public void setHeadID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ImportedVersion field.
   */
  public void setImportedVersion(entity.RuleVersion value);
  
  
  public void setImportedVersionID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the NewHeadVersion field.
   */
  public void setNewHeadVersion(entity.RuleVersion value);
  
  
  public void setNewHeadVersionID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the RuleName field.
   */
  public void setRuleName(java.lang.String value);
  
  
  /**
   * Sets the value of the Status field.
   */
  public void setStatus(typekey.RuleImportStatus value);
  
  
  /**
   * Sets the value of the Task field.
   */
  public void setTask(entity.RuleImportTask value);
  
  
  public void setTaskID(gw.pl.persistence.core.Key value);
  
  
  
}