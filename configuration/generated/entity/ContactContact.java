package entity;

/**
 * ContactContact
 * <p>
 *       Links <code>Contact</code> objects to other contacts. Each link has a specific relationship. See the <code>ContactRel</code> typelist for
 *       a list of the possible link relationships. The purpose of this table is to avoid a self-referencing foreign key on
 *       <code>Contact</code>, and to allow contacts to relate to one another in different ways.</p>
 *       <p>For example, imagine a <code>ContactContact</code> entity with the following values:</p>
 *       <ul><li>SourceContactID: ID of Person A</li>
 *           <li>Relationship: Employer</li>
 *           <li>RelatedContactID: ID of Company B</li>
 *       </ul>
 *       <p>
 *       Then the relationship between A and B is: Company B is the Employer of Person A.</p>
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ContactContact.eti;ContactContact.eix;ContactContact.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ContactContact")
public class ContactContact extends com.guidewire.pl.persistence.code.BeanBase implements entity.Versionable, entity.CommonContactContact, entity.AddressBookLinkable, entity.Extractable, entity.OverlapTable, gw.api.contact.ContactRetireBean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ContactContact> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ContactContact>("entity.ContactContact");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ADDRESSBOOKUID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AddressBookUID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchivePartition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXTERNALLINKID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExternalLinkID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> RELATEDCONTACT_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "RelatedContact");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> RELATIONSHIP_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Relationship");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> SOURCECONTACT_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "SourceContact");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.ContactContactInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ContactContact()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ContactContact(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ContactContact(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.ContactContactInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.ContactContactInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Returns true if this bean instance, which has a link to the contact parameter through the property parameter,
   * can be retired. If it can be retired, the method will have added any other beans in the bean's graph that can
   * also be retired to the retireContext's beansToRetire Set.
   * @param propertyInfo the property which links the bean to the contact
   * @param contact the contact we're trying to retire
   * @param retireContext the context wrapper for the contact retire operation
   * @return boolean indicates if the bean can be retired
   */
  public boolean computeCanRetireBeanForContactProperty(gw.entity.IEntityPropertyInfo propertyInfo, entity.Contact contact, gw.api.contact.ContactRetireContext retireContext) {
    return ((gw.api.contact.ContactRetireBean)__getDelegateManager().getImplementation("gw.api.contact.ContactRetireBean")).computeCanRetireBeanForContactProperty(propertyInfo, contact, retireContext);
  }
  
  /**
   * Gets the value of the AddressBookUID field.
   * The system uses this value when it is integrated with ContactManager and the related contact is linked.  In this case, the ID represents the ID of the corresponding entity in ContactManager. This value is null if the object is not linked.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddressBookUID() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ADDRESSBOOKUID_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
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
   * This will return the relationship from the supplied contacts perspective
   * @param primaryContact the contact to use
   * @return the relationship type
   */
  public typekey.ContactBidiRel getBidiRel(entity.Contact primaryContact) {
    return ((com.guidewire.pl.domain.contact.ContactContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactContactPublicMethods")).getBidiRel(primaryContact);
  }
  
  /**
   * Gets the value of the ExternalLinkID field.
   * The external link ID suggested by CC to CM when linkID is null but has been created in CC. 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getExternalLinkID() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EXTERNALLINKID_PROP.get());
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
   * This will return the bidirectional relationship type  from the other contact in this relationship
   * to the primaryContact
   * @param otherContact either source or target
   * @param bidiRel relatioship from primaryContact to otherContact
   * @return the bidiRel for the otherContact
   */
  public typekey.ContactBidiRel getOtherBidiRel(entity.CommonContact otherContact, typekey.ContactBidiRel bidiRel) {
    return ((com.guidewire.pl.domain.contact.CommonContactContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.CommonContactContactPublicMethods")).getOtherBidiRel(otherContact, bidiRel);
  }
  
  /**
   * This will return the type of the other contact in this relationship
   * @param primaryContact either source or target
   * @return the IType of the oposite contact
   */
  public gw.lang.reflect.IType getOtherCommonContactType(entity.CommonContact primaryContact) {
    return ((com.guidewire.pl.domain.contact.ContactContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactContactPublicMethods")).getOtherCommonContactType(primaryContact);
  }
  
  /**
   * This will return the other contact for this link.
   * @param primaryContact the contact to exclude
   * @return the contact
   */
  public entity.Contact getOtherContact(entity.Contact primaryContact) {
    return ((com.guidewire.pl.domain.contact.ContactContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactContactPublicMethods")).getOtherContact(primaryContact);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the RelatedContact field.
   * "RelatedContactID" is the "Relationship" of "SourceContactID".
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getRelatedContact() {
    return (entity.Contact)__getInternalInterface().getFieldValue(RELATEDCONTACT_PROP.get());
  }
  
  /**
   * Gets the value of the Relationship field.
   * Relationship between the two contacts.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ContactRel getRelationship() {
    return (typekey.ContactRel)__getInternalInterface().getFieldValue(RELATIONSHIP_PROP.get());
  }
  
  /**
   * Gets the value of the SourceContact field.
   * "SourceContactID" has "RelatedContactID" as "Relationship".
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getSourceContact() {
    return (entity.Contact)__getInternalInterface().getFieldValue(SOURCECONTACT_PROP.get());
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
   * Sets the value of the AddressBookUID field.
   */
  public void setAddressBookUID(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ADDRESSBOOKUID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ArchivePartition field.
   */
  private void setArchivePartition(java.lang.Long value) {
    __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * This will change the relationship
   * @param primaryContact the contact to use
   * @param contactBidiRel the new relationship
   */
  public void setBidiRel(entity.Contact primaryContact, typekey.ContactBidiRel contactBidiRel) {
    ((com.guidewire.pl.domain.contact.ContactContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactContactPublicMethods")).setBidiRel(primaryContact, contactBidiRel);
  }
  
  /**
   * Sets the value of the ExternalLinkID field.
   */
  public void setExternalLinkID(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(EXTERNALLINKID_PROP.get(), value);
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
   * Set a flag denoting that the currently instantiated object has been newly imported from
   * an external source
   * @param newlyImported 
   */
  public void setNewlyImported(boolean newlyImported) {
    ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
  }
  
  /**
   * Sets the other contact
   * @param primaryContact the contact to keep the same
   * @param otherContact the contact to replace
   */
  public void setOtherContact(entity.Contact primaryContact, entity.Contact otherContact) {
    ((com.guidewire.pl.domain.contact.ContactContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactContactPublicMethods")).setOtherContact(primaryContact, otherContact);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the RelatedContact field.
   */
  public void setRelatedContact(entity.Contact value) {
    __getInternalInterface().setFieldValue(RELATEDCONTACT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Relationship field.
   */
  public void setRelationship(typekey.ContactRel value) {
    __getInternalInterface().setFieldValue(RELATIONSHIP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SourceContact field.
   */
  public void setSourceContact(entity.Contact value) {
    __getInternalInterface().setFieldValue(SOURCECONTACT_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ContactContactInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ContactContact.this.__getDelegateManager();
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
    }
    
    public void beforeInsert() {
      ((com.guidewire.pl.system.bundle.InsertCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.InsertCallback")).beforeInsert();
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
     * Returns true if this bean instance, which has a link to the contact parameter through the property parameter,
     * can be retired. If it can be retired, the method will have added any other beans in the bean's graph that can
     * also be retired to the retireContext's beansToRetire Set.
     * @param propertyInfo the property which links the bean to the contact
     * @param contact the contact we're trying to retire
     * @param retireContext the context wrapper for the contact retire operation
     * @return boolean indicates if the bean can be retired
     */
    public boolean computeCanRetireBeanForContactProperty(gw.entity.IEntityPropertyInfo propertyInfo, entity.Contact contact, gw.api.contact.ContactRetireContext retireContext) {
      return ((gw.api.contact.ContactRetireBean)__getDelegateManager().getImplementation("gw.api.contact.ContactRetireBean")).computeCanRetireBeanForContactProperty(propertyInfo, contact, retireContext);
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
     * Gets the value of the AddressBookUID field.
     * The system uses this value when it is integrated with ContactManager and the related contact is linked.  In this case, the ID represents the ID of the corresponding entity in ContactManager. This value is null if the object is not linked.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getAddressBookUID() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ADDRESSBOOKUID_PROP.get());
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
     * This will return the relationship from the supplied contacts perspective
     * @param primaryContact the contact to use
     * @return the relationship type
     */
    public typekey.ContactBidiRel getBidiRel(entity.Contact primaryContact) {
      return ((com.guidewire.pl.domain.contact.ContactContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactContactPublicMethods")).getBidiRel(primaryContact);
    }
    
    public typekey.ContactBidiRel getCommonBidiRel(entity.CommonContact primaryContact) {
      return ((com.guidewire.pl.domain.contact.impl.CommonContactContactInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactContactInternalMethods")).getCommonBidiRel(primaryContact);
    }
    
    public com.guidewire.pl.domain.contact.config.ContactRelationshipConfigFile getContactRelationshipConfig() {
      return ((com.guidewire.pl.domain.contact.impl.CommonContactContactImplCallback)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactContactImplCallback")).getContactRelationshipConfig();
    }
    
    /**
     * Gets the value of the ExternalLinkID field.
     * The external link ID suggested by CC to CM when linkID is null but has been created in CC. 
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getExternalLinkID() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EXTERNALLINKID_PROP.get());
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
     * This will return the bidirectional relationship type  from the other contact in this relationship
     * to the primaryContact
     * @param otherContact either source or target
     * @param bidiRel relatioship from primaryContact to otherContact
     * @return the bidiRel for the otherContact
     */
    public typekey.ContactBidiRel getOtherBidiRel(entity.CommonContact otherContact, typekey.ContactBidiRel bidiRel) {
      return ((com.guidewire.pl.domain.contact.CommonContactContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.CommonContactContactPublicMethods")).getOtherBidiRel(otherContact, bidiRel);
    }
    
    public entity.CommonContact getOtherCommonContact(entity.CommonContact primaryContact) {
      return ((com.guidewire.pl.domain.contact.impl.CommonContactContactInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactContactInternalMethods")).getOtherCommonContact(primaryContact);
    }
    
    /**
     * This will return the type of the other contact in this relationship
     * @param primaryContact either source or target
     * @return the IType of the oposite contact
     */
    public gw.lang.reflect.IType getOtherCommonContactType(entity.CommonContact primaryContact) {
      return ((com.guidewire.pl.domain.contact.ContactContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactContactPublicMethods")).getOtherCommonContactType(primaryContact);
    }
    
    /**
     * This will return the other contact for this link.
     * @param primaryContact the contact to exclude
     * @return the contact
     */
    public entity.Contact getOtherContact(entity.Contact primaryContact) {
      return ((com.guidewire.pl.domain.contact.ContactContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactContactPublicMethods")).getOtherContact(primaryContact);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the RelatedContact field.
     * "RelatedContactID" is the "Relationship" of "SourceContactID".
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Contact getRelatedContact() {
      return (entity.Contact)__getInternalInterface().getFieldValue(RELATEDCONTACT_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getRelatedContactID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(RELATEDCONTACT_PROP.get());
    }
    
    /**
     * Gets the value of the Relationship field.
     * Relationship between the two contacts.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ContactRel getRelationship() {
      return (typekey.ContactRel)__getInternalInterface().getFieldValue(RELATIONSHIP_PROP.get());
    }
    
    public entity.CommonContact getSourceCommonContact() {
      return ((com.guidewire.pl.domain.contact.impl.CommonContactContactImplCallback)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactContactImplCallback")).getSourceCommonContact();
    }
    
    /**
     * Gets the value of the SourceContact field.
     * "SourceContactID" has "RelatedContactID" as "Relationship".
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Contact getSourceContact() {
      return (entity.Contact)__getInternalInterface().getFieldValue(SOURCECONTACT_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getSourceContactID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(SOURCECONTACT_PROP.get());
    }
    
    public gw.entity.ILinkPropertyInfo getSourceContactProperty() {
      return ((com.guidewire.pl.domain.contact.impl.CommonContactContactImplCallback)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactContactImplCallback")).getSourceContactProperty();
    }
    
    public entity.CommonContact getTargetCommonContact() {
      return ((com.guidewire.pl.domain.contact.impl.CommonContactContactImplCallback)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactContactImplCallback")).getTargetCommonContact();
    }
    
    public gw.entity.ILinkPropertyInfo getTargetContactProperty() {
      return ((com.guidewire.pl.domain.contact.impl.CommonContactContactImplCallback)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactContactImplCallback")).getTargetContactProperty();
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
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the AddressBookUID field.
     */
    public void setAddressBookUID(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ADDRESSBOOKUID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ArchivePartition field.
     */
    public void setArchivePartition(java.lang.Long value) {
      __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * This will change the relationship
     * @param primaryContact the contact to use
     * @param contactBidiRel the new relationship
     */
    public void setBidiRel(entity.Contact primaryContact, typekey.ContactBidiRel contactBidiRel) {
      ((com.guidewire.pl.domain.contact.ContactContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactContactPublicMethods")).setBidiRel(primaryContact, contactBidiRel);
    }
    
    public void setCommonBidiRel(entity.CommonContact primaryContact, typekey.ContactBidiRel contactBidiRel) {
      ((com.guidewire.pl.domain.contact.impl.CommonContactContactInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactContactInternalMethods")).setCommonBidiRel(primaryContact, contactBidiRel);
    }
    
    /**
     * Sets the value of the ExternalLinkID field.
     */
    public void setExternalLinkID(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(EXTERNALLINKID_PROP.get(), value);
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
     * Set a flag denoting that the currently instantiated object has been newly imported from
     * an external source
     * @param newlyImported 
     */
    public void setNewlyImported(boolean newlyImported) {
      ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
    }
    
    public void setOtherCommonContact(entity.CommonContact primaryContact, entity.CommonContact otherContact) {
      ((com.guidewire.pl.domain.contact.impl.CommonContactContactInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactContactInternalMethods")).setOtherCommonContact(primaryContact, otherContact);
    }
    
    /**
     * Sets the other contact
     * @param primaryContact the contact to keep the same
     * @param otherContact the contact to replace
     */
    public void setOtherContact(entity.Contact primaryContact, entity.Contact otherContact) {
      ((com.guidewire.pl.domain.contact.ContactContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactContactPublicMethods")).setOtherContact(primaryContact, otherContact);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the RelatedContact field.
     */
    public void setRelatedContact(entity.Contact value) {
      __getInternalInterface().setFieldValue(RELATEDCONTACT_PROP.get(), value);
    }
    
    public void setRelatedContactID(gw.pl.persistence.core.Key value) {
      setFieldValue(RELATEDCONTACT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Relationship field.
     */
    public void setRelationship(typekey.ContactRel value) {
      __getInternalInterface().setFieldValue(RELATIONSHIP_PROP.get(), value);
    }
    
    public void setSourceCommonContact(entity.CommonContact contact) {
      ((com.guidewire.pl.domain.contact.impl.CommonContactContactImplCallback)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactContactImplCallback")).setSourceCommonContact(contact);
    }
    
    /**
     * Sets the value of the SourceContact field.
     */
    public void setSourceContact(entity.Contact value) {
      __getInternalInterface().setFieldValue(SOURCECONTACT_PROP.get(), value);
    }
    
    public void setSourceContactID(gw.pl.persistence.core.Key value) {
      setFieldValue(SOURCECONTACT_PROP.get(), value);
    }
    
    public void setTargetCommonContact(entity.CommonContact contact) {
      ((com.guidewire.pl.domain.contact.impl.CommonContactContactImplCallback)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactContactImplCallback")).setTargetCommonContact(contact);
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
    config.put("com.guidewire.pl.domain.contact.CommonContactContactPublicMethods", "com.guidewire.pl.domain.contact.impl.ContactContactImpl");
    config.put("com.guidewire.pl.domain.contact.ContactContactPublicMethods", "com.guidewire.pl.domain.contact.impl.ContactContactImpl");
    config.put("com.guidewire.pl.domain.contact.impl.CommonContactContactImplCallback", "com.guidewire.pl.domain.contact.impl.ContactContactImpl");
    config.put("com.guidewire.pl.domain.contact.impl.CommonContactContactInternalMethods", "com.guidewire.pl.domain.contact.impl.ContactContactImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.system.bundle.InsertCallback", "com.guidewire.pl.domain.contact.impl.ContactContactImpl");
    config.put("gw.api.contact.ContactRetireBean", "gw.api.contact.ContactContactRetireBeanImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ContactContact.class, config);
    com.guidewire._generated.entity.ContactContactInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ContactContact, com.guidewire._generated.entity.ContactContactInternal>() {
      public java.lang.Object getImplementation(entity.ContactContact bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ContactContactInternal getInternalInterface(entity.ContactContact bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ContactContact newEmptyInstance() {
        return new entity.ContactContact((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}