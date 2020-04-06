package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RollingUpgradeConfig.eti;RollingUpgradeConfig.eix;RollingUpgradeConfig.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RollingUpgradeConfigInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal {
  /**
   * Gets the value of the config field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.lang.Blob getconfig();
  
  
  /**
   * Gets the value of the source field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean issource();
  
  
  /**
   * Sets the value of the config field.
   */
  public void setconfig(gw.lang.Blob value);
  
  
  /**
   * Sets the value of the source field.
   */
  public void setsource(java.lang.Boolean value);
  
  
  
}