package gw.acc.iplm.services.message.imr

uses gw.acc.iplm.exception.imr.IMRException
uses gw.acc.iplm.jms.producer.IMRProducerService
uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRq
uses gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.PostRq
uses gw.acc.iplm.xsd.imr.schema_wsdl.oasis_200401_wss_wssecurity_secext_1_0.Security
uses gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.Signature
uses gw.plugin.Plugins
uses gw.plugin.document.IDocumentContentSourceBase
uses gw.testharness.v3.GUnitTestClass
uses org.mockito.Mockito

uses javax.jms.JMSException
uses javax.xml.soap.AttachmentPart
uses javax.xml.soap.SOAPHeaderElement
uses javax.xml.soap.SOAPMessage
uses java.io.File
uses java.io.FileInputStream

class IMRDocumentUploadRqServiceTest extends GUnitTestClass {

  private static var _documentContentSourcePlugin: IDocumentContentSourceBase
  private static var _uploadRqService: IMRDocumentUploadRqService
  private static var _documentUploadEntities: List<ECFMessageDocumentUploadRq_Ext>
  private var _payload: SOAPMessage

  function beforeClass() {
    super.beforeClass()
    _documentContentSourcePlugin = Plugins.get("IDocumentContentSource") as IDocumentContentSourceBase
    _uploadRqService = new IMRDocumentUploadRqService()
    _documentUploadEntities = new ArrayList<ECFMessageDocumentUploadRq_Ext>()
  }

  override function beforeMethod() {
    super.beforeMethod()
  }

  override function afterMethod(t: Throwable) {
    super.afterMethod(t)
    deleteUploadEntity()
  }

  function testSoapEnvelopeCreated() {
    var entity = createDocumentEntities()
    _payload = _uploadRqService.generatePayload(entity)
    assertNotNull("SOAP Message was not created", _payload)
    assertNotNull("SOAP Body was not created", _payload.SOAPBody)
    assertEquals("binary", _payload.SOAPPart.getMimeHeader("Content-Transfer-Encoding").first())

    var postRqResult = _payload.SOAPBody.getChildElements(PostRq.$QNAME).next() as javax.xml.soap.SOAPBodyElement
    assertNotNull(postRqResult)
    assertEquals("http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", postRqResult.ElementQName.NamespaceURI)
    assertEquals("PostRq", postRqResult.ElementQName.LocalPart)
    assertEquals("ac", postRqResult.ElementQName.Prefix)
    assertEquals("http://www.ACORD.org/Standards/AcordMsgSvc/Inbox", postRqResult.getNamespaceURI(""))
    var attachment = _payload.Attachments.toList().first() as AttachmentPart
    var repositorySearchRequest = RepositoryOperationRq.parse(attachment.getRawContentBytes())
    assertNotNull(repositorySearchRequest)
    deleteDocument(entity.Document)
  }

  function testGeneratePayloadIntegration_DocumentBinary() {
    var entity = createDocumentEntities()
    _payload = _uploadRqService.generatePayload(entity)
    var fileAttachment = _payload.Attachments.toList().get(1) as AttachmentPart
    var fileBinary = fileAttachment.getRawContentBytes()
    assertNotNull(fileBinary)
    deleteDocument(entity.Document)
  }

  function testSignPayload() {
    var entity = createDocumentEntities()
    _payload = _uploadRqService.generatePayload(entity)
    _payload = _uploadRqService.signPayload(_payload)

    var securityHeader = (_payload.SOAPHeader.getChildElements(Security.$QNAME).next() as SOAPHeaderElement)
    var signatureHeader = securityHeader?.getChildElements(Signature.$QNAME).next()

    assertNotNull("Envelope should have a signature", signatureHeader)
    deleteDocument(entity.Document)
  }

  function testSendOutboundMessage() {
    var entity = createDocumentEntities()
    _uploadRqService._producerService = Mockito.mock(IMRProducerService)
    _payload = _uploadRqService.generatePayload(entity)
    _uploadRqService.sendOutboundMessage(_payload)
    Mockito.verify(_uploadRqService._producerService).queueMessage(_payload)
    deleteDocument(entity.Document)
  }

  function testSendOutboundMessage_Exception() {
    var entity = createDocumentEntities()
    _uploadRqService._producerService = Mockito.mock(IMRProducerService)
    _payload = _uploadRqService.generatePayload(entity)
    Mockito.doThrow(JMSException).when(_uploadRqService._producerService).queueMessage(_payload)
    assertCausesException(\-> _uploadRqService.sendOutboundMessage(_payload), IMRException)
    deleteDocument(entity.Document)
  }

  function testProcessDocumentOverSizeLimit() {
    var entity: ECFMessageDocumentUploadRq_Ext
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claim = ClaimBuilderHelper.createClaim()
      entity = ECFMessageEntityUtil.createDocumentUploadRq()
      entity.Document = bundle.add(entity.Document)
      entity.Document.IMRFileSizeNum = 25000
      claim.addToLMMessages(entity)
      claim.addToDocuments(entity.Document)
    }, ECFConstants.ECF_SUPER_USER)
    assertCausesException(\-> _uploadRqService.process(entity), IMRException)
  }

  private function createDocumentEntities(): ECFMessageDocumentUploadRq_Ext {
    var entity: ECFMessageDocumentUploadRq_Ext
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claim = ClaimBuilderHelper.createClaim()
      entity = ECFMessageEntityUtil.createDocumentUploadRq()
      claim.addToLMMessages(entity)
      claim.addToDocuments(entity.Document)
      entity.Document = addFileToDocument(entity.Document, ECFMessageUtil.SAMPLE_ATTACHMENT_FILE)
    }, ECFConstants.ECF_SUPER_USER)
    entity = entity.refresh() as ECFMessageDocumentUploadRq_Ext
    _documentUploadEntities.add(entity)
    return entity
  }

  private function addFileToDocument(document: Document, file: File): Document {
    var testInputStream = new FileInputStream(file)
    _documentContentSourcePlugin.addDocument(testInputStream, document)
    return document.refresh() as Document
  }

  private function deleteDocument(document: Document) {
    (_payload?.Attachments?.toList()?.get(1) as AttachmentPart)?.DataHandler?.InputStream?.close()
    _documentContentSourcePlugin.removeDocument(document)
  }

  private function deleteUploadEntity() {

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      for (doc in _documentUploadEntities) {
        doc = doc.refresh() as ECFMessageDocumentUploadRq_Ext
        bundle.delete(doc)
      }
    }, ECFConstants.ECF_SUPER_USER)
  }
}
