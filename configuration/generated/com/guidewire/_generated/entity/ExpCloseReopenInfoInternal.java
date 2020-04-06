package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ExpCloseReopenInfo.eti;ExpCloseReopenInfo.eix;ExpCloseReopenInfo.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ExpCloseReopenInfoInternal extends com.guidewire._generated.entity.CloseReopenInfoInternal, gw.cc.exposure.entity.ExpCloseReopenInfo {
  /**
   * Gets the value of the Exposure field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure getExposure();
  
  
  public gw.pl.persistence.core.Key getExposureID();
  
  
  /**
   * Sets the value of the Exposure field.
   */
  public void setExposure(entity.Exposure value);
  
  
  public void setExposureID(gw.pl.persistence.core.Key value);
  
  
  
}