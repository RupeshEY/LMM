package gw.acc.iplm.testutils

uses gw.acc.iplm.utils.ACORDMessageConstants
uses gw.acc.iplm.utils.ECFUtils
uses gw.acc.iplm.utils.SOAPMessageConstants
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRs
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.enums.RepositoryOperationTypeCdType
uses gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.Application
uses gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.MsgItem
uses gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.PostRq
uses gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.Receiver
uses gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.Sender
uses gw.xml.XmlElement
uses gw.xml.date.XmlDateTime
uses org.w3c.dom.Node

uses javax.activation.DataHandler
uses javax.xml.parsers.DocumentBuilderFactory
uses javax.xml.soap.MessageFactory
uses javax.xml.soap.SOAPMessage
uses javax.xml.transform.TransformerFactory
uses javax.xml.transform.dom.DOMSource
uses javax.xml.transform.stream.StreamResult
uses java.io.ByteArrayOutputStream
uses java.io.File
uses java.io.StringWriter

/**
 * XML Helper functions for parsing and replacing XML values in ECF tests
 */
final class XmlHelperUtil {

  /**
   * Location under xchangingheader of the Sender element
   */
  public final static var SENDER_HEADER_LOCATION: int = 1
  /**
   * Location under xchangingheader of the Receiver element
   */
  public final static var RECEIVER_HEADER_LOCATION: int = 3
  /**
   * Location under xchangingheader of the MsgTypeCd element
   */
  public final static var MSG_TYPE_HEADER_LOCATION: int = 5
  /**
   * Location under xchangingheader of the RequestUUId element
   */
  public final static var UUID_HEADER_LOCATION: int = 9

  /**
   * Change a Party Id value in the XML header.
   * For example in ClaimNotifyEventRq xml the Sender element has a Party which has an Id.
   *
   * @param file            The XML file
   * @param elementLocation which of the elements under xchangingheader to change the Id<br>
   *                        ie Sender is '1' Receiver is '3'
   * @param invalidValue    the value to change the id to
   * @return the edited XML as a String
   */
  public static function getXmlWithInvalidPartyIdInHeader(file: File, elementLocation: int, invalidValue: String): String {
    var doc = getXmlDocument(file)
    var idElement = getPartyIdHeaderFromDoc(elementLocation, doc)
    idElement.setNodeValue(invalidValue)
    return getXmlStringFromDoc(doc)
  }

  /**
   * @param elementLocation
   * @param doc
   * @return
   */
  public static function getPartyIdHeaderFromDoc(elementLocation: int, doc: org.w3c.dom.Document): org.w3c.dom.Node {
    var child = getHeaderElementAtLocation(doc, elementLocation)
    return getPartyIdNode(child)
  }

  /**
   * Change a value in the XML header.
   * For example in ClaimNotifyEventRq xml the MsgTypeCd element
   *
   * @param file            The XML file
   * @param elementLocation which of the elements under xchangingheader to change the value of
   * @param invalidValue    the value to change the value to
   * @return the edited XML as a String
   */
  public static function getXmlWithInvalidHeaderElement(file: File, elementLocation: int, invalidValue: String): String {
    var doc = getXmlDocument(file)
    var element = getHeaderElementAtLocation(doc, elementLocation)
    element.FirstChild.setNodeValue(invalidValue)
    return getXmlStringFromDoc(doc)
  }

  /**
   * Transform a {@link File} into a {@link org.w3c.dom.Document}
   *
   * @param file the file to transform
   * @return the org.w3c.dom.Document
   */
  public static function getXmlDocument(file: File): org.w3c.dom.Document {
    var docFactory = DocumentBuilderFactory.newInstance()
    var docBuilder = docFactory.newDocumentBuilder()
    return docBuilder.parse(file)
  }

