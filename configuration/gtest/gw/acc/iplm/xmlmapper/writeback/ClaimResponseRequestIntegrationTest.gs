package gw.acc.iplm.xmlmapper.writeback

uses gw.acc.iplm.security.MessageOutboundAuthentication
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.ECFMessageConstants
uses gw.acc.iplm.utils.ECFUtils
uses gw.acc.iplm.xmlmapper.soap.SoapMessageBuilder
uses gw.acc.iplm.xmlmapper.xchanging.XchangingheaderMapper
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.ClaimResponseRq
uses gw.acc.iplm.xsd.imr.schema_wsdl.oasis_200401_wss_wssecurity_secext_1_0.Security
uses gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.Signature
uses gw.acc.iplm.xsd.wb_header_1_0.Xchangingheader
uses gw.testharness.v3.GUnitTestClass

uses javax.xml.soap.SOAPHeaderElement
uses javax.xml.soap.SOAPMessage

class ClaimResponseRequestIntegrationTest extends GUnitTestClass {

  private static final var LOGGER = ECFConstants.LOGGER_BLOCK()

  function testSoapEnvelopeCreated() {
    var claimResponseEntity = ECFMessageEntityUtil.createClaimResponseRq()
    var claimResponseRqMapper = new ClaimResponseRqMapperFactory().getMapper(claimResponseEntity)
    var claimResponseRq = claimResponseRqMapper.createClaimResponseRq()

    var xchangingHeaderMapper = new XchangingheaderMapper(claimResponseRq.Insurer.Party.FirstId,
        claimResponseRq.ServiceProvider.Party.FirstId, claimResponseRq.CreationDate,
        ECFMessageConstants.CLAIMRESPONSE_HEADER_TYPE, claimResponseRq.UUId)
    var xchangingheader = xchangingHeaderMapper.createXchangingheader()

    var soapEnvelopeBuilder = new SoapMessageBuilder(claimResponseRq, xchangingheader)
    var envelope = soapEnvelopeBuilder.createSoapMessage()
    envelope = new MessageOutboundAuthentication().signSoapMessage(envelope)

    LOGGER.info(ECFUtils.logSoapMessageString(envelope))

    assertClaimResponseRq(envelope)
    assertXchangingheader(envelope)
    assertSignature(envelope)
  }

  private function assertClaimResponseRq(envelope: SOAPMessage) {
    assertNotNull("SOAP Message was not created", envelope)
    assertNotNull("SOAP Body was not created", envelope.SOAPBody)
    var claimResponseRqResult = envelope.SOAPBody?.getChildElements(ClaimResponseRq.$QNAME)?.next() as javax.xml.soap.SOAPBodyElement
    assertNotNull("ClaimResponseRq not added to SOAP Body ", claimResponseRqResult)
  }

  private function assertXchangingheader(envelope: SOAPMessage) {
    assertNotNull("SOAP Header was not created", envelope.SOAPHeader)
    var xchaningHeaderResult = envelope.SOAPHeader?.getChildElements(Xchangingheader.$QNAME)?.next() as javax.xml.soap.SOAPBodyElement
    assertNotNull("Xchangingheader not added to SOAP Header", xchaningHeaderResult)
  }

  private function assertSignature(envelope: SOAPMessage) {
    var securityHeader = (envelope.SOAPHeader.getChildElements(Security.$QNAME).next() as SOAPHeaderElement)
    var signatureHeader = securityHeader?.getChildElements(Signature.$QNAME).next()

    assertNotNull("Envelope should have a signature", signatureHeader)
  }
}