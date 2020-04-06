package gw.acc.iplm.xmlmapper.repositoryoperation.imrsearch

uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRq
uses gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.ReferredObjects
uses gw.testharness.v3.GUnitTestClass

class RepositorySearchRequestMapperTest extends GUnitTestClass {

  private static var _mapper: RepositorySearchRequestMapper
  private static var _entity: ECFMessageDocumentSearchRq_Ext
  private static var _result: RepositoryOperationRq
  private static var _referredObjectsXml: ReferredObjects

  function beforeClass() {
    super.beforeClass()
    _entity = ECFMessageEntityUtil.createDocumentSearchRq()
    _mapper = new RepositorySearchRequestMapper(_entity)
    _result = _mapper.createRepositoryOperationRq()
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
    assertEquals("RepositorySearch", _result.RepositoryOperationTypeCd.Code)
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

  function testReferredObjectsAddedToDocumentItem() {
    assertNotNull(_referredObjectsXml)
    assertEquals(_entity.UMR, _referredObjectsXml.Contract.BrokerReference)
    assertEquals(_entity.UCR, _referredObjectsXml.Claim.BrokerReference)
    assertEquals(_entity.TR, _referredObjectsXml.ClaimEntry.BrokerReference)
  }

  function testSearchCriteriaAddedToRepositoryOperationRq() {
    assertNotNull(_result.SearchCriteria)
    assertEquals(0L, _result.SearchCriteria.SearchLimit)
    assertEquals(0L, _result.SearchCriteria.SearchStart)
  }

  function testSearchXMLAddedToEntity() {
    assertNotNull(_entity.Content)
    assertEquals(_result.MsgId, RepositoryOperationRq.parse(_entity.Content.getContentString()).MsgId)
  }
}