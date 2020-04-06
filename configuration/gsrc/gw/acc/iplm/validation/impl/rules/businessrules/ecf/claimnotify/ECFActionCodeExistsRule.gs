package gw.acc.iplm.validation.impl.rules.businessrules.ecf.claimnotify

uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.validation.api.rules.LMMessageLogicValidationRule

/**
 * This validation rule applies to the ClaimNotifyEventRq field
 * at ClaimNotifyEventRq/ClaimMovement/Explanation also know as the Action Code.
 * This rule will check that a valid Action Code exists in the ECFMessageClaimNotifyRq_Ext entity
 */
class ECFActionCodeExistsRule implements LMMessageLogicValidationRule<ECFMessageClaimNotifyRq_Ext> {

  private static final var LOGGER = ECFConstants.LOGGER_BLOCK()
  /**
   * Validates that the Claim Notify message contains a valid Action Code
   * ClaimNotifyEventRq/ClaimMovement/Explanation
   *
   * @param message the ECFMessageClaimNotifyRq_Ext to check against
   * @throws IllegalArgumentException if the Explanation field does not contain a valid Action Code
   */
  override public function validate(message: ECFMessageClaimNotifyRq_Ext) {
    try {
      if (message.ActionCode == null) {
        throw new ECFException(ECFErrorCodeType.CLAIM_NOTIFY_INVALID_ACTION_CODE_ERROR)
      }
    } catch (e: Exception) {
      LOGGER.debug("Claim Notify validation failed", e)
      throw e
    }
  }
}