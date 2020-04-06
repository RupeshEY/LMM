package gw.acc.iplm.xmlmapper.soap

uses gw.acc.iplm.utils.ACORDMessageConstants
uses gw.acc.iplm.utils.SOAPMessageConstants
uses gw.xml.XmlElement
uses org.xml.sax.InputSource

uses javax.xml.parsers.DocumentBuilderFactory
uses javax.xml.soap.MessageFactory
uses javax.xml.soap.SOAPBodyElement
uses javax.xml.soap.SOAPMessage
uses java.io.ByteArrayInputStream
uses java.nio.charset.StandardCharsets

/**
 * For building SOAPMessage objects which can be sent to an external SOAP endpoint
 */
class SoapMessageBuilder {

  protected var _body: XmlElement
  protected var _header: XmlElement
  protected var _envelope: SOAPMessage

  /**
   * @param body the XML which will make up the Body Part of the SOAP Message
   */
  construct(body: XmlElement) {
    this(body, null)
  }

  /**
   * @param body   the XML which will make up the Body Part of the SOAP Message
   * @param header the XML which will make up the Header Part of the SOAP Message
   */
  construct(body: XmlElement, header: XmlElement) {
    _body = body
    _header = header
    var messageFactory = MessageFactory.newInstance()
    _envelope = messageFactory.createMessage()
    _envelope.MimeHeaders.setHeader(SOAPMessageConstants.SOAP_ACTION, ACORDMessageConstants.ACORD_SOAP_ACTION_VALUE)
    _envelope.SOAPPart.setMimeHeader(SOAPMessageConstants.CONTENT_TRANSFER_ENCODING, ACORDMessageConstants.ACORD_CONTENT_TRANSFER_ENCODING_VALUE)
  }

  /**
   * Creates a SOAPMessage with the XML passed in to the constructor added as the SOAP Body
   *
   * @return the SOAPMessage object
   */
  public function createSoapMessage(): SOAPMessage {
    addBodyContent()
    addHeaderContent()
    return _envelope
  }

  private function addBodyContent() {
    var bodyChildElement = _envelope.SOAPBody.addDocument(convertXmlElementToDocument(_body))
    setSchemaSpecificData(bodyChildElement)
  }

  private function addHeaderContent() {
    if (_header == null) {
      return
    }
    var soapXchaningHeaderDoc = _envelope.SOAPHeader.OwnerDocument
    var xchaningHeaderDoc = convertXmlElementToDocument(_header).FirstChild
    var xchangingHeaderNode = soapXchaningHeaderDoc.importNode(xchaningHeaderDoc, true)
    _envelope.SOAPHeader.appendChild(xchangingHeaderNode)
  }

  private function setSchemaSpecificData(bodyElement: SOAPBodyElement): SOAPBodyElement {
    if (_body.$QName.LocalPart == ACORDMessageConstants.POSTRQ) {
      // Need to override the default namespace with /AcordMsgSvc/Inbox
      bodyElement.addNamespaceDeclaration("", ACORDMessageConstants.NS_POSTRQ)
      // Need to set an alias of 'ac' on the soap element qname
      bodyElement.setElementQName(ACORDMessageConstants.POST_RQ)
    }
    return bodyElement
  }

  private function convertXmlElementToDocument(xml: XmlElement): org.w3c.dom.Document {
    var documentBuilderFactory = DocumentBuilderFactory.newInstance()
    documentBuilderFactory.setNamespaceAware(true)
    var documentBuilder = documentBuilderFactory.newDocumentBuilder()
    return documentBuilder.parse(new InputSource(new ByteArrayInputStream(xml.asUTFString().getBytes(StandardCharsets.UTF_8))))
  }
}