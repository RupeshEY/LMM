package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "UpgradeInstance.eti;UpgradeInstance.eix;UpgradeInstance.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface UpgradeInstanceInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire._generated.entity.TimedUpgraderObjectInternal, com.guidewire.commons.profiler.ProfilerDataSourceInternal, com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods, com.guidewire.pl.system.database.upgrade.info.IStartAndEndTimeProvider, com.guidewire.pl.system.database.upgrade.info.IUpgradeInstanceInfo {
  /**
   * Adds the given element to the DBMSDumps array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDBMSDumps(entity.UpgradeVTDBMSDump element);
  
  
  /**
   * Adds the given element to the UpgradeDBStorageSets array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToUpgradeDBStorageSets(entity.UpgradeDBStorageSet element);
  
  
  /**
   * Adds the given element to the UpgradeRowCounts array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToUpgradeRowCounts(entity.UpgradeRowCount element);
  
  
  /**
   * Adds the given element to the UpgradeTableRegistries array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToUpgradeTableRegistries(entity.UpgradeTableRegistry element);
  
  
  /**
   * Gets the value of the DBMSDumps field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.UpgradeVTDBMSDump[] getDBMSDumps();
  
  
  /**
   * Gets the value of the DatabaseEndTime field.
   * Timestamp when the database portion of the upgrade ended
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDatabaseEndTime();
  
  
  /**
   * Gets the value of the DatabaseStartTime field.
   * Timestamp when the database portion of the upgrade started
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDatabaseStartTime();
  
  
  /**
   * Gets the value of the LockingColumn field.
   * Meaningless column for locking
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLockingColumn();
  
  
  /**
   * Gets the value of the NumDefdTasksCompleted field.
   * Number of completed deferred upgrade tasks
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNumDefdTasksCompleted();
  
  
  /**
   * Gets the value of the ProfilerData field.
   * Raw Profiler data
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.lang.Blob getProfilerData();
  
  
  /**
   * Gets the value of the SourceAppMajorVersion field.
   * Application major version of source
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSourceAppMajorVersion();
  
  
  /**
   * Gets the value of the SourceAppMinorVersion field.
   * Application minor version of source
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSourceAppMinorVersion();
  
  
  /**
   * Gets the value of the SourceBuildVersion field.
   * Build version string from source configuration which includes app version and customer version
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSourceBuildVersion();
  
  
  /**
   * Gets the value of the SourceExtensionsVersion field.
   * Extension version of source
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSourceExtensionsVersion();
  
  
  /**
   * Gets the value of the SourcePlMajorVersion field.
   * Platform major version of source
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSourcePlMajorVersion();
  
  
  /**
   * Gets the value of the SourcePlMinorVersion field.
   * Platform minor version of source
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSourcePlMinorVersion();
  
  
  /**
   * Gets the value of the TargetAppMajorVersion field.
   * Application major version of target
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTargetAppMajorVersion();
  
  
  /**
   * Gets the value of the TargetAppMinorVersion field.
   * Application minor version of target
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTargetAppMinorVersion();
  
  
  /**
   * Gets the value of the TargetBuildVersion field.
   * Build version string from target configuration which includes app version and customer version
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTargetBuildVersion();
  
  
  /**
   * Gets the value of the TargetChecksum field.
   * Checksum of target configuration (only valid if Rolling == true)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTargetChecksum();
  
  
  /**
   * Gets the value of the TargetExtensionsVersion field.
   * Extension version of target
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTargetExtensionsVersion();
  
  
  /**
   * Gets the value of the TargetPlMajorVersion field.
   * Platform major version of target
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTargetPlMajorVersion();
  
  
  /**
   * Gets the value of the TargetPlMinorVersion field.
   * Platform minor version of target
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTargetPlMinorVersion();
  
  
  /**
   * Gets the value of the TotalNumDefdTasks field.
   * Total number of deferred upgrade tasks
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTotalNumDefdTasks();
  
  
  /**
   * Gets the value of the UpgradeDBStorageSets field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.UpgradeDBStorageSet[] getUpgradeDBStorageSets();
  
  
  /**
   * Gets the value of the UpgradeRowCounts field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.UpgradeRowCount[] getUpgradeRowCounts();
  
  
  /**
   * Gets the value of the UpgradeTableRegistries field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.UpgradeTableRegistry[] getUpgradeTableRegistries();
  
  
  /**
   * Gets the value of the BackedOut field.
   * Only applicable for a rolling upgrade. True if the rolling upgrade has been backed out
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isBackedOut();
  
  
  /**
   * Gets the value of the DefdTasksCompleted field.
   * Whether we completed the deferred upgrade tasks
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isDefdTasksCompleted();
  
  
  /**
   * Gets the value of the Failed field.
   * Whether this upgrade failed
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isFailed();
  
  
  /**
   * Gets the value of the Resumed field.
   * Whether this upgrade was resumed
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isResumed();
  
  
  /**
   * Gets the value of the ReverseMigration field.
   * Only applicable for a rolling upgrade. True if this schema migration backs out the previous upgrade
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isReverseMigration();
  
  
  /**
   * Gets the value of the Rolling field.
   * Whether this is a rolling upgrade
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isRolling();
  
  
  /**
   * Gets the value of the UpdateStatistics field.
   * Whether we updated statistics as part of this upgrade
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isUpdateStatistics();
  
  
  /**
   * Removes the given element from the DBMSDumps array. This is achieved by marking the element for removal.
   */
  public void removeFromDBMSDumps(entity.UpgradeVTDBMSDump element);
  
  
  /**
   * Removes the given element from the DBMSDumps array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDBMSDumps(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the UpgradeDBStorageSets array. This is achieved by marking the element for removal.
   */
  public void removeFromUpgradeDBStorageSets(entity.UpgradeDBStorageSet element);
  
  
  /**
   * Removes the given element from the UpgradeDBStorageSets array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromUpgradeDBStorageSets(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the UpgradeRowCounts array. This is achieved by marking the element for removal.
   */
  public void removeFromUpgradeRowCounts(entity.UpgradeRowCount element);
  
  
  /**
   * Removes the given element from the UpgradeRowCounts array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromUpgradeRowCounts(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the UpgradeTableRegistries array. This is achieved by marking the element for removal.
   */
  public void removeFromUpgradeTableRegistries(entity.UpgradeTableRegistry element);
  
  
  /**
   * Removes the given element from the UpgradeTableRegistries array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromUpgradeTableRegistries(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the BackedOut field.
   */
  public void setBackedOut(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the DBMSDumps field.
   */
  public void setDBMSDumps(entity.UpgradeVTDBMSDump[] value);
  
  
  /**
   * Sets the value of the DatabaseEndTime field.
   */
  public void setDatabaseEndTime(java.util.Date value);
  
  
  /**
   * Sets the value of the DatabaseStartTime field.
   */
  public void setDatabaseStartTime(java.util.Date value);
  
  
  /**
   * Sets the value of the DefdTasksCompleted field.
   */
  public void setDefdTasksCompleted(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Failed field.
   */
  public void setFailed(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the LockingColumn field.
   */
  public void setLockingColumn(java.lang.Integer value);
  
  
  /**
   * Sets the value of the NumDefdTasksCompleted field.
   */
  public void setNumDefdTasksCompleted(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ProfilerData field.
   */
  public void setProfilerData(gw.lang.Blob value);
  
  
  /**
   * Sets the value of the Resumed field.
   */
  public void setResumed(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ReverseMigration field.
   */
  public void setReverseMigration(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Rolling field.
   */
  public void setRolling(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the SourceAppMajorVersion field.
   */
  public void setSourceAppMajorVersion(java.lang.Integer value);
  
  
  /**
   * Sets the value of the SourceAppMinorVersion field.
   */
  public void setSourceAppMinorVersion(java.lang.Integer value);
  
  
  /**
   * Sets the value of the SourceBuildVersion field.
   */
  public void setSourceBuildVersion(java.lang.String value);
  
  
  /**
   * Sets the value of the SourceExtensionsVersion field.
   */
  public void setSourceExtensionsVersion(java.lang.Integer value);
  
  
  /**
   * Sets the value of the SourcePlMajorVersion field.
   */
  public void setSourcePlMajorVersion(java.lang.Integer value);
  
  
  /**
   * Sets the value of the SourcePlMinorVersion field.
   */
  public void setSourcePlMinorVersion(java.lang.Integer value);
  
  
  /**
   * Sets the value of the TargetAppMajorVersion field.
   */
  public void setTargetAppMajorVersion(java.lang.Integer value);
  
  
  /**
   * Sets the value of the TargetAppMinorVersion field.
   */
  public void setTargetAppMinorVersion(java.lang.Integer value);
  
  
  /**
   * Sets the value of the TargetBuildVersion field.
   */
  public void setTargetBuildVersion(java.lang.String value);
  
  
  /**
   * Sets the value of the TargetChecksum field.
   */
  public void setTargetChecksum(java.lang.String value);
  
  
  /**
   * Sets the value of the TargetExtensionsVersion field.
   */
  public void setTargetExtensionsVersion(java.lang.Integer value);
  
  
  /**
   * Sets the value of the TargetPlMajorVersion field.
   */
  public void setTargetPlMajorVersion(java.lang.Integer value);
  
  
  /**
   * Sets the value of the TargetPlMinorVersion field.
   */
  public void setTargetPlMinorVersion(java.lang.Integer value);
  
  
  /**
   * Sets the value of the TotalNumDefdTasks field.
   */
  public void setTotalNumDefdTasks(java.lang.Integer value);
  
  
  /**
   * Sets the value of the UpdateStatistics field.
   */
  public void setUpdateStatistics(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the UpgradeDBStorageSets field.
   */
  public void setUpgradeDBStorageSets(entity.UpgradeDBStorageSet[] value);
  
  
  /**
   * Sets the value of the UpgradeRowCounts field.
   */
  public void setUpgradeRowCounts(entity.UpgradeRowCount[] value);
  
  
  /**
   * Sets the value of the UpgradeTableRegistries field.
   */
  public void setUpgradeTableRegistries(entity.UpgradeTableRegistry[] value);
  
  
  
}