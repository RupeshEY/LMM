package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LoadError.eti;LoadError.eix;LoadError.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface LoadErrorInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, com.guidewire.pl.domain.staging.LoadErrorPublicMethods {
  /**
   * Gets the value of the ErrorID field.
   * Load error ID, to ensure uniqueness.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getErrorID();
  
  
  /**
   * Gets the value of the ErrorMessage field.
   * Description of the failure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getErrorMessage();
  
  
  /**
   * Gets the value of the LoadErrorType field.
   * Type of load error event.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LoadErrorType getLoadErrorType();
  
  
  /**
   * Gets the value of the Query field.
   * Query run to detect the failure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getQuery();
  
  
  /**
   * Gets the value of the TableName field.
   * Name of the staging table, if applicable.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTableName();
  
  
  /**
   * Sets the value of the ErrorID field.
   */
  public void setErrorID(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ErrorMessage field.
   */
  public void setErrorMessage(java.lang.String value);
  
  
  /**
   * Sets the value of the LoadErrorType field.
   */
  public void setLoadErrorType(typekey.LoadErrorType value);
  
  
  /**
   * Sets the value of the Query field.
   */
  public void setQuery(java.lang.String value);
  
  
  /**
   * Sets the value of the TableName field.
   */
  public void setTableName(java.lang.String value);
  
  
  
}