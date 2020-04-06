package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Lease.eti;Lease.eix;Lease.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface LeaseInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, com.guidewire.pl.domain.lease.LeasePublicMethods {
  /**
   * Gets the value of the Acquired field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getAcquired();
  
  
  /**
   * Gets the value of the Created field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getCreated();
  
  
  /**
   * Gets the value of the Exclusivity field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getExclusivity();
  
  
  /**
   * Gets the value of the ExpireRequested field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getExpireRequested();
  
  
  /**
   * Gets the value of the Expired field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getExpired();
  
  
  /**
   * Gets the value of the FailoverState field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.FailoverState getFailoverState();
  
  
  /**
   * Gets the value of the InitialArguments field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.lang.Blob getInitialArguments();
  
  
  /**
   * Gets the value of the LeaseOwner field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLeaseOwner();
  
  
  /**
   * Gets the value of the Name field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the Released field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getReleased();
  
  
  /**
   * Gets the value of the RetryFailover field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getRetryFailover();
  
  
  /**
   * Gets the value of the TransferRequested field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getTransferRequested();
  
  
  /**
   * Gets the value of the TransferTarget field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTransferTarget();
  
  
  /**
   * Gets the value of the UniqueIdLSB field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getUniqueIdLSB();
  
  
  /**
   * Gets the value of the UniqueIdMSB field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getUniqueIdMSB();
  
  
  /**
   * Sets the value of the Acquired field.
   */
  public void setAcquired(java.lang.Long value);
  
  
  /**
   * Sets the value of the Created field.
   */
  public void setCreated(java.lang.Long value);
  
  
  /**
   * Sets the value of the Exclusivity field.
   */
  public void setExclusivity(java.lang.Long value);
  
  
  /**
   * Sets the value of the ExpireRequested field.
   */
  public void setExpireRequested(java.lang.Long value);
  
  
  /**
   * Sets the value of the Expired field.
   */
  public void setExpired(java.lang.Long value);
  
  
  /**
   * Sets the value of the FailoverState field.
   */
  public void setFailoverState(typekey.FailoverState value);
  
  
  /**
   * Sets the value of the InitialArguments field.
   */
  public void setInitialArguments(gw.lang.Blob value);
  
  
  /**
   * Sets the value of the LeaseOwner field.
   */
  public void setLeaseOwner(java.lang.String value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the Released field.
   */
  public void setReleased(java.lang.Long value);
  
  
  /**
   * Sets the value of the RetryFailover field.
   */
  public void setRetryFailover(java.lang.Long value);
  
  
  /**
   * Sets the value of the TransferRequested field.
   */
  public void setTransferRequested(java.lang.Long value);
  
  
  /**
   * Sets the value of the TransferTarget field.
   */
  public void setTransferTarget(java.lang.String value);
  
  
  /**
   * Sets the value of the UniqueIdLSB field.
   */
  public void setUniqueIdLSB(java.lang.Long value);
  
  
  /**
   * Sets the value of the UniqueIdMSB field.
   */
  public void setUniqueIdMSB(java.lang.Long value);
  
  
  
}