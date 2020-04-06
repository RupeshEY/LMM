package gw.acc.iplm.xmlmapper.repositoryoperation.imrupload

uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.xmlmapper.repositoryoperation.RepositoryOperationRqMapper
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.AccessParty
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.Document
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.enums.AccessRightCdType
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.enums.ListActionCdType
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.enums.RepositoryOperationTypeCdType
uses gw.xml.date.XmlDateTime

/**
 * Mapping from ECFMessageDocumentUploadRq_Ext to RepositoryOperationRq for RepositoryUpload request to IMR
 */
class RepositoryUploadRequestMapper extends RepositoryOperationRqMapper<ECFMessageDocumentUploadRq_Ext> {

  private var _document: Document

  /**
   * @param entity the entity to map from
   */
  public construct(entity: ECFMessageDocumentUploadRq_Ext) {
    super(entity)
  }

  protected function addRepositoryOperationTypeCd() {
    _xml.RepositoryOperationTypeCd = RepositoryOperationTypeCdType.RepositoryUpload
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
    addAccessControlList()
    addReferredObjects()
  }

  private function initialiseDocument() {
    _documentItem.Document = new gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.Document()
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
    _document.FileId = RepositoryUploadFileId.generate(_entity.Document)
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

  private function addReferredObjects() {
    _documentItem.ReferredObjects.Contract.BrokerReference = _entity.UMR

    if (_entity.UCR != null) {
      _documentItem.ReferredObjects.Claim.BrokerReference = _entity.UCR
    }

    if (_entity.TR != null) {
      _documentItem.ReferredObjects.ClaimEntry.BrokerReference = _entity.TR
    }
  }

  protected function addOperationSpecificContent() {
  }

  private function addAccessControlList() {
    if (_entity.AccessParties.HasElements) {
      _documentItem.AccessControlList.AccessParty = new ArrayList<AccessParty>()
    }
    _entity.AccessParties.each(\accessParty -> {
      var party = new AccessParty()
      party.PartyName = accessParty.PartyName
      party.PartyId = accessParty.PartyId
      party.PartyRoleCd = accessParty.PartyRole
      party.AccessRightCd = AccessRightCdType.forValue(accessParty.AccessRight)
      party.ListActionCd = ListActionCdType.forValue(accessParty.ListAction)
      _documentItem.AccessControlList.AccessParty.add(party)
    })
  }

}