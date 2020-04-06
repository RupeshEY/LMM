package gw.acc.iplm.entitymapper.ecfwb.claimnotify

uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.testharness.v3.GUnitTestClass

class RespondErrorNotifyMapperTest extends GUnitTestClass {

  private var _mapper = RespondErrorNotifyMapper

  function testMapRespondErrorNotify() {
    var notifyRqXml = ECFMessageUtil.createNewRespondErrorNotifyRq()
    var errorNotifyEntity : ECFMessageClaimNotifyRq_Ext
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyMsg = new ECFMessageClaimNotifyRq_Ext(bundle)
      errorNotifyEntity = _mapper.mapRespondErrorNotify(claimNotifyMsg, notifyRqXml)

      assertEquals(notifyRqXml.UUId, errorNotifyEntity.UUID)
      assertEquals(notifyRqXml.OriginTimeStamp, errorNotifyEntity.OriginTimeStamp)
      assertEquals(notifyRqXml.ClaimResponseUUId, errorNotifyEntity.ClaimResponseUUId)
      assertEquals(ECFMessageType_Ext.TC_RESPONDERRORNOTIFY, errorNotifyEntity.MessageType)
      assertNotNull("ErrorsOrWarnings list not created", errorNotifyEntity.ErrorsOrWarnings)
      assertTrue("ErrorsOrWarnings list is empty", errorNotifyEntity.ErrorsOrWarnings.HasElements)
    }, User.util.UnrestrictedUser)
  }

  function testMapRespondErrorNotifyMapsFromClaimResponse() {
    var notifyRqXml = ECFMessageUtil.createNewRespondErrorNotifyRq()
    var claim = ClaimBuilderHelper.createClaim(true)
    var claimResponse = ECFMessageEntityUtil.createClaimResponseRq()
    var claimNotifyMsg: ECFMessageClaimNotifyRq_Ext

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claim = bundle.add(claim)
      claimResponse = bundle.add(claimResponse)
      claimResponse.UUID = notifyRqXml.ClaimResponseUUId
      claimResponse.Claim = claim

      claimNotifyMsg = new ECFMessageClaimNotifyRq_Ext()
      claimNotifyMsg.UUID = notifyRqXml.UUId
      claimNotifyMsg.OriginTimeStamp = notifyRqXml.OriginTimeStamp
      claimNotifyMsg.MessageDirection = ECFMessageDirectionType_Ext.TC_INBOUND
      claimNotifyMsg.MessageCategory = LMMessageCategory_Ext.TC_ECFCLAIMNOTIFY
    }, User.util.UnrestrictedUser)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotifyMsg = _mapper.mapRespondErrorNotify(claimNotifyMsg, notifyRqXml)
    }, User.util.UnrestrictedUser)

    assertEquals(claimResponse.UCR, claimNotifyMsg.UCR)
    assertEquals(claimResponse.UMR, claimNotifyMsg.UMR)
    assertEquals(claimResponse.TR, claimNotifyMsg.TR)
    assertEquals(claimResponse.Claim, claimNotifyMsg.Claim)
  }
}