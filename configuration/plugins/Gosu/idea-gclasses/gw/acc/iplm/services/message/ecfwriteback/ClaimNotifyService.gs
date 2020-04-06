package gw.acc.iplm.services.message.ecfwriteback

uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.exception.imr.IMRException
uses gw.acc.iplm.services.api.InboundECFService
uses gw.acc.iplm.utils.ECFUtils

class ClaimNotifyService extends InboundECFService<ECFMessageClaimNotifyRq_Ext> {

  override function process(ecfMessage: ECFMessageClaimNotifyRq_Ext) {
    processClaim(ecfMessage)
  }

  override function processClaim(ecfMessage: ECFMessageClaimData_Ext): Claim {
    var claim: Claim
    try {
      LOGGER.info("Start processing Claim Notify Message")
      claim = super.processClaim(ecfMessage)

      var claimNotifyMessage = ECFUtils.findMessageByUUID(ecfMessage.UUID) as ECFMessageClaimNotifyRq_Ext
      updatePreviousClaimNotify(claimNotifyMessage.PreviousClaimNotify, ECFClaimMessageState_Ext.TC_RESPONDED)
      LOGGER.info("End processing Claim Notify Message with claim number {}", claim != null ? claim.ClaimNumber : " Claim Number not found")
    } catch (ex: IMRException) {
      LOGGER.error("IMR Service Unreachable. Not able to refresh Document list for Claim Notify message with UUID {} for Claim {}", ecfMessage.UUID, claim.ClaimNumber)
      LOGGER.error("IMR Service Unreachable due to error {}", ex.Cause.Message)
      LOGGER.debug("IMR Service Unreachable due to error {}", ex.StackTraceAsString)
    } catch (ex: Exception) {
      throw new ECFException(ECFErrorCodeType.CLAIM_NOTIFY_ERROR, ex)
    }
    return claim
  }

  protected function updatePreviousClaimNotify(claimNotify: ECFMessageClaimNotifyRq_Ext, state: ECFClaimMessageState_Ext) {
    if (claimNotify == null) {
      return
    }
    LOGGER.debug("Found previous related ClaimNotify with UUID ${claimNotify.UUID}")
    claimNotify.updateStateOnClaimDataMessage(state)
  }

}