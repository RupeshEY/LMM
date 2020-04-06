package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LoadIntegrityCheck.eti;LoadIntegrityCheck.eix;LoadIntegrityCheck.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface LoadIntegrityCheckInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire._generated.entity.TimedLoaderObjectInternal, com.guidewire._generated.entity.OrdereddLoaderObjectInternal, com.guidewire.pl.domain.staging.LoadIntegrityCheckPublicMethods {
  /**
   * Gets the value of the Description field.
   * Description of integrity check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the LoadCommand field.
   * Denorm FK for unique index.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadCommand getLoadCommand();
  
  
  public gw.pl.persistence.core.Key getLoadCommandID();
  
  
  /**
   * Gets the value of the LoadIntegrityCheckType field.
   * Type of loader integrity check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LoadErrorType getLoadIntegrityCheckType();
  
  
  /**
   * Gets the value of the LoadOperation field.
   * Parent.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadOperation getLoadOperation();
  
  
  public gw.pl.persistence.core.Key getLoadOperationID();
  
  
  /**
   * Gets the value of the Query field.
   * Query from integrity check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getQuery();
  
  
  /**
   * Gets the value of the ThreadName field.
   * Thread name.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getThreadName();
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the LoadCommand field.
   */
  public void setLoadCommand(entity.LoadCommand value);
  
  
  public void setLoadCommandID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadIntegrityCheckType field.
   */
  public void setLoadIntegrityCheckType(typekey.LoadErrorType value);
  
  
  /**
   * Sets the value of the LoadOperation field.
   */
  public void setLoadOperation(entity.LoadOperation value);
  
  
  public void setLoadOperationID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Query field.
   */
  public void setQuery(java.lang.String value);
  
  
  /**
   * Sets the value of the ThreadName field.
   */
  public void setThreadName(java.lang.String value);
  
  
  
}