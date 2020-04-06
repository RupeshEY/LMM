package gw.acc.iplm

uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Claimant
uses gw.transaction.Transaction

class TestHelper {

  private static var BASE_DATE = java.util.Date.Now

  public static function createClaimAndPolicy(policyNumber: String, ucr: String): Claim {
    var claim: Claim = null
    Transaction.runWithNewBundle(\bundle -> {
      var policy = ClaimBuilderHelper.createPolicyBuilder(bundle, policyNumber).create()
      claim = new gw.api.databuilder.ClaimBuilder()
          .withPolicy(policy)
          .withLossCause(TC_WATERDAMAGE)
          .create(bundle)
      claim.UCR_Ext = ucr
      claim.UMR_Ext = "B0001UMR"
      claim.ClaimLineNumber_Ext = 1
      claim.ClaimTypeCode_Ext = ECFClaimTypeCode_Ext.TC_001
      claim.ECFLastUpdateTime = Date.Now
      policy = bundle.add(policy)
      claim = bundle.add(claim)
    }, User.util.UnrestrictedUser)
    return claim
  }

  public static function createECFMessages(policyNumber: String, ucr: String, hasBeenRespondedTo: boolean): ECFMessageClaimNotifyRq_Ext[] {
    var claim: Claim = null
    var ecfMessages :ECFMessageClaimNotifyRq_Ext[] = null
    Transaction.runWithNewBundle(\bundle -> {
      var policy = ClaimBuilderHelper.createPolicyBuilder(bundle, policyNumber).create()
      claim = new gw.api.databuilder.ClaimBuilder()
          .withPolicy(policy)
          .withLossCause(TC_WATERDAMAGE)
          .create(bundle)
      claim.UCR_Ext = ucr
      claim.UMR_Ext = "B0001UMR"
      claim.ClaimLineNumber_Ext = 1
      claim.ClaimTypeCode_Ext = ECFClaimTypeCode_Ext.TC_001
      claim.ECFLastUpdateTime = Date.Now
      ecfMessages = createNewMessages(claim, hasBeenRespondedTo)
      claim.addToLMMessages(ecfMessages[0])
      claim.addToLMMessages(ecfMessages[1])
      policy = bundle.add(policy)
      claim = bundle.add(claim)
    }, User.util.UnrestrictedUser)
    return ecfMessages
  }

