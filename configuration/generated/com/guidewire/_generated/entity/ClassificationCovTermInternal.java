package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClassificationCovTerm.eti;ClassificationCovTerm.eix;ClassificationCovTerm.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClassificationCovTermInternal extends com.guidewire._generated.entity.CovTermInternal, gw.cc.policy.entity.ClassificationCovTerm {
  /**
   * Gets the value of the Code field.
   * Classification code
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCode();
  
  
  /**
   * Gets the value of the Description field.
   * Classification description
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Sets the value of the Code field.
   */
  public void setCode(java.lang.String value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  
}