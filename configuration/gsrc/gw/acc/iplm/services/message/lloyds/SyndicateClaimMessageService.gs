package gw.acc.iplm.services.message.lloyds

uses gw.acc.iplm.controller.LMSuspenseQueueController
uses gw.acc.iplm.exception.lm.LMErrorCodeType
uses gw.acc.iplm.exception.lm.LMException
uses gw.acc.iplm.services.LMMessageReprocessService
uses gw.acc.iplm.services.activity.lm.LMActivityCreationService
uses gw.acc.iplm.services.api.InboundService
uses gw.acc.iplm.services.claim.lm.LMClaimService
uses gw.acc.iplm.utils.ECFConstants
uses gw.api.database.Query
uses gw.api.database.QuerySelectColumns
uses gw.api.database.Relop
uses gw.api.path.Paths
uses org.apache.commons.lang3.StringUtils

uses java.math.BigDecimal

class SyndicateClaimMessageService extends InboundService<LMMessageLloydsSCM_Ext> {

  private var _claimService: LMClaimService as ClaimService = new LMClaimService()
  private var _activityCreationService: LMActivityCreationService as ActivityCreationService = new LMActivityCreationService()
  private var _suspenseQueueController: LMSuspenseQueueController as SuspenseQueueController = new LMSuspenseQueueController()
  private var _reprocessService: LMMessageReprocessService as ReprocessService = new LMMessageReprocessService()

  /**
   * This function will process Lloyd's Syndicate Claim Messages
   *
   * @param ecfMessage entity holding the Syndicate Claim Message
   */
  override function process(message: LMMessageLloydsSCM_Ext) {

    LOGGER.info("Processing SCM message.")

    if (StringUtils.isBlank(message.UCR)) {
      throw new LMException(LMErrorCodeType.CLAIM_UCR_NOT_FOUND)
    }

    var claim = _claimDAO.findClaim(message.UCR)
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {

      if (claim == null) {
        claim = _claimService.createClaim(message)
      } else {
        LOGGER.info("Updating Claim with UCR ${message.UCR}")
        claim = bundle.add(claim)
        claim = _claimService.mapClaimDetails(message, claim)
      }

      LOGGER.info("Processing SCM Message against Claim with UCR ${message.UCR}")
      claim.addToLMMessages(message)

    }, ECFConstants.ECF_SUPER_USER)

    message = message.refresh() as LMMessageLloydsSCM_Ext
    createActivities(message)
    reprocessSuspendedMessages(message)
  }

  private function createActivities(message: LMMessageLloydsSCM_Ext) {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      try {
        _activityCreationService.createActivities(message)
      } catch (e: LMException) {
        LOGGER.warn("Exception thrown while creating activities for SCM message with UCR ${message.UCR} ", e)
      }
    }, ECFConstants.ECF_SUPER_USER)
  }

  private function reprocessSuspendedMessages(currentMessage: LMMessageLloydsSCM_Ext) {
    var suspendedMessages = sortedListOfSuspendedMessages(:ucr = currentMessage.UCR,
                                                          :ocr = currentMessage.OCR,
                                                          :afterMessageSequence = currentMessage.MessageSequence)

    LOGGER.debug("Flagging ${suspendedMessages.Count} messages to be re-processed.")
    suspendedMessages = _reprocessService.flagToBeReprocessed(suspendedMessages) as List<LMMessageLloydsSCM_Ext>

    try {
      for (message in suspendedMessages index idx) {
        var previousMessage = idx > 0 ? suspendedMessages[idx - 1] : currentMessage
        if (message.MessageSequence - previousMessage.MessageSequence > 1) {
          LOGGER.debug("A gap between message sequences was detected. No further messages are going to be reprocessed.")
          break
        }

        suspendedMessages[idx] = _suspenseQueueController.unsuspendAndReprocessMessage(message)
      }
    } catch (e: Exception) {
      LOGGER.info("Failed to reprocess message. No further messages are going to be reprocessed.", e)
    }

    _reprocessService.unflagFromReprocess(suspendedMessages)
  }

  private function sortedListOfSuspendedMessages(ucr: String, ocr: String, afterMessageSequence: BigDecimal): List<LMMessageLloydsSCM_Ext> {
    // Only retrieve the messages that haven't been flagged for Reprocess.
    // By doing so we avoid getting into a recursive loop where each message processes the message immediatelly after.
    return Query.make(LMMessageLloydsSCM_Ext)
        .compare(LMMessageLloydsSCM_Ext#UCR, Relop.Equals, ucr)
        .compare(LMMessageLloydsSCM_Ext#OCR, Relop.Equals, ocr)
        .compare(LMMessageLloydsSCM_Ext#MessageSequence, Relop.GreaterThan, afterMessageSequence)
        .compare(LMMessageLloydsSCM_Ext#Suspended, Relop.Equals, true)
        .compare(LMMessageLloydsSCM_Ext#Reprocess, Relop.Equals, false)
        .select()
        .orderBy(QuerySelectColumns.path(Paths.make(LMMessageLloydsSCM_Ext#MessageSequence)))
        .toList()
  }
}