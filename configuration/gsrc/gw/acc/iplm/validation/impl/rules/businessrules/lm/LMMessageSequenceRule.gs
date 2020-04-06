package gw.acc.iplm.validation.impl.rules.businessrules.lm

uses gw.acc.iplm.dao.impl.ClaimDAO
uses gw.acc.iplm.exception.lm.LMErrorCodeType
uses gw.acc.iplm.exception.lm.LMException
uses gw.acc.iplm.validation.api.rules.LMMessageLogicValidationRule

/**
 * Validates the sequencing of SCM messages.
 *
 * SCM messages need to be processed in order for each OCR grouping.
 * This rule will suspend the message under processing if the message with the previous sequence number
 * hasn't been processed yet.
 */
class LMMessageSequenceRule implements LMMessageLogicValidationRule<LMMessageLloydsSCM_Ext> {
  private var _claimDAO: ClaimDAO as ClaimDAO

  construct() {
    _claimDAO = new ClaimDAO()
  }

  override function validate(message: LMMessageLloydsSCM_Ext) {
    final var claim = _claimDAO.findClaim(message.UCR)
    final var lastMessage = claim?.getHighestSCMMessageSequenceByOCR(message.OCR, message.UUID)
    final var expectedSequence = lastMessage == null ? 1 : lastMessage.MessageSequence + 1

    if (message.MessageSequence > expectedSequence) {
      throw new LMException(LMErrorCodeType.PREVIOUS_MOVEMENT_NOT_POSTED)
    }
  }
}