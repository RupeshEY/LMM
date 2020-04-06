package gw.acc.iplm.security

uses gw.acc.iplm.utils.ECFUtils
uses gw.acc.iplm.xsd.imr.schema_wsdl.oasis_200401_wss_wssecurity_secext_1_0.Security
uses gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.Signature
uses gw.api.util.ConfigAccess
uses gw.testharness.v3.GUnitTestClass

uses javax.xml.soap.SOAPHeaderElement
uses javax.xml.soap.SOAPMessage
uses java.nio.charset.StandardCharsets
uses java.nio.file.Files
uses java.nio.file.Paths

/**
 * This class tests the Message Authentication feature for ECF messages.
 */
class MessageOutboundAuthenticationTest extends GUnitTestClass {
  private var _soapMessage: javax.xml.soap.SOAPMessage
  private var _messageAuthentication: MessageOutboundAuthentication

  final var CLAIM_RETRIEVE_RQ_SOAP_FILE = ConfigAccess.getConfigFile("config/iplm/testresources/claimretrieve/RetrieveClaimRq-SAMPLE-SOAP.xml")

  override function beforeMethod() {
    super.beforeMethod()
    var encoded = Files.readAllBytes(Paths.get(CLAIM_RETRIEVE_RQ_SOAP_FILE.toURI()))
    var messageString = new String(encoded, StandardCharsets.UTF_8)
    _soapMessage = ECFUtils.createSoapMessageFromXML(messageString)
    _messageAuthentication = new MessageOutboundAuthentication()
  }

  function testX509SerialNumber() {
    final var expectedX509SerialNumber = "988395405"
    var signedSoapMessage = _messageAuthentication.signSoapMessage(_soapMessage)
    var x509SerialNumber = signedSoapMessage.SOAPHeader.ChildNodes.item(0).ChildNodes.item(0).ChildNodes.item(2).ChildNodes.item(0).ChildNodes.item(0).ChildNodes.item(0).ChildNodes.item(1)
    assertEquals(expectedX509SerialNumber, x509SerialNumber.TextContent)
  }

  function testSignSoapMessage() {
    var signedSoapMessage = _messageAuthentication.signSoapMessage(_soapMessage)
    var signedSoapMessageString = ECFUtils.logSoapMessageString(signedSoapMessage)
    assertFalse("InclusiveNamespaces is added", signedSoapMessageString.contains("InclusiveNamespaces"))
    assertSignature(signedSoapMessage)
  }

  private function assertSignature(envelope: SOAPMessage) {
    var securityHeader = (envelope.SOAPHeader.getChildElements(Security.$QNAME).next() as SOAPHeaderElement)
    var signatureHeader = securityHeader?.getChildElements(Signature.$QNAME).next()

    assertNotNull("Envelope should have a signature", signatureHeader)
  }

}