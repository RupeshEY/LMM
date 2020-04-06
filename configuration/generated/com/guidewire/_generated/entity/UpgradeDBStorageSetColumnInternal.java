package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "UpgradeDBStorageSetColumn.eti;UpgradeDBStorageSetColumn.eix;UpgradeDBStorageSetColumn.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface UpgradeDBStorageSetColumnInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Gets the value of the ColumnClass field.
   * Java class of data.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getColumnClass();
  
  
  /**
   * Gets the value of the ColumnName field.
   * Column name.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getColumnName();
  
  
  /**
   * Gets the value of the ColumnOrder field.
   * 0-based ordering of columnname.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getColumnOrder();
  
  
  /**
   * Gets the value of the UpgradeDBStorageSet field.
   * Database storage set for this object
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.UpgradeDBStorageSet getUpgradeDBStorageSet();
  
  
  public gw.pl.persistence.core.Key getUpgradeDBStorageSetID();
  
  
  /**
   * Gets the value of the CompareColumn field.
   * True if column is compared side by side.  False will show differences in parentheses
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCompareColumn();
  
  
  /**
   * Gets the value of the KeyColumn field.
   * True if used to match before and after object.  False if compare before and after
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isKeyColumn();
  
  
  /**
   * Sets the value of the ColumnClass field.
   */
  public void setColumnClass(java.lang.String value);
  
  
  /**
   * Sets the value of the ColumnName field.
   */
  public void setColumnName(java.lang.String value);
  
  
  /**
   * Sets the value of the ColumnOrder field.
   */
  public void setColumnOrder(java.lang.Integer value);
  
  
  /**
   * Sets the value of the CompareColumn field.
   */
  public void setCompareColumn(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the KeyColumn field.
   */
  public void setKeyColumn(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the UpgradeDBStorageSet field.
   */
  public void setUpgradeDBStorageSet(entity.UpgradeDBStorageSet value);
  
  
  public void setUpgradeDBStorageSetID(gw.pl.persistence.core.Key value);
  
  
  
}