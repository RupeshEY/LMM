package gw.acc.iplm.impl.validators

uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.EntityUtil
uses gw.acc.iplm.validation.impl.validators.SyndicateClaimMessageLogicValidator
uses gw.acc.iplm.validation.util.ECFValidationResult
uses gw.testharness.v3.GUnitTestClass

class SyndicateClaimMessageLogicValidatorTest extends GUnitTestClass {

  private var _validator : SyndicateClaimMessageLogicValidator

  override function beforeMethod() {
    _validator = new SyndicateClaimMessageLogicValidator()
  }

  function testValidate_ReturnsValidResult() {
    var result : ECFValidationResult
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var message = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      result = _validator.validate(message)
    })

    assertTrue(result.IsValid)
  }

  function testValidate_ReturnsInvalidResult() {
    var result : ECFValidationResult
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var message = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      message.PolicyNumber = null
      result = _validator.validate(message)
    })

    assertFalse(result.IsValid)
    assertNotNull(result.Error)
  }
}
