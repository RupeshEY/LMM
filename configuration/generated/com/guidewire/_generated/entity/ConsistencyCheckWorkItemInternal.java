package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ConsistencyCheckWorkItem.eti;ConsistencyCheckWorkItem.eix;ConsistencyCheckWorkItem.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ConsistencyCheckWorkItemInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire._generated.entity.WorkItemSetItemInternal {
  /**
   * Gets the value of the CheckType field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ConsistencyCheckType getCheckType();
  
  
  /**
   * Gets the value of the DBConsistCheckRunID field.
   * The reference on DBConsistCheckRun
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getDBConsistCheckRunID();
  
  
  /**
   * Gets the value of the Fingerprint field.
   * Fingerprint of SQL, if not null
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFingerprint();
  
  
  /**
   * Gets the value of the TableName field.
   * The table on which to run consistency checks
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTableName();
  
  
  /**
   * Sets the value of the CheckType field.
   */
  public void setCheckType(typekey.ConsistencyCheckType value);
  
  
  /**
   * Sets the value of the DBConsistCheckRunID field.
   */
  public void setDBConsistCheckRunID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Fingerprint field.
   */
  public void setFingerprint(java.lang.String value);
  
  
  /**
   * Sets the value of the TableName field.
   */
  public void setTableName(java.lang.String value);
  
  
  
}