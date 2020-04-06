package entity;

/**
 * CheckRecurrence
 * 
 *       Describes the frequency that Checks in a {@link RecurringCheck} are issued.
 *       Abstract supertype of {@link MonthlyCheckRecurrence} and {@link WeeklyCheckRecurrence}.
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CheckRecurrence.eti;CheckRecurrence.eix;CheckRecurrence.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public abstract class CheckRecurrence extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.Extractable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.CheckRecurrence> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.CheckRecurrence>("entity.CheckRecurrence");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchivePartition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CHECKSET_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CheckSet");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CHECKSETARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "CheckSetArray");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FIRSTDUEDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FirstDueDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ISSUANCEDATEOFFSET_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "IssuanceDateOffset");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NUMCHECKS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NumChecks");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> RECURRENCEDAY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "RecurrenceDay");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SUBTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Subtype");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.CheckRecurrenceInternal _internal;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  protected CheckRecurrence(java.lang.Void ignored)  {
    
  }
  
  protected abstract com.guidewire._generated.entity.CheckRecurrenceInternal __createInternalInterface();
  
  
  protected final com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
    if(_delegateManager == null) {
      _delegateManager  =  com.guidewire.pl.persistence.code.DelegateLoader.newInstance(this, __getDelegateMap());
    };
    return _delegateManager;
  }
  
  protected abstract com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap();
  
  
  protected com.guidewire._generated.entity.CheckRecurrenceInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  public void adjustDatesBasedOnIssuanceDateOffsetAndBusinessCalendar(java.util.Date[] dates, entity.CheckSet checkSet) {
    ((gw.cc.financials.check.entity.CheckRecurrence)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckRecurrence")).adjustDatesBasedOnIssuanceDateOffsetAndBusinessCalendar(dates, checkSet);
  }
  
  /**
   * Calculates what should be the first date of the recurrence based
   * on the recurrence values. This does not take into account
   * the 'Issue Early' value.
   */
  public java.util.Date calculateFirstRecurrenceDateBasedOnRecurrence() {
    return ((gw.cc.financials.check.entity.CheckRecurrence)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckRecurrence")).calculateFirstRecurrenceDateBasedOnRecurrence();
  }
  
  public void calculateSubsequentDatesBasedOnRecurrence(java.util.Date[] dates, int startingIndex) {
    ((gw.cc.financials.check.entity.CheckRecurrence)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckRecurrence")).calculateSubsequentDatesBasedOnRecurrence(dates, startingIndex);
  }
  
  /**
   * Creates a clone of this CheckRecurrence, either weekly or monthly as appropriate.  In either case
   * copies in critical base values, and also sets firstDueDate to next date in recurrence (After last
   * occurrence date of recurrence being copied).  If cloned check/checkgroup has exposure with service period, this
   * method also generates the proper service period for the new check(s).
   * @param newCheckSet 
   */
  public entity.CheckRecurrence cloneRecurrence(entity.CheckSet newCheckSet) {
    return ((gw.cc.financials.check.entity.CheckRecurrence)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckRecurrence")).cloneRecurrence(newCheckSet);
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getArchivePartition() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(ARCHIVEPARTITION_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the CheckSet field.
   * The CheckSet for which this CheckRecurrence defines the recurrence schedule
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CheckSet getCheckSet() {
    return (entity.CheckSet)__getInternalInterface().getFieldValue(CHECKSET_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CheckSet[] getCheckSetArray() {
    return (entity.CheckSet[])__getInternalInterface().getFieldValue(CHECKSETARRAY_PROP.get());
  }
  
  /**
   * Returns the checks in this recurrence, sorted by date.
   */
  public entity.Check[] getChecksSortedByDate() {
    return ((gw.cc.financials.check.entity.CheckRecurrence)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckRecurrence")).getChecksSortedByDate();
  }
  
  /**
   * Gets the value of the CreateTime field.
   * Timestamp when the object was created
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCreateTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(CREATETIME_PROP.get());
  }
  
  /**
   * Gets the value of the CreateUser field.
   * User who created the object
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getCreateUser() {
    return (entity.User)__getInternalInterface().getFieldValue(CREATEUSER_PROP.get());
  }
  
  /**
   * Returns a description of this recurrence.
   */
  public java.lang.String getDescription() {
    return ((gw.cc.financials.check.entity.CheckRecurrence)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckRecurrence")).getDescription();
  }
  
  /**
   * Gets the value of the FirstDueDate field.
   * Due date of the first check in the recurrence.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getFirstDueDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(FIRSTDUEDATE_PROP.get());
  }
  
  /**
   * Returns the first editable check in this recurrence.  In some cases the earliest check
   * is not editable even though the overall recurrence is editable.  This provides the
   * UI with the most appropriate check for modification.
   * @return The first check in this recurrence (by ScheduledSendDate) for which
   *         isEditable() returns TRUE
   */
  public entity.Check getFirstEditableCheck() {
    return ((gw.cc.financials.check.entity.CheckRecurrence)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckRecurrence")).getFirstEditableCheck();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the IssuanceDateOffset field.
   * Number of days before a check is due that it should be issued.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getIssuanceDateOffset() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(ISSUANCEDATEOFFSET_PROP.get());
  }
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(LOADCOMMANDID_PROP.get());
  }
  
  /**
   * Gets the value of the NumChecks field.
   * Number of checks in the recurrence.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNumChecks() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(NUMCHECKS_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Calculates the dates on which the checks in this recurrence should be sent.
   */
  public java.util.Date[] getRecurrenceDates() {
    return ((gw.cc.financials.check.entity.CheckRecurrence)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckRecurrence")).getRecurrenceDates();
  }
  
  /**
   * Gets the value of the RecurrenceDay field.
   * Day of the week the check is due.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RecurrenceDay getRecurrenceDay() {
    return (typekey.RecurrenceDay)__getInternalInterface().getFieldValue(RECURRENCEDAY_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getRetiredValue() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(RETIREDVALUE_PROP.get());
  }
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CheckRecurrence getSubtype() {
    return (typekey.CheckRecurrence)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
  }
  
  /**
   * The sum total of the net amounts of each of the checks in the recurrence.
   * <p>
   * Warning: if there are no checks in the recurrence, this method returns
   * a CurrencyAmount with 0 and null currency (dangerous to pass into "Strict" methods).
   */
  public gw.api.financials.CurrencyAmount getTotal() {
    return ((gw.cc.financials.check.entity.CheckRecurrence)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckRecurrence")).getTotal();
  }
  
  /**
   * Gets the total amount in the transaction currency paired with the amount in the reserving currency.
   */
  public gw.api.financials.CurrencyAmountPair getTotalPair() {
    return ((gw.cc.financials.check.entity.CheckRecurrence)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckRecurrence")).getTotalPair();
  }
  
  /**
   * Gets the value of the UpdateTime field.
   * Timestamp when the object was last updated
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getUpdateTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(UPDATETIME_PROP.get());
  }
  
  /**
   * Gets the value of the UpdateUser field.
   * User who last updated the object
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getUpdateUser() {
    return (entity.User)__getInternalInterface().getFieldValue(UPDATEUSER_PROP.get());
  }
  
  /**
   * Tests whether this recurrence contains any checks that are still editable.
   * <p/>
   * Note: For efficiency when dealing with large recurrences, if this bean is not
   * new, this method performs a query against the database. If you aren't worried about loading large recurrences
   * into the bundle, you can determine whether there are editable checks on a recurrence against the bundle
   * by evaluating EditableChecks and testing the length of the result.
   * @return <code>true</code> if the recurrence contains at least one editable
   * check, else <code>false</code>
   */
  public boolean hasEditableChecks() {
    return ((gw.cc.financials.check.entity.CheckRecurrence)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckRecurrence")).hasEditableChecks();
  }
  
  /**
   * 
   * @return true if this bean is to be inserted into the database when the bundle is committed.
   */
  public boolean isNew() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).isNew();
  }
  
  /**
   * 
   * @return True if the object was created by importation from an external system,
   *         False if it was created internally. Note that this refers to the currently
   *         instantiated object, not the data it represents
   */
  public boolean isNewlyImported() {
    return ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).isNewlyImported();
  }
  
  /**
   * 
   * @return True if the object has been retired from active use, false if the
   *         object is active.  Retireable objects are never deleted from a
   *         database table, instead they are retired by setting the retired
   *         column to the same value as the ID of the object.
   */
  public java.lang.Boolean isRetired() {
    return ((com.guidewire.pl.domain.persistence.core.RetireablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods")).isRetired();
  }
  
  /**
   * Refreshes this bean with the latest database version.
   * <p/>
   * This method does nothing if the bean is edited or inserted in its current bundle. If the bean
   * no longer exists in the database, then <tt>null</tt> is returned. If the bean has been
   * evicted from its bundle, then <tt>null</tt> is returned. Otherwise, this bean is returned, with its contents
   * updated.
   */
  public entity.KeyableBean refresh() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).refresh();
  }
  
  /**
   * Marks this bean for remove. A bean marked for remove will be deleted or retired when the transaction
   * is committed. Once a bean is marked for remove, it cannot be switched to update, edit, or read.
   * <p>
   * WARNING: This method is designed for simple custom entities which are normally not
   * associated with other entities. Undesirable results may occur when used on out-of-box entities.
   */
  public void remove() {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).remove();
  }
  
  /**
   * Sets the value of the ArchivePartition field.
   */
  private void setArchivePartition(java.lang.Long value) {
    __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CheckSet field.
   */
  private void setCheckSet(entity.CheckSet value) {
    __getInternalInterface().setFieldValue(CHECKSET_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CheckSetArray field.
   */
  private void setCheckSetArray(entity.CheckSet[] value) {
    __getInternalInterface().setFieldValue(CHECKSETARRAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CreateTime field.
   */
  private void setCreateTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(CREATETIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CreateUser field.
   */
  private void setCreateUser(entity.User value) {
    __getInternalInterface().setFieldValue(CREATEUSER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FirstDueDate field.
   */
  public void setFirstDueDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(FIRSTDUEDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the IssuanceDateOffset field.
   */
  public void setIssuanceDateOffset(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(ISSUANCEDATEOFFSET_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  private void setLoadCommandID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
  }
  
  /**
   * Set a flag denoting that the currently instantiated object has been newly imported from
   * an external source
   * @param newlyImported 
   */
  public void setNewlyImported(boolean newlyImported) {
    ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
  }
  
  /**
   * Sets the value of the NumChecks field.
   */
  public void setNumChecks(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(NUMCHECKS_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the RecurrenceDay field.
   */
  public void setRecurrenceDay(typekey.RecurrenceDay value) {
    __getInternalInterface().setFieldValue(RECURRENCEDAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RetiredValue field.
   */
  private void setRetiredValue(java.lang.Long value) {
    __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Subtype field.
   */
  private void setSubtype(typekey.CheckRecurrence value) {
    __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpdateTime field.
   */
  private void setUpdateTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(UPDATETIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpdateUser field.
   */
  private void setUpdateUser(entity.User value) {
    __getInternalInterface().setFieldValue(UPDATEUSER_PROP.get(), value);
  }
  
  /**
   * Set's the version of the bean to the next value (i.e. the bean version original value+1)
   * Multiple calls to this method on the same bean will result in the same value being used
   * for the version (i.e. it is idempotent).
   * 
   * Calling this method will force the bean to be written to the database and participate fully
   * in the commit cycle e.g. pre-update rules will be run, etc.
   */
  public void touch() {
    ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).touch();
  }
  
  static {
    com.guidewire._generated.entity.CheckRecurrenceInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.EntityFriendAccess<entity.CheckRecurrence, com.guidewire._generated.entity.CheckRecurrenceInternal>() {
      public java.lang.Object getImplementation(entity.CheckRecurrence bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.CheckRecurrenceInternal getInternalInterface(entity.CheckRecurrence bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      
    });
  }
}