package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LoadCommand.eti;LoadCommand.eix;LoadCommand.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface LoadCommandInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire._generated.entity.TimedLoaderObjectInternal, com.guidewire.pl.domain.staging.LoadCommandPublicMethods {
  /**
   * Adds the given element to the Callbacks array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCallbacks(entity.LoadCallback element);
  
  
  /**
   * Adds the given element to the EncryptTables array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToEncryptTables(entity.LoadEncryptTable element);
  
  
  /**
   * Adds the given element to the InsertSelects array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToInsertSelects(entity.LoadInsertSelect element);
  
  
  /**
   * Adds the given element to the IntegrityChecks array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToIntegrityChecks(entity.LoadIntegrityCheck element);
  
  
  /**
   * Adds the given element to the ParameterNameValuePairs array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToParameterNameValuePairs(entity.LoadParameter element);
  
  
  /**
   * Adds the given element to the RowCounts array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRowCounts(entity.LoadRowCount element);
  
  
  /**
   * Adds the given element to the Steps array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToSteps(entity.LoadStep element);
  
  
  /**
   * Adds the given element to the UpdateDBStatisticsCommands array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToUpdateDBStatisticsCommands(entity.UpdateDBStatisticsCommand element);
  
  
  /**
   * Gets the value of the Callbacks field.
   * Timed loader callbacks.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadCallback[] getCallbacks();
  
  
  /**
   * Gets the value of the CallingUser field.
   * ID of the user who executed the operation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getCallingUser();
  
  
  public gw.pl.persistence.core.Key getCallingUserID();
  
  
  /**
   * Gets the value of the CommandType field.
   * Type of load command.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LoadCommandType getCommandType();
  
  
  /**
   * Gets the value of the Description field.
   * Description of the load history event.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the EncryptTables field.
   * Timed loader table columns encryptions.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadEncryptTable[] getEncryptTables();
  
  
  /**
   * Gets the value of the ErrorCount field.
   * Total number of integrity check errors detected for all affected tables (if applicable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getErrorCount();
  
  
  /**
   * Gets the value of the InsertSelects field.
   * Timed loader insert/selects.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadInsertSelect[] getInsertSelects();
  
  
  /**
   * Gets the value of the IntegrityChecks field.
   * Timed loader integrity checks.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadIntegrityCheck[] getIntegrityChecks();
  
  
  /**
   * Gets the value of the ParameterNameValuePairs field.
   * Parameter values for command.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadParameter[] getParameterNameValuePairs();
  
  
  /**
   * Gets the value of the RecreateIndexes field.
   * ID of batch process to recreate indexes.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getRecreateIndexes();
  
  
  /**
   * Gets the value of the RowCounts field.
   * Row counts.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadRowCount[] getRowCounts();
  
  
  /**
   * Gets the value of the Steps field.
   * Steps.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadStep[] getSteps();
  
  
  /**
   * Gets the value of the UpdateDBStatisticsCommands field.
   * UpdateDBStatisticsCommands.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.UpdateDBStatisticsCommand[] getUpdateDBStatisticsCommands();
  
  
  /**
   * Removes the given element from the Callbacks array. This is achieved by marking the element for removal.
   */
  public void removeFromCallbacks(entity.LoadCallback element);
  
  
  /**
   * Removes the given element from the Callbacks array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCallbacks(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the EncryptTables array. This is achieved by marking the element for removal.
   */
  public void removeFromEncryptTables(entity.LoadEncryptTable element);
  
  
  /**
   * Removes the given element from the EncryptTables array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromEncryptTables(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the InsertSelects array. This is achieved by marking the element for removal.
   */
  public void removeFromInsertSelects(entity.LoadInsertSelect element);
  
  
  /**
   * Removes the given element from the InsertSelects array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromInsertSelects(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the IntegrityChecks array. This is achieved by marking the element for removal.
   */
  public void removeFromIntegrityChecks(entity.LoadIntegrityCheck element);
  
  
  /**
   * Removes the given element from the IntegrityChecks array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromIntegrityChecks(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ParameterNameValuePairs array. This is achieved by marking the element for removal.
   */
  public void removeFromParameterNameValuePairs(entity.LoadParameter element);
  
  
  /**
   * Removes the given element from the ParameterNameValuePairs array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromParameterNameValuePairs(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the RowCounts array. This is achieved by marking the element for removal.
   */
  public void removeFromRowCounts(entity.LoadRowCount element);
  
  
  /**
   * Removes the given element from the RowCounts array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRowCounts(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Steps array. This is achieved by marking the element for removal.
   */
  public void removeFromSteps(entity.LoadStep element);
  
  
  /**
   * Removes the given element from the Steps array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromSteps(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the UpdateDBStatisticsCommands array. This is achieved by marking the element for removal.
   */
  public void removeFromUpdateDBStatisticsCommands(entity.UpdateDBStatisticsCommand element);
  
  
  /**
   * Removes the given element from the UpdateDBStatisticsCommands array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromUpdateDBStatisticsCommands(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Callbacks field.
   */
  public void setCallbacks(entity.LoadCallback[] value);
  
  
  /**
   * Sets the value of the CallingUser field.
   */
  public void setCallingUser(entity.User value);
  
  
  public void setCallingUserID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the CommandType field.
   */
  public void setCommandType(typekey.LoadCommandType value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the EncryptTables field.
   */
  public void setEncryptTables(entity.LoadEncryptTable[] value);
  
  
  /**
   * Sets the value of the ErrorCount field.
   */
  public void setErrorCount(java.lang.Integer value);
  
  
  /**
   * Sets the value of the InsertSelects field.
   */
  public void setInsertSelects(entity.LoadInsertSelect[] value);
  
  
  /**
   * Sets the value of the IntegrityChecks field.
   */
  public void setIntegrityChecks(entity.LoadIntegrityCheck[] value);
  
  
  /**
   * Sets the value of the ParameterNameValuePairs field.
   */
  public void setParameterNameValuePairs(entity.LoadParameter[] value);
  
  
  /**
   * Sets the value of the RecreateIndexes field.
   */
  public void setRecreateIndexes(java.lang.Long value);
  
  
  /**
   * Sets the value of the RowCounts field.
   */
  public void setRowCounts(entity.LoadRowCount[] value);
  
  
  /**
   * Sets the value of the Steps field.
   */
  public void setSteps(entity.LoadStep[] value);
  
  
  /**
   * Sets the value of the UpdateDBStatisticsCommands field.
   */
  public void setUpdateDBStatisticsCommands(entity.UpdateDBStatisticsCommand[] value);
  
  
  
}