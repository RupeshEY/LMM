package entity;

/**
 * ProximitySearchParameters
 * <p>
 *       Encapsulates the set of additional criteria needed to perform a proximity search. This entity is
 *       a child object to the <code>ContactSearchCriteria</code> entity.
 *       </p><p>
 *       Note that there are two ways to specify the origin location for a proximity search: the Geocode fields on
 *       the <code>ProximitySearchParameters</code> itself (SpatialPoint/GeocodeStatus) or the
 *       <code>ConstactSearchCriteria.ProximitySearchCenter</code> field. If both are set prior to performing the search,
 *       the system will use Geocode fields and ignore the <code>ProximitySearchCenter</code> field.</p>
 *       <p>
 *       See <code>ContactSearchCriteria</code> for more information
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ProximitySearchParameters.eti;ProximitySearchParameters.eix;ProximitySearchParameters.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ProximitySearchParameters")
public class ProximitySearchParameters extends com.guidewire.pl.persistence.code.BeanBase implements entity.Versionable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ProximitySearchParameters> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ProximitySearchParameters>("entity.ProximitySearchParameters");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CORRECTEDSEARCHCENTER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CorrectedSearchCenter");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DISTANCEBASEDSEARCH_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DistanceBasedSearch");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> GEOCODESTATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "GeocodeStatus");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Number");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RADIUSSEARCHMAXRESULTS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RadiusSearchMaxResults");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SAVEDSEARCHCENTER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SavedSearchCenter");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SPATIALPOINT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SpatialPoint");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> UNITOFDISTANCE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "UnitOfDistance");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.ProximitySearchParametersInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ProximitySearchParameters()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ProximitySearchParameters(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ProximitySearchParameters(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.ProximitySearchParametersInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.ProximitySearchParametersInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Checks if the proximity search parameters have a valid longitude and latitude
   * such that a search can be completed without a proximitySearchCenter set.
   * @return true, if the fields are filled in appropriately
   */
  public boolean containsValidGeocodeForSearch() {
    return ((com.guidewire.pl.domain.contact.ProximitySearchParametersPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ProximitySearchParametersPublicMethods")).containsValidGeocodeForSearch();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the CorrectedSearchCenter field.
   * The corrected address (if any) corresponding to the SpatialPoint of that is being searched for, in localized/user-displayable form. This is normally set by the ProximitySearchPageHelper.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCorrectedSearchCenter() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CORRECTEDSEARCHCENTER_PROP.get());
  }
  
  /**
   * Gets the value of the GeocodeStatus field.
   * Gives the status of the provided SpatialPoint; this is normally copied from the a Geocodable entity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.GeocodeStatus getGeocodeStatus() {
    return (typekey.GeocodeStatus)__getInternalInterface().getFieldValue(GEOCODESTATUS_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Returns a localized, human-readable string for indicated search, such as "10 miles" or "5 closest".
   * @return a localized, human-readable string
   */
  public java.lang.String getLabel() {
    return ((com.guidewire.pl.domain.contact.ProximitySearchParametersPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ProximitySearchParametersPublicMethods")).getLabel();
  }
  
  /**
   * Gets the value of the Number field.
   * Indicates either the radius (in UnitOfDistance units) if a distance based search, or the number of results to return if an ordinal search.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNumber() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(NUMBER_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the RadiusSearchMaxResults field.
   * Indicates the maximum number of items to return on a radius search.  Ignored if DistanceBasedSearch is false; if DistanceBasedSearch is true, and this value is null, zero, or negative, the search will be limited by the value of ProximityRadiusSearchDefaultMaxResultCount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getRadiusSearchMaxResults() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(RADIUSSEARCHMAXRESULTS_PROP.get());
  }
  
  /**
   * Gets the value of the SavedSearchCenter field.
   * Used internally by ProximitySearchPageHelper to save the search center address (if any) in standardized form; DO NOT USE unless you are overriding the standard performProximitySearch() method.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSavedSearchCenter() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SAVEDSEARCHCENTER_PROP.get());
  }
  
  /**
   * Gets the value of the SpatialPoint field.
   * SpatialPoint to do a proximity search from; this is normally copied from the a Geocodable entity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.database.spatial.SpatialPoint getSpatialPoint() {
    return (gw.api.database.spatial.SpatialPoint)__getInternalInterface().getFieldValue(SPATIALPOINT_PROP.get());
  }
  
  /**
   * Gets the value of the UnitOfDistance field.
   * Indicates the UnitOfDistance to use, both to return distances in results and to indicate the unit of radius for distance-based searches.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.UnitOfDistance getUnitOfDistance() {
    return (typekey.UnitOfDistance)__getInternalInterface().getFieldValue(UNITOFDISTANCE_PROP.get());
  }
  
  /**
   * Returns a localized, human-readable string for the type of search, either the Unit of Distance or
   * a localized string indicating "closest."
   * @return a localized, human-readable string
   */
  public java.lang.String getUnitsString() {
    return ((com.guidewire.pl.domain.contact.ProximitySearchParametersPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ProximitySearchParametersPublicMethods")).getUnitsString();
  }
  
  /**
   * Gets the value of the DistanceBasedSearch field.
   * Indicates whether this is a distance based search (within n-mi/km) or an ordinal search (nearest-n)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isDistanceBasedSearch() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(DISTANCEBASEDSEARCH_PROP.get());
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
   * Checks if fields are populated indicating that a proximity search is intended.
   * Note that this does not
   * @return true, if the fields are filled in appropriately
   */
  public boolean isSearchValid() {
    return ((com.guidewire.pl.domain.contact.ProximitySearchParametersPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ProximitySearchParametersPublicMethods")).isSearchValid();
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
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CorrectedSearchCenter field.
   */
  public void setCorrectedSearchCenter(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CORRECTEDSEARCHCENTER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DistanceBasedSearch field.
   */
  public void setDistanceBasedSearch(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(DISTANCEBASEDSEARCH_PROP.get(), value);
  }
  
  /**
   * Takes a Latitude and Longitude pair, and sets the SpatialPoint and GeocodeStatus based on them.
   * @param latitude 
   * @param longitude 
   */
  public void setGeocodeFieldsFromLatLong(java.math.BigDecimal latitude, java.math.BigDecimal longitude) {
    ((com.guidewire.pl.domain.contact.ProximitySearchParametersPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ProximitySearchParametersPublicMethods")).setGeocodeFieldsFromLatLong(latitude, longitude);
  }
  
  /**
   * Sets the value of the GeocodeStatus field.
   */
  public void setGeocodeStatus(typekey.GeocodeStatus value) {
    __getInternalInterface().setFieldValue(GEOCODESTATUS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
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
   * Sets the value of the Number field.
   */
  public void setNumber(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(NUMBER_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the RadiusSearchMaxResults field.
   */
  public void setRadiusSearchMaxResults(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(RADIUSSEARCHMAXRESULTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SavedSearchCenter field.
   */
  public void setSavedSearchCenter(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(SAVEDSEARCHCENTER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SpatialPoint field.
   */
  public void setSpatialPoint(gw.api.database.spatial.SpatialPoint value) {
    __getInternalInterface().setFieldValue(SPATIALPOINT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UnitOfDistance field.
   */
  public void setUnitOfDistance(typekey.UnitOfDistance value) {
    __getInternalInterface().setFieldValue(UNITOFDISTANCE_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ProximitySearchParametersInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ProximitySearchParameters.this.__getDelegateManager();
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
     * Checks if the proximity search parameters have a valid longitude and latitude
     * such that a search can be completed without a proximitySearchCenter set.
     * @return true, if the fields are filled in appropriately
     */
    public boolean containsValidGeocodeForSearch() {
      return ((com.guidewire.pl.domain.contact.ProximitySearchParametersPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ProximitySearchParametersPublicMethods")).containsValidGeocodeForSearch();
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
     * Gets the value of the CorrectedSearchCenter field.
     * The corrected address (if any) corresponding to the SpatialPoint of that is being searched for, in localized/user-displayable form. This is normally set by the ProximitySearchPageHelper.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getCorrectedSearchCenter() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CORRECTEDSEARCHCENTER_PROP.get());
    }
    
    /**
     * Gets the value of the GeocodeStatus field.
     * Gives the status of the provided SpatialPoint; this is normally copied from the a Geocodable entity.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.GeocodeStatus getGeocodeStatus() {
      return (typekey.GeocodeStatus)__getInternalInterface().getFieldValue(GEOCODESTATUS_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
    }
    
    public gw.pl.persistence.core.Key getIdToSetForForeignKey(gw.entity.ILinkPropertyInfo link) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).getIdToSetForForeignKey(link);
    }
    
    public java.lang.String[] getIndicesForDrivingInfo() {
      return ((com.guidewire.pl.domain.contact.impl.ProximitySearchParametersInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.ProximitySearchParametersInternalMethods")).getIndicesForDrivingInfo();
    }
    
    /**
     * Returns a localized, human-readable string for indicated search, such as "10 miles" or "5 closest".
     * @return a localized, human-readable string
     */
    public java.lang.String getLabel() {
      return ((com.guidewire.pl.domain.contact.ProximitySearchParametersPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ProximitySearchParametersPublicMethods")).getLabel();
    }
    
    /**
     * Gets the value of the Number field.
     * Indicates either the radius (in UnitOfDistance units) if a distance based search, or the number of results to return if an ordinal search.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getNumber() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(NUMBER_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the RadiusSearchMaxResults field.
     * Indicates the maximum number of items to return on a radius search.  Ignored if DistanceBasedSearch is false; if DistanceBasedSearch is true, and this value is null, zero, or negative, the search will be limited by the value of ProximityRadiusSearchDefaultMaxResultCount
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getRadiusSearchMaxResults() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(RADIUSSEARCHMAXRESULTS_PROP.get());
    }
    
    /**
     * Gets the value of the SavedSearchCenter field.
     * Used internally by ProximitySearchPageHelper to save the search center address (if any) in standardized form; DO NOT USE unless you are overriding the standard performProximitySearch() method.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getSavedSearchCenter() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SAVEDSEARCHCENTER_PROP.get());
    }
    
    /**
     * Gets the value of the SpatialPoint field.
     * SpatialPoint to do a proximity search from; this is normally copied from the a Geocodable entity.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.database.spatial.SpatialPoint getSpatialPoint() {
      return (gw.api.database.spatial.SpatialPoint)__getInternalInterface().getFieldValue(SPATIALPOINT_PROP.get());
    }
    
    /**
     * Gets the value of the UnitOfDistance field.
     * Indicates the UnitOfDistance to use, both to return distances in results and to indicate the unit of radius for distance-based searches.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.UnitOfDistance getUnitOfDistance() {
      return (typekey.UnitOfDistance)__getInternalInterface().getFieldValue(UNITOFDISTANCE_PROP.get());
    }
    
    /**
     * Returns a localized, human-readable string for the type of search, either the Unit of Distance or
     * a localized string indicating "closest."
     * @return a localized, human-readable string
     */
    public java.lang.String getUnitsString() {
      return ((com.guidewire.pl.domain.contact.ProximitySearchParametersPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ProximitySearchParametersPublicMethods")).getUnitsString();
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Gets the value of the DistanceBasedSearch field.
     * Indicates whether this is a distance based search (within n-mi/km) or an ordinal search (nearest-n)
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isDistanceBasedSearch() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(DISTANCEBASEDSEARCH_PROP.get());
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
     * Checks if fields are populated indicating that a proximity search is intended.
     * Note that this does not
     * @return true, if the fields are filled in appropriately
     */
    public boolean isSearchValid() {
      return ((com.guidewire.pl.domain.contact.ProximitySearchParametersPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ProximitySearchParametersPublicMethods")).isSearchValid();
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
    
    public <T extends entity.KeyableBean> gw.api.database.IQueryBeanResult<T> performSearch(com.guidewire.pl.system.database.impl.QueryImpl<T> query, com.guidewire.pl.system.database.TableObjectColumn column, java.lang.String beanPathToSpatialColumn) {
      return ((com.guidewire.pl.domain.contact.impl.ProximitySearchParametersInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.ProximitySearchParametersInternalMethods")).performSearch(query, column, beanPathToSpatialColumn);
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
     * Sets the value of the CorrectedSearchCenter field.
     */
    public void setCorrectedSearchCenter(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CORRECTEDSEARCHCENTER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DistanceBasedSearch field.
     */
    public void setDistanceBasedSearch(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(DISTANCEBASEDSEARCH_PROP.get(), value);
    }
    
    /**
     * Takes a Latitude and Longitude pair, and sets the SpatialPoint and GeocodeStatus based on them.
     * @param latitude 
     * @param longitude 
     */
    public void setGeocodeFieldsFromLatLong(java.math.BigDecimal latitude, java.math.BigDecimal longitude) {
      ((com.guidewire.pl.domain.contact.ProximitySearchParametersPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ProximitySearchParametersPublicMethods")).setGeocodeFieldsFromLatLong(latitude, longitude);
    }
    
    /**
     * Sets the value of the GeocodeStatus field.
     */
    public void setGeocodeStatus(typekey.GeocodeStatus value) {
      __getInternalInterface().setFieldValue(GEOCODESTATUS_PROP.get(), value);
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
     * Set a flag denoting that the currently instantiated object has been newly imported from
     * an external source
     * @param newlyImported 
     */
    public void setNewlyImported(boolean newlyImported) {
      ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
    }
    
    /**
     * Sets the value of the Number field.
     */
    public void setNumber(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(NUMBER_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the RadiusSearchMaxResults field.
     */
    public void setRadiusSearchMaxResults(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(RADIUSSEARCHMAXRESULTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SavedSearchCenter field.
     */
    public void setSavedSearchCenter(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(SAVEDSEARCHCENTER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SpatialPoint field.
     */
    public void setSpatialPoint(gw.api.database.spatial.SpatialPoint value) {
      __getInternalInterface().setFieldValue(SPATIALPOINT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UnitOfDistance field.
     */
    public void setUnitOfDistance(typekey.UnitOfDistance value) {
      __getInternalInterface().setFieldValue(UNITOFDISTANCE_PROP.get(), value);
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
    config.put("com.guidewire.pl.domain.contact.ProximitySearchParametersPublicMethods", "com.guidewire.pl.domain.contact.impl.ProximitySearchParametersImpl");
    config.put("com.guidewire.pl.domain.contact.impl.ProximitySearchParametersInternalMethods", "com.guidewire.pl.domain.contact.impl.ProximitySearchParametersImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ProximitySearchParameters.class, config);
    com.guidewire._generated.entity.ProximitySearchParametersInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ProximitySearchParameters, com.guidewire._generated.entity.ProximitySearchParametersInternal>() {
      public java.lang.Object getImplementation(entity.ProximitySearchParameters bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ProximitySearchParametersInternal getInternalInterface(entity.ProximitySearchParameters bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ProximitySearchParameters newEmptyInstance() {
        return new entity.ProximitySearchParameters((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}