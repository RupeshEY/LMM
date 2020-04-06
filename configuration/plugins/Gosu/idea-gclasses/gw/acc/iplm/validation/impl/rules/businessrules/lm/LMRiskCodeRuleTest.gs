package gw.acc.iplm.validation.impl.rules.businessrules.lm

uses gw.acc.iplm.exception.lm.LMErrorCodeType
uses gw.acc.iplm.testutils.AssertUtils
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.api.database.Query
uses gw.testharness.v3.GUnitTestClass

/**
 * Tests the LMRiskCode rule
 */
class LMRiskCodeRuleTest extends GUnitTestClass {
  private var _rule: LMRiskCodeRule
  private var _message: LMMessageLloydsSCM_Ext

  override function beforeMethod() {
    super.beforeMethod()
    _message = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
    _rule = new LMRiskCodeRule()
  }

  public function testNullRiskCodeCausesErrorToBeThrown() {
    _message.SCMRiskCode = null
    AssertUtils.assertCausesLMExceptionWithType(\-> {
      _rule.validate(_message)
    }, LMErrorCodeType.RISK_CODE_NULL_OR_NOT_FOUND)
  }

  public function testNoLMErrorThrownIfValidRiskCode() {
    _message.SCMRiskCode = getValidRiskCode()
    AssertUtils.assertNoLMExceptionThrown(\-> {
      _rule.validate(_message)
        }, "The message had a valid SCMRiskCode but failed validation")
  }

  private function getValidRiskCode():SCMRiskCode_Ext
  {
    return Query.make(SCMRiskCode_Ext).select().FirstResult
  }
}