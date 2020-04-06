package gw.acc.iplm.utils

uses gw.xsd.w3c.soap11_envelope.Envelope

uses javax.xml.namespace.QName

/**
 * Constants related to SOAP Message Standard
 */
class SOAPMessageConstants {

  //Namespaces
  public final static var QN_SOAP_ENVELOPE: String = "http://schemas.xmlsoap.org/soap/envelope/"
  public final static var SOAP_ENVELOPE_QNAME_LP: String = Envelope.$QNAME.LocalPart

  //Qualified Names
  public final static var SOAP_BODY: QName = new QName(QN_SOAP_ENVELOPE, "Body")

  //MIME Headers
  public static final var CONTENT_TRANSFER_ENCODING: String = "Content-Transfer-Encoding"
  public static final var SOAP_ACTION: String = "SOAPAction"

  //Attachments
  public final static var ATTACHMENT_CONTENT_TYPE_TEXT_XML: String = "text/xml"
  public final static var ATTACHMENT_COMMUNICATION_CHANNEL: String = "in_stream"

}