package entity;

/**
 * BusinessWeek
 * List of businessweeks.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "BusinessWeek.eti;BusinessWeek.eix;BusinessWeek.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "BusinessWeek")
public class BusinessWeek extends com.guidewire.pl.persistence.code.BeanBase implements entity.Versionable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.BusinessWeek> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.BusinessWeek>("entity.BusinessWeek");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> APPLIESTOALLZONES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AppliesToAllZones");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BUSINESSDAYDEMARCATION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BusinessDayDemarcation");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> BUSINESSWEEKEND_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "BusinessWeekEnd");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> BUSINESSWEEKZONES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "BusinessWeekZones");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FRIDAYBUSINESSDAY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FridayBusinessDay");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FRIDAYBUSINESSEND_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FridayBusinessEnd");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FRIDAYBUSINESSSTART_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FridayBusinessStart");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MONDAYBUSINESSDAY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MondayBusinessDay");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MONDAYBUSINESSEND_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MondayBusinessEnd");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MONDAYBUSINESSSTART_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MondayBusinessStart");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Name");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> NAME_L10N_ARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Name_L10N_ARRAY");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SATURDAYBUSINESSDAY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SaturdayBusinessDay");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SATURDAYBUSINESSEND_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SaturdayBusinessEnd");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SATURDAYBUSINESSSTART_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SaturdayBusinessStart");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SUNDAYBUSINESSDAY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SundayBusinessDay");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SUNDAYBUSINESSEND_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SundayBusinessEnd");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SUNDAYBUSINESSSTART_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SundayBusinessStart");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> THURSDAYBUSINESSDAY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ThursdayBusinessDay");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> THURSDAYBUSINESSEND_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ThursdayBusinessEnd");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> THURSDAYBUSINESSSTART_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ThursdayBusinessStart");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TUESDAYBUSINESSDAY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TuesdayBusinessDay");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TUESDAYBUSINESSEND_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TuesdayBusinessEnd");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TUESDAYBUSINESSSTART_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TuesdayBusinessStart");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WEDNESDAYBUSINESSDAY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WednesdayBusinessDay");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WEDNESDAYBUSINESSEND_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WednesdayBusinessEnd");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WEDNESDAYBUSINESSSTART_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WednesdayBusinessStart");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.BusinessWeekInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public BusinessWeek()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public BusinessWeek(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected BusinessWeek(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.BusinessWeekInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.BusinessWeekInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the BusinessWeekZones array. This is achieved by setting the parent foreign key to this entity instance.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void addToBusinessWeekZones(entity.BusinessWeekZone value) {
    ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).addToBusinessWeekZones(value);
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
    return ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).containsZone(country, zoneType, zone);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the BusinessDayDemarcation field.
   * Demarcation of the business day
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getBusinessDayDemarcation() {
    return (java.util.Date)__getInternalInterface().getFieldValue(BUSINESSDAYDEMARCATION_PROP.get());
  }
  
  /**
   * Gets the value of the BusinessWeekEnd field.
   * What day the business week ends.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Weekdays getBusinessWeekEnd() {
    return (typekey.Weekdays)__getInternalInterface().getFieldValue(BUSINESSWEEKEND_PROP.get());
  }
  
  /**
   * Gets the value of the BusinessWeekZones field.
   * The zones that observe this businessweek.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BusinessWeekZone[] getBusinessWeekZones() {
    return (entity.BusinessWeekZone[])__getInternalInterface().getFieldValue(BUSINESSWEEKZONES_PROP.get());
  }
  
  /**
   * This wraps the {@link #getBusinessWeekZonesQuery(typekey.ZoneType)} method, converting
   * the result to an array of BusinessWeekZone objects.
   * @param zt the zone type
   * @return region zones of the specified type.
   */
  public entity.BusinessWeekZone[] getBusinessWeekZones(typekey.ZoneType zt) {
    return ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).getBusinessWeekZones(zt);
  }
  
  /**
   * This returns the set of BusinessWeekZones of the specified type.
   * @param zt the zonetype to filter the BusinessWeekZone objects by.
   * @return a queryprocessor of BusinessWeekZone
   */
  public gw.api.database.IQueryBeanResult<entity.BusinessWeekZone> getBusinessWeekZonesQuery(typekey.ZoneType zt) {
    return ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).getBusinessWeekZonesQuery(zt);
  }
  
  /**
   * The filter criteria, used for the region UI only.
   */
  public gw.api.admin.ZoneSearchCriteria getFilterCriteria() {
    return ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).getFilterCriteria();
  }
  
  /**
   * Gets the value of the FridayBusinessEnd field.
   * End of business day on Friday.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getFridayBusinessEnd() {
    return (java.util.Date)__getInternalInterface().getFieldValue(FRIDAYBUSINESSEND_PROP.get());
  }
  
  /**
   * Gets the value of the FridayBusinessStart field.
   * Start of business day on Friday.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getFridayBusinessStart() {
    return (java.util.Date)__getInternalInterface().getFieldValue(FRIDAYBUSINESSSTART_PROP.get());
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
   * Gets the value of the MondayBusinessEnd field.
   * End of business day on Monday.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getMondayBusinessEnd() {
    return (java.util.Date)__getInternalInterface().getFieldValue(MONDAYBUSINESSEND_PROP.get());
  }
  
  /**
   * Gets the value of the MondayBusinessStart field.
   * Start of business day on Monday.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getMondayBusinessStart() {
    return (java.util.Date)__getInternalInterface().getFieldValue(MONDAYBUSINESSSTART_PROP.get());
  }
  
  /**
   * Gets the value of the Name field.
   * The name of a businessweek in the business calendar.
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
  public entity.BusinessWeek_Name_L10N[] getName_L10N_ARRAY() {
    return (entity.BusinessWeek_Name_L10N[])__getInternalInterface().getFieldValue(NAME_L10N_ARRAY_PROP.get());
  }
  
  /**
   * Array association accessor for key en_US on array Name_L10N_ARRAY
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName_en_US() {
    return (java.lang.String)__getInternalInterface().getLocalizedFieldValueForCodeGen((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("Name_en_US"));
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the SaturdayBusinessEnd field.
   * End of business day on Saturday.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getSaturdayBusinessEnd() {
    return (java.util.Date)__getInternalInterface().getFieldValue(SATURDAYBUSINESSEND_PROP.get());
  }
  
  /**
   * Gets the value of the SaturdayBusinessStart field.
   * Start of business day on Saturday.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getSaturdayBusinessStart() {
    return (java.util.Date)__getInternalInterface().getFieldValue(SATURDAYBUSINESSSTART_PROP.get());
  }
  
  /**
   * Gets the value of the SundayBusinessEnd field.
   * End of business day on Sunday.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getSundayBusinessEnd() {
    return (java.util.Date)__getInternalInterface().getFieldValue(SUNDAYBUSINESSEND_PROP.get());
  }
  
  /**
   * Gets the value of the SundayBusinessStart field.
   * Start of business day on Sunday.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getSundayBusinessStart() {
    return (java.util.Date)__getInternalInterface().getFieldValue(SUNDAYBUSINESSSTART_PROP.get());
  }
  
  /**
   * Gets the value of the ThursdayBusinessEnd field.
   * End of business day on Thursday.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getThursdayBusinessEnd() {
    return (java.util.Date)__getInternalInterface().getFieldValue(THURSDAYBUSINESSEND_PROP.get());
  }
  
  /**
   * Gets the value of the ThursdayBusinessStart field.
   * Start of business day on Thursday.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getThursdayBusinessStart() {
    return (java.util.Date)__getInternalInterface().getFieldValue(THURSDAYBUSINESSSTART_PROP.get());
  }
  
  /**
   * Gets the value of the TuesdayBusinessEnd field.
   * End of business day on Tuesday.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getTuesdayBusinessEnd() {
    return (java.util.Date)__getInternalInterface().getFieldValue(TUESDAYBUSINESSEND_PROP.get());
  }
  
  /**
   * Gets the value of the TuesdayBusinessStart field.
   * Start of business day on Tuesday.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getTuesdayBusinessStart() {
    return (java.util.Date)__getInternalInterface().getFieldValue(TUESDAYBUSINESSSTART_PROP.get());
  }
  
  /**
   * Gets the value of the WednesdayBusinessEnd field.
   * End of business day on Wednesday.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getWednesdayBusinessEnd() {
    return (java.util.Date)__getInternalInterface().getFieldValue(WEDNESDAYBUSINESSEND_PROP.get());
  }
  
  /**
   * Gets the value of the WednesdayBusinessStart field.
   * Start of business day on Wednesday.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getWednesdayBusinessStart() {
    return (java.util.Date)__getInternalInterface().getFieldValue(WEDNESDAYBUSINESSSTART_PROP.get());
  }
  
  /**
   * An array of the region's zones.  If the filter criteria is set,
   * it filters the return set by the filter criteria.
   * @return an array of the zones that the region contains.
   */
  public java.lang.String[] getZoneCodes() {
    return ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).getZoneCodes();
  }
  
  /**
   * Returns an alphabetized arraylist of the zones covered by the given region.
   * Zones are represented as strings.  Strips leading and trailing whitespace.
   * @return a list of zones
   */
  public java.util.List getZoneList() {
    return ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).getZoneList();
  }
  
  /**
   * Returns an alphabetized arraylist of the zones covered by the given region.
   * Zones are represented as strings.  Strips leading and trailing whitespace.
   * @return a comma-separated list of zones
   */
  public java.lang.String getZones() {
    return ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).getZones();
  }
  
  /**
   * Gets the value of the AppliesToAllZones field.
   * True if this businessweek applies to all zones (in which case BusinessWeekZones should be empty). If false and BusinessWeekZones has elements, this businessweek applies to those zones.  If false and BusinessWeekZones is empty, this businessweek doesn't apply anywhere.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAppliesToAllZones() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(APPLIESTOALLZONES_PROP.get());
  }
  
  /**
   * Gets the value of the FridayBusinessDay field.
   * Is Friday a business day.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isFridayBusinessDay() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(FRIDAYBUSINESSDAY_PROP.get());
  }
  
  /**
   * Gets the value of the MondayBusinessDay field.
   * Is Monday a business day.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isMondayBusinessDay() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(MONDAYBUSINESSDAY_PROP.get());
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
   * Gets the value of the SaturdayBusinessDay field.
   * Is Saturday a business day.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isSaturdayBusinessDay() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(SATURDAYBUSINESSDAY_PROP.get());
  }
  
  /**
   * Gets the value of the SundayBusinessDay field.
   * Is Sunday a business day.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isSundayBusinessDay() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(SUNDAYBUSINESSDAY_PROP.get());
  }
  
  /**
   * Gets the value of the ThursdayBusinessDay field.
   * Is Thursday a business day.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isThursdayBusinessDay() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(THURSDAYBUSINESSDAY_PROP.get());
  }
  
  /**
   * Gets the value of the TuesdayBusinessDay field.
   * Is Tuesday a business day.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isTuesdayBusinessDay() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(TUESDAYBUSINESSDAY_PROP.get());
  }
  
  /**
   * Gets the value of the WednesdayBusinessDay field.
   * Is Wednesday a business day.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isWednesdayBusinessDay() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(WEDNESDAYBUSINESSDAY_PROP.get());
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
   * Removes the given element from the BusinessWeekZones array. This is achieved by marking the element for removal.
   */
  public void removeFromBusinessWeekZones(entity.BusinessWeekZone element) {
    __getInternalInterface().removeArrayElement(BUSINESSWEEKZONES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the BusinessWeekZones array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromBusinessWeekZones(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(BUSINESSWEEKZONES_PROP.get(), elementID);
  }
  
  /**
   * This will delete all null zones.
   */
  public void removeNullZones() {
    ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).removeNullZones();
  }
  
  /**
   * Sets the value of the AppliesToAllZones field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setAppliesToAllZones(java.lang.Boolean value) {
    ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).setAppliesToAllZones(value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BusinessDayDemarcation field.
   */
  public void setBusinessDayDemarcation(java.util.Date value) {
    __getInternalInterface().setFieldValue(BUSINESSDAYDEMARCATION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BusinessWeekEnd field.
   */
  public void setBusinessWeekEnd(typekey.Weekdays value) {
    __getInternalInterface().setFieldValue(BUSINESSWEEKEND_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BusinessWeekZones field.
   */
  public void setBusinessWeekZones(entity.BusinessWeekZone[] value) {
    __getInternalInterface().setFieldValue(BUSINESSWEEKZONES_PROP.get(), value);
  }
  
  /**
   * The filter criteria, used for the region UI only.
   * @param filterCriteria 
   */
  public void setFilterCriteria(gw.api.admin.ZoneSearchCriteria filterCriteria) {
    ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).setFilterCriteria(filterCriteria);
  }
  
  /**
   * Sets the value of the FridayBusinessDay field.
   */
  public void setFridayBusinessDay(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(FRIDAYBUSINESSDAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FridayBusinessEnd field.
   */
  public void setFridayBusinessEnd(java.util.Date value) {
    __getInternalInterface().setFieldValue(FRIDAYBUSINESSEND_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FridayBusinessStart field.
   */
  public void setFridayBusinessStart(java.util.Date value) {
    __getInternalInterface().setFieldValue(FRIDAYBUSINESSSTART_PROP.get(), value);
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
   * Sets the value of the MondayBusinessDay field.
   */
  public void setMondayBusinessDay(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(MONDAYBUSINESSDAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MondayBusinessEnd field.
   */
  public void setMondayBusinessEnd(java.util.Date value) {
    __getInternalInterface().setFieldValue(MONDAYBUSINESSEND_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MondayBusinessStart field.
   */
  public void setMondayBusinessStart(java.util.Date value) {
    __getInternalInterface().setFieldValue(MONDAYBUSINESSSTART_PROP.get(), value);
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
  private void setName_L10N_ARRAY(entity.BusinessWeek_Name_L10N[] value) {
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
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the SaturdayBusinessDay field.
   */
  public void setSaturdayBusinessDay(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(SATURDAYBUSINESSDAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SaturdayBusinessEnd field.
   */
  public void setSaturdayBusinessEnd(java.util.Date value) {
    __getInternalInterface().setFieldValue(SATURDAYBUSINESSEND_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SaturdayBusinessStart field.
   */
  public void setSaturdayBusinessStart(java.util.Date value) {
    __getInternalInterface().setFieldValue(SATURDAYBUSINESSSTART_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SundayBusinessDay field.
   */
  public void setSundayBusinessDay(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(SUNDAYBUSINESSDAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SundayBusinessEnd field.
   */
  public void setSundayBusinessEnd(java.util.Date value) {
    __getInternalInterface().setFieldValue(SUNDAYBUSINESSEND_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SundayBusinessStart field.
   */
  public void setSundayBusinessStart(java.util.Date value) {
    __getInternalInterface().setFieldValue(SUNDAYBUSINESSSTART_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ThursdayBusinessDay field.
   */
  public void setThursdayBusinessDay(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(THURSDAYBUSINESSDAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ThursdayBusinessEnd field.
   */
  public void setThursdayBusinessEnd(java.util.Date value) {
    __getInternalInterface().setFieldValue(THURSDAYBUSINESSEND_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ThursdayBusinessStart field.
   */
  public void setThursdayBusinessStart(java.util.Date value) {
    __getInternalInterface().setFieldValue(THURSDAYBUSINESSSTART_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TuesdayBusinessDay field.
   */
  public void setTuesdayBusinessDay(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(TUESDAYBUSINESSDAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TuesdayBusinessEnd field.
   */
  public void setTuesdayBusinessEnd(java.util.Date value) {
    __getInternalInterface().setFieldValue(TUESDAYBUSINESSEND_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TuesdayBusinessStart field.
   */
  public void setTuesdayBusinessStart(java.util.Date value) {
    __getInternalInterface().setFieldValue(TUESDAYBUSINESSSTART_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WednesdayBusinessDay field.
   */
  public void setWednesdayBusinessDay(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(WEDNESDAYBUSINESSDAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WednesdayBusinessEnd field.
   */
  public void setWednesdayBusinessEnd(java.util.Date value) {
    __getInternalInterface().setFieldValue(WEDNESDAYBUSINESSEND_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WednesdayBusinessStart field.
   */
  public void setWednesdayBusinessStart(java.util.Date value) {
    __getInternalInterface().setFieldValue(WEDNESDAYBUSINESSSTART_PROP.get(), value);
  }
  
  public void setZoneCodes(java.lang.String[] zones) {
    ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).setZoneCodes(zones);
  }
  
  /**
   * Set the zones (comma-delimited list) for the region.
   * @param zones comman separated list of zones
   * @deprecated use #setZoneCodes BusinessWeeks are heterogeneous therefore this method should not be used.
   */
  public void setZones(java.lang.String zones) {
    ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).setZones(zones);
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
  
  /**
   * 
   * @return an error message String if the day demarcation is during business hours
   */
  public java.lang.String validateBusinessDayDemarcation() {
    return ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).validateBusinessDayDemarcation();
  }
  
  /**
   * 
   * @return an error message String if FridayBusinessEnd is before FridayBusinessStart
   */
  public java.lang.String validateFridayStartAndEndTimes() {
    return ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).validateFridayStartAndEndTimes();
  }
  
  /**
   * 
   * @return an error message String if MondayBusinessEnd is before MondayBusinessStart
   */
  public java.lang.String validateMondayStartAndEndTimes() {
    return ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).validateMondayStartAndEndTimes();
  }
  
  /**
   * 
   * @return an error message String if the name is used by another BusinessWeek
   */
  public java.lang.String validateName() {
    return ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).validateName();
  }
  
  /**
   * 
   * @return an error message String if this BusinessWeek's AppliesToAllZones is set to true, and there are other BusinessWeek's that have AppliesToAllZones set to true
   */
  public java.lang.String validateOnlyOneBusinessWeekAppliesToAll() {
    return ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).validateOnlyOneBusinessWeekAppliesToAll();
  }
  
  /**
   * 
   * @return an error message String if SaturdayBusinessEnd is before SaturdayBusinessStart
   */
  public java.lang.String validateSaturdayStartAndEndTimes() {
    return ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).validateSaturdayStartAndEndTimes();
  }
  
  /**
   * 
   * @return an error message String if SundayBusinessEnd is before SundayBusinessStart
   */
  public java.lang.String validateSundayStartAndEndTimes() {
    return ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).validateSundayStartAndEndTimes();
  }
  
  /**
   * 
   * @return an error message String if ThursdayBusinessEnd is before ThursdayBusinessStart
   */
  public java.lang.String validateThursdayStartAndEndTimes() {
    return ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).validateThursdayStartAndEndTimes();
  }
  
  /**
   * 
   * @return an error message String if TuesdayBusinessEnd is before TuesdayBusinessStart
   */
  public java.lang.String validateTuesdayStartAndEndTimes() {
    return ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).validateTuesdayStartAndEndTimes();
  }
  
  /**
   * 
   * @return an error message String if WednesdayBusinessEnd is before WednesdayBusinessStart
   */
  public java.lang.String validateWednesdayStartAndEndTimes() {
    return ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).validateWednesdayStartAndEndTimes();
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.BusinessWeekInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.BusinessWeek.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the BusinessWeekZones array. This is achieved by setting the parent foreign key to this entity instance.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void addToBusinessWeekZones(entity.BusinessWeekZone value) {
      ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).addToBusinessWeekZones(value);
    }
    
    /**
     * Adds the given element to the Name_L10N_ARRAY array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToName_L10N_ARRAY(entity.BusinessWeek_Name_L10N element) {
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
      return ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).containsZone(country, zoneType, zone);
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
     * Gets the value of the BusinessDayDemarcation field.
     * Demarcation of the business day
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getBusinessDayDemarcation() {
      return (java.util.Date)__getInternalInterface().getFieldValue(BUSINESSDAYDEMARCATION_PROP.get());
    }
    
    /**
     * Gets the value of the BusinessWeekEnd field.
     * What day the business week ends.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Weekdays getBusinessWeekEnd() {
      return (typekey.Weekdays)__getInternalInterface().getFieldValue(BUSINESSWEEKEND_PROP.get());
    }
    
    /**
     * Gets the value of the BusinessWeekZones field.
     * The zones that observe this businessweek.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.BusinessWeekZone[] getBusinessWeekZones() {
      return (entity.BusinessWeekZone[])__getInternalInterface().getFieldValue(BUSINESSWEEKZONES_PROP.get());
    }
    
    /**
     * This wraps the {@link #getBusinessWeekZonesQuery(typekey.ZoneType)} method, converting
     * the result to an array of BusinessWeekZone objects.
     * @param zt the zone type
     * @return region zones of the specified type.
     */
    public entity.BusinessWeekZone[] getBusinessWeekZones(typekey.ZoneType zt) {
      return ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).getBusinessWeekZones(zt);
    }
    
    /**
     * This returns the set of BusinessWeekZones of the specified type.
     * @param zt the zonetype to filter the BusinessWeekZone objects by.
     * @return a queryprocessor of BusinessWeekZone
     */
    public gw.api.database.IQueryBeanResult<entity.BusinessWeekZone> getBusinessWeekZonesQuery(typekey.ZoneType zt) {
      return ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).getBusinessWeekZonesQuery(zt);
    }
    
    /**
     * The filter criteria, used for the region UI only.
     */
    public gw.api.admin.ZoneSearchCriteria getFilterCriteria() {
      return ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).getFilterCriteria();
    }
    
    /**
     * Gets the value of the FridayBusinessEnd field.
     * End of business day on Friday.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getFridayBusinessEnd() {
      return (java.util.Date)__getInternalInterface().getFieldValue(FRIDAYBUSINESSEND_PROP.get());
    }
    
    /**
     * Gets the value of the FridayBusinessStart field.
     * Start of business day on Friday.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getFridayBusinessStart() {
      return (java.util.Date)__getInternalInterface().getFieldValue(FRIDAYBUSINESSSTART_PROP.get());
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
     * Gets the value of the MondayBusinessEnd field.
     * End of business day on Monday.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getMondayBusinessEnd() {
      return (java.util.Date)__getInternalInterface().getFieldValue(MONDAYBUSINESSEND_PROP.get());
    }
    
    /**
     * Gets the value of the MondayBusinessStart field.
     * Start of business day on Monday.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getMondayBusinessStart() {
      return (java.util.Date)__getInternalInterface().getFieldValue(MONDAYBUSINESSSTART_PROP.get());
    }
    
    /**
     * Gets the value of the Name field.
     * The name of a businessweek in the business calendar.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NAME_PROP.get());
    }
    
    /**
     * Gets the value of the Name_L10N_ARRAY field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.BusinessWeek_Name_L10N[] getName_L10N_ARRAY() {
      return (entity.BusinessWeek_Name_L10N[])__getInternalInterface().getFieldValue(NAME_L10N_ARRAY_PROP.get());
    }
    
    /**
     * Array association for partition Name_L10N_ARRAYByLanguage on array Name_L10N_ARRAY
     */
    public entity.BusinessWeek_Name_L10N getName_L10N_ARRAYByLanguage(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property) {
      return (entity.BusinessWeek_Name_L10N)__getInternalInterface().getAssociativeArrayValue(property);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the SaturdayBusinessEnd field.
     * End of business day on Saturday.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getSaturdayBusinessEnd() {
      return (java.util.Date)__getInternalInterface().getFieldValue(SATURDAYBUSINESSEND_PROP.get());
    }
    
    /**
     * Gets the value of the SaturdayBusinessStart field.
     * Start of business day on Saturday.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getSaturdayBusinessStart() {
      return (java.util.Date)__getInternalInterface().getFieldValue(SATURDAYBUSINESSSTART_PROP.get());
    }
    
    /**
     * Gets the value of the SundayBusinessEnd field.
     * End of business day on Sunday.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getSundayBusinessEnd() {
      return (java.util.Date)__getInternalInterface().getFieldValue(SUNDAYBUSINESSEND_PROP.get());
    }
    
    /**
     * Gets the value of the SundayBusinessStart field.
     * Start of business day on Sunday.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getSundayBusinessStart() {
      return (java.util.Date)__getInternalInterface().getFieldValue(SUNDAYBUSINESSSTART_PROP.get());
    }
    
    /**
     * Gets the value of the ThursdayBusinessEnd field.
     * End of business day on Thursday.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getThursdayBusinessEnd() {
      return (java.util.Date)__getInternalInterface().getFieldValue(THURSDAYBUSINESSEND_PROP.get());
    }
    
    /**
     * Gets the value of the ThursdayBusinessStart field.
     * Start of business day on Thursday.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getThursdayBusinessStart() {
      return (java.util.Date)__getInternalInterface().getFieldValue(THURSDAYBUSINESSSTART_PROP.get());
    }
    
    /**
     * Gets the value of the TuesdayBusinessEnd field.
     * End of business day on Tuesday.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getTuesdayBusinessEnd() {
      return (java.util.Date)__getInternalInterface().getFieldValue(TUESDAYBUSINESSEND_PROP.get());
    }
    
    /**
     * Gets the value of the TuesdayBusinessStart field.
     * Start of business day on Tuesday.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getTuesdayBusinessStart() {
      return (java.util.Date)__getInternalInterface().getFieldValue(TUESDAYBUSINESSSTART_PROP.get());
    }
    
    /**
     * Gets the value of the WednesdayBusinessEnd field.
     * End of business day on Wednesday.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getWednesdayBusinessEnd() {
      return (java.util.Date)__getInternalInterface().getFieldValue(WEDNESDAYBUSINESSEND_PROP.get());
    }
    
    /**
     * Gets the value of the WednesdayBusinessStart field.
     * Start of business day on Wednesday.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getWednesdayBusinessStart() {
      return (java.util.Date)__getInternalInterface().getFieldValue(WEDNESDAYBUSINESSSTART_PROP.get());
    }
    
    /**
     * An array of the region's zones.  If the filter criteria is set,
     * it filters the return set by the filter criteria.
     * @return an array of the zones that the region contains.
     */
    public java.lang.String[] getZoneCodes() {
      return ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).getZoneCodes();
    }
    
    /**
     * Returns an alphabetized arraylist of the zones covered by the given region.
     * Zones are represented as strings.  Strips leading and trailing whitespace.
     * @return a list of zones
     */
    public java.util.List getZoneList() {
      return ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).getZoneList();
    }
    
    /**
     * Returns an alphabetized arraylist of the zones covered by the given region.
     * Zones are represented as strings.  Strips leading and trailing whitespace.
     * @return a comma-separated list of zones
     */
    public java.lang.String getZones() {
      return ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).getZones();
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Gets the value of the AppliesToAllZones field.
     * True if this businessweek applies to all zones (in which case BusinessWeekZones should be empty). If false and BusinessWeekZones has elements, this businessweek applies to those zones.  If false and BusinessWeekZones is empty, this businessweek doesn't apply anywhere.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isAppliesToAllZones() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(APPLIESTOALLZONES_PROP.get());
    }
    
    /**
     * Gets the value of the FridayBusinessDay field.
     * Is Friday a business day.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isFridayBusinessDay() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(FRIDAYBUSINESSDAY_PROP.get());
    }
    
    /**
     * Gets the value of the MondayBusinessDay field.
     * Is Monday a business day.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isMondayBusinessDay() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(MONDAYBUSINESSDAY_PROP.get());
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
     * Gets the value of the SaturdayBusinessDay field.
     * Is Saturday a business day.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isSaturdayBusinessDay() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(SATURDAYBUSINESSDAY_PROP.get());
    }
    
    /**
     * Gets the value of the SundayBusinessDay field.
     * Is Sunday a business day.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isSundayBusinessDay() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(SUNDAYBUSINESSDAY_PROP.get());
    }
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    /**
     * Gets the value of the ThursdayBusinessDay field.
     * Is Thursday a business day.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isThursdayBusinessDay() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(THURSDAYBUSINESSDAY_PROP.get());
    }
    
    /**
     * Gets the value of the TuesdayBusinessDay field.
     * Is Tuesday a business day.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isTuesdayBusinessDay() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(TUESDAYBUSINESSDAY_PROP.get());
    }
    
    /**
     * Gets the value of the WednesdayBusinessDay field.
     * Is Wednesday a business day.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isWednesdayBusinessDay() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(WEDNESDAYBUSINESSDAY_PROP.get());
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
     * Removes the given element from the BusinessWeekZones array. This is achieved by marking the element for removal.
     */
    public void removeFromBusinessWeekZones(entity.BusinessWeekZone element) {
      __getInternalInterface().removeArrayElement(BUSINESSWEEKZONES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the BusinessWeekZones array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromBusinessWeekZones(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(BUSINESSWEEKZONES_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Name_L10N_ARRAY array. This is achieved by marking the element for removal.
     */
    public void removeFromName_L10N_ARRAY(entity.BusinessWeek_Name_L10N element) {
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
      ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).removeNullZones();
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    public void safeDelete() {
      ((com.guidewire.pl.domain.calendar.impl.BusinessWeekInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.impl.BusinessWeekInternalMethods")).safeDelete();
    }
    
    /**
     * Sets the value of the AppliesToAllZones field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setAppliesToAllZones(java.lang.Boolean value) {
      ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).setAppliesToAllZones(value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BusinessDayDemarcation field.
     */
    public void setBusinessDayDemarcation(java.util.Date value) {
      __getInternalInterface().setFieldValue(BUSINESSDAYDEMARCATION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BusinessWeekEnd field.
     */
    public void setBusinessWeekEnd(typekey.Weekdays value) {
      __getInternalInterface().setFieldValue(BUSINESSWEEKEND_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BusinessWeekZones field.
     */
    public void setBusinessWeekZones(entity.BusinessWeekZone[] value) {
      __getInternalInterface().setFieldValue(BUSINESSWEEKZONES_PROP.get(), value);
    }
    
    /**
     * The filter criteria, used for the region UI only.
     * @param filterCriteria 
     */
    public void setFilterCriteria(gw.api.admin.ZoneSearchCriteria filterCriteria) {
      ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).setFilterCriteria(filterCriteria);
    }
    
    /**
     * Sets the value of the FridayBusinessDay field.
     */
    public void setFridayBusinessDay(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(FRIDAYBUSINESSDAY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FridayBusinessEnd field.
     */
    public void setFridayBusinessEnd(java.util.Date value) {
      __getInternalInterface().setFieldValue(FRIDAYBUSINESSEND_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FridayBusinessStart field.
     */
    public void setFridayBusinessStart(java.util.Date value) {
      __getInternalInterface().setFieldValue(FRIDAYBUSINESSSTART_PROP.get(), value);
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
     * Sets the value of the MondayBusinessDay field.
     */
    public void setMondayBusinessDay(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(MONDAYBUSINESSDAY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MondayBusinessEnd field.
     */
    public void setMondayBusinessEnd(java.util.Date value) {
      __getInternalInterface().setFieldValue(MONDAYBUSINESSEND_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MondayBusinessStart field.
     */
    public void setMondayBusinessStart(java.util.Date value) {
      __getInternalInterface().setFieldValue(MONDAYBUSINESSSTART_PROP.get(), value);
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
    public void setName_L10N_ARRAY(entity.BusinessWeek_Name_L10N[] value) {
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
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the SaturdayBusinessDay field.
     */
    public void setSaturdayBusinessDay(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(SATURDAYBUSINESSDAY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SaturdayBusinessEnd field.
     */
    public void setSaturdayBusinessEnd(java.util.Date value) {
      __getInternalInterface().setFieldValue(SATURDAYBUSINESSEND_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SaturdayBusinessStart field.
     */
    public void setSaturdayBusinessStart(java.util.Date value) {
      __getInternalInterface().setFieldValue(SATURDAYBUSINESSSTART_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SundayBusinessDay field.
     */
    public void setSundayBusinessDay(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(SUNDAYBUSINESSDAY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SundayBusinessEnd field.
     */
    public void setSundayBusinessEnd(java.util.Date value) {
      __getInternalInterface().setFieldValue(SUNDAYBUSINESSEND_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SundayBusinessStart field.
     */
    public void setSundayBusinessStart(java.util.Date value) {
      __getInternalInterface().setFieldValue(SUNDAYBUSINESSSTART_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ThursdayBusinessDay field.
     */
    public void setThursdayBusinessDay(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(THURSDAYBUSINESSDAY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ThursdayBusinessEnd field.
     */
    public void setThursdayBusinessEnd(java.util.Date value) {
      __getInternalInterface().setFieldValue(THURSDAYBUSINESSEND_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ThursdayBusinessStart field.
     */
    public void setThursdayBusinessStart(java.util.Date value) {
      __getInternalInterface().setFieldValue(THURSDAYBUSINESSSTART_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TuesdayBusinessDay field.
     */
    public void setTuesdayBusinessDay(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(TUESDAYBUSINESSDAY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TuesdayBusinessEnd field.
     */
    public void setTuesdayBusinessEnd(java.util.Date value) {
      __getInternalInterface().setFieldValue(TUESDAYBUSINESSEND_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TuesdayBusinessStart field.
     */
    public void setTuesdayBusinessStart(java.util.Date value) {
      __getInternalInterface().setFieldValue(TUESDAYBUSINESSSTART_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WednesdayBusinessDay field.
     */
    public void setWednesdayBusinessDay(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(WEDNESDAYBUSINESSDAY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WednesdayBusinessEnd field.
     */
    public void setWednesdayBusinessEnd(java.util.Date value) {
      __getInternalInterface().setFieldValue(WEDNESDAYBUSINESSEND_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WednesdayBusinessStart field.
     */
    public void setWednesdayBusinessStart(java.util.Date value) {
      __getInternalInterface().setFieldValue(WEDNESDAYBUSINESSSTART_PROP.get(), value);
    }
    
    public void setZoneCodes(java.lang.String[] zones) {
      ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).setZoneCodes(zones);
    }
    
    /**
     * Set the zones (comma-delimited list) for the region.
     * @param zones comman separated list of zones
     * @deprecated use #setZoneCodes BusinessWeeks are heterogeneous therefore this method should not be used.
     */
    public void setZones(java.lang.String zones) {
      ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).setZones(zones);
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
    
    /**
     * 
     * @return an error message String if the day demarcation is during business hours
     */
    public java.lang.String validateBusinessDayDemarcation() {
      return ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).validateBusinessDayDemarcation();
    }
    
    /**
     * 
     * @return an error message String if FridayBusinessEnd is before FridayBusinessStart
     */
    public java.lang.String validateFridayStartAndEndTimes() {
      return ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).validateFridayStartAndEndTimes();
    }
    
    /**
     * 
     * @return an error message String if MondayBusinessEnd is before MondayBusinessStart
     */
    public java.lang.String validateMondayStartAndEndTimes() {
      return ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).validateMondayStartAndEndTimes();
    }
    
    /**
     * 
     * @return an error message String if the name is used by another BusinessWeek
     */
    public java.lang.String validateName() {
      return ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).validateName();
    }
    
    /**
     * 
     * @return an error message String if this BusinessWeek's AppliesToAllZones is set to true, and there are other BusinessWeek's that have AppliesToAllZones set to true
     */
    public java.lang.String validateOnlyOneBusinessWeekAppliesToAll() {
      return ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).validateOnlyOneBusinessWeekAppliesToAll();
    }
    
    /**
     * 
     * @return an error message String if SaturdayBusinessEnd is before SaturdayBusinessStart
     */
    public java.lang.String validateSaturdayStartAndEndTimes() {
      return ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).validateSaturdayStartAndEndTimes();
    }
    
    /**
     * 
     * @return an error message String if SundayBusinessEnd is before SundayBusinessStart
     */
    public java.lang.String validateSundayStartAndEndTimes() {
      return ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).validateSundayStartAndEndTimes();
    }
    
    /**
     * 
     * @return an error message String if ThursdayBusinessEnd is before ThursdayBusinessStart
     */
    public java.lang.String validateThursdayStartAndEndTimes() {
      return ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).validateThursdayStartAndEndTimes();
    }
    
    /**
     * 
     * @return an error message String if TuesdayBusinessEnd is before TuesdayBusinessStart
     */
    public java.lang.String validateTuesdayStartAndEndTimes() {
      return ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).validateTuesdayStartAndEndTimes();
    }
    
    /**
     * 
     * @return an error message String if WednesdayBusinessEnd is before WednesdayBusinessStart
     */
    public java.lang.String validateWednesdayStartAndEndTimes() {
      return ((com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods")).validateWednesdayStartAndEndTimes();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods", "com.guidewire.pl.domain.calendar.impl.BusinessWeekImpl");
    config.put("com.guidewire.pl.domain.calendar.impl.BusinessWeekInternalMethods", "com.guidewire.pl.domain.calendar.impl.BusinessWeekImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.BusinessWeek.class, config);
    com.guidewire._generated.entity.BusinessWeekInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.BusinessWeek, com.guidewire._generated.entity.BusinessWeekInternal>() {
      public java.lang.Object getImplementation(entity.BusinessWeek bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.BusinessWeekInternal getInternalInterface(entity.BusinessWeek bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.BusinessWeek newEmptyInstance() {
        return new entity.BusinessWeek((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}