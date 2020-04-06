package gw.acc.iplm.services.api

uses gw.acc.iplm.controller.IMRMessageController
uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.exception.imr.IMRException
uses gw.acc.iplm.respondrules.RespondRulesContext
uses gw.acc.iplm.services.activity.ecfwb.ECFActivityCreationService
uses gw.acc.iplm.utils.ECFConstants
uses gw.api.locale.DisplayKey

abstract class InboundECFService<T extends entity.ECFMessage_Ext> extends InboundService<T> {

  protected var _activityCreationService : ECFActivityCreationService = new ECFActivityCreationService()
  private var _imrMessageController : IMRMessageController as IMRMessageController = new IMRMessageController()

  protected function processClaim(ecfMessage : ECFMessageClaimData_Ext) : Claim {
    var claim : Claim

    if (ecfMessage.UCR != null) {
      claim = _claimDAO.findClaim(ecfMessage.UCR)

      try {
        gw.transaction.Transaction.runWithNewBundle(\bundle -> {
          ecfMessage = bundle.add(ecfMessage)
          if (claim == null) {
            claim = createClaim(ecfMessage)
          } else {
            claim = bundle.add(claim)
            claim = updateClaim(claim, ecfMessage)
          }

          claim.addToLMMessages(ecfMessage)
          ecfMessage = processParallelClaims(ecfMessage)

        }, ECFConstants.ECF_SUPER_USER)

        claim = updateECFLastUpdatedTime(claim)
        ecfMessage = updateTransactionState(ecfMessage)
        ecfMessage = processActivities(ecfMessage)
        updatePreviousRelatedMessages(ecfMessage)

      } catch (ex : ECFException) {
        LOGGER.warn("Failed to process Inbound Message. Rethrowing ECFException ${ex.Message}")
        throw ex
      } catch (ex : Exception) {
        throw new ECFException(ECFErrorCodeType.CLAIM_NOTIFY_ERROR, ex)
      }

      try {
        if (claim != null and ecfMessage.TR != null) {
          updateWithLatestDocumentList(claim, ecfMessage.TR)
        }
      } catch (ex : IMRException) {
        LOGGER.error("IMR Service Unreachable. Not able to refresh Document list for Claim Notify message with UUID {} for Claim {}", ecfMessage.UUID, claim.ClaimNumber)
        LOGGER.error("IMR Service Unreachable due to error {}", ex.Cause.Message)
        LOGGER.debug("IMR Service Unreachable due to error {}", ex.StackTraceAsString)
      }
    }

    return claim
  }

  private function createClaim(ecfMessage : ECFMessageClaimData_Ext) : Claim {
    var claim = _ecfClaimService.initializeClaim(ecfMessage.PolicyNumber)
    claim = _ecfClaimService.updateClaimData(ecfMessage, claim)
    claim = mapLossLocation(claim, ecfMessage.LossLocation)
    claim = _ecfClaimService.persistClaim(claim)
    return claim
  }

  private function mapLossLocation(claim : Claim, lossLocation : String) : Claim {
    claim.LossLocation.Description = lossLocation
    claim.LossLocation.Country = Country.get(lossLocation)

    return claim
  }

  protected function updateClaim(claim : Claim, ecfMessage : ECFMessage_Ext) : Claim {
    LOGGER.info("Claim update processing")
    claim = _ecfClaimService.updateClaimData(ecfMessage as ECFMessageClaimData_Ext, claim)
    claim = _claimDAO.saveClaim(claim)
    LOGGER.info("Claim updated: ${claim.ClaimNumber}")
    return claim
  }

  private function processParallelClaims(ecfMessage : ECFMessageClaimData_Ext) : ECFMessageClaimData_Ext {
    if (ecfMessage.ParallelClaimsUCR.length == 1) {
      var parallelClaim = findWriteableClaim(ecfMessage.ParallelClaimsUCR?.first()?.PUCR)
      processParallelClaims(parallelClaim, ecfMessage.Claim)
    }

    return ecfMessage
  }

  private function findWriteableClaim(ucr : String) : Claim {
    return _claimDAO.findWriteableClaim(ucr)
  }

  /**
   * Creates an association between the current Claim and the parallel Claim.
   *
   * @param parallelClaim, the Claim, the UCR of which matches the ParallelUniqueClaimReference
   * @param claim,         the current Claim under processing
   */
  private function processParallelClaims(parallelClaim : Claim, claim : Claim) {
    var title = DisplayKey.get("Accelerator.IPLM.Claim.ClaimAssociation.Title", parallelClaim.UCR_Ext, claim.UCR_Ext)
    if (claim.Associations.firstWhere(\association -> association.Title == title) == null) {
      var claimAssociation = parallelClaim.createClaimAssociation()
      claimAssociation.addClaimIfNotPresent(claim)
      claimAssociation.ClaimAssocType = ClaimAssocType.TC_EVENTRELATED
      claimAssociation.Title = title
      claimAssociation.Description = title
    }
  }

  /**
   * Update the ECFLastUpdateTime field on the Claim to the date and time right now
   *
   * @param claim to update
   * @return the updated Claim
   */
  protected function updateECFLastUpdatedTime(claim : Claim) : Claim {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claim = bundle.add(claim)
      claim.ECFLastUpdateTime = Date.Now
    }, ECFConstants.ECF_SUPER_USER)
    return claim
  }

  /**
   * Update the Transaction State for this message
   *
   * @param ecfMessage the message to use to update transaction State
   * @return the message after Transaction State was updated
   */
  protected function updateTransactionState(ecfMessage : ECFMessageClaimData_Ext) : ECFMessageClaimData_Ext {
    if (not ecfMessage.PrimaryParticipantFollower) {
      gw.transaction.Transaction.runWithNewBundle(\bundle -> {
        ecfMessage = bundle.add(ecfMessage)
        RespondRulesContext.updateState(ecfMessage)
      }, ECFConstants.ECF_SUPER_USER)
    }
    return ecfMessage.refresh() as ECFMessageClaimData_Ext
  }

  /**
   * Process and assign any activities appropriate for this message
   *
   * @param ecfMessage to use to create activities
   * @return the message after activities created (if any)
   */
  protected function processActivities(ecfMessage : ECFMessageClaimData_Ext) : ECFMessageClaimData_Ext {
    ecfMessage = ecfMessage.refresh() as ECFMessageClaimData_Ext

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      ecfMessage = bundle.add(ecfMessage)
      _activityCreationService.createActivities(ecfMessage)
    }, ECFConstants.ECF_SUPER_USER)

    return ecfMessage
  }

  /**
   * Update a claim with latest related documents from external systems
   *
   * @param aClaim               The claim to update
   * @param transactionReference
   * @return
   */
  private function updateWithLatestDocumentList(aClaim : Claim, transactionReference : String) {
    _imrMessageController.sendRepositorySearchRequestForClaim(aClaim, transactionReference)
  }

  /**
   * Process any updates to previous messages related to this message
   *
   * @param ecfMessage the new message
   */
  private function updatePreviousRelatedMessages(ecfMessage : ECFMessageClaimData_Ext) {
    setPendingResponseAsSuperseded(ecfMessage)
  }

  private function setPendingResponseAsSuperseded(ecfMessage : ECFMessageClaimData_Ext) {
    var latestResponse = ecfMessage.Claim.getLatestClaimResponseRqMessageForTR(ecfMessage.TR)
    if (latestResponse?.Status == ECFMessageStatus_Ext.TC_PENDING) {
      latestResponse.Status = ECFMessageStatus_Ext.TC_SUPERSEDED
    }
  }
}