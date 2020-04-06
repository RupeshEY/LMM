package entity;

/**
 * AutoTowingAgcy
 * 
 * Represents an automobile towing service as a CompanyVendor.
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AutoTowingAgcy.eti;AutoTowingAgcy.eix;AutoTowingAgcy.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "AutoTowingAgcy")
public class AutoTowingAgcy extends entity.CompanyVendor {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.AutoTowingAgcy> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.AutoTowingAgcy>("entity.AutoTowingAgcy");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> AUTOTOWINGLICENSE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AutoTowingLicense");
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public AutoTowingAgcy()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public AutoTowingAgcy(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected AutoTowingAgcy(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected com.guidewire._generated.entity.AutoTowingAgcyInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.AutoTowingAgcyInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.AutoTowingAgcyInternal)super.__getInternalInterface();
  }
  
  /**
   * Gets the value of the AutoTowingLicense field.
   * Auto towing agency business license number
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAutoTowingLicense() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(AUTOTOWINGLICENSE_PROP.get());
  }
  
  /**
   * Sets the value of the AutoTowingLicense field.
   */
  public void setAutoTowingLicense(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(AUTOTOWINGLICENSE_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.AutoTowingAgcyInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.AutoTowingAgcy.this.__getDelegateManager();
    }
    
    /**
     * Adds the given address.  Does nothing if the Address already exists on the
     * Contact (either as the Primary Address or in the Contact Addresses array).  Adds as
     * primary if no primary exists.
     * @param address 
     */
    public void addAddress(entity.Address address) {
      ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).addAddress(address);
    }
    
    public void addCommonAddress(entity.Address address) {
      ((com.guidewire.pl.domain.contact.impl.CommonContactInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactInternalMethods")).addCommonAddress(address);
    }
    
    public void addCommonContactByRelationship(typekey.ContactBidiRel relationship, entity.CommonContact contact) throws com.guidewire.pl.domain.addressbook.ContactRelationshipValidationException {
      ((com.guidewire.pl.domain.contact.impl.CommonContactInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactInternalMethods")).addCommonContactByRelationship(relationship, contact);
    }
    
    public void addCommonContactContact(entity.CommonContactContact contactContact) {
      ((com.guidewire.pl.domain.contact.impl.CommonContactInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactInternalMethods")).addCommonContactContact(contactContact);
    }
    
    /**
     * 
     * @param contactContact 
     */
    public void addContactContact(entity.ContactContact contactContact) {
      ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).addContactContact(contactContact);
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
    
    public void addSecondaryCommonAddress(entity.Address address) {
      ((com.guidewire.pl.domain.contact.impl.CommonContactInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactInternalMethods")).addSecondaryCommonAddress(address);
    }
    
    /**
     * Adds the given element to the CategoryScores array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToCategoryScores(entity.ContactCategoryScore element) {
      __getInternalInterface().addArrayElement(CATEGORYSCORES_PROP.get(), element);
    }
    
    public void addToCommonContactAddresses(entity.CommonContactAddress contactAddress) {
      ((com.guidewire.pl.domain.contact.impl.CommonContactImplCallback)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactImplCallback")).addToCommonContactAddresses(contactAddress);
    }
    
    /**
     * Adds the given element to the ContactAddresses array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToContactAddresses(entity.ContactAddress element) {
      __getInternalInterface().addArrayElement(CONTACTADDRESSES_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the EFTRecords array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToEFTRecords(entity.EFTData element) {
      __getInternalInterface().addArrayElement(EFTRECORDS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the FingerprintArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToFingerprintArray(entity.ContactFingerprint element) {
      __getInternalInterface().addArrayElement(FINGERPRINTARRAY_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the OfficialIDs array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToOfficialIDs(entity.OfficialID element) {
      __getInternalInterface().addArrayElement(OFFICIALIDS_PROP.get(), element);
    }
    
    public void addToOfficialIDs(typekey.OfficialIDType type, typekey.Jurisdiction state) {
      ((com.guidewire.pl.domain.contact.OfficialIDBaseContainer)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.OfficialIDBaseContainer")).addToOfficialIDs(type, state);
    }
    
    /**
     * Adds the given element to the Reviews array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToReviews(entity.Review element) {
      __getInternalInterface().addArrayElement(REVIEWS_PROP.get(), element);
    }
    
    public void addToSourceCommonContactContacts(entity.CommonContactContact contactContact) {
      ((com.guidewire.pl.domain.contact.impl.CommonContactImplCallback)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactImplCallback")).addToSourceCommonContactContacts(contactContact);
    }
    
    /**
     * Adds the given element to the SourceRelatedContacts array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToSourceRelatedContacts(entity.ContactContact element) {
      __getInternalInterface().addArrayElement(SOURCERELATEDCONTACTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Tags array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToTags(entity.ContactTag element) {
      __getInternalInterface().addArrayElement(TAGS_PROP.get(), element);
    }
    
    public void addToTargetCommonContactContacts(entity.CommonContactContact contactContact) {
      ((com.guidewire.pl.domain.contact.impl.CommonContactImplCallback)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactImplCallback")).addToTargetCommonContactContacts(contactContact);
    }
    
    /**
     * Adds the given element to the TargetRelatedContacts array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToTargetRelatedContacts(entity.ContactContact element) {
      __getInternalInterface().addArrayElement(TARGETRELATEDCONTACTS_PROP.get(), element);
    }
    
    public void afterDatabaseWrite() {
      ((com.guidewire.pl.system.bundle.CommitCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.CommitCallback")).afterDatabaseWrite();
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
    
    public void beforeRemove() {
      ((com.guidewire.pl.system.bundle.RemoveCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.RemoveCallback")).beforeRemove();
    }
    
    public void beforeUpdate() {
      ((com.guidewire.pl.system.bundle.UpdateCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.UpdateCallback")).beforeUpdate();
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
    
    public void ensureMinimumTags() {
      ((gw.api.contact.ContactMinimalTags)__getDelegateManager().getImplementation("gw.api.contact.ContactMinimalTags")).ensureMinimumTags();
    }
    
    public com.guidewire.pl.domain.contact.DefinitiveMatch findDefinitiveMatch(com.guidewire.pl.domain.contact.AddressBookMatchContextType contextType) {
      return ((com.guidewire.pl.domain.contact.impl.AddressBookConvertableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.AddressBookConvertableInternalMethods")).findDefinitiveMatch(contextType);
    }
    
    /**
     * Finds potential duplicates in the Address Book for this contact.
     * @return a QueryProcessor containing potential duplicates, if any
     * @deprecated since ClaimCenter 8.0, use ContactSystemUtil.findPotentialMatches(Contact)
     */
    @java.lang.Deprecated
    public gw.api.database.IQueryBeanResult findPotentialDuplicates() {
      return ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).findPotentialDuplicates();
    }
    
    /**
     * Finds contacts in the Address Book that potentially match this contact.
     * @return the potentially matching contacts
     * @deprecated since ClaimCenter 8.0 - use ContactSystemPlugin.findDuplicates
     */
    @java.lang.Deprecated
    public com.guidewire.pl.domain.contact.FindPotentialMatchesResult findPotentialMatches() {
      return ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).findPotentialMatches();
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
    
    public java.util.List generateInsertEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).generateInsertEvents();
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
    
    public java.lang.Object getAddressBookContextEqualityValue() {
      return ((com.guidewire.pl.domain.contact.impl.ContactInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.ContactInternalMethods")).getAddressBookContextEqualityValue();
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
     * Gets all the Contact's Addresses. Includes the primary Address and secondary Addresses.
     */
    public entity.Address[] getAllAddresses() {
      return ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).getAllAddresses();
    }
    
    public entity.Address[] getAllCommonAddresses() {
      return ((com.guidewire.pl.domain.contact.impl.CommonContactInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactInternalMethods")).getAllCommonAddresses();
    }
    
    public entity.CommonContactContact[] getAllCommonContactContacts() {
      return ((com.guidewire.pl.domain.contact.impl.CommonContactInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactInternalMethods")).getAllCommonContactContacts();
    }
    
    /**
     * 
     * @return 
     */
    public entity.ContactContact[] getAllContactContacts() {
      return ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).getAllContactContacts();
    }
    
    /**
     * Gets the value of the ArchivePartition field.
     * Unique number to partition the data so that the multiple workers can work independently
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getArchivePartition() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(ARCHIVEPARTITION_PROP.get());
    }
    
    public entity.Contact getAs(java.lang.String contactSubtypeName) {
      return ((com.guidewire.pl.domain.contact.impl.ContactInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.ContactInternalMethods")).getAs(contactSubtypeName);
    }
    
    /**
     * Gets the value of the AutoSync field.
     * A status code to indicate whether this entity allows auto-sync or not. Null means disallow.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.AutoSync getAutoSync() {
      return (typekey.AutoSync)__getInternalInterface().getFieldValue(AUTOSYNC_PROP.get());
    }
    
    /**
     * Gets the value of the AutoTowingLicense field.
     * Auto towing agency business license number
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getAutoTowingLicense() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(AUTOTOWINGLICENSE_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the CategoryScores field.
     * List of categories and their average scores, associated with this Contact.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ContactCategoryScore[] getCategoryScores() {
      return (entity.ContactCategoryScore[])__getInternalInterface().getFieldValue(CATEGORYSCORES_PROP.get());
    }
    
    public entity.CommonContactAddress[] getCommonContactAddresses() {
      return ((com.guidewire.pl.domain.contact.impl.CommonContactImplCallback)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactImplCallback")).getCommonContactAddresses();
    }
    
    /**
     * Gets the contact related to this contact via the given relationship.
     * @param relationship a "zeroorone" cardinality relationship
     * @throws IllegalArgumentException if the given relationship does not have "zeroorone" cardinality
     * @return the related contact, or null if no contact is related to this contact via the given relationship.
     */
    public entity.CommonContact getCommonContactByRelationship(typekey.ContactBidiRel relationship) {
      return ((com.guidewire.pl.domain.contact.CommonContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.CommonContactPublicMethods")).getCommonContactByRelationship(relationship);
    }
    
    public entity.CommonContactContact[] getCommonContactContactsByRelationship(typekey.ContactBidiRel relationship) {
      return ((com.guidewire.pl.domain.contact.impl.CommonContactInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactInternalMethods")).getCommonContactContactsByRelationship(relationship);
    }
    
    /**
     * Gets the contacts related to this contact via the given relationship.
     * @param relationship a relationship
     * @return the related contacts, or an empty array if no contacts are related to this contact via the given relationship.
     */
    public entity.CommonContact[] getCommonContactsByRelationship(typekey.ContactBidiRel relationship) {
      return ((com.guidewire.pl.domain.contact.CommonContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.CommonContactPublicMethods")).getCommonContactsByRelationship(relationship);
    }
    
    public gw.entity.IEntityType getContactAddressType() {
      return ((com.guidewire.pl.domain.contact.impl.CommonContactImplCallback)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactImplCallback")).getContactAddressType();
    }
    
    /**
     * Gets the value of the ContactAddresses field.
     * Secondary addresses associated with the contact.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ContactAddress[] getContactAddresses() {
      return (entity.ContactAddress[])__getInternalInterface().getFieldValue(CONTACTADDRESSES_PROP.get());
    }
    
    /**
     * Retreives the company from a contact.  If the contact itself is a company, returns null.
     * @return the company from a contact.  If the contact itself is a company, returns null.
     */
    public entity.Company getContactCompany() {
      return ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).getContactCompany();
    }
    
    public gw.entity.IEntityType getContactContactType() {
      return ((com.guidewire.pl.domain.contact.impl.CommonContactImplCallback)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactImplCallback")).getContactContactType();
    }
    
    /**
     * 
     * @param relationship 
     * @return 
     */
    public entity.ContactContact[] getContactContactsByRelationship(typekey.ContactBidiRel relationship) {
      return ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).getContactContactsByRelationship(relationship);
    }
    
    public com.guidewire.pl.domain.contact.config.ContactRelationshipConfigFile getContactRelationshipConfig() {
      return ((com.guidewire.pl.domain.contact.impl.CommonContactImplCallback)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactImplCallback")).getContactRelationshipConfig();
    }
    
    /**
     * Returns the create status of the contact from Contact Manager
     * @return Create Status code as defined by ContactCreationApprovalStatus; if contact never retrieved from CM, return null
     */
    public typekey.ContactCreationApprovalStatus getCreateStatus() {
      return ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).getCreateStatus();
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
    
    public typekey.ContactCreationApprovalStatus getCreationApprovalStatus() {
      return ((com.guidewire.pl.domain.contact.impl.ContactInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.ContactInternalMethods")).getCreationApprovalStatus();
    }
    
    public typekey.ValidationLevel getDefaultValidationLevel() {
      return ((com.guidewire.pl.system.entity.LevelAwareValidatableBean)__getDelegateManager().getImplementation("com.guidewire.pl.system.entity.LevelAwareValidatableBean")).getDefaultValidationLevel();
    }
    
    /**
     * Gets the value of the ECFBureauId_Ext field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getECFBureauId_Ext() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ECFBUREAUID_EXT_PROP.get());
    }
    
    /**
     * Gets the value of the ECFBureauType_Ext field.
     * Coded indication of the maintenance agency (Bureau).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ECFBureauType_Ext getECFBureauType_Ext() {
      return (typekey.ECFBureauType_Ext)__getInternalInterface().getFieldValue(ECFBUREAUTYPE_EXT_PROP.get());
    }
    
    /**
     * Gets the value of the EFTRecords field.
     * Electronic Funds Transfer data for the contact
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.EFTData[] getEFTRecords() {
      return (entity.EFTData[])__getInternalInterface().getFieldValue(EFTRECORDS_PROP.get());
    }
    
    /**
     * Gets the value of the EmailAddress1 field.
     * Primary email address associated with the contact.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getEmailAddress1() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EMAILADDRESS1_PROP.get());
    }
    
    /**
     * Gets the value of the EmailAddress2 field.
     * Secondary email address associated with the contact.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getEmailAddress2() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EMAILADDRESS2_PROP.get());
    }
    
    public com.guidewire.pl.system.entity.BeanEvent[] getEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).getEvents();
    }
    
    /**
     * Gets the value of the FaxPhone field.
     * Fax number associated with the contact.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getFaxPhone() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(FAXPHONE_PROP.get());
    }
    
    /**
     * Gets the value of the FaxPhoneCountry field.
     * Fax phone country.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.PhoneCountryCode getFaxPhoneCountry() {
      return (typekey.PhoneCountryCode)__getInternalInterface().getFieldValue(FAXPHONECOUNTRY_PROP.get());
    }
    
    /**
     * Gets the value of the FaxPhoneExtension field.
     * Fax phone extension.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getFaxPhoneExtension() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(FAXPHONEEXTENSION_PROP.get());
    }
    
    /**
     * Gets the value of the Fingerprint field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ContactFingerprint getFingerprint() {
      return (entity.ContactFingerprint)__getInternalInterface().getFieldValue(FINGERPRINT_PROP.get());
    }
    
    /**
     * Gets the value of the FingerprintArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ContactFingerprint[] getFingerprintArray() {
      return (entity.ContactFingerprint[])__getInternalInterface().getFieldValue(FINGERPRINTARRAY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getFingerprintID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(FINGERPRINT_PROP.get());
    }
    
    /**
     * Returns whether contact has pending updates as reported by Contact Manager
     * @return whether contact has any pending updates; ; if contact never retrieved from CM, return null
     */
    public java.lang.Boolean getHasPendingUpdate() {
      return ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).getHasPendingUpdate();
    }
    
    /**
     * Gets the value of the HomePhone field.
     * Home phone number associated with the contact.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getHomePhone() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(HOMEPHONE_PROP.get());
    }
    
    /**
     * Gets the value of the HomePhoneCountry field.
     * Home phone country.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.PhoneCountryCode getHomePhoneCountry() {
      return (typekey.PhoneCountryCode)__getInternalInterface().getFieldValue(HOMEPHONECOUNTRY_PROP.get());
    }
    
    /**
     * Gets the value of the HomePhoneExtension field.
     * Home phone extension.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getHomePhoneExtension() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(HOMEPHONEEXTENSION_PROP.get());
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
     * Gets the value of the LMContactID_Ext field.
     * The ID of the ECF Contact.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getLMContactID_Ext() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LMCONTACTID_EXT_PROP.get());
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
    
    /**
     * Gets the value of the Name field.
     * This contact's name.
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
     * This contact's name in kanji (used only for Japanese names and will be null otherwise)
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getNameKanji() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NAMEKANJI_PROP.get());
    }
    
    /**
     * Gets the value of the Notes field.
     * Notes on this contact.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getNotes() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NOTES_PROP.get());
    }
    
    /**
     * Get official id by type (supports typinfo for XYZOfficialID) works only for non-state specific ids.
     * @param type type to retrieve
     * @return the corresponding officialid
     */
    public java.lang.String getOfficialID(typekey.OfficialIDType type) {
      return ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).getOfficialID(type);
    }
    
    public com.guidewire.pl.domain.contact.OfficialIDBase[] getOfficialIDBases() {
      return ((com.guidewire.pl.domain.contact.OfficialIDBaseContainer)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.OfficialIDBaseContainer")).getOfficialIDBases();
    }
    
    /**
     * Get official id by state and type.
     * @param type - which type of id (fein etc)
     * @param state - applying in which state (for per state types), use null if not state specific
     * @return the corresponding officialid
     */
    public entity.OfficialID getOfficialIDByTypeAndState(typekey.OfficialIDType type, typekey.Jurisdiction state) {
      return ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).getOfficialIDByTypeAndState(type, state);
    }
    
    /**
     * Gets the value of the OfficialIDs field.
     * TaxIDs associated with this contact
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.OfficialID[] getOfficialIDs() {
      return (entity.OfficialID[])__getInternalInterface().getFieldValue(OFFICIALIDS_PROP.get());
    }
    
    /**
     * Returns the PrimaryLanguage if it is not null, else the default LanguageType for the application
     * @return the PrimaryLanguage if it is not null, else the default LanguageType for the application
     */
    public typekey.LanguageType getOrInferPrimaryLanguage() {
      return ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).getOrInferPrimaryLanguage();
    }
    
    /**
     * Gets the value of the OrganizationType field.
     * Type of organization
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.OrganizationType getOrganizationType() {
      return (typekey.OrganizationType)__getInternalInterface().getFieldValue(ORGANIZATIONTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the OriginalInsurerReference_Ext field.
     * The original insurer reference
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getOriginalInsurerReference_Ext() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ORIGINALINSURERREFERENCE_EXT_PROP.get());
    }
    
    /**
     * Return the original values xml that was created when this contact was created by the
     * ContactIntegrationXMLMapper.  Could be null, so it is up to caller to handle that case.
     * @return the original values xml
     */
    public com.guidewire.pl.domain.contact.XmlElementByteContainer<gw.xml.XmlElement> getOriginalValuesXML() {
      return ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).getOriginalValuesXML();
    }
    
    /**
     * Returns the original values XML as an XMLElement
     * @return The original values XML element
     */
    public gw.xml.XmlElement getOriginalValuesXMLElement() {
      return ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).getOriginalValuesXMLElement();
    }
    
    /**
     * Gets the value of the PolicySystemId field.
     * Identifier for the contact in an external policy system
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPolicySystemId() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICYSYSTEMID_PROP.get());
    }
    
    public typekey.ContactBidiRel[] getPossibleBidiRelsToCommonContact(entity.CommonContact otherContact) {
      return ((com.guidewire.pl.domain.contact.impl.CommonContactInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactInternalMethods")).getPossibleBidiRelsToCommonContact(otherContact);
    }
    
    /**
     * 
     * @param otherContact If <i>null</i> then then delegating to getPossibleBidiRels();
     */
    public typekey.ContactBidiRel[] getPossibleBidiRelsToContact(entity.Contact otherContact) {
      return ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).getPossibleBidiRelsToContact(otherContact);
    }
    
    /**
     * Gets the value of the PreferredCurrency field.
     * The contact's preferred currency.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getPreferredCurrency() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(PREFERREDCURRENCY_PROP.get());
    }
    
    /**
     * Gets the value of the PrimaryAddress field.
     * Primary address associated with the contact.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Address getPrimaryAddress() {
      return (entity.Address)__getInternalInterface().getFieldValue(PRIMARYADDRESS_PROP.get());
    }
    
    /**
     * Returns the display value for this Contact's primary address.
     * @return the display value for this Contact's primary address.
     */
    public java.lang.String getPrimaryAddressDisplayValue() {
      return ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).getPrimaryAddressDisplayValue();
    }
    
    public gw.pl.persistence.core.Key getPrimaryAddressID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(PRIMARYADDRESS_PROP.get());
    }
    
    public entity.Address getPrimaryCommonAddress() {
      return ((com.guidewire.pl.domain.contact.impl.CommonContactInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactInternalMethods")).getPrimaryCommonAddress();
    }
    
    /**
     * Gets the value of the PrimaryLanguage field.
     * The account's preferred language
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LanguageType getPrimaryLanguage() {
      return (typekey.LanguageType)__getInternalInterface().getFieldValue(PRIMARYLANGUAGE_PROP.get());
    }
    
    /**
     * Gets the value of the PrimaryLocale field.
     * The account's preferred locale
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LocaleType getPrimaryLocale() {
      return (typekey.LocaleType)__getInternalInterface().getFieldValue(PRIMARYLOCALE_PROP.get());
    }
    
    /**
     * Gets the value of the PrimaryPhone field.
     * Primary phone number type for the contact.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.PrimaryPhoneType getPrimaryPhone() {
      return (typekey.PrimaryPhoneType)__getInternalInterface().getFieldValue(PRIMARYPHONE_PROP.get());
    }
    
    /**
     * Gets the value of the Contact's primary phone number.
     * <p/>
     * Limitation: This method is not extendable at this time.  It means that if a customer extends the
     * PrimaryPhone typelist, for example adding "parents phone number", they cannot make this method return the
     * parents number.
     * @return the value of the Contact's primary phone number.
     */
    public java.lang.String getPrimaryPhoneValue() {
      return ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).getPrimaryPhoneValue();
    }
    
    /**
     * Returns the primary value used for sorting contact available to list views as sort criterion.
     * @return the primary value used for sorting contact available to list views as sort criterion.
     */
    public java.lang.String getPrimarySortValue() {
      return ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).getPrimarySortValue();
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
     * Returns the quaternary (4th) value used for sorting contact available to list views as sort criterion.
     * @return the Quaternary (4th) value used for sorting contact available to list views as sort criterion.
     */
    public java.lang.String getQuaternarySortValue() {
      return ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).getQuaternarySortValue();
    }
    
    public java.util.Set getRelatedAddressBookUIDs(typekey.ContactBidiRel contactBidiRel) {
      return ((com.guidewire.pl.domain.contact.impl.ContactInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.ContactInternalMethods")).getRelatedAddressBookUIDs(contactBidiRel);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
    }
    
    /**
     * Gets the value of the Reviews field.
     * Reviews for Service Provider Management
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Review[] getReviews() {
      return (entity.Review[])__getInternalInterface().getFieldValue(REVIEWS_PROP.get());
    }
    
    /**
     * Gets the value of the Score field.
     * Overall review Score for this Contact
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getScore() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(SCORE_PROP.get());
    }
    
    /**
     * Gets all the Contact's secondary Addresses.
     */
    public entity.Address[] getSecondaryAddresses() {
      return ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).getSecondaryAddresses();
    }
    
    public entity.Address[] getSecondaryCommonAddresses() {
      return ((com.guidewire.pl.domain.contact.impl.CommonContactInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactInternalMethods")).getSecondaryCommonAddresses();
    }
    
    /**
     * Returns the secondary value used for sorting contact available to list views as sort criterion.
     * @return Secondary value used for sorting contact available to list views as sort criterion.
     */
    public java.lang.String getSecondarySortValue() {
      return ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).getSecondarySortValue();
    }
    
    /**
     * List of categories associated with this ABContact and their scores.
     */
    public entity.ContactCategoryScore[] getSortedCategoryScores() {
      return ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).getSortedCategoryScores();
    }
    
    public entity.CommonContactContact[] getSourceCommonContactContacts() {
      return ((com.guidewire.pl.domain.contact.impl.CommonContactImplCallback)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactImplCallback")).getSourceCommonContactContacts();
    }
    
    /**
     * Gets the value of the SourceRelatedContacts field.
     * Contacts that point to this contact.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ContactContact[] getSourceRelatedContacts() {
      return (entity.ContactContact[])__getInternalInterface().getFieldValue(SOURCERELATEDCONTACTS_PROP.get());
    }
    
    /**
     * Gets the value of the SpecialtyType field.
     * Specialty of the doctor
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.SpecialtyType getSpecialtyType() {
      return (typekey.SpecialtyType)__getInternalInterface().getFieldValue(SPECIALTYTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the Subtype field.
     * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Contact getSubtype() {
      return (typekey.Contact)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
    }
    
    /**
     * Returns the tag types
     * @return the tag types
     */
    public typekey.ContactTagType[] getTagTypes() {
      return ((com.guidewire.pl.domain.contact.CommonContactAdapter)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.CommonContactAdapter")).getTagTypes();
    }
    
    /**
     * Gets the value of the Tags field.
     * List of ContactTags.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ContactTag[] getTags() {
      return (entity.ContactTag[])__getInternalInterface().getFieldValue(TAGS_PROP.get());
    }
    
    public entity.CommonContactContact[] getTargetCommonContactContacts() {
      return ((com.guidewire.pl.domain.contact.impl.CommonContactImplCallback)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactImplCallback")).getTargetCommonContactContacts();
    }
    
    /**
     * Gets the value of the TargetRelatedContacts field.
     * Contacts that this Contact points to.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ContactContact[] getTargetRelatedContacts() {
      return (entity.ContactContact[])__getInternalInterface().getFieldValue(TARGETRELATEDCONTACTS_PROP.get());
    }
    
    /**
     * Gets the value of the TaxID field.
     * Tax ID for the contact (SSN or EIN).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getTaxID() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TAXID_PROP.get());
    }
    
    /**
     * Gets the value of the TaxStatus field.
     * Status of the contact's tax ID; whether it is known or unknown.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.TaxStatus getTaxStatus() {
      return (typekey.TaxStatus)__getInternalInterface().getFieldValue(TAXSTATUS_PROP.get());
    }
    
    /**
     * Returns the tertiary (3rd) value used for sorting contact available to list views as sort criterion.
     * @return the tertiary (3rd) value used for sorting contact available to list views as sort criterion.
     */
    public java.lang.String getTertiarySortValue() {
      return ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).getTertiarySortValue();
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
     * Gets the value of the ValidationLevel field.
     * Validation level that this object passed (if any) before it was stored.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ValidationLevel getValidationLevel() {
      return (typekey.ValidationLevel)__getInternalInterface().getFieldValue(VALIDATIONLEVEL_PROP.get());
    }
    
    /**
     * Gets the validation result.
     * @return The validation result.
     */
    public gw.api.validation.ValidationResult getValidationResult() {
      return ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).getValidationResult();
    }
    
    /**
     * Gets the value of the VendorNumber field.
     * Vendor number for the contact.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getVendorNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(VENDORNUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the VendorType field.
     * The company's vendor type.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.VendorType getVendorType() {
      return (typekey.VendorType)__getInternalInterface().getFieldValue(VENDORTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the W9ReceivedDate field.
     * W-9 form received date
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getW9ReceivedDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(W9RECEIVEDDATE_PROP.get());
    }
    
    /**
     * Gets the value of the W9ValidFrom field.
     * W-9 valid start date
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getW9ValidFrom() {
      return (java.util.Date)__getInternalInterface().getFieldValue(W9VALIDFROM_PROP.get());
    }
    
    /**
     * Gets the value of the W9ValidTo field.
     * W-9 valid to date
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getW9ValidTo() {
      return (java.util.Date)__getInternalInterface().getFieldValue(W9VALIDTO_PROP.get());
    }
    
    /**
     * Gets the value of the WithholdingRate field.
     * The contact's backup withholding rate, or null if backup withholding is not required or is not known to be required.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getWithholdingRate() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(WITHHOLDINGRATE_PROP.get());
    }
    
    /**
     * Gets the value of the WorkPhone field.
     * Business phone number associated with the contact.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getWorkPhone() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(WORKPHONE_PROP.get());
    }
    
    /**
     * Gets the value of the WorkPhoneCountry field.
     * Work phone country.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.PhoneCountryCode getWorkPhoneCountry() {
      return (typekey.PhoneCountryCode)__getInternalInterface().getFieldValue(WORKPHONECOUNTRY_PROP.get());
    }
    
    /**
     * Gets the value of the WorkPhoneExtension field.
     * Business phone extension.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getWorkPhoneExtension() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(WORKPHONEEXTENSION_PROP.get());
    }
    
    public void handleBeforeInsert() {
      ((gw.api.contact.ContactLifecycle)__getDelegateManager().getImplementation("gw.api.contact.ContactLifecycle")).handleBeforeInsert();
    }
    
    public void handleBeforeRemove() {
      ((gw.api.contact.ContactLifecycle)__getDelegateManager().getImplementation("gw.api.contact.ContactLifecycle")).handleBeforeRemove();
    }
    
    public void handleBeforeUpdate() {
      ((gw.api.contact.ContactLifecycle)__getDelegateManager().getImplementation("gw.api.contact.ContactLifecycle")).handleBeforeUpdate();
    }
    
    public void handleInitNew() {
      ((gw.api.contact.ContactLifecycle)__getDelegateManager().getImplementation("gw.api.contact.ContactLifecycle")).handleInitNew();
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * 
     * @return true if the contact is linked to the address book.
     * @deprecated since ClaimCenter 8.0, use ContactSystemUtil#contactIsLinked(contact)
     */
    @java.lang.Deprecated
    public boolean isLinked() {
      return ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).isLinked();
    }
    
    /**
     * Gets the value of the LoadRelatedContacts field.
     * This field is deprecated. It was formerly used to determine whether related contacts should be loaded from the Address Book.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isLoadRelatedContacts() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(LOADRELATEDCONTACTS_PROP.get());
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
     * Gets the value of the PendingLinkMessage field.
     * whether the contact link messasge is still pending from ContactManager
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isPendingLinkMessage() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(PENDINGLINKMESSAGE_PROP.get());
    }
    
    /**
     * Gets the value of the Preferred field.
     * Whether the vendor is a preferred vendor.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isPreferred() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(PREFERRED_PROP.get());
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
     * 
     * @return true if the contact is synced to the address book.
     * @deprecated since ClaimCenter 8.0, use ContactSystemUtil#contactIsSynced(contact)
     */
    @java.lang.Deprecated
    public boolean isSynced() {
      return ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).isSynced();
    }
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    /**
     * Gets the value of the W9Received field.
     * Has W-9 form been received
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isW9Received() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(W9RECEIVED_PROP.get());
    }
    
    /**
     * Produces an iterator over this object's Contact graph.
     * @return an iterator
     */
    public java.util.Iterator iterateContactGraph() {
      return ((com.guidewire.pl.domain.contact.ContactGraphGenerator)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactGraphGenerator")).iterateContactGraph();
    }
    
    /**
     * Links this contact with the Address Book. Linking with the Address Book entails
     * the following steps:<ol>
     * <li>Search the Address Book for a definitive match. If there's an exact match, link and
     * sync this contact to it. If it's a non-exact, plausible match, link it, but leave it out
     * of sync. If it's a problematic match, return that result. If there's no match at all, then</li>
     * <li>Search the Address Book for potential matches. If potential matches exist, return that
     * result. If no potential matches exist, then</li>
     * <li>Attempt to create the contact in the Address Book. If the user doesn't have this permission,
     * then return that result. If the contact is successfully created, then link and sync it. Otherwise,
     * return the result of the unsuccessful create.</li>
     * </ol>
     * @deprecated since ClaimCenter 8.0 - use ContactSystemUtil.linkToContactSystem(Contact) instead
     */
    @java.lang.Deprecated
    public com.guidewire.pl.domain.contact.LinkResult link() {
      return ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).link();
    }
    
    /**
     * Links this contact to the given contact. The given contact must have a valid AddressBookUID and be of a type
     * compatible with this contact.
     * @param addressBookContact the contact to which to link this contact
     * @deprecated since ClaimCenter 8.0 - use  ContactSystemUtil.linkToContactInContactSystem(Contact,Contact) instead
     */
    @java.lang.Deprecated
    public void link(entity.Contact addressBookContact) {
      ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).link(addressBookContact);
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
     * Makes the given Address the primary Address. The previous primary Address, if any, is
     * added to the secondary Addresses. If the Address existed in secondary Addresses, it is
     * removed from that array.
     * @param address 
     */
    public void makePrimaryAddress(entity.Address address) {
      ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).makePrimaryAddress(address);
    }
    
    public void makePrimaryCommonAddress(entity.Address address) {
      ((com.guidewire.pl.domain.contact.impl.CommonContactInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactInternalMethods")).makePrimaryCommonAddress(address);
    }
    
    public void markAsUpdatedInAddressBook() {
      ((com.guidewire.pl.domain.contact.impl.AddressBookConvertableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.AddressBookConvertableInternalMethods")).markAsUpdatedInAddressBook();
    }
    
    public void markInSync() {
      ((com.guidewire.pl.domain.contact.impl.ContactInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.ContactInternalMethods")).markInSync();
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
    
    /**
     * Rejects the root bean w/ a global message
     * <p/>
     * Note the reason why the bean failed validation shouldn't refer to a particular
     * field in the entity. To do that, use the rejectField() method.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     */
    public void reject(typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).reject(errorLevel, strErrorReason, warningLevel, strWarningReason);
    }
    
    /**
     * Rejects a particular field or field path on the root bean.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     */
    public void rejectField(java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectField(strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason);
    }
    
    /**
     * Rejects a particular field or field path on the root bean.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     * @param flowStepId The process FlowStep that this error applies to, if any
     */
    public void rejectFieldWithFlowStep(java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason, java.lang.String flowStepId) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectFieldWithFlowStep(strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason, flowStepId);
    }
    
    /**
     * Reject a particular field of field path on a bean related to the root
     * bean, e.g. an array element of the bean such as an Exposure of a Claim.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * @param relatedBean Bean related to the root bean
     * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     */
    public void rejectSubField(entity.KeyableBean relatedBean, java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectSubField(relatedBean, strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason);
    }
    
    /**
     * Reject a particular field of field path on a bean related to the root
     * bean, e.g. an array element of the bean such as an Exposure of a Claim.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * Note that this is the fullest version of "reject"; all the others are
     * overloaded for easier use.
     * @param relatedBean Bean related to the root bean
     * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     * @param flowStepId The process FlowStep that this error applies to, if any
     */
    public void rejectSubFieldWithFlowStep(entity.KeyableBean relatedBean, java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason, java.lang.String flowStepId) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectSubFieldWithFlowStep(relatedBean, strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason, flowStepId);
    }
    
    /**
     * Rejects the root bean w/ a global message
     * <p/>
     * Note the reason why the bean failed validation shouldn't refer to a particular
     * field in the entity. To do that, use the rejectField() method.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     * @param flowStepId The process FlowStep that this error applies to, if any
     */
    public void rejectWithFlowStep(typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason, java.lang.String flowStepId) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectWithFlowStep(errorLevel, strErrorReason, warningLevel, strWarningReason, flowStepId);
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
     * Removes the given Address from the Contact. Does nothing if the
     * Contact does not have the given Address.
     * @param address 
     */
    public void removeAddress(entity.Address address) {
      ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).removeAddress(address);
    }
    
    public void removeCommonAddress(entity.Address address) {
      ((com.guidewire.pl.domain.contact.impl.CommonContactInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactInternalMethods")).removeCommonAddress(address);
    }
    
    public void removeCommonContactByRelationship(typekey.ContactBidiRel relationship, entity.CommonContact contact) {
      ((com.guidewire.pl.domain.contact.impl.CommonContactInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactInternalMethods")).removeCommonContactByRelationship(relationship, contact);
    }
    
    public void removeCommonContactContact(entity.CommonContactContact contactContact) {
      ((com.guidewire.pl.domain.contact.impl.CommonContactInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactInternalMethods")).removeCommonContactContact(contactContact);
    }
    
    /**
     * 
     * @param contactContact 
     */
    public void removeContactContact(entity.ContactContact contactContact) {
      ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).removeContactContact(contactContact);
    }
    
    /**
     * Removes the given element from the CategoryScores array. This is achieved by marking the element for removal.
     */
    public void removeFromCategoryScores(entity.ContactCategoryScore element) {
      __getInternalInterface().removeArrayElement(CATEGORYSCORES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the CategoryScores array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromCategoryScores(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CATEGORYSCORES_PROP.get(), elementID);
    }
    
    public void removeFromCommonContactAddresses(entity.CommonContactAddress contactAddress) {
      ((com.guidewire.pl.domain.contact.impl.CommonContactImplCallback)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactImplCallback")).removeFromCommonContactAddresses(contactAddress);
    }
    
    /**
     * Removes the given element from the ContactAddresses array. This is achieved by marking the element for removal.
     */
    public void removeFromContactAddresses(entity.ContactAddress element) {
      __getInternalInterface().removeArrayElement(CONTACTADDRESSES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ContactAddresses array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromContactAddresses(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CONTACTADDRESSES_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the EFTRecords array. This is achieved by marking the element for removal.
     */
    public void removeFromEFTRecords(entity.EFTData element) {
      __getInternalInterface().removeArrayElement(EFTRECORDS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the EFTRecords array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromEFTRecords(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(EFTRECORDS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the FingerprintArray array. This is achieved by marking the element for removal.
     */
    public void removeFromFingerprintArray(entity.ContactFingerprint element) {
      __getInternalInterface().removeArrayElement(FINGERPRINTARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the FingerprintArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromFingerprintArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(FINGERPRINTARRAY_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the OfficialIDs array. This is achieved by marking the element for removal.
     */
    public void removeFromOfficialIDs(entity.OfficialID element) {
      __getInternalInterface().removeArrayElement(OFFICIALIDS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the OfficialIDs array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromOfficialIDs(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(OFFICIALIDS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Reviews array. This is achieved by marking the element for removal.
     */
    public void removeFromReviews(entity.Review element) {
      __getInternalInterface().removeArrayElement(REVIEWS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Reviews array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromReviews(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(REVIEWS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the SourceRelatedContacts array. This is achieved by marking the element for removal.
     */
    public void removeFromSourceRelatedContacts(entity.ContactContact element) {
      __getInternalInterface().removeArrayElement(SOURCERELATEDCONTACTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the SourceRelatedContacts array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromSourceRelatedContacts(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(SOURCERELATEDCONTACTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Tags array. This is achieved by marking the element for removal.
     */
    public void removeFromTags(entity.ContactTag element) {
      __getInternalInterface().removeArrayElement(TAGS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Tags array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromTags(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(TAGS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the TargetRelatedContacts array. This is achieved by marking the element for removal.
     */
    public void removeFromTargetRelatedContacts(entity.ContactContact element) {
      __getInternalInterface().removeArrayElement(TARGETRELATEDCONTACTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the TargetRelatedContacts array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromTargetRelatedContacts(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(TARGETRELATEDCONTACTS_PROP.get(), elementID);
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
     * Sets the value of the AutoSync field.
     */
    public void setAutoSync(typekey.AutoSync value) {
      __getInternalInterface().setFieldValue(AUTOSYNC_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AutoTowingLicense field.
     */
    public void setAutoTowingLicense(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(AUTOTOWINGLICENSE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CategoryScores field.
     */
    public void setCategoryScores(entity.ContactCategoryScore[] value) {
      __getInternalInterface().setFieldValue(CATEGORYSCORES_PROP.get(), value);
    }
    
    /**
     * Sets the contact related to this contact via the given relationship.
     * @param relationship a "zeroorone" cardinality relationship
     * @param contact the related contact
     * @throws IllegalArgumentException if the given relationship does not have "zeroorone" cardinality
     */
    public void setCommonContactByRelationship(typekey.ContactBidiRel relationship, entity.CommonContact contact) {
      ((com.guidewire.pl.domain.contact.CommonContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.CommonContactPublicMethods")).setCommonContactByRelationship(relationship, contact);
    }
    
    /**
     * Sets the value of the ContactAddresses field.
     */
    public void setContactAddresses(entity.ContactAddress[] value) {
      __getInternalInterface().setFieldValue(CONTACTADDRESSES_PROP.get(), value);
    }
    
    /**
     * Sets the contact's creation approval status.  For internal use only.
     * @param status the create status of this contact
     */
    public void setCreateStatus(typekey.ContactCreationApprovalStatus status) {
      ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).setCreateStatus(status);
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
     * Sets the value of the ECFBureauId_Ext field.
     */
    public void setECFBureauId_Ext(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ECFBUREAUID_EXT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ECFBureauType_Ext field.
     */
    public void setECFBureauType_Ext(typekey.ECFBureauType_Ext value) {
      __getInternalInterface().setFieldValue(ECFBUREAUTYPE_EXT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EFTRecords field.
     */
    public void setEFTRecords(entity.EFTData[] value) {
      __getInternalInterface().setFieldValue(EFTRECORDS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EmailAddress1 field.
     */
    public void setEmailAddress1(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(EMAILADDRESS1_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EmailAddress2 field.
     */
    public void setEmailAddress2(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(EMAILADDRESS2_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FaxPhone field.
     */
    public void setFaxPhone(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(FAXPHONE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FaxPhoneCountry field.
     */
    public void setFaxPhoneCountry(typekey.PhoneCountryCode value) {
      __getInternalInterface().setFieldValue(FAXPHONECOUNTRY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FaxPhoneExtension field.
     */
    public void setFaxPhoneExtension(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(FAXPHONEEXTENSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Fingerprint field.
     */
    public void setFingerprint(entity.ContactFingerprint value) {
      __getInternalInterface().setFieldValue(FINGERPRINT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FingerprintArray field.
     */
    public void setFingerprintArray(entity.ContactFingerprint[] value) {
      __getInternalInterface().setFieldValue(FINGERPRINTARRAY_PROP.get(), value);
    }
    
    public void setFingerprintID(gw.pl.persistence.core.Key value) {
      setFieldValue(FINGERPRINT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the HomePhone field.
     */
    public void setHomePhone(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(HOMEPHONE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the HomePhoneCountry field.
     */
    public void setHomePhoneCountry(typekey.PhoneCountryCode value) {
      __getInternalInterface().setFieldValue(HOMEPHONECOUNTRY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the HomePhoneExtension field.
     */
    public void setHomePhoneExtension(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(HOMEPHONEEXTENSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LMContactID_Ext field.
     */
    public void setLMContactID_Ext(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(LMCONTACTID_EXT_PROP.get(), value);
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
     * Sets the value of the LoadRelatedContacts field.
     */
    public void setLoadRelatedContacts(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(LOADRELATEDCONTACTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Name field.
     */
    public void setName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(NAME_PROP.get(), value);
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
     * Sets the value of the Notes field.
     */
    public void setNotes(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(NOTES_PROP.get(), value);
    }
    
    /**
     * Sets the official id by type.  Works only for non-state specific ids.
     * @param type - Official id type
     * @param value - updated value
     */
    public void setOfficialID(typekey.OfficialIDType type, java.lang.String value) {
      ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).setOfficialID(type, value);
    }
    
    /**
     * Sets the value of the OfficialIDs field.
     */
    public void setOfficialIDs(entity.OfficialID[] value) {
      __getInternalInterface().setFieldValue(OFFICIALIDS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OrganizationType field.
     */
    public void setOrganizationType(typekey.OrganizationType value) {
      __getInternalInterface().setFieldValue(ORGANIZATIONTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OriginalInsurerReference_Ext field.
     */
    public void setOriginalInsurerReference_Ext(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ORIGINALINSURERREFERENCE_EXT_PROP.get(), value);
    }
    
    public void setOriginalValuesXML(com.guidewire.pl.domain.contact.XmlElementByteContainer<gw.xml.XmlElement> originalValuesXML) {
      ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).setOriginalValuesXML(originalValuesXML);
    }
    
    /**
     * Sets the original values xml from the xml element
     * @param originalValuesXML the original values xml
     */
    public void setOriginalValuesXML(gw.xml.XmlElement originalValuesXML) {
      ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).setOriginalValuesXML(originalValuesXML);
    }
    
    /**
     * Sets the value of the PendingLinkMessage field.
     */
    public void setPendingLinkMessage(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(PENDINGLINKMESSAGE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PolicySystemId field.
     */
    public void setPolicySystemId(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(POLICYSYSTEMID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Preferred field.
     */
    public void setPreferred(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(PREFERRED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PreferredCurrency field.
     */
    public void setPreferredCurrency(typekey.Currency value) {
      __getInternalInterface().setFieldValue(PREFERREDCURRENCY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PrimaryAddress field.
     */
    public void setPrimaryAddress(entity.Address value) {
      __getInternalInterface().setFieldValue(PRIMARYADDRESS_PROP.get(), value);
    }
    
    public void setPrimaryAddressID(gw.pl.persistence.core.Key value) {
      setFieldValue(PRIMARYADDRESS_PROP.get(), value);
    }
    
    public void setPrimaryCommonAddress(entity.Address address) {
      ((com.guidewire.pl.domain.contact.impl.CommonContactImplCallback)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.impl.CommonContactImplCallback")).setPrimaryCommonAddress(address);
    }
    
    /**
     * Sets the value of the PrimaryLanguage field.
     */
    public void setPrimaryLanguage(typekey.LanguageType value) {
      __getInternalInterface().setFieldValue(PRIMARYLANGUAGE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PrimaryLocale field.
     */
    public void setPrimaryLocale(typekey.LocaleType value) {
      __getInternalInterface().setFieldValue(PRIMARYLOCALE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PrimaryPhone field.
     */
    public void setPrimaryPhone(typekey.PrimaryPhoneType value) {
      __getInternalInterface().setFieldValue(PRIMARYPHONE_PROP.get(), value);
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
     * Sets the value of the Reviews field.
     */
    public void setReviews(entity.Review[] value) {
      __getInternalInterface().setFieldValue(REVIEWS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Score field.
     */
    public void setScore(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(SCORE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SourceRelatedContacts field.
     */
    public void setSourceRelatedContacts(entity.ContactContact[] value) {
      __getInternalInterface().setFieldValue(SOURCERELATEDCONTACTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SpecialtyType field.
     */
    public void setSpecialtyType(typekey.SpecialtyType value) {
      __getInternalInterface().setFieldValue(SPECIALTYTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Subtype field.
     */
    public void setSubtype(typekey.Contact value) {
      __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
    }
    
    public void setTagTypes(typekey.ContactTagType[] contactTagTypes) {
      ((com.guidewire.pl.domain.contact.CommonContactAdapter)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.CommonContactAdapter")).setTagTypes(contactTagTypes);
    }
    
    /**
     * Sets the value of the Tags field.
     */
    public void setTags(entity.ContactTag[] value) {
      __getInternalInterface().setFieldValue(TAGS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TargetRelatedContacts field.
     */
    public void setTargetRelatedContacts(entity.ContactContact[] value) {
      __getInternalInterface().setFieldValue(TARGETRELATEDCONTACTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TaxID field.
     */
    public void setTaxID(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(TAXID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TaxStatus field.
     */
    public void setTaxStatus(typekey.TaxStatus value) {
      __getInternalInterface().setFieldValue(TAXSTATUS_PROP.get(), value);
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
    
    /**
     * Sets the value of the ValidationLevel field.
     */
    public void setValidationLevel(typekey.ValidationLevel value) {
      __getInternalInterface().setFieldValue(VALIDATIONLEVEL_PROP.get(), value);
    }
    
    public void setValidationResult(gw.api.validation.ValidationResult result) {
      ((com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods")).setValidationResult(result);
    }
    
    /**
     * Sets the value of the VendorNumber field.
     */
    public void setVendorNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(VENDORNUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the VendorType field.
     */
    public void setVendorType(typekey.VendorType value) {
      __getInternalInterface().setFieldValue(VENDORTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the W9Received field.
     */
    public void setW9Received(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(W9RECEIVED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the W9ReceivedDate field.
     */
    public void setW9ReceivedDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(W9RECEIVEDDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the W9ValidFrom field.
     */
    public void setW9ValidFrom(java.util.Date value) {
      __getInternalInterface().setFieldValue(W9VALIDFROM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the W9ValidTo field.
     */
    public void setW9ValidTo(java.util.Date value) {
      __getInternalInterface().setFieldValue(W9VALIDTO_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WithholdingRate field.
     */
    public void setWithholdingRate(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(WITHHOLDINGRATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WorkPhone field.
     */
    public void setWorkPhone(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(WORKPHONE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WorkPhoneCountry field.
     */
    public void setWorkPhoneCountry(typekey.PhoneCountryCode value) {
      __getInternalInterface().setFieldValue(WORKPHONECOUNTRY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WorkPhoneExtension field.
     */
    public void setWorkPhoneExtension(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(WORKPHONEEXTENSION_PROP.get(), value);
    }
    
    /**
     * Overwrites the data on this contact with the data from the Address Book. If successful, the result will contain a
     * reference to the synced Contact. In this case, this contact object should no longer be used.
     * Use SyncResult.SyncedContact instead.
     * @return the result of the sync
     * @deprecated since ClaimCenter8.0 - use ContactSystemUtil#syncToContactSystem(contact)
     */
    @java.lang.Deprecated
    public com.guidewire.pl.domain.contact.SyncResult sync() {
      return ((com.guidewire.pl.domain.contact.ContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactPublicMethods")).sync();
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
    
    public gw.api.validation.ValidationResult validate() {
      return ((com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods")).validate();
    }
    
    /**
     * Validates all relationships to make sure they adhere to type and cardinality constraints.
     * @return 
     */
    public com.guidewire.pl.web.validation.InternalValidationResult validateRelationships() {
      return ((com.guidewire.pl.domain.contact.CommonContactPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.CommonContactPublicMethods")).validateRelationships();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods", "com.guidewire.pl.domain.contact.impl.ContactImpl");
    config.put("com.guidewire.pl.domain.contact.CommonContactAdapter", "com.guidewire.pl.domain.contact.impl.ContactImpl");
    config.put("com.guidewire.pl.domain.contact.CommonContactPublicMethods", "com.guidewire.pl.domain.contact.impl.ContactImpl");
    config.put("com.guidewire.pl.domain.contact.ContactGraphGenerator", "com.guidewire.pl.domain.contact.impl.ContactImpl");
    config.put("com.guidewire.pl.domain.contact.ContactPublicMethods", "com.guidewire.pl.domain.contact.impl.ContactImpl");
    config.put("com.guidewire.pl.domain.contact.OfficialIDBaseContainer", "com.guidewire.pl.domain.contact.impl.ContactImpl");
    config.put("com.guidewire.pl.domain.contact.impl.AddressBookConvertableImplCallback", "com.guidewire.pl.domain.contact.impl.ContactImpl");
    config.put("com.guidewire.pl.domain.contact.impl.AddressBookConvertableInternalMethods", "com.guidewire.pl.domain.contact.impl.ContactImpl");
    config.put("com.guidewire.pl.domain.contact.impl.CommonContactImplCallback", "com.guidewire.pl.domain.contact.impl.ContactImpl");
    config.put("com.guidewire.pl.domain.contact.impl.CommonContactInternalMethods", "com.guidewire.pl.domain.contact.impl.ContactImpl");
    config.put("com.guidewire.pl.domain.contact.impl.ContactInternalMethods", "com.guidewire.pl.domain.contact.impl.ContactImpl");
    config.put("com.guidewire.pl.domain.messaging.EventAwarePublicMethods", "com.guidewire.pl.domain.messaging.impl.EventAwareImpl");
    config.put("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods", "com.guidewire.pl.domain.messaging.impl.EventAwareImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractEditableBeanProxy");
    config.put("com.guidewire.pl.domain.validation.ValidatablePublicMethods", "com.guidewire.pl.domain.contact.impl.ContactImpl");
    config.put("com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods", "com.guidewire.pl.domain.contact.impl.ContactImpl");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.system.bundle.CommitCallback", "com.guidewire.pl.domain.contact.impl.ContactImpl");
    config.put("com.guidewire.pl.system.bundle.InsertCallback", "com.guidewire.pl.domain.contact.impl.ContactImpl");
    config.put("com.guidewire.pl.system.bundle.RemoveCallback", "com.guidewire.pl.domain.contact.impl.ContactImpl");
    config.put("com.guidewire.pl.system.bundle.UpdateCallback", "com.guidewire.pl.domain.contact.impl.ContactImpl");
    config.put("com.guidewire.pl.system.entity.LevelAwareValidatableBean", "com.guidewire.pl.domain.contact.impl.ContactImpl");
    config.put("gw.api.contact.ContactLifecycle", "gw.api.contact.CCContactLifecycle");
    config.put("gw.api.contact.ContactMinimalTags", "gw.api.contact.CCContactMinimalTagsImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.AutoTowingAgcy.class, config);
    com.guidewire._generated.entity.AutoTowingAgcyInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.AutoTowingAgcy, com.guidewire._generated.entity.AutoTowingAgcyInternal>() {
      public java.lang.Object getImplementation(entity.AutoTowingAgcy bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.AutoTowingAgcyInternal getInternalInterface(entity.AutoTowingAgcy bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.AutoTowingAgcy newEmptyInstance() {
        return new entity.AutoTowingAgcy((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}