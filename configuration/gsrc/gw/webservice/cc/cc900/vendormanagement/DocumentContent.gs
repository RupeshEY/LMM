package gw.webservice.cc.cc900.vendormanagement

uses gw.plugin.Plugins
uses gw.plugin.document.IDocumentContentSource
uses gw.xml.ws.annotation.WsiExportable
uses org.apache.commons.io.IOUtils

uses java.lang.IllegalArgumentException

/**
 * Stores the actual content of a document as a byte array, along with a MIME type for that data.
 * This object does not include metadata like the name of the document.
 */
@Export
@WsiExportable("http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/DocumentContent")
final class DocumentContent {

  /**
   * The MIME type of the bytes contained in Content
   */
  var _mimeType : String as MimeType

  /**
   * The actual content of the document.
   */
  var _content : byte[] as Content

  construct() {}

  /**
   * @throws IllegalArgumentException if the document does not have content
   */
  construct(document : Document) {
    var docContentsInfo = Plugins.get(IDocumentContentSource).getDocumentContentsInfoForExternalUse(document)
    if (docContentsInfo == null) {
      // this is possible for documents with no content in the content source
      throw new IllegalArgumentException("this document does not have content")
    }
    MimeType = document.MimeType
    _content = IOUtils.toByteArray(docContentsInfo.InputStream)
  }

}
