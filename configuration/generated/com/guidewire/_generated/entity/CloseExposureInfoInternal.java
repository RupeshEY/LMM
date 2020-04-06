package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CloseExposureInfo.eti;CloseExposureInfo.eix;CloseExposureInfo.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface CloseExposureInfoInternal extends com.guidewire._generated.entity.ExpCloseReopenInfoInternal, gw.cc.exposure.entity.CloseExposureInfo {
  /**
   * Gets the value of the outcome field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ExposureClosedOutcomeType getoutcome();
  
  
  /**
   * Sets the value of the outcome field.
   */
  public void setoutcome(typekey.ExposureClosedOutcomeType value);
  
  
  
}