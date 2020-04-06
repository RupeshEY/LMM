package gw.acc.iplm.services.message.imr

uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.testutils.SampleFileReader
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRs
uses gw.plugin.Plugins
uses gw.plugin.document.IDocumentContentSourceBase
uses gw.testharness.v3.GUnitTestClass

/**
 * Tests for the IMR Document Download Service.
 */
class IMRDocumentDownloadRsServiceComponentTest extends GUnitTestClass {

  private static var _sampleUCR : String
  private static var _sampleUMR = "UMR_123"
  private static var _docVersion = "testDocVersion"
  private static var _docUnderTest: Document
  private static var _documentContentSourcePlugin: IDocumentContentSourceBase

  override function beforeClass() {
    super.beforeClass()
    _documentContentSourcePlugin = Plugins.get("IDocumentContentSource") as IDocumentContentSourceBase
  }

  override function beforeMethod() {
    super.beforeMethod()
    _sampleUCR = ClaimBuilderHelper.getNextUCR()
  }

  override function afterMethod(t: Throwable) {
    super.afterMethod(t)
    deleteSampleFile()
  }

  override function afterClass(){
    deleteSampleFile()
  }

  private function deleteSampleFile(){
    if (_docUnderTest != null) {
      try {
        _documentContentSourcePlugin.removeDocument(_docUnderTest)
      } catch (e: Exception) {
        fail("The document ${_docUnderTest.Name} was never saved to the DMS")
      }
      _docUnderTest = null
    }
  }

