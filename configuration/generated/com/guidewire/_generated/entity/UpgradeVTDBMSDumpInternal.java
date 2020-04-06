package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "UpgradeVTDBMSDump.eti;UpgradeVTDBMSDump.eix;UpgradeVTDBMSDump.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface UpgradeVTDBMSDumpInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire._generated.entity.TimedUpgraderObjectInternal, com.guidewire.pl.domain.upgrader.UpgradeVTDBMSDumpPublicMethods {
  /**
   * Gets the value of the Contents field.
   * query
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.lang.Blob getContents();
  
  
  /**
   * Gets the value of the UpgradeInstance field.
   * UpgradeInstance
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.UpgradeInstance getUpgradeInstance();
  
  
  public gw.pl.persistence.core.Key getUpgradeInstanceID();
  
  
  /**
   * Gets the value of the VersionActionName field.
   * Fully qualified name of version trigger to which this applies
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getVersionActionName();
  
  
  /**
   * Sets the value of the Contents field.
   */
  public void setContents(gw.lang.Blob value);
  
  
  /**
   * Sets the value of the UpgradeInstance field.
   */
  public void setUpgradeInstance(entity.UpgradeInstance value);
  
  
  public void setUpgradeInstanceID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the VersionActionName field.
   */
  public void setVersionActionName(java.lang.String value);
  
  
  
}