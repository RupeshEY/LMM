package gw.acc.iplm.enhancements

uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.respondrules.RespondRulesContext
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.testharness.v3.GUnitTestClass

class ECFMessageClaimNotifyRqEnhancementTest extends GUnitTestClass {

  function testPreviousClaimNotify() {
    var claimNotifyRq1: ECFMessageClaimNotifyRq_Ext
    var claimNotifyRq2: ECFMessageClaimNotifyRq_Ext
    var tr = "B0001VTR01"
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyMessage1 = ECFMessageUtil.createNewClaimNotifyRq()
      claimNotifyRq1 = ECFMessageEntityUtil.createClaimNotifyRq(claimNotifyMessage1)
      claimNotifyRq1 = bundle.add(claimNotifyRq1)
      claimNotifyRq1.MessageState = ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE
      claimNotifyRq1.ReceiverPartyId = "1103"
      claimNotifyRq1.Status = ECFMessageStatus_Ext.TC_PENDING
      claimNotifyRq1.TR = tr
      var claimNotifyMessage2 = ECFMessageUtil.createNewRespondErrorNotifyRq()
      claimNotifyRq2 = ECFMessageEntityUtil.createClaimNotifyRq(claimNotifyMessage2)
      claimNotifyRq2 = bundle.add(claimNotifyRq2)
      claimNotifyRq2.MessageState = ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE
      claimNotifyRq2.ActionParticipant = claimNotifyRq1.ReceiverPartyId
      claimNotifyRq2.TR = tr

    }, User.util.UnrestrictedUser)
    ECFMessageEntityUtil.addClaimToMessage(claimNotifyRq1, null)
    ECFMessageEntityUtil.addClaimToMessage(claimNotifyRq2, claimNotifyRq1.Claim)
    assertNotNull(claimNotifyRq2.PreviousClaimNotify)
  }

  function testRespondable() {
    var claimNotifyRq = ECFMessageEntityUtil.createClaimNotifyRqWithLinkedClaim()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotifyRq = bundle.add(claimNotifyRq)
      assertNotNull(claimNotifyRq.Claim)
      claimNotifyRq.Claim.VCSIndicator_Ext = false
      claimNotifyRq.MessageState = TC_AWAITINGRESPONSE
      claimNotifyRq.TransactionStatus = ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED
      claimNotifyRq.ActionCode = ECFActionCode_Ext.TC_A
    }, User.util.UnrestrictedUser)
    RespondRulesContext.updateState(claimNotifyRq)

    assertTrue("This claim notify message should be respondable", claimNotifyRq.Respondable)
  }

  function testRespondable_VCSIndicator() {
    var claimNotifyRq = ECFMessageEntityUtil.createClaimNotifyRqWithLinkedClaim()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotifyRq = bundle.add(claimNotifyRq)
      claimNotifyRq.Claim.VCSIndicator_Ext = true
      claimNotifyRq.MessageState = TC_AWAITINGRESPONSE
    }, User.util.UnrestrictedUser)

    assertFalse("The VCS Indicator being true should make this claim notify message non-respondable", claimNotifyRq.Respondable)
  }

  function testRespondable_MessageState() {
    var claimNotifyRq = ECFMessageEntityUtil.createClaimNotifyRqWithLinkedClaim()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotifyRq = bundle.add(claimNotifyRq)
      claimNotifyRq.Claim.VCSIndicator_Ext = true
      claimNotifyRq.MessageState = ECFClaimMessageState_Ext.AllTypeKeys.firstWhere(\elt -> elt != TC_AWAITINGRESPONSE)
    }, User.util.UnrestrictedUser)

    assertFalse("The incorrect Message State should make this claim notify message non-respondable", claimNotifyRq.Respondable)
  }

  function testRespondable_VCSIndicatorAndMessageState() {
    var claimNotifyRq = ECFMessageEntityUtil.createClaimNotifyRqWithLinkedClaim()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotifyRq = bundle.add(claimNotifyRq)
      claimNotifyRq.Claim.VCSIndicator_Ext = false
      claimNotifyRq.MessageState = ECFClaimMessageState_Ext.AllTypeKeys.firstWhere(\elt -> elt != TC_AWAITINGRESPONSE)
    }, User.util.UnrestrictedUser)

    assertFalse("The incorrect Message State and the VCS Indicator should make this claim notify message non-respondable", claimNotifyRq.Respondable)
  }

  function testApplicableToPolicy_ActionCode_U() {
    var claimNotifyRq = ECFMessageEntityUtil.createClaimNotifyRq()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotifyRq = bundle.add(claimNotifyRq)
      claimNotifyRq.Suspended = true
      claimNotifyRq.ActionCode = TC_U
      claimNotifyRq.ValidationErrorCode = ECFErrorCodeType.CLAIM_DATA_POLICY_UCR_NOT_FOUND_ERROR.ErrorCode
    }, User.util.UnrestrictedUser)

    assertTrue("This ClaimNotify should be applicable to a Policy", claimNotifyRq.ApplicableToPolicy)
  }

  function testApplicableToPolicy_ActionCode_A() {
    var claimNotifyRq = ECFMessageEntityUtil.createClaimNotifyRq()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotifyRq = bundle.add(claimNotifyRq)
      claimNotifyRq.Suspended = true
      claimNotifyRq.ActionCode = TC_A
      claimNotifyRq.ValidationErrorCode = ECFErrorCodeType.CLAIM_DATA_POLICY_UCR_NOT_FOUND_ERROR.ErrorCode
    }, User.util.UnrestrictedUser)

    assertTrue("This ClaimNotify should be applicable to a Policy", claimNotifyRq.ApplicableToPolicy)
  }

  function testApplicableToPolicy_NotManualCheck() {
    var claimNotifyRq = ECFMessageEntityUtil.createClaimNotifyRq()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotifyRq = bundle.add(claimNotifyRq)
      claimNotifyRq.Suspended = false
      claimNotifyRq.ActionCode = TC_U
      claimNotifyRq.ValidationErrorCode = ECFErrorCodeType.CLAIM_DATA_POLICY_UCR_NOT_FOUND_ERROR.ErrorCode
    }, User.util.UnrestrictedUser)

    assertFalse("A valid (non-suspended) ClaimNotify cannot be applied to a Policy", claimNotifyRq.ApplicableToPolicy)
  }

  function testApplicableToPolicy_ActionCode() {
    var claimNotifyRq = ECFMessageEntityUtil.createClaimNotifyRq()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotifyRq = bundle.add(claimNotifyRq)
      claimNotifyRq.Suspended = true
      claimNotifyRq.ActionCode = ECFActionCode_Ext.AllTypeKeys.firstWhere(\elt -> elt != TC_U and elt != TC_A)
      claimNotifyRq.ValidationErrorCode = ECFErrorCodeType.CLAIM_DATA_POLICY_UCR_NOT_FOUND_ERROR.ErrorCode
    }, User.util.UnrestrictedUser)

    assertFalse("A ClaimNotify with an ActionCode of anything other than 'A' or 'U' cannot be applied to a Policy", claimNotifyRq.ApplicableToPolicy)
  }

  function testApplicableToPolicy_ExceptionErrorCode() {
    var claimNotifyRq = ECFMessageEntityUtil.createClaimNotifyRq()
    var policyAndUCRNotFoundCode = ECFErrorCodeType.CLAIM_DATA_POLICY_UCR_NOT_FOUND_ERROR.ErrorCode

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotifyRq = bundle.add(claimNotifyRq)
      claimNotifyRq.Suspended = true
      claimNotifyRq.ActionCode = TC_U
      claimNotifyRq.ValidationErrorCode = ECFErrorCodeType.AllValues*.ErrorCode.firstWhere(\elt -> elt != policyAndUCRNotFoundCode)
    }, User.util.UnrestrictedUser)

    assertFalse("A ClaimNotify with an error code of anything other than ${policyAndUCRNotFoundCode} cannot be applied to a Policy", claimNotifyRq.ApplicableToPolicy)
  }

  function testApplicableToClaim_ActionCode_U() {
    var claimNotifyRq = ECFMessageEntityUtil.createClaimNotifyRq()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotifyRq = bundle.add(claimNotifyRq)
      claimNotifyRq.Suspended = true
      claimNotifyRq.ActionCode = TC_U
      claimNotifyRq.ValidationErrorCode = ECFErrorCodeType.CLAIM_DATA_POLICY_UCR_NOT_FOUND_ERROR.ErrorCode
    }, User.util.UnrestrictedUser)

    assertTrue("This ClaimNotify should be applicable to a Claim", claimNotifyRq.ApplicableToClaim)
  }

  function testApplicableToClaim_ActionCode_A() {
    var claimNotifyRq = ECFMessageEntityUtil.createClaimNotifyRq()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotifyRq = bundle.add(claimNotifyRq)
      claimNotifyRq.Suspended = true
      claimNotifyRq.ActionCode = TC_A
      claimNotifyRq.ValidationErrorCode = ECFErrorCodeType.CLAIM_DATA_POLICY_UCR_NOT_FOUND_ERROR.ErrorCode
    }, User.util.UnrestrictedUser)

    assertFalse("A ClaimNotify with an ActionCode of 'A' cannot be applied to a Claim", claimNotifyRq.ApplicableToClaim)
  }

  function testApplicableToClaim_NotManualCheck() {
    var claimNotifyRq = ECFMessageEntityUtil.createClaimNotifyRq()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotifyRq = bundle.add(claimNotifyRq)
      claimNotifyRq.Suspended = false
      claimNotifyRq.ActionCode = TC_U
      claimNotifyRq.ValidationErrorCode = ECFErrorCodeType.CLAIM_DATA_POLICY_UCR_NOT_FOUND_ERROR.ErrorCode
    }, User.util.UnrestrictedUser)

    assertFalse("A valid (non-suspended) ClaimNotify cannot be applied to a Claim", claimNotifyRq.ApplicableToClaim)
  }

  function testApplicableToClaim_ActionCode() {
    var claimNotifyRq = ECFMessageEntityUtil.createClaimNotifyRq()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotifyRq = bundle.add(claimNotifyRq)
      claimNotifyRq.Suspended = true
      claimNotifyRq.ActionCode = ECFActionCode_Ext.AllTypeKeys.firstWhere(\elt -> elt != TC_U)
      claimNotifyRq.ValidationErrorCode = ECFErrorCodeType.CLAIM_DATA_POLICY_UCR_NOT_FOUND_ERROR.ErrorCode
    }, User.util.UnrestrictedUser)

    assertFalse("A ClaimNotify with an ActionCode of anything other than 'U' cannot be applied to a Claim", claimNotifyRq.ApplicableToClaim)
  }

  function testApplicableToClaim_ExceptionErrorCode() {
    var claimNotifyRq = ECFMessageEntityUtil.createClaimNotifyRq()
    var policyAndUCRNotFoundCode = ECFErrorCodeType.CLAIM_DATA_POLICY_UCR_NOT_FOUND_ERROR.ErrorCode

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotifyRq = bundle.add(claimNotifyRq)
      claimNotifyRq.Suspended = true
      claimNotifyRq.ActionCode = TC_U
      claimNotifyRq.ValidationErrorCode = ECFErrorCodeType.AllValues*.ErrorCode.firstWhere(\elt -> elt != policyAndUCRNotFoundCode)
    }, User.util.UnrestrictedUser)

    assertFalse("A ClaimNotify with an error code of anything other than ${policyAndUCRNotFoundCode} cannot be applied to a Claim", claimNotifyRq.ApplicableToClaim)
  }
}