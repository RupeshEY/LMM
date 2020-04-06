package gw.acc.iplm.entitymapper.imr.docupload

uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.enums.AccessRightCdType
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.enums.ListActionCdType
uses gw.plugin.Plugins
uses gw.plugin.document.IDocumentContentSourceBase
uses gw.testharness.v3.GUnitTestClass

uses java.io.File
uses java.io.FileInputStream

class DocumentUploadRqEntityMapperTest extends GUnitTestClass {

  private static var _mapper = new DocumentUploadRqEntityMapper()
  private static var _claim: Claim
  private static var _claimNotifyMessage: ECFMessageClaimNotifyRq_Ext
  private static var _documentToUpload: Document

  override function beforeClass() {
    super.beforeClass()
    _claim = createClaim()
    _claimNotifyMessage = createClaimNotifyMessageOnClaim(_claim)
  }

  override function beforeMethod() {
    super.beforeMethod()
    _documentToUpload = createDocumentOnClaim(_claim, _claimNotifyMessage.TR)
  }

  function testCreateNewDocumentUploadRq() {
    var acl: List<ECFMessageDocumentUploadAccessParty_Ext>

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      acl = new ArrayList<ECFMessageDocumentUploadAccessParty_Ext>()
      var acl1 = new ECFMessageDocumentUploadAccessParty_Ext()
      acl1.ListAction = ListActionCdType.Remove.Value
      acl1.AccessRight = AccessRightCdType.Read.Value
      acl1.PartyId = "test-id-1"
      acl1.PartyRole = ContactRole.TC_BROKER_EXT.toString()
      acl1.PartyName = "test-name-1"
      acl.add(acl1)

      var acl2 = new ECFMessageDocumentUploadAccessParty_Ext()
      acl2.ListAction = ListActionCdType.Remove.Value
      acl2.AccessRight = AccessRightCdType.Read.Value
      acl2.PartyId = "test-id-2"
      acl2.PartyRole = ContactRole.TC_BROKER_EXT.toString()
      acl2.PartyName = "test-name-2"
      acl.add(acl2)
    }, ECFConstants.ECF_SUPER_USER)

    var docUploadRqEntity = _mapper.createNewDocumentUploadRq(_documentToUpload, acl)
    assertNotNull(docUploadRqEntity)
    assertEquals(2, docUploadRqEntity.AccessParties.length)
  }

  function testCreateNewDocumentUploadRq_EmptyACL() {
    var docUploadRqEntity = _mapper.createNewDocumentUploadRq(_documentToUpload, new ArrayList<ECFMessageDocumentUploadAccessParty_Ext>())
    assertNotNull(docUploadRqEntity)
    assertEquals(0, docUploadRqEntity.AccessParties.length)
  }

  function testCreateNewDocumentUploadRq_NullACL() {
    var docUploadRqEntity = _mapper.createNewDocumentUploadRq(_documentToUpload, null)
    assertNotNull(docUploadRqEntity)
    assertEquals(0, docUploadRqEntity.AccessParties.length)
  }

  function testCreateNewDocumentUploadRq_UUID() {
    var docUploadRqEntity = _mapper.createNewDocumentUploadRq(_documentToUpload, new ArrayList<ECFMessageDocumentUploadAccessParty_Ext>())
    assertNotNull(docUploadRqEntity.UUID)
  }

  function testCreateNewDocumentUploadRq_OriginTimeStamp() {
    var docUploadRqEntity = _mapper.createNewDocumentUploadRq(_documentToUpload, new ArrayList<ECFMessageDocumentUploadAccessParty_Ext>())
    assertNotNull(docUploadRqEntity.OriginTimeStamp)
    assertTrue(new Date().after(docUploadRqEntity.OriginTimeStamp))
  }

  function testCreateNewDocumentUploadRq_Claim() {
    var docUploadRqEntity = _mapper.createNewDocumentUploadRq(_documentToUpload, new ArrayList<ECFMessageDocumentUploadAccessParty_Ext>())
    assertEquals(_claim.ClaimNumber, docUploadRqEntity.Claim.ClaimNumber)
  }

  function testCreateNewDocumentUploadRq_UCR() {
    var docUploadRqEntity = _mapper.createNewDocumentUploadRq(_documentToUpload, new ArrayList<ECFMessageDocumentUploadAccessParty_Ext>())
    assertNotNull(docUploadRqEntity.UCR)
    assertEquals(_claim.UCR_Ext, docUploadRqEntity.UCR)
  }

  function testCreateNewDocumentUploadRq_UMR() {
    var docUploadRqEntity = _mapper.createNewDocumentUploadRq(_documentToUpload, new ArrayList<ECFMessageDocumentUploadAccessParty_Ext>())
    assertNotNull(docUploadRqEntity.UMR)
    assertEquals(_claim.UMR_Ext, docUploadRqEntity.UMR)
  }

  function testCreateNewDocumentUploadRq_Document() {
    var docUploadRqEntity = _mapper.createNewDocumentUploadRq(_documentToUpload, new ArrayList<ECFMessageDocumentUploadAccessParty_Ext>())
    assertNotNull(docUploadRqEntity.Document)
  }

  function testCreateNewDocumentUploadRq_Status() {
    var docUploadRqEntity = _mapper.createNewDocumentUploadRq(_documentToUpload, new ArrayList<ECFMessageDocumentUploadAccessParty_Ext>())
    assertNotNull(docUploadRqEntity.Status)
    assertEquals(ECFMessageStatus_Ext.TC_PENDING, docUploadRqEntity.Status)
  }

  function testCreateNewDocumentUploadRq_ECFStatus() {
    var docUploadRqEntity = _mapper.createNewDocumentUploadRq(_documentToUpload, new ArrayList<ECFMessageDocumentUploadAccessParty_Ext>())
    assertNotNull(docUploadRqEntity.Document.ECFStatus)
    assertEquals(ECFDocumentStatus_Ext.TC_PENDING_UPLOAD, docUploadRqEntity.Document.ECFStatus)
  }

  function testCreateNewDocumentUploadRq_MessageType() {
    var docUploadRqEntity = _mapper.createNewDocumentUploadRq(_documentToUpload, new ArrayList<ECFMessageDocumentUploadAccessParty_Ext>())
    assertNotNull(docUploadRqEntity.MessageType)
    assertEquals(ECFMessageType_Ext.TC_REPOSITORYUPLOAD, docUploadRqEntity.MessageType)
  }

  function testCreateNewDocumentUploadRq_SenderPartyId() {
    var docUploadRqEntity = _mapper.createNewDocumentUploadRq(_documentToUpload, new ArrayList<ECFMessageDocumentUploadAccessParty_Ext>())
    assertNotNull(docUploadRqEntity.SenderPartyId)
    assertEquals(_claimNotifyMessage.ReceiverPartyId, docUploadRqEntity.SenderPartyId)
  }

  function testCreateNewDocumentUploadRq_SenderPartyName() {
    var docUploadRqEntity = _mapper.createNewDocumentUploadRq(_documentToUpload, new ArrayList<ECFMessageDocumentUploadAccessParty_Ext>())
    assertNotNull(docUploadRqEntity.SenderPartyName)
    assertEquals(_claimNotifyMessage.ReceiverPartyName, docUploadRqEntity.SenderPartyName)
  }

  function testCreateNewDocumentUploadRq_SenderPartyRoleCd() {
    var docUploadRqEntity = _mapper.createNewDocumentUploadRq(_documentToUpload, new ArrayList<ECFMessageDocumentUploadAccessParty_Ext>())
    assertNotNull(docUploadRqEntity.SenderPartyRoleCd)
    assertEquals(_claimNotifyMessage.ReceiverPartyRoleCd, docUploadRqEntity.SenderPartyRoleCd)
  }

  function testCreateNewDocumentUploadRq_ReceiverPartyId() {
    var docUploadRqEntity = _mapper.createNewDocumentUploadRq(_documentToUpload, new ArrayList<ECFMessageDocumentUploadAccessParty_Ext>())
    assertNotNull(docUploadRqEntity.ReceiverPartyId)
    assertEquals(_claimNotifyMessage.SenderPartyId, docUploadRqEntity.ReceiverPartyId)
  }

  function testCreateNewDocumentDownloadRq_ReceiverPartyName() {
    var docUploadRqEntity = _mapper.createNewDocumentUploadRq(_documentToUpload, new ArrayList<ECFMessageDocumentUploadAccessParty_Ext>())
    assertNotNull(docUploadRqEntity.ReceiverPartyName)
    assertEquals(_claimNotifyMessage.SenderPartyName, docUploadRqEntity.ReceiverPartyName)
  }

  function testCreateNewDocumentUploadRq_ReceiverPartyRoleCd() {
    var docUploadRqEntity = _mapper.createNewDocumentUploadRq(_documentToUpload, new ArrayList<ECFMessageDocumentUploadAccessParty_Ext>())
    assertNotNull(docUploadRqEntity.ReceiverPartyRoleCd)
    assertEquals(_claimNotifyMessage.SenderPartyRoleCd, docUploadRqEntity.ReceiverPartyRoleCd)
  }

  function testGetDocumentFileSizeMatchesOnDiskSize() {
    var message = ECFMessageEntityUtil.createDocumentUploadRq()
    var document = message.Document
    var file = ECFMessageUtil.SAMPLE_ATTACHMENT_FILE
    document = addFileToDocument(document, file)

    var fileSize = file.length()
    var expectedFileSize = _mapper.getFileSizeInKB(fileSize)
    var mapperFileSize = _mapper.getDocumentFileSize(document)
    removeTestFiles(document)

    assertEquals(expectedFileSize, mapperFileSize)
  }

  function testIMRDocumentIdAddedToDocument() {
    _mapper.createNewDocumentUploadRq(_documentToUpload, new ArrayList<ECFMessageDocumentUploadAccessParty_Ext>())
    assertNotNull(_documentToUpload.IMRDocumentId)
  }

  function testIMRDocumentIdNotAddedToDocumentIfAlreadyExists() {
    var imrDocId = UUID.randomUUID().toString()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _documentToUpload = bundle.add(_documentToUpload)
      _documentToUpload.IMRDocumentId = imrDocId
    }, ECFConstants.ECF_SUPER_USER)
    _mapper.createNewDocumentUploadRq(_documentToUpload, new ArrayList<ECFMessageDocumentUploadAccessParty_Ext>())

    assertEquals(imrDocId, _documentToUpload.IMRDocumentId)
  }

  function testGetFileSizeInKB(){
    var size = 2999bd
    var expected = 3bd
    var actual = _mapper.getFileSizeInKB(size)
    assertEquals(expected, actual)
  }

  function testGetFileSizeInKBRoundsUp() {
    var size = 12341234bd
    var expected = 12052bd
    var actual = _mapper.getFileSizeInKB(size)
    assertEquals(expected, actual)
  }

  function testGetFileSizeInKBRoundsUpFromLessThanHalf() {
    var size = 1234120bd
    var expected = 1206bd
    var actual = _mapper.getFileSizeInKB(size)
    assertEquals(expected, actual)
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
    }, ECFConstants.ECF_SUPER_USER)

    return claimNotifyMessageEntity
  }

  private function createDocumentOnClaim(claim: Claim, transactionReference : String): Document {
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

  private function addFileToDocument(document: Document, file: File): Document {
    var testInputStream = new FileInputStream(file)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      document = bundle.add(document)
      var dmsPlugin = Plugins.get("IDocumentContentSource") as IDocumentContentSourceBase
      dmsPlugin.addDocument(testInputStream, document)
    }, ECFConstants.ECF_SUPER_USER)

    return document.refresh() as Document
  }

  private function removeTestFiles(document: Document) {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      document = bundle.add(document)
      var dmsPlugin = Plugins.get("IDocumentContentSource") as IDocumentContentSourceBase
      dmsPlugin.removeDocument(document)
    }, ECFConstants.ECF_SUPER_USER)
  }

}