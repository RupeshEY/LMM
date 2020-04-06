package gw.acc.iplm.validation.impl.rules.businessrules.ecf.claimdata

uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.validation.api.rules.LMMessageLogicValidationRule
uses org.apache.commons.lang3.StringUtils

class ECFReceiverExistsRule implements LMMessageLogicValidationRule<ECFMessageClaimData_Ext> {
  private static final var LOGGER = ECFConstants.LOGGER_BLOCK()

  /**
   * Validates if the Receiver Party ID and Agency exist in the message.
   *
   * @param message the ECFMessageClaimData_Ext to check against
   * @throws IllegalArgumentException If Receiver details don't exist
   */
  override function validate(message: ECFMessageClaimData_Ext) {
    var receiverFields = {message.ReceiverPartyId, message.ReceiverPartyAgency}

    if (receiverFields.hasMatch(\field -> StringUtils.isBlank(field))) {
      LOGGER.warn("One or more receiver fields in the message are empty. ${receiverFields}")
      throw new ECFException(ECFErrorCodeType.MISSING_RECEIVER_FIELDS)
    }
  }
}