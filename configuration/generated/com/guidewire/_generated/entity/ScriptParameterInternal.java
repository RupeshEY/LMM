package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ScriptParameter.eti;ScriptParameter.eix;ScriptParameter.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ScriptParameterInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire.pl.domain.scriptparameter.ScriptParameterPublicMethods, com.guidewire.pl.domain.scriptparameter.impl.ScriptParameterInternalMethods, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.UpdateCallback {
  /**
   * Gets the value of the DatetimeValue field.
   * Value if the parameter type is Datetime.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDatetimeValue();
  
  
  /**
   * Gets the value of the DecimalValue field.
   * Value if the parameter type is Decimal.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDecimalValue();
  
  
  /**
   * Gets the value of the Group field.
   * Group value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getGroup();
  
  
  public gw.pl.persistence.core.Key getGroupID();
  
  
  /**
   * Gets the value of the IntegerValue field.
   * Value if the parameter type is Int.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getIntegerValue();
  
  
  /**
   * Gets the value of the MoneyValue field.
   * Value if the parameter type is Money.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getMoneyValue();
  
  
  /**
   * Gets the value of the MonthlyfrequencyValue field.
   * Value if the parameter type is Monthly frequency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getMonthlyfrequencyValue();
  
  
  /**
   * Gets the value of the NonnegativeintegerValue field.
   * Value if the parameter type is a Non-negative integer.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNonnegativeintegerValue();
  
  
  /**
   * Gets the value of the NonnegativemoneyValue field.
   * Value if the parameter type is Non-negative money.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getNonnegativemoneyValue();
  
  
  /**
   * Gets the value of the ParameterName field.
   * Name of the parameter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getParameterName();
  
  
  /**
   * Gets the value of the ParameterType field.
   * Identifies the value type (string, integer, boolean, date, etc).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ScriptParameterType getParameterType();
  
  
  /**
   * Gets the value of the PercentageValue field.
   * Value if the parameter type is Percentage.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getPercentageValue();
  
  
  /**
   * Gets the value of the PercentagedecValue field.
   * Value if the parameter type is Percentagedec.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPercentagedecValue();
  
  
  /**
   * Gets the value of the PhoneValue field.
   * Value if the parameter type is Phone.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPhoneValue();
  
  
  /**
   * Gets the value of the PositiveintegerValue field.
   * Value if the parameter type is Positive integer.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getPositiveintegerValue();
  
  
  /**
   * Gets the value of the PositivemoneyValue field.
   * Value if the parameter type is Positive money.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPositivemoneyValue();
  
  
  /**
   * Gets the value of the PostalCodeValue field.
   * Value if the parameter type is PostalCode.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPostalCodeValue();
  
  
  /**
   * Gets the value of the RiskValue field.
   * Value if the parameter type is Risk.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getRiskValue();
  
  
  /**
   * Gets the value of the SpeedValue field.
   * Value if the parameter type is Speed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSpeedValue();
  
  
  /**
   * Gets the value of the User field.
   * User that created the script parameter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getUser();
  
  
  public gw.pl.persistence.core.Key getUserID();
  
  
  /**
   * Gets the value of the VarcharValue field.
   * Value if the parameter type is Varchar (i.e. String).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getVarcharValue();
  
  
  /**
   * Gets the value of the WeeklyfrequencyValue field.
   * Value if the parameter type is Weekly frequency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getWeeklyfrequencyValue();
  
  
  /**
   * Gets the value of the YearValue field.
   * Value if the parameter type is Year.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getYearValue();
  
  
  /**
   * Gets the value of the BitValue field.
   * Value if the parameter type is Bit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isBitValue();
  
  
  /**
   * Sets the value of the BitValue field.
   */
  public void setBitValue(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the DatetimeValue field.
   */
  public void setDatetimeValue(java.util.Date value);
  
  
  /**
   * Sets the value of the DecimalValue field.
   */
  public void setDecimalValue(java.lang.String value);
  
  
  /**
   * Sets the value of the Group field.
   */
  public void setGroup(entity.Group value);
  
  
  public void setGroupID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the IntegerValue field.
   */
  public void setIntegerValue(java.lang.Integer value);
  
  
  /**
   * Sets the value of the MoneyValue field.
   */
  public void setMoneyValue(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the MonthlyfrequencyValue field.
   */
  public void setMonthlyfrequencyValue(java.lang.Integer value);
  
  
  /**
   * Sets the value of the NonnegativeintegerValue field.
   */
  public void setNonnegativeintegerValue(java.lang.Integer value);
  
  
  /**
   * Sets the value of the NonnegativemoneyValue field.
   */
  public void setNonnegativemoneyValue(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the ParameterName field.
   */
  public void setParameterName(java.lang.String value);
  
  
  /**
   * Sets the value of the ParameterType field.
   */
  public void setParameterType(typekey.ScriptParameterType value);
  
  
  /**
   * Sets the value of the PercentageValue field.
   */
  public void setPercentageValue(java.lang.Integer value);
  
  
  /**
   * Sets the value of the PercentagedecValue field.
   */
  public void setPercentagedecValue(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the PhoneValue field.
   */
  public void setPhoneValue(java.lang.String value);
  
  
  /**
   * Sets the value of the PositiveintegerValue field.
   */
  public void setPositiveintegerValue(java.lang.Integer value);
  
  
  /**
   * Sets the value of the PositivemoneyValue field.
   */
  public void setPositivemoneyValue(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the PostalCodeValue field.
   */
  public void setPostalCodeValue(java.lang.String value);
  
  
  /**
   * Sets the value of the RiskValue field.
   */
  public void setRiskValue(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the SpeedValue field.
   */
  public void setSpeedValue(java.lang.Integer value);
  
  
  /**
   * Sets the value of the User field.
   */
  public void setUser(entity.User value);
  
  
  public void setUserID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the VarcharValue field.
   */
  public void setVarcharValue(java.lang.String value);
  
  
  /**
   * Sets the value of the WeeklyfrequencyValue field.
   */
  public void setWeeklyfrequencyValue(java.lang.Integer value);
  
  
  /**
   * Sets the value of the YearValue field.
   */
  public void setYearValue(java.lang.Integer value);
  
  
  
}