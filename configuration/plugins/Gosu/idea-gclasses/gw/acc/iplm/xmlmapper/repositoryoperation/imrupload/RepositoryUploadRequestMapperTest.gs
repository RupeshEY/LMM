package gw.acc.iplm.xmlmapper.repositoryoperation.imrupload

uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.AccessParty
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRq
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.enums.AccessRightCdType
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.enums.ListActionCdType
uses gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.ReferredObjects
uses gw.testharness.v3.GUnitTestClass

class RepositoryUploadRequestMapperTest extends GUnitTestClass {

  private static var _mapper: RepositoryUploadRequestMapper
  private static var _entity: ECFMessageDocumentUploadRq_Ext
  private static var _result: RepositoryOperationRq
  private static var _documentEntity: entity.Document
  private static var _documentXml: gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.Document
  private static var _accessControlListXml: List<AccessParty>
  private static var _referredObjectsXml: ReferredObjects

  function beforeClass() {
    super.beforeClass()
    _entity = ECFMessageEntityUtil.createDocumentUploadRq()
    _documentEntity = _entity.Document
    _mapper = new RepositoryUploadRequestMapper(_entity)
    _result = _mapper.createRepositoryOperationRq()
    _documentXml = _result.DocumentList.first().DocumentItem.first().Document
    _accessControlListXml = _result.DocumentList.first().DocumentItem.first().AccessControlList.AccessParty
    _referredObjectsXml = _result.DocumentList.first().DocumentItem.first().ReferredObjects
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
    assertEquals("RepositoryUpload", _result.RepositoryOperationTypeCd.Code)
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
    assertEquals(_documentEntity.Name + ".jpg", _documentXml.FileId)
  }

  function testFileMimeTypeAddedToRepositoryOperationRq() {
    assertEquals(_documentEntity.MimeType, _documentXml.FileFormatCd)
  }

  function testFileSizeAddedToRepositoryOperationRq() {
    assertNotNull("No File Size info added to XML", _documentXml.FileSize)
    assertEquals(_documentEntity.IMRFileSizeNum, _documentXml.FileSize.NumUnits)
    assertEquals(_documentEntity.IMRFileSizeUnit, _documentXml.FileSize.UnitMeasurementCd)
  }

  function testDocumentTypeAddedToRepositoryOperationRq() {
    assertEquals(_documentEntity.IMRDocumentType, _documentXml.DocumentTypeCd)
  }

  function testAccessControlListAddedToRepositoryOperationRq() {
    assertNotNull(_accessControlListXml)
  }

  function testAccessPartyAddedToRepositoryOperationRq() {
    assertTrue(_accessControlListXml.HasElements)
    assertEquals(_entity.AccessParties.first().PartyName, _accessControlListXml.first().PartyName)
    assertEquals(_entity.AccessParties.first().PartyId, _accessControlListXml.first().PartyId)
    assertEquals(_entity.AccessParties.first().PartyRole, _accessControlListXml.first().PartyRoleCd)
    assertEquals(_entity.AccessParties.first().AccessRight, _accessControlListXml.first().AccessRightCd.Value)
    assertEquals(_entity.AccessParties.first().ListAction, _accessControlListXml.first().ListActionCd.Value)
  }

  function testAccessPartyAddedToRepositoryOperationRq_MultipleParties() {
    var testName = "TEST NAME"
    var testId = "TESTID"
    var testRole = "TEST ROLE"
    var testAccessRight = AccessRightCdType.Read.Value
    var testListAction = ListActionCdType.Remove.Value
    var entity = ECFMessageEntityUtil.createDocumentUploadRq()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      entity = bundle.add(entity)
      var accessParty = new ECFMessageDocumentUploadAccessParty_Ext(bundle)
      accessParty.PartyName = testName
      accessParty.PartyId = testId
      accessParty.PartyRole = testRole
      accessParty.AccessRight = testAccessRight
      accessParty.ListAction = testListAction
      accessParty.CanAccess = false
      entity.addToAccessParties(accessParty)
    }, User.util.UnrestrictedUser)

    var mapper = new RepositoryUploadRequestMapper(entity)
    var result = mapper.createRepositoryOperationRq()
    var accessControlListXml = result.DocumentList.first().DocumentItem.first().AccessControlList.AccessParty

    assertTrue(accessControlListXml.HasElements)
    assertEquals(2, accessControlListXml.size())
    assertEquals(1, accessControlListXml.countWhere(\elt -> elt.PartyName == entity.AccessParties.first().PartyName))
    assertEquals(1, accessControlListXml.countWhere(\elt -> elt.PartyId == entity.AccessParties.first().PartyId))
    assertEquals(1, accessControlListXml.countWhere(\elt -> elt.PartyRoleCd == entity.AccessParties.first().PartyRole))
    assertEquals(2, accessControlListXml.countWhere(\elt -> elt.AccessRightCd.Value == entity.AccessParties.first().AccessRight))
    assertEquals(2, accessControlListXml.countWhere(\elt -> elt.ListActionCd.Value == entity.AccessParties.first().ListAction))


    assertEquals(1, accessControlListXml.countWhere(\elt -> elt.PartyName == testName))
    assertEquals(1, accessControlListXml.countWhere(\elt -> elt.PartyId == testId))
    assertEquals(1, accessControlListXml.countWhere(\elt -> elt.PartyRoleCd == testRole))
  }

  function testReferredObjectsAddedToRepositoryOperationRq() {
    assertNotNull(_referredObjectsXml)
  }

  function testReferredObjectsAddedToDocumentItem() {
    assertEquals(_entity.UMR, _referredObjectsXml.Contract.BrokerReference)
    assertEquals(_entity.UCR, _referredObjectsXml.Claim.BrokerReference)
  }
}