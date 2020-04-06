package gw.plugin.contactsystem

uses gw.plugin.contact.ContactCreateResult
uses gw.plugin.contact.search.ContactDocumentSearchFilter
uses gw.plugin.contact.search.ContactDocumentsSearchResult
uses gw.xml.ws.WebServiceException
uses java.net.ConnectException
uses gw.plugin.contact.ab900.ABContactSystemPlugin
uses gw.api.contact.ContactSystemNotAvailableException

/**
 * This ContactSystemPlugin implementation is used to test the app when the contact system is down
 */
@Export
class ContactSystemNotAvailablePlugin extends ABContactSystemPlugin {
  override function createContact(contact: Contact) : ContactCreateResult {
    throw makeException()
  }

  override function createContact(contact: Contact, transactionId: java.lang.String) : ContactCreateResult {
    throw makeException()
  }

  override function retrieveContact(abUID: java.lang.String): Contact {
    throw makeException()
  }

  override function retrieveContact(abUID: java.lang.String, relationships: java.util.Collection <ContactBidiRel>): Contact {
    throw makeException()
  }

  override function retrieveRelatedContacts(primaryContact: Contact, relationships: java.util.Collection <ContactBidiRel>): Contact {
    throw makeException()
  }

  override function searchContacts(searchCriteria: ContactSearchCriteria, filter: gw.plugin.contact.search.ContactSearchFilter): gw.plugin.contact.search.ContactSearchResult {
    throw makeException()
  }

  override function findDuplicates(contact: Contact, searchFilter: gw.plugin.contact.search.ContactSearchFilter): gw.plugin.contact.search.DuplicateSearchResult {
    throw makeException()
  }

  override function retrieveDocumentsForContact(abUID: String, searchCriteria: DocumentSearchCriteria, searchFilter: ContactDocumentSearchFilter): ContactDocumentsSearchResult {
    throw makeException()
  }

  override function contactSystemSupportsDocuments() : boolean {
    return false
  }

  override function updateContact(contact: Contact) {
    throw makeException()
  }

  override function updateContact(contact: Contact, transactionId: java.lang.String) {
    throw makeException()
  }

  override function sendAsyncUpdate(message:Message, payload:String) {
    throw makeException()
  }

  /**
   * Creates an exception simulating AB being down.
   */
  private function makeException(): WebServiceException {
    var connectException = new ConnectException("Unable to connect to ABContactAPI: Connection refused: connect")
//    return new WebServiceException(connectException)
    throw new ContactSystemNotAvailableException(connectException)
  }
}
