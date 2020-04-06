package gw.webservice.cc.cc900.vendormanagement

uses gw.xml.ws.annotation.WsiExportable

uses java.lang.IllegalArgumentException
uses java.util.Date
uses java.util.List

/**
 * Contains enough information to create a quote or invoice on a service request.
 */
@Export
@WsiExportable("http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/StatementCreationInstructions")
final class StatementCreationInstructions {

  construct() {}

  /**
   * The currency of the line items on the statement
   */
  var _currency: Currency as Currency

  /**
   * The time the statement was created
   */
  var _invoiceDate: Date as StatementCreationTime

  /**
   * An array of categorized amounts.
   */
  var _lineItems: gw.webservice.cc.cc900.vendormanagement.ServiceRequestStatementLineItem[] as LineItems

  /**
   * Descriptive information about the quote or invoice.
   */
  var _description : String as Description

  /**
   * For quotes, the number of days the specialist expects to require to perform the service.
   */
  var _quoteNumberOfDaysToPerformService : int as QuoteNumberOfDaysToPerformService

  /**
   * A list of publicids of Documents that are already linked to the service request that should be linked to
   * the new quote or invoice; these publicids must be taken from the list of Documents on ServiceRequestDetails.
   */
  var _existingDocumentsToLinkPublicIds : List<String> as ExistingDocumentsToLinkPublicIds

  /**
   * A list of DocumentContents containing the contents of additional documents that should be created and linked
   * to the new quote or invoice.
   */
  var _documentsToUpload : List<DocumentContent> as DocumentsToUpload

  /**
   * A list of names for the documents in documentsToUpload; the size of this list must match that of
   * documentsToUpload, and each element provides the name that should be used for the corresponding element of
   * documentsToUpload; the names provided here are not guaranteed to be the actual names used for the uploaded
   * files, since some deconfliction may occur between documents on the claim.
   */
  var _documentsToUploadNames : List<String> as DocumentsToUploadNames

  /**
   * An optional number to assign to the created quote or invoice. This number is not used inside ClaimCenter but is
   * expected to be meaningful to the specialist; it may be the ID of a related record in a third-party system.
   */
  var _referenceNumber : String as ReferenceNumber

  /**
   * An optional field to capture where the quote or invoice came from (e.g. manual entry or through the portal).
   */
  var _source : StatementSource as Source

  /**
   * Replaces any null values for the document parameters with empty lists.
   * Validates that Description and Amount fields are non-null.
   * Validates that DocumentsToUpload has the same length as DocumentsToUploadNames,
   * and that there are no null or empty elements in either list.
   */
  internal function normalizeAndValidate() {
    ExistingDocumentsToLinkPublicIds = ExistingDocumentsToLinkPublicIds ?: {}
    DocumentsToUpload = DocumentsToUpload ?: {}
    DocumentsToUploadNames = DocumentsToUploadNames ?: {}
    
    if (Description == null) {
      throw new IllegalArgumentException("Description cannot be null")
    }
    if (LineItems.IsEmpty) {
      throw new IllegalArgumentException("LineItems cannot be empty")
    }

    for (lineItem in LineItems) {
      lineItem.normalizeAndValidate()
    }

    if (DocumentsToUpload.Count != DocumentsToUploadNames.Count) {
      throw new IllegalArgumentException("DocumentsToUpload and DocumentsToUploadNames must have the same length")
    }
    if (DocumentsToUpload.hasMatch(\ d -> d==null) or DocumentsToUploadNames.hasMatch(\ n -> not n.HasContent)) {
      throw new IllegalArgumentException("DocumentsToUpload and DocumentsToUploadNames cannot have empty elements")
    }
  }

}
