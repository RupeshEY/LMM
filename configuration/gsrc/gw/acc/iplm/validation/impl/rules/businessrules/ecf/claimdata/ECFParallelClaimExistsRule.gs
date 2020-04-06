package gw.acc.iplm.validation.impl.rules.businessrules.ecf.claimdata

uses gw.acc.iplm.dao.impl.ClaimDAO
uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.validation.api.rules.LMMessageLogicValidationRule

/**
 * This rule will check that if the message has/have valid  Parallel Claim/s UCR, and if PUCR matches message UCR.
 */
class ECFParallelClaimExistsRule implements LMMessageLogicValidationRule<ECFMessageClaimData_Ext> {

  private static final var LOGGER = ECFConstants.LOGGER_BLOCK()
  private var _claimDAO = new ClaimDAO()

  /**
   * Check that if the message has/have valid Parallel Claim/s UCR, and if the PUCR matches the message UCR.
   */
  override function validate(message: ECFMessageClaimData_Ext) {
    if (message.ParallelClaimsUCR?.length == 1) {
      var pucr = message.ParallelClaimsUCR.first().PUCR
      try {
        checkPucrIsNotUcr(pucr, message.UCR)
        checkPucrExistsInDatabase(pucr)
      } catch (e: Exception) {
        LOGGER.debug("Claim Data validation failed", e)
        throw e
      }
    }
  }

  private function checkPucrIsNotUcr(pucr: String, ucr: String) {
    if (pucr == ucr) {
      throw new ECFException(ECFErrorCodeType.PARALLEL_CLAIM_UCR_MATCHES_CURRENT_MESSAGE_UCR, pucr)
    }
  }

  private function checkPucrExistsInDatabase(ucr: String) {
    var parallelClaim: Claim
    try {
      parallelClaim = _claimDAO.findClaim(ucr)
    } finally {
      if (parallelClaim == null) {
        throw new ECFException(ECFErrorCodeType.PARALLEL_CLAIM_UCR_NOT_FOUND_ERROR, ucr)
      }
    }
  }
}