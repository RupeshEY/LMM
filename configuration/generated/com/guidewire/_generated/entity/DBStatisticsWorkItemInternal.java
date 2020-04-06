package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DBStatisticsWorkItem.eti;DBStatisticsWorkItem.eix;DBStatisticsWorkItem.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface DBStatisticsWorkItemInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire._generated.entity.WorkItemSetItemInternal {
  /**
   * Gets the value of the DBUpdateStatsID field.
   * The reference on DatabaseUpdateStats
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getDBUpdateStatsID();
  
  
  /**
   * Gets the value of the Data field.
   * Serialized DBStatisticsTableWrapper
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.lang.Blob getData();
  
  
  /**
   * Sets the value of the DBUpdateStatsID field.
   */
  public void setDBUpdateStatsID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Data field.
   */
  public void setData(gw.lang.Blob value);
  
  
  
}