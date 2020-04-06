package gw.acc.iplm.enhancements

uses gw.document.DocumentDetailsCCHelper

enhancement ECFDocumentDetailsCCHelperEnhancement: DocumentDetailsCCHelper {

  property get IMRDocumentType() : String {
    return this.getFields(Document.IMRDOCUMENTTYPE_PROP.get()) as String
  }

  property set IMRDocumentType(newIMRDocumentType : String) {
    this.setFields(Document.IMRDOCUMENTTYPE_PROP.get(), newIMRDocumentType)
  }
}
