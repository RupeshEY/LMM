package gw.acc.iplm.services.message.ecfwriteback

uses gw.acc.iplm.services.activity.ActivityBuilder
uses gw.acc.iplm.services.api.InboundECFService
uses gw.acc.iplm.utils.ECFConstants
uses gw.api.locale.DisplayKey

class RespondErrorNotifyService extends InboundECFService<ECFMessageClaimNotifyRq_Ext>{

  /**
   * Process the Respond Error
   * Auto Assign an Activity advising
   * Update the previous Claim Notify status
   *
   * @param ecfMessage
   */
  override function process(ecfMessage: ECFMessageClaimNotifyRq_Ext) {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimResponse = getClaimResponseRq(ecfMessage)
      var ecfClaimData = getClaimData(claimResponse)
      updateClaimNotifyStatus(ecfClaimData)
      assignActivityToClaimOwner(ecfMessage)
    }, ECFConstants.ECF_SUPER_USER)
  }

  private function getClaimResponseRq(respondError: ECFMessageClaimData_Ext): ECFMessageClaimResponseRq_Ext {
    var claimResponse = respondError.ClaimDataMessageErrorRelatedClaimResponse
    LOGGER.debug("Respond Error Notify - Found related ClaimResponse with UUID ${claimResponse.UUID}")
    return claimResponse
  }

  private function getClaimData(claimResponse: ECFMessageClaimResponseRq_Ext): ECFMessageClaimData_Ext {
    var claimData = claimResponse?.ClaimDataResponded
    LOGGER.debug("Respond Error Notify - Found related ClaimDataMessage with UUID ${claimData.UUID}")
    return claimData
  }

  private function updateClaimNotifyStatus(ecfClaimDataMessage: ECFMessageClaimData_Ext) {
    ecfClaimDataMessage.updateStateOnClaimDataMessage(ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE)
  }

  private function assignActivityToClaimOwner(respondError: ECFMessageClaimData_Ext) {
    var claim = respondError.Claim
    var errorCode = respondError.ErrorsOrWarnings.first().ErrorCode
    var error = respondError.ErrorsOrWarnings.first().Description
    new ActivityBuilder(claim)
        .withShortSubject(DisplayKey.get("Accelerator.IPLM.Activity.ECF.ShortSubject"))
        .withSubject(DisplayKey.get("Accelerator.IPLM.Activity.ECF.RespondError.Subject", errorCode))
        .withDescription(DisplayKey.get("Accelerator.IPLM.Activity.ECF.RespondError.Description", respondError.ClaimResponseUUId, error))
        .assignedTo(claim.AssignedUser)
        .createActivity()
  }

}