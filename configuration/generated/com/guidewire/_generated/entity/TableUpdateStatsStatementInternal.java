package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TableUpdateStatsStatement.eti;TableUpdateStatsStatement.eix;TableUpdateStatsStatement.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TableUpdateStatsStatementInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Gets the value of the ObjectName field.
   * Object Name
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getObjectName();
  
  
  /**
   * Gets the value of the TableUpdateStats field.
   * Parent
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TableUpdateStats getTableUpdateStats();
  
  
  public gw.pl.persistence.core.Key getTableUpdateStatsID();
  
  
  /**
   * Gets the value of the UpdateStatsStatement field.
   * Update Statistics Statement
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getUpdateStatsStatement();
  
  
  /**
   * Gets the value of the UpdateStatsType field.
   * Type of process running the operation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TableUpdateStatsType getUpdateStatsType();
  
  
  /**
   * Sets the value of the ObjectName field.
   */
  public void setObjectName(java.lang.String value);
  
  
  /**
   * Sets the value of the TableUpdateStats field.
   */
  public void setTableUpdateStats(entity.TableUpdateStats value);
  
  
  public void setTableUpdateStatsID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the UpdateStatsStatement field.
   */
  public void setUpdateStatsStatement(java.lang.String value);
  
  
  /**
   * Sets the value of the UpdateStatsType field.
   */
  public void setUpdateStatsType(typekey.TableUpdateStatsType value);
  
  
  
}