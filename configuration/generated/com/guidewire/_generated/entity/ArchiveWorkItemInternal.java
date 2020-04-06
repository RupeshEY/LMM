package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ArchiveWorkItem.eti;ArchiveWorkItem.eix;ArchiveWorkItem.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ArchiveWorkItemInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire._generated.entity.WorkItemInternal {
  /**
   * Gets the value of the Item field.
   * Soft foreign key to the item to be processed for archive.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getItem();
  
  
  /**
   * Sets the value of the Item field.
   */
  public void setItem(java.lang.Long value);
  
  
  
}