  function testProcessResponseSuccessfully() {
    var newClaim = ClaimBuilderHelper.createClaim()

    var downloadRsXml = SampleFileReader.readFile(ECFMessageUtil.DOCUMENT_DOWNLOAD_RS_FILE_2)
    var downloadRepOpRs = RepositoryOperationRs.parse(downloadRsXml)

    var imrDocumentId = UUID.randomUUID().toString()
    downloadRepOpRs.DocumentList.first().DocumentItem.first().Document.DocumentId = imrDocumentId

    var downloadRsBinary = SampleFileReader.readFile(ECFMessageUtil.DOCUMENT_DOWNLOAD_BINARY_FILE)

    var messageUnderTest = ECFMessageEntityUtil.createDocumentDownloadRs(downloadRepOpRs)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var newDocument = new Document(bundle)
      newDocument = bundle.add(newDocument)
      newDocument.DocUID = UUID.randomUUID().toString()
      newDocument.IMRDocumentId = imrDocumentId
      newDocument.IMRDocumentVersion = _docVersion
      newDocument.Name = "SampleFirstReport.pdf"
      newDocument.MimeType = "application/pdf"

      newClaim = bundle.add(newClaim)
      newClaim.UCR_Ext = _sampleUCR
      newClaim.UMR_Ext = _sampleUMR
      newClaim.addToDocuments(newDocument)

      messageUnderTest = bundle.add(messageUnderTest)
      messageUnderTest.Claim = newClaim
      messageUnderTest.Document = newDocument
      messageUnderTest.DocumentBinary = new Blob(downloadRsBinary.Bytes)
    }, User.util.UnrestrictedUser)

    _docUnderTest = newClaim.Documents.firstWhere(\elt -> elt.IMRDocumentId == imrDocumentId)
    assertNotSame(ECFDocumentStatus_Ext.TC_ON_IMR_AND_DMS, _docUnderTest.ECFStatus)
    new IMRDocumentDownloadRsService().process(messageUnderTest)
    _docUnderTest = _docUnderTest.refresh() as Document
    assertEquals("ECF Status should be 'On IMR And DMS'", ECFDocumentStatus_Ext.TC_ON_IMR_AND_DMS, _docUnderTest.ECFStatus)
    assertTrue("In DMS Status should be 'True'", _docUnderTest.DMS)
    assertEquals("Document Status should be 'Final'", DocumentStatusType.TC_FINAL, _docUnderTest.Status)
  }

  function testProcessResponseSuccessfully_2ndResponseForSameDocument() {
    var newClaim = ClaimBuilderHelper.createClaim()

    var downloadRsXml = SampleFileReader.readFile(ECFMessageUtil.DOCUMENT_DOWNLOAD_RS_FILE_2)
    var downloadRepOpRs = RepositoryOperationRs.parse(downloadRsXml)

    var imrDocumentId = UUID.randomUUID().toString()
    downloadRepOpRs.DocumentList.first().DocumentItem.first().Document.DocumentId = imrDocumentId

    var downloadRsBinary = SampleFileReader.readFile(ECFMessageUtil.DOCUMENT_DOWNLOAD_BINARY_FILE)

    var messageUnderTest = ECFMessageEntityUtil.createDocumentDownloadRs(downloadRepOpRs)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var newDocument = new Document(bundle)
      newDocument = bundle.add(newDocument)
      newDocument.DocUID = UUID.randomUUID().toString()
      newDocument.IMRDocumentId = imrDocumentId
      newDocument.IMRDocumentVersion = _docVersion
      newDocument.Name = "SampleFirstReport.pdf"
      newDocument.MimeType = "application/pdf"

      newClaim = bundle.add(newClaim)
      newClaim.UCR_Ext = _sampleUCR
      newClaim.UMR_Ext = _sampleUMR
      newClaim.addToDocuments(newDocument)

      messageUnderTest = bundle.add(messageUnderTest)
      messageUnderTest.Claim = newClaim
      messageUnderTest.Document = newDocument
      messageUnderTest.DocumentBinary = new Blob(downloadRsBinary.Bytes)
    }, User.util.UnrestrictedUser)

    _docUnderTest = newClaim.Documents.firstWhere(\elt -> elt.IMRDocumentId == imrDocumentId)
    assertNotSame(ECFDocumentStatus_Ext.TC_ON_IMR_AND_DMS, _docUnderTest.ECFStatus)
    var downloadRsService = new IMRDocumentDownloadRsService()
    downloadRsService.process(messageUnderTest)
    downloadRsService.process(messageUnderTest)

    _docUnderTest = _docUnderTest.refresh() as Document
    assertEquals("ECF Status should be 'On IMR And DMS'", ECFDocumentStatus_Ext.TC_ON_IMR_AND_DMS, _docUnderTest.ECFStatus)
    assertTrue("In DMS Status should be 'True'", _docUnderTest.DMS)
    assertEquals("Document Status should be 'Final'", DocumentStatusType.TC_FINAL, _docUnderTest.Status)
  }

  function testPendingDownload() {
    var newClaim = ClaimBuilderHelper.createClaim()

    var downloadRsXml = SampleFileReader.readFile(ECFMessageUtil.DOCUMENT_DOWNLOAD_RS_FILE_2)
    var downloadRepOpRs = RepositoryOperationRs.parse(downloadRsXml)

    var imrDocumentId = UUID.randomUUID().toString()
    downloadRepOpRs.DocumentList.first().DocumentItem.first().Document.DocumentId = imrDocumentId

    var downloadRsBinary = SampleFileReader.readFile(ECFMessageUtil.DOCUMENT_DOWNLOAD_BINARY_FILE)

    var messageUnderTest = ECFMessageEntityUtil.createDocumentDownloadRs(downloadRepOpRs)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var newDocument = new Document(bundle)
      newDocument = bundle.add(newDocument)
      newDocument.DocUID = UUID.randomUUID().toString()
      newDocument.IMRDocumentId = imrDocumentId
      newDocument.IMRDocumentVersion = _docVersion
      newDocument.Name = "SampleFirstReport.pdf"
      newDocument.MimeType = "application/pdf"
      newDocument.ECFStatus = ECFDocumentStatus_Ext.TC_PENDING_DOWNLOAD

      newClaim = bundle.add(newClaim)
      newClaim.UCR_Ext = _sampleUCR
      newClaim.UMR_Ext = _sampleUMR
      newClaim.addToDocuments(newDocument)

      messageUnderTest = bundle.add(messageUnderTest)
      messageUnderTest.Claim = newClaim
      messageUnderTest.Document = newDocument
      messageUnderTest.DocumentBinary = new Blob(downloadRsBinary.Bytes)
    }, User.util.UnrestrictedUser)

    _docUnderTest = newClaim.Documents.firstWhere(\elt -> elt.IMRDocumentId == imrDocumentId)
    _docUnderTest = _docUnderTest.refresh() as Document
    assertFalse(_docUnderTest.CanDownloadFromIMR)
  }

}