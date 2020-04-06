package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "UpgradeRowCount.eti;UpgradeRowCount.eix;UpgradeRowCount.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface UpgradeRowCountInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Gets the value of the RowCountAfterUpgrade field.
   * Row count after upgrade
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getRowCountAfterUpgrade();
  
  
  /**
   * Gets the value of the RowCountBeforeUpgrade field.
   * Row count before upgrade
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getRowCountBeforeUpgrade();
  
  
  /**
   * Gets the value of the RowCountChange field.
   * Row count change after upgrade
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getRowCountChange();
  
  
  /**
   * Gets the value of the TableName field.
   * Table name
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTableName();
  
  
  /**
   * Gets the value of the UpgradeInstance field.
   * Parent
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.UpgradeInstance getUpgradeInstance();
  
  
  public gw.pl.persistence.core.Key getUpgradeInstanceID();
  
  
  /**
   * Sets the value of the RowCountAfterUpgrade field.
   */
  public void setRowCountAfterUpgrade(java.lang.Integer value);
  
  
  /**
   * Sets the value of the RowCountBeforeUpgrade field.
   */
  public void setRowCountBeforeUpgrade(java.lang.Integer value);
  
  
  /**
   * Sets the value of the RowCountChange field.
   */
  public void setRowCountChange(java.lang.Integer value);
  
  
  /**
   * Sets the value of the TableName field.
   */
  public void setTableName(java.lang.String value);
  
  
  /**
   * Sets the value of the UpgradeInstance field.
   */
  public void setUpgradeInstance(entity.UpgradeInstance value);
  
  
  public void setUpgradeInstanceID(gw.pl.persistence.core.Key value);
  
  
  
}