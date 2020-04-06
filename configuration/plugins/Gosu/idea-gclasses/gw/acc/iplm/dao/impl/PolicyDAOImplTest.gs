package gw.acc.iplm.dao.impl

uses gw.acc.iplm.dao.PolicyDAO
uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.testutils.AssertUtils
uses gw.acc.iplm.testutils.EntityUtil
uses gw.testharness.v3.GUnitTestClass


class PolicyDAOImplTest extends GUnitTestClass {

  var _policyDAO:PolicyDAO

  override function beforeMethod() {
    super.beforeMethod()
    _policyDAO = new PolicyDAOImpl()
  }

  public function testValidPolicyNumber() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var policyNumber = "54-123456"
      var policySummary = _policyDAO.findPolicy(policyNumber)
      assertEquals(policySummary.length, 1)
      assertEquals(policySummary.first().PolicyNumber, policyNumber)
    })
  }

  public function testInValidPolicyNumber() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var policyNumber = "200000000102"
      var policySummary = _policyDAO.findPolicy(policyNumber)
      assertEquals(policySummary.length, 0)
    })
  }

  public function testInvalidPolicyNumberWithEmptyString() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      AssertUtils.assertCausesECFExceptionWithType(\-> _policyDAO.findPolicy(""), ECFErrorCodeType.POLICY_NUMBER_BLANK)
    })
  }

  public function testNullPolicyNumber() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      AssertUtils.assertCausesECFExceptionWithType(\-> _policyDAO.findPolicy(""), ECFErrorCodeType.POLICY_NUMBER_BLANK)
    })
  }
}