package entity;

/**
 * Holiday
 * List of holidays.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Holiday.eti;Holiday.eix;Holiday.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "Holiday")
public class Holiday extends com.guidewire.pl.persistence.code.BeanBase implements entity.Versionable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.Holiday> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.Holiday>("entity.Holiday");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> APPLIESTOALLZONES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AppliesToAllZones");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> HOLIDAYTAGS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "HolidayTags");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> HOLIDAYZONES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "HolidayZones");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Name");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> NAME_L10N_ARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Name_L10N_ARRAY");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OCCURRENCEDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OccurrenceDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.HolidayInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public Holiday()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public Holiday(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected Holiday(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.HolidayInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected final com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
    if(_delegateManager == null) {
      _delegateManager  =  com.guidewire.pl.persistence.code.DelegateLoader.newInstance(this, __getDelegateMap());
    };
    return _delegateManager;
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.HolidayInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the HolidayTags array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToHolidayTags(entity.HolidayTag element) {
    __getInternalInterface().addArrayElement(HOLIDAYTAGS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the HolidayZones array. This is achieved by setting the parent foreign key to this entity instance.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void addToHolidayZones(entity.HolidayZone value) {
    ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).addToHolidayZones(value);
  }
  
  /**
   * If this region contains a zone of the given type and value? The string matching is case-insensitive
   * NOTE: this will not match if a zip+4 value is provided.  You must strip off the +4 before passing
   * to this method.
   * @param country 
   * @param zoneType the zone type, must not be null
   * @param zone the zone string, must not be null
   * @return true if the region containsZone a zone of the given type, false
   *         otherwise
   */
  public boolean containsZone(typekey.Country country, typekey.ZoneType zoneType, java.lang.String zone) {
    return ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).containsZone(country, zoneType, zone);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * The filter criteria, used for the region UI only.
   */
  public gw.api.admin.ZoneSearchCriteria getFilterCriteria() {
    return ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).getFilterCriteria();
  }
  
  /**
   * Gets the value of the HolidayTags field.
   * The tags that observe this holiday.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.HolidayTag[] getHolidayTags() {
    return (entity.HolidayTag[])__getInternalInterface().getFieldValue(HOLIDAYTAGS_PROP.get());
  }
  
  /**
   * Gets the value of the HolidayZones field.
   * The zones that observe this holiday.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.HolidayZone[] getHolidayZones() {
    return (entity.HolidayZone[])__getInternalInterface().getFieldValue(HOLIDAYZONES_PROP.get());
  }
  
  /**
   * This wraps the {@link #getHolidayZonesQuery(typekey.ZoneType)} method, converting
   * the result to an array of HolidayZone objects.
   * @param zt the zone type
   * @return region zones of the specified type.
   */
  public entity.HolidayZone[] getHolidayZones(typekey.ZoneType zt) {
    return ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).getHolidayZones(zt);
  }
  
  /**
   * This returns the set of HolidayZones of the specified type.
   * @param zt the zonetype to filter the HolidayZone objects by.
   * @return a queryprocessor of HolidayZone
   */
  public gw.api.database.IQueryBeanResult<entity.HolidayZone> getHolidayZonesQuery(typekey.ZoneType zt) {
    return ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).getHolidayZonesQuery(zt);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
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
   * Gets the value of the Name field.
   * The name of a holiday in the business calendar.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NAME_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Holiday_Name_L10N[] getName_L10N_ARRAY() {
    return (entity.Holiday_Name_L10N[])__getInternalInterface().getFieldValue(NAME_L10N_ARRAY_PROP.get());
  }
  
  /**
   * Array association accessor for key en_US on array Name_L10N_ARRAY
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName_en_US() {
    return (java.lang.String)__getInternalInterface().getLocalizedFieldValueForCodeGen((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("Name_en_US"));
  }
  
  /**
   * Gets the value of the OccurrenceDate field.
   * The date of a holiday in the business calendar.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getOccurrenceDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(OCCURRENCEDATE_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Returns the available holiday tags.
   * @return an array of the available holiday tags
   */
  public typekey.HolidayTagCode[] getTagRange() {
    return ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).getTagRange();
  }
  
  /**
   * Returns the holiday's tags.
   * @return an array of the holiday's tags
   */
  public typekey.HolidayTagCode[] getTagsArray() {
    return ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).getTagsArray();
  }
  
  /**
   * Returns the tags that observe this holiday.
   * @return a comma-separated string of the string codes of the tags that observe this holiday,
   *     in alphabetical order
   */
  public java.lang.String getTagsString() {
    return ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).getTagsString();
  }
  
  /**
   * An array of the region's zones.  If the filter criteria is set,
   * it filters the return set by the filter criteria.
   * @return an array of the zones that the region contains.
   */
  public java.lang.String[] getZoneCodes() {
    return ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).getZoneCodes();
  }
  
  /**
   * Returns an alphabetized arraylist of the zones covered by the given region.
   * Zones are represented as strings.  Strips leading and trailing whitespace.
   * @return a list of zones
   */
  public java.util.List getZoneList() {
    return ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).getZoneList();
  }
  
  /**
   * Returns an alphabetized arraylist of the zones covered by the given region.
   * Zones are represented as strings.  Strips leading and trailing whitespace.
   * @return a comma-separated list of zones
   */
  public java.lang.String getZones() {
    return ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).getZones();
  }
  
  /**
   * Gets the value of the AppliesToAllZones field.
   * True if this holiday applies to all zones (in which case HolidayZones should be empty). If false and HolidayZones has elements, this holiday applies to those zones.  If false and HolidayZones is empty, this holiday doesn't apply anywhere.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAppliesToAllZones() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(APPLIESTOALLZONES_PROP.get());
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
   * Removes the given element from the HolidayTags array. This is achieved by marking the element for removal.
   */
  public void removeFromHolidayTags(entity.HolidayTag element) {
    __getInternalInterface().removeArrayElement(HOLIDAYTAGS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the HolidayTags array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromHolidayTags(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(HOLIDAYTAGS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the HolidayZones array. This is achieved by marking the element for removal.
   */
  public void removeFromHolidayZones(entity.HolidayZone element) {
    __getInternalInterface().removeArrayElement(HOLIDAYZONES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the HolidayZones array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromHolidayZones(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(HOLIDAYZONES_PROP.get(), elementID);
  }
  
  /**
   * This will delete all null zones.
   */
  public void removeNullZones() {
    ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).removeNullZones();
  }
  
  /**
   * Sets the value of the AppliesToAllZones field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setAppliesToAllZones(java.lang.Boolean value) {
    ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).setAppliesToAllZones(value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * The filter criteria, used for the region UI only.
   * @param filterCriteria 
   */
  public void setFilterCriteria(gw.api.admin.ZoneSearchCriteria filterCriteria) {
    ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).setFilterCriteria(filterCriteria);
  }
  
  /**
   * Sets the value of the HolidayTags field.
   */
  public void setHolidayTags(entity.HolidayTag[] value) {
    __getInternalInterface().setFieldValue(HOLIDAYTAGS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the HolidayZones field.
   */
  public void setHolidayZones(entity.HolidayZone[] value) {
    __getInternalInterface().setFieldValue(HOLIDAYZONES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  private void setLoadCommandID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(NAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Name_L10N_ARRAY field.
   */
  private void setName_L10N_ARRAY(entity.Holiday_Name_L10N[] value) {
    __getInternalInterface().setFieldValue(NAME_L10N_ARRAY_PROP.get(), value);
  }
  
  /**
   * Array association mutator for key Name_ on array Name_L10N_ARRAY
   */
  public void setName_en_US(java.lang.String value) {
    __getInternalInterface().setLocalizedFieldValueForCodeGen((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("Name_en_US"), value);
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
   * Sets the value of the OccurrenceDate field.
   */
  public void setOccurrenceDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(OCCURRENCEDATE_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  public void setTagsArray(typekey.HolidayTagCode[] tags) {
    ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).setTagsArray(tags);
  }
  
  /**
   * Sets the tags that observe this holiday.
   * @param tagsString a comma-separated string of the string codes of the tags that observe this holiday
   */
  public void setTagsString(java.lang.String tagsString) {
    ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).setTagsString(tagsString);
  }
  
  public void setZoneCodes(java.lang.String[] zones) {
    ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).setZoneCodes(zones);
  }
  
  /**
   * Set the zones (comma-delimited list) for the region.
   * @param zones comman separated list of zones
   * @deprecated Use #setZoneCodes Holidays are heterogeneous therefore this method should not be used.
   */
  public void setZones(java.lang.String zones) {
    ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).setZones(zones);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.HolidayInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.Holiday.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the HolidayTags array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToHolidayTags(entity.HolidayTag element) {
      __getInternalInterface().addArrayElement(HOLIDAYTAGS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the HolidayZones array. This is achieved by setting the parent foreign key to this entity instance.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void addToHolidayZones(entity.HolidayZone value) {
      ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).addToHolidayZones(value);
    }
    
    /**
     * Adds the given element to the Name_L10N_ARRAY array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToName_L10N_ARRAY(entity.Holiday_Name_L10N element) {
      __getInternalInterface().addArrayElement(NAME_L10N_ARRAY_PROP.get(), element);
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
    }
    
    public java.lang.Integer calculateNextVersion() {
      return ((com.guidewire.pl.domain.persistence.core.impl.VersionableInternal)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal")).calculateNextVersion();
    }
    
    public java.util.List<entity.KeyableBean> cascadeDelete() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cascadeDelete();
    }
    
    public entity.KeyableBean cloneBeanForBundleTransfer() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cloneBeanForBundleTransfer();
    }
    
    /**
     * If this region contains a zone of the given type and value? The string matching is case-insensitive
     * NOTE: this will not match if a zip+4 value is provided.  You must strip off the +4 before passing
     * to this method.
     * @param country 
     * @param zoneType the zone type, must not be null
     * @param zone the zone string, must not be null
     * @return true if the region containsZone a zone of the given type, false
     *         otherwise
     */
    public boolean containsZone(typekey.Country country, typekey.ZoneType zoneType, java.lang.String zone) {
      return ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).containsZone(country, zoneType, zone);
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
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * The filter criteria, used for the region UI only.
     */
    public gw.api.admin.ZoneSearchCriteria getFilterCriteria() {
      return ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).getFilterCriteria();
    }
    
    /**
     * Gets the value of the HolidayTags field.
     * The tags that observe this holiday.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.HolidayTag[] getHolidayTags() {
      return (entity.HolidayTag[])__getInternalInterface().getFieldValue(HOLIDAYTAGS_PROP.get());
    }
    
    /**
     * Gets the value of the HolidayZones field.
     * The zones that observe this holiday.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.HolidayZone[] getHolidayZones() {
      return (entity.HolidayZone[])__getInternalInterface().getFieldValue(HOLIDAYZONES_PROP.get());
    }
    
    /**
     * This wraps the {@link #getHolidayZonesQuery(typekey.ZoneType)} method, converting
     * the result to an array of HolidayZone objects.
     * @param zt the zone type
     * @return region zones of the specified type.
     */
    public entity.HolidayZone[] getHolidayZones(typekey.ZoneType zt) {
      return ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).getHolidayZones(zt);
    }
    
    /**
     * This returns the set of HolidayZones of the specified type.
     * @param zt the zonetype to filter the HolidayZone objects by.
     * @return a queryprocessor of HolidayZone
     */
    public gw.api.database.IQueryBeanResult<entity.HolidayZone> getHolidayZonesQuery(typekey.ZoneType zt) {
      return ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).getHolidayZonesQuery(zt);
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
     * Gets the value of the LoadCommandID field.
     * LoadCommand for load where row was created. If not null this object was loaded via the loader.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getLoadCommandID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(LOADCOMMANDID_PROP.get());
    }
    
    /**
     * Gets the value of the Name field.
     * The name of a holiday in the business calendar.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NAME_PROP.get());
    }
    
    /**
     * Gets the value of the Name_L10N_ARRAY field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Holiday_Name_L10N[] getName_L10N_ARRAY() {
      return (entity.Holiday_Name_L10N[])__getInternalInterface().getFieldValue(NAME_L10N_ARRAY_PROP.get());
    }
    
    /**
     * Array association for partition Name_L10N_ARRAYByLanguage on array Name_L10N_ARRAY
     */
    public entity.Holiday_Name_L10N getName_L10N_ARRAYByLanguage(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property) {
      return (entity.Holiday_Name_L10N)__getInternalInterface().getAssociativeArrayValue(property);
    }
    
    /**
     * Gets the value of the OccurrenceDate field.
     * The date of a holiday in the business calendar.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getOccurrenceDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(OCCURRENCEDATE_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Returns the available holiday tags.
     * @return an array of the available holiday tags
     */
    public typekey.HolidayTagCode[] getTagRange() {
      return ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).getTagRange();
    }
    
    /**
     * Returns the holiday's tags.
     * @return an array of the holiday's tags
     */
    public typekey.HolidayTagCode[] getTagsArray() {
      return ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).getTagsArray();
    }
    
    /**
     * Returns the tags that observe this holiday.
     * @return a comma-separated string of the string codes of the tags that observe this holiday,
     *     in alphabetical order
     */
    public java.lang.String getTagsString() {
      return ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).getTagsString();
    }
    
    /**
     * An array of the region's zones.  If the filter criteria is set,
     * it filters the return set by the filter criteria.
     * @return an array of the zones that the region contains.
     */
    public java.lang.String[] getZoneCodes() {
      return ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).getZoneCodes();
    }
    
    /**
     * Returns an alphabetized arraylist of the zones covered by the given region.
     * Zones are represented as strings.  Strips leading and trailing whitespace.
     * @return a list of zones
     */
    public java.util.List getZoneList() {
      return ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).getZoneList();
    }
    
    /**
     * Returns an alphabetized arraylist of the zones covered by the given region.
     * Zones are represented as strings.  Strips leading and trailing whitespace.
     * @return a comma-separated list of zones
     */
    public java.lang.String getZones() {
      return ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).getZones();
    }
    
    public java.lang.String[] getZonesArray() {
      return ((com.guidewire.pl.domain.calendar.impl.HolidayInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.impl.HolidayInternalMethods")).getZonesArray();
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Gets the value of the AppliesToAllZones field.
     * True if this holiday applies to all zones (in which case HolidayZones should be empty). If false and HolidayZones has elements, this holiday applies to those zones.  If false and HolidayZones is empty, this holiday doesn't apply anywhere.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isAppliesToAllZones() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(APPLIESTOALLZONES_PROP.get());
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
     * Removes the given element from the HolidayTags array. This is achieved by marking the element for removal.
     */
    public void removeFromHolidayTags(entity.HolidayTag element) {
      __getInternalInterface().removeArrayElement(HOLIDAYTAGS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the HolidayTags array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromHolidayTags(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(HOLIDAYTAGS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the HolidayZones array. This is achieved by marking the element for removal.
     */
    public void removeFromHolidayZones(entity.HolidayZone element) {
      __getInternalInterface().removeArrayElement(HOLIDAYZONES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the HolidayZones array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromHolidayZones(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(HOLIDAYZONES_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Name_L10N_ARRAY array. This is achieved by marking the element for removal.
     */
    public void removeFromName_L10N_ARRAY(entity.Holiday_Name_L10N element) {
      __getInternalInterface().removeArrayElement(NAME_L10N_ARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Name_L10N_ARRAY array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromName_L10N_ARRAY(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(NAME_L10N_ARRAY_PROP.get(), elementID);
    }
    
    /**
     * This will delete all null zones.
     */
    public void removeNullZones() {
      ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).removeNullZones();
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    public void safeDelete() {
      ((com.guidewire.pl.domain.calendar.impl.HolidayInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.impl.HolidayInternalMethods")).safeDelete();
    }
    
    /**
     * Sets the value of the AppliesToAllZones field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setAppliesToAllZones(java.lang.Boolean value) {
      ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).setAppliesToAllZones(value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * The filter criteria, used for the region UI only.
     * @param filterCriteria 
     */
    public void setFilterCriteria(gw.api.admin.ZoneSearchCriteria filterCriteria) {
      ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).setFilterCriteria(filterCriteria);
    }
    
    /**
     * Sets the value of the HolidayTags field.
     */
    public void setHolidayTags(entity.HolidayTag[] value) {
      __getInternalInterface().setFieldValue(HOLIDAYTAGS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the HolidayZones field.
     */
    public void setHolidayZones(entity.HolidayZone[] value) {
      __getInternalInterface().setFieldValue(HOLIDAYZONES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
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
     * Sets the value of the Name field.
     */
    public void setName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(NAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Name_L10N_ARRAY field.
     */
    public void setName_L10N_ARRAY(entity.Holiday_Name_L10N[] value) {
      __getInternalInterface().setFieldValue(NAME_L10N_ARRAY_PROP.get(), value);
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
     * Sets the value of the OccurrenceDate field.
     */
    public void setOccurrenceDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(OCCURRENCEDATE_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    public void setTagsArray(typekey.HolidayTagCode[] tags) {
      ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).setTagsArray(tags);
    }
    
    /**
     * Sets the tags that observe this holiday.
     * @param tagsString a comma-separated string of the string codes of the tags that observe this holiday
     */
    public void setTagsString(java.lang.String tagsString) {
      ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).setTagsString(tagsString);
    }
    
    public void setZoneCodes(java.lang.String[] zones) {
      ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).setZoneCodes(zones);
    }
    
    /**
     * Set the zones (comma-delimited list) for the region.
     * @param zones comman separated list of zones
     * @deprecated Use #setZoneCodes Holidays are heterogeneous therefore this method should not be used.
     */
    public void setZones(java.lang.String zones) {
      ((com.guidewire.pl.domain.calendar.HolidayPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.HolidayPublicMethods")).setZones(zones);
    }
    
    public void setZonesFromCodes(java.lang.String[] zoneCodes) {
      ((com.guidewire.pl.domain.calendar.impl.HolidayInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.impl.HolidayInternalMethods")).setZonesFromCodes(zoneCodes);
    }
    
    public void setZonesFromCodes(java.util.Set<java.lang.String> zoneCodes) {
      ((com.guidewire.pl.domain.calendar.impl.HolidayInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.impl.HolidayInternalMethods")).setZonesFromCodes(zoneCodes);
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
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.calendar.HolidayPublicMethods", "com.guidewire.pl.domain.calendar.impl.HolidayImpl");
    config.put("com.guidewire.pl.domain.calendar.impl.HolidayInternalMethods", "com.guidewire.pl.domain.calendar.impl.HolidayImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.Holiday.class, config);
    com.guidewire._generated.entity.HolidayInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.Holiday, com.guidewire._generated.entity.HolidayInternal>() {
      public java.lang.Object getImplementation(entity.Holiday bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.HolidayInternal getInternalInterface(entity.Holiday bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.Holiday newEmptyInstance() {
        return new entity.Holiday((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}