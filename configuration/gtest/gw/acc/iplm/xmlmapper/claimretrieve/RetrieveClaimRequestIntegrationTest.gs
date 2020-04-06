package gw.acc.iplm.xmlmapper.claimretrieve

uses gw.acc.iplm.security.MessageOutboundAuthentication
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.ECFMessageConstants
uses gw.acc.iplm.utils.ECFUtils
uses gw.acc.iplm.xmlmapper.soap.SoapMessageBuilder
uses gw.acc.iplm.xmlmapper.xchanging.XchangingheaderMapper
uses gw.acc.iplm.xsd.imr.schema_wsdl.oasis_200401_wss_wssecurity_secext_1_0.Security
uses gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.Signature
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq
uses gw.acc.iplm.xsd.wb_header_1_0.Xchangingheader
uses gw.testharness.v3.GUnitTestClass

uses javax.xml.soap.SOAPHeaderElement
uses javax.xml.soap.SOAPMessage

class RetrieveClaimRequestIntegrationTest extends GUnitTestClass {

  private static final var LOGGER = ECFConstants.LOGGER_BLOCK()

  function testSoapEnvelopeCreated() {
    var claimRetrieveEntity = ECFMessageEntityUtil.createClaimRetrieveRq()
    var retrieveClaimRqMapper = new RetrieveClaimRqMapper(claimRetrieveEntity)
    var retrieveClaimRq = retrieveClaimRqMapper.createRetrieveClaimRq()

    var xchangingHeaderMapper = new XchangingheaderMapper(retrieveClaimRq.Insurer.Party.FirstId,
        retrieveClaimRq.ServiceProvider.Party.FirstId, retrieveClaimRq.CreationDate,
        ECFMessageConstants.CLAIMRETRIEVE_HEADER_TYPE, retrieveClaimRq.UUId)
    var xchangingheader = xchangingHeaderMapper.createXchangingheader()

    var soapEnvelopeBuilder = new SoapMessageBuilder(retrieveClaimRq, xchangingheader)
    var envelope = soapEnvelopeBuilder.createSoapMessage()
    envelope = new MessageOutboundAuthentication().signSoapMessage(envelope)

    LOGGER.info(ECFUtils.logSoapMessageString(envelope))

    assertRetrieveClaimRq(envelope)
    assertXchangingheader(envelope)
    assertSignature(envelope)
  }

  private function assertRetrieveClaimRq(envelope: SOAPMessage) {
    assertNotNull("SOAP Message was not created", envelope)
    assertNotNull("SOAP Body was not created", envelope.SOAPBody)
    var retrieveClaimRqResult = envelope.SOAPBody.getChildElements(RetrieveClaimRq.$QNAME).next() as javax.xml.soap.SOAPBodyElement
    assertNotNull("RetrieveClaimRq not added to SOAP Body ", retrieveClaimRqResult)
  }

  private function assertXchangingheader(envelope: SOAPMessage) {
    assertNotNull("SOAP Header was not created", envelope.SOAPHeader)
    var xchaningHeaderResult = envelope.SOAPHeader.getChildElements(Xchangingheader.$QNAME).next() as javax.xml.soap.SOAPBodyElement
    assertNotNull("Xchangingheader not added to SOAP Header", xchaningHeaderResult)
  }

  private function assertSignature(envelope: SOAPMessage) {
    var securityHeader = (envelope.SOAPHeader.getChildElements(Security.$QNAME).next() as SOAPHeaderElement)
    var signatureHeader = securityHeader?.getChildElements(Signature.$QNAME).next()

    assertNotNull("Envelope should have a signature", signatureHeader)
  }

}