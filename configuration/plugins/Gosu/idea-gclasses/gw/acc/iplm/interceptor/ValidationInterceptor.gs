package gw.acc.iplm.interceptor

uses entity.LMMessage_Ext
uses gw.acc.iplm.validation.impl.validators.SyndicateClaimMessageLogicValidator
uses gw.acc.iplm.services.suspensequeue.ECFSuspenseQueueService
uses gw.acc.iplm.services.suspensequeue.LMSuspenseQueueService
uses gw.acc.iplm.services.suspensequeue.SuspenseQueueService
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.validation.impl.validators.ClaimNotifyLogicValidator
uses gw.acc.iplm.validation.impl.validators.ClaimRetrieveLogicValidator
uses gw.acc.iplm.validation.util.ECFValidationResult


/**
 * This class is the entry point for
 * business logic validations. It will
 * dispatch the execution to the appropriate
 * message type validator
 */
class ValidationInterceptor {

  static var LOGGER = ECFConstants.LOGGER_BLOCK()
  private var _suspenseQueueService: SuspenseQueueService

  /**
   * This method will take the message xml object representing
   * a LM message and dispatch it to the proper validator
   * depending on the message type.
   *
   * @param message the entity representing LM message.
   * @return boolean indicating if the validation pass or not.
   */
  public function validateBeforeProcessing(message: LMMessage_Ext): boolean {
    var result: boolean
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      result = validate(message)
    }, ECFConstants.ECF_SUPER_USER)
    return result
  }

  private function validate(message: LMMessage_Ext): boolean {
    var validationResult: ECFValidationResult
    switch (message.MessageType) {
      case ECFMessageType_Ext.TC_CLAIMNOTIFY:
        validationResult = new ClaimNotifyLogicValidator().validate(message as ECFMessageClaimNotifyRq_Ext)
		_suspenseQueueService = new ECFSuspenseQueueService()
        break
      case ECFMessageType_Ext.TC_RETRIEVECLAIM:
        validationResult = new ClaimRetrieveLogicValidator().validate(message as ECFMessageClaimRetrieveRs_Ext)
        _suspenseQueueService = new ECFSuspenseQueueService()
        break
      case ECFMessageType_Ext.TC_LLOYDSSYNDICATECLAIM:
        validationResult = new SyndicateClaimMessageLogicValidator().validate(message as LMMessageLloydsSCM_Ext)
        _suspenseQueueService = new LMSuspenseQueueService()
        break
      default:
        LOGGER.warn("{} is not configured for auto-validate preprocessing and will be skipped.", message.MessageType.DisplayName)
        return true
    }
    if (validationResult != null and not validationResult.IsValid) {
      _suspenseQueueService.suspendMessage(message, validationResult.ErrorCode, validationResult.Error)
      LOGGER.error("Business Validation failed for LM Message with UUID {}", message.UUID)
      return false
    }
    return true
  }
}