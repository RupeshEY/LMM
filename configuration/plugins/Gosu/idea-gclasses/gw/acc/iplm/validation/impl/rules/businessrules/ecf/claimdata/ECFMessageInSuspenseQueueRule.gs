package gw.acc.iplm.validation.impl.rules.businessrules.ecf.claimdata

uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.services.suspensequeue.ECFSuspenseQueueService
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.validation.api.rules.LMMessageLogicValidationRule

/**
 * This validation rule applies to the ECFMessageClaimData_Ext.
 * We check if there is one or more message in the suspense queue for the same
 * combination of UMR, UCR, and TR of the incoming message.
 * If we find it then the validation fails and the given message is put in the
 * suspense queue as well.
 */
class ECFMessageInSuspenseQueueRule implements LMMessageLogicValidationRule<ECFMessageClaimData_Ext> {

  private static final var LOGGER = ECFConstants.LOGGER_BLOCK()
  private var  _ecfSuspenseQueueService: ECFSuspenseQueueService

  construct() {
    _ecfSuspenseQueueService = new ECFSuspenseQueueService()
  }

  override function validate(message: ECFMessageClaimData_Ext) {
    try {
      if (_ecfSuspenseQueueService.isMessageTransactionAlreadyInSuspenseQueue(message)) {
        throw new ECFException(ECFErrorCodeType.MESSAGE_TRANSACTION_ALREADY_SUSPENDED_ERROR, {message.UMR, message.UCR, message.TR})
      }
    } catch (e: Exception) {
      LOGGER.debug("ECF Suspense queue validation failed", e)
      throw e
    }
  }
}