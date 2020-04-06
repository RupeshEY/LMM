package gw.acc.iplm

uses gw.acc.iplm.controller.IMRMessageController
uses gw.acc.iplm.entitymapper.imr.docupload.DocumentUploadRqEntityMapper
uses gw.acc.iplm.services.message.imr.IMRDocumentDownloadRqService
uses gw.acc.iplm.testutils.MockitoStatics
uses gw.api.util.DisplayableException
uses gw.testharness.v3.GUnitTestClass
uses org.mockito.Mockito

class IMRMessageControllerTest extends GUnitTestClass implements MockitoStatics {

  private static var _IMRMessageController: IMRMessageController

  override function beforeClass(){
    super.beforeClass()
    _IMRMessageController = new IMRMessageController()
  }

  public function testUploadFailureThrowsDisplayableException() {
    var mockedService = mock(DocumentUploadRqEntityMapper)
    var document = mock(Document)
    Mockito.doThrow(Exception).when(mockedService).createNewDocumentUploadRq(document, null)
    setMockUploadService(mockedService)

    assertCausesException(\-> {
      _IMRMessageController.sendRepositoryUploadRequestForDocument(document, null)
    }, DisplayableException)
  }

  private function setMockUploadService(mock: DocumentUploadRqEntityMapper) {
    var uploadService = _IMRMessageController.Class.getDeclaredField("_imrUploadRequestMapper")
    uploadService.setAccessible(true)
    uploadService.set(_IMRMessageController, mock)
  }

  private function setMockDownloadService(mock: IMRDocumentDownloadRqService) {
    var downloadService = _IMRMessageController.Class.getDeclaredField("_imrDownloadService")
    downloadService.setAccessible(true)
    downloadService.set(_IMRMessageController, mock)
  }
}