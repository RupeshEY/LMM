package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CloseReopenInfo.eti;CloseReopenInfo.eix;CloseReopenInfo.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface CloseReopenInfoInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.cc.domain.claim.impl.CloseReopenInfoInternal, gw.cc.claim.entity.CloseReopenInfo {
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CloseReopenInfo getSubtype();
  
  
  /**
   * Gets the value of the note field.
   * Comments on the action taken.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getnote();
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.CloseReopenInfo value);
  
  
  /**
   * Sets the value of the note field.
   */
  public void setnote(java.lang.String value);
  
  
  
}