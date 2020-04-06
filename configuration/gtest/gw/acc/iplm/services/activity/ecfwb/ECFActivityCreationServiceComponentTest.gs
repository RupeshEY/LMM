package gw.acc.iplm.services.activity.ecfwb

uses gw.acc.iplm.services.message.ecfwriteback.ClaimNotifyService
uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.utils.ECFConstants
uses gw.api.database.Query
uses gw.api.locale.DisplayKey
uses gw.api.testdata.TestDataUtil
uses gw.testharness.v3.GUnitTestClass

uses java.math.BigDecimal


class ECFActivityCreationServiceComponentTest extends GUnitTestClass {

  override function afterMethod(t: Throwable) {
    super.afterMethod(t)
    ECFMessageEntityUtil.deleteAllCatastrophes()
    ECFMessageEntityUtil.deleteAllLMMessagesFromDB()

    var claims = Query.make(Claim).select()

    claims.each(\claim -> {
      gw.transaction.Transaction.runWithNewBundle(\bundle -> {
        bundle.delete(claim.Policy)
        bundle.delete(claim)
      }, User.util.UnrestrictedUser)
    })
  }

  function testCreateActivityForNewClaim() {
    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
    var ucr = ClaimBuilderHelper.getNextUCR()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotify = bundle.add(claimNotify)
      claimNotify.UCR = ucr
      claimNotify.PolicyNumber = "54-123456"
    }, ECFConstants.ECF_SUPER_USER)
    var claimNotifyService = new ClaimNotifyService()
    try {
      claimNotifyService.process(claimNotify)
    } catch (ex: Exception) {
      assertTrue(ex.Message, ex.Message.contains(DisplayKey.get("Accelerator.IPLM.Exception.UnreachableGateway")))
    }

    claimNotify = gw.api.database.Query.make(ECFMessageClaimNotifyRq_Ext).compare(ECFMessage_Ext#UUID, gw.api.database.Relop.Equals, claimNotify.UUID).select().AtMostOneRow
    var activities = claimNotify.Claim.Activities
    assertNotNull("ECF Activity must be created", activities.firstWhere(\elt -> elt.DisplayName == DisplayKey.get("Accelerator.IPLM.Activity.ECF.NewClaimSubject", claimNotify.UCR)))

  }

  function testCreateActivityForExistingClaimWithDifferentLossCause() {
    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
    var ucr = ClaimBuilderHelper.getNextUCR()
    var claim = ClaimBuilderHelper.createClaimWithAClaimNotifyMessage(ucr)
    var cn1 = claim.LMMessages.first()

    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        claim = bundle.add(claim)
        claim.UCR_Ext = ucr
        claimNotify = bundle.add(claimNotify)
        claimNotify.LossCause = "testLossCause"
        claimNotify.UCR = ucr
        claimNotify.PolicyNumber = claim.Policy.PolicyNumber
        claimNotify.Claim = claim
        var claimNotifyService = new ClaimNotifyService()
        try {
          claimNotifyService.process(claimNotify)
        } catch (ex: Exception) {
          assertTrue(ex.Message.contains(DisplayKey.get("Accelerator.IPLM.Exception.UnreachableGateway")))
        }
        claim = gw.api.database.Query.make(Claim).compare(Claim#ID, gw.api.database.Relop.Equals, claim.ID).select().AtMostOneRow
        var activities = claim.Activities
        assertNotNull("ECF Activity must be created", activities.firstWhere(\elt -> elt.Description.contains(DisplayKey.get("Accelerator.IPLM.Activity.ECF.LossCauseDescription", DisplayKey.get("Accelerator.IPLM.Activity.ECF.FieldChanges.To", claimNotify.LossCause)))))
      })
    })
  }

  function testCreateActivityForExistingClaimWithDifferentAmount() {
    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
    var ucr = ClaimBuilderHelper.getNextUCR()
    var claim = ClaimBuilderHelper.createClaimWithAClaimNotifyMessage(ucr)
    var cn1 = claim.LMMessages.first() as ECFMessageClaimNotifyRq_Ext

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claim = bundle.add(claim)
      claim.UCR_Ext = ucr
      claimNotify = bundle.add(claimNotify)
      var amount = cn1.Financials.firstWhere(\elt -> elt?.LossAndExpensesIncurred.Currency == claim.Currency).LossAndExpensesIncurred
      claimNotify.Financials.firstWhere(\elt -> elt?.LossAndExpensesIncurred.Currency == claim.Currency).LossAndExpensesIncurred = new gw.pl.currency.MonetaryAmount(new BigDecimal(amount.toNumber().toBigInteger() * 2), claim.Currency)
      claimNotify.UCR = ucr
      claimNotify.PolicyNumber = claim.Policy.PolicyNumber
      claimNotify.Claim = claim
    }, User.util.UnrestrictedUser)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyService = new ClaimNotifyService()
      try {
        claimNotifyService.process(claimNotify)
      } catch (ex: Exception) {
        assertTrue(ex.Message.contains(DisplayKey.get("Accelerator.IPLM.Exception.UnreachableGateway")))
      }
    }, User.util.UnrestrictedUser)

    claim = gw.api.database.Query.make(Claim).compare(Claim#ID, gw.api.database.Relop.Equals, claim.ID).select().AtMostOneRow
    var activities = claim.Activities
    assertNotNull("ECF Activity must be created", activities.firstWhere(\elt -> elt.Description.contains("Reserve Amount value has changed")))
  }

  function testCreateActivityForExistingClaimWithSameAmount() {
    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
    var ucr = ClaimBuilderHelper.getNextUCR()
    var claim = ClaimBuilderHelper.createClaimWithAClaimNotifyMessage(ucr)
    var numberOfInitialActivities = claim.Activities.length

    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        claim = bundle.add(claim)
        claim.UCR_Ext = ucr
        claimNotify = bundle.add(claimNotify)
        claimNotify.UCR = ucr
        claimNotify.PolicyNumber = claim.Policy.PolicyNumber
        claimNotify.Claim = claim
        var claimNotifyService = new ClaimNotifyService()
        try {
          claimNotifyService.process(claimNotify)
        } catch (ex: Exception) {
          assertTrue(ex.Message.contains(DisplayKey.get("Accelerator.IPLM.Exception.UnreachableGateway")))
        }
        claim = gw.api.database.Query.make(Claim).compare(Claim#ID, gw.api.database.Relop.Equals, claim.ID).select().AtMostOneRow
        var activities = claim.Activities
        assertEquals("ECF Activity must not be created", numberOfInitialActivities+1, activities.length)
      })
    })
  }

  function testCreateActivityForExistingClaimWithLessAmount() {
    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
    var ucr = ClaimBuilderHelper.getNextUCR()
    var claim = ClaimBuilderHelper.createClaimWithAClaimNotifyMessage(ucr)
    var numberOfInitialActivities = claim.Activities.length
    var cn1 = claim.LMMessages.first() as ECFMessageClaimNotifyRq_Ext

    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        claim = bundle.add(claim)
        claim.UCR_Ext = ucr
        claimNotify = bundle.add(claimNotify)
        var amount = cn1.Financials.firstWhere(\elt -> elt?.LossAndExpensesIncurred.Currency == Currency.TC_USD).LossAndExpensesIncurred
        claimNotify.Financials.firstWhere(\elt -> elt?.LossAndExpensesIncurred.Currency == Currency.TC_USD).LossAndExpensesIncurred = new gw.pl.currency.MonetaryAmount(new BigDecimal(amount.toNumber().toBigInteger() / 2), Currency.TC_USD)
        claimNotify.UCR = ucr
        claimNotify.PolicyNumber = claim.Policy.PolicyNumber
        claimNotify.Claim = claim
        var claimNotifyService = new ClaimNotifyService()
        try {
          claimNotifyService.process(claimNotify)
        } catch (ex: Exception) {
          assertTrue(ex.Message.contains(DisplayKey.get("Accelerator.IPLM.Exception.UnreachableGateway")))
        }
        claim = gw.api.database.Query.make(Claim).compare(Claim#ID, gw.api.database.Relop.Equals, claim.ID).select().AtMostOneRow
        var activities = claim.Activities

        assertEquals("ECF Activity must not be created", numberOfInitialActivities+1, activities.length)
      })
    })
  }

  function testCreateActivityForCOIWithYesIndicator() {
    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
    var ucr = ClaimBuilderHelper.getNextUCR()
    var claim = ClaimBuilderHelper.createClaimWithAClaimNotifyMessage(ucr)

    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        claim = bundle.add(claim)
        claimNotify.ConflictOfInterestInd = true
        claim.UCR_Ext = ucr
        claimNotify = bundle.add(claimNotify)
        claimNotify.UCR = ucr
        claimNotify.PolicyNumber = claim.Policy.PolicyNumber
        claimNotify.Claim = claim
        var claimNotifyService = new ClaimNotifyService()
        try {
          claimNotifyService.process(claimNotify)
        } catch (ex: Exception) {
          assertTrue(ex.Message.contains(DisplayKey.get("Accelerator.IPLM.Exception.UnreachableGateway")))
        }
        claim = gw.api.database.Query.make(Claim).compare(Claim#ID, gw.api.database.Relop.Equals, claim.ID).select().AtMostOneRow
        var activity = claim.Activities.firstWhere(\elt ->
            elt.ActivityPattern.Code == ECFConstants.ECF_COI_ACTIVITY_PATTERN_CODE)
        assertTrue("Subject is invalid", activity.Subject.contains(DisplayKey.get("Accelerator.IPLM.Activity.ECF.ConflictOfInterestSubject", claim.UCR_Ext)))
        assertEquals("A Conflict of Interest has been identified on this Claim.", activity.Description)
      })
    })
  }

  function testCreateActivityForCOIWithMarkedClaimAndNoIndicator() {
    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
    var ucr = ClaimBuilderHelper.getNextUCR()
    var claim = ClaimBuilderHelper.createClaimWithAClaimNotifyMessage(ucr)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claim = bundle.add(claim)
      claimNotify.ConflictOfInterestInd = false
      //TODO dependent on US14900 investigation, remove it
      claim.LossLocation.Description = "hasCOI"
      claim.UCR_Ext = ucr
      claimNotify = bundle.add(claimNotify)
      claimNotify.UCR = ucr
      claimNotify.PolicyNumber = claim.Policy.PolicyNumber
      claimNotify.Claim = claim
    }, User.util.UnrestrictedUser)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyService = new ClaimNotifyService()
      try {
        claimNotifyService.process(claimNotify)
      } catch (ex: Exception) {
        assertTrue(ex.Message.contains(DisplayKey.get("Accelerator.IPLM.Exception.UnreachableGateway")))
      }
    }, User.util.UnrestrictedUser)

    claim = gw.api.database.Query.make(Claim).compare(Claim#ID, gw.api.database.Relop.Equals, claim.ID).select().AtMostOneRow
    var activity = claim.Activities.firstWhere(\elt ->
        elt.ActivityPattern.Code == ECFConstants.ECF_COI_ACTIVITY_PATTERN_CODE)
    assertNull("ECF Activity conflict of interest must not be created", activity)
  }

  function testCreateActivityForCOIWithMarkedClaimAndYesIndicator() {
    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
    var ucr = ClaimBuilderHelper.getNextUCR()
    var claim = ClaimBuilderHelper.createClaimWithAClaimNotifyMessage(ucr)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claim = bundle.add(claim)
      claimNotify.ConflictOfInterestInd = true
      //TODO dependent on US14900 investigation, remove it
      claim.LossLocation.Description = "hasCOI"
      claim.UCR_Ext = ucr
      claimNotify = bundle.add(claimNotify)
      claimNotify.UCR = ucr
      claimNotify.PolicyNumber = claim.Policy.PolicyNumber
      claimNotify.Claim = claim
    }, User.util.UnrestrictedUser)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyService = new ClaimNotifyService()
      try {
        claimNotifyService.process(claimNotify)
      } catch (ex: Exception) {
        assertTrue(ex.Message.contains(DisplayKey.get("Accelerator.IPLM.Exception.UnreachableGateway")))
      }
    }, User.util.UnrestrictedUser)

    claim = gw.api.database.Query.make(Claim).compare(Claim#ID, gw.api.database.Relop.Equals, claim.ID).select().AtMostOneRow
    var activity = claim.Activities.firstWhere(\elt ->
        elt.ActivityPattern.Code == ECFConstants.ECF_COI_ACTIVITY_PATTERN_CODE)
    assertTrue("Subject is invalid", activity.Subject.contains(DisplayKey.get("Accelerator.IPLM.Activity.ECF.ConflictOfInterestSubject", claim.UCR_Ext)))
    assertEquals("A Conflict of Interest has been identified on this Claim.", activity.Description)
  }

  function testCreateActivityForCOIWithNoIndicator() {
    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
    var ucr = ClaimBuilderHelper.getNextUCR()
    var claim = ClaimBuilderHelper.createClaimWithAClaimNotifyMessage(ucr)

    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        claim = bundle.add(claim)
        claimNotify.ConflictOfInterestInd = false
        claim.UCR_Ext = ucr
        claimNotify = bundle.add(claimNotify)
        claimNotify.UCR = ucr
        claimNotify.PolicyNumber = claim.Policy.PolicyNumber
        claimNotify.Claim = claim
        var claimNotifyService = new ClaimNotifyService()
        try {
          claimNotifyService.process(claimNotify)
        } catch (ex: Exception) {
          assertTrue(ex.Message.contains(DisplayKey.get("Accelerator.IPLM.Exception.UnreachableGateway")))
        }
        claim = gw.api.database.Query.make(Claim).compare(Claim#ID, gw.api.database.Relop.Equals, claim.ID).select().AtMostOneRow
        var activity = claim.Activities.firstWhere(\elt ->
            elt.ActivityPattern.Code == ECFConstants.ECF_COI_ACTIVITY_PATTERN_CODE)
        assertNull("ECF Activity conflict of interest must not be created", activity)
      })
    })
  }

  function testCreateActivityForNewPcsCatastropheCode() {
    testCreatePcsCatastropheActivity(false, ECFPCSCategoryCode_Ext.TC_Y38)
  }

  function testDoNotCreateActivityForExistingPcsCatastropheCode() {
    testCreatePcsCatastropheActivity(true, ECFPCSCategoryCode_Ext.TC_Y38)
  }

  private function testCreatePcsCatastropheActivity(existingCode: boolean, pcsCatastropheCode: ECFPCSCategoryCode_Ext) {
    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()

    if(existingCode) {
      ClaimBuilderHelper.createPCSCatastrophe(pcsCatastropheCode.Code)
    }

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotify = bundle.add(claimNotify)
      claimNotify.PcsCatastropheCode = pcsCatastropheCode
    }, ECFConstants.ECF_SUPER_USER)
    var claimNotifyService = new ClaimNotifyService()
    try {
      claimNotifyService.process(claimNotify)
    } catch (ex: Exception) {
      assertTrue(ex.Message, ex.Message.contains(DisplayKey.get("Accelerator.IPLM.Exception.UnreachableGateway")))
    }

    claimNotify = gw.api.database.Query.make(ECFMessageClaimNotifyRq_Ext).compare(ECFMessage_Ext#UUID, gw.api.database.Relop.Equals, claimNotify.UUID).select().AtMostOneRow
    var activities = claimNotify.Claim.Activities
    if(existingCode) {
      assertNull("ECF Catastrophe Activity should not be created", activities.firstWhere(\elt -> elt.DisplayName == DisplayKey.get("Accelerator.IPLM.Activity.ECF.Catastrophe.Subject", pcsCatastropheCode.Code)))
    } else {
      assertNotNull("ECF Catastrophe Activity must be created", activities.firstWhere(\elt -> elt.DisplayName == DisplayKey.get("Accelerator.IPLM.Activity.ECF.Catastrophe.Subject", pcsCatastropheCode.Code)))
    }
  }

  function testCreateActivityForNewLcoCatastropheCode() {
    testCreateLcoCatastropheActivity(false, ECFLCOCategoryCode_Ext.TC_00A)
  }

  function testDoNotCreateActivityForExistingLcoCatastropheCode() {
    testCreateLcoCatastropheActivity(true, ECFLCOCategoryCode_Ext.TC_00A)
  }

  private function testCreateLcoCatastropheActivity(existingCode: boolean, lcoCatastropheCode: ECFLCOCategoryCode_Ext) {
    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()

    if(existingCode) {
      ClaimBuilderHelper.createLCOCatastrophe(lcoCatastropheCode.Code)
    }

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotify = bundle.add(claimNotify)
      claimNotify.LcoCatastropheCode = lcoCatastropheCode
    }, ECFConstants.ECF_SUPER_USER)
    var claimNotifyService = new ClaimNotifyService()
    try {
      claimNotifyService.process(claimNotify)
    } catch (ex: Exception) {
      assertTrue(ex.Message, ex.Message.contains(DisplayKey.get("Accelerator.IPLM.Exception.UnreachableGateway")))
    }

    claimNotify = gw.api.database.Query.make(ECFMessageClaimNotifyRq_Ext).compare(ECFMessage_Ext#UUID, gw.api.database.Relop.Equals, claimNotify.UUID).select().AtMostOneRow
    var activities = claimNotify.Claim.Activities
    if(existingCode) {
      assertNull("ECF Catastrophe Activity should not be created", activities.firstWhere(\elt -> elt.DisplayName == DisplayKey.get("Accelerator.IPLM.Activity.ECF.Catastrophe.Subject", lcoCatastropheCode.Code)))
    } else {
      assertNotNull("ECF Catastrophe Activity must be created", activities.firstWhere(\elt -> elt.DisplayName == DisplayKey.get("Accelerator.IPLM.Activity.ECF.Catastrophe.Subject", lcoCatastropheCode.Code)))
    }
  }

  function testCreateActivityForRejectedClaimRetrieve() {
    var claim : Claim
    var claimRetrieveRs : ECFMessageClaimRetrieveRs_Ext
    var initialActivities : Integer

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claim = ClaimBuilderHelper.createClaim(true)
      claimRetrieveRs = ECFMessageEntityUtil.createClaimRetrieveRs()
      claimRetrieveRs.Claim = claim
      claimRetrieveRs.UCR = claim.UCR_Ext
      claimRetrieveRs.ResponseAcknowledgement.AcknowledgementStatus = ECFAcknowledgementStatus_Ext.TC_REJECTED
      claimRetrieveRs.ResponseAcknowledgement.ResponseDescription = "Failed"
      initialActivities = claim.Activities.Count

      new ECFActivityCreationService().createActivitiesForClaimRetrieveRs(claimRetrieveRs)
    }, User.util.UnrestrictedUser)
    claim = claim.refresh() as Claim

    assertEquals(initialActivities + 1, claim.Activities.Count)
  }

  function testCreateActivityForRejectedClaimResponseRs() {
    var claim: Claim
    var claimResponseRs: ECFMessageClaimResponseRs_Ext
    var initialActivities: Integer

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claim = ClaimBuilderHelper.createClaim(true)
      claimResponseRs = ECFMessageEntityUtil.createClaimResponseRs()
      claimResponseRs.Claim = claim
      claimResponseRs.ResponseAcknowledgement.AcknowledgementStatus = ECFAcknowledgementStatus_Ext.TC_REJECTED
      claimResponseRs.ResponseAcknowledgement.ResponseDescription = "Failed"
      initialActivities = claim.Activities.Count

      new ECFActivityCreationService().createActivitiesForClaimResponseRs(claimResponseRs)
    }, User.util.UnrestrictedUser)
    claim = claim.refresh() as Claim

    assertEquals(initialActivities + 1, claim.Activities.Count)
  }

}