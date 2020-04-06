package entity;

/**
 * ContactCategoryScore
 * Table linking Contacts to Category Scores
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ContactCategoryScore.eti;ContactCategoryScore.eix;ContactCategoryScore.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ContactCategoryScore")
public class ContactCategoryScore extends com.guidewire.pl.persistence.code.BeanBase implements entity.Versionable, entity.AddressBookConvertable, entity.Extractable, entity.OverlapTable, com.guidewire.pl.domain.contact.CommonCategoryScore {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ContactCategoryScore> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ContactCategoryScore>("entity.ContactCategoryScore");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ADDRESSBOOKUID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AddressBookUID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchivePartition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CONTACT_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Contact");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> REVIEWCATEGORY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ReviewCategory");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SCORE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Score");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.ContactCategoryScoreInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ContactCategoryScore()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ContactCategoryScore(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ContactCategoryScore(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.ContactCategoryScoreInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.ContactCategoryScoreInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Determines whether this AddressBookConvertable can link to the given Address Book Contact.
   * A AddressBookConvertable can link to another Contact if the following conditions are met:
   * <ul>
   * <li>The Address Book Contact has an AddressBookUID.</li>
   * <li>The Address Book Contact, when converted into an AddressBookConvertable, is the same type or is a
   * subtype of this AddressBookConvertable.</li>
   * </ul>
   * @param addressBookContact 
   * @deprecated since ClaimCenter 8.0, there is no replacement
   */
  @java.lang.Deprecated
  public boolean canLinkTo(entity.Contact addressBookContact) {
    return ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).canLinkTo(addressBookContact);
  }
  
  /**
   * Clears the fingerprint value of this contact.
   */
  @java.lang.Deprecated
  public void clearAddressBookFingerprint() {
    ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).clearAddressBookFingerprint();
  }
  
  /**
   * Copy data from <code>contact</code> to this <code>AddressBookConvertable</code> object.
   * @param sourceContact 
   * @return this AddressBookConvertable filled with contact information
   * @deprecated Since ClaimCenter 8.0, use syncToContactSystem() in ContactSystemUtil
   */
  @java.lang.Deprecated
  public entity.AddressBookConvertable copyFromContact(entity.Contact sourceContact) {
    return ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).copyFromContact(sourceContact);
  }
  
  /**
   * Attempts to create a contact in the Address Book that has the same data as this AddressBookConvertable.
   * @param onlyPrimaryRelationships 
   * @throws com.guidewire.pl.domain.contact.AddressBookUnavailableException if an Address Book adapter error occurs
   * @throws com.guidewire.pl.system.exception.InsufficientPermissionException if the user does not have
   *          "createab Contact"
   * @throws gw.api.validation.EntityValidationException if the new contact data is
   *          invalid for some reason.
   * @deprecated Since ClaimCenter 8.0, use createContact() in ContactSystemPlugin
   */
  @java.lang.Deprecated
  public void createInAddressBook(boolean onlyPrimaryRelationships) {
    ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).createInAddressBook(onlyPrimaryRelationships);
  }
  
  /**
   * Attempts to delete the Address Book entry to which this AddressBookConvertable is linked.
   * @throws com.guidewire.pl.domain.contact.AddressBookUnavailableException if an Address Book adapter error occurs
   * @throws IllegalStateException if this AddressBookConvertable is not linked to the Address Book
   * @deprecated Since ClaimCenter 8.0, no longer available
   */
  @java.lang.Deprecated
  public void deleteFromAddressBook() {
    ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).deleteFromAddressBook();
  }
  
  /**
   * Generate the contact link status.
   * @param remoteContact the Address Book entry corresponding to the localContact (may be null)
   * @param localContact the local contact
   * @return The contact link status
   * @deprecated Since ClaimCenter 8.0, use generateContactLinkStatus() in ContactSystemUtil
   */
  @java.lang.Deprecated
  public com.guidewire.pl.domain.contact.ContactLinkStatus generateContactLinkStatus(entity.Contact remoteContact, entity.Contact localContact) {
    return ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).generateContactLinkStatus(remoteContact, localContact);
  }
  
  /**
   * Gets this Contact's Address Book link status.
   * <p/>
   * <b>Notice:</b> Executing this method requires going over the wire to the addressbook, so if used in a pcf file it
   * should only be used in the initialValue of a variable.  For example:
   * <pre>&lt;Variable name="linkStatus" initialValue="Contact==null ? null : Contact.generateLinkStatus()" recalculateOnRefresh="true"/&gt; </pre>
   * @throws RuntimeException On any problem with the addressbook, including if ContactManager is down.
   * @deprecated Since ClaimCenter 8.0, use generateLinkStatus() in ContactSystemUtil
   */
  @java.lang.Deprecated
  public gw.api.contact.LinkStatus generateLinkStatus() {
    return ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).generateLinkStatus();
  }
  
  /**
   * Retrieves the fingerprint for this contact.
   * @return fingerprint value of this contact or null if no fingerprint defined.
   */
  @java.lang.Deprecated
  public java.lang.String getAddressBookFingerprint() {
    return ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).getAddressBookFingerprint();
  }
  
  /**
   * Gets the value of the AddressBookUID field.
   * Represents the ID of the associated object in Address Book.  Null if the object is not linked to Address Book.
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
   * Gets the value of the Contact field.
   * Associated Contact.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getContact() {
    return (entity.Contact)__getInternalInterface().getFieldValue(CONTACT_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the Address Book Contact to which this Contact is linked.
   * Also brings related contacts in primary relationships with the linked contact.
   * <p/>
   * Performance note: This operation requires a remote access to the Address Book.
   * @throws com.guidewire.pl.domain.contact.AddressBookUnavailableException 
   * @return null if the Contact is not linked to the Address Book or the link is broken.
   * @deprecated Since ClaimCenter 8.0, use getLinkedContact() in ContactSystemUtil
   */
  @java.lang.Deprecated
  public entity.Contact getLinkedContact() {
    return ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).getLinkedContact();
  }
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(LOADCOMMANDID_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the ReviewCategory field.
   * Category of this Score.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ReviewCategory getReviewCategory() {
    return (typekey.ReviewCategory)__getInternalInterface().getFieldValue(REVIEWCATEGORY_PROP.get());
  }
  
  /**
   * Gets the value of the Score field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getScore() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(SCORE_PROP.get());
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
   * Links to the given contact, and syncs, then commits in a bundle.
   * @param contact - the contact to link and sync
   * @deprecated Since ClaimCenter 8.0, use ContactSystemUtil.linkToContactSystem
   */
  @java.lang.Deprecated
  public entity.AddressBookConvertable linkAndSyncToAB(entity.Contact contact) {
    return ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).linkAndSyncToAB(contact);
  }
  
  /**
   * Links this Contact to the given Address Book Contact.
   * @param addressBookContact 
   * @throws IllegalArgumentException if this Contact can not be linked to the given
   *                                  Contact.
   * @deprecated Since ClaimCenter 8.0, use ContactSystemUtil.linkToContactInContactSystem
   */
  @java.lang.Deprecated
  public void linkTo(entity.Contact addressBookContact) {
    ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).linkTo(addressBookContact);
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
   * Sets the fingerprint for this contact.
   * @param fingerprint fingerprint value of this contact
   */
  @java.lang.Deprecated
  public void setAddressBookFingerprint(java.lang.String fingerprint) {
    ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).setAddressBookFingerprint(fingerprint);
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
   * Sets the value of the Contact field.
   */
  public void setContact(entity.Contact value) {
    __getInternalInterface().setFieldValue(CONTACT_PROP.get(), value);
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
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the ReviewCategory field.
   */
  public void setReviewCategory(typekey.ReviewCategory value) {
    __getInternalInterface().setFieldValue(REVIEWCATEGORY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Score field.
   */
  public void setScore(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(SCORE_PROP.get(), value);
  }
  
  /**
   * Update this AddressBookConvertable from the remote Address Book.
   * @throws com.guidewire.pl.domain.contact.AddressBookUnavailableException 
   * @return the synced AddressBookConvertable. Note that this may be a different Java object than this
   *         AddressBookConvertable. This would happen if the Contact were downcast as part of the sync. Returns null if this
   *         AddressBookConvertable is not linked to the Address Book.
   * @deprecated Since ClaimCenter 8.0, use syncToContactSystem() in ContactSystemUtil
   */
  @java.lang.Deprecated
  public entity.AddressBookConvertable syncToAB() {
    return ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).syncToAB();
  }
  
  /**
   * If the contact is linked and not in sync, update this AddressBookConvertable from the remote Address Book.
   * 
   * This routine is more efficient than calling isLinked() and isSynced() then calling syncToAB().
   * It will make only one call to AB versus three calls for the other calls.
   * .
   * @return If updated, the synced AddressBookConvertable. Note that this may be a different Java object than this
   *         AddressBookConvertable. This would happen if the Contact were downcast as part of the sync. Returns null if this
   *         AddressBookConvertable is not linked to the Address Book.  If not updated, returns 'this'
   * @deprecated Since ClaimCenter 8.0, use syncToContactSystem() in ContactSystemUtil
   */
  @java.lang.Deprecated
  public entity.AddressBookConvertable syncToABIfNeeded() {
    return ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).syncToABIfNeeded();
  }
  
  /**
   * Update this AddressBookConvertable from the remote Address Book without syncing related contacts.
   * This is primarily used when you have a stub contact which is itself a related contact. When adding that
   * stub contact to an application you need to sync the contact but you don't want to bring over it's related
   * contacts as well, which would bring over too many contacts.
   * @throws com.guidewire.pl.domain.contact.AddressBookUnavailableException 
   * @return the synced AddressBookConvertable. Note that this may be a different Java object than this
   *         AddressBookConvertable. This would happen if the Contact were downcast as part of the sync. Returns null if this
   *         AddressBookConvertable is not linked to the Address Book.
   * @deprecated Since ClaimCenter 8.0, use syncToContactSystem() in ContactSystemUtil with false for syncRelatedContacts parameter
   */
  @java.lang.Deprecated
  public entity.AddressBookConvertable syncToABWithoutRelatedContacts() {
    return ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).syncToABWithoutRelatedContacts();
  }
  
  /**
   * Returns the representation of this addressBookConvertable as a Contact.
   * @return version of this as a Contact
   */
  @java.lang.Deprecated
  public entity.Contact toContact() {
    return ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).toContact();
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
   * Unlinks this AddressBookConvertable from the Address Book.
   * This is done by marking this AddressBookConvertable out of sync, and clearing the AddressBookUID
   * field on every linked sub-object.
   * @deprecated Since ClaimCenter 8.0, use ContactSystemUtil.unlinkFromContactSystem(Contact)
   */
  public void unlink() {
    ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).unlink();
  }
  
  /**
   * Pushes the changes made on this AddressBookConvertable to the Address Book.
   * Changes are determined by looking up the latest data in the Address Book and diffing it
   * with the data on this AddressBookConvertable.
   * @param onlyPrimaryRelationships 
   * @throws com.guidewire.pl.domain.contact.AddressBookUnavailableException if an Address Book adapter error occurs
   * @throws com.guidewire.pl.domain.contact.AddressBookContactNotFoundException if the corresponding Contact
   *                               could not be found in the Address Book.
   * @throws IllegalStateException if this AddressBookConvertable is not linked to the Address Book
   * @throws com.guidewire.pl.domain.contact.AddressBookConcurrentDataChangeException if the Address Book has been modified
   *                               since this AddressBookConvertable was last synced with the Address Book
   * @throws com.guidewire.pl.system.exception.InsufficientPermissionException if the user
   *                               does not have "editab Contact" permission.
   * @throws gw.api.validation.EntityValidationException if the data in the update is
   *                               invalid for some reason.
   * @deprecated Since ClaimCenter 8.0, use updateContact() in ContactSystemPlugin
   */
  @java.lang.Deprecated
  public void updateAddressBook(boolean onlyPrimaryRelationships) {
    ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).updateAddressBook(onlyPrimaryRelationships);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ContactCategoryScoreInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ContactCategoryScore.this.__getDelegateManager();
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
    }
    
    public java.lang.String calculateFingerprint() {
      return ((com.guidewire.pl.domain.contact.impl.AddressBookConvertableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.AddressBookConvertableInternalMethods")).calculateFingerprint();
    }
    
    public java.lang.Integer calculateNextVersion() {
      return ((com.guidewire.pl.domain.persistence.core.impl.VersionableInternal)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal")).calculateNextVersion();
    }
    
    /**
     * Determines whether this AddressBookConvertable can link to the given Address Book Contact.
     * A AddressBookConvertable can link to another Contact if the following conditions are met:
     * <ul>
     * <li>The Address Book Contact has an AddressBookUID.</li>
     * <li>The Address Book Contact, when converted into an AddressBookConvertable, is the same type or is a
     * subtype of this AddressBookConvertable.</li>
     * </ul>
     * @param addressBookContact 
     * @deprecated since ClaimCenter 8.0, there is no replacement
     */
    @java.lang.Deprecated
    public boolean canLinkTo(entity.Contact addressBookContact) {
      return ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).canLinkTo(addressBookContact);
    }
    
    public java.util.List<entity.KeyableBean> cascadeDelete() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cascadeDelete();
    }
    
    /**
     * Clears the fingerprint value of this contact.
     */
    @java.lang.Deprecated
    public void clearAddressBookFingerprint() {
      ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).clearAddressBookFingerprint();
    }
    
    public entity.KeyableBean cloneBeanForBundleTransfer() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cloneBeanForBundleTransfer();
    }
    
    /**
     * Copy data from <code>contact</code> to this <code>AddressBookConvertable</code> object.
     * @param sourceContact 
     * @return this AddressBookConvertable filled with contact information
     * @deprecated Since ClaimCenter 8.0, use syncToContactSystem() in ContactSystemUtil
     */
    @java.lang.Deprecated
    public entity.AddressBookConvertable copyFromContact(entity.Contact sourceContact) {
      return ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).copyFromContact(sourceContact);
    }
    
    /**
     * Attempts to create a contact in the Address Book that has the same data as this AddressBookConvertable.
     * @param onlyPrimaryRelationships 
     * @throws com.guidewire.pl.domain.contact.AddressBookUnavailableException if an Address Book adapter error occurs
     * @throws com.guidewire.pl.system.exception.InsufficientPermissionException if the user does not have
     *          "createab Contact"
     * @throws gw.api.validation.EntityValidationException if the new contact data is
     *          invalid for some reason.
     * @deprecated Since ClaimCenter 8.0, use createContact() in ContactSystemPlugin
     */
    @java.lang.Deprecated
    public void createInAddressBook(boolean onlyPrimaryRelationships) {
      ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).createInAddressBook(onlyPrimaryRelationships);
    }
    
    /**
     * Attempts to delete the Address Book entry to which this AddressBookConvertable is linked.
     * @throws com.guidewire.pl.domain.contact.AddressBookUnavailableException if an Address Book adapter error occurs
     * @throws IllegalStateException if this AddressBookConvertable is not linked to the Address Book
     * @deprecated Since ClaimCenter 8.0, no longer available
     */
    @java.lang.Deprecated
    public void deleteFromAddressBook() {
      ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).deleteFromAddressBook();
    }
    
    public typekey.ContactBidiRel[] diffSyncableRelationships(entity.AddressBookConvertable other) {
      return ((com.guidewire.pl.domain.contact.impl.AddressBookConvertableImplCallback)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.AddressBookConvertableImplCallback")).diffSyncableRelationships(other);
    }
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
    }
    
    public com.guidewire.pl.domain.contact.DefinitiveMatch findDefinitiveMatch(com.guidewire.pl.domain.contact.AddressBookMatchContextType contextType) {
      return ((com.guidewire.pl.domain.contact.impl.AddressBookConvertableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.AddressBookConvertableInternalMethods")).findDefinitiveMatch(contextType);
    }
    
    public com.guidewire.pl.domain.contact.PotentialMatches findPotentialMatches(com.guidewire.pl.domain.contact.AddressBookMatchContextType contextType) {
      return ((com.guidewire.pl.domain.contact.impl.AddressBookConvertableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.AddressBookConvertableInternalMethods")).findPotentialMatches(contextType);
    }
    
    /**
     * Generate the contact link status.
     * @param remoteContact the Address Book entry corresponding to the localContact (may be null)
     * @param localContact the local contact
     * @return The contact link status
     * @deprecated Since ClaimCenter 8.0, use generateContactLinkStatus() in ContactSystemUtil
     */
    @java.lang.Deprecated
    public com.guidewire.pl.domain.contact.ContactLinkStatus generateContactLinkStatus(entity.Contact remoteContact, entity.Contact localContact) {
      return ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).generateContactLinkStatus(remoteContact, localContact);
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateInsertEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateInsertEventsInternal();
    }
    
    /**
     * Gets this Contact's Address Book link status.
     * <p/>
     * <b>Notice:</b> Executing this method requires going over the wire to the addressbook, so if used in a pcf file it
     * should only be used in the initialValue of a variable.  For example:
     * <pre>&lt;Variable name="linkStatus" initialValue="Contact==null ? null : Contact.generateLinkStatus()" recalculateOnRefresh="true"/&gt; </pre>
     * @throws RuntimeException On any problem with the addressbook, including if ContactManager is down.
     * @deprecated Since ClaimCenter 8.0, use generateLinkStatus() in ContactSystemUtil
     */
    @java.lang.Deprecated
    public gw.api.contact.LinkStatus generateLinkStatus() {
      return ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).generateLinkStatus();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateRemoveEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateRemoveEventsInternal();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateUpdateEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateUpdateEventsInternal();
    }
    
    /**
     * Retrieves the fingerprint for this contact.
     * @return fingerprint value of this contact or null if no fingerprint defined.
     */
    @java.lang.Deprecated
    public java.lang.String getAddressBookFingerprint() {
      return ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).getAddressBookFingerprint();
    }
    
    /**
     * Gets the value of the AddressBookUID field.
     * Represents the ID of the associated object in Address Book.  Null if the object is not linked to Address Book.
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
     * Gets the value of the Contact field.
     * Associated Contact.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Contact getContact() {
      return (entity.Contact)__getInternalInterface().getFieldValue(CONTACT_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getContactID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CONTACT_PROP.get());
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
     * Gets the Address Book Contact to which this Contact is linked.
     * Also brings related contacts in primary relationships with the linked contact.
     * <p/>
     * Performance note: This operation requires a remote access to the Address Book.
     * @throws com.guidewire.pl.domain.contact.AddressBookUnavailableException 
     * @return null if the Contact is not linked to the Address Book or the link is broken.
     * @deprecated Since ClaimCenter 8.0, use getLinkedContact() in ContactSystemUtil
     */
    @java.lang.Deprecated
    public entity.Contact getLinkedContact() {
      return ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).getLinkedContact();
    }
    
    public entity.Contact getLinkedContact(com.guidewire.pl.domain.addressbook.ContactRelationshipLookupType relationshipType) {
      return ((com.guidewire.pl.domain.contact.impl.AddressBookConvertableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.AddressBookConvertableInternalMethods")).getLinkedContact(relationshipType);
    }
    
    /**
     * Gets the value of the LoadCommandID field.
     * LoadCommand for load where row was created. If not null this object was loaded via the loader.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getLoadCommandID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(LOADCOMMANDID_PROP.get());
    }
    
    public com.guidewire.pl.system.beanmatcher.PropertyMatchHandlerMap getPropertyMatchHandlerMap() {
      return ((com.guidewire.pl.domain.contact.impl.AddressBookConvertableImplCallback)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.AddressBookConvertableImplCallback")).getPropertyMatchHandlerMap();
    }
    
    public com.guidewire.pl.system.beansyncer.PropertySyncHandlerMap getPropertySyncHandlerMap(gw.entity.IEntityType entityType) {
      return ((com.guidewire.pl.domain.contact.impl.AddressBookConvertableImplCallback)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.AddressBookConvertableImplCallback")).getPropertySyncHandlerMap(entityType);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the ReviewCategory field.
     * Category of this Score.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ReviewCategory getReviewCategory() {
      return (typekey.ReviewCategory)__getInternalInterface().getFieldValue(REVIEWCATEGORY_PROP.get());
    }
    
    /**
     * Gets the value of the Score field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getScore() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(SCORE_PROP.get());
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
     * Links to the given contact, and syncs, then commits in a bundle.
     * @param contact - the contact to link and sync
     * @deprecated Since ClaimCenter 8.0, use ContactSystemUtil.linkToContactSystem
     */
    @java.lang.Deprecated
    public entity.AddressBookConvertable linkAndSyncToAB(entity.Contact contact) {
      return ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).linkAndSyncToAB(contact);
    }
    
    /**
     * Links this Contact to the given Address Book Contact.
     * @param addressBookContact 
     * @throws IllegalArgumentException if this Contact can not be linked to the given
     *                                  Contact.
     * @deprecated Since ClaimCenter 8.0, use ContactSystemUtil.linkToContactInContactSystem
     */
    @java.lang.Deprecated
    public void linkTo(entity.Contact addressBookContact) {
      ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).linkTo(addressBookContact);
    }
    
    public void markAsUpdatedInAddressBook() {
      ((com.guidewire.pl.domain.contact.impl.AddressBookConvertableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.AddressBookConvertableInternalMethods")).markAsUpdatedInAddressBook();
    }
    
    public boolean matches(entity.AddressBookConvertable other) {
      return ((com.guidewire.pl.domain.contact.impl.AddressBookConvertableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.AddressBookConvertableInternalMethods")).matches(other);
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
     * Sets the fingerprint for this contact.
     * @param fingerprint fingerprint value of this contact
     */
    @java.lang.Deprecated
    public void setAddressBookFingerprint(java.lang.String fingerprint) {
      ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).setAddressBookFingerprint(fingerprint);
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
     * Sets the value of the Contact field.
     */
    public void setContact(entity.Contact value) {
      __getInternalInterface().setFieldValue(CONTACT_PROP.get(), value);
    }
    
    public void setContactID(gw.pl.persistence.core.Key value) {
      setFieldValue(CONTACT_PROP.get(), value);
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
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the ReviewCategory field.
     */
    public void setReviewCategory(typekey.ReviewCategory value) {
      __getInternalInterface().setFieldValue(REVIEWCATEGORY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Score field.
     */
    public void setScore(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(SCORE_PROP.get(), value);
    }
    
    /**
     * Update this AddressBookConvertable from the remote Address Book.
     * @throws com.guidewire.pl.domain.contact.AddressBookUnavailableException 
     * @return the synced AddressBookConvertable. Note that this may be a different Java object than this
     *         AddressBookConvertable. This would happen if the Contact were downcast as part of the sync. Returns null if this
     *         AddressBookConvertable is not linked to the Address Book.
     * @deprecated Since ClaimCenter 8.0, use syncToContactSystem() in ContactSystemUtil
     */
    @java.lang.Deprecated
    public entity.AddressBookConvertable syncToAB() {
      return ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).syncToAB();
    }
    
    /**
     * If the contact is linked and not in sync, update this AddressBookConvertable from the remote Address Book.
     * 
     * This routine is more efficient than calling isLinked() and isSynced() then calling syncToAB().
     * It will make only one call to AB versus three calls for the other calls.
     * .
     * @return If updated, the synced AddressBookConvertable. Note that this may be a different Java object than this
     *         AddressBookConvertable. This would happen if the Contact were downcast as part of the sync. Returns null if this
     *         AddressBookConvertable is not linked to the Address Book.  If not updated, returns 'this'
     * @deprecated Since ClaimCenter 8.0, use syncToContactSystem() in ContactSystemUtil
     */
    @java.lang.Deprecated
    public entity.AddressBookConvertable syncToABIfNeeded() {
      return ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).syncToABIfNeeded();
    }
    
    /**
     * Update this AddressBookConvertable from the remote Address Book without syncing related contacts.
     * This is primarily used when you have a stub contact which is itself a related contact. When adding that
     * stub contact to an application you need to sync the contact but you don't want to bring over it's related
     * contacts as well, which would bring over too many contacts.
     * @throws com.guidewire.pl.domain.contact.AddressBookUnavailableException 
     * @return the synced AddressBookConvertable. Note that this may be a different Java object than this
     *         AddressBookConvertable. This would happen if the Contact were downcast as part of the sync. Returns null if this
     *         AddressBookConvertable is not linked to the Address Book.
     * @deprecated Since ClaimCenter 8.0, use syncToContactSystem() in ContactSystemUtil with false for syncRelatedContacts parameter
     */
    @java.lang.Deprecated
    public entity.AddressBookConvertable syncToABWithoutRelatedContacts() {
      return ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).syncToABWithoutRelatedContacts();
    }
    
    public entity.AddressBookConvertable syncToContact(entity.Contact remoteContact) {
      return ((com.guidewire.pl.domain.contact.impl.AddressBookConvertableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.AddressBookConvertableInternalMethods")).syncToContact(remoteContact);
    }
    
    /**
     * Returns the representation of this addressBookConvertable as a Contact.
     * @return version of this as a Contact
     */
    @java.lang.Deprecated
    public entity.Contact toContact() {
      return ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).toContact();
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
     * Unlinks this AddressBookConvertable from the Address Book.
     * This is done by marking this AddressBookConvertable out of sync, and clearing the AddressBookUID
     * field on every linked sub-object.
     * @deprecated Since ClaimCenter 8.0, use ContactSystemUtil.unlinkFromContactSystem(Contact)
     */
    public void unlink() {
      ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).unlink();
    }
    
    /**
     * Pushes the changes made on this AddressBookConvertable to the Address Book.
     * Changes are determined by looking up the latest data in the Address Book and diffing it
     * with the data on this AddressBookConvertable.
     * @param onlyPrimaryRelationships 
     * @throws com.guidewire.pl.domain.contact.AddressBookUnavailableException if an Address Book adapter error occurs
     * @throws com.guidewire.pl.domain.contact.AddressBookContactNotFoundException if the corresponding Contact
     *                               could not be found in the Address Book.
     * @throws IllegalStateException if this AddressBookConvertable is not linked to the Address Book
     * @throws com.guidewire.pl.domain.contact.AddressBookConcurrentDataChangeException if the Address Book has been modified
     *                               since this AddressBookConvertable was last synced with the Address Book
     * @throws com.guidewire.pl.system.exception.InsufficientPermissionException if the user
     *                               does not have "editab Contact" permission.
     * @throws gw.api.validation.EntityValidationException if the data in the update is
     *                               invalid for some reason.
     * @deprecated Since ClaimCenter 8.0, use updateContact() in ContactSystemPlugin
     */
    @java.lang.Deprecated
    public void updateAddressBook(boolean onlyPrimaryRelationships) {
      ((com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods")).updateAddressBook(onlyPrimaryRelationships);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods", "com.guidewire.pl.domain.contact.impl.AddressBookConvertableImpl");
    config.put("com.guidewire.pl.domain.contact.CommonCategoryScore", "com.guidewire.pl.domain.contact.impl.ContactCategoryScoreImpl");
    config.put("com.guidewire.pl.domain.contact.impl.AddressBookConvertableImplCallback", "com.guidewire.pl.domain.contact.impl.ContactCategoryScoreImpl");
    config.put("com.guidewire.pl.domain.contact.impl.AddressBookConvertableInternalMethods", "com.guidewire.pl.domain.contact.impl.AddressBookConvertableImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ContactCategoryScore.class, config);
    com.guidewire._generated.entity.ContactCategoryScoreInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ContactCategoryScore, com.guidewire._generated.entity.ContactCategoryScoreInternal>() {
      public java.lang.Object getImplementation(entity.ContactCategoryScore bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ContactCategoryScoreInternal getInternalInterface(entity.ContactCategoryScore bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ContactCategoryScore newEmptyInstance() {
        return new entity.ContactCategoryScore((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}