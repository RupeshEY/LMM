package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LoadUpdateStatisticsSelect.eti;LoadUpdateStatisticsSelect.eix;LoadUpdateStatisticsSelect.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface LoadUpdateStatisticsSelectInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire._generated.entity.TimedLoaderObjectInternal, com.guidewire._generated.entity.OrdereddLoaderObjectInternal {
  /**
   * Gets the value of the LoadCommand field.
   * Denorm FK for unique index.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadCommand getLoadCommand();
  
  
  public gw.pl.persistence.core.Key getLoadCommandID();
  
  
  /**
   * Gets the value of the LoadOperation field.
   * Parent.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadOperation getLoadOperation();
  
  
  public gw.pl.persistence.core.Key getLoadOperationID();
  
  
  /**
   * Gets the value of the Query field.
   * insert/select.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getQuery();
  
  
  /**
   * Gets the value of the TableName field.
   * Affected staging table.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTableName();
  
  
  /**
   * Sets the value of the LoadCommand field.
   */
  public void setLoadCommand(entity.LoadCommand value);
  
  
  public void setLoadCommandID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadOperation field.
   */
  public void setLoadOperation(entity.LoadOperation value);
  
  
  public void setLoadOperationID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Query field.
   */
  public void setQuery(java.lang.String value);
  
  
  /**
   * Sets the value of the TableName field.
   */
  public void setTableName(java.lang.String value);
  
  
  
}