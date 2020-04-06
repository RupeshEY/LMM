package entity;

/**
 * ClaimInfoCriteria
 * 
 *         Encapsulates the search criteria for a ClaimInfo search. The system does not store ClaimInfoSearchCriteria entities,
 *         they are exist only for a search and are discarded after use.
 *       
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimInfoCriteria.eti;ClaimInfoCriteria.eix;ClaimInfoCriteria.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ClaimInfoCriteria")
public class ClaimInfoCriteria extends com.guidewire.pl.persistence.code.BeanBase implements entity.Versionable, java.io.Serializable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ClaimInfoCriteria> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ClaimInfoCriteria>("entity.ClaimInfoCriteria");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ADDRESSCRITERIA_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "AddressCriteria");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CLAIMSEARCHTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ClaimSearchType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> FREETEXTCLAIMSEARCHTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "FreeTextClaimSearchType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> FREETEXTNAMESEARCHTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "FreeTextNameSearchType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> NAMECRITERIA_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "NameCriteria");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> NAMESEARCHTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "NameSearchType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> POLICYNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PolicyNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SUBTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Subtype");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UCR_EXT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UCR_Ext");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UMR_EXT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UMR_Ext");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.ClaimInfoCriteriaInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ClaimInfoCriteria()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ClaimInfoCriteria(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ClaimInfoCriteria(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.ClaimInfoCriteriaInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.ClaimInfoCriteriaInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the AddressCriteria field.
   * Set of criteria to match by address.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Address getAddressCriteria() {
    return (entity.Address)__getInternalInterface().getFieldValue(ADDRESSCRITERIA_PROP.get());
  }
  
  /**
   * Get the number of archived claims
   * @return 
   * @deprecated Use gw.cc.claim.archiving.entity.ClaimInfoCriteria#hasArchivedClaims() instead.
   */
  public int getArchivedCount() {
    return ((gw.cc.claim.archiving.entity.ClaimInfoCriteria)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfoCriteria")).getArchivedCount();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the ClaimNumber field.
   * Match by claim number.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMNUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimSearchType field.
   * The type of claim search to perform.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimSearchType getClaimSearchType() {
    return (typekey.ClaimSearchType)__getInternalInterface().getFieldValue(CLAIMSEARCHTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the FreeTextClaimSearchType field.
   * The type of claim search to perform.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.FreeTextClaimSearchType getFreeTextClaimSearchType() {
    return (typekey.FreeTextClaimSearchType)__getInternalInterface().getFieldValue(FREETEXTCLAIMSEARCHTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the FreeTextNameSearchType field.
   * Type of name search for claim search.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.FreTxtClmSrchNameSrchTyp getFreeTextNameSearchType() {
    return (typekey.FreTxtClmSrchNameSrchTyp)__getInternalInterface().getFieldValue(FREETEXTNAMESEARCHTYPE_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the NameCriteria field.
   * Set of criteria to match by name.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CCNameCriteria getNameCriteria() {
    return (entity.CCNameCriteria)__getInternalInterface().getFieldValue(NAMECRITERIA_PROP.get());
  }
  
  /**
   * Gets the value of the NameSearchType field.
   * Type of name search for claim search.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimSearchNameSearchType getNameSearchType() {
    return (typekey.ClaimSearchNameSearchType)__getInternalInterface().getFieldValue(NAMESEARCHTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the PolicyNumber field.
   * Match by policy number.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicyNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICYNUMBER_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimInfoCriteria getSubtype() {
    return (typekey.ClaimInfoCriteria)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
  }
  
  /**
   */
  @gw.lang.Deprecated(value = "This method was accidentally exposed, and will be removed from the public API in the future.  The alternative would be to call performInfoSearch().SummaryProcessor, though in theory there should never be a need to separately obtain a summary row IQueryBeanResult.")
  public gw.api.database.IQueryResult<? extends gw.pl.persistence.core.Bean, gw.api.database.QueryRow> getSummaryRow() {
    return ((gw.cc.claim.archiving.entity.ClaimInfoCriteria)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfoCriteria")).getSummaryRow();
  }
  
  /**
   * Gets the value of the UCR_Ext field.
   * A Unique Claim Reference (UCR) Number
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getUCR_Ext() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(UCR_EXT_PROP.get());
  }
  
  /**
   * Gets the value of the UMR_Ext field.
   * A Unique Market Reference (UMR) Number
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getUMR_Ext() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(UMR_EXT_PROP.get());
  }
  
  /**
   * 
   * @return true if there are archived claims that match the search criteria
   */
  public boolean hasArchivedClaims() {
    return ((gw.cc.claim.archiving.entity.ClaimInfoCriteria)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfoCriteria")).hasArchivedClaims();
  }
  
  /**
   * 
   * @return true if the claim search is for live claims only.
   */
  public boolean isActiveSearch() {
    return ((gw.cc.claim.archiving.entity.ClaimInfoCriteria)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfoCriteria")).isActiveSearch();
  }
  
  /**
   * 
   * @return true if the claim search is for archived claims only.
   */
  public boolean isArchivedSearch() {
    return ((gw.cc.claim.archiving.entity.ClaimInfoCriteria)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfoCriteria")).isArchivedSearch();
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
   * Returns a Claim query to find all claims that match this criteria.
   * When run, the resulting query will return {@link entity.ClaimInfo} entities.
   */
  @gw.lang.Deprecated(value = "This method was accidentally exposed, and will be removed from the public API in the future.  One of the performInfoSearch() or performInfoSearchWithoutSummary( ) methods should be used instead.")
  public com.guidewire.pl.system.database.Query makeQuery() {
    return ((gw.cc.claim.archiving.entity.ClaimInfoCriteria)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfoCriteria")).makeQuery();
  }
  
  /**
   * Returns a Claim query to find all claims that match this criteria.
   * When run, the resulting query will return {@link entity.ClaimInfoSearchView}
   * entities.
   */
  @gw.lang.Deprecated(value = "This method was accidentally exposed, and will be removed from the public API in the future.  One of the performInfoSearch() or performInfoSearchWithoutSummary( ) methods should be used instead.")
  public com.guidewire.pl.system.database.Query makeViewQuery() {
    return ((gw.cc.claim.archiving.entity.ClaimInfoCriteria)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfoCriteria")).makeViewQuery();
  }
  
  /**
   * Performs the search based on the criteria that have been established.
   * @return A QueryProcessorWithSummaryQuery containing the results of the query, including the appropriate summary row
   */
  public gw.api.database.StandardQueryBeanResultWithSummary<gw.pl.persistence.core.Bean> performInfoSearch() {
    return ((gw.cc.claim.archiving.entity.ClaimInfoCriteria)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfoCriteria")).performInfoSearch();
  }
  
  /**
   * Performs the search based on the criteria that have been established.
   * @return A QueryProcessor containing the results of the query, without any summary row
   */
  public gw.api.database.IQueryBeanResult<entity.ClaimInfoSearchView> performInfoSearchWithoutSummary() {
    return ((gw.cc.claim.archiving.entity.ClaimInfoCriteria)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfoCriteria")).performInfoSearchWithoutSummary();
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
   * Sets the value of the AddressCriteria field.
   */
  public void setAddressCriteria(entity.Address value) {
    __getInternalInterface().setFieldValue(ADDRESSCRITERIA_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimNumber field.
   */
  public void setClaimNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CLAIMNUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimSearchType field.
   */
  public void setClaimSearchType(typekey.ClaimSearchType value) {
    __getInternalInterface().setFieldValue(CLAIMSEARCHTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FreeTextClaimSearchType field.
   */
  public void setFreeTextClaimSearchType(typekey.FreeTextClaimSearchType value) {
    __getInternalInterface().setFieldValue(FREETEXTCLAIMSEARCHTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FreeTextNameSearchType field.
   */
  public void setFreeTextNameSearchType(typekey.FreTxtClmSrchNameSrchTyp value) {
    __getInternalInterface().setFieldValue(FREETEXTNAMESEARCHTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the NameCriteria field.
   */
  public void setNameCriteria(entity.CCNameCriteria value) {
    __getInternalInterface().setFieldValue(NAMECRITERIA_PROP.get(), value);
  }
  
  /**
   * Sets the value of the NameSearchType field.
   */
  public void setNameSearchType(typekey.ClaimSearchNameSearchType value) {
    __getInternalInterface().setFieldValue(NAMESEARCHTYPE_PROP.get(), value);
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
   * Sets the value of the PolicyNumber field.
   */
  public void setPolicyNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(POLICYNUMBER_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the Subtype field.
   */
  private void setSubtype(typekey.ClaimInfoCriteria value) {
    __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UCR_Ext field.
   */
  public void setUCR_Ext(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(UCR_EXT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UMR_Ext field.
   */
  public void setUMR_Ext(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(UMR_EXT_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ClaimInfoCriteriaInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ClaimInfoCriteria.this.__getDelegateManager();
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
     * Gets the value of the AddressCriteria field.
     * Set of criteria to match by address.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Address getAddressCriteria() {
      return (entity.Address)__getInternalInterface().getFieldValue(ADDRESSCRITERIA_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getAddressCriteriaID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ADDRESSCRITERIA_PROP.get());
    }
    
    /**
     * Get the number of archived claims
     * @return 
     * @deprecated Use gw.cc.claim.archiving.entity.ClaimInfoCriteria#hasArchivedClaims() instead.
     */
    public int getArchivedCount() {
      return ((gw.cc.claim.archiving.entity.ClaimInfoCriteria)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfoCriteria")).getArchivedCount();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the ClaimNumber field.
     * Match by claim number.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getClaimNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMNUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimSearchType field.
     * The type of claim search to perform.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ClaimSearchType getClaimSearchType() {
      return (typekey.ClaimSearchType)__getInternalInterface().getFieldValue(CLAIMSEARCHTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the FreeTextClaimSearchType field.
     * The type of claim search to perform.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.FreeTextClaimSearchType getFreeTextClaimSearchType() {
      return (typekey.FreeTextClaimSearchType)__getInternalInterface().getFieldValue(FREETEXTCLAIMSEARCHTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the FreeTextNameSearchType field.
     * Type of name search for claim search.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.FreTxtClmSrchNameSrchTyp getFreeTextNameSearchType() {
      return (typekey.FreTxtClmSrchNameSrchTyp)__getInternalInterface().getFieldValue(FREETEXTNAMESEARCHTYPE_PROP.get());
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
     * Gets the value of the NameCriteria field.
     * Set of criteria to match by name.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.CCNameCriteria getNameCriteria() {
      return (entity.CCNameCriteria)__getInternalInterface().getFieldValue(NAMECRITERIA_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getNameCriteriaID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(NAMECRITERIA_PROP.get());
    }
    
    /**
     * Gets the value of the NameSearchType field.
     * Type of name search for claim search.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ClaimSearchNameSearchType getNameSearchType() {
      return (typekey.ClaimSearchNameSearchType)__getInternalInterface().getFieldValue(NAMESEARCHTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the PolicyNumber field.
     * Match by policy number.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPolicyNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICYNUMBER_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the Subtype field.
     * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ClaimInfoCriteria getSubtype() {
      return (typekey.ClaimInfoCriteria)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
    }
    
    /**
     */
    @gw.lang.Deprecated(value = "This method was accidentally exposed, and will be removed from the public API in the future.  The alternative would be to call performInfoSearch().SummaryProcessor, though in theory there should never be a need to separately obtain a summary row IQueryBeanResult.")
    public gw.api.database.IQueryResult<? extends gw.pl.persistence.core.Bean, gw.api.database.QueryRow> getSummaryRow() {
      return ((gw.cc.claim.archiving.entity.ClaimInfoCriteria)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfoCriteria")).getSummaryRow();
    }
    
    /**
     * Gets the value of the UCR_Ext field.
     * A Unique Claim Reference (UCR) Number
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getUCR_Ext() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(UCR_EXT_PROP.get());
    }
    
    /**
     * Gets the value of the UMR_Ext field.
     * A Unique Market Reference (UMR) Number
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getUMR_Ext() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(UMR_EXT_PROP.get());
    }
    
    /**
     * 
     * @return true if there are archived claims that match the search criteria
     */
    public boolean hasArchivedClaims() {
      return ((gw.cc.claim.archiving.entity.ClaimInfoCriteria)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfoCriteria")).hasArchivedClaims();
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * 
     * @return true if the claim search is for live claims only.
     */
    public boolean isActiveSearch() {
      return ((gw.cc.claim.archiving.entity.ClaimInfoCriteria)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfoCriteria")).isActiveSearch();
    }
    
    /**
     * 
     * @return true if the claim search is for archived claims only.
     */
    public boolean isArchivedSearch() {
      return ((gw.cc.claim.archiving.entity.ClaimInfoCriteria)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfoCriteria")).isArchivedSearch();
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
    
    /**
     * Returns a Claim query to find all claims that match this criteria.
     * When run, the resulting query will return {@link entity.ClaimInfo} entities.
     */
    @gw.lang.Deprecated(value = "This method was accidentally exposed, and will be removed from the public API in the future.  One of the performInfoSearch() or performInfoSearchWithoutSummary( ) methods should be used instead.")
    public com.guidewire.pl.system.database.Query makeQuery() {
      return ((gw.cc.claim.archiving.entity.ClaimInfoCriteria)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfoCriteria")).makeQuery();
    }
    
    /**
     * Returns a Claim query to find all claims that match this criteria.
     * When run, the resulting query will return {@link entity.ClaimInfoSearchView}
     * entities.
     */
    @gw.lang.Deprecated(value = "This method was accidentally exposed, and will be removed from the public API in the future.  One of the performInfoSearch() or performInfoSearchWithoutSummary( ) methods should be used instead.")
    public com.guidewire.pl.system.database.Query makeViewQuery() {
      return ((gw.cc.claim.archiving.entity.ClaimInfoCriteria)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfoCriteria")).makeViewQuery();
    }
    
    public entity.KeyableBean overrideBundleAdd(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleAdd(bundle);
    }
    
    public entity.KeyableBean overrideBundleRemove(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleRemove(bundle);
    }
    
    /**
     * Performs the search based on the criteria that have been established.
     * @return A QueryProcessorWithSummaryQuery containing the results of the query, including the appropriate summary row
     */
    public gw.api.database.StandardQueryBeanResultWithSummary<gw.pl.persistence.core.Bean> performInfoSearch() {
      return ((gw.cc.claim.archiving.entity.ClaimInfoCriteria)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfoCriteria")).performInfoSearch();
    }
    
    /**
     * Performs the search based on the criteria that have been established.
     * @return A QueryProcessor containing the results of the query, without any summary row
     */
    public gw.api.database.IQueryBeanResult<entity.ClaimInfoSearchView> performInfoSearchWithoutSummary() {
      return ((gw.cc.claim.archiving.entity.ClaimInfoCriteria)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfoCriteria")).performInfoSearchWithoutSummary();
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
     * Sets the value of the AddressCriteria field.
     */
    public void setAddressCriteria(entity.Address value) {
      __getInternalInterface().setFieldValue(ADDRESSCRITERIA_PROP.get(), value);
    }
    
    public void setAddressCriteriaID(gw.pl.persistence.core.Key value) {
      setFieldValue(ADDRESSCRITERIA_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimNumber field.
     */
    public void setClaimNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CLAIMNUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimSearchType field.
     */
    public void setClaimSearchType(typekey.ClaimSearchType value) {
      __getInternalInterface().setFieldValue(CLAIMSEARCHTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FreeTextClaimSearchType field.
     */
    public void setFreeTextClaimSearchType(typekey.FreeTextClaimSearchType value) {
      __getInternalInterface().setFieldValue(FREETEXTCLAIMSEARCHTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FreeTextNameSearchType field.
     */
    public void setFreeTextNameSearchType(typekey.FreTxtClmSrchNameSrchTyp value) {
      __getInternalInterface().setFieldValue(FREETEXTNAMESEARCHTYPE_PROP.get(), value);
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
     * Sets the value of the NameCriteria field.
     */
    public void setNameCriteria(entity.CCNameCriteria value) {
      __getInternalInterface().setFieldValue(NAMECRITERIA_PROP.get(), value);
    }
    
    public void setNameCriteriaID(gw.pl.persistence.core.Key value) {
      setFieldValue(NAMECRITERIA_PROP.get(), value);
    }
    
    /**
     * Sets the value of the NameSearchType field.
     */
    public void setNameSearchType(typekey.ClaimSearchNameSearchType value) {
      __getInternalInterface().setFieldValue(NAMESEARCHTYPE_PROP.get(), value);
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
     * Sets the value of the PolicyNumber field.
     */
    public void setPolicyNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(POLICYNUMBER_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the Subtype field.
     */
    public void setSubtype(typekey.ClaimInfoCriteria value) {
      __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UCR_Ext field.
     */
    public void setUCR_Ext(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(UCR_EXT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UMR_Ext field.
     */
    public void setUMR_Ext(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(UMR_EXT_PROP.get(), value);
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
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.claim.archiving.entity.ClaimInfoCriteria", "com.guidewire.cc.domain.claim.archiving.impl.ClaimInfoCriteriaImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.io.Serializable", "com.guidewire.cc.domain.claim.archiving.impl.ClaimInfoCriteriaImpl");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ClaimInfoCriteria.class, config);
    com.guidewire._generated.entity.ClaimInfoCriteriaInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ClaimInfoCriteria, com.guidewire._generated.entity.ClaimInfoCriteriaInternal>() {
      public java.lang.Object getImplementation(entity.ClaimInfoCriteria bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ClaimInfoCriteriaInternal getInternalInterface(entity.ClaimInfoCriteria bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ClaimInfoCriteria newEmptyInstance() {
        return new entity.ClaimInfoCriteria((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}