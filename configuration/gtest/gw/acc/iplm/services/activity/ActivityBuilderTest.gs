package gw.acc.iplm.services.activity

uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.utils.ECFConstants
uses gw.testharness.v3.GUnitTestClass

class ActivityBuilderTest extends GUnitTestClass {

  private var _activityBuilder: ActivityBuilder
  private var _claim: Claim
  private var ECF_ACTIVITY_PATTERN_CDOE = "ecf_activity"

  function testActivityCreated() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _claim = ClaimBuilderHelper.createClaim()
      _activityBuilder = new ActivityBuilder(_claim)
      _activityBuilder.createActivity()
      assertTrue("No default activity was created using ECF activity pattern", activityExistsOnClaim(_claim))
    }, ECFConstants.ECF_SUPER_USER)
  }

  function testActivityCreatedWithDefaultsFromECFActivityPattern() {
    // Activity Pattern defaults
    // See ecf_activity in activity-patterns.csv
    var subject = "ECF message has been received."
    var activityclass = ActivityClass.TC_TASK
    var type = ActivityType.TC_GENERAL
    var priority = Priority.TC_HIGH
    var importance = ImportanceLevel.TC_NOTONCALENDAR
    var recurring = false
    var targetdate = Date.Now.addBusinessDays(1).DayOfYear
    var escalationDate = Date.Now.addBusinessDays(3).DayOfYear
    var externallyOwned = false


    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _claim = ClaimBuilderHelper.createClaim()
      _activityBuilder = new ActivityBuilder(_claim)
      _activityBuilder.createActivity()
      var activity = getEcfActivitiesFromClaim(_claim).first()
      assertEquals("Activity does not have correct default ECF activity pattern subject", activity.Subject, subject)
      assertEquals("Activity does not have correct default ECF activity pattern Activity Class", activity.ActivityClass, activityclass)
      assertEquals("Activity does not have correct default ECF activity pattern Activity Type", activity.Type, type)
      assertEquals("Activity does not have correct default ECF activity pattern Activity Priority", activity.Priority, priority)
      assertEquals("Activity does not have correct default ECF activity pattern Activity Importance", activity.Importance, importance)
      assertEquals("Activity does not have correct default ECF activity pattern Activity Recurring", activity.Recurring, recurring)
      assertEquals("Activity does not have correct default ECF activity pattern Activity Target Date", activity.TargetDate.DayOfYear, targetdate)
      assertEquals("Activity does not have correct default ECF activity pattern Activity Escalation Date", activity.EscalationDate.DayOfYear, escalationDate)
      assertEquals("Activity does not have correct default ECF activity pattern Activity Externally Owned", activity.ExternallyOwned, externallyOwned)
    }, ECFConstants.ECF_SUPER_USER)
  }

  function testActivityCreatedWithSubject() {
    var subject = "test subject"
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _claim = ClaimBuilderHelper.createClaim()
      _activityBuilder = new ActivityBuilder(_claim)
      _activityBuilder.withSubject(subject).createActivity()
      assertTrue("Activity does not have correct subject", activityExistsOnClaimWithSubject(_claim, subject))
    }, ECFConstants.ECF_SUPER_USER)
  }

  function testActivityCreatedWithECFMessage() {
    var _claimNotifyEventRq = ECFMessageUtil.createNewClaimNotifyRq()
    var _claimNotifyEvent = ECFMessageEntityUtil.createClaimNotifyRq(_claimNotifyEventRq)
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _claim = ClaimBuilderHelper.createClaim()
      _activityBuilder = new ActivityBuilder(_claim)
      var activity = _activityBuilder.withMessage(_claimNotifyEvent).createActivity()
      assertNotNull("Activity does not have ECF Message", activity.LMMessage_Ext)
    }, ECFConstants.ECF_SUPER_USER)
  }

  function testActivityCreatedWithActivityPattern() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _claim = ClaimBuilderHelper.createClaim()
      _activityBuilder = new ActivityBuilder(_claim)
      var activity = _activityBuilder.withActivityPatternName(ECFConstants.ECF_CLAIM_ACTIVITY_PATTERN_CODE).createActivity()
      assertEquals("Activity does not have ActivityPattern", ECFConstants.ECF_CLAIM_ACTIVITY_PATTERN_CODE, activity.ActivityPattern.Code)
    }, ECFConstants.ECF_SUPER_USER)
  }

  function testActivityCreatedWithShortSubject() {
    var shortSubject = "ECFTEST"
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _claim = ClaimBuilderHelper.createClaim()
      _activityBuilder = new ActivityBuilder(_claim)
      _activityBuilder.withShortSubject(shortSubject).createActivity()
      assertTrue("Activity does not have correct short subject", activityExistsOnClaimWithShortSubject(_claim, shortSubject))
    }, ECFConstants.ECF_SUPER_USER)
  }

  function testActivityCreatedWithDescription() {
    var description = "This is a test description"
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _claim = ClaimBuilderHelper.createClaim()
      _activityBuilder = new ActivityBuilder(_claim)
      _activityBuilder.withDescription(description).createActivity()
      assertTrue("Activity does not have correct description", activityExistsOnClaimWithDescription(_claim, description))
    }, ECFConstants.ECF_SUPER_USER)
  }

  private function getEcfActivitiesFromClaim(claim: Claim): List<Activity> {
    return claim.Activities.where(\activity -> activity.ActivityPattern.Code == ECF_ACTIVITY_PATTERN_CDOE).toList()
  }

  private function activityExistsOnClaim(claim: Claim): Boolean {
    return getEcfActivitiesFromClaim(claim).Count > 0
  }

  private function activityExistsOnClaimWithSubject(claim: Claim, subject: String): Boolean {
    return getEcfActivitiesFromClaim(claim).countWhere(\activity -> activity.Subject == subject) > 0
  }

  private function activityExistsOnClaimWithShortSubject(claim: Claim, shortSubject: String): Boolean {
    return getEcfActivitiesFromClaim(claim).countWhere(\activity -> activity.ShortSubject == shortSubject) > 0
  }

  private function activityExistsOnClaimWithDescription(claim: Claim, description: String): Boolean {
    return getEcfActivitiesFromClaim(claim).countWhere(\activity -> activity.Description == description) > 0
  }
}