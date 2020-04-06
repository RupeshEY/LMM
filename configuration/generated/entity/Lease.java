package entity;

/**
 * Lease
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Lease.eti;Lease.eix;Lease.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface Lease extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.Lease> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.Lease>("entity.Lease");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ACQUIRED_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("Acquired", "Acquired");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATED_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("Created", "Created");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXCLUSIVITY_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("Exclusivity", "Exclusivity");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXPIREREQUESTED_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("ExpireRequested", "ExpireRequested");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXPIRED_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("Expired", "Expired");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> FAILOVERSTATE_DYNPROP = new com.guidewire.commons.metadata.types.TypekeyDynPropertyInfo("FailoverState", "FailoverState");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INITIALARGUMENTS_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("InitialArguments", "InitialArguments");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LEASEOWNER_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("LeaseOwner", "LeaseOwner");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NAME_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("Name", "Name");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RELEASED_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("Released", "Released");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETRYFAILOVER_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("RetryFailover", "RetryFailover");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TRANSFERREQUESTED_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("TransferRequested", "TransferRequested");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TRANSFERTARGET_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("TransferTarget", "TransferTarget");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UNIQUEIDLSB_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("UniqueIdLSB", "UniqueIdLSB");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UNIQUEIDMSB_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("UniqueIdMSB", "UniqueIdMSB");
  
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
  
  
  public java.util.UUID getUniqueId();
  
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getUniqueIdLSB();
  
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
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
  
  
  public void setUniqueId(java.util.UUID paramUUID);
  
  
  
}