package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ReopenExposureInfo.eti;ReopenExposureInfo.eix;ReopenExposureInfo.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ReopenExposureInfoInternal extends com.guidewire._generated.entity.ExpCloseReopenInfoInternal, gw.cc.exposure.entity.ReopenExposureInfo {
  /**
   * Gets the value of the reopenReason field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ExposureReopenedReason getreopenReason();
  
  
  /**
   * Sets the value of the reopenReason field.
   */
  public void setreopenReason(typekey.ExposureReopenedReason value);
  
  
  
}