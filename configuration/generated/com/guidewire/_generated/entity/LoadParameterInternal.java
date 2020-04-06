package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LoadParameter.eti;LoadParameter.eix;LoadParameter.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface LoadParameterInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Gets the value of the LoadCommand field.
   * Parent.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadCommand getLoadCommand();
  
  
  public gw.pl.persistence.core.Key getLoadCommandID();
  
  
  /**
   * Gets the value of the ParameterName field.
   * Parameter name.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getParameterName();
  
  
  /**
   * Gets the value of the ParameterValue field.
   * Parameter value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getParameterValue();
  
  
  /**
   * Sets the value of the LoadCommand field.
   */
  public void setLoadCommand(entity.LoadCommand value);
  
  
  public void setLoadCommandID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ParameterName field.
   */
  public void setParameterName(java.lang.String value);
  
  
  /**
   * Sets the value of the ParameterValue field.
   */
  public void setParameterValue(java.lang.String value);
  
  
  
}