package entity;

/**
 * DocumentTemplateSearchResults
 * 
 * Non-persistent set of criteria to use to represent the results of a specific document template search. This entity should contain enough information to allow the user to select the desired document template.
 * <p>
 * Document template files are XML files whose format is defined in the deployed document-template.xsd file. Therefore additions of new document template descriptor properties which should be viewable on the results of a document template search must be coordinated between that xsd file, this entity, and the {@link com.guidewire.cc.domain.document.DocumentTemplateSearchCriteria} entity.
 *       
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DocumentTemplateSearchResults.eti;DocumentTemplateSearchResults.eix;DocumentTemplateSearchResults.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "DocumentTemplateSearchResults")
public class DocumentTemplateSearchResults extends com.guidewire.pl.persistence.code.BeanBase implements entity.Versionable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.DocumentTemplateSearchResults> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.DocumentTemplateSearchResults>("entity.DocumentTemplateSearchResults");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DATEEFFECTIVE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DateEffective");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DATEEXPIRES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DateExpires");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DATEMODIFIED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DateModified");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> IDENTIFIER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Identifier");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LANGUAGE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Language");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOB_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Lob");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Name");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SECTION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Section");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "State");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TEMPLATEID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TemplateID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> TYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Type");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.DocumentTemplateSearchResultsInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public DocumentTemplateSearchResults()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public DocumentTemplateSearchResults(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected DocumentTemplateSearchResults(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.DocumentTemplateSearchResultsInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.DocumentTemplateSearchResultsInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the DateEffective field.
   * The date/time on which the document template starts to be effective.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateEffective() {
    return (java.util.Date)__getInternalInterface().getFieldValue(DATEEFFECTIVE_PROP.get());
  }
  
  /**
   * Gets the value of the DateExpires field.
   * The date/time on which the document template expires.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateExpires() {
    return (java.util.Date)__getInternalInterface().getFieldValue(DATEEXPIRES_PROP.get());
  }
  
  /**
   * Gets the value of the DateModified field.
   * The last date/time the document template was modified.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateModified() {
    return (java.util.Date)__getInternalInterface().getFieldValue(DATEMODIFIED_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the Identifier field.
   * The identifier of the document template (distinct from the template ID).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getIdentifier() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(IDENTIFIER_PROP.get());
  }
  
  /**
   * Gets the value of the Language field.
   * The language of the template
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LanguageType getLanguage() {
    return (typekey.LanguageType)__getInternalInterface().getFieldValue(LANGUAGE_PROP.get());
  }
  
  /**
   * Gets the value of the Lob field.
   * The lob type of the document template.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLob() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LOB_PROP.get());
  }
  
  /**
   * Gets the value of the Name field.
   * The name of the document template.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NAME_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the Section field.
   * The section to which the document template applies.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSection() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SECTION_PROP.get());
  }
  
  /**
   * Gets the value of the State field.
   * The state(s) to which the document template applies.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getState() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(STATE_PROP.get());
  }
  
  /**
   * Gets the value of the TemplateID field.
   * The ID of the document template.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTemplateID() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TEMPLATEID_PROP.get());
  }
  
  /**
   * Gets the value of the Type field.
   * The type which will be assigned to documents created from this document template.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DocumentType getType() {
    return (typekey.DocumentType)__getInternalInterface().getFieldValue(TYPE_PROP.get());
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
   * Load the descriptor from the <code>IDocumentTemplateSource</code> plugin
   * @return descriptor that match the template and locale
   */
  public gw.plugin.document.IDocumentTemplateDescriptor loadDescriptor() {
    return ((com.guidewire.pl.domain.document.DocumentTemplateSearchResultsPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.DocumentTemplateSearchResultsPublicMethods")).loadDescriptor();
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
   * Sets the value of the DateEffective field.
   */
  public void setDateEffective(java.util.Date value) {
    __getInternalInterface().setFieldValue(DATEEFFECTIVE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DateExpires field.
   */
  public void setDateExpires(java.util.Date value) {
    __getInternalInterface().setFieldValue(DATEEXPIRES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DateModified field.
   */
  public void setDateModified(java.util.Date value) {
    __getInternalInterface().setFieldValue(DATEMODIFIED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Identifier field.
   */
  public void setIdentifier(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(IDENTIFIER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Language field.
   */
  private void setLanguage(typekey.LanguageType value) {
    __getInternalInterface().setFieldValue(LANGUAGE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Lob field.
   */
  public void setLob(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(LOB_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(NAME_PROP.get(), value);
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
   * Sets the value of the Section field.
   */
  public void setSection(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(SECTION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the State field.
   */
  public void setState(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(STATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TemplateID field.
   */
  public void setTemplateID(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(TEMPLATEID_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.DocumentTemplateSearchResultsInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.DocumentTemplateSearchResults.this.__getDelegateManager();
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
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the DateEffective field.
     * The date/time on which the document template starts to be effective.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getDateEffective() {
      return (java.util.Date)__getInternalInterface().getFieldValue(DATEEFFECTIVE_PROP.get());
    }
    
    /**
     * Gets the value of the DateExpires field.
     * The date/time on which the document template expires.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getDateExpires() {
      return (java.util.Date)__getInternalInterface().getFieldValue(DATEEXPIRES_PROP.get());
    }
    
    /**
     * Gets the value of the DateModified field.
     * The last date/time the document template was modified.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getDateModified() {
      return (java.util.Date)__getInternalInterface().getFieldValue(DATEMODIFIED_PROP.get());
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
     * Gets the value of the Identifier field.
     * The identifier of the document template (distinct from the template ID).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getIdentifier() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(IDENTIFIER_PROP.get());
    }
    
    /**
     * Gets the value of the Language field.
     * The language of the template
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LanguageType getLanguage() {
      return (typekey.LanguageType)__getInternalInterface().getFieldValue(LANGUAGE_PROP.get());
    }
    
    /**
     * Gets the value of the Lob field.
     * The lob type of the document template.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getLob() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LOB_PROP.get());
    }
    
    public com.guidewire.commons.metadata.i18n.config.GWLocale getLocale() {
      return ((com.guidewire.pl.domain.document.impl.DocumentTemplateSearchResultsInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.impl.DocumentTemplateSearchResultsInternalMethods")).getLocale();
    }
    
    /**
     * Gets the value of the Name field.
     * The name of the document template.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NAME_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the Section field.
     * The section to which the document template applies.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getSection() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SECTION_PROP.get());
    }
    
    /**
     * Gets the value of the State field.
     * The state(s) to which the document template applies.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getState() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(STATE_PROP.get());
    }
    
    /**
     * Gets the value of the TemplateID field.
     * The ID of the document template.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getTemplateID() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TEMPLATEID_PROP.get());
    }
    
    /**
     * Gets the value of the Type field.
     * The type which will be assigned to documents created from this document template.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.DocumentType getType() {
      return (typekey.DocumentType)__getInternalInterface().getFieldValue(TYPE_PROP.get());
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
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    /**
     * Load the descriptor from the <code>IDocumentTemplateSource</code> plugin
     * @return descriptor that match the template and locale
     */
    public gw.plugin.document.IDocumentTemplateDescriptor loadDescriptor() {
      return ((com.guidewire.pl.domain.document.DocumentTemplateSearchResultsPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.DocumentTemplateSearchResultsPublicMethods")).loadDescriptor();
    }
    
    public entity.KeyableBean overrideBundleAdd(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleAdd(bundle);
    }
    
    public entity.KeyableBean overrideBundleRemove(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleRemove(bundle);
    }
    
    public void populateFromDescriptor(gw.plugin.document.IDocumentTemplateDescriptor template) {
      ((com.guidewire.pl.domain.document.impl.DocumentTemplateSearchResultsInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.impl.DocumentTemplateSearchResultsInternalMethods")).populateFromDescriptor(template);
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
     * Sets the value of the DateEffective field.
     */
    public void setDateEffective(java.util.Date value) {
      __getInternalInterface().setFieldValue(DATEEFFECTIVE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DateExpires field.
     */
    public void setDateExpires(java.util.Date value) {
      __getInternalInterface().setFieldValue(DATEEXPIRES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DateModified field.
     */
    public void setDateModified(java.util.Date value) {
      __getInternalInterface().setFieldValue(DATEMODIFIED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Identifier field.
     */
    public void setIdentifier(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(IDENTIFIER_PROP.get(), value);
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
     * Sets the value of the Lob field.
     */
    public void setLob(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(LOB_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Name field.
     */
    public void setName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(NAME_PROP.get(), value);
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
     * Sets the value of the Section field.
     */
    public void setSection(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(SECTION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the State field.
     */
    public void setState(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(STATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TemplateID field.
     */
    public void setTemplateID(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(TEMPLATEID_PROP.get(), value);
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
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.document.DocumentTemplateSearchResultsPublicMethods", "com.guidewire.pl.domain.document.impl.DocumentTemplateSearchResultsImpl");
    config.put("com.guidewire.pl.domain.document.impl.DocumentTemplateSearchResultsInternalMethods", "com.guidewire.pl.domain.document.impl.DocumentTemplateSearchResultsImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.DocumentTemplateSearchResults.class, config);
    com.guidewire._generated.entity.DocumentTemplateSearchResultsInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.DocumentTemplateSearchResults, com.guidewire._generated.entity.DocumentTemplateSearchResultsInternal>() {
      public java.lang.Object getImplementation(entity.DocumentTemplateSearchResults bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.DocumentTemplateSearchResultsInternal getInternalInterface(entity.DocumentTemplateSearchResults bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.DocumentTemplateSearchResults newEmptyInstance() {
        return new entity.DocumentTemplateSearchResults((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}