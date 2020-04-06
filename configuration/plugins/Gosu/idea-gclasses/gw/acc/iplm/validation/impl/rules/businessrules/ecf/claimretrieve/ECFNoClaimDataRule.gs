package gw.acc.iplm.validation.impl.rules.businessrules.ecf.claimretrieve

uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.validation.api.rules.LMMessageLogicValidationRule

/**
 * This validation rule applies to the RetrieveClaimRs
 * This rule will check that the RetrieveClaimRs contained Claim Data for processing a new Claim
 */
class ECFNoClaimDataRule implements LMMessageLogicValidationRule<ECFMessageClaimRetrieveRs_Ext> {

  private static final var LOGGER = ECFConstants.LOGGER_BLOCK()

  /**
   * Validates that the Claim Retrieve message contains Claim data where a Claim to update does not already exist
   *
   * @param message the ECFMessageClaimRetrieveRs_Ext to check against
   * @throws IllegalArgumentException if there is no Claim data to create a new Claim
   */
  override public function validate(message: ECFMessageClaimRetrieveRs_Ext) {
    try {
      if ((message.ResponseAcknowledgement.IsRejected or message.ResponseAcknowledgement.HasNoClaimData) and message.Claim == null) {
        throw new ECFException(message.ResponseAcknowledgement.ErrorMessage)
      }
    } catch (e: Exception) {
      LOGGER.debug("Claim Retrieve validation failed", e)
      throw e
    }
  }


}