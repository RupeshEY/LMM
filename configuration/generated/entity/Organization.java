package entity;

/**
 * Organization
 * Defines an organization that has a hierarchy of groups
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Organization.eti;Organization.eix;Organization.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "Organization")
public class Organization extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.EventAware {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.Organization> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.Organization>("entity.Organization");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CARRIER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Carrier");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CONTACT_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Contact");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MASTERADMIN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MasterAdmin");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Name");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NAMEDENORM_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NameDenorm");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NAMEKANJI_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NameKanji");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> ORGGROUPARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "OrggroupArray");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ROOTGROUP_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "RootGroup");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> TYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Type");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> ZONESTOADMIN_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ZonesToAdmin");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.OrganizationInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  public static final gw.api.community.PublicOrganizationFinder finder = com.guidewire.cc.domain.community.impl.OrganizationCoreExtMethods.finder;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public Organization()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public Organization(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected Organization(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.OrganizationInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.OrganizationInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
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
   * Adds the given element to the ZonesToAdmin array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToZonesToAdmin(entity.OrganizationZoneAdmin element) {
    __getInternalInterface().addArrayElement(ZONESTOADMIN_PROP.get(), element);
  }
  
  /**
   * Return an array of the zone codes of all zones that are of the
   * specified type and linked to the specified zone and that are
   * visible to this organization.
   * @param zoneType the zone type
   * @param linkedZone the linked zone, can be null; it is assumed
   * that the linked zone is visible to the organzation.
   * @return an array of zone codes satisfying the above criteria.
   */
  public java.lang.String[] findVisibleZoneCodes(typekey.ZoneType zoneType, entity.Zone linkedZone) {
    return ((com.guidewire.pl.domain.community.OrganizationPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.OrganizationPublicMethods")).findVisibleZoneCodes(zoneType, linkedZone);
  }
  
  /**
   * Returns the visible zones for this organization.
   * @return an Query of the available zone codes
   */
  public com.guidewire.pl.system.database.Query findVisibleZoneIds() {
    return ((com.guidewire.pl.domain.community.OrganizationPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.OrganizationPublicMethods")).findVisibleZoneIds();
  }
  
  /**
   * Returns the visible zones of the given zone type for this organization.
   * @param zoneType the zone type
   * @return an Query of the available zones of the given zone type
   */
  public com.guidewire.pl.system.database.Query findVisibleZones(typekey.ZoneType zoneType) {
    return ((com.guidewire.pl.domain.community.OrganizationPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.OrganizationPublicMethods")).findVisibleZones(zoneType);
  }
  
  public entity.Zone[] findZones(typekey.ZoneType zoneType, java.lang.String[] zoneCodes) {
    return ((com.guidewire.pl.domain.community.OrganizationPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.OrganizationPublicMethods")).findZones(zoneType, zoneCodes);
  }
  
  /**
   * 
   * @return All users in this tree of organization. Does not include users in child organization trees.
   */
  public gw.api.database.IQueryBeanResult<entity.User> getAllUsers() {
    return ((com.guidewire.pl.domain.community.OrganizationPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.OrganizationPublicMethods")).getAllUsers();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the Contact field.
   * Contact entry related to the organization.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getContact() {
    return (entity.Contact)__getInternalInterface().getFieldValue(CONTACT_PROP.get());
  }
  
  /**
   * Returns the country to which this organization belongs.
   * The country is defined by the zones on the organization.
   * If no zones are defined for the organization, this returns
   * the default country.
   * @return the organization's country if one is defined,
   * otherwise, the default country.
   */
  public java.util.List<typekey.Country> getCountries() {
    return ((com.guidewire.pl.domain.community.OrganizationPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.OrganizationPublicMethods")).getCountries();
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
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the Name field.
   * The name of the organization.
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
  public java.lang.String getNameDenorm() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NAMEDENORM_PROP.get());
  }
  
  /**
   * Gets the value of the NameKanji field.
   * The kanji name of the organization. Used only for Japanese and will be null otherwise.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNameKanji() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NAMEKANJI_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Orggroup[] getOrggroupArray() {
    return (entity.Orggroup[])__getInternalInterface().getFieldValue(ORGGROUPARRAY_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
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
   * Gets the value of the RootGroup field.
   * The organization's root group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getRootGroup() {
    return (entity.Group)__getInternalInterface().getFieldValue(ROOTGROUP_PROP.get());
  }
  
  /**
   * Gets the value of the Type field.
   * The type of the organization.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.BusinessType getType() {
    return (typekey.BusinessType)__getInternalInterface().getFieldValue(TYPE_PROP.get());
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
   * Returns the available zones.
   * @param zoneType the desired type of zones
   * @return an array of the available zone codes
   */
  public java.lang.String[] getZoneRange(typekey.ZoneType zoneType) {
    return ((com.guidewire.pl.domain.community.OrganizationPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.OrganizationPublicMethods")).getZoneRange(zoneType);
  }
  
  /**
   * Returns the business week's zones.
   * @return an array of the codes of zones that use this business week
   *         (should be empty if AppliesToAllZones is true)
   */
  public java.lang.String[] getZonesArray() {
    return ((com.guidewire.pl.domain.community.OrganizationPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.OrganizationPublicMethods")).getZonesArray();
  }
  
  /**
   * Returns the zones that t.
   * @return a comma-separated string of the string codes of the zones that use this business week,
   *         in alphabetical order
   */
  public java.lang.String getZonesString() {
    return ((com.guidewire.pl.domain.community.OrganizationPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.OrganizationPublicMethods")).getZonesString();
  }
  
  /**
   * Gets the value of the ZonesToAdmin field.
   * Link to joiner table for zones to admin.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.OrganizationZoneAdmin[] getZonesToAdmin() {
    return (entity.OrganizationZoneAdmin[])__getInternalInterface().getFieldValue(ZONESTOADMIN_PROP.get());
  }
  
  /**
   * Returns true if the provided zone is set as an AdminZone on this Organization.
   * @param zoneCode the desired type of zones
   * @return true if the zone exists for this Org
   */
  public boolean hasZone(java.lang.String zoneCode) {
    return ((com.guidewire.pl.domain.community.OrganizationPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.OrganizationPublicMethods")).hasZone(zoneCode);
  }
  
  /**
   * Gets the value of the Carrier field.
   * Flag indicating whether this organization corresponds to the carrier itself.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCarrier() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(CARRIER_PROP.get());
  }
  
  /**
   * Gets the value of the MasterAdmin field.
   * Flag indicating whether this organization is the superuser organization with admin powers over all organizations.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isMasterAdmin() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(MASTERADMIN_PROP.get());
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
   * Tests if the organization can be safely deleted. Returns false if
   * <ul>
   * <li>The organization is the carrier organization.
   * <li>The organization has any users.
   * <li>The root group of the organization cannot be
   * {@link entity.Group#isSafeToDelete() safely deleted}.
   * </ul>
   * @return True if the user can be safely deleted.
   */
  public boolean isSafeToDelete() {
    return ((com.guidewire.pl.domain.community.OrganizationPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.OrganizationPublicMethods")).isSafeToDelete();
  }
  
  /**
   * Determines if the input zone is visible to this organization.
   * @param country the country
   * @param zoneType the zone type
   * @param zoneCode the zone code
   * @return true if the zone is visible to the organization
   * and it exists in the zone lookup table, false otherwise.
   */
  public boolean isZoneVisible(typekey.Country country, typekey.ZoneType zoneType, java.lang.String zoneCode) {
    return ((com.guidewire.pl.domain.community.OrganizationPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.OrganizationPublicMethods")).isZoneVisible(country, zoneType, zoneCode);
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
   * Removes the given element from the ZonesToAdmin array. This is achieved by marking the element for removal.
   */
  public void removeFromZonesToAdmin(entity.OrganizationZoneAdmin element) {
    __getInternalInterface().removeArrayElement(ZONESTOADMIN_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the ZonesToAdmin array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromZonesToAdmin(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(ZONESTOADMIN_PROP.get(), elementID);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Carrier field.
   */
  public void setCarrier(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(CARRIER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Contact field.
   */
  public void setContact(entity.Contact value) {
    __getInternalInterface().setFieldValue(CONTACT_PROP.get(), value);
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
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MasterAdmin field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setMasterAdmin(java.lang.Boolean value) {
    ((com.guidewire.pl.domain.community.OrganizationPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.OrganizationPublicMethods")).setMasterAdmin(value);
  }
  
  /**
   * Sets the value of the Name field.
   */
  private void setName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(NAME_PROP.get(), value);
  }
  
  /**
   * Sets the name of the organization to name and if the root group is non-null sets its name as well.
   * @param name the name to set
   */
  public void setNameAndRootGroupName(java.lang.String name) {
    ((com.guidewire.pl.domain.community.OrganizationPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.OrganizationPublicMethods")).setNameAndRootGroupName(name);
  }
  
  /**
   * Sets the value of the NameDenorm field.
   */
  private void setNameDenorm(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(NAMEDENORM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the NameKanji field.
   */
  public void setNameKanji(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(NAMEKANJI_PROP.get(), value);
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
   * Sets the value of the OrggroupArray field.
   */
  private void setOrggroupArray(entity.Orggroup[] value) {
    __getInternalInterface().setFieldValue(ORGGROUPARRAY_PROP.get(), value);
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
   * Sets the value of the RootGroup field.
   */
  private void setRootGroup(entity.Group value) {
    __getInternalInterface().setFieldValue(ROOTGROUP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Type field.
   */
  public void setType(typekey.BusinessType value) {
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
  
  public void setZonesArray(java.lang.String[] zoneCodes) {
    ((com.guidewire.pl.domain.community.OrganizationPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.OrganizationPublicMethods")).setZonesArray(zoneCodes);
  }
  
  /**
   * Sets the zones that use this business week.
   * @param zonesString a comma-separated string of the string codes of the zones that use this business week
   */
  public void setZonesString(java.lang.String zonesString) {
    ((com.guidewire.pl.domain.community.OrganizationPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.OrganizationPublicMethods")).setZonesString(zonesString);
  }
  
  /**
   * Sets the value of the ZonesToAdmin field.
   */
  public void setZonesToAdmin(entity.OrganizationZoneAdmin[] value) {
    __getInternalInterface().setFieldValue(ZONESTOADMIN_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.OrganizationInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.Organization.this.__getDelegateManager();
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
     * Adds the given element to the OrggroupArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToOrggroupArray(entity.Orggroup element) {
      __getInternalInterface().addArrayElement(ORGGROUPARRAY_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ZonesToAdmin array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToZonesToAdmin(entity.OrganizationZoneAdmin element) {
      __getInternalInterface().addArrayElement(ZONESTOADMIN_PROP.get(), element);
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
    }
    
    public void beforeRemove() {
      ((com.guidewire.pl.system.bundle.RemoveCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.RemoveCallback")).beforeRemove();
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
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
    }
    
    /**
     * Return an array of the zone codes of all zones that are of the
     * specified type and linked to the specified zone and that are
     * visible to this organization.
     * @param zoneType the zone type
     * @param linkedZone the linked zone, can be null; it is assumed
     * that the linked zone is visible to the organzation.
     * @return an array of zone codes satisfying the above criteria.
     */
    public java.lang.String[] findVisibleZoneCodes(typekey.ZoneType zoneType, entity.Zone linkedZone) {
      return ((com.guidewire.pl.domain.community.OrganizationPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.OrganizationPublicMethods")).findVisibleZoneCodes(zoneType, linkedZone);
    }
    
    /**
     * Returns the visible zones for this organization.
     * @return an Query of the available zone codes
     */
    public com.guidewire.pl.system.database.Query findVisibleZoneIds() {
      return ((com.guidewire.pl.domain.community.OrganizationPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.OrganizationPublicMethods")).findVisibleZoneIds();
    }
    
    /**
     * Returns the visible zones of the given zone type for this organization.
     * @param zoneType the zone type
     * @return an Query of the available zones of the given zone type
     */
    public com.guidewire.pl.system.database.Query findVisibleZones(typekey.ZoneType zoneType) {
      return ((com.guidewire.pl.domain.community.OrganizationPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.OrganizationPublicMethods")).findVisibleZones(zoneType);
    }
    
    public entity.Zone[] findZones(typekey.ZoneType zoneType, java.lang.String[] zoneCodes) {
      return ((com.guidewire.pl.domain.community.OrganizationPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.OrganizationPublicMethods")).findZones(zoneType, zoneCodes);
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
    
    /**
     * 
     * @return All users in this tree of organization. Does not include users in child organization trees.
     */
    public gw.api.database.IQueryBeanResult<entity.User> getAllUsers() {
      return ((com.guidewire.pl.domain.community.OrganizationPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.OrganizationPublicMethods")).getAllUsers();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the Contact field.
     * Contact entry related to the organization.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Contact getContact() {
      return (entity.Contact)__getInternalInterface().getFieldValue(CONTACT_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getContactID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CONTACT_PROP.get());
    }
    
    /**
     * Returns the country to which this organization belongs.
     * The country is defined by the zones on the organization.
     * If no zones are defined for the organization, this returns
     * the default country.
     * @return the organization's country if one is defined,
     * otherwise, the default country.
     */
    public java.util.List<typekey.Country> getCountries() {
      return ((com.guidewire.pl.domain.community.OrganizationPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.OrganizationPublicMethods")).getCountries();
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
    
    public com.guidewire.pl.system.entity.BeanEvent[] getEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).getEvents();
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
     * Gets the value of the Name field.
     * The name of the organization.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NAME_PROP.get());
    }
    
    /**
     * Gets the value of the NameDenorm field.
     * denorm field for Name
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getNameDenorm() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NAMEDENORM_PROP.get());
    }
    
    /**
     * Gets the value of the NameKanji field.
     * The kanji name of the organization. Used only for Japanese and will be null otherwise.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getNameKanji() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NAMEKANJI_PROP.get());
    }
    
    /**
     * Gets the value of the OrggroupArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Orggroup[] getOrggroupArray() {
      return (entity.Orggroup[])__getInternalInterface().getFieldValue(ORGGROUPARRAY_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
    }
    
    /**
     * Gets the value of the RootGroup field.
     * The organization's root group.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Group getRootGroup() {
      return (entity.Group)__getInternalInterface().getFieldValue(ROOTGROUP_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getRootGroupID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ROOTGROUP_PROP.get());
    }
    
    /**
     * Gets the value of the Type field.
     * The type of the organization.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.BusinessType getType() {
      return (typekey.BusinessType)__getInternalInterface().getFieldValue(TYPE_PROP.get());
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
     * Returns the available zones.
     * @param zoneType the desired type of zones
     * @return an array of the available zone codes
     */
    public java.lang.String[] getZoneRange(typekey.ZoneType zoneType) {
      return ((com.guidewire.pl.domain.community.OrganizationPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.OrganizationPublicMethods")).getZoneRange(zoneType);
    }
    
    /**
     * Returns the business week's zones.
     * @return an array of the codes of zones that use this business week
     *         (should be empty if AppliesToAllZones is true)
     */
    public java.lang.String[] getZonesArray() {
      return ((com.guidewire.pl.domain.community.OrganizationPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.OrganizationPublicMethods")).getZonesArray();
    }
    
    /**
     * Returns the zones that t.
     * @return a comma-separated string of the string codes of the zones that use this business week,
     *         in alphabetical order
     */
    public java.lang.String getZonesString() {
      return ((com.guidewire.pl.domain.community.OrganizationPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.OrganizationPublicMethods")).getZonesString();
    }
    
    /**
     * Gets the value of the ZonesToAdmin field.
     * Link to joiner table for zones to admin.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.OrganizationZoneAdmin[] getZonesToAdmin() {
      return (entity.OrganizationZoneAdmin[])__getInternalInterface().getFieldValue(ZONESTOADMIN_PROP.get());
    }
    
    /**
     * Returns true if the provided zone is set as an AdminZone on this Organization.
     * @param zoneCode the desired type of zones
     * @return true if the zone exists for this Org
     */
    public boolean hasZone(java.lang.String zoneCode) {
      return ((com.guidewire.pl.domain.community.OrganizationPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.OrganizationPublicMethods")).hasZone(zoneCode);
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Gets the value of the Carrier field.
     * Flag indicating whether this organization corresponds to the carrier itself.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isCarrier() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(CARRIER_PROP.get());
    }
    
    /**
     * Gets the value of the MasterAdmin field.
     * Flag indicating whether this organization is the superuser organization with admin powers over all organizations.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isMasterAdmin() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(MASTERADMIN_PROP.get());
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
     * Tests if the organization can be safely deleted. Returns false if
     * <ul>
     * <li>The organization is the carrier organization.
     * <li>The organization has any users.
     * <li>The root group of the organization cannot be
     * {@link entity.Group#isSafeToDelete() safely deleted}.
     * </ul>
     * @return True if the user can be safely deleted.
     */
    public boolean isSafeToDelete() {
      return ((com.guidewire.pl.domain.community.OrganizationPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.OrganizationPublicMethods")).isSafeToDelete();
    }
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    /**
     * Determines if the input zone is visible to this organization.
     * @param country the country
     * @param zoneType the zone type
     * @param zoneCode the zone code
     * @return true if the zone is visible to the organization
     * and it exists in the zone lookup table, false otherwise.
     */
    public boolean isZoneVisible(typekey.Country country, typekey.ZoneType zoneType, java.lang.String zoneCode) {
      return ((com.guidewire.pl.domain.community.OrganizationPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.OrganizationPublicMethods")).isZoneVisible(country, zoneType, zoneCode);
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
     * Removes the given element from the OrggroupArray array. This is achieved by marking the element for removal.
     */
    public void removeFromOrggroupArray(entity.Orggroup element) {
      __getInternalInterface().removeArrayElement(ORGGROUPARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the OrggroupArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromOrggroupArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(ORGGROUPARRAY_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ZonesToAdmin array. This is achieved by marking the element for removal.
     */
    public void removeFromZonesToAdmin(entity.OrganizationZoneAdmin element) {
      __getInternalInterface().removeArrayElement(ZONESTOADMIN_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ZonesToAdmin array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromZonesToAdmin(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(ZONESTOADMIN_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Carrier field.
     */
    public void setCarrier(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(CARRIER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Contact field.
     */
    public void setContact(entity.Contact value) {
      __getInternalInterface().setFieldValue(CONTACT_PROP.get(), value);
    }
    
    public void setContactID(gw.pl.persistence.core.Key value) {
      setFieldValue(CONTACT_PROP.get(), value);
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
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Sets the value of the MasterAdmin field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setMasterAdmin(java.lang.Boolean value) {
      ((com.guidewire.pl.domain.community.OrganizationPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.OrganizationPublicMethods")).setMasterAdmin(value);
    }
    
    /**
     * Sets the value of the Name field.
     */
    public void setName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(NAME_PROP.get(), value);
    }
    
    /**
     * Sets the name of the organization to name and if the root group is non-null sets its name as well.
     * @param name the name to set
     */
    public void setNameAndRootGroupName(java.lang.String name) {
      ((com.guidewire.pl.domain.community.OrganizationPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.OrganizationPublicMethods")).setNameAndRootGroupName(name);
    }
    
    /**
     * Sets the value of the NameDenorm field.
     */
    public void setNameDenorm(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(NAMEDENORM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the NameKanji field.
     */
    public void setNameKanji(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(NAMEKANJI_PROP.get(), value);
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
     * Sets the value of the OrggroupArray field.
     */
    public void setOrggroupArray(entity.Orggroup[] value) {
      __getInternalInterface().setFieldValue(ORGGROUPARRAY_PROP.get(), value);
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
     * Sets the value of the RootGroup field.
     */
    public void setRootGroup(entity.Group value) {
      __getInternalInterface().setFieldValue(ROOTGROUP_PROP.get(), value);
    }
    
    public void setRootGroupID(gw.pl.persistence.core.Key value) {
      setFieldValue(ROOTGROUP_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Type field.
     */
    public void setType(typekey.BusinessType value) {
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
    
    public void setZonesArray(java.lang.String[] zoneCodes) {
      ((com.guidewire.pl.domain.community.OrganizationPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.OrganizationPublicMethods")).setZonesArray(zoneCodes);
    }
    
    /**
     * Sets the zones that use this business week.
     * @param zonesString a comma-separated string of the string codes of the zones that use this business week
     */
    public void setZonesString(java.lang.String zonesString) {
      ((com.guidewire.pl.domain.community.OrganizationPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.OrganizationPublicMethods")).setZonesString(zonesString);
    }
    
    /**
     * Sets the value of the ZonesToAdmin field.
     */
    public void setZonesToAdmin(entity.OrganizationZoneAdmin[] value) {
      __getInternalInterface().setFieldValue(ZONESTOADMIN_PROP.get(), value);
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
    config.put("com.guidewire.cc.domain.community.impl.OrganizationCoreExtMethods", "com.guidewire.cc.domain.community.impl.OrganizationCoreExtMethodsImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.community.OrganizationPublicMethods", "com.guidewire.pl.domain.community.impl.OrganizationImpl");
    config.put("com.guidewire.pl.domain.community.impl.OrganizationInternalMethods", "com.guidewire.pl.domain.community.impl.OrganizationImpl");
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
    config.put("com.guidewire.pl.system.bundle.RemoveCallback", "com.guidewire.pl.domain.community.impl.OrganizationImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.Organization.class, config);
    com.guidewire._generated.entity.OrganizationInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.Organization, com.guidewire._generated.entity.OrganizationInternal>() {
      public java.lang.Object getImplementation(entity.Organization bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.OrganizationInternal getInternalInterface(entity.Organization bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.Organization newEmptyInstance() {
        return new entity.Organization((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}