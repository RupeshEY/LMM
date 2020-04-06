package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LoadRowCount.eti;LoadRowCount.eix;LoadRowCount.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface LoadRowCountInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Gets the value of the LoadCommand field.
   * Parent.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadCommand getLoadCommand();
  
  
  public gw.pl.persistence.core.Key getLoadCommandID();
  
  
  /**
   * Gets the value of the SourceBlockCount field.
   * Number of blocks in source table.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSourceBlockCount();
  
  
  /**
   * Gets the value of the SourceRowCount field.
   * Number of rows in source table.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getSourceRowCount();
  
  
  /**
   * Gets the value of the SourceTableName field.
   * Name of source table.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSourceTableName();
  
  
  /**
   * Gets the value of the StagingBlockCount field.
   * Number of blocks in staging table.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getStagingBlockCount();
  
  
  /**
   * Gets the value of the StagingRowCount field.
   * Number of rows in staging table.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getStagingRowCount();
  
  
  /**
   * Gets the value of the StagingTableName field.
   * Name of staging table.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getStagingTableName();
  
  
  /**
   * Sets the value of the LoadCommand field.
   */
  public void setLoadCommand(entity.LoadCommand value);
  
  
  public void setLoadCommandID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the SourceBlockCount field.
   */
  public void setSourceBlockCount(java.lang.Integer value);
  
  
  /**
   * Sets the value of the SourceRowCount field.
   */
  public void setSourceRowCount(java.lang.Long value);
  
  
  /**
   * Sets the value of the SourceTableName field.
   */
  public void setSourceTableName(java.lang.String value);
  
  
  /**
   * Sets the value of the StagingBlockCount field.
   */
  public void setStagingBlockCount(java.lang.Integer value);
  
  
  /**
   * Sets the value of the StagingRowCount field.
   */
  public void setStagingRowCount(java.lang.Long value);
  
  
  /**
   * Sets the value of the StagingTableName field.
   */
  public void setStagingTableName(java.lang.String value);
  
  
  
}