package gw.acc.iplm.validation.impl.validators

uses com.google.common.collect.ImmutableList
uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.validation.api.rules.LMMessageLogicValidationRule
uses gw.acc.iplm.validation.impl.rules.businessrules.ecf.claimdata.ECFMessageInSuspenseQueueRule
uses gw.acc.iplm.validation.impl.rules.businessrules.ecf.claimdata.ECFParallelClaimExistsRule
uses gw.acc.iplm.validation.impl.rules.businessrules.ecf.claimdata.ECFPolicyNumberRule
uses gw.acc.iplm.validation.impl.rules.businessrules.ecf.claimdata.ECFInsurerDetailsRule
uses gw.acc.iplm.validation.impl.rules.businessrules.ecf.claimdata.ECFReceiverExistsRule
uses gw.acc.iplm.validation.impl.rules.businessrules.ecf.claimretrieve.ECFNoClaimDataRule
uses gw.acc.iplm.validation.util.ECFValidationResult
uses gw.acc.iplm.validation.util.ECFValidationResultFactory

class ClaimRetrieveLogicValidator {

  //Note: This is an ordered list, be aware of the order of rule excution before editing this
  private final var rules: List<LMMessageLogicValidationRule> = ImmutableList.of(
      new ECFMessageInSuspenseQueueRule(),
      new ECFNoClaimDataRule(),
      new ECFPolicyNumberRule(),
      new ECFParallelClaimExistsRule(),
      new ECFReceiverExistsRule(),
      new ECFInsurerDetailsRule()
  )
  private var result = ECFValidationResultFactory

  function validate(message: ECFMessageClaimRetrieveRs_Ext): ECFValidationResult {
    try {
      rules.each(\rule -> rule.validate(message))
    } catch (ecfException: ECFException) {
      return result.invalidResult(ecfException.Message, ecfException.ECFErrorCode.ErrorCode)
    }
    return result.validResult()
  }
}