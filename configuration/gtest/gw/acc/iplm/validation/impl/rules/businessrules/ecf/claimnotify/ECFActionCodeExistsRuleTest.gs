package gw.acc.iplm.validation.impl.rules.businessrules.ecf.claimnotify

uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.testharness.v3.GUnitTestClass

class ECFActionCodeExistsRuleTest extends GUnitTestClass {

  private var _rule = new ECFActionCodeExistsRule()
  private var _message : ECFMessageClaimNotifyRq_Ext

  override function beforeMethod(){
    super.beforeMethod()
    _message  = ECFMessageEntityUtil.createClaimNotifyRq()
  }

  public function testValidActionCode() {
    try {
      _rule.validate(_message)
    } catch (e: IllegalArgumentException) {
      fail("The XML had a valid Action Code, but still failed validation rule")
    }
  }

  public function testNullActionCode() {
    _message.ActionCode = null
    assertCausesException(\-> {
      _rule.validate(_message)
    }, ECFException)
  }
}