package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DBConsistCheckQueryExec.eti;DBConsistCheckQueryExec.eix;DBConsistCheckQueryExec.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface DBConsistCheckQueryExecInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire.pl.domain.database.DBConsistCheckQueryExecPublicMethods {
  /**
   * Gets the value of the ConsistencyCheckType field.
   * Type of consistency check
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ConsistencyCheckType getConsistencyCheckType();
  
  
  /**
   * Gets the value of the DBConsistCheckRun field.
   * DBConsistCheckRun for this object.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DBConsistCheckRun getDBConsistCheckRun();
  
  
  public gw.pl.persistence.core.Key getDBConsistCheckRunID();
  
  
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
   * # of rows failing check
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
   * Gets the value of the QueryToIdentifyRows field.
   * Query to identify rows.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getQueryToIdentifyRows();
  
  
  /**
   * Gets the value of the SQLFailureMsg field.
   * SQL failure stack trace
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSQLFailureMsg();
  
  
  /**
   * Gets the value of the StartTime field.
   * Start time of query execution.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartTime();
  
  
  /**
   * Gets the value of the TableName field.
   * Table name
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTableName();
  
  
  /**
   * Sets the value of the ConsistencyCheckType field.
   */
  public void setConsistencyCheckType(typekey.ConsistencyCheckType value);
  
  
  /**
   * Sets the value of the DBConsistCheckRun field.
   */
  public void setDBConsistCheckRun(entity.DBConsistCheckRun value);
  
  
  public void setDBConsistCheckRunID(gw.pl.persistence.core.Key value);
  
  
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
   * Sets the value of the QueryToIdentifyRows field.
   */
  public void setQueryToIdentifyRows(java.lang.String value);
  
  
  /**
   * Sets the value of the SQLFailureMsg field.
   */
  public void setSQLFailureMsg(java.lang.String value);
  
  
  /**
   * Sets the value of the StartTime field.
   */
  public void setStartTime(java.util.Date value);
  
  
  /**
   * Sets the value of the TableName field.
   */
  public void setTableName(java.lang.String value);
  
  
  
}