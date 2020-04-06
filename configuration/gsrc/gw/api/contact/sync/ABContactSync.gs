package gw.api.contact.sync

uses gw.api.locale.DisplayKey
uses gw.api.util.LocationUtil
uses java.lang.Iterable
uses gw.api.util.Logger
uses gw.api.contact.ContactSystemUtil
uses gw.api.contact.ContactSystemNotAvailableException

/** 
 * Default code for syncing linking contacts to the Address Book, used by policy refresh/policy select/FNOL policy select.
 * Any customization needed for how syncing Contacts to AddressBook is handled should be made directly to this class.
 */
@Export
class ABContactSync implements ContactSyncListener {
    
  /**
   * Default code for syncing each linked contact to the Address Book, if needed.  If Address Book is not available,
   * generate an activity on the claim to sync the contacts later.  (If there's already an open activity for
   * syncing contacts, remove it before creating the new activity.)
   */
  public override function syncContactsToABIfNeeded(contacts:Iterable<Contact>, ctx:ContactSyncContext) {
    try {
      //sync each Contact if needed
      contacts.each(\ contact -> {
        ContactSystemUtil.INSTANCE.syncToContactSystem(contact)
        syncRelatedContactsToAB(contact)
      })
    } catch (abue : ContactSystemNotAvailableException) {
      Logger.logError("Unable to sync contacts", abue)
      LocationUtil.addRequestScopedWarningMessage(DisplayKey.get("Java.PolicyRefresh.AddressBookNotAvailable"))
      ctx.createSyncFailedActivity(Priority.TC_NORMAL, contacts)
  }
 }
 
 private function syncRelatedContactsToAB(contact : Contact) {
   // iterate through related contacts
   contact.TargetRelatedContacts.each(\ tc -> {
     var targetContact = tc.RelatedContact
     //if the contact doesn't relate to itself, sync related contact
     if (targetContact.AddressBookUID != contact.AddressBookUID){
       ContactSystemUtil.INSTANCE.syncToContactSystem(contact, false)
     }
   })
   
   // iterate through source contacts
   contact.SourceRelatedContacts.each(\ sc -> {
     var sourceContact = sc.SourceContact
     if(sourceContact.AddressBookUID != contact.AddressBookUID) {
       ContactSystemUtil.INSTANCE.syncToContactSystem(contact, false)
     }
   })
 }
}