  /**
   * Get a particular header element from a xml document
   *
   * @param doc   the xml file as a {@link org.w3c.dom.Document}
   * @param index location of header to get
   * @return the element as a {@link Node}
   */
  public static function getHeaderElementAtLocation(doc: org.w3c.dom.Document, index: int): Node {
    var header = doc.FirstChild.getChildNodes().item(1)
    var xchangingheader = header.getChildNodes().item(1)
    var element = xchangingheader.getChildNodes().item(index)
    return element
  }

  /**
   * Pass in a Sender or Receiver header {@link Node} to get the Id {@link Node}
   *
   * @param parent the parent {@link Node}
   * @return the Id {@link Node}
   */
  public static function getPartyIdNode(parent: org.w3c.dom.Node): org.w3c.dom.Node {
    var party = parent.FirstChild.NextSibling
    var idNode = party.FirstChild.NextSibling
    var id = idNode.FirstChild
    return id
  }

  /**
   * Transforms a {@link org.w3c.dom.Document} to a String
   *
   * @param doc the document to transform
   * @return the content of the document as a string
   */
  public static function getXmlStringFromDoc(doc: org.w3c.dom.Document): String {
    var domSource = new DOMSource(doc)
    var writer = new StringWriter()
    var result = new StreamResult(writer)
    var tf = TransformerFactory.newInstance()
    var transformer = tf.newTransformer()
    transformer.transform(domSource, result)
    return writer.toString()
  }

  public static function createSoapMessageRequest(xmlElement: XmlElement, postRq: PostRq, file: File, repositoryOperationType: RepositoryOperationTypeCdType, encodingType: String): SOAPMessage {
    try {
      var messageFactory = MessageFactory.newInstance()
      var message = messageFactory.createMessage()
      message.MimeHeaders.setHeader(SOAPMessageConstants.SOAP_ACTION, ACORDMessageConstants.ACORD_SOAP_ACTION_VALUE)
      message.SOAPPart.setMimeHeader(SOAPMessageConstants.CONTENT_TRANSFER_ENCODING, ACORDMessageConstants.ACORD_CONTENT_TRANSFER_ENCODING_VALUE)

      //add Acord message equals RepositoryOperationRq Object
      addAcordMessagePart(message, xmlElement, postRq.getWorkFolder().getMsgFile().getFileFormatCd(), postRq.getWorkFolder().getMsgFile().getFileId())

      if (repositoryOperationType == RepositoryOperationTypeCdType.RepositoryDownload and file != null) {
        addFileAttachment(message, file, encodingType)
      }

      addMessageBodyData(message, postRq)
      message.saveChanges()
      return message
    } catch (exception: Exception) {
      throw exception
    }
  }

  /**
   * This function will add object xml representation to SOAP body.
   *
   * @param SOAPMessage representing the SOAP request message
   * @param XmlElement  representing any object to be attached.
   */
  private static function addMessageBodyData(soapMessage: SOAPMessage, xmlElement: XmlElement) {
    var soapPart = soapMessage.getSOAPPart()
    var envelope = soapPart.getEnvelope()
    var body = envelope.getBody()
    var bodyChildElement = body.addDocument(ECFUtils.convertXmlStringToDocument(xmlElement.asUTFString()))
    bodyChildElement.addNamespaceDeclaration("", ACORDMessageConstants.NS_POSTRQ)
    bodyChildElement.setElementQName(ACORDMessageConstants.POST_RQ)
  }

  private static function addAcordMessagePart(soapMessage: SOAPMessage, xmlElement: XmlElement, contentType: String, contentId: String): SOAPMessage {
    var attachPart = soapMessage.createAttachmentPart(xmlElement.asUTFString(), contentType)
    attachPart.setContentId("<" + contentId.substring(4) + ">")
    attachPart.setMimeHeader(SOAPMessageConstants.CONTENT_TRANSFER_ENCODING, ACORDMessageConstants.ACORD_CONTENT_TRANSFER_ENCODING_VALUE)
    soapMessage.addAttachmentPart(attachPart)

    return soapMessage
  }

