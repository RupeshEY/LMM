package gw.acc.iplm.entitymapper.ecfwb.claimnotify

uses gw.acc.iplm.entitymapper.ecfwb.claimdata.ClaimDataWarningsAndErrorsCreator
uses gw.acc.iplm.utils.ECFUtils
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.ClaimNotifyEventRq

/**
 * This is a sub mapper of ClaimNotifyRqEntityMapper for the case where the message is a RespondErrorNotify type
 */
class RespondErrorNotifyMapper {

  /**
   * Map the information required for a RespondErrorNotify
   *
   * @param message    ECFMessageClaimNotifyRq_Ext to map to
   * @param claimNotifyRq ClaimNotifyEventRq to map from
   */
  public static function mapRespondErrorNotify(final message: ECFMessageClaimNotifyRq_Ext, claimNotifyRq: ClaimNotifyEventRq): ECFMessageClaimNotifyRq_Ext {
    message.MessageType = ECFMessageType_Ext.TC_RESPONDERRORNOTIFY
    message.UUID = claimNotifyRq?.UUId
    message.OriginTimeStamp = claimNotifyRq?.OriginTimeStamp
    message.ClaimResponseUUId = claimNotifyRq.ClaimResponseUUId
    ClaimDataWarningsAndErrorsCreator.createClaimNotifyErrorsWarnings(message, claimNotifyRq)
    mapDataFromClaimResponse(message)
    message.MessageDirection = ECFMessageDirectionType_Ext.TC_INBOUND
    message.MessageCategory = LMMessageCategory_Ext.TC_ECFCLAIMNOTIFY
    return message
  }

  private static function mapDataFromClaimResponse(final message: ECFMessageClaimNotifyRq_Ext) {
    var claimResponse = getClaimResponse(message.ClaimResponseUUId)
    message.Claim = claimResponse.Claim
    message.UCR = claimResponse.UCR
    message.UMR = claimResponse.UMR
    message.TR = claimResponse.TR
  }

  private static function getClaimResponse(claimResponseUUId: String): ECFMessageClaimResponseRq_Ext {
    return ECFUtils.findMessageByUUID(claimResponseUUId) as ECFMessageClaimResponseRq_Ext
  }

}