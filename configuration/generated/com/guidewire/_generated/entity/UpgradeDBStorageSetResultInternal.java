package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "UpgradeDBStorageSetResult.eti;UpgradeDBStorageSetResult.eix;UpgradeDBStorageSetResult.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface UpgradeDBStorageSetResultInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Gets the value of the ColumnOrder field.
   * 0-based ordering of column of result within DBSS results
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getColumnOrder();
  
  
  /**
   * Gets the value of the RowOrder field.
   * 0-based ordering of row of result within DBSS results
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getRowOrder();
  
  
  /**
   * Gets the value of the UpgradeDBStorageSet field.
   * Database storage set for this object
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.UpgradeDBStorageSet getUpgradeDBStorageSet();
  
  
  public gw.pl.persistence.core.Key getUpgradeDBStorageSetID();
  
  
  /**
   * Gets the value of the Value field.
   * Result value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getValue();
  
  
  /**
   * Sets the value of the ColumnOrder field.
   */
  public void setColumnOrder(java.lang.Integer value);
  
  
  /**
   * Sets the value of the RowOrder field.
   */
  public void setRowOrder(java.lang.Integer value);
  
  
  /**
   * Sets the value of the UpgradeDBStorageSet field.
   */
  public void setUpgradeDBStorageSet(entity.UpgradeDBStorageSet value);
  
  
  public void setUpgradeDBStorageSetID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Value field.
   */
  public void setValue(java.lang.String value);
  
  
  
}