package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Extractable.eti;Extractable.eix;Extractable.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ExtractableInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal {
  /**
   * Gets the value of the ArchivePartition field.
   * Unique number to partition the data so that the multiple workers can work independently
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getArchivePartition();
  
  
  /**
   * Sets the value of the ArchivePartition field.
   */
  public void setArchivePartition(java.lang.Long value);
  
  
  
}