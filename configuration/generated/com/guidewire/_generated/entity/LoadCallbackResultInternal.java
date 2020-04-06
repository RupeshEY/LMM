package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LoadCallbackResult.eti;LoadCallbackResult.eix;LoadCallbackResult.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface LoadCallbackResultInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire._generated.entity.TimedLoaderObjectInternal, com.guidewire._generated.entity.OrdereddLoaderObjectInternal {
  /**
   * Gets the value of the AffectedRowCount field.
   * Number of rows affected.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getAffectedRowCount();
  
  
  /**
   * Gets the value of the LoadCallback field.
   * Parent.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadCallback getLoadCallback();
  
  
  public gw.pl.persistence.core.Key getLoadCallbackID();
  
  
  /**
   * Gets the value of the Name field.
   * Name of loader callback result.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the SQLText field.
   * SQL text.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSQLText();
  
  
  /**
   * Sets the value of the AffectedRowCount field.
   */
  public void setAffectedRowCount(java.lang.Integer value);
  
  
  /**
   * Sets the value of the LoadCallback field.
   */
  public void setLoadCallback(entity.LoadCallback value);
  
  
  public void setLoadCallbackID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the SQLText field.
   */
  public void setSQLText(java.lang.String value);
  
  
  
}