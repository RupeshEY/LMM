package entity;

/**
 * WeeklyCheckRecurrence
 * A weekly recurrence schedule. Subtype of CheckRecurrence.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "WeeklyCheckRecurrence.eti;WeeklyCheckRecurrence.eix;WeeklyCheckRecurrence.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "WeeklyCheckRecurrence")
public class WeeklyCheckRecurrence extends entity.CheckRecurrence {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.WeeklyCheckRecurrence> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.WeeklyCheckRecurrence>("entity.WeeklyCheckRecurrence");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WEEKLYFREQUENCY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WeeklyFrequency");
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public WeeklyCheckRecurrence()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public WeeklyCheckRecurrence(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected WeeklyCheckRecurrence(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected com.guidewire._generated.entity.WeeklyCheckRecurrenceInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.WeeklyCheckRecurrenceInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.WeeklyCheckRecurrenceInternal)super.__getInternalInterface();
  }
  
  /**
   * Gets the value of the WeeklyFrequency field.
   * A check is made every n week(s).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getWeeklyFrequency() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(WEEKLYFREQUENCY_PROP.get());
  }
  
  /**
   * Sets the value of the WeeklyFrequency field.
   */
  public void setWeeklyFrequency(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(WEEKLYFREQUENCY_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.WeeklyCheckRecurrenceInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.WeeklyCheckRecurrence.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the CheckSetArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToCheckSetArray(entity.CheckSet element) {
      __getInternalInterface().addArrayElement(CHECKSETARRAY_PROP.get(), element);
    }
    
    public void adjustDatesBasedOnIssuanceDateOffsetAndBusinessCalendar(java.util.Date[] dates, entity.CheckSet checkSet) {
      ((gw.cc.financials.check.entity.CheckRecurrence)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckRecurrence")).adjustDatesBasedOnIssuanceDateOffsetAndBusinessCalendar(dates, checkSet);
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
    }
    
    /**
     * Calculates what should be the first date of the recurrence based
     * on the recurrence values. This does not take into account
     * the 'Issue Early' value.
     */
    public java.util.Date calculateFirstRecurrenceDateBasedOnRecurrence() {
      return ((gw.cc.financials.check.entity.CheckRecurrence)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckRecurrence")).calculateFirstRecurrenceDateBasedOnRecurrence();
    }
    
    public java.lang.Integer calculateNextVersion() {
      return ((com.guidewire.pl.domain.persistence.core.impl.VersionableInternal)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal")).calculateNextVersion();
    }
    
    public void calculateSubsequentDatesBasedOnRecurrence(java.util.Date[] dates, int startingIndex) {
      ((gw.cc.financials.check.entity.CheckRecurrence)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckRecurrence")).calculateSubsequentDatesBasedOnRecurrence(dates, startingIndex);
    }
    
    public java.util.List<entity.KeyableBean> cascadeDelete() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cascadeDelete();
    }
    
    public entity.KeyableBean cloneBeanForBundleTransfer() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cloneBeanForBundleTransfer();
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
    
    public entity.CheckRecurrence cloneSubtypeFields(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckRecurrenceInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckRecurrenceInternal")).cloneSubtypeFields(bundle);
    }
    
    public void delete() {
      ((com.guidewire.cc.domain.financials.check.impl.CheckRecurrenceInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckRecurrenceInternal")).delete();
    }
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateInsertEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateInsertEventsInternal();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateRemoveEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateRemoveEventsInternal();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateUpdateEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateUpdateEventsInternal();
    }
    
    /**
     * Gets the value of the ArchivePartition field.
     * Unique number to partition the data so that the multiple workers can work independently
     */
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
     * Gets the value of the CheckSetArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.CheckSet[] getCheckSetArray() {
      return (entity.CheckSet[])__getInternalInterface().getFieldValue(CHECKSETARRAY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getCheckSetID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CHECKSET_PROP.get());
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
    
    public gw.pl.persistence.core.Key getCreateUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CREATEUSER_PROP.get());
    }
    
    /**
     * Returns a description of this recurrence.
     */
    public java.lang.String getDescription() {
      return ((gw.cc.financials.check.entity.CheckRecurrence)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckRecurrence")).getDescription();
    }
    
    public entity.Check[] getEditableChecks() {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckRecurrenceInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckRecurrenceInternal")).getEditableChecks();
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
    
    public gw.pl.persistence.core.Key getIdToSetForForeignKey(gw.entity.ILinkPropertyInfo link) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).getIdToSetForForeignKey(link);
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
    
    public int getNumUneditableChecks() {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckRecurrenceInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckRecurrenceInternal")).getNumUneditableChecks();
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
    
    public java.util.Date[] getRecurrenceDates(entity.CheckSet checkSet) {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckRecurrenceInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckRecurrenceInternal")).getRecurrenceDates(checkSet);
    }
    
    public java.util.Date[] getRecurrenceDatesInternal(entity.CheckSet checkSet) {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckRecurrenceInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckRecurrenceInternal")).getRecurrenceDatesInternal(checkSet);
    }
    
    /**
     * Gets the value of the RecurrenceDay field.
     * Day of the week the check is due.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.RecurrenceDay getRecurrenceDay() {
      return (typekey.RecurrenceDay)__getInternalInterface().getFieldValue(RECURRENCEDAY_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
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
    
    public java.util.Date[] getUnadjustedRecurrenceDates() {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckRecurrenceInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckRecurrenceInternal")).getUnadjustedRecurrenceDates();
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
    
    public gw.pl.persistence.core.Key getUpdateUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(UPDATEUSER_PROP.get());
    }
    
    /**
     * Gets the value of the WeeklyFrequency field.
     * A check is made every n week(s).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getWeeklyFrequency() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(WEEKLYFREQUENCY_PROP.get());
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
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
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
    
    public boolean isOkToRetire() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).isOkToRetire();
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
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    public entity.KeyableBean overrideBundleAdd(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleAdd(bundle);
    }
    
    public entity.KeyableBean overrideBundleRemove(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleRemove(bundle);
    }
    
    public void putInBundle() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).putInBundle();
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
    
    public entity.KeyableBean reload(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).reload(bundle);
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
     * Removes the given element from the CheckSetArray array. This is achieved by marking the element for removal.
     */
    public void removeFromCheckSetArray(entity.CheckSet element) {
      __getInternalInterface().removeArrayElement(CHECKSETARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the CheckSetArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromCheckSetArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CHECKSETARRAY_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the ArchivePartition field.
     */
    public void setArchivePartition(java.lang.Long value) {
      __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
    }
    
    public void setAsUnapproved() {
      ((com.guidewire.cc.domain.financials.check.impl.CheckRecurrenceInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckRecurrenceInternal")).setAsUnapproved();
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CheckSet field.
     */
    public void setCheckSet(entity.CheckSet value) {
      __getInternalInterface().setFieldValue(CHECKSET_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CheckSetArray field.
     */
    public void setCheckSetArray(entity.CheckSet[] value) {
      __getInternalInterface().setFieldValue(CHECKSETARRAY_PROP.get(), value);
    }
    
    public void setCheckSetID(gw.pl.persistence.core.Key value) {
      setFieldValue(CHECKSET_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CreateTime field.
     */
    public void setCreateTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(CREATETIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CreateUser field.
     */
    public void setCreateUser(entity.User value) {
      __getInternalInterface().setFieldValue(CREATEUSER_PROP.get(), value);
    }
    
    public void setCreateUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(CREATEUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FirstDueDate field.
     */
    public void setFirstDueDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(FIRSTDUEDATE_PROP.get(), value);
    }
    
    public int setFirstOneOrTwoDates(java.util.Date[] dates, java.util.Date calculatedFirstDate) {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckRecurrenceInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckRecurrenceInternal")).setFirstOneOrTwoDates(dates, calculatedFirstDate);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the IssuanceDateOffset field.
     */
    public void setIssuanceDateOffset(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(ISSUANCEDATEOFFSET_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Sets the value of the LoadCommandID field.
     */
    public void setLoadCommandID(java.lang.Long value) {
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
    
    public void setRetired() {
      ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).setRetired();
    }
    
    /**
     * Sets the value of the RetiredValue field.
     */
    public void setRetiredValue(java.lang.Long value) {
      __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Subtype field.
     */
    public void setSubtype(typekey.CheckRecurrence value) {
      __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UpdateTime field.
     */
    public void setUpdateTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(UPDATETIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UpdateUser field.
     */
    public void setUpdateUser(entity.User value) {
      __getInternalInterface().setFieldValue(UPDATEUSER_PROP.get(), value);
    }
    
    public void setUpdateUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(UPDATEUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WeeklyFrequency field.
     */
    public void setWeeklyFrequency(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(WEEKLYFREQUENCY_PROP.get(), value);
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
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.cc.domain.financials.check.impl.CheckRecurrenceInternal", "com.guidewire.cc.domain.financials.check.impl.CheckRecurrenceImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractEditableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.financials.check.entity.CheckRecurrence", "com.guidewire.cc.domain.financials.check.impl.WeeklyCheckRecurrenceImpl");
    config.put("gw.cc.financials.check.entity.WeeklyCheckRecurrence", "com.guidewire.cc.domain.financials.check.impl.WeeklyCheckRecurrenceImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.WeeklyCheckRecurrence.class, config);
    com.guidewire._generated.entity.WeeklyCheckRecurrenceInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.WeeklyCheckRecurrence, com.guidewire._generated.entity.WeeklyCheckRecurrenceInternal>() {
      public java.lang.Object getImplementation(entity.WeeklyCheckRecurrence bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.WeeklyCheckRecurrenceInternal getInternalInterface(entity.WeeklyCheckRecurrence bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.WeeklyCheckRecurrence newEmptyInstance() {
        return new entity.WeeklyCheckRecurrence((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}