package gw.acc.iplm.xmlmapper.repositoryoperation.imrsearch

uses gw.acc.iplm.security.MessageOutboundAuthentication
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.ECFUtils
uses gw.acc.iplm.xmlmapper.repositoryoperation.PostRqMapper
uses gw.acc.iplm.xmlmapper.repositoryoperation.RepositoryOperationRqMapperFactory
uses gw.acc.iplm.xmlmapper.soap.SoapAttachmentBuilder
uses gw.acc.iplm.xmlmapper.soap.SoapMessageBuilder
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRq
uses gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.PostRq
uses gw.acc.iplm.xsd.imr.schema_wsdl.oasis_200401_wss_wssecurity_secext_1_0.Security
uses gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.Signature
uses gw.testharness.v3.GUnitTestClass

uses javax.xml.soap.AttachmentPart
uses javax.xml.soap.SOAPHeaderElement
uses javax.xml.soap.SOAPMessage

class RepositorySearchRequestIntegrationTest extends GUnitTestClass {

  private static final var LOGGER = ECFConstants.LOGGER_BLOCK()

  function testSoapEnvelopeCreated() {
    var documentSearchEntity = ECFMessageEntityUtil.createDocumentSearchRq()
    var repositoryOperationRqMapper = new RepositoryOperationRqMapperFactory().getMapper(documentSearchEntity)
    var repositoryOperationRq = repositoryOperationRqMapper.createRepositoryOperationRq()
    var postRqMapper = new PostRqMapper(repositoryOperationRq)
    var postRq = postRqMapper.createPostRq()
    var soapEnvelopeBuilder = new SoapMessageBuilder(postRq)
    var envelope = soapEnvelopeBuilder.createSoapMessage()
    var soapAttachmentBuilder = new SoapAttachmentBuilder(envelope)
    envelope = soapAttachmentBuilder.addXmlAttachment(repositoryOperationRq, postRq.WorkFolder.MsgFile.FileId.substring(4))
    envelope = new MessageOutboundAuthentication().signSoapMessage(envelope)

    LOGGER.info(ECFUtils.logSoapMessageString(envelope))

    assertNotNull("SOAP Message was not created", envelope)
    assertNotNull("SOAP Body was not created", envelope.SOAPBody)
    assertEquals("binary", envelope.SOAPPart.getMimeHeader("Content-Transfer-Encoding").first())

    var postRqResult = envelope.SOAPBody.getChildElements(PostRq.$QNAME).next() as javax.xml.soap.SOAPBodyElement
    assertNotNull(postRqResult)
    assertEquals("http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", postRqResult.ElementQName.NamespaceURI)
    assertEquals("PostRq", postRqResult.ElementQName.LocalPart)
    assertEquals("ac", postRqResult.ElementQName.Prefix)
    assertEquals("http://www.ACORD.org/Standards/AcordMsgSvc/Inbox", postRqResult.getNamespaceURI(""))
    var attachment = envelope.Attachments.toList().first() as AttachmentPart
    var repositorySearchRequest = RepositoryOperationRq.parse(attachment.getRawContentBytes())
    assertNotNull(repositorySearchRequest)
    assertSignature(envelope)
  }

  private function assertSignature(envelope: SOAPMessage) {
    var securityHeader = (envelope.SOAPHeader.getChildElements(Security.$QNAME).next() as SOAPHeaderElement)
    var signatureHeader = securityHeader?.getChildElements(Signature.$QNAME).next()

    assertNotNull("Envelope should have a signature", signatureHeader)
  }
}