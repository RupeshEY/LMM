package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "BatchProcessLeaseHistory.eti;BatchProcessLeaseHistory.eix;BatchProcessLeaseHistory.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface BatchProcessLeaseHistoryInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire._generated.entity.LeaseHistoryInternal {
  /**
   * Gets the value of the LockingColumn field.
   * Meaningless column for locking
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLockingColumn();
  
  
  /**
   * Sets the value of the LockingColumn field.
   */
  public void setLockingColumn(java.lang.Integer value);
  
  
  
}