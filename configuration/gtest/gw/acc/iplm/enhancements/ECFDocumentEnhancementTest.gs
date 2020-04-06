package gw.acc.iplm.enhancements

uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.utils.ECFConstants
uses gw.api.database.Query
uses gw.api.testdata.TestDataUtil
uses gw.plugin.Plugins
uses gw.plugin.document.IDocumentContentSourceBase
uses gw.testharness.v3.GUnitTestClass

uses java.io.File
uses java.io.FileInputStream

/**
 * Tests for the ECFDocument enhancements.
 */
class ECFDocumentEnhancementTest extends GUnitTestClass {

  private var _allNewTestFiles: List<File> = new ArrayList<File>()
  private var _logger = ECFConstants.LOGGER_BLOCK()

  override function afterMethod(t: Throwable) {
    super.afterMethod(t)
    deleteAllSampleFiles()
    deleteAllDocuments()
  }

  function testCanUploadToIMR() {
    var newDoc = createECFDocumentForTest()
    newDoc = addFileToDocument(newDoc, ECFMessageUtil.SAMPLE_ATTACHMENT_FILE)
    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        newDoc.ECFStatus = ECFDocumentStatus_Ext.TC_ON_DMS
        newDoc.TR = "TR03"
        assertTrue("Document should be uploaded to IMR", newDoc.CanUploadToIMR)
      })
    })
  }

  function testCanUploadToIMRWithNoContentExist() {
    var ecfDocument = createECFDocumentForTest()
    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        ecfDocument.ECFStatus = ECFDocumentStatus_Ext.TC_ON_DMS
        assertFalse("Document should not be uploaded to IMR", ecfDocument.CanUploadToIMR)
      })
    })
  }

  function testCanDownloadFromIMR() {
    var ecfDocument = createECFDocumentForTest()
    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        ecfDocument.ECFStatus = ECFDocumentStatus_Ext.TC_ON_IMR
        assertTrue(ecfDocument.CanDownloadFromIMR)
        ecfDocument.ECFStatus = ECFDocumentStatus_Ext.TC_ON_DMS
        assertFalse(ecfDocument.CanDownloadFromIMR)
      })
    })
  }

  private function createECFDocumentForTest(): Document {
    var document: Document
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      document = new Document()
      document.Status = DocumentStatusType.TC_FINAL
      document.Name = UUID.randomUUID().toString()
      document.DocUID = UUID.randomUUID().toString()
      var claim = ClaimBuilderHelper.createClaim(true)
      document.Claim = claim
    }, ECFConstants.ECF_SUPER_USER)
    return document
  }


  private function addFileToDocument(document: Document, file: File): Document {
    var documentContentSourcePlugin = Plugins.get("IDocumentContentSource") as IDocumentContentSourceBase
    var testInputStream = new FileInputStream(file)
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      document = bundle.add(document)
      documentContentSourcePlugin.addDocument(testInputStream, document)
    }, ECFConstants.ECF_SUPER_USER)
    return document
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