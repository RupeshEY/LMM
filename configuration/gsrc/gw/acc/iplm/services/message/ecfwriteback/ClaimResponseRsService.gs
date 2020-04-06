package gw.acc.iplm.services.message.ecfwriteback

uses gw.acc.iplm.dao.LMMessageDAO
uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.services.api.InboundECFService
uses gw.acc.iplm.utils.ECFConstants

class ClaimResponseRsService extends InboundECFService<ECFMessageClaimResponseRs_Ext> {

  override function process(ecfMessage : ECFMessageClaimResponseRs_Ext) {
    try {
      LOGGER.info("Claim Response Rs Message has been received with UUID {}", ecfMessage.UUID)
      LOGGER.info("Claim Response Rs Acknowledgement Status {}", ecfMessage.ResponseAcknowledgement.AcknowledgementStatus)
      LOGGER.info("Claim Response Rs Response Description {}", ecfMessage.ResponseAcknowledgement.ResponseDescription)
      new LMMessageDAO().setMessageStatus(ecfMessage.ReferredMessageUUId, ECFMessageStatus_Ext.TC_SUCCESS)
      createActivities(ecfMessage)
      // TODO: US27164, Set transaction response status
    } catch (ex : Exception) {
      throw new ECFException(ECFErrorCodeType.CLAIM_RESPONSE_ERROR, ex)
    }
  }

  internal function createActivities(message : ECFMessageClaimResponseRs_Ext) {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _activityCreationService.createActivitiesForClaimResponseRs(message)
    }, ECFConstants.ECF_SUPER_USER)
  }
}