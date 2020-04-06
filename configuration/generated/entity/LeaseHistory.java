package entity;

/**
 * LeaseHistory
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LeaseHistory.eti;LeaseHistory.eix;LeaseHistory.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface LeaseHistory extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.LeaseHistory> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.LeaseHistory>("entity.LeaseHistory");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ACQUIRED_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("Acquired", "Acquired");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATED_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("Created", "Created");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXPIREREQUESTED_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("ExpireRequested", "ExpireRequested");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXPIRED_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("Expired", "Expired");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LEASEOWNER_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("LeaseOwner", "LeaseOwner");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NAME_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("Name", "Name");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REPLACEMENTIDLSB_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("ReplacementIdLSB", "ReplacementIdLSB");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REPLACEMENTIDMSB_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("ReplacementIdMSB", "ReplacementIdMSB");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TERMINATED_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("Terminated", "Terminated");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TERMINATIONMESSAGE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("TerminationMessage", "TerminationMessage");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> TERMINATIONREASON_DYNPROP = new com.guidewire.commons.metadata.types.TypekeyDynPropertyInfo("TerminationReason", "TerminationReason");
  
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
  
  
  public java.util.UUID getReplacementId();
  
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getReplacementIdLSB();
  
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
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
  
  
  public void setReplacementId(java.util.UUID paramUUID);
  
  
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
  
  
  public void setUniqueId(java.util.UUID paramUUID);
  
  
  
}