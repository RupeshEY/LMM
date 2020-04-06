package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ReopenMatterInfo.eti;ReopenMatterInfo.eix;ReopenMatterInfo.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ReopenMatterInfoInternal extends com.guidewire._generated.entity.MatterCloseReopenInfoInternal, gw.cc.matter.entity.ReopenMatterInfo {
  /**
   * Gets the value of the reopenReason field.
   * The reason for reopening the matter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MatterReopenedReason getreopenReason();
  
  
  /**
   * Sets the value of the reopenReason field.
   */
  public void setreopenReason(typekey.MatterReopenedReason value);
  
  
  
}