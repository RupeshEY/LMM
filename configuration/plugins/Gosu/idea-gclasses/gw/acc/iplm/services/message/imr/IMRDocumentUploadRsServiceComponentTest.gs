package gw.acc.iplm.services.message.imr

uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRs
uses gw.api.databuilder.DocumentBuilder
uses gw.testharness.v3.GUnitTestClass

/**
 * Tests for the IMR Document Upload Service.
 */
class IMRDocumentUploadRsServiceComponentTest extends GUnitTestClass {

  private var _newClaim: Claim
  private var _docUploadResp: RepositoryOperationRs
  private var _docUploadMessage: entity.ECFMessageDocumentUploadRs_Ext
  private var _imrDocumentUploadRs: IMRDocumentUploadRsService

  override function beforeMethod() {
    super.beforeMethod()
    _imrDocumentUploadRs = new IMRDocumentUploadRsService()
  }

  function testProcessResponse() {
    var newClaim = ClaimBuilderHelper.createClaimWithAClaimNotify()
    var document: Document
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaim = bundle.add(newClaim)

      document = new DocumentBuilder()
          .withDMS(true)
          .withObsolete(false)
          .withStatus(TC_FINAL)
          .withInbound(false)
          .withDateModified(Date.Today)
          .withName("AutoAccident3OCQYM0000.tif")
          .withAuthor("ClaimCenter")
          .withDocUID(UUID.randomUUID().toString())
          .create(bundle)

      document.ECFStatus = ECFDocumentStatus_Ext.TC_ON_DMS
      document.IMRDocumentId = UUID.randomUUID().toString()
      newClaim.addToDocuments(document)

    }, User.util.UnrestrictedUser)

    var documentUploadRqMsg = ECFMessageEntityUtil.createDocumentUploadRq(document)

    var documentUploadRsMsg = getDocumentUploadRsMsg(documentUploadRqMsg.UUID)

    var dsRsMsg = ECFMessageEntityUtil.createDocumentUploadRs(documentUploadRsMsg)

    _imrDocumentUploadRs.process(dsRsMsg)
    newClaim.Documents.first().refresh()

    assertEquals(newClaim.Documents?.first().ECFStatus, ECFDocumentStatus_Ext.TC_ON_IMR_AND_DMS)
  }

  function testProcessResponse_2ndResponseForSameDocument() {
    var newClaim = ClaimBuilderHelper.createClaimWithAClaimNotify()
    var document: Document
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaim = bundle.add(newClaim)

      document = new DocumentBuilder()
          .withDMS(true)
          .withObsolete(false)
          .withStatus(TC_FINAL)
          .withInbound(false)
          .withDateModified(Date.Today)
          .withName("AutoAccident3OCQYM0000.tif")
          .withAuthor("ClaimCenter")
          .withDocUID(UUID.randomUUID().toString())
          .create(bundle)

      document.ECFStatus = ECFDocumentStatus_Ext.TC_ON_DMS
      document.IMRDocumentId = UUID.randomUUID().toString()
      newClaim.addToDocuments(document)

    }, User.util.UnrestrictedUser)

    var documentUploadRqMsg = ECFMessageEntityUtil.createDocumentUploadRq(document)

    var documentUploadRsMsg = getDocumentUploadRsMsg(documentUploadRqMsg.UUID)

    var dsRsMsg = ECFMessageEntityUtil.createDocumentUploadRs(documentUploadRsMsg)

    _imrDocumentUploadRs.process(dsRsMsg)
    _imrDocumentUploadRs.process(dsRsMsg)
    newClaim.Documents.first().refresh()

    assertEquals(newClaim.Documents?.first().ECFStatus, ECFDocumentStatus_Ext.TC_ON_IMR_AND_DMS)
  }

  function testPendingUpload() {
    var newClaim = ClaimBuilderHelper.createClaim()
    var document: Document
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaim = bundle.add(newClaim)

      document = new DocumentBuilder()
          .withDMS(true)
          .withObsolete(false)
          .withStatus(TC_FINAL)
          .withInbound(false)
          .withDateModified(Date.Today)
          .withName("AutoAccident3OCQYM0000.tif")
          .withAuthor("ClaimCenter")
          .withDocUID(UUID.randomUUID().toString())
          .create(bundle)

      document.ECFStatus = ECFDocumentStatus_Ext.TC_PENDING_UPLOAD
      document.IMRDocumentId = UUID.randomUUID().toString()
      newClaim.addToDocuments(document)

    }, User.util.UnrestrictedUser)

    document = document.refresh() as Document
    assertFalse(document.CanUploadToIMR)
  }

  function getDocumentUploadRsMsg(uploadRqMsgId: String): RepositoryOperationRs {
    var documentUploadRs = ECFMessageUtil.createNewDocumentUploadRs()
    documentUploadRs.ResponseInfo.MsgId = uploadRqMsgId

    return documentUploadRs
  }

  function testProcessMessage_ValidContentAck() {

    //create a claim
    _newClaim = createNewClaim()
    _docUploadResp = createDocumentUploadResponse(_newClaim)
    _docUploadMessage = ECFMessageEntityUtil.createDocumentUploadRs(_docUploadResp, _newClaim.Documents.first())

    _imrDocumentUploadRs.process(_docUploadMessage)

    _newClaim = refreshClaim(_newClaim)

    assertEquals(1, _newClaim.Documents.Count)
    assertEquals(ECFDocumentStatus_Ext.TC_ON_IMR_AND_DMS, _newClaim.Documents?.first().ECFStatus)
  }

  function testProcessMessage_NonXmlContent() {
    //create a claim
    _newClaim = createNewClaim()
    _docUploadResp = createDocumentUploadResponse(_newClaim)
    _docUploadMessage = ECFMessageEntityUtil.createDocumentUploadRs(_docUploadResp, _newClaim.Documents.first())

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _docUploadMessage = bundle.add(_docUploadMessage)
      _docUploadMessage.Content = new Blob("This is not XML".Bytes)
    }, "su")

    assertCausesException(\-> {
      _imrDocumentUploadRs.process(_docUploadMessage)
    }, gw.xml.XmlException)

  }

  private function createDocumentUploadResponse(claim: Claim): RepositoryOperationRs {
    var repOpResp = ECFMessageUtil.createNewDocumentUploadRs()
    repOpResp.ResponseInfo.MsgId = ECFMessageEntityUtil.createDocumentUploadRq(claim.Documents.first()).UUID
    return repOpResp
  }

  private function createNewClaim(): Claim {
    var claim = ClaimBuilderHelper.createClaim(true)
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claim = bundle.add(claim)
      var document = new DocumentBuilder()
          .withDMS(true)
          .withObsolete(false)
          .withStatus(TC_FINAL)
          .withInbound(false)
          .withDateModified(Date.Today)
          .withName("AutoAccident3OCQYM0000.tif")
          .withAuthor("ClaimCenter")
          .withDocUID(UUID.randomUUID().toString())
          .create(bundle)

      document.ECFStatus = ECFDocumentStatus_Ext.TC_ON_DMS
      claim.addToDocuments(document)

    }, "su")
    return claim
  }

  private function refreshClaim(claimToRefresh: Claim): Claim {
    claimToRefresh = gw.api.database.Query.make(entity.Claim)
        .compare(entity.Claim#ID, Equals, claimToRefresh.ID)
        .select().first()

    return claimToRefresh
  }
}