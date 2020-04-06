package gw.document

uses gw.plugin.document.IDocumentTemplateDescriptor

@Export
enhancement DocumentsUtilEnhancement : gw.document.DocumentsUtil {

  /**
   * Creates a new {@link gw.document.DocumentCreationInfo} object, which is used by the Document creation screens to manage the
   * document creation process.
   *
   * @param claim The Claim to which the newly created document will be linked.
   * @param initBlock block that will be run on the created Document
   * @param template The document template descriptor for the D0ocument
   * @return The newly created DocumentCreationInfo object.
   * @deprecated Use {@link gw.document.DocumentsUtil#createDocumentCreationInfo(Claim, IDocumentTemplateDescriptor)} instead
   */
  @Deprecated("Use gw.document.DocumentsUtil.createDocumentCreationInfo(Claim, IDocumentTemplateDescriptor) instead")
  public static function createDocumentCreationInfo(claim : Claim, initBlock : block(doc : entity.Document), template : IDocumentTemplateDescriptor) : DocumentCreationInfo {
    var docInfo = DocumentsUtil.createDocumentCreationInfo(claim, template)
    if(initBlock != null) {
      initBlock(docInfo.Document)
    }
    return docInfo
  }

  /**
   * Creates a new {@link gw.document.DocumentCreationInfo} object, which is used by the Document creation screens to manage the
   * document creation process.
   *
   * @param claim The Claim to which the newly created document will be linked.
   * @param initBlock block that will be run on the created Document
   * @deprecated Use {@link gw.document.DocumentsUtil#createDocumentCreationInfo(Claim, IDocumentTemplateDescriptor)} instead
   * @deprecated
   */
  @Deprecated("Use gw.document.DocumentsUtil.createDocumentCreationInfo(Claim, IDocumentTemplateDescriptor) instead")
  public static function createDocumentCreationInfo(claim : Claim, initBlock : block(doc : entity.Document)) : DocumentCreationInfo {
    return createDocumentCreationInfo(claim, initBlock, null)
  }

  /**
   * Validates whether the ContactDocument's MimeType is registered in the config.xml under the mimetypemapping
   * @return whether the Document's MimeType is allowed for viewing
   */
  public static function isDocumentMimeTypeAllowed(documentMimeType : String) : boolean {

    if (documentMimeType != null) {
      return DocumentsUtilBase.getMimeTypes().contains(documentMimeType)
    }
    return false
  }
}
