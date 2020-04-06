package entity;

/**
 * NoteSearchCriteria
 * 
 *             Non-persistent set of criteria to use in searching for a specific note.
 *             This can include such things as the note topic or text, the note author, the date,
 *             the related claim or exposure, and similar items.
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "NoteSearchCriteria.eti;NoteSearchCriteria.eix;NoteSearchCriteria.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "NoteSearchCriteria")
public class NoteSearchCriteria extends com.guidewire.pl.persistence.code.BeanBase implements entity.Versionable, java.io.Serializable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.NoteSearchCriteria> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.NoteSearchCriteria>("entity.NoteSearchCriteria");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ACTIVITY_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Activity");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> AUTHOR_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Author");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIM_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Claim");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIMCONTACT_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ClaimContact");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> DATECRITERIONCHOICE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "DateCriterionChoice");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> EXPOSURE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Exposure");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LANGUAGE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Language");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> MATTER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Matter");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> SERVICEREQUEST_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ServiceRequest");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SORTASCENDING_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SortAscending");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SORTBY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "SortBy");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TEXT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Text");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> TOPIC_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Topic");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.NoteSearchCriteriaInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public NoteSearchCriteria()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public NoteSearchCriteria(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected NoteSearchCriteria(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.NoteSearchCriteriaInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.NoteSearchCriteriaInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the Activity field.
   * Activity note is assigned to
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Activity getActivity() {
    return (entity.Activity)__getInternalInterface().getFieldValue(ACTIVITY_PROP.get());
  }
  
  /**
   * Gets the value of the Author field.
   * Note author
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getAuthor() {
    return (entity.User)__getInternalInterface().getFieldValue(AUTHOR_PROP.get());
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
    return ((com.guidewire.cc.domain.note.impl.NoteSearchCriteriaCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.note.impl.NoteSearchCriteriaCoreExtMethods")).getClaimant();
  }
  
  public gw.pl.persistence.core.Key getClaimantID() {
    return ((com.guidewire.cc.domain.note.impl.NoteSearchCriteriaCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.note.impl.NoteSearchCriteriaCoreExtMethods")).getClaimantID();
  }
  
  /**
   * Gets the value of the DateCriterionChoice field.
   * Date search
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DateCriterionChoice getDateCriterionChoice() {
    return (entity.DateCriterionChoice)__getInternalInterface().getFieldValue(DATECRITERIONCHOICE_PROP.get());
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
   * Language search
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
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  public gw.pl.persistence.core.Bean getRelatedTo() {
    return ((com.guidewire.cc.domain.note.impl.NoteSearchCriteriaCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.note.impl.NoteSearchCriteriaCoreExtMethods")).getRelatedTo();
  }
  
  /**
   * Gets the value of the ServiceRequest field.
   * Service Request for RelatedTo search.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequest getServiceRequest() {
    return (entity.ServiceRequest)__getInternalInterface().getFieldValue(SERVICEREQUEST_PROP.get());
  }
  
  /**
   * Gets the value of the SortBy field.
   * Options to sort the list of notes
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SortByRange getSortBy() {
    return (typekey.SortByRange)__getInternalInterface().getFieldValue(SORTBY_PROP.get());
  }
  
  /**
   * Gets the value of the Text field.
   * Text search
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getText() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TEXT_PROP.get());
  }
  
  /**
   * Gets the value of the Topic field.
   * Topic search
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.NoteTopicType getTopic() {
    return (typekey.NoteTopicType)__getInternalInterface().getFieldValue(TOPIC_PROP.get());
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
   * Gets the value of the SortAscending field.
   * Sort ascending or not
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isSortAscending() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(SORTASCENDING_PROP.get());
  }
  
  public gw.api.database.IQueryBeanResult performSearch(entity.Claim claim) {
    return ((com.guidewire.cc.domain.note.impl.NoteSearchCriteriaCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.note.impl.NoteSearchCriteriaCoreExtMethods")).performSearch(claim);
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
   * Sets the value of the Activity field.
   */
  public void setActivity(entity.Activity value) {
    __getInternalInterface().setFieldValue(ACTIVITY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Author field.
   */
  public void setAuthor(entity.User value) {
    __getInternalInterface().setFieldValue(AUTHOR_PROP.get(), value);
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
    ((com.guidewire.cc.domain.note.impl.NoteSearchCriteriaCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.note.impl.NoteSearchCriteriaCoreExtMethods")).setClaimant(value);
  }
  
  public void setClaimantID(gw.pl.persistence.core.Key value) {
    ((com.guidewire.cc.domain.note.impl.NoteSearchCriteriaCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.note.impl.NoteSearchCriteriaCoreExtMethods")).setClaimantID(value);
  }
  
  /**
   * Sets the value of the DateCriterionChoice field.
   */
  public void setDateCriterionChoice(entity.DateCriterionChoice value) {
    __getInternalInterface().setFieldValue(DATECRITERIONCHOICE_PROP.get(), value);
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
  
  public void setRelatedTo(gw.pl.persistence.core.Bean relatedTo) {
    ((com.guidewire.cc.domain.note.impl.NoteSearchCriteriaCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.note.impl.NoteSearchCriteriaCoreExtMethods")).setRelatedTo(relatedTo);
  }
  
  /**
   * Sets the value of the ServiceRequest field.
   */
  public void setServiceRequest(entity.ServiceRequest value) {
    __getInternalInterface().setFieldValue(SERVICEREQUEST_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SortAscending field.
   */
  public void setSortAscending(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(SORTASCENDING_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SortBy field.
   */
  public void setSortBy(typekey.SortByRange value) {
    __getInternalInterface().setFieldValue(SORTBY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Text field.
   */
  public void setText(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(TEXT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Topic field.
   */
  public void setTopic(typekey.NoteTopicType value) {
    __getInternalInterface().setFieldValue(TOPIC_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.NoteSearchCriteriaInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.NoteSearchCriteria.this.__getDelegateManager();
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
     * Gets the value of the Activity field.
     * Activity note is assigned to
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Activity getActivity() {
      return (entity.Activity)__getInternalInterface().getFieldValue(ACTIVITY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getActivityID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ACTIVITY_PROP.get());
    }
    
    /**
     * Gets the value of the Author field.
     * Note author
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getAuthor() {
      return (entity.User)__getInternalInterface().getFieldValue(AUTHOR_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getAuthorID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(AUTHOR_PROP.get());
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
      return ((com.guidewire.cc.domain.note.impl.NoteSearchCriteriaCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.note.impl.NoteSearchCriteriaCoreExtMethods")).getClaimant();
    }
    
    public gw.pl.persistence.core.Key getClaimantID() {
      return ((com.guidewire.cc.domain.note.impl.NoteSearchCriteriaCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.note.impl.NoteSearchCriteriaCoreExtMethods")).getClaimantID();
    }
    
    /**
     * Gets the value of the DateCriterionChoice field.
     * Date search
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.DateCriterionChoice getDateCriterionChoice() {
      return (entity.DateCriterionChoice)__getInternalInterface().getFieldValue(DATECRITERIONCHOICE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getDateCriterionChoiceID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(DATECRITERIONCHOICE_PROP.get());
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
     * Language search
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
    
    public gw.pl.persistence.core.Key getMatterID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(MATTER_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    public gw.pl.persistence.core.Bean getRelatedTo() {
      return ((com.guidewire.cc.domain.note.impl.NoteSearchCriteriaCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.note.impl.NoteSearchCriteriaCoreExtMethods")).getRelatedTo();
    }
    
    /**
     * Gets the value of the ServiceRequest field.
     * Service Request for RelatedTo search.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ServiceRequest getServiceRequest() {
      return (entity.ServiceRequest)__getInternalInterface().getFieldValue(SERVICEREQUEST_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getServiceRequestID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(SERVICEREQUEST_PROP.get());
    }
    
    /**
     * Gets the value of the SortBy field.
     * Options to sort the list of notes
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.SortByRange getSortBy() {
      return (typekey.SortByRange)__getInternalInterface().getFieldValue(SORTBY_PROP.get());
    }
    
    /**
     * Gets the value of the Text field.
     * Text search
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getText() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TEXT_PROP.get());
    }
    
    /**
     * Gets the value of the Topic field.
     * Topic search
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.NoteTopicType getTopic() {
      return (typekey.NoteTopicType)__getInternalInterface().getFieldValue(TOPIC_PROP.get());
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
    
    /**
     * Gets the value of the SortAscending field.
     * Sort ascending or not
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isSortAscending() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(SORTASCENDING_PROP.get());
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
    
    public gw.api.database.IQueryBeanResult performSearch(entity.Claim claim) {
      return ((com.guidewire.cc.domain.note.impl.NoteSearchCriteriaCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.note.impl.NoteSearchCriteriaCoreExtMethods")).performSearch(claim);
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
     * Sets the value of the Activity field.
     */
    public void setActivity(entity.Activity value) {
      __getInternalInterface().setFieldValue(ACTIVITY_PROP.get(), value);
    }
    
    public void setActivityID(gw.pl.persistence.core.Key value) {
      setFieldValue(ACTIVITY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Author field.
     */
    public void setAuthor(entity.User value) {
      __getInternalInterface().setFieldValue(AUTHOR_PROP.get(), value);
    }
    
    public void setAuthorID(gw.pl.persistence.core.Key value) {
      setFieldValue(AUTHOR_PROP.get(), value);
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
      ((com.guidewire.cc.domain.note.impl.NoteSearchCriteriaCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.note.impl.NoteSearchCriteriaCoreExtMethods")).setClaimant(value);
    }
    
    public void setClaimantID(gw.pl.persistence.core.Key value) {
      ((com.guidewire.cc.domain.note.impl.NoteSearchCriteriaCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.note.impl.NoteSearchCriteriaCoreExtMethods")).setClaimantID(value);
    }
    
    /**
     * Sets the value of the DateCriterionChoice field.
     */
    public void setDateCriterionChoice(entity.DateCriterionChoice value) {
      __getInternalInterface().setFieldValue(DATECRITERIONCHOICE_PROP.get(), value);
    }
    
    public void setDateCriterionChoiceID(gw.pl.persistence.core.Key value) {
      setFieldValue(DATECRITERIONCHOICE_PROP.get(), value);
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
    
    public void setRelatedTo(gw.pl.persistence.core.Bean relatedTo) {
      ((com.guidewire.cc.domain.note.impl.NoteSearchCriteriaCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.note.impl.NoteSearchCriteriaCoreExtMethods")).setRelatedTo(relatedTo);
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
     * Sets the value of the SortAscending field.
     */
    public void setSortAscending(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(SORTASCENDING_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SortBy field.
     */
    public void setSortBy(typekey.SortByRange value) {
      __getInternalInterface().setFieldValue(SORTBY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Text field.
     */
    public void setText(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(TEXT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Topic field.
     */
    public void setTopic(typekey.NoteTopicType value) {
      __getInternalInterface().setFieldValue(TOPIC_PROP.get(), value);
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
    config.put("com.guidewire.cc.domain.note.impl.NoteSearchCriteriaCoreExtMethods", "com.guidewire.cc.domain.note.impl.NoteSearchCriteriaCoreExtMethodsImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.io.Serializable", "com.guidewire.pl.domain.note.impl.NoteSearchCriteriaImpl");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.NoteSearchCriteria.class, config);
    com.guidewire._generated.entity.NoteSearchCriteriaInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.NoteSearchCriteria, com.guidewire._generated.entity.NoteSearchCriteriaInternal>() {
      public java.lang.Object getImplementation(entity.NoteSearchCriteria bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.NoteSearchCriteriaInternal getInternalInterface(entity.NoteSearchCriteria bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.NoteSearchCriteria newEmptyInstance() {
        return new entity.NoteSearchCriteria((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}