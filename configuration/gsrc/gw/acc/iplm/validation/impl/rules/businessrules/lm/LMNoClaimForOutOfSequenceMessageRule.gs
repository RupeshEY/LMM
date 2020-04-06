package gw.acc.iplm.validation.impl.rules.businessrules.lm

uses gw.acc.iplm.dao.impl.ClaimDAO
uses gw.acc.iplm.exception.lm.LMErrorCodeType
uses gw.acc.iplm.exception.lm.LMException
uses gw.acc.iplm.utils.LMSequenceUtil
uses gw.acc.iplm.validation.api.rules.LMMessageLogicValidationRule

/**
 * Validates that an Out of Sequence SCM Message (Movement Reference Codes XA..XZ or UA..UZ)
 * has to have a Claim before it's processed (i.e. cannot create a claim)
 */
class LMNoClaimForOutOfSequenceMessageRule implements LMMessageLogicValidationRule<LMMessageLloydsSCM_Ext> {

  private var _claimDAO: ClaimDAO as ClaimDAO

  construct() {
    this(new ClaimDAO())
  }

  construct(claimDAO: ClaimDAO) {
    _claimDAO = claimDAO
  }

  override function validate(message : LMMessageLloydsSCM_Ext) {
    final var isOutOfSequence = LMSequenceUtil.isOutOfSequenceCode(message.MovementReferenceSequence)
    final var claim = _claimDAO.findClaim(message.UCR)

    if (isOutOfSequence and claim == null) {
      throw new LMException(LMErrorCodeType.NO_CLAIM_FOR_OUT_OF_SEQUENCE_MESSAGE)
    }
  }
}