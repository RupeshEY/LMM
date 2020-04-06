package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Sequence.eti;Sequence.eix;Sequence.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface SequenceInternal extends com.guidewire._generated.entity.VersionableInternal {
  /**
   * Gets the value of the SequenceKey field.
   * The sequence-key (name).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSequenceKey();
  
  
  /**
   * Gets the value of the SequenceNumber field.
   * The unique sequence-number for the key.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getSequenceNumber();
  
  
  /**
   * Sets the value of the SequenceKey field.
   */
  public void setSequenceKey(java.lang.String value);
  
  
  /**
   * Sets the value of the SequenceNumber field.
   */
  public void setSequenceNumber(java.lang.Long value);
  
  
  
}