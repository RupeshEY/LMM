package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "UpdateOp.eti;UpdateOp.eix;UpdateOp.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface UpdateOpInternal extends com.guidewire._generated.entity.VersionableInternal {
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.UpdateOp getSubtype();
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.UpdateOp value);
  
  
  
}