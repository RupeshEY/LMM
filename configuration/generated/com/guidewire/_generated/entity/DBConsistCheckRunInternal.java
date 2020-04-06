package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DBConsistCheckRun.eti;DBConsistCheckRun.eix;DBConsistCheckRun.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface DBConsistCheckRunInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire.pl.domain.database.DBConsistCheckRunPublicMethods {
  /**
   * Adds the given element to the DBConsistCheckQueryExecs array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDBConsistCheckQueryExecs(entity.DBConsistCheckQueryExec element);
  
  
  /**
   * Gets the value of the DBConsistCheckQueryExecs field.
   * Collection of DBConsistCheckQueryExecs linked to this DBConsistCheckExec.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DBConsistCheckQueryExec[] getDBConsistCheckQueryExecs();
  
  
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
   * End time of consistency check process.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEndTime();
  
  
  /**
   * Gets the value of the ExtensionsSchemaVersion field.
   * Extensions version number at time of check
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getExtensionsSchemaVersion();
  
  
  /**
   * Gets the value of the MajorSchemaVersion field.
   * Major Schema Version at time of check 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getMajorSchemaVersion();
  
  
  /**
   * Gets the value of the MinorSchemaVersion field.
   * Minor Schema Version at time of check 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getMinorSchemaVersion();
  
  
  /**
   * Gets the value of the NumberOfThreads field.
   * Number of threads used to run this job
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNumberOfThreads();
  
  
  /**
   * Gets the value of the PlatformMajorSchemaVersion field.
   * Platform Major Schema Version at time of check 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getPlatformMajorSchemaVersion();
  
  
  /**
   * Gets the value of the PlatformMinorSchemaVersion field.
   * Platform Minor Schema Version at time of check 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getPlatformMinorSchemaVersion();
  
  
  /**
   * Gets the value of the StartTime field.
   * Start time of consistency check process.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartTime();
  
  
  /**
   * Gets the value of the TotalNumChecks field.
   * Total number of checks in this run
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTotalNumChecks();
  
  
  /**
   * Removes the given element from the DBConsistCheckQueryExecs array. This is achieved by marking the element for removal.
   */
  public void removeFromDBConsistCheckQueryExecs(entity.DBConsistCheckQueryExec element);
  
  
  /**
   * Removes the given element from the DBConsistCheckQueryExecs array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDBConsistCheckQueryExecs(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the DBConsistCheckQueryExecs field.
   */
  public void setDBConsistCheckQueryExecs(entity.DBConsistCheckQueryExec[] value);
  
  
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
   * Sets the value of the ExtensionsSchemaVersion field.
   */
  public void setExtensionsSchemaVersion(java.lang.Integer value);
  
  
  /**
   * Sets the value of the MajorSchemaVersion field.
   */
  public void setMajorSchemaVersion(java.lang.Integer value);
  
  
  /**
   * Sets the value of the MinorSchemaVersion field.
   */
  public void setMinorSchemaVersion(java.lang.Integer value);
  
  
  /**
   * Sets the value of the NumberOfThreads field.
   */
  public void setNumberOfThreads(java.lang.Integer value);
  
  
  /**
   * Sets the value of the PlatformMajorSchemaVersion field.
   */
  public void setPlatformMajorSchemaVersion(java.lang.Integer value);
  
  
  /**
   * Sets the value of the PlatformMinorSchemaVersion field.
   */
  public void setPlatformMinorSchemaVersion(java.lang.Integer value);
  
  
  /**
   * Sets the value of the StartTime field.
   */
  public void setStartTime(java.util.Date value);
  
  
  /**
   * Sets the value of the TotalNumChecks field.
   */
  public void setTotalNumChecks(java.lang.Integer value);
  
  
  
}