package gw.acc.iplm.entitymapper.imr.docdownload

uses gw.acc.iplm.dto.LMMessageDTO
uses gw.acc.iplm.entitymapper.LMMessageMapperAbstract
uses gw.acc.iplm.utils.DocumentUtils
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.ECFMessageConstants
uses gw.acc.iplm.utils.ECFUtils
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRs
uses gw.xml.XmlElement

/**
 * This class creates a new entity of ECFMessageDocumentDownloadRs_Ext from Document Download response payload.
 */
class DocumentDownloadRsEntityMapper extends LMMessageMapperAbstract {

  override function isCorrectMessageType(xmlPayload: XmlElement): boolean {
    var repOpRs = RepositoryOperationRs.parse(xmlPayload.asUTFString())
    return xmlPayload.$QName.LocalPart == ECFMessageConstants.REPOSITORY_OPERATION_RS_QNAME_LP
        and repOpRs.RepositoryOperationTypeCd.toString() == ECFMessageConstants.DocumentDownloadType
  }

  override function createNewLMMessage(lmMessageDTO: LMMessageDTO): ECFMessage_Ext {
    if (not isCorrectMessageType(lmMessageDTO.XMLPayLoad)) {
      return null
    }
    var xmlMessage = lmMessageDTO.XMLPayLoad.asUTFString()
    var documentDownloadRs = RepositoryOperationRs.parse(xmlMessage)
    var message = new ECFMessageDocumentDownloadRs_Ext()
    message.Content = new Blob(xmlMessage.Bytes)
    message.UUID = documentDownloadRs.MsgId
    message.DownloadRequestUUId = documentDownloadRs.ResponseInfo?.MsgId
    var documentDownloadRqMessage = ECFUtils.findMessageByUUID(documentDownloadRs.ResponseInfo?.MsgId) as ECFMessageDocumentDownloadRq_Ext
    if (documentDownloadRqMessage != null) {
      gw.transaction.Transaction.runWithNewBundle(\bundle -> {
        documentDownloadRqMessage = bundle.add(documentDownloadRqMessage)
        documentDownloadRqMessage.DownloadResponseUUId = documentDownloadRs.MsgId
      }, ECFConstants.ECF_SUPER_USER)
    }
    message.OriginTimeStamp = ECFConstants.ECF_XML_PAYLOAD_DATETIME_FORMAT.get().parse(documentDownloadRs.CreationDtTime)
    if (lmMessageDTO.Bytes != null) {
      message.DocumentBinary = new Blob(lmMessageDTO.Bytes)
    } else {
      LOGGER.error("IMR Document Download: Was unable to store the Document binary as there was none available.")
    }
    message.Document = DocumentUtils.findDocumentByIMRDocumentId(documentDownloadRs.Document?.DocumentId)
    message.Claim = ECFUtils.findClaimByMessageUUID(documentDownloadRs.ResponseInfo?.MsgId)
    message.MessageType = ECFMessageType_Ext.TC_REPOSITORYDOWNLOAD
    message.MessageCategory = LMMessageCategory_Ext.TC_IMRDOCUMENTDOWNLOAD
    message.MessageDirection = ECFMessageDirectionType_Ext.TC_INBOUND
    return message
  }
}