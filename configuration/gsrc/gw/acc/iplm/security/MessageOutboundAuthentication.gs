package gw.acc.iplm.security


uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.ECFUtils
uses org.apache.wss4j.common.WSEncryptionPart
uses org.apache.wss4j.common.crypto.CryptoFactory
uses org.apache.wss4j.common.crypto.Merlin
uses org.apache.wss4j.dom.WSConstants
uses org.apache.wss4j.dom.WSSConfig
uses org.apache.wss4j.dom.message.WSSecHeader
uses org.apache.wss4j.dom.message.WSSecSignature

uses javax.xml.soap.SOAPMessage
uses javax.xml.transform.dom.DOMSource
uses java.io.ByteArrayInputStream
uses java.security.KeyStore
uses java.security.cert.X509Certificate


/**
 * This class takes care of authenticating messages by creating a signature out of the message payload using
 * the PKI provided certificates and then putting the signature on the actual message as part of the header.
 */
class MessageOutboundAuthentication {

  private static final var LOGGER = ECFConstants.LOGGER_BLOCK()
  private var _keyStore: KeyStore as KeyStore
  private var _certificate: X509Certificate as Certificate

  //Crypto interface standard implementation, based around two JDK keystores for key/cert retrieval, and trust verification.
  private static final var CRYPTO_INTERFACE_IMPLEMENTATION = "org.apache.ws.security.components.crypto.Merlin"
  //WSS4J specific provider used to create Crypto instances
  private static final var WSS4J_PROVIDER = "org.apache.ws.security.crypto.provider"

  construct() {
    initializeCryptoWithKeystore()
  }

  /**
   * This function initializes the certificate and private key by examining the keystore on the configured path.
   * Further configuration is needed in the form of setting the keystore password and alias for certificate and private
   * key as well as the private key password if needed. All of these configurations can be found on ECFConstants.
   *
   * @see ECFConstants
   */
  private function initializeCryptoWithKeystore() {
    _keyStore = new ECFKeystoreLoader().KeyStore
    _certificate = _keyStore.getCertificate(ECFConstants.CERTIFICATE_ALIAS) as X509Certificate
  }

  /**
   * This function signs the provided SOAPMessage object with the certificate and public/private key pairs configured in this
   * class. It appends a Signature element to the document root which will contain an encrypted digest for the provided
   * SOAPMessage object, using the private key of this system, for the purposes of message authentication and integrity.
   *
   * @param SOAPMessage the soap message request targeted for signing
   * @return SOAPMessage the signed soap message
   * @throws will throw Exception if the signature is not valid
   */
  public function signSoapMessage(message: SOAPMessage): SOAPMessage {
    var wssSignature = new WSSecSignature(WSSConfig.getNewInstance())
    wssSignature.setX509Certificate(_certificate)
    wssSignature.setUserInfo(ECFConstants.CERTIFICATE_ALIAS, ECFConstants.KEYSTORE_PASSWORD)
    wssSignature.setUseSingleCertificate(true)
    wssSignature.setKeyIdentifierType(WSConstants.ISSUER_SERIAL)
    wssSignature.WsConfig.AddInclusivePrefixes = false
    try {
      var document = ECFUtils.convertSoapMessageToDocument(message)
      var secHeader = new WSSecHeader()
      secHeader.insertSecurityHeader(document)

      var parts = Collections.singletonList(new WSEncryptionPart(WSConstants.ELEM_BODY, WSConstants.URI_SOAP11_ENV, ""))
      wssSignature.setParts(parts)

      var properties = new Properties()
      properties.setProperty(WSS4J_PROVIDER, CRYPTO_INTERFACE_IMPLEMENTATION)
      var crypto = CryptoFactory.getInstance(properties)
      (crypto as Merlin).setKeyStore(_keyStore)
      crypto.loadCertificate(new ByteArrayInputStream(_certificate.getEncoded()))

      document = wssSignature.build(document, crypto, secHeader)
      var resultSoapMessage = updateSOAPMessage(document, message)
      return resultSoapMessage
    } catch (e: Exception) {
      LOGGER.error("Error when trying to sign the message ", e)
      throw e
    }
  }

  /**
   * Update soap message.
   *
   * @param doc     the source document to update soap message from
   * @param message the soap message to update
   * @return SOAPMessage the updated soap message
   */
  private function updateSOAPMessage(doc: org.w3c.dom.Document, message: SOAPMessage): SOAPMessage {
    var domSource = new DOMSource(doc)
    message.getSOAPPart().setContent(domSource)
    return message
  }
}