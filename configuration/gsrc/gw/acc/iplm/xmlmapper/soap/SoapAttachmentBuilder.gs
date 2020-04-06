package gw.acc.iplm.xmlmapper.soap

uses gw.acc.iplm.utils.ACORDMessageConstants
uses gw.acc.iplm.utils.SOAPMessageConstants
uses gw.xml.XmlElement

uses javax.activation.DataHandler
uses javax.xml.soap.SOAPMessage

/**
 * Builder for SOAP Attachment Part and attaching them to a SOAPMessage
 */
class SoapAttachmentBuilder {

  protected var _envelope: SOAPMessage

  /**
   * @param envelope the SOAPMessage to attach to
   */
  construct(envelope: SOAPMessage) {
    _envelope = envelope
  }

  /**
   * Attach an XML object to the SOAPMessage passed in constructor
   *
   * @param xml          the XmlElement object
   * @param attachmentId the ID of the attachment, which will be set as Content ID on the attachment part
   * @return the SOAPMessage passed in the constructor with this attachment added
   */
  public function addXmlAttachment(xml: XmlElement, attachmentId: String): SOAPMessage {
    var attachPart = _envelope.createAttachmentPart(xml.asUTFString(), SOAPMessageConstants.ATTACHMENT_CONTENT_TYPE_TEXT_XML)
    attachPart.setContentId("<" + attachmentId + ">")
    attachPart.setMimeHeader(SOAPMessageConstants.CONTENT_TRANSFER_ENCODING, ACORDMessageConstants.ACORD_CONTENT_TRANSFER_ENCODING_VALUE)
    _envelope.addAttachmentPart(attachPart)
    return _envelope
  }

  /**
   * Attach a Document entity to the SOAPMessage passed in constructor. A binary representation of the File associated
   * to the Document entity will be attached to the SOAP Message
   *
   * @param document     the Document entity
   * @param attachmentId the ID of the attachment, which will be set as Content ID on the attachment part
   * @return the SOAPMessage passed in the constructor with this attachment added
   */
  public function addDocumentAttachment(document: Document, attachmentId: String): SOAPMessage {
    var dh = new DataHandler(new DocumentDataSource(document))
    var attachPart = _envelope.createAttachmentPart(dh)
    attachPart.setContentId("<" + attachmentId + ">")
    attachPart.setMimeHeader(SOAPMessageConstants.CONTENT_TRANSFER_ENCODING, ACORDMessageConstants.ACORD_CONTENT_TRANSFER_ENCODING_VALUE)
    _envelope.addAttachmentPart(attachPart)
    return _envelope
  }

}