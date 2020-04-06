package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "UpdateDBStatisticsCommand.eti;UpdateDBStatisticsCommand.eix;UpdateDBStatisticsCommand.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface UpdateDBStatisticsCommandInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Gets the value of the LoadCommand field.
   * Parent.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadCommand getLoadCommand();
  
  
  public gw.pl.persistence.core.Key getLoadCommandID();
  
  
  /**
   * Gets the value of the StatsCommand field.
   * Update database statistics command to run.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getStatsCommand();
  
  
  /**
   * Gets the value of the TableName field.
   * Affected table.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTableName();
  
  
  /**
   * Sets the value of the LoadCommand field.
   */
  public void setLoadCommand(entity.LoadCommand value);
  
  
  public void setLoadCommandID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the StatsCommand field.
   */
  public void setStatsCommand(java.lang.String value);
  
  
  /**
   * Sets the value of the TableName field.
   */
  public void setTableName(java.lang.String value);
  
  
  
}