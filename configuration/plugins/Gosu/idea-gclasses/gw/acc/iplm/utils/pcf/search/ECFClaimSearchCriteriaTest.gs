package gw.acc.iplm.utils.pcf.search

uses gw.testharness.v3.GUnitTestClass

class ECFClaimSearchCriteriaTest extends GUnitTestClass {

  private var _ecfClaimSearchCriteria: ECFClaimSearchCriteria

  override function beforeMethod() {
    super.beforeMethod()
    _ecfClaimSearchCriteria = new ECFClaimSearchCriteria()
  }

  function testCriteriaPresentTrueWhenHasField() {
    _ecfClaimSearchCriteria.UCR = "1234"
    assertTrue(_ecfClaimSearchCriteria.criteriaPresent())
  }

  function testCriteriaPresentFalseWhenHasNoField() {
    assertFalse(_ecfClaimSearchCriteria.criteriaPresent())
  }

}