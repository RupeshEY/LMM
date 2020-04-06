package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "UpgradeSchemaVersion.eti;UpgradeSchemaVersion.eix;UpgradeSchemaVersion.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface UpgradeSchemaVersionInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal {
  /**
   * Gets the value of the Name field.
   * Column for unique index
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the UpgradeSchemaVersion field.
   * Upgrade instrumentation schema version.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getUpgradeSchemaVersion();
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the UpgradeSchemaVersion field.
   */
  public void setUpgradeSchemaVersion(java.lang.Integer value);
  
  
  
}