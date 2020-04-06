package gw.acc.iplm.utils.pcf.search

uses gw.acc.iplm.dao.impl.ClaimDAO
uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.api.util.DisplayableException
uses gw.testharness.v3.GUnitTestClass
uses org.mockito.Mockito

class ECFClaimSearchTest extends GUnitTestClass {

  private static var _ecfClaimSearch: ECFClaimSearch
  private static var _claimDao: ClaimDAO

  override function beforeMethod() {
    super.beforeMethod()
    _claimDao = Mockito.mock(ClaimDAO)
    _ecfClaimSearch = new ECFClaimSearch(_claimDao)
  }

  function testPassesUcrToClaimDao() {
    var testUcr = ClaimBuilderHelper.getNextUCR()

    var criteria = new ECFClaimSearchCriteria()
    criteria.UCR = testUcr

    _ecfClaimSearch.ECFClaimSearchCriteria = criteria
    _ecfClaimSearch.search()

    Mockito.verify(_claimDao).findClaims(testUcr, null)
  }

  function testPassesUmrToClaimDao() {
    var testUmr = ClaimBuilderHelper.getNextUCR()

    var criteria = new ECFClaimSearchCriteria()
    criteria.UMR = testUmr

    _ecfClaimSearch.ECFClaimSearchCriteria = criteria
    _ecfClaimSearch.search()

    Mockito.verify(_claimDao).findClaims(null, testUmr)
  }

  function testPassesUcrAndUmrToClaimDao() {
    var testUmr = Long.toString(System.currentTimeMillis()).substring(0, 10)
    var testUcr = ClaimBuilderHelper.getNextUCR()

    var criteria = new ECFClaimSearchCriteria()
    criteria.UMR = testUmr
    criteria.UCR = testUcr

    _ecfClaimSearch.ECFClaimSearchCriteria = criteria
    _ecfClaimSearch.search()

    Mockito.verify(_claimDao).findClaims(testUcr, testUmr)
  }

  function testExceptionThrownIfNoCriteriaFields() {
    _ecfClaimSearch.ECFClaimSearchCriteria = new ECFClaimSearchCriteria()
    assertCausesException(\-> {
      _ecfClaimSearch.search()
    }, DisplayableException)
  }

}