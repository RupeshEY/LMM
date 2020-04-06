package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DatabaseUpdateStats.eti;DatabaseUpdateStats.eix;DatabaseUpdateStats.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface DatabaseUpdateStatsInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Adds the given element to the TableUpdateStats array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToTableUpdateStats(entity.TableUpdateStats element);
  
  
  /**
   * Gets the value of the Description field.
   * Description.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the EndTime field.
   * End time of update statistics process.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEndTime();
  
  
  /**
   * Gets the value of the ExtensionsSchemaVersion field.
   * Extensions Schema Version at time of collection 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getExtensionsSchemaVersion();
  
  
  /**
   * Gets the value of the MajorSchemaVersion field.
   * Major Schema Version at time of collection 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getMajorSchemaVersion();
  
  
  /**
   * Gets the value of the MinorSchemaVersion field.
   * Minor Schema Version at time of collection 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getMinorSchemaVersion();
  
  
  /**
   * Gets the value of the PlatformMajorSchemaVersion field.
   * Platform Major Schema Version at time of collection 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getPlatformMajorSchemaVersion();
  
  
  /**
   * Gets the value of the PlatformMinorSchemaVersion field.
   * Platform Minor Schema Version at time of collection 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getPlatformMinorSchemaVersion();
  
  
  /**
   * Gets the value of the RunnerType field.
   * Type of process running the operation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DBUpdateStatsRunnerType getRunnerType();
  
  
  /**
   * Gets the value of the StartTime field.
   * Start time of update statistics process.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartTime();
  
  
  /**
   * Gets the value of the TableUpdateStats field.
   * Collection of TableUpdateStats linked to this DatabaseUpdateStats.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TableUpdateStats[] getTableUpdateStats();
  
  
  /**
   * Gets the value of the incrementalThresholdPercent field.
   * incremental threshold percent.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getincrementalThresholdPercent();
  
  
  /**
   * Gets the value of the updateStatisticsSQL field.
   * Query used to determine if threshold exceeded.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getupdateStatisticsSQL();
  
  
  /**
   * Gets the value of the Incremental field.
   * Whether update is incremental.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIncremental();
  
  
  /**
   * Removes the given element from the TableUpdateStats array. This is achieved by marking the element for removal.
   */
  public void removeFromTableUpdateStats(entity.TableUpdateStats element);
  
  
  /**
   * Removes the given element from the TableUpdateStats array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromTableUpdateStats(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the EndTime field.
   */
  public void setEndTime(java.util.Date value);
  
  
  /**
   * Sets the value of the ExtensionsSchemaVersion field.
   */
  public void setExtensionsSchemaVersion(java.lang.Integer value);
  
  
  /**
   * Sets the value of the Incremental field.
   */
  public void setIncremental(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the MajorSchemaVersion field.
   */
  public void setMajorSchemaVersion(java.lang.Integer value);
  
  
  /**
   * Sets the value of the MinorSchemaVersion field.
   */
  public void setMinorSchemaVersion(java.lang.Integer value);
  
  
  /**
   * Sets the value of the PlatformMajorSchemaVersion field.
   */
  public void setPlatformMajorSchemaVersion(java.lang.Integer value);
  
  
  /**
   * Sets the value of the PlatformMinorSchemaVersion field.
   */
  public void setPlatformMinorSchemaVersion(java.lang.Integer value);
  
  
  /**
   * Sets the value of the RunnerType field.
   */
  public void setRunnerType(typekey.DBUpdateStatsRunnerType value);
  
  
  /**
   * Sets the value of the StartTime field.
   */
  public void setStartTime(java.util.Date value);
  
  
  /**
   * Sets the value of the TableUpdateStats field.
   */
  public void setTableUpdateStats(entity.TableUpdateStats[] value);
  
  
  /**
   * Sets the value of the incrementalThresholdPercent field.
   */
  public void setincrementalThresholdPercent(java.lang.Integer value);
  
  
  /**
   * Sets the value of the updateStatisticsSQL field.
   */
  public void setupdateStatisticsSQL(java.lang.String value);
  
  
  
}