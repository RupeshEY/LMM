package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DataDistQueryExec.eti;DataDistQueryExec.eix;DataDistQueryExec.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface DataDistQueryExecInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Gets the value of the DatabaseDataDist field.
   * DatabaseDataDist for this object.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DatabaseDataDist getDatabaseDataDist();
  
  
  public gw.pl.persistence.core.Key getDatabaseDataDistID();
  
  
  /**
   * Gets the value of the Description field.
   * Description.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the Duration field.
   * Elapsed time in seconds
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getDuration();
  
  
  /**
   * Gets the value of the EndTime field.
   * End time of query execution.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEndTime();
  
  
  /**
   * Gets the value of the Fingerprint field.
   * Fingerprint of query, if query-based
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFingerprint();
  
  
  /**
   * Gets the value of the NumRows field.
   * # of rows returned by query
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNumRows();
  
  
  /**
   * Gets the value of the QueryText field.
   * Query.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getQueryText();
  
  
  /**
   * Gets the value of the StartTime field.
   * Start time of query execution.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartTime();
  
  
  /**
   * Gets the value of the TableName field.
   * Table name for query, if query-based
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTableName();
  
  
  /**
   * Gets the value of the ThreadName field.
   * Thread name.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getThreadName();
  
  
  /**
   * Sets the value of the DatabaseDataDist field.
   */
  public void setDatabaseDataDist(entity.DatabaseDataDist value);
  
  
  public void setDatabaseDataDistID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the Duration field.
   */
  public void setDuration(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the EndTime field.
   */
  public void setEndTime(java.util.Date value);
  
  
  /**
   * Sets the value of the Fingerprint field.
   */
  public void setFingerprint(java.lang.String value);
  
  
  /**
   * Sets the value of the NumRows field.
   */
  public void setNumRows(java.lang.Integer value);
  
  
  /**
   * Sets the value of the QueryText field.
   */
  public void setQueryText(java.lang.String value);
  
  
  /**
   * Sets the value of the StartTime field.
   */
  public void setStartTime(java.util.Date value);
  
  
  /**
   * Sets the value of the TableName field.
   */
  public void setTableName(java.lang.String value);
  
  
  /**
   * Sets the value of the ThreadName field.
   */
  public void setThreadName(java.lang.String value);
  
  
  
}