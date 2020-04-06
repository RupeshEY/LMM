package gw.acc.iplm.services.message.ecfwriteback

uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.exception.imr.IMRException
uses gw.acc.iplm.services.api.InboundECFService
uses gw.acc.iplm.services.suspensequeue.ECFSuspenseQueueService
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.ECFUtils

class ClaimRetrieveRsService extends InboundECFService<ECFMessageClaimRetrieveRs_Ext> {

  override function process(ecfMessage: ECFMessageClaimRetrieveRs_Ext) {
    try {
      LOGGER.info("Claim Retrieve response UUID {} with Acknowledgement Status {}", ecfMessage.UUID, ecfMessage.ResponseAcknowledgement.AcknowledgementStatus)
      var claim = processClaim(ecfMessage)
      if (claim != null) {
        updateClaimECFLastUpdatedTime(claim, Date.Now)
        updateClaimRetrieveRq(ecfMessage, claim)
        createActivities(ecfMessage)
      } else {
        LOGGER.warn("Was not able to associate a Claim to the Claim Retrieve response with UUID {}", ecfMessage.UUID)
        suspendMessage(ecfMessage)
      }
    } catch (ex: ECFException) {
      LOGGER.warn("Failed to process inbound Claim Retrieve message. Rethrowing ECFException ${ex.Message}")
      suspendMessage(ecfMessage, ex.ECFErrorCode.ErrorCode, ex.Message)
      throw ex
    } catch (ex: Exception) {
      var exception = new ECFException(ECFErrorCodeType.CLAIM_RETRIEVE_ERROR, ex)
      suspendMessage(ecfMessage, exception.ECFErrorCode.ErrorCode, exception.Message)
      throw exception
    }
  }

  internal function updateClaimRetrieveRq(ecfMessage: ECFMessageClaimRetrieveRs_Ext, claim: Claim) {
    if (claim == null or ecfMessage == null) {
      throw new IllegalArgumentException("Both ecfMessage and claim input arguments must be present")
    }
    var referredClaimRetrieveRq = ECFUtils.findMessageByUUID(ecfMessage.ClaimRetrieveReqReferredUUId)
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      referredClaimRetrieveRq = bundle.add(referredClaimRetrieveRq)
      referredClaimRetrieveRq.Claim = claim
    }, ECFConstants.ECF_SUPER_USER)
  }

  override function processClaim(ecfMessage: ECFMessageClaimData_Ext): Claim {
    var claim = ecfMessage.Claim
    try {
      LOGGER.info("Start processing Claim Retrieve Message")
      if (ecfMessage.UCR != null) {
        claim = super.processClaim(ecfMessage)
      } else {
        LOGGER.warn("Claim Retrieve response ${ecfMessage.UUID} did not contain any new Claim data to process")
      }

      LOGGER.info("End processing Claim Retrieve Message with claim number {}", claim != null ? claim.ClaimNumber : " Claim Number not found")
    } catch (ex: IMRException) {
      LOGGER.error("IMR Service Unreachable. Not able to refresh Document list for Claim Retrieve message with UUID {} for Claim {}", ecfMessage.UUID, claim.ClaimNumber)
      LOGGER.error("IMR Service Unreachable due to error {}", ex.Cause.Message)
      LOGGER.debug("IMR Service Unreachable due to error {}", ex.StackTraceAsString)
    } catch (ex: ECFException) {
      LOGGER.warn("Failed to process claim. Rethrowing ECFException ${ex.Message}")
      throw ex
    } catch (ex: Exception) {
      throw new ECFException(ECFErrorCodeType.CLAIM_RETRIEVE_ERROR, ex)
    }
    return claim
  }

  internal function updateClaimECFLastUpdatedTime(claim: Claim, date: Date): Claim {
    if (claim == null or date == null) {
      throw new IllegalArgumentException("Both claim and date input arguments must be present")
    }

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claim = bundle.add(claim)
      claim.ECFLastUpdateTime = date
    }, ECFConstants.ECF_SUPER_USER)
    return claim
  }

  internal function createActivities(message: ECFMessageClaimRetrieveRs_Ext) {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _activityCreationService.createActivitiesForClaimRetrieveRs(message)
    }, ECFConstants.ECF_SUPER_USER)
  }

  internal function suspendMessage(message: ECFMessageClaimRetrieveRs_Ext) {
    var error = ECFErrorCodeType.CLAIM_RETRIEVE_UNKNOWN_DESCRIPTION.MessageFormatter.prepareMessage({""})
    suspendMessage(message, ECFErrorCodeType.CLAIM_RETRIEVE_UNKNOWN_DESCRIPTION.ErrorCode, error)
  }

  internal function suspendMessage(message: ECFMessageClaimRetrieveRs_Ext, errorCode: int, error: String) {
    new ECFSuspenseQueueService().suspendMessage(message, errorCode, error)
  }
}