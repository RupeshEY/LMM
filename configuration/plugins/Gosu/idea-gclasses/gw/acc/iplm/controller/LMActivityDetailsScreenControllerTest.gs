package gw.acc.iplm.controller

uses gw.acc.iplm.services.activity.ecfwb.ECFActivityCreationService
uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.EntityUtil
uses gw.acc.iplm.utils.ECFConstants
uses gw.testharness.v3.GUnitTestClass
uses org.mockito.Mockito
uses pcf.api.Location

class LMActivityDetailsScreenControllerTest extends GUnitTestClass {
  function testRejectActivity() {
    var currentLocation = mockCurrentLocation()
    Mockito.doNothing().when(currentLocation).commit()
    var activity = createActivity()
    var controller = new LMActivityDetailsScreenController(activity, currentLocation)

    assertEquals(activity.Status, ActivityStatus.TC_OPEN)
    // Running on a bundle because we need to have a User loaded.
    // The commit will be handled by the controller itself.
    EntityUtil.runAsUnrestrictedUserNoCommit(\-> controller.rejectActivity())
    assertTrue(activity.Rejected)
    Mockito.verify(currentLocation, Mockito.times(1)).commit()
  }

  function testRejectActivity_ResetsValues() {
    var currentLocation = mockCurrentLocation()
    Mockito.doThrow(new RuntimeException("This is an exception")).when(currentLocation).commit()
    var activity = createActivity()
    var controller = new LMActivityDetailsScreenController(activity, currentLocation)

    assertEquals(activity.Status, ActivityStatus.TC_OPEN)
    // Running on a bundle because we need to have a User loaded.
    // The commit will be handled by the controller itself.
    EntityUtil.runAsUnrestrictedUserNoCommit(\ -> controller.rejectActivity())
    assertFalse(activity.Rejected)
    Mockito.verify(currentLocation, Mockito.times(1)).commit()
  }

  private function mockCurrentLocation() : Location {
    var currentLocation = Mockito.mock(Location)

    Mockito.when(currentLocation.isInEditMode()).thenReturn(true);

    return currentLocation
  }

  private function createActivity() : Activity {
    var msg = ECFMessageEntityUtil.createClaimResponseRq()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      msg.Claim = ClaimBuilderHelper.createClaim()
    }, ECFConstants.ECF_SUPER_USER)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      new ECFActivityCreationService().createActivityForClaimResponseAuthorisation(msg)
    }, ECFConstants.ECF_SUPER_USER)

    return getLatestActivityForClaim(msg.Claim, "approve_ecf_transaction")
  }

  private function getLatestActivityForClaim(claim : Claim, activityPatternCode : String = ECFConstants.ECF_CLAIM_ACTIVITY_PATTERN_CODE) : Activity {
    return claim.Activities.orderBy(\elt -> elt.CreateTime).lastWhere(\elt -> elt.ActivityPattern.Code == activityPatternCode)
  }
}