package gw.acc.iplm.validation.impl.rules.businessrules.lm

uses gw.acc.iplm.dao.PolicyDAO
uses gw.acc.iplm.dao.impl.ClaimDAO
uses gw.acc.iplm.dao.impl.PolicyDAOImpl
uses gw.acc.iplm.exception.lm.LMErrorCodeType
uses gw.acc.iplm.exception.lm.LMException
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.validation.api.rules.LMMessageLogicValidationRule

/**
 * Validates the message UCR and Policy Number.
 *
 * First, we validate that Claim exists against particular UCR in the message,
 * if we find it then ignores Policy Number check.
 * However, if the claim does not exist for particular UCR, then we validate policy number. In this case,
 * policy number should exist in Policy System of Record(SOR)
 * <p>
 * In summary, Policy Number should be in the Policy SOR for new claims.
 */
class LMPolicyNumberRule implements LMMessageLogicValidationRule<LMMessageLloydsSCM_Ext> {
  private static final var LOGGER = ECFConstants.LOGGER_BLOCK()
  private var _claimDAO: ClaimDAO
  private var _policyDAO: PolicyDAO

  construct() {
    _claimDAO = new ClaimDAO()
    _policyDAO = new PolicyDAOImpl()
  }

  override function validate(message: LMMessageLloydsSCM_Ext) {
    try {
      if (_claimDAO.findClaim(message.UCR) == null and
          (message.PolicyNumber == null
              or _policyDAO.findPolicy(message.PolicyNumber).first() == null)) {
        throw new LMException(LMErrorCodeType.UCR_AND_POLICY_NUMBER_NOT_FOUND)
      }
    } catch (e: Exception) {
      LOGGER.debug("Validation failed", e)
      throw e
    }
  }
}