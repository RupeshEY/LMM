package gw.plugin.contact.ab900

uses wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchResultContainer_Results_Entry

/*
 *  This class contains methods to map the ABContactAPISearchResult to Contact.
 *  If you add any properties to ABContactAPISearchResult or ABContactAPIFindDuplicatesResult, you need to
 *  update this file to make sure the properties are mapped back to the Contact that is returned
 *  from the search calls.
 */
@Export
class ContactDocumentsSearchResultMapper {

/**
 * Creates an ContactDocumentInfo instance with the values returned from a Contact Documents search in ContactManager.
 *
 * If you extend the ABContactAPIDocumentSearchResultContainer to have additional properties returned from the search
 * you need to extend this method to copy those properties into the ContactDocumentInfo instance.
 *
 * @param searchResult the ABContactAPIDocumentSearchResultContainer results returned from ContactManager
 * @return ContactDocumentInfo with the result entry information
 */
  public static function createContactDocumentInfoFromSearchResult(searchResult: ABContactAPIDocumentSearchResultContainer_Results_Entry) : ContactDocumentInfo {

    var contactDocument = new ContactDocumentInfo()
    contactDocument.MimeType = searchResult.MimeType
    contactDocument.URL = searchResult.URL
    contactDocument.PendingDocUID = searchResult.PendingDocUID
    contactDocument.Name = searchResult.Name
    contactDocument.Description = searchResult.Description
    contactDocument.Author = searchResult.Author
    contactDocument.DocumentIdentifier = searchResult.DocumentIdentifier
    contactDocument.Recipient = searchResult.Recipient
    contactDocument.DocUID = searchResult.DocUID
    contactDocument.DMS = searchResult.DMS
    contactDocument.Inbound = searchResult.Inbound
    contactDocument.Obsolete = searchResult.Obsolete
    contactDocument.DateCreated = searchResult.DateCreated
    contactDocument.DateModified = searchResult.DateModified
    contactDocument.Status = DocumentStatusType.get(searchResult.Status)
    contactDocument.Type = DocumentType.get(searchResult.Type)
    contactDocument.SecurityType = DocumentSecurityType.get(searchResult.SecurityType)
    contactDocument.Section = DocumentSection.get(searchResult.Section)
    contactDocument.Language = LanguageType.get(searchResult.Language)

    return contactDocument
  }
}
