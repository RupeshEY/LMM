package gw.acc.iplm.validation.impl.rules.businessrules.ecf.claimretrieve

uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.testharness.v3.GUnitTestClass

class ECFNoClaimDataRuleTest extends GUnitTestClass {

  private var _rule = new ECFNoClaimDataRule()
  private var _message : ECFMessageClaimRetrieveRs_Ext

  override function beforeMethod(){
    super.beforeMethod()
    _message  = ECFMessageEntityUtil.createClaimRetrieveRs()
  }

  public function testValidClaimData() {
    try {
      _rule.validate(_message)
    } catch (e: IllegalArgumentException) {
      fail("The XML had valid Claim Data, but still failed validation rule")
    }
  }

  public function testNoClaimData_MessageRejected() {
    _message.ResponseAcknowledgement.AcknowledgementStatus = ECFAcknowledgementStatus_Ext.TC_REJECTED
    assertCausesException(\-> {
      _rule.validate(_message)
    }, ECFException)
  }

  public function testNoClaimData_NoClaimDataInMessage() {
    _message.ResponseAcknowledgement.AckLevel = ECFAckLevelCode_Ext.TC_CLAIMNOTFOUND
    assertCausesException(\-> {
      _rule.validate(_message)
    }, ECFException)
  }
}