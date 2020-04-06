package gw.acc.iplm.entitymapper.imr.docsearch

uses gw.acc.iplm.dto.LMMessageDTO
uses gw.acc.iplm.entitymapper.LMMessageMapperAbstract
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.ECFMessageConstants
uses gw.acc.iplm.utils.ECFUtils
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRs
uses gw.xml.XmlElement

/**
 * This class creates a new entity of ECFMessageDocumentSearchRs_Ext from Document Search response payload.
 */
class DocumentSearchRsEntityMapper extends LMMessageMapperAbstract {

  override function isCorrectMessageType(xmlPayload: XmlElement): boolean {
    var repOpRs = RepositoryOperationRs.parse(xmlPayload.asUTFString())
    return xmlPayload.$QName.LocalPart == ECFMessageConstants.REPOSITORY_OPERATION_RS_QNAME_LP
        and repOpRs.RepositoryOperationTypeCd.toString() == ECFMessageConstants.DocumentSearchType
  }

  override function createNewLMMessage(lmMessageDTO: LMMessageDTO): ECFMessage_Ext {
    if (not isCorrectMessageType(lmMessageDTO.XMLPayLoad)) {
      return null
    }
    var xmlMessage = lmMessageDTO.XMLPayLoad.asUTFString()
    var documentSearchRs = RepositoryOperationRs.parse(xmlMessage)
    var message = new ECFMessageDocumentSearchRs_Ext()
    message.Content = new Blob(xmlMessage.Bytes)
    message.UUID = documentSearchRs.MsgId
    message.SearchRequestUUId = documentSearchRs.ResponseInfo?.MsgId
    var documentSearchRqMessage = ECFUtils.findMessageByUUID(documentSearchRs.ResponseInfo?.MsgId) as ECFMessageDocumentSearchRq_Ext
    if (documentSearchRqMessage != null) {
      gw.transaction.Transaction.runWithNewBundle(\bundle -> {
        documentSearchRqMessage = bundle.add(documentSearchRqMessage)
        documentSearchRqMessage.SearchResponseUUId = documentSearchRs.MsgId
      }, ECFConstants.ECF_SUPER_USER)
    }

    message.OriginTimeStamp = ECFConstants.ECF_XML_PAYLOAD_DATETIME_FORMAT.get().parse(documentSearchRs.CreationDtTime)
    message.Claim = ECFUtils.findClaimByMessageUUID(documentSearchRs.ResponseInfo?.MsgId)
    message.TR = documentSearchRs?.TR
    message.UCR = documentSearchRs?.UCR
    message.MessageType = ECFMessageType_Ext.TC_REPOSITORYSEARCH
    message.MessageCategory = LMMessageCategory_Ext.TC_IMRDOCUMENTSEARCH
    message.MessageDirection = ECFMessageDirectionType_Ext.TC_INBOUND
    return message
  }
}