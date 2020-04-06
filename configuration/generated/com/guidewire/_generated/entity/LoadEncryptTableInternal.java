package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LoadEncryptTable.eti;LoadEncryptTable.eix;LoadEncryptTable.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface LoadEncryptTableInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire._generated.entity.TimedLoaderObjectInternal, com.guidewire.pl.domain.staging.LoadEncryptTablePublicMethods {
  /**
   * Adds the given element to the LoadEncryptChunks array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToLoadEncryptChunks(entity.LoadEncryptChunk element);
  
  
  /**
   * Gets the value of the AffectedRowCount field.
   * Total rows read and updated
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getAffectedRowCount();
  
  
  /**
   * Gets the value of the ColumnsToEncrypt field.
   * Column(s) being encrypted (comma separated)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getColumnsToEncrypt();
  
  
  /**
   * Gets the value of the LoadCommand field.
   * Parent load command
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadCommand getLoadCommand();
  
  
  public gw.pl.persistence.core.Key getLoadCommandID();
  
  
  /**
   * Gets the value of the LoadEncryptChunks field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadEncryptChunk[] getLoadEncryptChunks();
  
  
  /**
   * Gets the value of the SelectStmt field.
   * Select statement used to read rows
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSelectStmt();
  
  
  /**
   * Gets the value of the SizeOfTimedChuck field.
   * Target number of update executions in each chunk
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSizeOfTimedChuck();
  
  
  /**
   * Gets the value of the TableName field.
   * Name of table being updated
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTableName();
  
  
  /**
   * Gets the value of the UpdateStmt field.
   * Update statement used to update rows
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getUpdateStmt();
  
  
  /**
   * Removes the given element from the LoadEncryptChunks array. This is achieved by marking the element for removal.
   */
  public void removeFromLoadEncryptChunks(entity.LoadEncryptChunk element);
  
  
  /**
   * Removes the given element from the LoadEncryptChunks array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromLoadEncryptChunks(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the AffectedRowCount field.
   */
  public void setAffectedRowCount(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ColumnsToEncrypt field.
   */
  public void setColumnsToEncrypt(java.lang.String value);
  
  
  /**
   * Sets the value of the LoadCommand field.
   */
  public void setLoadCommand(entity.LoadCommand value);
  
  
  public void setLoadCommandID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadEncryptChunks field.
   */
  public void setLoadEncryptChunks(entity.LoadEncryptChunk[] value);
  
  
  /**
   * Sets the value of the SelectStmt field.
   */
  public void setSelectStmt(java.lang.String value);
  
  
  /**
   * Sets the value of the SizeOfTimedChuck field.
   */
  public void setSizeOfTimedChuck(java.lang.Integer value);
  
  
  /**
   * Sets the value of the TableName field.
   */
  public void setTableName(java.lang.String value);
  
  
  /**
   * Sets the value of the UpdateStmt field.
   */
  public void setUpdateStmt(java.lang.String value);
  
  
  
}