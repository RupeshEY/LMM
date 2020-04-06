package gw.acc.iplm.entitymapper.imr.docupload

uses gw.acc.iplm.dto.LMMessageDTO
uses gw.acc.iplm.entitymapper.LMMessageMapperAbstract
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.ECFMessageConstants
uses gw.acc.iplm.utils.ECFUtils
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRs
uses gw.xml.XmlElement

/**
 * This class creates a new entity of ECFMessageDocumentUploadRs_Ext from Document Upload response payload.
 */
class DocumentUploadRsEntityMapper extends LMMessageMapperAbstract {

  override function isCorrectMessageType(xmlPayload: XmlElement): boolean {
    var repOpRs = RepositoryOperationRs.parse(xmlPayload.asUTFString())
    return xmlPayload.$QName.LocalPart == ECFMessageConstants.REPOSITORY_OPERATION_RS_QNAME_LP
        and repOpRs.RepositoryOperationTypeCd.toString() == ECFMessageConstants.DocumentUploadType
  }

  override function createNewLMMessage(lmMessageDTO: LMMessageDTO): ECFMessage_Ext {
    if (not isCorrectMessageType(lmMessageDTO.XMLPayLoad)) {
      return null
    }
    var xmlMessage = lmMessageDTO.XMLPayLoad.asUTFString()
    var documentUploadRs = RepositoryOperationRs.parse(xmlMessage)
    var message = new ECFMessageDocumentUploadRs_Ext()
    message.Content = new Blob(xmlMessage.Bytes)
    message.UUID = documentUploadRs.MsgId
    message.UploadRequestUUId = documentUploadRs.ResponseInfo?.MsgId
    var documentUploadRqMessage = ECFUtils.findMessageByUUID(documentUploadRs.ResponseInfo?.MsgId) as ECFMessageDocumentUploadRq_Ext
    if (documentUploadRqMessage != null) {
      gw.transaction.Transaction.runWithNewBundle(\bundle -> {
        documentUploadRqMessage = bundle.add(documentUploadRqMessage)
        documentUploadRqMessage.UploadResponseUUId = documentUploadRs.MsgId
      }, ECFConstants.ECF_SUPER_USER)
    }
    message.OriginTimeStamp = ECFConstants.ECF_XML_PAYLOAD_DATETIME_FORMAT.get().parse(documentUploadRs.CreationDtTime)
    message.Claim = ECFUtils.findClaimByMessageUUID(documentUploadRs.ResponseInfo?.MsgId)
    message.MessageType = ECFMessageType_Ext.TC_REPOSITORYUPLOAD
    message.MessageCategory = LMMessageCategory_Ext.TC_IMRDOCUMENTUPLOAD
    message.MessageDirection = ECFMessageDirectionType_Ext.TC_INBOUND
    return message
  }
}