  private static function addFileAttachment(soapMessage: SOAPMessage, file: File, encodingType: String): SOAPMessage {
    //Adding the attachment
    var attachmentFileUrl = file.toURI().toURL()
    var handler = new DataHandler(attachmentFileUrl)
    var attachPart = soapMessage.createAttachmentPart(handler)
    attachPart.setContentId("<" + file.getName() + ">")
    attachPart.setMimeHeader(SOAPMessageConstants.CONTENT_TRANSFER_ENCODING, encodingType)
    soapMessage.addAttachmentPart(attachPart)

    return soapMessage
  }

  public static function createDocumentDownloadloadPostRq(repositoryOperationRs: RepositoryOperationRs, fileName: String): PostRq {
    var postRq = new PostRq()

    postRq.setSender(getSender(repositoryOperationRs.getSender().getPartyId(), repositoryOperationRs.getSender().getPartyRoleCd()))
    postRq.setReceiver(getReceiver(repositoryOperationRs.getReceiver().getPartyId(), "Reinsurer"))
    postRq.setApplication(getApplication("ACORD-Repository", "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0"))

    postRq.setTimeStamp(new XmlDateTime())
    postRq.setMsgItem(getMsgItem(repositoryOperationRs.getMsgId(), "RepositoryOperation"))

    var workFolder = new gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.WorkFolder()
    var msgFile = new gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.MsgFile()
    msgFile.setFileId("cid:" + UUID.randomUUID().toString())
    msgFile.setFileFormatCd("text/xml")
    workFolder.setMsgFile(msgFile)

    var attachmentPackages = new gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.AttachmentPackages()
    var attachmentPackageList = new ArrayList<gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.AttachmentPackage>()
    var attachmentPackage = new gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.AttachmentPackage()
    attachmentPackage.setCommunicationChannelCd("in_stream")
    attachmentPackage.setFileId(fileName)

    var attachments = new gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.Attachments()
    var attachmentList = new ArrayList<gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.Attachment>()

    var attachment = new gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.Attachment()
    var document = new gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.Document()
    document.setDocumentId(repositoryOperationRs.getDocumentList().get(0).getDocumentItem().get(0).getDocument().getDocumentId())
    attachment.setDocument(document)
    attachmentList.add(attachment)

    attachments.setAttachment(attachmentList)

    attachmentPackage.setAttachments(attachments)
    attachmentPackageList.add(attachmentPackage)
    attachmentPackages.setAttachmentPackage(attachmentPackageList)

    workFolder.setAttachmentPackages(attachmentPackages)
    postRq.setWorkFolder(workFolder)

    return postRq
  }

  private static function getSender(partyId: String, partyRoleCd: String): Sender {
    var sender = new Sender()
    sender.setPartyId(partyId)
    sender.setPartyRoleCd(partyRoleCd)
    return sender
  }

  private static function getReceiver(partyId: String, partyRoleCd: String): Receiver {
    var receiver = new Receiver()
    receiver.setPartyId(partyId)
    receiver.setPartyRoleCd(partyRoleCd)
    return receiver
  }

  private static function getApplication(applicationCd: String, schemaVersion: String): Application {
    var msgApplication = new Application()
    msgApplication.setApplicationCd(applicationCd)
    msgApplication.setSchemaVersion(schemaVersion)
    return msgApplication
  }

  private static function getMsgItem(msgId: String, msgTypeCd: String): MsgItem {
    var msgItem = new MsgItem()
    msgItem.setMsgId(msgId)
    msgItem.setMsgTypeCd(msgTypeCd)
    return msgItem
  }

  public static function logSoapMessageString(soapMessage: SOAPMessage): String {
    var outputStream = new ByteArrayOutputStream()
    soapMessage.writeTo(outputStream)
    var messageXml = new String(outputStream.toByteArray())
    print(messageXml)
    return messageXml
  }
}