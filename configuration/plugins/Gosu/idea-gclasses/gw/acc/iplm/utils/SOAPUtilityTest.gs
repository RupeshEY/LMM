package gw.acc.iplm.utils

uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.enums.MsgStatusCdType
uses gw.testharness.v3.GUnitTestClass

class SOAPUtilityTest extends GUnitTestClass {

  public function testProcessReceipt_DocumentSearch() {
    var soapMessageReceipt = ECFMessageUtil.createSoapMessageRequest(ECFMessageUtil.createNewDocumentSearchRqPostRs())
    var postRs = SOAPUtility.processReceipt(soapMessageReceipt)
    assertNotNull(postRs)
    assertEquals("RepositorySearch", postRs.MsgItems.MsgItem.first().MsgTypeCd)
    assertEquals(MsgStatusCdType.Received, postRs.MsgItems.MsgItem.first().MsgStatusCd)
  }

  public function testProcessReceipt_DocumentDownload() {
    var soapMessageReceipt = ECFMessageUtil.createSoapMessageRequest(ECFMessageUtil.createNewDocumentDownloadRqPostRs())
    var postRs = SOAPUtility.processReceipt(soapMessageReceipt)
    assertNotNull(postRs)
    assertEquals("RepositoryDownload", postRs.MsgItems.MsgItem.first().MsgTypeCd)
    assertEquals(MsgStatusCdType.Received, postRs.MsgItems.MsgItem.first().MsgStatusCd)
  }

  public function testProcessReceipt_DocumentUpload() {
    var soapMessageReceipt = ECFMessageUtil.createSoapMessageRequest(ECFMessageUtil.createNewDocumentUploadRqPostRs())
    var postRs = SOAPUtility.processReceipt(soapMessageReceipt)
    assertNotNull(postRs)
    assertEquals("RepositoryUpload", postRs.MsgItems.MsgItem.first().MsgTypeCd)
    assertEquals(MsgStatusCdType.Received, postRs.MsgItems.MsgItem.first().MsgStatusCd)
  }
}