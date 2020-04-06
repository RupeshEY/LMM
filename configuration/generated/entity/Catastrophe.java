package entity;

/**
 * Catastrophe
 * 
 * Represents a catastrophe to code claims with. Each catastrophe has a unique
 * name and catastrophe number.
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Catastrophe.eti;Catastrophe.eix;Catastrophe.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "Catastrophe")
public class Catastrophe extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.EventAware {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.Catastrophe> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.Catastrophe>("entity.Catastrophe");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ACTIVE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Active");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BOTTOMRIGHTLATITUDE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BottomRightLatitude");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BOTTOMRIGHTLONGITUDE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BottomRightLongitude");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CATASTROPHENUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CatastropheNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CATASTROPHEVALIDFROM_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CatastropheValidFrom");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CATASTROPHEVALIDTO_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CatastropheValidTo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CATASTROPHEZONES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "CatastropheZones");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CLAIMSHISTORY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ClaimsHistory");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COMMENTS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Comments");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DESCRIPTION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Description");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> DESCRIPTION_L10N_ARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Description_L10N_ARRAY");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LCOCODE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LCOCode");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Name");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> NAME_L10N_ARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Name_L10N_ARRAY");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PCSCATASTROPHENUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PCSCatastropheNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> PERILS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Perils");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> POLICYEFFECTIVEDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PolicyEffectiveDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> POLICYRETRIEVALCOMPLETIONTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PolicyRetrievalCompletionTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> POLICYRETRIEVALSETTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PolicyRetrievalSetTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SCHEDULEBATCH_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ScheduleBatch");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOPLEFTLATITUDE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TopLeftLatitude");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOPLEFTLONGITUDE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TopLeftLongitude");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> TYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Type");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.CatastropheInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  public static final gw.api.exposure.PublicCatastropheFinder finder = gw.cc.catastrophe.entity.Catastrophe.finder;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public Catastrophe()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public Catastrophe(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected Catastrophe(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.CatastropheInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.CatastropheInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  public gw.api.database.Query<entity.Claim> addCatastropheZoneFilter(gw.api.database.Query<entity.Claim> query) {
    return ((gw.cc.catastrophe.entity.Catastrophe)__getDelegateManager().getImplementation("gw.cc.catastrophe.entity.Catastrophe")).addCatastropheZoneFilter(query);
  }
  
  /**
   * Associates an event with the bean, which will be fired when the bean is
   * committed. A bean with an event is considered changed.
   * @param strEventId The event id.
   */
  public void addEvent(java.lang.String strEventId) {
    ((com.guidewire.pl.domain.messaging.EventAwarePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.EventAwarePublicMethods")).addEvent(strEventId);
  }
  
  /**
   * Adds the given element to the CatastropheZones array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCatastropheZones(entity.CatastropheZone element) {
    __getInternalInterface().addArrayElement(CATASTROPHEZONES_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the ClaimsHistory array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToClaimsHistory(entity.CatastropheClaimsHistory element) {
    __getInternalInterface().addArrayElement(CLAIMSHISTORY_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Perils array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToPerils(entity.CatastrophePeril element) {
    __getInternalInterface().addArrayElement(PERILS_PROP.get(), element);
  }
  
  /**
   * Checks if this catastrophe contains a zone of the given type and value. The string matching is case-insensitive
   * NOTE: this will not match if a zip+4 value is provided.  You must strip off the +4 before passing
   * to this method.
   * @param country 
   * @param zoneType the zone type, must not be null
   * @param zone the zone string, must not be null
   * @return true if the region containsZone a zone of the given type, false
   *         otherwise
   */
  public boolean containsZone(typekey.Country country, typekey.ZoneType zoneType, java.lang.String zone) {
    return ((gw.cc.catastrophe.entity.Catastrophe)__getDelegateManager().getImplementation("gw.cc.catastrophe.entity.Catastrophe")).containsZone(country, zoneType, zone);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the BottomRightLatitude field.
   * Latitude for the bottom right point of the area of interest, in degrees.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getBottomRightLatitude() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(BOTTOMRIGHTLATITUDE_PROP.get());
  }
  
  /**
   * Gets the value of the BottomRightLongitude field.
   * Longitude for the bottom right point of the area of interest, in degrees.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getBottomRightLongitude() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(BOTTOMRIGHTLONGITUDE_PROP.get());
  }
  
  /**
   * Gets the value of the CatastropheNumber field.
   * Catastrophe number.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCatastropheNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CATASTROPHENUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the CatastropheValidFrom field.
   * Start date when this catastrophe is valid
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCatastropheValidFrom() {
    return (java.util.Date)__getInternalInterface().getFieldValue(CATASTROPHEVALIDFROM_PROP.get());
  }
  
  /**
   * Gets the value of the CatastropheValidTo field.
   * Date when this catastrophe is no longer valid
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCatastropheValidTo() {
    return (java.util.Date)__getInternalInterface().getFieldValue(CATASTROPHEVALIDTO_PROP.get());
  }
  
  /**
   * Gets the value of the CatastropheZones field.
   * The zones that define this catastrophe.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CatastropheZone[] getCatastropheZones() {
    return (entity.CatastropheZone[])__getInternalInterface().getFieldValue(CATASTROPHEZONES_PROP.get());
  }
  
  /**
   * This wraps the {@link this.getCatastropheZonesQuery(ZoneType)} method, converting
   * the result to an array of CatastropheZone objects.
   * @param zt the zone type
   * @return catastrophe zones of the specified type.
   */
  public entity.CatastropheZone[] getCatastropheZones(typekey.ZoneType zt) {
    return ((gw.cc.catastrophe.entity.Catastrophe)__getDelegateManager().getImplementation("gw.cc.catastrophe.entity.Catastrophe")).getCatastropheZones(zt);
  }
  
  /**
   * This returns the set of CatastropheZones of the specified type.
   * @param zt the zonetype to filter the CatastropheZone objects by.
   * @return a queryprocessor of CatastropheZone
   */
  public gw.api.database.IQueryBeanResult<entity.CatastropheZone> getCatastropheZonesQuery(typekey.ZoneType zt) {
    return ((gw.cc.catastrophe.entity.Catastrophe)__getDelegateManager().getImplementation("gw.cc.catastrophe.entity.Catastrophe")).getCatastropheZonesQuery(zt);
  }
  
  /**
   * Gets the value of the ClaimsHistory field.
   * History of the matched claims.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CatastropheClaimsHistory[] getClaimsHistory() {
    return (entity.CatastropheClaimsHistory[])__getInternalInterface().getFieldValue(CLAIMSHISTORY_PROP.get());
  }
  
  /**
   * Gets the value of the Comments field.
   * Comments regarding the Catastrophe
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getComments() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(COMMENTS_PROP.get());
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
   * Gets the value of the Description field.
   * Description of the catastrophe.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Catastrophe_Description_L10N[] getDescription_L10N_ARRAY() {
    return (entity.Catastrophe_Description_L10N[])__getInternalInterface().getFieldValue(DESCRIPTION_L10N_ARRAY_PROP.get());
  }
  
  /**
   * Array association accessor for key en_US on array Description_L10N_ARRAY
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription_en_US() {
    return (java.lang.String)__getInternalInterface().getLocalizedFieldValueForCodeGen((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("Description_en_US"));
  }
  
  /**
   * The filter criteria, used for the catastrophe UI only.
   */
  public gw.api.admin.ZoneSearchCriteria getFilterCriteria() {
    return ((gw.cc.catastrophe.entity.Catastrophe)__getDelegateManager().getImplementation("gw.cc.catastrophe.entity.Catastrophe")).getFilterCriteria();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the LCOCode field.
   * Lloyd's Claim Office (LCO) catastrophe code
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLCOCode() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LCOCODE_PROP.get());
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
   * Name of the catastrophe.
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
  public entity.Catastrophe_Name_L10N[] getName_L10N_ARRAY() {
    return (entity.Catastrophe_Name_L10N[])__getInternalInterface().getFieldValue(NAME_L10N_ARRAY_PROP.get());
  }
  
  /**
   * Array association accessor for key en_US on array Name_L10N_ARRAY
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName_en_US() {
    return (java.lang.String)__getInternalInterface().getLocalizedFieldValueForCodeGen((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("Name_en_US"));
  }
  
  /**
   * Gets the value of the PCSCatastropheNumber field.
   * PCS catastrophe number from ISO data feed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPCSCatastropheNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PCSCATASTROPHENUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the Perils field.
   * Details of perils associated with a catastrophe.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CatastrophePeril[] getPerils() {
    return (entity.CatastrophePeril[])__getInternalInterface().getFieldValue(PERILS_PROP.get());
  }
  
  /**
   * Gets the value of the PolicyEffectiveDate field.
   * Effective date for retrieving policy locations from the policy system.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getPolicyEffectiveDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(POLICYEFFECTIVEDATE_PROP.get());
  }
  
  /**
   * Gets the value of the PolicyRetrievalCompletionTime field.
   * Time when last policy retrieval location was completed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getPolicyRetrievalCompletionTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(POLICYRETRIEVALCOMPLETIONTIME_PROP.get());
  }
  
  /**
   * Gets the value of the PolicyRetrievalSetTime field.
   * Time when policy location retrieval parameters were last set.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getPolicyRetrievalSetTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(POLICYRETRIEVALSETTIME_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Returns all the zone types relevant to catastrophes for the given country. This is used
   * to decide which zone types to show in the catastrophe UI for building catastrophe zones,
   * and hence determines which types of zone can be built using the UI.
   * <p>
   * The current implementation returns all the zone types that have a "granularity" specified
   * in the zone-config.xml file, in reverse granularity order (i.e. least specific first)
   * @param country a non null country for which we need zone types
   * @return a non null list of zone types
   */
  public java.util.List<typekey.ZoneType> getRelevantZoneTypesForCountry(typekey.Country country) {
    return ((gw.cc.catastrophe.entity.Catastrophe)__getDelegateManager().getImplementation("gw.cc.catastrophe.entity.Catastrophe")).getRelevantZoneTypesForCountry(country);
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
   * Gets the value of the TopLeftLatitude field.
   * Latitude for the top left  point of the area of interest, in degrees.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTopLeftLatitude() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOPLEFTLATITUDE_PROP.get());
  }
  
  /**
   * Gets the value of the TopLeftLongitude field.
   * Longitude for the top left point of the area of interest, in degrees.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTopLeftLongitude() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOPLEFTLONGITUDE_PROP.get());
  }
  
  /**
   * Gets the value of the Type field.
   * Type of the catastrophe (for example, ISO or internal).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CatastropheType getType() {
    return (typekey.CatastropheType)__getInternalInterface().getFieldValue(TYPE_PROP.get());
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
   * An array of the catastrophe's zones.  If the filter criteria is set,
   * it filters the return set by the filter criteria.
   * @return an array of the zones that the catastrophe contains.
   */
  public java.lang.String[] getZoneCodes() {
    return ((gw.cc.catastrophe.entity.Catastrophe)__getDelegateManager().getImplementation("gw.cc.catastrophe.entity.Catastrophe")).getZoneCodes();
  }
  
  /**
   * Returns an alphabetized arraylist of the zones covered by the given catastrophe.
   * Zones are represented as strings.  Strips leading and trailing whitespace.
   * @return a list of zones
   */
  public java.util.List getZoneList() {
    return ((gw.cc.catastrophe.entity.Catastrophe)__getDelegateManager().getImplementation("gw.cc.catastrophe.entity.Catastrophe")).getZoneList();
  }
  
  /**
   * Returns an alphabetized arraylist of the zones covered by the given catastrophe.
   * Zones are represented as strings.  Strips leading and trailing whitespace.
   * @return a comma-separated list of zones
   */
  public java.lang.String getZones() {
    return ((gw.cc.catastrophe.entity.Catastrophe)__getDelegateManager().getImplementation("gw.cc.catastrophe.entity.Catastrophe")).getZones();
  }
  
  /**
   * Checks whether any claims are linked to the catastrophe.
   * @return <code>true</code> if there are claims associated the Catastrophe, else <code>false</code>
   */
  public boolean hasAssociatedClaims() {
    return ((gw.cc.catastrophe.entity.Catastrophe)__getDelegateManager().getImplementation("gw.cc.catastrophe.entity.Catastrophe")).hasAssociatedClaims();
  }
  
  /**
   * Gets the value of the Active field.
   * True if a catastrophe can be assigned to a new claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isActive() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(ACTIVE_PROP.get());
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
   * Gets the value of the ScheduleBatch field.
   * Boolean field to mark a catastrophe to be run in the CatastropheClaimFinder batch process.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isScheduleBatch() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(SCHEDULEBATCH_PROP.get());
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
   * Removes the given element from the CatastropheZones array. This is achieved by marking the element for removal.
   */
  public void removeFromCatastropheZones(entity.CatastropheZone element) {
    __getInternalInterface().removeArrayElement(CATASTROPHEZONES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the CatastropheZones array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCatastropheZones(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(CATASTROPHEZONES_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the ClaimsHistory array. This is achieved by marking the element for removal.
   */
  public void removeFromClaimsHistory(entity.CatastropheClaimsHistory element) {
    __getInternalInterface().removeArrayElement(CLAIMSHISTORY_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the ClaimsHistory array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClaimsHistory(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(CLAIMSHISTORY_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the Perils array. This is achieved by marking the element for removal.
   */
  public void removeFromPerils(entity.CatastrophePeril element) {
    __getInternalInterface().removeArrayElement(PERILS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Perils array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromPerils(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(PERILS_PROP.get(), elementID);
  }
  
  /**
   * This will delete all null zones.
   */
  public void removeNullZones() {
    ((gw.cc.catastrophe.entity.Catastrophe)__getDelegateManager().getImplementation("gw.cc.catastrophe.entity.Catastrophe")).removeNullZones();
  }
  
  /**
   * Sets the value of the Active field.
   */
  public void setActive(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(ACTIVE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BottomRightLatitude field.
   */
  public void setBottomRightLatitude(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(BOTTOMRIGHTLATITUDE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BottomRightLongitude field.
   */
  public void setBottomRightLongitude(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(BOTTOMRIGHTLONGITUDE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CatastropheNumber field.
   */
  public void setCatastropheNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CATASTROPHENUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CatastropheValidFrom field.
   */
  public void setCatastropheValidFrom(java.util.Date value) {
    __getInternalInterface().setFieldValue(CATASTROPHEVALIDFROM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CatastropheValidTo field.
   */
  public void setCatastropheValidTo(java.util.Date value) {
    __getInternalInterface().setFieldValue(CATASTROPHEVALIDTO_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CatastropheZones field.
   */
  public void setCatastropheZones(entity.CatastropheZone[] value) {
    __getInternalInterface().setFieldValue(CATASTROPHEZONES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimsHistory field.
   */
  public void setClaimsHistory(entity.CatastropheClaimsHistory[] value) {
    __getInternalInterface().setFieldValue(CLAIMSHISTORY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Comments field.
   */
  public void setComments(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(COMMENTS_PROP.get(), value);
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
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(DESCRIPTION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Description_L10N_ARRAY field.
   */
  private void setDescription_L10N_ARRAY(entity.Catastrophe_Description_L10N[] value) {
    __getInternalInterface().setFieldValue(DESCRIPTION_L10N_ARRAY_PROP.get(), value);
  }
  
  /**
   * Array association mutator for key Description_ on array Description_L10N_ARRAY
   */
  public void setDescription_en_US(java.lang.String value) {
    __getInternalInterface().setLocalizedFieldValueForCodeGen((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("Description_en_US"), value);
  }
  
  /**
   * The filter criteria, used for the catastrophe UI only.
   * @param filterCriteria 
   */
  public void setFilterCriteria(gw.api.admin.ZoneSearchCriteria filterCriteria) {
    ((gw.cc.catastrophe.entity.Catastrophe)__getDelegateManager().getImplementation("gw.cc.catastrophe.entity.Catastrophe")).setFilterCriteria(filterCriteria);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LCOCode field.
   */
  public void setLCOCode(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(LCOCODE_PROP.get(), value);
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
  private void setName_L10N_ARRAY(entity.Catastrophe_Name_L10N[] value) {
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
   * Sets the value of the PCSCatastropheNumber field.
   */
  public void setPCSCatastropheNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(PCSCATASTROPHENUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Perils field.
   */
  public void setPerils(entity.CatastrophePeril[] value) {
    __getInternalInterface().setFieldValue(PERILS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PolicyEffectiveDate field.
   */
  public void setPolicyEffectiveDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(POLICYEFFECTIVEDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PolicyRetrievalCompletionTime field.
   */
  public void setPolicyRetrievalCompletionTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(POLICYRETRIEVALCOMPLETIONTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PolicyRetrievalSetTime field.
   */
  public void setPolicyRetrievalSetTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(POLICYRETRIEVALSETTIME_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the RetiredValue field.
   */
  private void setRetiredValue(java.lang.Long value) {
    __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ScheduleBatch field.
   */
  public void setScheduleBatch(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(SCHEDULEBATCH_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TopLeftLatitude field.
   */
  public void setTopLeftLatitude(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(TOPLEFTLATITUDE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TopLeftLongitude field.
   */
  public void setTopLeftLongitude(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(TOPLEFTLONGITUDE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Type field.
   */
  public void setType(typekey.CatastropheType value) {
    __getInternalInterface().setFieldValue(TYPE_PROP.get(), value);
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
  
  public void setZoneCodes(java.lang.String[] zones) {
    ((gw.cc.catastrophe.entity.Catastrophe)__getDelegateManager().getImplementation("gw.cc.catastrophe.entity.Catastrophe")).setZoneCodes(zones);
  }
  
  /**
   * Set the zones (comma-delimited list) for the catastrophe.
   * @param zones comman separated list of zones
   * @deprecated Catastrophe are heterogeneous therefore this method should not be used.
   */
  public void setZones(java.lang.String zones) {
    ((gw.cc.catastrophe.entity.Catastrophe)__getDelegateManager().getImplementation("gw.cc.catastrophe.entity.Catastrophe")).setZones(zones);
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
   * Validates all the zones for the catastrophe against zone data.
   * @return all the catastrophe zones that do not have a corresponding zone data in the database.
   */
  public entity.CatastropheZone[] validateZones() {
    return ((gw.cc.catastrophe.entity.Catastrophe)__getDelegateManager().getImplementation("gw.cc.catastrophe.entity.Catastrophe")).validateZones();
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.CatastropheInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.Catastrophe.this.__getDelegateManager();
    }
    
    public gw.api.database.Query<entity.Claim> addCatastropheZoneFilter(gw.api.database.Query<entity.Claim> query) {
      return ((gw.cc.catastrophe.entity.Catastrophe)__getDelegateManager().getImplementation("gw.cc.catastrophe.entity.Catastrophe")).addCatastropheZoneFilter(query);
    }
    
    public void addEvent(com.guidewire.pl.system.entity.BeanEvent event) {
      ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).addEvent(event);
    }
    
    /**
     * Associates an event with the bean, which will be fired when the bean is
     * committed. A bean with an event is considered changed.
     * @param strEventId The event id.
     */
    public void addEvent(java.lang.String strEventId) {
      ((com.guidewire.pl.domain.messaging.EventAwarePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.EventAwarePublicMethods")).addEvent(strEventId);
    }
    
    /**
     * Adds the given element to the CatastropheZones array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToCatastropheZones(entity.CatastropheZone element) {
      __getInternalInterface().addArrayElement(CATASTROPHEZONES_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ClaimsHistory array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToClaimsHistory(entity.CatastropheClaimsHistory element) {
      __getInternalInterface().addArrayElement(CLAIMSHISTORY_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Description_L10N_ARRAY array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToDescription_L10N_ARRAY(entity.Catastrophe_Description_L10N element) {
      __getInternalInterface().addArrayElement(DESCRIPTION_L10N_ARRAY_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Name_L10N_ARRAY array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToName_L10N_ARRAY(entity.Catastrophe_Name_L10N element) {
      __getInternalInterface().addArrayElement(NAME_L10N_ARRAY_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Perils array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToPerils(entity.CatastrophePeril element) {
      __getInternalInterface().addArrayElement(PERILS_PROP.get(), element);
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
     * Checks if this catastrophe contains a zone of the given type and value. The string matching is case-insensitive
     * NOTE: this will not match if a zip+4 value is provided.  You must strip off the +4 before passing
     * to this method.
     * @param country 
     * @param zoneType the zone type, must not be null
     * @param zone the zone string, must not be null
     * @return true if the region containsZone a zone of the given type, false
     *         otherwise
     */
    public boolean containsZone(typekey.Country country, typekey.ZoneType zoneType, java.lang.String zone) {
      return ((gw.cc.catastrophe.entity.Catastrophe)__getDelegateManager().getImplementation("gw.cc.catastrophe.entity.Catastrophe")).containsZone(country, zoneType, zone);
    }
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
    }
    
    public java.util.List generateInsertEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).generateInsertEvents();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateInsertEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateInsertEventsInternal();
    }
    
    public java.util.List generateRemoveEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).generateRemoveEvents();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateRemoveEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateRemoveEventsInternal();
    }
    
    public java.util.List generateUpdateEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).generateUpdateEvents();
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
     * Gets the value of the BottomRightLatitude field.
     * Latitude for the bottom right point of the area of interest, in degrees.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getBottomRightLatitude() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(BOTTOMRIGHTLATITUDE_PROP.get());
    }
    
    /**
     * Gets the value of the BottomRightLongitude field.
     * Longitude for the bottom right point of the area of interest, in degrees.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getBottomRightLongitude() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(BOTTOMRIGHTLONGITUDE_PROP.get());
    }
    
    /**
     * Gets the value of the CatastropheNumber field.
     * Catastrophe number.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getCatastropheNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CATASTROPHENUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the CatastropheValidFrom field.
     * Start date when this catastrophe is valid
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getCatastropheValidFrom() {
      return (java.util.Date)__getInternalInterface().getFieldValue(CATASTROPHEVALIDFROM_PROP.get());
    }
    
    /**
     * Gets the value of the CatastropheValidTo field.
     * Date when this catastrophe is no longer valid
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getCatastropheValidTo() {
      return (java.util.Date)__getInternalInterface().getFieldValue(CATASTROPHEVALIDTO_PROP.get());
    }
    
    /**
     * Gets the value of the CatastropheZones field.
     * The zones that define this catastrophe.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.CatastropheZone[] getCatastropheZones() {
      return (entity.CatastropheZone[])__getInternalInterface().getFieldValue(CATASTROPHEZONES_PROP.get());
    }
    
    /**
     * This wraps the {@link this.getCatastropheZonesQuery(ZoneType)} method, converting
     * the result to an array of CatastropheZone objects.
     * @param zt the zone type
     * @return catastrophe zones of the specified type.
     */
    public entity.CatastropheZone[] getCatastropheZones(typekey.ZoneType zt) {
      return ((gw.cc.catastrophe.entity.Catastrophe)__getDelegateManager().getImplementation("gw.cc.catastrophe.entity.Catastrophe")).getCatastropheZones(zt);
    }
    
    /**
     * This returns the set of CatastropheZones of the specified type.
     * @param zt the zonetype to filter the CatastropheZone objects by.
     * @return a queryprocessor of CatastropheZone
     */
    public gw.api.database.IQueryBeanResult<entity.CatastropheZone> getCatastropheZonesQuery(typekey.ZoneType zt) {
      return ((gw.cc.catastrophe.entity.Catastrophe)__getDelegateManager().getImplementation("gw.cc.catastrophe.entity.Catastrophe")).getCatastropheZonesQuery(zt);
    }
    
    /**
     * Gets the value of the ClaimsHistory field.
     * History of the matched claims.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.CatastropheClaimsHistory[] getClaimsHistory() {
      return (entity.CatastropheClaimsHistory[])__getInternalInterface().getFieldValue(CLAIMSHISTORY_PROP.get());
    }
    
    /**
     * Gets the value of the Comments field.
     * Comments regarding the Catastrophe
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getComments() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(COMMENTS_PROP.get());
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
     * Gets the value of the Description field.
     * Description of the catastrophe.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDescription() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
    }
    
    /**
     * Gets the value of the Description_L10N_ARRAY field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Catastrophe_Description_L10N[] getDescription_L10N_ARRAY() {
      return (entity.Catastrophe_Description_L10N[])__getInternalInterface().getFieldValue(DESCRIPTION_L10N_ARRAY_PROP.get());
    }
    
    /**
     * Array association for partition Description_L10N_ARRAYByLanguage on array Description_L10N_ARRAY
     */
    public entity.Catastrophe_Description_L10N getDescription_L10N_ARRAYByLanguage(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property) {
      return (entity.Catastrophe_Description_L10N)__getInternalInterface().getAssociativeArrayValue(property);
    }
    
    public com.guidewire.pl.system.entity.BeanEvent[] getEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).getEvents();
    }
    
    /**
     * The filter criteria, used for the catastrophe UI only.
     */
    public gw.api.admin.ZoneSearchCriteria getFilterCriteria() {
      return ((gw.cc.catastrophe.entity.Catastrophe)__getDelegateManager().getImplementation("gw.cc.catastrophe.entity.Catastrophe")).getFilterCriteria();
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
     * Gets the value of the LCOCode field.
     * Lloyd's Claim Office (LCO) catastrophe code
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getLCOCode() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LCOCODE_PROP.get());
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
     * Name of the catastrophe.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NAME_PROP.get());
    }
    
    /**
     * Gets the value of the Name_L10N_ARRAY field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Catastrophe_Name_L10N[] getName_L10N_ARRAY() {
      return (entity.Catastrophe_Name_L10N[])__getInternalInterface().getFieldValue(NAME_L10N_ARRAY_PROP.get());
    }
    
    /**
     * Array association for partition Name_L10N_ARRAYByLanguage on array Name_L10N_ARRAY
     */
    public entity.Catastrophe_Name_L10N getName_L10N_ARRAYByLanguage(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property) {
      return (entity.Catastrophe_Name_L10N)__getInternalInterface().getAssociativeArrayValue(property);
    }
    
    /**
     * Gets the value of the PCSCatastropheNumber field.
     * PCS catastrophe number from ISO data feed.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPCSCatastropheNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PCSCATASTROPHENUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the Perils field.
     * Details of perils associated with a catastrophe.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.CatastrophePeril[] getPerils() {
      return (entity.CatastrophePeril[])__getInternalInterface().getFieldValue(PERILS_PROP.get());
    }
    
    /**
     * Gets the value of the PolicyEffectiveDate field.
     * Effective date for retrieving policy locations from the policy system.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getPolicyEffectiveDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(POLICYEFFECTIVEDATE_PROP.get());
    }
    
    /**
     * Gets the value of the PolicyRetrievalCompletionTime field.
     * Time when last policy retrieval location was completed.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getPolicyRetrievalCompletionTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(POLICYRETRIEVALCOMPLETIONTIME_PROP.get());
    }
    
    /**
     * Gets the value of the PolicyRetrievalSetTime field.
     * Time when policy location retrieval parameters were last set.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getPolicyRetrievalSetTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(POLICYRETRIEVALSETTIME_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Returns all the zone types relevant to catastrophes for the given country. This is used
     * to decide which zone types to show in the catastrophe UI for building catastrophe zones,
     * and hence determines which types of zone can be built using the UI.
     * <p>
     * The current implementation returns all the zone types that have a "granularity" specified
     * in the zone-config.xml file, in reverse granularity order (i.e. least specific first)
     * @param country a non null country for which we need zone types
     * @return a non null list of zone types
     */
    public java.util.List<typekey.ZoneType> getRelevantZoneTypesForCountry(typekey.Country country) {
      return ((gw.cc.catastrophe.entity.Catastrophe)__getDelegateManager().getImplementation("gw.cc.catastrophe.entity.Catastrophe")).getRelevantZoneTypesForCountry(country);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
    }
    
    /**
     * Gets the value of the TopLeftLatitude field.
     * Latitude for the top left  point of the area of interest, in degrees.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getTopLeftLatitude() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOPLEFTLATITUDE_PROP.get());
    }
    
    /**
     * Gets the value of the TopLeftLongitude field.
     * Longitude for the top left point of the area of interest, in degrees.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getTopLeftLongitude() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOPLEFTLONGITUDE_PROP.get());
    }
    
    /**
     * Gets the value of the Type field.
     * Type of the catastrophe (for example, ISO or internal).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.CatastropheType getType() {
      return (typekey.CatastropheType)__getInternalInterface().getFieldValue(TYPE_PROP.get());
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
     * An array of the catastrophe's zones.  If the filter criteria is set,
     * it filters the return set by the filter criteria.
     * @return an array of the zones that the catastrophe contains.
     */
    public java.lang.String[] getZoneCodes() {
      return ((gw.cc.catastrophe.entity.Catastrophe)__getDelegateManager().getImplementation("gw.cc.catastrophe.entity.Catastrophe")).getZoneCodes();
    }
    
    /**
     * Returns an alphabetized arraylist of the zones covered by the given catastrophe.
     * Zones are represented as strings.  Strips leading and trailing whitespace.
     * @return a list of zones
     */
    public java.util.List getZoneList() {
      return ((gw.cc.catastrophe.entity.Catastrophe)__getDelegateManager().getImplementation("gw.cc.catastrophe.entity.Catastrophe")).getZoneList();
    }
    
    /**
     * Returns an alphabetized arraylist of the zones covered by the given catastrophe.
     * Zones are represented as strings.  Strips leading and trailing whitespace.
     * @return a comma-separated list of zones
     */
    public java.lang.String getZones() {
      return ((gw.cc.catastrophe.entity.Catastrophe)__getDelegateManager().getImplementation("gw.cc.catastrophe.entity.Catastrophe")).getZones();
    }
    
    /**
     * Checks whether any claims are linked to the catastrophe.
     * @return <code>true</code> if there are claims associated the Catastrophe, else <code>false</code>
     */
    public boolean hasAssociatedClaims() {
      return ((gw.cc.catastrophe.entity.Catastrophe)__getDelegateManager().getImplementation("gw.cc.catastrophe.entity.Catastrophe")).hasAssociatedClaims();
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Gets the value of the Active field.
     * True if a catastrophe can be assigned to a new claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isActive() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(ACTIVE_PROP.get());
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
    
    /**
     * Gets the value of the ScheduleBatch field.
     * Boolean field to mark a catastrophe to be run in the CatastropheClaimFinder batch process.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isScheduleBatch() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(SCHEDULEBATCH_PROP.get());
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
     * Removes the given element from the CatastropheZones array. This is achieved by marking the element for removal.
     */
    public void removeFromCatastropheZones(entity.CatastropheZone element) {
      __getInternalInterface().removeArrayElement(CATASTROPHEZONES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the CatastropheZones array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromCatastropheZones(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CATASTROPHEZONES_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ClaimsHistory array. This is achieved by marking the element for removal.
     */
    public void removeFromClaimsHistory(entity.CatastropheClaimsHistory element) {
      __getInternalInterface().removeArrayElement(CLAIMSHISTORY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ClaimsHistory array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromClaimsHistory(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CLAIMSHISTORY_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Description_L10N_ARRAY array. This is achieved by marking the element for removal.
     */
    public void removeFromDescription_L10N_ARRAY(entity.Catastrophe_Description_L10N element) {
      __getInternalInterface().removeArrayElement(DESCRIPTION_L10N_ARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Description_L10N_ARRAY array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromDescription_L10N_ARRAY(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(DESCRIPTION_L10N_ARRAY_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Name_L10N_ARRAY array. This is achieved by marking the element for removal.
     */
    public void removeFromName_L10N_ARRAY(entity.Catastrophe_Name_L10N element) {
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
     * Removes the given element from the Perils array. This is achieved by marking the element for removal.
     */
    public void removeFromPerils(entity.CatastrophePeril element) {
      __getInternalInterface().removeArrayElement(PERILS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Perils array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromPerils(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(PERILS_PROP.get(), elementID);
    }
    
    /**
     * This will delete all null zones.
     */
    public void removeNullZones() {
      ((gw.cc.catastrophe.entity.Catastrophe)__getDelegateManager().getImplementation("gw.cc.catastrophe.entity.Catastrophe")).removeNullZones();
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the Active field.
     */
    public void setActive(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(ACTIVE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BottomRightLatitude field.
     */
    public void setBottomRightLatitude(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(BOTTOMRIGHTLATITUDE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BottomRightLongitude field.
     */
    public void setBottomRightLongitude(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(BOTTOMRIGHTLONGITUDE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CatastropheNumber field.
     */
    public void setCatastropheNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CATASTROPHENUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CatastropheValidFrom field.
     */
    public void setCatastropheValidFrom(java.util.Date value) {
      __getInternalInterface().setFieldValue(CATASTROPHEVALIDFROM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CatastropheValidTo field.
     */
    public void setCatastropheValidTo(java.util.Date value) {
      __getInternalInterface().setFieldValue(CATASTROPHEVALIDTO_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CatastropheZones field.
     */
    public void setCatastropheZones(entity.CatastropheZone[] value) {
      __getInternalInterface().setFieldValue(CATASTROPHEZONES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimsHistory field.
     */
    public void setClaimsHistory(entity.CatastropheClaimsHistory[] value) {
      __getInternalInterface().setFieldValue(CLAIMSHISTORY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Comments field.
     */
    public void setComments(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(COMMENTS_PROP.get(), value);
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
     * Sets the value of the Description field.
     */
    public void setDescription(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DESCRIPTION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Description_L10N_ARRAY field.
     */
    public void setDescription_L10N_ARRAY(entity.Catastrophe_Description_L10N[] value) {
      __getInternalInterface().setFieldValue(DESCRIPTION_L10N_ARRAY_PROP.get(), value);
    }
    
    /**
     * The filter criteria, used for the catastrophe UI only.
     * @param filterCriteria 
     */
    public void setFilterCriteria(gw.api.admin.ZoneSearchCriteria filterCriteria) {
      ((gw.cc.catastrophe.entity.Catastrophe)__getDelegateManager().getImplementation("gw.cc.catastrophe.entity.Catastrophe")).setFilterCriteria(filterCriteria);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LCOCode field.
     */
    public void setLCOCode(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(LCOCODE_PROP.get(), value);
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
    public void setName_L10N_ARRAY(entity.Catastrophe_Name_L10N[] value) {
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
     * Sets the value of the PCSCatastropheNumber field.
     */
    public void setPCSCatastropheNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(PCSCATASTROPHENUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Perils field.
     */
    public void setPerils(entity.CatastrophePeril[] value) {
      __getInternalInterface().setFieldValue(PERILS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PolicyEffectiveDate field.
     */
    public void setPolicyEffectiveDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(POLICYEFFECTIVEDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PolicyRetrievalCompletionTime field.
     */
    public void setPolicyRetrievalCompletionTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(POLICYRETRIEVALCOMPLETIONTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PolicyRetrievalSetTime field.
     */
    public void setPolicyRetrievalSetTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(POLICYRETRIEVALSETTIME_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
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
     * Sets the value of the ScheduleBatch field.
     */
    public void setScheduleBatch(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(SCHEDULEBATCH_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TopLeftLatitude field.
     */
    public void setTopLeftLatitude(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(TOPLEFTLATITUDE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TopLeftLongitude field.
     */
    public void setTopLeftLongitude(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(TOPLEFTLONGITUDE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Type field.
     */
    public void setType(typekey.CatastropheType value) {
      __getInternalInterface().setFieldValue(TYPE_PROP.get(), value);
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
    
    public void setZoneCodes(java.lang.String[] zones) {
      ((gw.cc.catastrophe.entity.Catastrophe)__getDelegateManager().getImplementation("gw.cc.catastrophe.entity.Catastrophe")).setZoneCodes(zones);
    }
    
    /**
     * Set the zones (comma-delimited list) for the catastrophe.
     * @param zones comman separated list of zones
     * @deprecated Catastrophe are heterogeneous therefore this method should not be used.
     */
    public void setZones(java.lang.String zones) {
      ((gw.cc.catastrophe.entity.Catastrophe)__getDelegateManager().getImplementation("gw.cc.catastrophe.entity.Catastrophe")).setZones(zones);
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
     * Validates all the zones for the catastrophe against zone data.
     * @return all the catastrophe zones that do not have a corresponding zone data in the database.
     */
    public entity.CatastropheZone[] validateZones() {
      return ((gw.cc.catastrophe.entity.Catastrophe)__getDelegateManager().getImplementation("gw.cc.catastrophe.entity.Catastrophe")).validateZones();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.messaging.EventAwarePublicMethods", "com.guidewire.pl.domain.messaging.impl.EventAwareImpl");
    config.put("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods", "com.guidewire.pl.domain.messaging.impl.EventAwareImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractEditableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.catastrophe.entity.Catastrophe", "com.guidewire.cc.domain.catastrophe.impl.CatastropheImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.Catastrophe.class, config);
    com.guidewire._generated.entity.CatastropheInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.Catastrophe, com.guidewire._generated.entity.CatastropheInternal>() {
      public java.lang.Object getImplementation(entity.Catastrophe bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.CatastropheInternal getInternalInterface(entity.Catastrophe bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.Catastrophe newEmptyInstance() {
        return new entity.Catastrophe((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}