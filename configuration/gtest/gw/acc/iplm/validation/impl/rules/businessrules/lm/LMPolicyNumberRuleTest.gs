package gw.acc.iplm.validation.impl.rules.businessrules.lm

uses gw.acc.iplm.exception.lm.LMErrorCodeType
uses gw.acc.iplm.testutils.AssertUtils
uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.EntityUtil
uses gw.acc.iplm.validation.impl.rules.businessrules.lm.LMPolicyNumberRule
uses gw.testharness.v3.GUnitTestClass

class LMPolicyNumberRuleTest extends GUnitTestClass {

  private var _rule: LMPolicyNumberRule
  private var _message: LMMessageLloydsSCM_Ext

  override function beforeMethod() {
    super.beforeMethod()
    _message = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
    _rule = new LMPolicyNumberRule()
  }

  public function testNullPolicyNumber() {
    _message.PolicyNumber = null
    AssertUtils.assertCausesLMExceptionWithType(\-> {
      _rule.validate(_message)
    }, LMErrorCodeType.UCR_AND_POLICY_NUMBER_NOT_FOUND)
  }

  public function testInValidClaim() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      _message.PolicyNumber = "54-123456"
      _message.UCR = createClaim().UCR_Ext
      try {
        _rule.validate(_message)
      } catch (e: IllegalArgumentException) {
        fail("The XML had a valid Policy Number, but still failed validation rule")
      }
    })
  }

  public function testValidClaim() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      _message.UCR = createClaim().UCR_Ext
      _message.PolicyNumber = "54-123456"
      _message.UCR = createClaim().UCR_Ext
      try {
        _rule.validate(_message)
      } catch (e: IllegalArgumentException) {
        fail("The XML had a valid Policy Number, but still failed validation rule")
      }
    })
  }

  public function testValidPolicy() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      _message.UCR = "123"
      _message.PolicyNumber = "54-123456"
      _message.UCR = createClaim().UCR_Ext
      try {
        _rule.validate(_message)
      } catch (e: IllegalArgumentException) {
        fail("The XML had a valid Policy Number, but still failed validation rule")
      }
    })
  }

  public function testInValidPolicy() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      _message.UCR = "123"
      _message.PolicyNumber = "200000000102"
      AssertUtils.assertCausesLMExceptionWithType(\-> {
        _rule.validate(_message)
      }, LMErrorCodeType.UCR_AND_POLICY_NUMBER_NOT_FOUND)
    })
  }

  public function testInvalidClaimAndPolicy() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      _message.UCR = "1234"
      _message.PolicyNumber = "200000000102"
      AssertUtils.assertCausesLMExceptionWithType(\-> {
        _rule.validate(_message)
      }, LMErrorCodeType.UCR_AND_POLICY_NUMBER_NOT_FOUND)
    })
  }

  private static function createClaim(): Claim {
    return ClaimBuilderHelper.createClaim(true)
  }
}