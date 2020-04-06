package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LeaseHistory.eti;LeaseHistory.eix;LeaseHistory.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface LeaseHistoryInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, com.guidewire.pl.domain.lease.LeaseHistoryPublicMethods {
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
   * Gets the value of the ReplacementIdLSB field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getReplacementIdLSB();
  
  
  /**
   * Gets the value of the ReplacementIdMSB field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getReplacementIdMSB();
  
  
  /**
   * Gets the value of the Terminated field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getTerminated();
  
  
  /**
   * Gets the value of the TerminationMessage field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTerminationMessage();
  
  
  /**
   * Gets the value of the TerminationReason field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LeaseTerminationReason getTerminationReason();
  
  
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
   * Sets the value of the ExpireRequested field.
   */
  public void setExpireRequested(java.lang.Long value);
  
  
  /**
   * Sets the value of the Expired field.
   */
  public void setExpired(java.lang.Long value);
  
  
  /**
   * Sets the value of the LeaseOwner field.
   */
  public void setLeaseOwner(java.lang.String value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the ReplacementIdLSB field.
   */
  public void setReplacementIdLSB(java.lang.Long value);
  
  
  /**
   * Sets the value of the ReplacementIdMSB field.
   */
  public void setReplacementIdMSB(java.lang.Long value);
  
  
  /**
   * Sets the value of the Terminated field.
   */
  public void setTerminated(java.lang.Long value);
  
  
  /**
   * Sets the value of the TerminationMessage field.
   */
  public void setTerminationMessage(java.lang.String value);
  
  
  /**
   * Sets the value of the TerminationReason field.
   */
  public void setTerminationReason(typekey.LeaseTerminationReason value);
  
  
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