package entity;

/**
 * AddressBookConvertable
 * 
 *       Indicates whether a Contact entity is linkable between a Guidewire application and ContactManager. This is an
 *       internal system entity.
 *   
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AddressBookConvertable.eti;AddressBookConvertable.eix;AddressBookConvertable.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface AddressBookConvertable extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.AddressBookConvertable> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.AddressBookConvertable>("entity.AddressBookConvertable");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ADDRESSBOOKUID_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("AddressBookUID", "AddressBookUID");
  
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
  public boolean canLinkTo(entity.Contact addressBookContact);
  
  
  /**
   * Clears the fingerprint value of this contact.
   */
  @java.lang.Deprecated
  public void clearAddressBookFingerprint();
  
  
  /**
   * Copy data from <code>contact</code> to this <code>AddressBookConvertable</code> object.
   * @param sourceContact 
   * @return this AddressBookConvertable filled with contact information
   * @deprecated Since ClaimCenter 8.0, use syncToContactSystem() in ContactSystemUtil
   */
  @java.lang.Deprecated
  public entity.AddressBookConvertable copyFromContact(entity.Contact sourceContact);
  
  
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
  public void createInAddressBook(boolean onlyPrimaryRelationships);
  
  
  /**
   * Attempts to delete the Address Book entry to which this AddressBookConvertable is linked.
   * @throws com.guidewire.pl.domain.contact.AddressBookUnavailableException if an Address Book adapter error occurs
   * @throws IllegalStateException if this AddressBookConvertable is not linked to the Address Book
   * @deprecated Since ClaimCenter 8.0, no longer available
   */
  @java.lang.Deprecated
  public void deleteFromAddressBook();
  
  
  /**
   * Generate the contact link status.
   * @param remoteContact the Address Book entry corresponding to the localContact (may be null)
   * @param localContact the local contact
   * @return The contact link status
   * @deprecated Since ClaimCenter 8.0, use generateContactLinkStatus() in ContactSystemUtil
   */
  @java.lang.Deprecated
  public com.guidewire.pl.domain.contact.ContactLinkStatus generateContactLinkStatus(entity.Contact remoteContact, entity.Contact localContact);
  
  
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
  public gw.api.contact.LinkStatus generateLinkStatus();
  
  
  /**
   * Retrieves the fingerprint for this contact.
   * @return fingerprint value of this contact or null if no fingerprint defined.
   */
  @java.lang.Deprecated
  public java.lang.String getAddressBookFingerprint();
  
  
  /**
   * Gets the value of the AddressBookUID field.
   * Represents the ID of the associated object in Address Book.  Null if the object is not linked to Address Book.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddressBookUID();
  
  
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
  public entity.Contact getLinkedContact();
  
  
  /**
   * Links to the given contact, and syncs, then commits in a bundle.
   * @param contact - the contact to link and sync
   * @deprecated Since ClaimCenter 8.0, use ContactSystemUtil.linkToContactSystem
   */
  @java.lang.Deprecated
  public entity.AddressBookConvertable linkAndSyncToAB(entity.Contact contact);
  
  
  /**
   * Links this Contact to the given Address Book Contact.
   * @param addressBookContact 
   * @throws IllegalArgumentException if this Contact can not be linked to the given
   *                                  Contact.
   * @deprecated Since ClaimCenter 8.0, use ContactSystemUtil.linkToContactInContactSystem
   */
  @java.lang.Deprecated
  public void linkTo(entity.Contact addressBookContact);
  
  
  /**
   * Sets the fingerprint for this contact.
   * @param fingerprint fingerprint value of this contact
   */
  @java.lang.Deprecated
  public void setAddressBookFingerprint(java.lang.String fingerprint);
  
  
  /**
   * Sets the value of the AddressBookUID field.
   */
  public void setAddressBookUID(java.lang.String value);
  
  
  /**
   * Update this AddressBookConvertable from the remote Address Book.
   * @throws com.guidewire.pl.domain.contact.AddressBookUnavailableException 
   * @return the synced AddressBookConvertable. Note that this may be a different Java object than this
   *         AddressBookConvertable. This would happen if the Contact were downcast as part of the sync. Returns null if this
   *         AddressBookConvertable is not linked to the Address Book.
   * @deprecated Since ClaimCenter 8.0, use syncToContactSystem() in ContactSystemUtil
   */
  @java.lang.Deprecated
  public entity.AddressBookConvertable syncToAB();
  
  
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
  public entity.AddressBookConvertable syncToABIfNeeded();
  
  
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
  public entity.AddressBookConvertable syncToABWithoutRelatedContacts();
  
  
  /**
   * Returns the representation of this addressBookConvertable as a Contact.
   * @return version of this as a Contact
   */
  @java.lang.Deprecated
  public entity.Contact toContact();
  
  
  /**
   * Unlinks this AddressBookConvertable from the Address Book.
   * This is done by marking this AddressBookConvertable out of sync, and clearing the AddressBookUID
   * field on every linked sub-object.
   * @deprecated Since ClaimCenter 8.0, use ContactSystemUtil.unlinkFromContactSystem(Contact)
   */
  public void unlink();
  
  
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
  public void updateAddressBook(boolean onlyPrimaryRelationships);
  
  
  
}