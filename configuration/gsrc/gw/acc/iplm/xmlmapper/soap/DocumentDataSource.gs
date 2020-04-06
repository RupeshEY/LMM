package gw.acc.iplm.xmlmapper.soap

uses gw.document.DocumentContentsInfo
uses gw.plugin.Plugins
uses gw.plugin.document.IDocumentContentSourceBase

uses javax.activation.DataSource
uses java.io.IOException
uses java.io.InputStream
uses java.io.OutputStream

/**
 * Javax Activation DataSource for ClaimCenter Document entities
 * For use with javax.activation.DataHandler, for example to attach the contents of the File represented by a Document entity to a SOAPMessage
 */
class DocumentDataSource implements DataSource {

  private var _document: Document
  private var _documentContentInfo: DocumentContentsInfo

  /**
   * @param document the entity to initialise this Data Source for
   */
  construct(document: Document) {
    _document = document
    var _dmsPlugin = Plugins.get("IDocumentContentSource") as IDocumentContentSourceBase
    _documentContentInfo = _dmsPlugin.getDocumentContentsInfo(_document, true)
  }

  /**
   * @return the MIME Type for this Document
   */
  public property get ContentType(): String {
    return _documentContentInfo.ResponseMimeType
  }

  /**
   * @return the InputStream for this Document
   */
  public property get InputStream(): InputStream {
    return _documentContentInfo.InputStream
  }

  /**
   * @return the name of this Document
   */
  public property get Name(): String {
    return _document.Name
  }

  /**
   * Not Supported for Document entities
   */
  public property get OutputStream(): OutputStream {
    throw new IOException("Cannot write to this document")
  }
}