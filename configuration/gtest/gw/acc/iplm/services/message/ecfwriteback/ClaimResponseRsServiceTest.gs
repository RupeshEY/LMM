package gw.acc.iplm.services.message.ecfwriteback

uses gw.acc.iplm.services.activity.ecfwb.ECFActivityCreationService
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.testharness.v3.GUnitTestClass
uses org.mockito.Mockito

class ClaimResponseRsServiceTest extends GUnitTestClass {

  private var _claimResponseRsService: ClaimResponseRsService

  override function beforeMethod() {
    super.beforeMethod()
    _claimResponseRsService = new ClaimResponseRsService()
  }

  function testCreateActivities() {
    _claimResponseRsService._activityCreationService = Mockito.mock(ECFActivityCreationService)
    var claimResponse = ECFMessageEntityUtil.createClaimResponseRs()
    _claimResponseRsService.process(claimResponse)
    Mockito.verify(_claimResponseRsService._activityCreationService, Mockito.times(1)).createActivitiesForClaimResponseRs(claimResponse)
  }
}