  public static function createNewMessages(claim: Claim, hasBeenRespondedTo: boolean) :ECFMessageClaimNotifyRq_Ext[] {
    var ecfMessage1 = new ECFMessageClaimNotifyRq_Ext()
    ecfMessage1.setClaim(claim)
    ecfMessage1.UUID = "ce22a0a9-cee6-4922-b14f-36ad5d59400b"
    ecfMessage1.UCR = claim.UCR_Ext
    ecfMessage1.TR = "B00001TR"
    ecfMessage1.AsOfDate = Date.Now
    ecfMessage1.MessageSequence = 1bd
    ecfMessage1.Content = new Blob("xyz".Bytes)
    ecfMessage1.Status = ECFMessageStatus_Ext.TC_SUCCESS
    ecfMessage1.Suspended = false
    ecfMessage1.TransactionType = ECFClaimTransactionType_Ext.TC_FIRSTADVICE
    ecfMessage1.TransactionSequence = "001"
    ecfMessage1.TransactionStatus = ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED
    ecfMessage1.AmendmentDetails = "On Account settlement"
    ecfMessage1.InsurerReference = "IsurerRef1"
    ecfMessage1.OriginTimeStamp = BASE_DATE.addDays(-10)
    ecfMessage1.ActionCode = ECFActionCode_Ext.TC_R
    ecfMessage1.ResponseCode = ECFResponseCode_Ext.TC_INF
    ecfMessage1.ActionParticipantType = ECFParticipationType_Ext.TC_B
    ecfMessage1.ActionParticipant = "GW1234"
    ecfMessage1.MessageType = ECFMessageType_Ext.TC_CLAIMNOTIFY
    ecfMessage1.MessageCategory = LMMessageCategory_Ext.TC_ECFCLAIMNOTIFY
    ecfMessage1.MessageDirection = ECFMessageDirectionType_Ext.TC_INBOUND
    if(hasBeenRespondedTo){
      ecfMessage1.MessageState = ECFClaimMessageState_Ext.TC_RESPONDED
    } else {
      ecfMessage1.MessageState = ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE
    }
    var ecfContractMarket1 = new ECFContractMarket_Ext()
    ecfContractMarket1.IsPrimaryRole = false
    ecfContractMarket1.PartyID = "GW1234"
    ecfContractMarket1.PartyName = "GuideWire GW1234"
    ecfContractMarket1.Bureau = ECFBureauType_Ext.TC_LIRMA
    ecfContractMarket1.ParticipantFunction = ECFParticipantFunction_Ext.TC_AGREEMENTPARTY
    ecfMessage1.addToECFContractMarkets(ecfContractMarket1)

    //Claim Notify message 2 for UCR B0001UCR With HasBeenRespondedTo to always FALSE
    var ecfMessage2 = new ECFMessageClaimNotifyRq_Ext()
    ecfMessage2.setClaim(claim)
    ecfMessage2.UUID = "ce22a0a9-cee6-4922-b14f-36ad5d59499b"
    ecfMessage2.UCR = claim.UCR_Ext
    ecfMessage2.Content = new Blob("xyz".Bytes)
    ecfMessage2.TR = "B00001TR"
    ecfMessage2.AsOfDate = Date.Now
    ecfMessage2.MessageSequence = 1bd
    ecfMessage2.OriginTimeStamp = BASE_DATE.addDays(-10)
    ecfMessage2.Status = ECFMessageStatus_Ext.TC_SUCCESS
    ecfMessage2.Suspended = false
    ecfMessage2.TransactionType = ECFClaimTransactionType_Ext.TC_FIRSTADVICEANDSETTLEMENT
    ecfMessage2.TransactionSequence = "002"
    ecfMessage2.TransactionStatus = ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED
    ecfMessage2.AmendmentDetails = "On Account settlement"
    ecfMessage2.InsurerReference = "IsurerRef2"
    ecfMessage2.ActionCode = ECFActionCode_Ext.TC_A
    ecfMessage2.ResponseCode = ECFResponseCode_Ext.TC_INF
    ecfMessage2.ActionParticipantType = ECFParticipationType_Ext.TC_B
    ecfMessage2.ActionParticipant = "GW1234"
    ecfMessage2.MessageState = ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE
    ecfMessage2.MessageType = ECFMessageType_Ext.TC_CLAIMNOTIFY
    ecfMessage2.MessageCategory = LMMessageCategory_Ext.TC_ECFCLAIMNOTIFY
    ecfMessage2.MessageDirection = ECFMessageDirectionType_Ext.TC_INBOUND

    var ecfContractMarket2 = new ECFContractMarket_Ext()
    ecfContractMarket2.IsPrimaryRole = true
    ecfContractMarket2.PartyID = "GW1234"
    ecfContractMarket2.PartyName = "GuideWire GW1234"
    ecfContractMarket2.Bureau = ECFBureauType_Ext.TC_LIRMA
    ecfContractMarket2.ParticipantFunction = ECFParticipantFunction_Ext.TC_LEAD
    ecfMessage2.addToECFContractMarkets(ecfContractMarket2)

    return {ecfMessage1, ecfMessage2}
  }


  public static function createECFMessageWithoutTR(policyNumber: String, ucr: String, hasBeenRespondedTo:boolean): ECFMessageClaimNotifyRq_Ext[] {
    var claim: Claim = null
    var ecfMessages :ECFMessageClaimNotifyRq_Ext[] = null
    Transaction.runWithNewBundle(\bundle -> {
      var policy = ClaimBuilderHelper.createPolicyBuilder(bundle, policyNumber).create()
      claim = new gw.api.databuilder.ClaimBuilder()
          .withPolicy(policy)
          .withLossCause(TC_WATERDAMAGE)
          .create(bundle)
      claim.UCR_Ext = ucr
      claim.UMR_Ext = "B0001UMR"
      claim.ClaimLineNumber_Ext = 1
      claim.ClaimTypeCode_Ext = ECFClaimTypeCode_Ext.TC_001
      claim.ECFLastUpdateTime = Date.Now
      ecfMessages = createNewMessagesWithoutTR(claim, hasBeenRespondedTo)
      claim.addToLMMessages(ecfMessages[0])
      claim.addToLMMessages(ecfMessages[1])
      policy = bundle.add(policy)
      claim = bundle.add(claim)
    }, User.util.UnrestrictedUser)
    return ecfMessages
  }

