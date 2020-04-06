package gw.acc.iplm.enhancements.entity

uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.EntityUtil
uses gw.acc.iplm.utils.ECFConstants
uses gw.testharness.v3.GUnitTestClass
uses org.mockito.Mockito

class ECFActivityEnhancementTest extends GUnitTestClass {

  function testECFApproval_true() {
    var claim = ClaimBuilderHelper.createClaim()
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var activity = claim.createActivityFromPattern(null, ActivityPattern.finder.getActivityPatternByCode(ECFConstants.ECF_TRANSACTION_APPROVAL_PATTERN))
      assertTrue(activity.ECFApproval)
    })
  }

  function testECFApproval_false() {
    var claim = ClaimBuilderHelper.createClaim()
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var activity = claim.createActivityFromPattern(null, ActivityPattern.finder.getActivityPatternByCode(ECFConstants.ECF_CLAIM_ACTIVITY_PATTERN_CODE))
      assertFalse(activity.ECFApproval)
    })
  }

  function testRejected_True() {
    var activity = Mockito.mock(Activity)

    Mockito.when(activity.Approved).thenReturn(false)
    Mockito.when(activity.Status).thenReturn(ActivityStatus.TC_COMPLETE)

    assertTrue(activity.Rejected)
  }

  function testRejected_ActivityWasApproved() {
    var activity = Mockito.mock(Activity)

    Mockito.when(activity.Approved).thenReturn(true)
    Mockito.when(activity.Status).thenReturn(ActivityStatus.TC_COMPLETE)

    assertFalse(activity.Rejected)
  }

  function testRejected_ActivityNotComplete() {
    var activity = Mockito.mock(Activity)

    Mockito.when(activity.Approved).thenReturn(null)
    Mockito.when(activity.Status).thenReturn(ActivityStatus.TC_OPEN)

    assertFalse(activity.Rejected)
  }

  function testComplete() {
    var activity = Mockito.mock(Activity)
    Mockito.when(activity.Status).thenReturn(ActivityStatus.TC_COMPLETE)
    assertTrue(activity.Complete)
  }

  function testComplete_False() {
    var activity = Mockito.mock(Activity)
    Mockito.when(activity.Status).thenReturn(ActivityStatus.TC_OPEN)
    assertFalse(activity.Complete)
  }

}