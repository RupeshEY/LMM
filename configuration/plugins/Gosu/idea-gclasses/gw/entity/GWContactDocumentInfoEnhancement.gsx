package gw.entity

uses gw.document.DocumentContentsInfo
uses gw.document.DocumentsUtil

/**
 * Document Management UI helpers on ContactDocumentInfos
 */
@Export
enhancement GWContactDocumentInfoEnhancement: ContactDocumentInfo {

  /**
   * Gets the document content from this document and renders it directly to download according to the
   * disposition specified by the download attribute of the downloading widget.
   * It uses the ContactDocumentInfo URL. This is an external document that is stored in ContactManager's
   * DMS so we need to render using URL mode.
   */
  public function download() {
    var dci = new DocumentContentsInfo(DocumentContentsInfo.URL, this.URL, this.MimeType)
    DocumentsUtil.renderDocumentContentsWithDownloadDisposition(this.Name, dci)
  }

  property get Icon() : String{
    return DocumentsUtil.getDocumentIcon(this.DocUID, this.DMS, this.MimeType)
  }

  property get MimeTypeLabel() : String {
    return DocumentsUtil.getMimeTypeLabel(this.MimeType)
  }

}

