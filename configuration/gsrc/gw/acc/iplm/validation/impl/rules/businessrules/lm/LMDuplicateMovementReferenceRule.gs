package gw.acc.iplm.validation.impl.rules.businessrules.lm

uses gw.acc.iplm.exception.lm.LMErrorCodeType
uses gw.acc.iplm.exception.lm.LMException
uses gw.acc.iplm.validation.api.rules.LMMessageLogicValidationRule
uses gw.api.database.Query
uses gw.api.database.Relop

/**
 * Validates the Movement Reference
 * <p>
 * Check if the Movement Reference is a duplicate, where this Movement Reference has already been processed for this OCR and UCR
 */
class LMDuplicateMovementReferenceRule implements LMMessageLogicValidationRule<LMMessageLloydsSCM_Ext> {

  override function validate(message : LMMessageLloydsSCM_Ext) {

    final var movementAlreadyReceived = Query.make(LMMessageLloydsSCM_Ext)
        .compare(LMMessageLloydsSCM_Ext#UCR, Relop.Equals, message.UCR)
        .compare(LMMessageLloydsSCM_Ext#OCR, Relop.Equals, message.OCR)
        .compare(LMMessageLloydsSCM_Ext#MovementReferenceSequence, Relop.Equals, message.MovementReferenceSequence)
        .select().hasMatch(\msg -> msg.UUID != message.UUID)

    if (movementAlreadyReceived) {
      throw new LMException(LMErrorCodeType.DUPLICATE_MOVEMENT)
    }
  }
}