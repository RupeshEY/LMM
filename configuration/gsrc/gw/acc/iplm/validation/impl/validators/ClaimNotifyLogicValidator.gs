package gw.acc.iplm.validation.impl.validators

uses com.google.common.collect.ImmutableList
uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.validation.api.rules.LMMessageLogicValidationRule
uses gw.acc.iplm.validation.impl.rules.businessrules.ecf.claimdata.ECFMessageInSuspenseQueueRule
uses gw.acc.iplm.validation.impl.rules.businessrules.ecf.claimdata.ECFParallelClaimExistsRule
uses gw.acc.iplm.validation.impl.rules.businessrules.ecf.claimdata.ECFPolicyNumberRule
uses gw.acc.iplm.validation.impl.rules.businessrules.ecf.claimdata.ECFReceiverExistsRule
uses gw.acc.iplm.validation.impl.rules.businessrules.ecf.claimnotify.ECFActionCodeExistsRule
uses gw.acc.iplm.validation.impl.rules.businessrules.ecf.claimdata.ECFInsurerDetailsRule
uses gw.acc.iplm.validation.util.ECFValidationResult
uses gw.acc.iplm.validation.util.ECFValidationResultFactory

class ClaimNotifyLogicValidator {

  //Note: This is an ordered list, be aware of the order of rule excution before editing this
  private final var rules: List<LMMessageLogicValidationRule> = ImmutableList.of(
      new ECFMessageInSuspenseQueueRule(),
      new ECFActionCodeExistsRule(),
      new ECFReceiverExistsRule(),
      new ECFInsurerDetailsRule(),
      new ECFPolicyNumberRule(),
      new ECFParallelClaimExistsRule()
  )
  private var result = ECFValidationResultFactory

  function validate(message: ECFMessageClaimNotifyRq_Ext): ECFValidationResult {
    try {
      rules.each(\rule -> rule.validate(message))
    } catch (ecfException : ECFException) {
      return result.invalidResult(ecfException.Message, ecfException.ECFErrorCode.ErrorCode)
    }
    return result.validResult()
  }
}