package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AddressDeleteWorkItem.eti;AddressDeleteWorkItem.eix;AddressDeleteWorkItem.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface AddressDeleteWorkItemInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire._generated.entity.WorkItemInternal, com.guidewire.pl.domain.workqueue.WorkItemPublicMethods, com.guidewire.pl.domain.workqueue.impl.WorkItemInternalMethods {
  /**
   * Gets the value of the AddressPublicID field.
   * The public ID of the Address we want to delete.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddressPublicID();
  
  
  /**
   * Sets the value of the AddressPublicID field.
   */
  public void setAddressPublicID(java.lang.String value);
  
  
  
}