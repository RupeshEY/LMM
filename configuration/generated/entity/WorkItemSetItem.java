package entity;

/**
 * WorkItemSetItem
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "WorkItemSetItem.eti;WorkItemSetItem.eix;WorkItemSetItem.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface WorkItemSetItem extends entity.WorkItem {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.WorkItemSetItem> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.WorkItemSetItem>("entity.WorkItemSetItem");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WORKDONE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("WorkDone", "WorkDone");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WORKITEMSETID_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("WorkItemSetID", "WorkItemSetID");
  
  /**
   * Postpone work item for later retrial
   * @param availableSince The time to retry work item
   * @param now Current time (used to update LastUpdateTime timestamp).
   * @deprecated This method is not intended to be accessed directly and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void checkIn(java.util.Date availableSince, java.util.Date now);
  
  
  /**
   * Check out a work item. The progressInterval is used to calculate
   * the AvailableSince date to set (checkoutTime + 2 * progressInterval).
   * The AvailableSince date is used to find orphans.
   * @param checkoutTime The time of check out
   * @param instanceNumber The instance number of the worker doing the check out
   * @param progressInterval progress interval
   * @deprecated This method is not intended to be accessed directly and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void checkOut(java.util.Date checkoutTime, int instanceNumber, long progressInterval);
  
  
  /**
   * Fail work item
   * @param failDate The time of failure
   * @param exception optional exception string. If <code>null</code> exception field on the work item
   *                  is not modified (current value will be preserved).
   * @deprecated This method is not intended to be accessed directly and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void fail(java.util.Date failDate, java.lang.String exception);
  
  
  /**
   * Return AvailableSince as Date value. May be <code>null</code>
   * @return AvailableSince as Date value
   */
  public java.util.Date getAvailableSinceAsDate();
  
  
  /**
   * Return AvailableSince as Long value. May be <code>null</code>
   * @return AvailableSince as Long value
   */
  public java.lang.Long getAvailableSinceAsLong();
  
  
  /**
   * Return that number of retries, i.e. Attempts - 1.
   * Added for backward compatibility.
   * @return number of retries of the work item.
   */
  public java.lang.Integer getNumRetries();
  
  
  /**
   * Return {@link ProcessHistory} that may be <code>null</code>
   * @return {@link entity.ProcessHistory} that may be <code>null</code>
   */
  public entity.ProcessHistory getProcessHistory();
  
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getWorkItemSetID();
  
  
  /**
   * Initialize a work item. Call this method after setting all other fields on the work item.
   * The method sets work item creation time, last update time, and processing time according to work item priority.
   */
  public void initialize();
  
  
  /**
   * Initialize a work item. Call this method after setting all other fields on the work item.
   * The method sets work item creation time, last update time, and processing time according to work item priority.
   * @param now Current time (used to update LastUpdateTime timestamp).
   * @deprecated Replaced by {@link #initialize()} and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void initialize(java.util.Date now);
  
  
  /**
   * Gets the value of the WorkDone field.
   * The work item is done flag.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isWorkDone();
  
  
  /**
   * Sets AvailableSince.
   * @param val AvailableSince. May be <code>null</code>
   */
  public void setAvailableSinceAsLong(java.lang.Long val);
  
  
  /**
   * Sets the value of the WorkDone field.
   */
  public void setWorkDone(java.lang.Boolean value);
  
  
  
}