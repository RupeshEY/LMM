package gw.acc.iplm.xmlmapper.claimretrieve

uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.EntityUtil
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq
uses gw.testharness.v3.GUnitTestClass

class RetrieveClaimRqMapperTest extends GUnitTestClass {

  private static var _mapper: RetrieveClaimRqMapper
  private static var _entity: ECFMessageClaimRetrieveRq_Ext
  private static var _result: RetrieveClaimRq

  function beforeMethod() {
    super.beforeMethod()
    _entity = ECFMessageEntityUtil.createClaimRetrieveRq()
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      _entity = bundle.add(_entity)
      _mapper = new RetrieveClaimRqMapper(_entity)
      _result = _mapper.createRetrieveClaimRq()
    })
  }

  function testClaimRetrieveRqObjectCreated() {
    assertNotNull("RetrieveClaimRq not created", _result)
    _result.asUTFString()
  }

  function testSenderAddedToRepositoryOperationRq() {
    assertEquals(_entity.SenderPartyRoleCd, _result.Sender)
  }

  function testReceiverAddedToRepositoryOperationRq() {
    assertEquals(_entity.ReceiverPartyRoleCd, _result.Receiver)
  }

  function testMsgIdAddedToRepositoryOperationRq() {
    assertEquals(_entity.UUID, _result.UUId)
  }

  function testCreationDtTimeAddedToRepositoryOperationRq() {
    var expected = ECFConstants.ECF_XML_PAYLOAD_DATETIME_FORMAT.get().format(_entity.OriginTimeStamp)
    assertEquals(expected, _result.CreationDate)
  }

  function testInsurerAddedToRepositoryOperationRq() {
    assertNotNull(_result.Insurer)
    assertNotNull(_result.Insurer.Party)
    assertEquals(_entity.SenderPartyId, _result.Insurer.Party.FirstId)
    assertEquals(_entity.SenderPartyName, _result.Insurer.Party.Name)
    assertEquals(_entity.SenderPartyAgency, _result.Insurer.Party.FirstAgency)
  }

  function testServiceProviderAddedToRepositoryOperationRq() {
    assertNotNull(_result.ServiceProvider)
    assertNotNull(_result.ServiceProvider.Party)
    assertEquals(_entity.ReceiverPartyId, _result.ServiceProvider.Party.FirstId)
    assertEquals(_entity.ReceiverPartyName, _result.ServiceProvider.Party.Name)
    assertEquals(_entity.ReceiverPartyAgency, _result.ServiceProvider.Party.FirstAgency)
  }

  function testReferredObjectsAddedToDocumentItem() {
    assertNotNull(_result.ReferredObjects)
    assertEquals(_entity.UMR, _result.ReferredObjects.Contract.BrokerReference)
    assertEquals(_entity.UCR, _result.ReferredObjects.Claim.BrokerReference)
    assertEquals(_entity.ClaimLineNumber, _result.ReferredObjects.Claim.ClaimLineNumber.longValue())
    assertEquals(_entity.ClaimType, ECFClaimTypeCode_Ext.get(_result.ReferredObjects.Claim.ClaimType))
    assertEquals(_entity.TR, _result.ReferredObjects.ClaimEntry.BrokerReference)
  }

  function testXmlContent() {
    assertEquals(_result.asUTFString(), _entity.Content.ContentString)
  }
}