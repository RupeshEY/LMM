package gw.contact

uses gw.api.locale.DisplayKey
uses gw.api.system.CCConfigParameters
uses gw.document.DocumentsUtil
uses gw.plugin.contact.search.ContactDocumentSearchFilter

/**
 * UI helper functions for the Contact Documents UI in AddressBook Contacts and Claim Contacts screens.
 */
@Export
class ContactDocumentsUIHelper {

  /**
   * Retrieve the documents associated to the contact represented by abLink.
   * The DTOs contains all Document metadata as well as a URL to look at the content.
   *
   * It is filtered by the DocumentSearchCriteria:
   * - IncludeObsoletes = false
   * - DocumentSecurityTypes = list of visible DocumentSecurityTypes for the current user
   * @param abLink Contact AddressBookUID from whom we retrieve documents
   * @return List of ContactDocumentInfos for abLink
   */
  function retrieveContactDocuments(abLink: String) : List<ContactDocumentInfo> {

    var userSecurityTypes = new ArrayList<DocumentSecurityTypeSearchWrapper>()
    var visibleSecurityTypes = DocumentsUtil.getVisibleDocumentSecurityTypesForUser(User.util.CurrentUser)

    for (docSecurityType in visibleSecurityTypes) {
      var docSecurityTypeWrapper = new DocumentSecurityTypeSearchWrapper()
      docSecurityTypeWrapper.setDocumentSecurityType(docSecurityType)
      userSecurityTypes.add(docSecurityTypeWrapper)
    }

    var criteria = new DocumentSearchCriteria()
    criteria.IncludeObsoletes = false // We don't want to retrieve hidden documents from ContactManager
    criteria.DocumentSecurityTypes = userSecurityTypes.toTypedArray()

    var searchFilter = new ContactDocumentSearchFilter()
    searchFilter.setMaxResults(CCConfigParameters.MaxContactDocumentsSearchResults.getValue())

    var documentsResults = gw.api.contact.ContactSystemPluginAdapter.getAdapter()
        ?.retrieveDocumentsForContact(abLink, criteria , searchFilter)
    return documentsResults?.ContactDocuments?.toList()
  }

  /**
   * Checks if the Vendor Documents feature is enabled for this use. It means:
   * - If the ContactSystem plugin integrates with Documents
   * - The contact is a Vendor and has an AddressBookUID
   * @param contact
   */
  function isVendorDocumentsSupported(contact : Contact) : boolean {
    return gw.api.contact.ContactSystemPluginAdapter.getAdapter()?.contactSystemSupportsDocuments()
        and contact.VendorLinkedToAddressBook
  }

  /********************* Tooltip Helpers *********************************************
   *
   *  Contact Document actions' tooltips helpers. There are different tooltips based on the
   *  availability and visibility.
   *
   ***********************************************************************************/

  function isViewDocumentContentTooltip(document: ContactDocumentInfo) : String {

    if (!document.DMS) {
      return DisplayKey.get("Web.AddressBook.ContactDocuments.ViewContent.IndicateExistence.Message")
    } else if (!DocumentsUtil.isDocumentMimeTypeAllowed(document.MimeType)) {
      return DisplayKey.get("Web.AddressBook.ContactDocuments.ViewContent.MissingMimetype.Tooltip")
    }

    return DisplayKey.get("Web.AddressBook.ContactDocuments.ViewContent.ViewContent.Tooltip")
  }

  property get DownloadDocumentContentTooltip () : String {
    return DisplayKey.get("LV.Claim.Documents.Document.ViewAndEdit.Download.Tooltip")
  }

  property get ViewDocumentPropertiesTooltip() : String {
    return DisplayKey.get("LV.Claim.Documents.Document.ViewAndEdit.ViewProperties.Tooltip")
  }
}