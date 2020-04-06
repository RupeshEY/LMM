package gw.acc.iplm.services.message.imr

uses gw.acc.iplm.exception.imr.IMRException
uses gw.acc.iplm.jms.producer.IMRProducerService
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRq
uses gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.PostRq
uses gw.acc.iplm.xsd.imr.schema_wsdl.oasis_200401_wss_wssecurity_secext_1_0.Security
uses gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.Signature
uses gw.testharness.v3.GUnitTestClass
uses org.mockito.Mockito

uses javax.jms.JMSException
uses javax.xml.soap.AttachmentPart
uses javax.xml.soap.SOAPHeaderElement

class IMRDocumentSearchRqServiceTest extends GUnitTestClass {

  private static var _searchRqService: IMRDocumentSearchRqService

  function beforeMethod() {
    super.beforeMethod()
    _searchRqService = new IMRDocumentSearchRqService()
  }

  function testGeneratePayloadIntegration() {
    var entity = ECFMessageEntityUtil.createDocumentSearchRq()
    var payload = _searchRqService.generatePayload(entity)

    assertNotNull("SOAP Message was not created", payload)
    assertNotNull("SOAP Body was not created", payload.SOAPBody)
    assertEquals("binary", payload.SOAPPart.getMimeHeader("Content-Transfer-Encoding").first())

    var postRqResult = payload.SOAPBody.getChildElements(PostRq.$QNAME).next() as javax.xml.soap.SOAPBodyElement
    assertNotNull(postRqResult)
    assertEquals("http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", postRqResult.ElementQName.NamespaceURI)
    assertEquals("PostRq", postRqResult.ElementQName.LocalPart)
    assertEquals("ac", postRqResult.ElementQName.Prefix)
    assertEquals("http://www.ACORD.org/Standards/AcordMsgSvc/Inbox", postRqResult.getNamespaceURI(""))
    var attachment = payload.Attachments.toList().first() as AttachmentPart
    var repositorySearchRequest = RepositoryOperationRq.parse(attachment.getRawContentBytes())
    assertNotNull(repositorySearchRequest)
  }

  function testSignPayload() {
    var entity = ECFMessageEntityUtil.createDocumentSearchRq()
    var payload = _searchRqService.generatePayload(entity)
    payload = _searchRqService.signPayload(payload)

    var securityHeader = (payload.SOAPHeader.getChildElements(Security.$QNAME).next() as SOAPHeaderElement)
    var signatureHeader = securityHeader?.getChildElements(Signature.$QNAME).next()

    assertNotNull("Envelope should have a signature", signatureHeader)
  }

  function testSendOutboundMessage() {
    var docSearchMessage = ECFMessageEntityUtil.createDocumentSearchRq()
    _searchRqService._producerService = Mockito.mock(IMRProducerService)
    var soapMessage = _searchRqService.generatePayload(docSearchMessage)
    _searchRqService.sendOutboundMessage(soapMessage)
    Mockito.verify(_searchRqService._producerService).queueMessage(soapMessage)
  }

  function testSendOutboundMessage_Exception() {
    var docSearchMessage = ECFMessageEntityUtil.createDocumentSearchRq()
    _searchRqService._producerService = Mockito.mock(IMRProducerService)
    var soapMessage = _searchRqService.generatePayload(docSearchMessage)
    Mockito.doThrow(JMSException).when(_searchRqService._producerService).queueMessage(soapMessage)
    assertCausesException(\-> _searchRqService.sendOutboundMessage(soapMessage), IMRException)
  }

}