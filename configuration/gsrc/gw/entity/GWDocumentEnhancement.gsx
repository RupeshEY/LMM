package gw.entity

uses gw.api.locale.DisplayKey
uses gw.api.system.CCLoggerCategory
uses gw.api.util.DisplayableException
uses gw.api.web.WebFile
uses gw.document.DocumentsUtil
uses gw.document.DocumentsUtilBase
uses gw.plugin.Plugins
uses gw.plugin.document.IDocumentContentSource

@Export
enhancement GWDocumentEnhancement : entity.Document {

  property get Deletable() : boolean {
    return not this.RelatedServiceRequestDocumentLinks.hasMatch(\ di -> di.Unlinkable)
  }

  /**
   * Gets whether the document is linked to any Service Request Quote or Invoice
   */
  property get IsServiceRequestStatementDocument() : boolean {
    return this.RelatedServiceRequestDocumentLinks.hasMatch(\ di -> di.StatementDocumentLinks.HasElements)
  }

  /**
   * Validates that the new file MimeType correspond to the original Document MimeType
   * @param webFile with content changes
   * @throws DisplayableException when the new file type is not compatible with the original file type
   */
  public function validateCompatibleMimeType(webFile: WebFile) {
    if (webFile.MIMEType != null and this.getMimeType() != webFile.MIMEType ) {
      throw new DisplayableException(DisplayKey.get("LV.Claim.Documents.Document.UpdateDocument.UpdateContent.IncorrectMimeType", getMimeTypeLabel(webFile.getMIMEType()), getMimeTypeLabel(this.getMimeType())))
    }
  }

  /**
   * Checks whether this document has content in the DMS to be displayed
   * @return if the document has content
   */
  property get ContentExist() : boolean {
    var _dmsPlugin = Plugins.get("IDocumentContentSource") as IDocumentContentSource
    return _dmsPlugin.isDocument(this);
  }

  /**
   * List of mimetypes configured in the mimetypemapping in config.xml. If the current
   * Document's MimeType is not mapped, the MimeType is added to the list and a message
   * is logged.
   * @return list of mimetypemapping's mimetypes
   */
  property get MimeTypeList() : java.util.List {
    var documentMimeType = this.getMimeType()
    var originalList = gw.document.DocumentsUtilBase.getMimeTypes().copy()

    if (documentMimeType != null and !originalList.contains(documentMimeType)) {
      CCLoggerCategory.DOCUMENT.info("The uploaded document has a Mime Type '" + documentMimeType + "' that is not configured in the application. Please add the Mime Type to the mimetypemapping in the config.xml")
      originalList.add(documentMimeType)
    }

    return originalList

  }

  /**
   * Return the description of the MimeType of the selected document. This is based on the
   * mimetypemapping's mimetype in the config.xml. If there is not a match, the MimeType is
   * returned instead.
   * @param documentMimeType Document's MimeType
   * @return the Document's MimeType description, if any. Document's MimeType otherwise.
   */
  function getMimeTypeLabel(documentMimeType: String) : String {
    var configuredMimeTypeLabel = gw.document.DocumentsUtilBase.getMimeTypeDescription(documentMimeType)

    if (configuredMimeTypeLabel == null) {
      configuredMimeTypeLabel = documentMimeType
    }

    return configuredMimeTypeLabel
  }

  /**
   * Validates whether the Document's MimeType is registered in the config.xml under the mimetypemapping
   * @return whether the Document's MimeType is allowed for viewing
   */
  property get DocumentMimeTypeAllowed() : boolean {
    return DocumentsUtil.isDocumentMimeTypeAllowed(this.MimeType)
  }

  /**
   * Sets the DateModified for the documents
   * added via "Indicate existence of a document"
   */
  function documentExistenceBeforeCommit() {
    this.DateModified = Date.CurrentDate
  }
}
