package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Parameter.eti;Parameter.eix;Parameter.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ParameterInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire.pl.domain.parameter.impl.ParameterInternalMethods {
  /**
   * Gets the value of the ComponentType field.
   * Component defining the parameter, or null if it is a system-wide parameter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ComponentType getComponentType();
  
  
  /**
   * Gets the value of the DateValue field.
   * For a date or time parameter, the parameter value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateValue();
  
  
  /**
   * Gets the value of the IntValue field.
   * For an integer parameter, the parameter value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getIntValue();
  
  
  /**
   * Gets the value of the LongTextValue field.
   * For a long text parameter (clob), the parameter value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLongTextValue();
  
  
  /**
   * Gets the value of the ParameterName field.
   * Name of the parameter
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getParameterName();
  
  
  /**
   * Gets the value of the ParameterType field.
   * Identifies the value type (string, longtext, integer, boolean, or date).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ParameterType getParameterType();
  
  
  /**
   * Gets the value of the StringValue field.
   * For a string parameter, the parameter value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getStringValue();
  
  
  /**
   * Gets the value of the BooleanValue field.
   * For a boolean parameter, the parameter value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isBooleanValue();
  
  
  /**
   * Sets the value of the BooleanValue field.
   */
  public void setBooleanValue(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ComponentType field.
   */
  public void setComponentType(typekey.ComponentType value);
  
  
  /**
   * Sets the value of the DateValue field.
   */
  public void setDateValue(java.util.Date value);
  
  
  /**
   * Sets the value of the IntValue field.
   */
  public void setIntValue(java.lang.Integer value);
  
  
  /**
   * Sets the value of the LongTextValue field.
   */
  public void setLongTextValue(java.lang.String value);
  
  
  /**
   * Sets the value of the ParameterName field.
   */
  public void setParameterName(java.lang.String value);
  
  
  /**
   * Sets the value of the ParameterType field.
   */
  public void setParameterType(typekey.ParameterType value);
  
  
  /**
   * Sets the value of the StringValue field.
   */
  public void setStringValue(java.lang.String value);
  
  
  
}