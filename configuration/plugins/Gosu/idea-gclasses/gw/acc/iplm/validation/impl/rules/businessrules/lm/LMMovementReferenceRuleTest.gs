package gw.acc.iplm.validation.impl.rules.businessrules.lm

uses gw.acc.iplm.exception.lm.LMErrorCodeType
uses gw.acc.iplm.testutils.AssertUtils
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.testharness.v3.GUnitTestClass

/**
 * Tests the LMMovementReferenceRule
 */
class LMMovementReferenceRuleTest extends GUnitTestClass {
  private var _rule: LMMovementReferenceRule
  private var _message: LMMessageLloydsSCM_Ext

  override function beforeMethod() {
    super.beforeMethod()
    _message = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
    _rule = new LMMovementReferenceRule()
  }

  public function testInvalidSequenceCodeCausesException() {
    _message.MovementReferenceSequence = "A0"
    AssertUtils.assertCausesLMExceptionWithType(\-> {
      _rule.validate(_message)
    }, LMErrorCodeType.INVALID_SEQUENCE)
  }

  public function testValidMovementReferenceDoesNotCauseException() {
    _message.MovementReferenceSequence = "AZ"
    AssertUtils.assertNoLMExceptionThrown(\-> {
      _rule.validate(_message)
    }, "A valid movement reference was provided but an error was thrown ")
  }
}