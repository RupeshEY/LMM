package gw.webservice.cc.cc900.vendormanagement

uses gw.xml.ws.annotation.WsiExportable

/**
 * A combination of metadata about a document and the content of the document.
 */
@Export
@WsiExportable(("http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/DocumentWithContent"))
final class DocumentWithContent {

  /**
   * Metadata about the document.
   */
  var _documentSummary : DocumentSummary as DocumentSummary

  /**
   * The content of the document.
   */
  var _documentContent : DocumentContent as DocumentContent

  construct() {}

  /**
   * @throws IllegalArgumentException if the document does not have content
   */
  construct(document : Document) {
    DocumentSummary = new DocumentSummary(document)
    DocumentContent = new DocumentContent(document)
  }

}
