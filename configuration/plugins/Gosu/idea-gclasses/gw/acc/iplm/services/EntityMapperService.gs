package gw.acc.iplm.services

uses entity.LMMessage_Ext
uses gw.acc.iplm.dao.LMMessageDAO
uses gw.acc.iplm.dto.LMMessageDTO
uses gw.acc.iplm.dto.XchangingFixParamDTO
uses gw.acc.iplm.entitymapper.LMMessageMapperContext
uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.messageidentifier.MessageIdentifier
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.ECFMessageConstants
uses gw.acc.iplm.utils.ECFUtils
uses gw.acc.iplm.utils.ECFXmlFileReader
uses gw.acc.iplm.utils.SOAPMessageConstants
uses gw.acc.iplm.utils.SOAPUtility
uses gw.acc.iplm.xchanging.DocumentVersionDtTime
uses gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.PostRq
uses gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.PostRs
uses gw.acc.iplm.xsd.wb_header_1_0.Xchangingheader
uses gw.xml.XmlElement
uses gw.xsd.w3c.soap11_envelope.Envelope

uses javax.xml.soap.SOAPMessage
uses java.nio.charset.StandardCharsets

/**
 * Service for mapping XML messages to entities.
 */
class EntityMapperService {

  private var LOGGER = ECFConstants.LOGGER_BLOCK()
  private var _lmMessageDAO: LMMessageDAO

  construct() {
    _lmMessageDAO = new LMMessageDAO()
  }

  construct(lmMessageDAO: LMMessageDAO) {
    _lmMessageDAO = lmMessageDAO
  }

  /**
   * This function takes in an IMR SOAPMessage
   * and then creates an appropriate subtype of entity LMMessage_Ext in the database.
   *
   * @param soapMessage
   * @return LMMessage_Ext
   */
  public function createEntity(soapMessage: SOAPMessage): LMMessage_Ext {
    var bodyType = soapMessage.SOAPBody.FirstChild.NextSibling.LocalName
    if (bodyType == PostRs.$QNAME.LocalPart) {
      final var postRsNode = ECFUtils.getNode(soapMessage.SOAPBody.ChildNodes, PostRs.$QNAME.LocalPart)
      final var postRs = PostRs.parse(ECFUtils.convertNodeToString(postRsNode))

      return createEntity(postRs, null)
    }

    var postRqNode = ECFUtils.getNode(soapMessage.SOAPBody.ChildNodes, PostRq.$QNAME.LocalPart)
    var postRq = PostRq.parse(ECFUtils.convertNodeToString(postRqNode))
    var xmlAttachmentId = postRq?.WorkFolder?.MsgFile?.FileId?.replace(ECFMessageConstants.CID, "")
    var binaryAttachmentId = postRq?.WorkFolder?.AttachmentPackages?.AttachmentPackage?.first()?.FileId?.replace(ECFMessageConstants.CID, "")
    var attachments = soapMessage.getAttachments()
    var repositoryOperationRsXml = new String(SOAPUtility.getByteArrayForFileAttachment(attachments, xmlAttachmentId), StandardCharsets.UTF_8)
    return createEntity(XmlElement.parse(repositoryOperationRsXml), SOAPUtility.getByteArrayForFileAttachment(attachments, binaryAttachmentId))
  }

  /**
   * This method will read the message xml content specific tags
   * and then creates an appropriate subtype of entity ECFMessage_Ext in the database.
   *
   * @param xmlElement the message xml to read.
   * @return LMMessage_Ext logged entity created or updated from the received message.
   */
  public function createEntity(xmlElement: XmlElement): LMMessage_Ext {
    return createEntity(xmlElement, null)
  }

  private function createEntity(xmlElement: XmlElement, bytes: byte[]): LMMessage_Ext {
    var xchangingDTO = new XchangingFixParamDTO()
    xchangingDTO.XMLPayLoad = xmlElement
    xmlElement = new DocumentVersionDtTime().xchangingFix(xchangingDTO)

    var messageType = new MessageIdentifier().identifyMessageType(xmlElement)
    var uuid = ECFXmlFileReader.getUUIDValueFromXML(messageType, xmlElement)

    if (_lmMessageDAO.getMessageWithUuid(uuid) != null) {
      throw new ECFException(ECFErrorCodeType.MESSAGE_DUPLICATE_UUID, uuid)
    }

    var header : Xchangingheader
    if(xmlElement.$QName.LocalPart == SOAPMessageConstants.SOAP_ENVELOPE_QNAME_LP) {
      header = ECFXmlFileReader.getXchangingHeader(Envelope.parse(xmlElement.asUTFString()))
    }
    var lmMessageDTO = new LMMessageDTO(messageType, xmlElement, bytes, header)
    return createNewECFMessage(lmMessageDTO)
  }

  /**
   * Creates a new LMMessage_Ext entity which has a subtype appropriate
   * for the message type of the XMLElement provided.
   *
   * @param messageDTO DTO including the message XML and Message Type
   * @return The LMMessage_Ext with the correct subtype.
   */
  private function createNewECFMessage(messageDTO: LMMessageDTO): LMMessage_Ext {
    var xmlPayloadObject = ECFXmlFileReader.getPayloadObject(messageDTO.XMLPayLoad)
    messageDTO.XMLPayLoad = xmlPayloadObject
    var newMessage: LMMessage_Ext

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var messageContext = new LMMessageMapperContext(messageDTO.MessageType)
      newMessage = messageContext.getAppropriateEntity(messageDTO)
      if (newMessage == null) {
        throw new IllegalArgumentException(messageDTO.MessageType + " is not a supported message type")
      }
      newMessage = bundle.add(newMessage)
    }, ECFConstants.ECF_SUPER_USER)

    return newMessage
  }
}