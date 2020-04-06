package gw.acc.iplm.dao.impl

uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.testharness.v3.GUnitTestClass

class ClaimDAOTest extends GUnitTestClass {

  private static var _claimDao: ClaimDAO

  override function beforeMethod() {
    super.beforeMethod()
    _claimDao = new ClaimDAO()
  }

  function testFindsClaimWithUcrCriteria() {
    var claim = ClaimBuilderHelper.createClaim()
    var testUcr = ClaimBuilderHelper.getNextUCR()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claim = bundle.add(claim)
      claim.UCR_Ext = testUcr
    }, "su")

    var result = _claimDao.findClaims(testUcr, null)
    assertEquals(1, result.Count)
    assertEquals(claim.ClaimNumber, result.first().ClaimNumber)
  }

  function testFindsClaimWithUmrCriteria() {
    var claim1 = ClaimBuilderHelper.createClaim()
    var claim2 = ClaimBuilderHelper.createClaim()
    var claim3 = ClaimBuilderHelper.createClaim()

    var testUmr = Long.toString(System.currentTimeMillis())
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claim1 = bundle.add(claim1)
      claim1.UMR_Ext = testUmr
      claim2 = bundle.add(claim2)
      claim2.UMR_Ext = testUmr
      claim3 = bundle.add(claim3)
      claim3.UMR_Ext = testUmr
    }, "su")

    var result = _claimDao.findClaims(null, testUmr)
    assertEquals(3, result.Count)
  }

  function testFindsClaimWithUcrAndUmrCriteria() {
    var claim1 = ClaimBuilderHelper.createClaim()
    var claim2 = ClaimBuilderHelper.createClaim()

    var testUmr = Long.toString(System.currentTimeMillis())
    var testUcr = ClaimBuilderHelper.getNextUCR()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claim1 = bundle.add(claim1)
      claim1.UMR_Ext = testUmr
      claim1.UCR_Ext = testUcr

      claim2 = bundle.add(claim2)
      claim2.UMR_Ext = testUmr
      claim2.UCR_Ext = "blah"
    }, "su")

    var result = _claimDao.findClaims(testUcr, testUmr)
    assertEquals(1, result.Count)
  }

  function testNullValuesThrowException() {
    assertCausesException(\-> {
      _claimDao.findClaims(null, null)
    }, IllegalArgumentException)
  }
}