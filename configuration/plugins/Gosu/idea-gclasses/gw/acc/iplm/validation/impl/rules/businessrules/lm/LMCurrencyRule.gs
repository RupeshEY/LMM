package gw.acc.iplm.validation.impl.rules.businessrules.lm

uses gw.acc.iplm.exception.lm.LMErrorCodeType
uses gw.acc.iplm.exception.lm.LMException
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.validation.api.rules.LMMessageLogicValidationRule

/**
 * Validates the Message's Original and Settlement Currencies
 *
 * If either the Original or Settlement Currencies are null - because they weren't part of the Currency Typelist 
 * or were null in the message - the message gets suspended
 */
class LMCurrencyRule implements LMMessageLogicValidationRule<LMMessageLloydsSCM_Ext> {
  private static final var LOGGER = ECFConstants.LOGGER_BLOCK()

  override function validate(message: LMMessageLloydsSCM_Ext) {
    if (message.OriginalCurrency == null) {
      LOGGER.warn("No valid Original Currency was found")
      throw new LMException(LMErrorCodeType.UNKNOWN_ORIGINAL_CURRENCY)
    }
    if (message.SettlementCurrency == null) {
      LOGGER.warn("No valid Settlement Currency was found")
      throw new LMException(LMErrorCodeType.UNKNOWN_SETTLEMENT_CURRENCY)
    }
  }
}