package gw.acc.iplm.utils

uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRq
uses gw.api.database.Query
uses gw.plugin.Plugins
uses gw.plugin.document.IDocumentContentSourceBase
uses gw.testharness.v3.GUnitTestClass

uses java.io.File

class DocumentUtilsTest extends GUnitTestClass {

  private var _allNewTestFiles: List<File> = new ArrayList<File>()
  private var _logger = ECFConstants.LOGGER_BLOCK()

  override function afterMethod(t: Throwable) {
    super.afterMethod(t)
    deleteAllSampleFiles()
    deleteAllDocuments()
  }

  function testFindDocumentByIMRDocumentId() {
    var newimrDocumentId = UUID.randomUUID().toString()
    var newDoc = createNewDocument(null, newimrDocumentId)

    var foundDoc = DocumentUtils.findDocumentByIMRDocumentId(newimrDocumentId)

    assertNotNull(foundDoc)
    assertEquals(newimrDocumentId, foundDoc.IMRDocumentId)
    assertEquals(newDoc.PublicID, foundDoc.PublicID)
  }

  function testFindDocumentByimrDocumentId_DocDoesNotExist() {
    var newimrDocumentId = UUID.randomUUID().toString()
    var foundDoc = DocumentUtils.findDocumentByIMRDocumentId(newimrDocumentId)
    assertNull(foundDoc)
  }

  function testFindDocumentByIMRDocumentId_Null() {
    var foundDoc = DocumentUtils.findDocumentByIMRDocumentId(null)
    assertNull(foundDoc)
  }

  function testFindDocument() {
    var newDocUID = UUID.randomUUID().toString()
    var newDoc = createNewDocument(newDocUID, null)

    var foundDoc = DocumentUtils.findDocument(newDocUID)

    assertNotNull(foundDoc)
    assertEquals(newDocUID, foundDoc.DocUID)
    assertEquals(newDoc.PublicID, foundDoc.PublicID)
  }

  function testFindDocument_DocDoesNotExist() {
    var newDocUID = UUID.randomUUID().toString()
    var foundDoc = DocumentUtils.findDocument(newDocUID)
    assertNull(foundDoc)
  }

  function testFindDocument_Null() {
    var foundDoc = DocumentUtils.findDocument(null)
    assertNull(foundDoc)
  }

  function testFindDocumentByUploadRqUUID() {
    var newDocUID = UUID.randomUUID().toString()
    var newDoc = createNewDocument(newDocUID, null)

    var newUploadRq = ECFMessageUtil.createNewDocumentUploadRq()
    var uploadRqUUID = newUploadRq.MsgId
    var newUploadRqEntity = createUploadRqEntity(newUploadRq)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newUploadRqEntity = bundle.add(newUploadRqEntity)
      newUploadRqEntity.Document = newDoc
    }, "su")

    var foundDoc = DocumentUtils.findDocumentByUploadRqUUID(uploadRqUUID)

    assertNotNull(foundDoc)
    assertEquals(newDocUID, foundDoc.DocUID)
    assertEquals(newDoc.PublicID, foundDoc.PublicID)
  }

  function testFindDocumentByUploadRqUUID_DocDoesNotExist() {
    var foundDoc = DocumentUtils.findDocumentByUploadRqUUID(UUID.randomUUID().toString())
    assertNull(foundDoc)
  }

  function testFindDocumentByUploadRqUUID_Null() {
    var foundDoc = DocumentUtils.findDocumentByUploadRqUUID(null)
    assertNull(foundDoc)
  }

  private function createNewClaim(): Claim {
    return ClaimBuilderHelper.createClaim(true)
  }

  private function createNewDocument(docUID: String, imrDocumentId: String): Document {
    return createNewDocument(docUID, imrDocumentId, createNewClaim())
  }

  private function createNewDocument(docUID: String, imrDocumentId: String, claim: Claim): Document {
    var newDoc: Document

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claim = bundle.add(claim)

      newDoc = bundle.add(new Document())
      newDoc.Claim = claim
      newDoc.DocUID = docUID
      newDoc.IMRDocumentId = imrDocumentId

    }, "su")

    return newDoc
  }

  private function createUploadRqEntity(repositoryOperationRq: RepositoryOperationRq): ECFMessageDocumentUploadRq_Ext {
    return ECFMessageEntityUtil.createDocumentUploadRq(repositoryOperationRq)
  }

  private function deleteAllSampleFiles() {
    for (newFile in _allNewTestFiles) {
      try {
        newFile.delete()
      } catch (e: Exception) {
        _logger.error("Could not delete file: {}", newFile.AbsolutePath, e)
      }
    }

    _allNewTestFiles = {}
  }

  private function deleteAllDocuments() {
    var allDocs = Query.make(Document).select().toList()
    var docContentSource = Plugins.get("IDocumentContentSource") as IDocumentContentSourceBase

    for (doc in allDocs) {
      docContentSource.removeDocument(doc)
    }
  }

}