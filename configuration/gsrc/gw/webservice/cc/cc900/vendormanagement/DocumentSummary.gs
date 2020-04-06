package gw.webservice.cc.cc900.vendormanagement

uses gw.xml.ws.annotation.WsiExportable

uses java.util.Date

/**
 * Metadata about a document, but not including the content of the document. The content of the document
 * can be retrieved through ServiceRequestAPI.
 */
@Export
@WsiExportable("http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/DocumentSummary")
final class DocumentSummary {

  /**
   * The publicid of this document in ClaimCenter. Required when linking this document to newly-created
   * quotes or invoices or when requesting document content.
   */
  var _publicId : String as PublicID

  /**
   * A human-readable name of the document.
   */
  var _name : String as Name

  /**
   * A description of the document.
   */
  var _description : String as Description

  /**
   * The date of the last modification to this document.
   */
  var _dateModified : Date as DateModified

  /**
   * The name of the person who created this document.
   */
  var _author : String as Author

  /**
   * The language in which this document was created.
   */
  var _language : LanguageType as Language

  /**
   * Indicates whether this document contains any content. For example, if the document was created in ClaimCenter by
   * only "indicating the existence" of a document, then it will not contain content. It is an error to attempt to
   * retrieve content through the ServiceRequestAPI for documents that do not contain content.
   */
  var _hasContent : boolean as HasContent

  construct() {}

  construct(document : Document) {
    PublicID = document.PublicID
    Name = document.Name
    Description = document.Description
    DateModified = document.DateModified
    Author = document.Author
    HasContent = document.DMS
    Language = document.Language
  }

}
