package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CloseMatterInfo.eti;CloseMatterInfo.eix;CloseMatterInfo.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface CloseMatterInfoInternal extends com.guidewire._generated.entity.MatterCloseReopenInfoInternal, gw.cc.matter.entity.CloseMatterInfo {
  /**
   * Gets the value of the resolution field.
   * The type of resolution.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ResolutionType getresolution();
  
  
  /**
   * Sets the value of the resolution field.
   */
  public void setresolution(typekey.ResolutionType value);
  
  
  
}