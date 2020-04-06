package gw.acc.iplm.validation.impl.rules.businessrules.lm

uses gw.acc.iplm.exception.lm.LMErrorCodeType
uses gw.acc.iplm.exception.lm.LMException
uses gw.acc.iplm.utils.LMSequenceUtil
uses gw.acc.iplm.validation.api.rules.LMMessageLogicValidationRule

/**
 * Validates the movement sequence of the SCM Message.
 * The first two characters must be a sequence code of value :
 * . AA, AB.. AZ through to TA..TZ
 * . or A1, A2.. A9 through to T9
 * . or XA, XB..XZ
 * . or UA, UB..UZ
 */
class LMMovementReferenceRule implements LMMessageLogicValidationRule<LMMessageLloydsSCM_Ext> {

  /**
   * Validates the message
   *
   * @param message entity representing the message
   */
  override function validate(message : LMMessageLloydsSCM_Ext) {
    validateMovementReferenceSequence(message.MovementReferenceSequence)
  }

  /**
   * Validates the sequence code
   *
   * @param sequenceCode the sequence code to validate
   */
  private function validateMovementReferenceSequence(sequenceCode : String) {
    if (!LMSequenceUtil.isValidCode(sequenceCode)) {
      throw new LMException(LMErrorCodeType.INVALID_SEQUENCE)
    }
  }

}