package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "MatterCloseReopenInfo.eti;MatterCloseReopenInfo.eix;MatterCloseReopenInfo.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface MatterCloseReopenInfoInternal extends com.guidewire._generated.entity.CloseReopenInfoInternal, gw.cc.matter.entity.MatterCloseReopenInfo {
  /**
   * Gets the value of the Matter field.
   * Related matter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Matter getMatter();
  
  
  public gw.pl.persistence.core.Key getMatterID();
  
  
  /**
   * Sets the value of the Matter field.
   */
  public void setMatter(entity.Matter value);
  
  
  public void setMatterID(gw.pl.persistence.core.Key value);
  
  
  
}