package gw.acc.iplm.entitymapper.ecfwb.claimresponse

uses gw.acc.iplm.dto.LMMessageDTO
uses gw.acc.iplm.entitymapper.LMMessageMapperAbstract
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.ECFMessageConstants
uses gw.acc.iplm.utils.ECFUtils
uses gw.acc.iplm.xsd.claimresponse.claimresponsers.ClaimResponseRs
uses gw.xml.XmlElement

/**
 * This class creates a new entity of ECFMessageClaimResponseRs_Ext from Claim Response response payload.
 */
class ClaimResponseRsEntityMapper extends LMMessageMapperAbstract {

  override function isCorrectMessageType(xmlPayload: XmlElement): boolean {
    return xmlPayload.$QName.LocalPart == ECFMessageConstants.CLAIM_RESPONSE_RS_QNAME_LP
  }

  override function createNewLMMessage(lmMessageDTO: LMMessageDTO): ECFMessage_Ext {
    if(not isCorrectMessageType(lmMessageDTO.XMLPayLoad)){
      return null
    }
    var xmlMessage = lmMessageDTO.XMLPayLoad.asUTFString()
    var claimResponseRs = ClaimResponseRs.parse(xmlMessage)
    var message = new ECFMessageClaimResponseRs_Ext()
    message.Content = new Blob(xmlMessage.Bytes)
    message.UUID = claimResponseRs.UUId
    message.ReferredMessageUUId = claimResponseRs.ReferredMessage?.UUId
    message.OriginTimeStamp = ECFConstants.ECF_XML_PAYLOAD_DATETIME_FORMAT.get().parse(claimResponseRs.CreationDate)
    message.MessageType = ECFMessageType_Ext.TC_CLAIMRESPOND
    message.Claim = ECFUtils.findClaimByMessageUUID(claimResponseRs.ReferredMessage.UUId)

    mapSenderData(message, claimResponseRs)
    mapReceiverData(message, claimResponseRs)
    mapResponse(message, claimResponseRs)
    mapErrorsWarnings(message, claimResponseRs)
    mapAdminLogData(message)

    return message
  }

  /**
   * Maps the admin log data such as message direction and category.
   *
   * @return {@link entity.ECFMessageClaimResponseRq_Ext} claimResponseRq
   */
  private function mapAdminLogData(claimResponseRs : ECFMessageClaimResponseRs_Ext){
    claimResponseRs.MessageDirection = ECFMessageDirectionType_Ext.TC_INBOUND
    claimResponseRs.MessageCategory = LMMessageCategory_Ext.TC_ECFCLAIMRESPONSE
  }

  private function mapSenderData(message: ECFMessageClaimResponseRs_Ext, claimResponseRs: ClaimResponseRs) {
    message.SenderPartyId = claimResponseRs.SenderPartyId
    message.SenderPartyName = claimResponseRs.SenderPartyName
    message.SenderPartyRoleCd = claimResponseRs.SenderPartyRoleCd
    message.SenderPartyAgency = claimResponseRs.SenderPartyAgency
  }

  private function mapReceiverData(message: ECFMessageClaimResponseRs_Ext, claimResponseRs: ClaimResponseRs) {
    message.ReceiverPartyId = claimResponseRs.InsurerId
    message.ReceiverPartyName = claimResponseRs.InsurerName
    message.ReceiverPartyRoleCd = claimResponseRs.ReceiverPartyRoleCd
    message.ReceiverPartyAgency = claimResponseRs.InsurerAgency
  }

  private function mapResponse(message: ECFMessageClaimResponseRs_Ext, claimResponseRs: ClaimResponseRs) {
    message.ResponseAcknowledgement.AcknowledgementStatus = ECFAcknowledgementStatus_Ext.get(claimResponseRs.Response.AcknowledgementStatus)
    message.ResponseAcknowledgement.AcknowledgementLevelIndicator = claimResponseRs.Response.AcknowledgementLevelIndicator
    message.ResponseAcknowledgement.ResponseDescription = claimResponseRs.Response.ResponseDescription
    message.ResponseAcknowledgement.ErrorCode = null
  }

  private function mapErrorsWarnings(message: ECFMessageClaimResponseRs_Ext, claimResponseRs: ClaimResponseRs) {
    var errorsAndWarnings = claimResponseRs.ErrorsAndWarnings?.Result
    for (errorOrWarning in errorsAndWarnings) {
      var entityErrorOrWarning = new ECFMessageErrorOrWarning_Ext()
      entityErrorOrWarning.ErrorCode = errorOrWarning.ErrorCode
      entityErrorOrWarning.ErrorType = ECFErrorType_Ext.get(errorOrWarning.ErrorWarningLevel.toString())
      entityErrorOrWarning.Description = errorOrWarning.ErrorWarningDescription
      entityErrorOrWarning.ReferenceMessageUUID = message.UUID
      entityErrorOrWarning.ECFMessage = message
      message.addToErrorsOrWarnings(entityErrorOrWarning)
    }
  }
}