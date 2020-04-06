package gw.acc.iplm.entitymapper.ecfwb.claimnotify

uses gw.acc.iplm.dto.ClaimMessageDTO
uses gw.acc.iplm.dto.LMMessageDTO
uses gw.acc.iplm.entitymapper.ecfwb.claimdata.ECFMessageClaimDataMapper
uses gw.acc.iplm.utils.ECFMessageConstants
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.ClaimNotifyEventRq
uses gw.xml.XmlElement

/**
 * This class creates a new entity of ECFMessageClaimNotifyRq_Ext from Claim Notify payload.
 */
class ClaimNotifyRqEntityMapper extends ECFMessageClaimDataMapper {

  override function isCorrectMessageType(xmlPayload: XmlElement): boolean {
    return xmlPayload.$QName.LocalPart == ECFMessageConstants.CLAIM_NOTIFY_EVENT_RQ_QNAME_LP
  }

  override function createNewLMMessage(lmMessageDTO: LMMessageDTO): ECFMessage_Ext {
    if (not isCorrectMessageType(lmMessageDTO.XMLPayLoad)) {
      return null
    }
    final var claimNotifyEventRq = ClaimNotifyEventRq.parse(lmMessageDTO.XMLPayLoad.asUTFString())
    var message = new ECFMessageClaimNotifyRq_Ext()

    if (claimNotifyEventRq?.isECFRespondError()) {
      return RespondErrorNotifyMapper.mapRespondErrorNotify(message as ECFMessageClaimNotifyRq_Ext, claimNotifyEventRq)
    }

    if (claimNotifyEventRq?.isECFTransactionError()) {
      return TransactionErrorNotifyMapper.mapTransactionErrorNotify(message as ECFMessageClaimNotifyRq_Ext, lmMessageDTO.Xchangingheader, claimNotifyEventRq)
    }

    message = createCommonMessageClaimData(new ClaimMessageDTO(claimNotifyEventRq), message) as ECFMessageClaimNotifyRq_Ext
    //Claim Notify specific fields
    message.MessageDirection = ECFMessageDirectionType_Ext.TC_INBOUND
    message.MessageCategory = LMMessageCategory_Ext.TC_ECFCLAIMNOTIFY
    message.ResponseCode = ECFResponseCode_Ext.get(claimNotifyEventRq.ClaimMovement.ResponseCode)
    message.ActionParticipant = claimNotifyEventRq.ClaimMovement.ActionParticipant
    message.MessageSequence = claimNotifyEventRq.ClaimMovement.MessageSequenceNumber
    message.setParticipantType(claimNotifyEventRq.ClaimMovement.ActionParticipantType)
    return message
  }
}