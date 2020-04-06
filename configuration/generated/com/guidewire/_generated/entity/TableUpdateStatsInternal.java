package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TableUpdateStats.eti;TableUpdateStats.eix;TableUpdateStats.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TableUpdateStatsInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Adds the given element to the TableUpdateStatsStatements array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToTableUpdateStatsStatements(entity.TableUpdateStatsStatement element);
  
  
  /**
   * Gets the value of the DatabaseUpdateStats field.
   * DatabaseUpdateStats for this object.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DatabaseUpdateStats getDatabaseUpdateStats();
  
  
  public gw.pl.persistence.core.Key getDatabaseUpdateStatsID();
  
  
  /**
   * Gets the value of the EndTime field.
   * End time of update statistics process for this table.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEndTime();
  
  
  /**
   * Gets the value of the StartTime field.
   * Start time of update statistics process for this table.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartTime();
  
  
  /**
   * Gets the value of the TableName field.
   * Name of table.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTableName();
  
  
  /**
   * Gets the value of the TableUpdateStatsStatements field.
   * Collection of TableUpdateStatsStatements linked to this TableUpdateStats.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TableUpdateStatsStatement[] getTableUpdateStatsStatements();
  
  
  /**
   * Array association for partition TableUpdateStatsStatementsByUpdateStatsTypes on array TableUpdateStatsStatements
   */
  public entity.TableUpdateStatsStatement[] getTableUpdateStatsStatementsByUpdateStatsTypes(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property);
  
  
  /**
   * Removes the given element from the TableUpdateStatsStatements array. This is achieved by marking the element for removal.
   */
  public void removeFromTableUpdateStatsStatements(entity.TableUpdateStatsStatement element);
  
  
  /**
   * Removes the given element from the TableUpdateStatsStatements array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromTableUpdateStatsStatements(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the DatabaseUpdateStats field.
   */
  public void setDatabaseUpdateStats(entity.DatabaseUpdateStats value);
  
  
  public void setDatabaseUpdateStatsID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the EndTime field.
   */
  public void setEndTime(java.util.Date value);
  
  
  /**
   * Sets the value of the StartTime field.
   */
  public void setStartTime(java.util.Date value);
  
  
  /**
   * Sets the value of the TableName field.
   */
  public void setTableName(java.lang.String value);
  
  
  /**
   * Sets the value of the TableUpdateStatsStatements field.
   */
  public void setTableUpdateStatsStatements(entity.TableUpdateStatsStatement[] value);
  
  
  
}