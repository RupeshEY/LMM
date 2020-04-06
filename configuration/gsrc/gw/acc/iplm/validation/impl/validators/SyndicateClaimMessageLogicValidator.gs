package gw.acc.iplm.validation.impl.validators

uses com.google.common.collect.ImmutableList
uses gw.acc.iplm.exception.lm.LMException
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.validation.api.rules.LMMessageLogicValidationRule
uses gw.acc.iplm.validation.impl.rules.businessrules.lm.LMBrokerNumberRule
uses gw.acc.iplm.validation.impl.rules.businessrules.lm.LMCurrencyRule
uses gw.acc.iplm.validation.impl.rules.businessrules.lm.LMMessageSequenceRule
uses gw.acc.iplm.validation.impl.rules.businessrules.lm.LMDuplicateMovementReferenceRule
uses gw.acc.iplm.validation.impl.rules.businessrules.lm.LMMovementReferenceRule
uses gw.acc.iplm.validation.impl.rules.businessrules.lm.LMNoClaimForOutOfSequenceMessageRule
uses gw.acc.iplm.validation.impl.rules.businessrules.lm.LMPolicyNumberRule
uses gw.acc.iplm.validation.impl.rules.businessrules.lm.LMRiskCodeRule
uses gw.acc.iplm.validation.util.ECFValidationResult
uses gw.acc.iplm.validation.util.ECFValidationResultFactory

class SyndicateClaimMessageLogicValidator {

  private static final var LOGGER = ECFConstants.LOGGER_BLOCK()

  //Note: This is an ordered list, be aware of the order of rule excution before editing this.
  //      Rules that validate the validity of a field should be executed before business validations
  protected final var rules: List<LMMessageLogicValidationRule> = ImmutableList.of(
      new LMBrokerNumberRule(),
      new LMPolicyNumberRule(),
      new LMCurrencyRule(),
      new LMMovementReferenceRule(),
      new LMDuplicateMovementReferenceRule(),
      new LMMessageSequenceRule(),
      new LMRiskCodeRule(),
      new LMNoClaimForOutOfSequenceMessageRule())

  private var result = ECFValidationResultFactory

  public function validate(message: LMMessageLloydsSCM_Ext): ECFValidationResult {
    try {
      for (rule in rules) {
        rule.validate(message)
      }
    } catch (ex : LMException) {
      return result.invalidResult(ex.Message, ex.LMErrorCode.ErrorCode)
    }
    return result.validResult()
  }
}