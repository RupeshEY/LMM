package gw.acc.iplm.validation.impl.rules.businessrules.ecf.claimdata

uses gw.acc.iplm.dao.PolicyDAO
uses gw.acc.iplm.dao.impl.ClaimDAO
uses gw.acc.iplm.dao.impl.PolicyDAOImpl
uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.validation.api.rules.LMMessageLogicValidationRule

/**
 * This validation rule applies to the ECFMessageClaimData_Ext.
 * First, we validate that Claim exists against particular UCR in the message,
 * if we find it then ignores Policy Number check.
 * However, if the claim does not exist for particular UCR, then we validate policy number. In this case,
 * policy number should exist in Policy System of Record(SOR)
 * <p>
 * In summary, Policy Number should be in the Policy SOR for new claims.
 */
class ECFPolicyNumberRule implements LMMessageLogicValidationRule<ECFMessageClaimData_Ext> {

  private static final var LOGGER = ECFConstants.LOGGER_BLOCK()
  private var _claimDAO: ClaimDAO
  private var _policyDAO: PolicyDAO

  construct() {
    _claimDAO = new ClaimDAO()
    _policyDAO = new PolicyDAOImpl()
  }

  override function validate(message: ECFMessageClaimData_Ext) {
    try {
      if (_claimDAO.findClaim(message.UCR) == null and
          (message.PolicyNumber == null
              or _policyDAO.findPolicy(message.PolicyNumber).first() == null)) {
        throw new ECFException(ECFErrorCodeType.CLAIM_DATA_POLICY_UCR_NOT_FOUND_ERROR)
      }
    } catch (e: Exception) {
      LOGGER.debug("Claim Data validation failed", e)
      throw e
    }
  }
}