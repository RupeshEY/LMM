package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RangeCriterionConfig.eti;RangeCriterionConfig.eix;RangeCriterionConfig.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RangeCriterionConfigInternal extends com.guidewire._generated.entity.MultiArgCriterionConfigInternal, com.guidewire.cc.system.dynaction.config.RangeValues {
  /**
   * Gets the value of the EndInclusive field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isEndInclusive();
  
  
  /**
   * Gets the value of the StartInclusive field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isStartInclusive();
  
  
  /**
   * Sets the value of the EndInclusive field.
   */
  public void setEndInclusive(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the StartInclusive field.
   */
  public void setStartInclusive(java.lang.Boolean value);
  
  
  
}