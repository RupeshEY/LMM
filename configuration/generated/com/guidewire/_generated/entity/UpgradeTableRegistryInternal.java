package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "UpgradeTableRegistry.eti;UpgradeTableRegistry.eix;UpgradeTableRegistry.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface UpgradeTableRegistryInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Gets the value of the IDNameAfterUpgrade field.
   * Table registry entry after upgrade
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getIDNameAfterUpgrade();
  
  
  /**
   * Gets the value of the IDNameBeforeUpgrade field.
   * Table registry entry before upgrade
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getIDNameBeforeUpgrade();
  
  
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
   * Sets the value of the IDNameAfterUpgrade field.
   */
  public void setIDNameAfterUpgrade(java.lang.String value);
  
  
  /**
   * Sets the value of the IDNameBeforeUpgrade field.
   */
  public void setIDNameBeforeUpgrade(java.lang.String value);
  
  
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