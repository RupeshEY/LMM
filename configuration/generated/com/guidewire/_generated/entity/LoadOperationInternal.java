package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LoadOperation.eti;LoadOperation.eix;LoadOperation.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface LoadOperationInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire._generated.entity.TimedLoaderObjectInternal, com.guidewire._generated.entity.OrdereddLoaderObjectInternal {
  /**
   * Adds the given element to the Callbacks array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCallbacks(entity.LoadCallback element);
  
  
  /**
   * Adds the given element to the InsertSelects array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToInsertSelects(entity.LoadInsertSelect element);
  
  
  /**
   * Adds the given element to the IntegrityChecks array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToIntegrityChecks(entity.LoadIntegrityCheck element);
  
  
  /**
   * Adds the given element to the UpdateStatisticsSelects array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToUpdateStatisticsSelects(entity.LoadUpdateStatisticsSelect element);
  
  
  /**
   * Gets the value of the AffectedRowCount field.
   * Number of rows affected.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getAffectedRowCount();
  
  
  /**
   * Gets the value of the Callbacks field.
   * Timed loader callbacks.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadCallback[] getCallbacks();
  
  
  /**
   * Gets the value of the ErrorCount field.
   * Number of integrity check errors detected (if applicable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getErrorCount();
  
  
  /**
   * Gets the value of the HighestID field.
   * If associated with a idsgenerated step, contains the end of the id range for the rows being loaded.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getHighestID();
  
  
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
   * Gets the value of the LoadStep field.
   * Parent step.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadStep getLoadStep();
  
  
  public gw.pl.persistence.core.Key getLoadStepID();
  
  
  /**
   * Gets the value of the LowestID field.
   * If associated with a idsgenerated step, contains the start of the id range for the rows being loaded.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLowestID();
  
  
  /**
   * Gets the value of the TableName field.
   * Affected staging table.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTableName();
  
  
  /**
   * Gets the value of the UpdateStatisticsSelects field.
   * db update statistics loader selects.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadUpdateStatisticsSelect[] getUpdateStatisticsSelects();
  
  
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
   * Removes the given element from the UpdateStatisticsSelects array. This is achieved by marking the element for removal.
   */
  public void removeFromUpdateStatisticsSelects(entity.LoadUpdateStatisticsSelect element);
  
  
  /**
   * Removes the given element from the UpdateStatisticsSelects array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromUpdateStatisticsSelects(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the AffectedRowCount field.
   */
  public void setAffectedRowCount(java.lang.Long value);
  
  
  /**
   * Sets the value of the Callbacks field.
   */
  public void setCallbacks(entity.LoadCallback[] value);
  
  
  /**
   * Sets the value of the ErrorCount field.
   */
  public void setErrorCount(java.lang.Integer value);
  
  
  /**
   * Sets the value of the HighestID field.
   */
  public void setHighestID(java.lang.Long value);
  
  
  /**
   * Sets the value of the InsertSelects field.
   */
  public void setInsertSelects(entity.LoadInsertSelect[] value);
  
  
  /**
   * Sets the value of the IntegrityChecks field.
   */
  public void setIntegrityChecks(entity.LoadIntegrityCheck[] value);
  
  
  /**
   * Sets the value of the LoadStep field.
   */
  public void setLoadStep(entity.LoadStep value);
  
  
  public void setLoadStepID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LowestID field.
   */
  public void setLowestID(java.lang.Long value);
  
  
  /**
   * Sets the value of the TableName field.
   */
  public void setTableName(java.lang.String value);
  
  
  /**
   * Sets the value of the UpdateStatisticsSelects field.
   */
  public void setUpdateStatisticsSelects(entity.LoadUpdateStatisticsSelect[] value);
  
  
  
}