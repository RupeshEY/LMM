package gw.acc.iplm.xmlmapper.repositoryoperation.imrdownload

uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.xmlmapper.repositoryoperation.RepositoryOperationRqMapper
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.Document
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.enums.RepositoryOperationTypeCdType
uses gw.xml.date.XmlDateTime

/**
 * Mapping from ECFMessageDocumentDownloadRq_Ext to RepositoryOperationRq for RepositoryDownload request to IMR
 */
class RepositoryDownloadRequestMapper extends RepositoryOperationRqMapper<ECFMessageDocumentDownloadRq_Ext> {

  private var _document: Document

  /**
   * @param entity the entity to map from
   */
  public construct(entity: ECFMessageDocumentDownloadRq_Ext) {
    super(entity)
  }

  protected function addRepositoryOperationTypeCd() {
    _xml.RepositoryOperationTypeCd = RepositoryOperationTypeCdType.RepositoryDownload
  }

  protected function addDocumentItemDetails() {
    initialiseDocument()
    addDocumentId()
    addDocumentVersion()
    addDocumentDtTime()
    addInheritIndicator()
    addFileId()
    addFileMimeType()
    addFileSize()
    addDocumentType()
  }

  protected function addOperationSpecificContent() {
  }

  private function initialiseDocument() {
    _documentItem.Document = new Document()
    _document = _documentItem.Document
  }

  private function addDocumentId() {
    _document.DocumentId = _entity.Document.IMRDocumentId
  }

  private function addDocumentVersion() {
    _document.DocumentVersion = _entity.Document.IMRDocumentVersion
  }

  private function addDocumentDtTime() {
    if (_entity.Document.IMRDocumentVersionDtTime != null) {
      var xmlFormattedDate = ECFConstants.ECF_XML_PAYLOAD_DATETIME_FORMAT.get().format(_entity.Document.IMRDocumentVersionDtTime)
      _document.DocumentVersionDtTime = new XmlDateTime(xmlFormattedDate)
    }
  }

  private function addInheritIndicator() {
    _document.InheritIndicator = _entity.Document.IMRInheritIndicator
  }

  private function addFileId() {
    _document.FileId = _entity.Document.Name
  }

  private function addFileMimeType() {
    _document.FileFormatCd = _entity.Document.MimeType
  }

  private function addFileSize() {
    _document.FileSize.NumUnits = _entity.Document.IMRFileSizeNum
    _document.FileSize.UnitMeasurementCd = _entity.Document.IMRFileSizeUnit
  }

  private function addDocumentType() {
    _document.DocumentTypeCd = _entity.Document.IMRDocumentType
  }
}