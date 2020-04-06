package gw.acc.iplm.services.message.ecfwriteback

uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.api.locale.DisplayKey
uses gw.testharness.v3.GUnitTestClass

class RespondErrorNotifyServiceComponentTest extends GUnitTestClass {

  private var _respondErrorNotifyService: RespondErrorNotifyService

  override function beforeMethod() {
    super.beforeMethod()
    _respondErrorNotifyService = new RespondErrorNotifyService()
  }

  function testRespondErrorNotifyResetsOriginalClaimNotifyStatus() {
    var claimNotifyRq: ECFMessageClaimNotifyRq_Ext
    var claimResponseRq: ECFMessageClaimResponseRq_Ext
    var respondErrorNotify: ECFMessageClaimNotifyRq_Ext

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyRqXml = ECFMessageUtil.createNewClaimNotifyRq()
      claimNotifyRq = ECFMessageEntityUtil.createClaimNotifyRq(claimNotifyRqXml)
      claimNotifyRq = bundle.add(claimNotifyRq)
      claimNotifyRq.MessageState = ECFClaimMessageState_Ext.TC_PENDING

      var claimResponseMessage = ECFMessageUtil.createNewClaimResponseRq()
      claimResponseRq = ECFMessageEntityUtil.createClaimResponseRq(claimResponseMessage)
      claimResponseRq = bundle.add(claimResponseRq)
      claimResponseRq.ReferredUUID = claimNotifyRq.UUID
      claimResponseRq.ResponseCode = ECFResponseCode_Ext.TC_REJ

      var respondErrorNotifyXml = ECFMessageUtil.createNewRespondErrorNotifyRq()
      respondErrorNotifyXml.ClaimResponseUUId = claimResponseRq.UUID
      respondErrorNotify = ECFMessageEntityUtil.createClaimNotifyRq(respondErrorNotifyXml)
      respondErrorNotify.AsOfDate = Date.Now
      respondErrorNotify.MessageSequence = 1bd
      respondErrorNotify.ClaimResponseUUId = claimResponseRq.UUID
      respondErrorNotify = bundle.add(respondErrorNotify)
    }, User.util.UnrestrictedUser)


    ECFMessageEntityUtil.addClaimToMessage(respondErrorNotify, null)
    ECFMessageEntityUtil.addClaimToMessage(claimResponseRq, respondErrorNotify.Claim)
    ECFMessageEntityUtil.addClaimToMessage(claimNotifyRq, respondErrorNotify.Claim)

    _respondErrorNotifyService.process(respondErrorNotify)
    claimNotifyRq = gw.api.database.Query.make(ECFMessage_Ext).compare(ECFMessage_Ext#UUID, gw.api.database.Relop.Equals, claimNotifyRq.UUID).select().AtMostOneRow as ECFMessageClaimNotifyRq_Ext
    assertEquals(ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE, claimNotifyRq.MessageState)

  }

  function testRespondErrorNotifyAssignsActivityToClaimOwner() {
    var claimNotifyRq: ECFMessageClaimNotifyRq_Ext
    var claimResponseRq: ECFMessageClaimResponseRq_Ext
    var respondErrorNotify: ECFMessageClaimNotifyRq_Ext

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyRqXml = ECFMessageUtil.createNewClaimNotifyRq()
      claimNotifyRq = ECFMessageEntityUtil.createClaimNotifyRq(claimNotifyRqXml)
      claimNotifyRq = bundle.add(claimNotifyRq)
      claimNotifyRq.MessageState = ECFClaimMessageState_Ext.TC_PENDING

      var claimResponseMessage = ECFMessageUtil.createNewClaimResponseRq()
      claimResponseRq = ECFMessageEntityUtil.createClaimResponseRq(claimResponseMessage)
      claimResponseRq = bundle.add(claimResponseRq)
      claimResponseRq.ReferredUUID = claimNotifyRq.UUID
      claimResponseRq.ResponseCode = ECFResponseCode_Ext.TC_REJ

      var respondErrorNotifyXml = ECFMessageUtil.createNewRespondErrorNotifyRq()
      respondErrorNotifyXml.ClaimResponseUUId = claimResponseRq.UUID
      respondErrorNotify = ECFMessageEntityUtil.createClaimNotifyRq(respondErrorNotifyXml)
      respondErrorNotify.AsOfDate = Date.Now
      respondErrorNotify.MessageSequence = 1bd
      respondErrorNotify.ClaimResponseUUId = claimResponseRq.UUID
      respondErrorNotify = bundle.add(respondErrorNotify)
      ECFMessageEntityUtil.addClaimToMessage(respondErrorNotify, null)
      ECFMessageEntityUtil.addClaimToMessage(claimResponseRq, respondErrorNotify.Claim)
      ECFMessageEntityUtil.addClaimToMessage(claimNotifyRq, respondErrorNotify.Claim)
    }, User.util.UnrestrictedUser)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _respondErrorNotifyService.process(respondErrorNotify)
    }, User.util.UnrestrictedUser)


    var activities = respondErrorNotify.Claim.Activities.where(\activity -> activity.ActivityPattern.Code == "ecf_activity")
    assertTrue("No RespondErrorNotify activity found", activities.HasElements)
    var expectedDescription = DisplayKey.get("Accelerator.IPLM.Activity.ECF.RespondError.Description", respondErrorNotify.ClaimResponseUUId, respondErrorNotify.ErrorsOrWarnings.first().Description)
    var respondErrorNotifyActivity = activities.where(\activity -> activity.Description == expectedDescription).first()
    assertNotNull("Claim should have 1 activity with RespondErrorNotify description", respondErrorNotifyActivity)
    assertEquals("RespondErrorNotify Activity should be assigned to Claim owner", respondErrorNotify.Claim.AssignedUser, respondErrorNotifyActivity.AssignedUser)

  }
}