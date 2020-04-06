package gw.acc.iplm.controller

uses gw.acc.iplm.InterceptorManagerWrapper
uses gw.acc.iplm.services.suspensequeue.LMSuspenseQueueService
uses gw.acc.iplm.utils.ECFConstants
uses gw.api.locale.DisplayKey

/**
 * This class is working as the glue between suspense queue business functionality
 * and PCF's and it also handles the flow of each UI request.
 */
class LMSuspenseQueueController {

  private static final var LOGGER = ECFConstants.LOGGER_BLOCK()
  private var _suspenseQueueService: LMSuspenseQueueService
  private var _interceptorManager: InterceptorManagerWrapper

  public static final var MESSAGE_APPLY_TO_POLICY : block(LMMessage_Ext) : String = \message -> { var scmMsg = message as LMMessageLloydsSCM_Ext; return DisplayKey.get("Accelerator.IPLM.Web.MessageSuspenseQueue.LM.ReprocessingAgainstPolicyNum",scmMsg.UMR, scmMsg.UCR, scmMsg.OCR, scmMsg.PolicyNumber)}

  construct() {
    this(new LMSuspenseQueueService(), new InterceptorManagerWrapper())
  }

  construct(suspenseQueueService: LMSuspenseQueueService, interceptorManagerWrapper: InterceptorManagerWrapper) {
    _suspenseQueueService = suspenseQueueService
    _interceptorManager = interceptorManagerWrapper
  }

  /**
   * Processes a specific message entity against a selected Policy.
   * Returns null if any of the arguments are null.
   *
   * @param message
   * @param selectedPolicyNumber
   * @return The processed Lloyds SCM message list
   */
  public function processMessageAgainstPolicy(message: LMMessageLloydsSCM_Ext,
                                              selectedPolicyNumber: String): LMMessageLloydsSCM_Ext {
    var messageAfterApplyingPolicy = _suspenseQueueService.applyMessageToPolicy(message, selectedPolicyNumber)
    return reProcessMessage(messageAfterApplyingPolicy)
  }

  /**
   * Delete(Retire) selected messages.
   *
   * @param messages Array
   */
  public function deleteMessages(messages: LMMessageLloydsSCM_Ext[]) {
    _suspenseQueueService.deleteMessages(messages)
  }

  /**
   * Returns the London market messages that have been assigned to a particular user.
   *
   * @param user The user to get the messages for
   * @return An array of LMMessageLloydsSCM_Ext entities that have been assigned to the provided user
   */
  public function getMessagesForUser(user: User): LMMessageLloydsSCM_Ext[] {
    return _suspenseQueueService.getMessagesForUser(user)
  }

  /**
   * Returns the number of suspended messages assigned to a particular user.
   *
   * @param user The user to get the messages for
   * @return Number of messages assigned to the user
   */
  public function getNumberSuspendedMessagesForUser(user: User) : Integer {
    return _suspenseQueueService.getSuspendedMessagesCountForUser(user)
  }

  private function reProcessMessage(messages: List<LMMessageLloydsSCM_Ext>): LMMessageLloydsSCM_Ext {
    if (messages == null or messages.isEmpty()) {
      return null
    }
    LOGGER.info("A total number of messages to be reprocessed. ${messages.size()}")
    messages.each(\elt -> {
      LOGGER.info("Going to reprocess message with UUID ${elt.UUID}, UMR: ${elt.UMR}, UCR:${elt.UCR}, OCR: ${elt.OCR}")
      _interceptorManager.intercept(elt)
    })
    return messages.first()
  }

  /**
   * Unsuspends a previously suspended message and tries to reprocess it
   * @param message Suspended message to be reprocessed
   * @return {@link entity.LMMessageLloydsSCM_Ext} - Reprocessed Message
   */
  public function unsuspendAndReprocessMessage(message: LMMessageLloydsSCM_Ext) : LMMessageLloydsSCM_Ext {
    if (message == null) {
      return null
    }

    message = _suspenseQueueService.unsuspendMessageEntity(message)
    message = reProcessMessage({message})
    message = message.refresh() as LMMessageLloydsSCM_Ext

    return message
  }
}