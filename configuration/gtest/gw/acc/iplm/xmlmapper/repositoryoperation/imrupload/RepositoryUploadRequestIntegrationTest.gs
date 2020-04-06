package gw.acc.iplm.xmlmapper.repositoryoperation.imrupload

uses gw.acc.iplm.security.MessageOutboundAuthentication
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.xmlmapper.repositoryoperation.PostRqMapper
uses gw.acc.iplm.xmlmapper.repositoryoperation.RepositoryOperationRqMapperFactory
uses gw.acc.iplm.xmlmapper.soap.SoapAttachmentBuilder
uses gw.acc.iplm.xmlmapper.soap.SoapMessageBuilder
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRq
uses gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.PostRq
uses gw.acc.iplm.xsd.imr.schema_wsdl.oasis_200401_wss_wssecurity_secext_1_0.Security
uses gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.Signature
uses gw.plugin.Plugins
uses gw.plugin.document.IDocumentContentSourceBase
uses gw.testharness.v3.GUnitTestClass
uses org.apache.commons.io.IOUtils

uses javax.xml.soap.AttachmentPart
uses javax.xml.soap.SOAPHeaderElement
uses javax.xml.soap.SOAPMessage
uses java.io.ByteArrayInputStream
uses java.io.ByteArrayOutputStream
uses java.io.File
uses java.io.FileInputStream

class RepositoryUploadRequestIntegrationTest extends GUnitTestClass {

  private static final var LOGGER = ECFConstants.LOGGER_BLOCK()
  private static var _documentContentSourcePlugin: IDocumentContentSourceBase
  private var _document: Document

  function beforeClass() {
    super.beforeClass()
    _documentContentSourcePlugin = Plugins.get("IDocumentContentSource") as IDocumentContentSourceBase
  }

  override function afterMethod(t: Throwable) {
    super.afterMethod(t)
    deleteDocument()
  }

  function testSoapEnvelopeCreated() {
    var documentUploadEntity = createDocumentEntities()
    var repositoryOperationRqMapper = new RepositoryOperationRqMapperFactory().getMapper(documentUploadEntity)
    var repositoryOperationRq = repositoryOperationRqMapper.createRepositoryOperationRq()
    var postRqMapper = new PostRqMapper(repositoryOperationRq)
    var postRq = postRqMapper.createPostRq()
    var soapEnvelopeBuilder = new SoapMessageBuilder(postRq)
    var envelope = soapEnvelopeBuilder.createSoapMessage()
    var soapAttachmentBuilder = new SoapAttachmentBuilder(envelope)
    envelope = soapAttachmentBuilder.addXmlAttachment(repositoryOperationRq, postRq.WorkFolder.MsgFile.FileId.substring(4))
    envelope = soapAttachmentBuilder.addDocumentAttachment(_document, _document.Name)
    envelope = new MessageOutboundAuthentication().signSoapMessage(envelope)

    //Uncomment this to see string of the output SOAP message. Note this will cause the test assertFileBinary() to fail due to using the same InputStream
    //LOGGER.info(ECFUtils.logSoapMessageString(envelope))
    assertEnvelope(envelope)
    assertPostRq(envelope)
    assertRepositoryOperation(envelope)
    assertFileBinary(envelope)
    assertSignature(envelope)
  }

  private function assertEnvelope(envelope: SOAPMessage) {
    assertNotNull("SOAP Message was not created", envelope)
    assertNotNull("SOAP Body was not created", envelope.SOAPBody)
    assertEquals("binary", envelope.SOAPPart.getMimeHeader("Content-Transfer-Encoding").first())
  }

  private function assertPostRq(envelope: SOAPMessage) {
    var postRqResult = envelope.SOAPBody.getChildElements(PostRq.$QNAME).next() as javax.xml.soap.SOAPBodyElement
    assertNotNull(postRqResult)
    assertEquals("http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", postRqResult.ElementQName.NamespaceURI)
    assertEquals("PostRq", postRqResult.ElementQName.LocalPart)
    assertEquals("ac", postRqResult.ElementQName.Prefix)
    assertEquals("http://www.ACORD.org/Standards/AcordMsgSvc/Inbox", postRqResult.getNamespaceURI(""))
  }

  private function assertRepositoryOperation(envelope: SOAPMessage) {
    var attachments = envelope.Attachments.toList()

    var businessAttachment = attachments.first() as AttachmentPart
    var repositorySearchRequest = RepositoryOperationRq.parse(businessAttachment.getRawContentBytes())
    assertNotNull(repositorySearchRequest)
  }

  private function assertFileBinary(envelope: SOAPMessage) {
    var attachments = envelope.Attachments.toList()
    var fileAttachment = attachments.get(1) as AttachmentPart
    var fileBinary = Base64.Encoder.encode(IOUtils.toByteArray(fileAttachment.DataHandler.InputStream))
    fileAttachment.DataHandler.InputStream.close()
    assertNotNull("Unable to retrieve file binary attachement", fileBinary)

    var decodedBytes = Base64.MimeDecoder.decode(fileBinary)
    var file = new ByteArrayInputStream(decodedBytes)
    assertNotNull("Unable to decode file binary", file)
  }

  private function assertSignature(envelope: SOAPMessage) {
    var securityHeader = (envelope.SOAPHeader.getChildElements(Security.$QNAME).next() as SOAPHeaderElement)
    var signatureHeader = securityHeader?.getChildElements(Signature.$QNAME).next()

    assertNotNull("Envelope should have a signature", signatureHeader)
  }

  private function createDocumentEntities(): ECFMessageDocumentUploadRq_Ext {
    var documentUploadEntity = ECFMessageEntityUtil.createDocumentUploadRq()
    _document = documentUploadEntity.Document
    _document = addFileToDocument(_document, ECFMessageUtil.SAMPLE_ATTACHMENT_FILE)
    return documentUploadEntity
  }

  private function printEnvelopeXml(envelope: SOAPMessage) {
    var out = new ByteArrayOutputStream()
    envelope.writeTo(out)
    LOGGER.info(new String(out.toByteArray()))
  }

  private function addFileToDocument(document: Document, file: File): Document {
    var testInputStream = new FileInputStream(file)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      document = bundle.add(document)
      _documentContentSourcePlugin.addDocument(testInputStream, document)
    }, ECFConstants.ECF_SUPER_USER)

    return document.refresh() as Document
  }

  private function deleteDocument() {
    var docContentSource = Plugins.get("IDocumentContentSource") as IDocumentContentSourceBase
    docContentSource.removeDocument(_document)
  }
}