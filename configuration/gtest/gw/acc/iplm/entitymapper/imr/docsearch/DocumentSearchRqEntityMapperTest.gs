package gw.acc.iplm.entitymapper.imr.docsearch

uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.testharness.v3.GUnitTestClass

class DocumentSearchRqEntityMapperTest extends GUnitTestClass {

  private static var _claim: Claim
  private static var _claimNotifyMessage: ECFMessageClaimNotifyRq_Ext
  private static var _docSearchRqEntity: ECFMessageDocumentSearchRq_Ext

  override function beforeClass() {
    super.beforeClass()
    _claim = createClaim()
    _claimNotifyMessage = createClaimNotifyMessageOnClaim(_claim)
    _docSearchRqEntity = new DocumentSearchRqEntityMapper().createNewDocumentSearchRq(_claim, _claimNotifyMessage.TR)
  }

  function testCreateNewDocumentSearchRq() {
    assertNotNull(_docSearchRqEntity)
  }

  function testCreateNewDocumentSearchRq_UUID() {
    assertNotNull(_docSearchRqEntity.UUID)
  }

  function testCreateNewDocumentSearchRq_OriginTimeStamp() {
    assertNotNull(_docSearchRqEntity.OriginTimeStamp)
    assertTrue(new Date().after(_docSearchRqEntity.OriginTimeStamp))
  }

  function testCreateNewDocumentSearchRq_Claim() {
    assertNotNull(_docSearchRqEntity.Claim)
    assertEquals(_claim.ClaimNumber, _docSearchRqEntity.Claim.ClaimNumber)
  }

  function testCreateNewDocumentSearchRq_TR() {
    assertNotNull(_docSearchRqEntity.TR)
  }

  function testCreateNewDocumentSearchRq_UCR() {
    assertNotNull(_docSearchRqEntity.UCR)
    assertEquals(_claim.UCR_Ext, _docSearchRqEntity.UCR)
  }

  function testCreateNewDocumentSearchRq_UMR() {
    assertNotNull(_docSearchRqEntity.UMR)
    assertEquals(_claim.UMR_Ext, _docSearchRqEntity.UMR)
  }

  function testCreateNewDocumentSearchRq_Status() {
    assertNotNull(_docSearchRqEntity.Status)
    assertEquals(ECFMessageStatus_Ext.TC_PENDING, _docSearchRqEntity.Status)
  }

  function testCreateNewDocumentSearchRq_MessageType() {
    assertNotNull(_docSearchRqEntity.MessageType)
    assertEquals(ECFMessageType_Ext.TC_REPOSITORYSEARCH, _docSearchRqEntity.MessageType)
  }

  function testCreateNewDocumentSearchRq_SenderPartyId() {
    assertNotNull(_docSearchRqEntity.SenderPartyId)
    assertEquals(_claimNotifyMessage.ReceiverPartyId, _docSearchRqEntity.SenderPartyId)
  }

  function testCreateNewDocumentSearchRq_SenderPartyName() {
    assertNotNull(_docSearchRqEntity.SenderPartyName)
    assertEquals(_claimNotifyMessage.ReceiverPartyName, _docSearchRqEntity.SenderPartyName)
  }

  function testCreateNewDocumentSearchRq_SenderPartyRoleCd() {
    assertNotNull(_docSearchRqEntity.SenderPartyRoleCd)
    assertEquals(_claimNotifyMessage.ReceiverPartyRoleCd, _docSearchRqEntity.SenderPartyRoleCd)
  }

  function testCreateNewDocumentSearchRq_ReceiverPartyId() {
    assertNotNull(_docSearchRqEntity.ReceiverPartyId)
    assertEquals(_claimNotifyMessage.SenderPartyId, _docSearchRqEntity.ReceiverPartyId)
  }

  function testCreateNewDocumentSearchRq_ReceiverPartyName() {
    assertNotNull(_docSearchRqEntity.ReceiverPartyName)
    assertEquals(_claimNotifyMessage.SenderPartyName, _docSearchRqEntity.ReceiverPartyName)
  }

  function testCreateNewDocumentSearchRq_ReceiverPartyRoleCd() {
    assertNotNull(_docSearchRqEntity.ReceiverPartyRoleCd)
    assertEquals(_claimNotifyMessage.SenderPartyRoleCd, _docSearchRqEntity.ReceiverPartyRoleCd)
  }

  private function createClaim(): Claim {
    return ClaimBuilderHelper.createClaim(true)
  }

  private function createClaimNotifyMessageOnClaim(claim: Claim): ECFMessageClaimNotifyRq_Ext {
    var claimNotifyRqXml = new ECFMessageUtil().createNewClaimNotifyRq()
    claimNotifyRqXml.TR = String.valueOf(System.currentTimeMillis())
    claimNotifyRqXml.UCR = claim.UCR_Ext
    claimNotifyRqXml.UMR = claim.UMR_Ext
    var claimNotifyMessageEntity = ECFMessageEntityUtil.createClaimNotifyRq(claimNotifyRqXml)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claim = bundle.add(claim)
      claimNotifyMessageEntity = bundle.add(claimNotifyMessageEntity)
      claimNotifyMessageEntity.Claim = claim
    }, "su")

    return claimNotifyMessageEntity
  }

}