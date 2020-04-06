package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CriterionValue.eti;CriterionValue.eix;CriterionValue.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface CriterionValueInternal extends com.guidewire._generated.entity.EditableInternal, com.guidewire.cc.system.dynaction.config.ExpressionValueSelector {
  /**
   * Gets the value of the DateTimeValue field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateTimeValue();
  
  
  /**
   * Gets the value of the DecimalValue field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getDecimalValue();
  
  
  /**
   * Gets the value of the EnumType field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEnumType();
  
  
  /**
   * Gets the value of the EnumValue field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEnumValue();
  
  
  /**
   * Gets the value of the IntegerValue field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getIntegerValue();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the LockingColumn field.
   * Meaningless column for locking
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLockingColumn();
  
  
  /**
   * Gets the value of the StringValue field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getStringValue();
  
  
  /**
   * Gets the value of the ValueOwner field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BaseCriterionConfig getValueOwner();
  
  
  public gw.pl.persistence.core.Key getValueOwnerID();
  
  
  /**
   * Gets the value of the BooleanValue field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isBooleanValue();
  
  
  /**
   * Gets the value of the RangeFlag field.
   * Flag for range values
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isRangeFlag();
  
  
  /**
   * Sets the value of the BooleanValue field.
   */
  public void setBooleanValue(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the DateTimeValue field.
   */
  public void setDateTimeValue(java.util.Date value);
  
  
  /**
   * Sets the value of the DecimalValue field.
   */
  public void setDecimalValue(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the EnumType field.
   */
  public void setEnumType(java.lang.String value);
  
  
  /**
   * Sets the value of the EnumValue field.
   */
  public void setEnumValue(java.lang.String value);
  
  
  /**
   * Sets the value of the IntegerValue field.
   */
  public void setIntegerValue(java.lang.Integer value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the LockingColumn field.
   */
  public void setLockingColumn(java.lang.Integer value);
  
  
  /**
   * Sets the value of the RangeFlag field.
   */
  public void setRangeFlag(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the StringValue field.
   */
  public void setStringValue(java.lang.String value);
  
  
  /**
   * Sets the value of the ValueOwner field.
   */
  public void setValueOwner(entity.BaseCriterionConfig value);
  
  
  public void setValueOwnerID(gw.pl.persistence.core.Key value);
  
  
  
}