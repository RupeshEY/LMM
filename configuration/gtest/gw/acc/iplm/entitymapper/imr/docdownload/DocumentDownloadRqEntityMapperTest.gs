package gw.acc.iplm.entitymapper.imr.docdownload

uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.utils.ECFConstants
uses gw.testharness.v3.GUnitTestClass

class DocumentDownloadRqEntityMapperTest extends GUnitTestClass {

  private static var _claim: Claim
  private static var _claimNotifyMessage: ECFMessageClaimNotifyRq_Ext
  private static var _documentToDownload: Document
  private static var _docDownloadRqEntity: ECFMessageDocumentDownloadRq_Ext

  override function beforeClass() {
    super.beforeClass()
    _claim = createClaim()
    _claimNotifyMessage = createClaimNotifyMessageOnClaim(_claim)
    _documentToDownload = createDocumentOnClaim(_claim, _claimNotifyMessage.TR)
    _docDownloadRqEntity = new DocumentDownloadRqEntityMapper().createNewDocumentDownloadRq(_documentToDownload)
  }

  function testCreateNewDocumentDownloadRq() {
    assertNotNull(_docDownloadRqEntity)
  }

  function testCreateNewDocumentDownloadRq_UUID() {
    assertNotNull(_docDownloadRqEntity.UUID)
  }

  function testCreateNewDocumentDownloadRq_OriginTimeStamp() {
    assertNotNull(_docDownloadRqEntity.OriginTimeStamp)
    assertTrue(new Date().after(_docDownloadRqEntity.OriginTimeStamp))
  }

  function testCreateNewDocumentDownloadRq_Claim() {
    assertNotNull(_docDownloadRqEntity.Claim)
    assertEquals(_claim.ClaimNumber, _docDownloadRqEntity.Claim.ClaimNumber)
  }

  function testCreateNewDocumentDownloadRq_TR() {
    assertNotNull(_docDownloadRqEntity.TR)
  }

  function testCreateNewDocumentDownloadRq_UCR() {
    assertNotNull(_docDownloadRqEntity.UCR)
    assertEquals(_claim.UCR_Ext, _docDownloadRqEntity.UCR)
  }

  function testCreateNewDocumentDownloadRq_UMR() {
    assertNotNull(_docDownloadRqEntity.UMR)
    assertEquals(_claim.UMR_Ext, _docDownloadRqEntity.UMR)
  }

  function testCreateNewDocumentDownloadRq_Document() {
    assertNotNull(_docDownloadRqEntity.Document)
    assertEquals(_documentToDownload.IMRDocumentId, _docDownloadRqEntity.Document.IMRDocumentId)
  }

  function testCreateNewDocumentDownloadRq_Status() {
    assertNotNull(_docDownloadRqEntity.Status)
    assertEquals(ECFMessageStatus_Ext.TC_PENDING, _docDownloadRqEntity.Status)
  }

  function testCreateNewDocumentDownloadRq_MessageType() {
    assertNotNull(_docDownloadRqEntity.MessageType)
    assertEquals(ECFMessageType_Ext.TC_REPOSITORYDOWNLOAD, _docDownloadRqEntity.MessageType)
  }

  function testCreateNewDocumentDownloadRq_SenderPartyId() {
    assertNotNull(_docDownloadRqEntity.SenderPartyId)
    assertEquals(_claimNotifyMessage.ReceiverPartyId, _docDownloadRqEntity.SenderPartyId)
  }

  function testCreateNewDocumentDownloadRq_SenderPartyName() {
    assertNotNull(_docDownloadRqEntity.SenderPartyName)
    assertEquals(_claimNotifyMessage.ReceiverPartyName, _docDownloadRqEntity.SenderPartyName)
  }

  function testCreateNewDocumentDownloadRq_SenderPartyRoleCd() {
    assertNotNull(_docDownloadRqEntity.SenderPartyRoleCd)
    assertEquals(_claimNotifyMessage.ReceiverPartyRoleCd, _docDownloadRqEntity.SenderPartyRoleCd)
  }

  function testCreateNewDocumentDownloadRq_ReceiverPartyId() {
    assertNotNull(_docDownloadRqEntity.ReceiverPartyId)
    assertEquals(_claimNotifyMessage.SenderPartyId, _docDownloadRqEntity.ReceiverPartyId)
  }

  function testCreateNewDocumentDownloadRq_ReceiverPartyName() {
    assertNotNull(_docDownloadRqEntity.ReceiverPartyName)
    assertEquals(_claimNotifyMessage.SenderPartyName, _docDownloadRqEntity.ReceiverPartyName)
  }

  function testCreateNewDocumentDownloadRq_ReceiverPartyRoleCd() {
    assertNotNull(_docDownloadRqEntity.ReceiverPartyRoleCd)
    assertEquals(_claimNotifyMessage.SenderPartyRoleCd, _docDownloadRqEntity.ReceiverPartyRoleCd)
  }

  function testCreateNewDocumentDownloadRq_ECFStatus() {
    assertNotNull(_docDownloadRqEntity.Status)
    assertEquals(ECFMessageStatus_Ext.TC_PENDING, _docDownloadRqEntity.Status)
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

  private function createDocumentOnClaim(claim: Claim, transactionReference: String): Document {
    var newDocument: Document
    var currentTimeString = String.valueOf(System.currentTimeMillis())

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claim = bundle.add(claim)
      newDocument = bundle.add(new Document())
      newDocument.IMRDocumentId = UUID.randomUUID().toString()
      newDocument.IMRDocumentVersion = currentTimeString
      newDocument.IMRDocumentVersionDtTime = new Date().toCalendar().getTime()
      newDocument.IMRInheritIndicator = false
      newDocument.Name = "DocDownloadTest_" + currentTimeString
      newDocument.MimeType = "application/pdf"
      newDocument.IMRFileSizeNum = 90
      newDocument.IMRFileSizeUnit = "KB"
      newDocument.IMRDocumentType = "document"
      newDocument.ECFStatus = ECFDocumentStatus_Ext.TC_ON_IMR
      newDocument.TR = transactionReference
      newDocument.Claim = claim
    }, ECFConstants.ECF_SUPER_USER)

    return newDocument
  }

}