package entity;

/**
 * DocumentSearchCriteria
 * 
 * Represents the criteria used in document searches. The criteria can include such things as the document name or ID, the documentauthor, the date, the related claim, exposure, matter, or claim contact, and similar items. ClaimCenter does not store this entity; it exists only for the search's duration.
 * <p>
 * If you configured a {@link com.guidewire.cc.plugin.document.IDocumentMetadataSource} implementation, then the system passes an instance of DocumentSearchCriteria to the searchDocuments method on that interface, and returns a {@link com.guidewire.cc.domain.document.DocumentSearchResult} instance any results for display in the UI.
 * <p>
 * If there is not an {@link com.guidewire.cc.plugin.document.IDocumentMetadataSource} interface configured, then any extensions fields included in the search criteria will also need to be configured through the search-config.xml file to be properly handled by the standard database query processing.
 *       
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DocumentSearchCriteria.eti;DocumentSearchCriteria.eix;DocumentSearchCriteria.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "DocumentSearchCriteria")
public class DocumentSearchCriteria extends com.guidewire.pl.persistence.code.BeanBase implements entity.Versionable, com.guidewire.cc.domain.relatedto.RelatedToBean, java.io.Serializable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.DocumentSearchCriteria> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.DocumentSearchCriteria>("entity.DocumentSearchCriteria");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> AUTHOR_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Author");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIM_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Claim");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIMCONTACT_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ClaimContact");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DESCRIPTION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Description");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DOCUMENTPUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DocumentPublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> DOCUMENTSECURITYTYPES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "DocumentSecurityTypes");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> EXPOSURE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Exposure");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INCLUDEOBSOLETES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "IncludeObsoletes");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LANGUAGE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Language");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> MATTER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Matter");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NAMEORID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NameOrID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PENDING_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Pending");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SECTION_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Section");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> SERVICEREQUEST_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ServiceRequest");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> STATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Status");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> TYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Type");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.DocumentSearchCriteriaInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public DocumentSearchCriteria()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public DocumentSearchCriteria(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected DocumentSearchCriteria(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.DocumentSearchCriteriaInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.DocumentSearchCriteriaInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the DocumentSecurityTypes array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDocumentSecurityTypes(entity.DocumentSecurityTypeSearchWrapper element) {
    __getInternalInterface().addArrayElement(DOCUMENTSECURITYTYPES_PROP.get(), element);
  }
  
  /**
   * Gets the value of the Author field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAuthor() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(AUTHOR_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the Claim field.
   * Associated claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim() {
    return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimContact field.
   * ClaimContact for RelatedTo search.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimContact getClaimContact() {
    return (entity.ClaimContact)__getInternalInterface().getFieldValue(CLAIMCONTACT_PROP.get());
  }
  
  public entity.Contact getClaimant() {
    return ((com.guidewire.cc.domain.document.impl.DocumentSearchCriteriaCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.document.impl.DocumentSearchCriteriaCoreExtMethods")).getClaimant();
  }
  
  public gw.pl.persistence.core.Key getClaimantID() {
    return ((com.guidewire.cc.domain.document.impl.DocumentSearchCriteriaCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.document.impl.DocumentSearchCriteriaCoreExtMethods")).getClaimantID();
  }
  
  /**
   * Gets the value of the Description field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
  }
  
  /**
   * Gets the value of the DocumentPublicID field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDocumentPublicID() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DOCUMENTPUBLICID_PROP.get());
  }
  
  /**
   * Gets the value of the DocumentSecurityTypes field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DocumentSecurityTypeSearchWrapper[] getDocumentSecurityTypes() {
    return (entity.DocumentSecurityTypeSearchWrapper[])__getInternalInterface().getFieldValue(DOCUMENTSECURITYTYPES_PROP.get());
  }
  
  /**
   * Gets the value of the Exposure field.
   * Exposure for RelatedTo search.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure getExposure() {
    return (entity.Exposure)__getInternalInterface().getFieldValue(EXPOSURE_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the Language field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LanguageType getLanguage() {
    return (typekey.LanguageType)__getInternalInterface().getFieldValue(LANGUAGE_PROP.get());
  }
  
  /**
   * Gets the value of the Matter field.
   * Matter for RelatedTo search.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Matter getMatter() {
    return (entity.Matter)__getInternalInterface().getFieldValue(MATTER_PROP.get());
  }
  
  /**
   * Gets the value of the NameOrID field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNameOrID() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NAMEORID_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Get the bean to which this bean is related
   */
  public gw.pl.persistence.core.Bean getRelatedTo() {
    return ((com.guidewire.cc.domain.relatedto.RelatedToBean)__getDelegateManager().getImplementation("com.guidewire.cc.domain.relatedto.RelatedToBean")).getRelatedTo();
  }
  
  /**
   * Gets the value of the Section field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DocumentSection getSection() {
    return (typekey.DocumentSection)__getInternalInterface().getFieldValue(SECTION_PROP.get());
  }
  
  /**
   * Gets the value of the ServiceRequest field.
   * ServiceRequest for RelatedTo search.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequest getServiceRequest() {
    return (entity.ServiceRequest)__getInternalInterface().getFieldValue(SERVICEREQUEST_PROP.get());
  }
  
  /**
   * Gets the value of the Status field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DocumentStatusType getStatus() {
    return (typekey.DocumentStatusType)__getInternalInterface().getFieldValue(STATUS_PROP.get());
  }
  
  /**
   * Gets the value of the Type field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DocumentType getType() {
    return (typekey.DocumentType)__getInternalInterface().getFieldValue(TYPE_PROP.get());
  }
  
  /**
   * Gets the value of the IncludeObsoletes field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIncludeObsoletes() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(INCLUDEOBSOLETES_PROP.get());
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
   * Gets the value of the Pending field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPending() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(PENDING_PROP.get());
  }
  
  /**
   * Returns a QueryProcessor containing {@link entity.Document} entities that match the
   * criteria specified by this entity.  This method needs to work with <code>IDocumentMetadataSource</code>
   * if enabled
   * @return a QueryProcessor containing {@link entity.Document} entities that match the criteria specified by this entity.
   */
  public gw.api.database.IQueryBeanResult performSearch() {
    return ((com.guidewire.pl.domain.document.DocumentSearchCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.DocumentSearchCriteriaPublicMethods")).performSearch();
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
   * Removes the given element from the DocumentSecurityTypes array. This is achieved by marking the element for removal.
   */
  public void removeFromDocumentSecurityTypes(entity.DocumentSecurityTypeSearchWrapper element) {
    __getInternalInterface().removeArrayElement(DOCUMENTSECURITYTYPES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the DocumentSecurityTypes array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDocumentSecurityTypes(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(DOCUMENTSECURITYTYPES_PROP.get(), elementID);
  }
  
  /**
   * Sets the value of the Author field.
   */
  public void setAuthor(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(AUTHOR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value) {
    __getInternalInterface().setFieldValue(CLAIM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimContact field.
   */
  public void setClaimContact(entity.ClaimContact value) {
    __getInternalInterface().setFieldValue(CLAIMCONTACT_PROP.get(), value);
  }
  
  public void setClaimant(entity.Contact value) {
    ((com.guidewire.cc.domain.document.impl.DocumentSearchCriteriaCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.document.impl.DocumentSearchCriteriaCoreExtMethods")).setClaimant(value);
  }
  
  public void setClaimantID(gw.pl.persistence.core.Key value) {
    ((com.guidewire.cc.domain.document.impl.DocumentSearchCriteriaCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.document.impl.DocumentSearchCriteriaCoreExtMethods")).setClaimantID(value);
  }
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(DESCRIPTION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DocumentPublicID field.
   */
  public void setDocumentPublicID(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(DOCUMENTPUBLICID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DocumentSecurityTypes field.
   */
  public void setDocumentSecurityTypes(entity.DocumentSecurityTypeSearchWrapper[] value) {
    __getInternalInterface().setFieldValue(DOCUMENTSECURITYTYPES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Exposure field.
   */
  public void setExposure(entity.Exposure value) {
    __getInternalInterface().setFieldValue(EXPOSURE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the IncludeObsoletes field.
   */
  public void setIncludeObsoletes(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(INCLUDEOBSOLETES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Language field.
   */
  public void setLanguage(typekey.LanguageType value) {
    __getInternalInterface().setFieldValue(LANGUAGE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Matter field.
   */
  public void setMatter(entity.Matter value) {
    __getInternalInterface().setFieldValue(MATTER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the NameOrID field.
   */
  public void setNameOrID(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(NAMEORID_PROP.get(), value);
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
   * Sets the value of the Pending field.
   */
  public void setPending(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(PENDING_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Set the bean to which this bean is related
   * @param relatedTo 
   */
  public void setRelatedTo(gw.pl.persistence.core.Bean relatedTo) {
    ((com.guidewire.cc.domain.relatedto.RelatedToBean)__getDelegateManager().getImplementation("com.guidewire.cc.domain.relatedto.RelatedToBean")).setRelatedTo(relatedTo);
  }
  
  /**
   * Sets the value of the Section field.
   */
  public void setSection(typekey.DocumentSection value) {
    __getInternalInterface().setFieldValue(SECTION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ServiceRequest field.
   */
  public void setServiceRequest(entity.ServiceRequest value) {
    __getInternalInterface().setFieldValue(SERVICEREQUEST_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Status field.
   */
  public void setStatus(typekey.DocumentStatusType value) {
    __getInternalInterface().setFieldValue(STATUS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Type field.
   */
  public void setType(typekey.DocumentType value) {
    __getInternalInterface().setFieldValue(TYPE_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.DocumentSearchCriteriaInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.DocumentSearchCriteria.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the DocumentSecurityTypes array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToDocumentSecurityTypes(entity.DocumentSecurityTypeSearchWrapper element) {
      __getInternalInterface().addArrayElement(DOCUMENTSECURITYTYPES_PROP.get(), element);
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
    
    public com.guidewire.pl.system.database.Query findDocuments() {
      return ((com.guidewire.pl.domain.document.impl.DocumentSearchCriteriaInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.impl.DocumentSearchCriteriaInternalMethods")).findDocuments();
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
     * Gets the value of the Author field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getAuthor() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(AUTHOR_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the Claim field.
     * Associated claim
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Claim getClaim() {
      return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimContact field.
     * ClaimContact for RelatedTo search.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClaimContact getClaimContact() {
      return (entity.ClaimContact)__getInternalInterface().getFieldValue(CLAIMCONTACT_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getClaimContactID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIMCONTACT_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getClaimID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIM_PROP.get());
    }
    
    public entity.Contact getClaimant() {
      return ((com.guidewire.cc.domain.document.impl.DocumentSearchCriteriaCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.document.impl.DocumentSearchCriteriaCoreExtMethods")).getClaimant();
    }
    
    public gw.pl.persistence.core.Key getClaimantID() {
      return ((com.guidewire.cc.domain.document.impl.DocumentSearchCriteriaCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.document.impl.DocumentSearchCriteriaCoreExtMethods")).getClaimantID();
    }
    
    /**
     * Gets the value of the Description field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDescription() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
    }
    
    /**
     * Gets the value of the DocumentPublicID field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDocumentPublicID() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DOCUMENTPUBLICID_PROP.get());
    }
    
    /**
     * Gets the value of the DocumentSecurityTypes field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.DocumentSecurityTypeSearchWrapper[] getDocumentSecurityTypes() {
      return (entity.DocumentSecurityTypeSearchWrapper[])__getInternalInterface().getFieldValue(DOCUMENTSECURITYTYPES_PROP.get());
    }
    
    /**
     * Gets the value of the Exposure field.
     * Exposure for RelatedTo search.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Exposure getExposure() {
      return (entity.Exposure)__getInternalInterface().getFieldValue(EXPOSURE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getExposureID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(EXPOSURE_PROP.get());
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
     * Gets the value of the Language field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LanguageType getLanguage() {
      return (typekey.LanguageType)__getInternalInterface().getFieldValue(LANGUAGE_PROP.get());
    }
    
    public java.util.List<typekey.DocumentSecurityType> getLegalDocumentSecurityTypesForCurrentUser() {
      return ((com.guidewire.pl.domain.document.impl.DocumentSearchCriteriaInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.impl.DocumentSearchCriteriaInternalMethods")).getLegalDocumentSecurityTypesForCurrentUser();
    }
    
    /**
     * Gets the value of the Matter field.
     * Matter for RelatedTo search.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Matter getMatter() {
      return (entity.Matter)__getInternalInterface().getFieldValue(MATTER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getMatterID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(MATTER_PROP.get());
    }
    
    /**
     * Gets the value of the NameOrID field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getNameOrID() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NAMEORID_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Get the bean to which this bean is related
     */
    public gw.pl.persistence.core.Bean getRelatedTo() {
      return ((com.guidewire.cc.domain.relatedto.RelatedToBean)__getDelegateManager().getImplementation("com.guidewire.cc.domain.relatedto.RelatedToBean")).getRelatedTo();
    }
    
    /**
     * Gets the value of the Section field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.DocumentSection getSection() {
      return (typekey.DocumentSection)__getInternalInterface().getFieldValue(SECTION_PROP.get());
    }
    
    /**
     * Gets the value of the ServiceRequest field.
     * ServiceRequest for RelatedTo search.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ServiceRequest getServiceRequest() {
      return (entity.ServiceRequest)__getInternalInterface().getFieldValue(SERVICEREQUEST_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getServiceRequestID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(SERVICEREQUEST_PROP.get());
    }
    
    /**
     * Gets the value of the Status field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.DocumentStatusType getStatus() {
      return (typekey.DocumentStatusType)__getInternalInterface().getFieldValue(STATUS_PROP.get());
    }
    
    /**
     * Gets the value of the Type field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.DocumentType getType() {
      return (typekey.DocumentType)__getInternalInterface().getFieldValue(TYPE_PROP.get());
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Gets the value of the IncludeObsoletes field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isIncludeObsoletes() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(INCLUDEOBSOLETES_PROP.get());
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
     * Gets the value of the Pending field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isPending() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(PENDING_PROP.get());
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
    
    /**
     * Returns a QueryProcessor containing {@link entity.Document} entities that match the
     * criteria specified by this entity.  This method needs to work with <code>IDocumentMetadataSource</code>
     * if enabled
     * @return a QueryProcessor containing {@link entity.Document} entities that match the criteria specified by this entity.
     */
    public gw.api.database.IQueryBeanResult performSearch() {
      return ((com.guidewire.pl.domain.document.DocumentSearchCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.DocumentSearchCriteriaPublicMethods")).performSearch();
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
     * Removes the given element from the DocumentSecurityTypes array. This is achieved by marking the element for removal.
     */
    public void removeFromDocumentSecurityTypes(entity.DocumentSecurityTypeSearchWrapper element) {
      __getInternalInterface().removeArrayElement(DOCUMENTSECURITYTYPES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the DocumentSecurityTypes array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromDocumentSecurityTypes(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(DOCUMENTSECURITYTYPES_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the Author field.
     */
    public void setAuthor(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(AUTHOR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Claim field.
     */
    public void setClaim(entity.Claim value) {
      __getInternalInterface().setFieldValue(CLAIM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimContact field.
     */
    public void setClaimContact(entity.ClaimContact value) {
      __getInternalInterface().setFieldValue(CLAIMCONTACT_PROP.get(), value);
    }
    
    public void setClaimContactID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLAIMCONTACT_PROP.get(), value);
    }
    
    public void setClaimID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLAIM_PROP.get(), value);
    }
    
    public void setClaimant(entity.Contact value) {
      ((com.guidewire.cc.domain.document.impl.DocumentSearchCriteriaCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.document.impl.DocumentSearchCriteriaCoreExtMethods")).setClaimant(value);
    }
    
    public void setClaimantID(gw.pl.persistence.core.Key value) {
      ((com.guidewire.cc.domain.document.impl.DocumentSearchCriteriaCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.document.impl.DocumentSearchCriteriaCoreExtMethods")).setClaimantID(value);
    }
    
    /**
     * Sets the value of the Description field.
     */
    public void setDescription(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DESCRIPTION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DocumentPublicID field.
     */
    public void setDocumentPublicID(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DOCUMENTPUBLICID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DocumentSecurityTypes field.
     */
    public void setDocumentSecurityTypes(entity.DocumentSecurityTypeSearchWrapper[] value) {
      __getInternalInterface().setFieldValue(DOCUMENTSECURITYTYPES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Exposure field.
     */
    public void setExposure(entity.Exposure value) {
      __getInternalInterface().setFieldValue(EXPOSURE_PROP.get(), value);
    }
    
    public void setExposureID(gw.pl.persistence.core.Key value) {
      setFieldValue(EXPOSURE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the IncludeObsoletes field.
     */
    public void setIncludeObsoletes(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(INCLUDEOBSOLETES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Language field.
     */
    public void setLanguage(typekey.LanguageType value) {
      __getInternalInterface().setFieldValue(LANGUAGE_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Sets the value of the Matter field.
     */
    public void setMatter(entity.Matter value) {
      __getInternalInterface().setFieldValue(MATTER_PROP.get(), value);
    }
    
    public void setMatterID(gw.pl.persistence.core.Key value) {
      setFieldValue(MATTER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the NameOrID field.
     */
    public void setNameOrID(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(NAMEORID_PROP.get(), value);
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
     * Sets the value of the Pending field.
     */
    public void setPending(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(PENDING_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Set the bean to which this bean is related
     * @param relatedTo 
     */
    public void setRelatedTo(gw.pl.persistence.core.Bean relatedTo) {
      ((com.guidewire.cc.domain.relatedto.RelatedToBean)__getDelegateManager().getImplementation("com.guidewire.cc.domain.relatedto.RelatedToBean")).setRelatedTo(relatedTo);
    }
    
    /**
     * Sets the value of the Section field.
     */
    public void setSection(typekey.DocumentSection value) {
      __getInternalInterface().setFieldValue(SECTION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ServiceRequest field.
     */
    public void setServiceRequest(entity.ServiceRequest value) {
      __getInternalInterface().setFieldValue(SERVICEREQUEST_PROP.get(), value);
    }
    
    public void setServiceRequestID(gw.pl.persistence.core.Key value) {
      setFieldValue(SERVICEREQUEST_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Status field.
     */
    public void setStatus(typekey.DocumentStatusType value) {
      __getInternalInterface().setFieldValue(STATUS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Type field.
     */
    public void setType(typekey.DocumentType value) {
      __getInternalInterface().setFieldValue(TYPE_PROP.get(), value);
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
    config.put("com.guidewire.cc.domain.document.impl.DocumentSearchCriteriaCoreExtMethods", "com.guidewire.cc.domain.document.impl.DocumentSearchCriteriaCoreExtMethodsImpl");
    config.put("com.guidewire.cc.domain.relatedto.RelatedToBean", "com.guidewire.cc.domain.relatedto.RelatedToBeanImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.document.DocumentSearchCriteriaPublicMethods", "com.guidewire.pl.domain.document.impl.DocumentSearchCriteriaImpl");
    config.put("com.guidewire.pl.domain.document.impl.DocumentSearchCriteriaInternalMethods", "com.guidewire.pl.domain.document.impl.DocumentSearchCriteriaImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.io.Serializable", "com.guidewire.pl.domain.document.impl.DocumentSearchCriteriaImpl");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.DocumentSearchCriteria.class, config);
    com.guidewire._generated.entity.DocumentSearchCriteriaInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.DocumentSearchCriteria, com.guidewire._generated.entity.DocumentSearchCriteriaInternal>() {
      public java.lang.Object getImplementation(entity.DocumentSearchCriteria bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.DocumentSearchCriteriaInternal getInternalInterface(entity.DocumentSearchCriteria bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.DocumentSearchCriteria newEmptyInstance() {
        return new entity.DocumentSearchCriteria((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}