  public static function createNewMessagesWithoutTR(claim: Claim, hasBeenRespondedTo: boolean) :ECFMessageClaimNotifyRq_Ext[] {
    var ecfMessage1 = new ECFMessageClaimNotifyRq_Ext()
    ecfMessage1.setClaim(claim)
    ecfMessage1.UUID = "ce22a0a9-cee6-4922-b14f-36ad5d59400b"
    ecfMessage1.UCR = claim.UCR_Ext
    ecfMessage1.AsOfDate = Date.Now
    ecfMessage1.MessageSequence = 1bd
    ecfMessage1.Content = new Blob("xyz".Bytes)
    ecfMessage1.Status = ECFMessageStatus_Ext.TC_SUCCESS
    ecfMessage1.Suspended = false
    ecfMessage1.TransactionType = ECFClaimTransactionType_Ext.TC_FIRSTADVICE
    ecfMessage1.TransactionSequence = "001"
    ecfMessage1.TransactionStatus = ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED
    ecfMessage1.AmendmentDetails = "On Account settlement"
    ecfMessage1.InsurerReference = "IsurerRef1"
    ecfMessage1.OriginTimeStamp = BASE_DATE.addDays(-10)
    ecfMessage1.ActionCode = ECFActionCode_Ext.TC_R
    ecfMessage1.ResponseCode = ECFResponseCode_Ext.TC_INF
    ecfMessage1.ActionParticipantType = ECFParticipationType_Ext.TC_B
    ecfMessage1.ActionParticipant = "GW1234"
    ecfMessage1.MessageType = ECFMessageType_Ext.TC_CLAIMNOTIFY
    ecfMessage1.MessageCategory = LMMessageCategory_Ext.TC_ECFCLAIMNOTIFY
    ecfMessage1.MessageDirection = ECFMessageDirectionType_Ext.TC_INBOUND
    if(hasBeenRespondedTo){
      ecfMessage1.MessageState = ECFClaimMessageState_Ext.TC_RESPONDED
    } else {
      ecfMessage1.MessageState = ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE
    }
    var ecfContractMarket1 = new ECFContractMarket_Ext()
    ecfContractMarket1.IsPrimaryRole = false
    ecfContractMarket1.PartyID = "GW1234"
    ecfContractMarket1.PartyName = "GuideWire GW1234"
    ecfContractMarket1.Bureau = ECFBureauType_Ext.TC_LIRMA
    ecfContractMarket1.ParticipantFunction = ECFParticipantFunction_Ext.TC_AGREEMENTPARTY
    ecfMessage1.addToECFContractMarkets(ecfContractMarket1)

    //Claim Notify message 2 for UCR B0001UCR With HasBeenRespondedTo to always FALSE
    var ecfMessage2 = new ECFMessageClaimNotifyRq_Ext()
    ecfMessage2.setClaim(claim)
    ecfMessage2.UUID = "ce22a0a9-cee6-4922-b14f-36ad5d59499b"
    ecfMessage2.UCR = claim.UCR_Ext
    ecfMessage2.Content = new Blob("xyz".Bytes)
    ecfMessage2.AsOfDate = Date.Now
    ecfMessage2.MessageSequence = 1bd
    ecfMessage2.OriginTimeStamp = BASE_DATE.addDays(-10)
    ecfMessage2.Status = ECFMessageStatus_Ext.TC_SUCCESS
    ecfMessage2.Suspended = false
    ecfMessage2.TransactionType = ECFClaimTransactionType_Ext.TC_FIRSTADVICEANDSETTLEMENT
    ecfMessage2.TransactionSequence = "002"
    ecfMessage2.TransactionStatus = ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED
    ecfMessage2.AmendmentDetails = "On Account settlement"
    ecfMessage2.InsurerReference = "IsurerRef2"
    ecfMessage2.ActionCode = ECFActionCode_Ext.TC_A
    ecfMessage2.ResponseCode = ECFResponseCode_Ext.TC_INF
    ecfMessage2.ActionParticipantType = ECFParticipationType_Ext.TC_B
    ecfMessage2.ActionParticipant = "GW1234"
    ecfMessage2.MessageState = ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE
    ecfMessage2.MessageType = ECFMessageType_Ext.TC_CLAIMNOTIFY
    ecfMessage2.MessageCategory = LMMessageCategory_Ext.TC_ECFCLAIMNOTIFY
    ecfMessage2.MessageDirection = ECFMessageDirectionType_Ext.TC_INBOUND

    var ecfContractMarket2 = new ECFContractMarket_Ext()
    ecfContractMarket2.IsPrimaryRole = true
    ecfContractMarket2.PartyID = "GW1234"
    ecfContractMarket2.PartyName = "GuideWire GW1234"
    ecfContractMarket2.Bureau = ECFBureauType_Ext.TC_LIRMA
    ecfContractMarket2.ParticipantFunction = ECFParticipantFunction_Ext.TC_LEAD
    ecfMessage2.addToECFContractMarkets(ecfContractMarket2)

    return {ecfMessage1, ecfMessage2}
  }

  public static function getClaimant(partyName: String): Claimant {
    var claimant = new Claimant()
    claimant.Party.Name = partyName
    return claimant
  }
}