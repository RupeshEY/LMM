package gw.acc.iplm.xmlmapper.repositoryoperation.imrdownload

uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.Document
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRq
uses gw.testharness.v3.GUnitTestClass

class RepositoryDownloadRequestMapperTest extends GUnitTestClass {

  private static var _mapper: RepositoryDownloadRequestMapper
  private static var _entity: ECFMessageDocumentDownloadRq_Ext
  private static var _result: RepositoryOperationRq
  private static var _documentEntity: entity.Document
  private static var _documentXml: Document

  function beforeClass() {
    super.beforeClass()
    _entity = ECFMessageEntityUtil.createDocumentDownloadRq()
    _documentEntity = _entity.Document
    _mapper = new RepositoryDownloadRequestMapper(_entity)
    _result = _mapper.createRepositoryOperationRq()
    _documentXml = _result.DocumentList.first().DocumentItem.first().Document
  }

  function testRepositoryOperationRqObjectCreated() {
    assertNotNull("RepositoryOperationRq Object not created", _result)
    _result.asUTFString()
  }

  function testMsgIdAddedToRepositoryOperationRq() {
    assertEquals(_entity.UUID, _result.MsgId)
  }

  function testCreationDtTimeAddedToRepositoryOperationRq() {
    var expected = ECFConstants.ECF_XML_PAYLOAD_DATETIME_FORMAT.get().format(_entity.OriginTimeStamp)
    assertEquals(expected, _result.CreationDtTime)
  }

  function testRepositoryOperationTypeCdAddedToRepositoryOperationRq() {
    assertEquals("RepositoryDownload", _result.RepositoryOperationTypeCd.Code)
  }

  function testSenderAddedToRepositoryOperationRq() {
    assertNotNull(_result.Sender)
    assertEquals(_entity.SenderPartyId, _result.Sender.PartyId)
    assertEquals(_entity.SenderPartyName, _result.Sender.PartyName)
    assertEquals(_entity.SenderPartyRoleCd, _result.Sender.PartyRoleCd)
  }

  function testReceiverAddedToRepositoryOperationRq() {
    assertNotNull(_result.Receiver)
    assertEquals(_entity.ReceiverPartyId, _result.Receiver.PartyId)
    assertEquals(_entity.ReceiverPartyName, _result.Receiver.PartyName)
    assertEquals(_entity.ReceiverPartyRoleCd, _result.Receiver.PartyRoleCd)
  }

  function testApplicationAddedToRepositoryOperationRq() {
    assertNotNull(_result.Application)
    assertEquals("Jv-Ins-Reinsurance", _result.Application.ApplicationCd)
    assertEquals("http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", _result.Application.SchemaVersion)
  }

  function testDocumentItemCreated() {
    assertNotNull("Missing Document List", _result.DocumentList)
    assertNotNull("Missing Document Item in Document List", _result.DocumentList.first().DocumentItem)
    assertNotNull("Missing HierarchySortIndicator", _result.DocumentList.first().HierarchySortIndicator)

    assertEquals(1, _result.DocumentList.size())
    assertEquals(1, _result.DocumentList.first().DocumentItem.size())
    assertFalse(_result.DocumentList.first().HierarchySortIndicator)
  }

  function testDocumentIdAddedToRepositoryOperationRq() {
    assertEquals(_documentEntity.IMRDocumentId, _documentXml.DocumentId)
  }

  function testDocumentVersionAddedToRepositoryOperationRq() {
    assertEquals(_documentEntity.IMRDocumentVersion, _documentXml.DocumentVersion)
  }

  function testDocumentVersionDtTimeAddedToRepositoryOperationRq() {
    assertEquals(_documentEntity.IMRDocumentVersionDtTime, _documentXml.DocumentVersionDtTime.toCalendar().getTime())
  }

  function testInheritIndicatorAddedToRepositoryOperationRq() {
    assertEquals(_documentEntity.IMRInheritIndicator, _documentXml.InheritIndicator)
  }

  function testFileIdAddedToRepositoryOperationRq() {
    assertEquals(_documentEntity.Name, _documentXml.FileId)
  }

  function testFileMimeTypeAddedToRepositoryOperationRq() {
    assertEquals(_documentEntity.MimeType, _documentXml.FileFormatCd)
  }

  function testFileSizeAddedToRepositoryOperationRq() {
    assertNotNull("No File Size info added to XML",_documentXml.FileSize)
    assertEquals(_documentEntity.IMRFileSizeNum, _documentXml.FileSize.NumUnits)
    assertEquals(_documentEntity.IMRFileSizeUnit, _documentXml.FileSize.UnitMeasurementCd)
  }

  function testDocumentTypeAddedToRepositoryOperationRq() {
    assertEquals(_documentEntity.IMRDocumentType, _documentXml.DocumentTypeCd)
  }
}