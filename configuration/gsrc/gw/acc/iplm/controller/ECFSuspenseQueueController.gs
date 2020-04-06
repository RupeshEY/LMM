package gw.acc.iplm.controller

uses gw.acc.iplm.InterceptorManagerWrapper
uses gw.acc.iplm.dao.impl.ClaimDAO
uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.services.suspensequeue.ECFSuspenseQueueService
uses gw.acc.iplm.utils.ECFConstants
uses gw.api.locale.DisplayKey

/**
 * This class is working as the glue between suspense queue business functionality
 * and PCF's and it also handles the flow of each UI request.
 */
class ECFSuspenseQueueController {

  private static final var LOGGER = ECFConstants.LOGGER_BLOCK()
  private var _ecfSuspenseQueueService: ECFSuspenseQueueService
  private var _interceptorManager: InterceptorManagerWrapper

  public static final var MESSAGE_APPLY_TO_POLICY : block(LMMessage_Ext): String = \message -> {var ecfMessage = message as ECFMessageClaimData_Ext; return DisplayKey.get("Accelerator.IPLM.Web.MessageSuspenseQueue.ECF.ReprocessingAgainstPolicyNum", ecfMessage.UMR, ecfMessage.UCR, ecfMessage.TR, ecfMessage.PolicyNumber) }
  public static final var MESSAGE_APPLY_TO_CLAIM : block(LMMessage_Ext): String = \message -> {var ecfMessage = message as ECFMessageClaimData_Ext; return DisplayKey.get("Accelerator.IPLM.Web.MessageSuspenseQueue.ECF.ReprocessingAgainstClaimNum",ecfMessage.UMR, ecfMessage.UCR, ecfMessage.TR, ecfMessage.Claim.ClaimNumber) }

  construct() {
    this(new ECFSuspenseQueueService(), new InterceptorManagerWrapper())
  }

  construct(ecfSuspenseQueueService: ECFSuspenseQueueService, interceptorManagerWrapper: InterceptorManagerWrapper) {
    _ecfSuspenseQueueService = ecfSuspenseQueueService
    _interceptorManager = interceptorManagerWrapper
  }

  /**
   * Processes a specific ClaimData message entity against a selected Policy.
   * Returns null if any of the arguments are null.
   *
   * @param claimDataMessage
   * @param selectedPolicyNumber
   * @return The ClaimData message entity being applied.
   */
  public function processMessageAgainstPolicy(claimDataMessage: ECFMessageClaimData_Ext,
                                              selectedPolicyNumber: String): ECFMessageClaimData_Ext {
    var cnMessagesAfterApplyingPolicy = _ecfSuspenseQueueService.applyMessageToPolicy(claimDataMessage, selectedPolicyNumber)
    return reProcessMessage(cnMessagesAfterApplyingPolicy)
  }

  /**
   * Processes a specific ClaimData message entity against a selected Claim by UCR.
   * Returns null if any of the arguments are null.
   *
   * @param claimDataMessage
   * @param selectedUCR
   * @return The ClaimData message entity being applied.
   * @throws ECFException if the Claim already has suspended messages
   */
  public function processMessageAgainstClaim(claimDataMessage: ECFMessageClaimData_Ext,
                                             selectedUCR: String): ECFMessageClaimData_Ext {
    if (new ClaimDAO().findClaim(selectedUCR).HasSuspendedMessages) {
      throw new ECFException(SUSPENSE_QUEUE_APPLY_TO_CLAIM_MESSAGES_CURRENTLY_SUSPENDED)
    }

    var cnMessagesAfterApplyingClaim = _ecfSuspenseQueueService.applyMessageToClaim(claimDataMessage, selectedUCR)
    return reProcessMessage(cnMessagesAfterApplyingClaim)
  }

  /**
   * Delete(Retire) selected ECFMessages associated with unique claim transactions. After deleting selected values,
   * it verifies that is there any more messages exist in suspense queue related to deleted claim transactions.
   * If there are more messages related to the deleted transaction, they reprocessed against ECF.
   *
   * @param ecfMessages Array
   */
  public function deleteECFMessages(ecfMessages: ECFMessageClaimData_Ext[]) {
    var transactionHashMap = _ecfSuspenseQueueService.createClaimTransactionHashMap(ecfMessages)
    _ecfSuspenseQueueService.deleteMessages(ecfMessages)
    reProcessMessage(_ecfSuspenseQueueService.unsuspendMessagesForClaimTransactions(transactionHashMap))
  }

  /**
   * Unsuspend messages so they can be resubmitted by the user, but remain in the message log.
   *
   * @param claimDataMessages
   */
  public function resubmitECFMessages(claimDataMessages: ECFMessageClaimData_Ext[]) {
    for (msg in claimDataMessages) {
      _ecfSuspenseQueueService.unsuspendMessageEntity(msg)
    }

  }

  /**
   * This method validates that selected array of ECF Messages does not have more than one selected claim transactions.
   * Each unique claim transaction is combination of UMR, UCR and TR.
   *
   * @param ecfMessages Array
   */
  public function validateBeforeDeleteAdditionalMessages(ecfMessages: ECFMessageClaimData_Ext[]) {
    _ecfSuspenseQueueService.validateBeforeDeleteAdditionalMessages(ecfMessages)
  }

  /**
   * This method returns all suspended claim data messages for the given claim transaction
   * Each unique claim transaction is combination of UMR, UCR and TR.
   *
   * @param claimDataMessage
   * @return List of all all suspended claim data messages
   */
  public function getAllSuspendedMsgsForClaimTransaction(claimDataMessage: ECFMessageClaimData_Ext): ECFMessageClaimData_Ext[] {
    return _ecfSuspenseQueueService.findAllSuspendedMsgsForClaimTransaction(claimDataMessage).toTypedArray()
  }

  /**
   * Returns the claim data messages that have been assigned to a particular user.
   *
   * @param user The user to get the messages for
   * @return An array of ECFMessageClaimData_Ext entities that have been assigned to the provided user
   */
  public function getClaimDataMessagesForUser(user: User): ECFMessageClaimData_Ext[] {
    return _ecfSuspenseQueueService.getMessagesForUser(user)
  }

  /**
   * Returns the number of suspended messages assigned to a particular user.
   *
   * @param user The user to get the messages for
   * @return Number of messages assigned to the user
   */
  public function getNumberSuspendedMessagesForUser(user: User): Integer {
    return _ecfSuspenseQueueService.getSuspendedMessagesCountForUser(user)
  }

  private function reProcessMessage(claimDataMessages: List<ECFMessageClaimData_Ext>): ECFMessageClaimData_Ext {
    if (claimDataMessages == null or claimDataMessages.isEmpty()) {
      return null
    }
    LOGGER.info("A total number of messages to be reprocessed. ${claimDataMessages.size()}")
    claimDataMessages.each(\elt -> {
      LOGGER.info("Going to reprocess message with UUID ${elt.UUID}, UMR: ${elt.UMR}, UCR:${elt.UCR}, TR: ${elt.TR}")
      _interceptorManager.intercept(elt)
    })
    return claimDataMessages.first()
  }
}