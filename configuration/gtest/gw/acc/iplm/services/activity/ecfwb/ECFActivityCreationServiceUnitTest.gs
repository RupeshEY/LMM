package gw.acc.iplm.services.activity.ecfwb

uses entity.Activity
uses gw.acc.iplm.respondrules.RespondRulesContext
uses gw.acc.iplm.services.activity.ActivityCreationService
uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.utils.ECFConstants
uses gw.api.databuilder.ActivityBuilder
uses gw.api.locale.DisplayKey
uses gw.testharness.v3.GUnitTestClass


class ECFActivityCreationServiceUnitTest extends GUnitTestClass {

  private var _activityCreationService : ECFActivityCreationService

  override function beforeMethod() {
    super.beforeMethod()
    _activityCreationService = new ECFActivityCreationService()
  }

  function testCreateActivityForNewClaim() {
    var claim = ClaimBuilderHelper.createClaimWithAClaimNotify()
    var _claimNotifyEvent = claim.LMMessages.whereTypeIs(ECFMessage_Ext).first()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _activityCreationService.createActivities(_claimNotifyEvent)
    }, ECFConstants.ECF_SUPER_USER)
    var activity = claim.Activities.firstWhere(\elt ->
        elt.ActivityPattern.Code == ECFConstants.ECF_CLAIM_ACTIVITY_PATTERN_CODE)
    assertNotNull("No activity is created. ", activity)
    assertNotNull("No activity is created or no message attached.", activity.LMMessage_Ext)
  }

  function testCreateActivityForNewClaim_ForClaimRetrieve() {
    var claim = ClaimBuilderHelper.createClaimWithAClaimRetrieve()
    var _claimRetrieveEvent = claim.LMMessages.whereTypeIs(ECFMessage_Ext).first()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _activityCreationService.createActivities(_claimRetrieveEvent)
    }, ECFConstants.ECF_SUPER_USER)
    var activity = claim.Activities.firstWhere(\elt ->
        elt.ActivityPattern.Code == ECFConstants.ECF_CLAIM_ACTIVITY_PATTERN_CODE)
    assertNotNull("No activity is created. ", activity)
    assertNotNull("No activity is created or no message attached.", activity.LMMessage_Ext)
  }

  function testCreateActivityForExistingClaim() {
    var ucr = ClaimBuilderHelper.getNextUCR()
    var claim = ClaimBuilderHelper.createClaimWithAClaimNotifyMessage(ucr)
    var _claimNotifyEventRq = ECFMessageUtil.createNewClaimNotifyRq()
    var _claimNotifyEvent = ECFMessageEntityUtil.createClaimNotifyRq(_claimNotifyEventRq)
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _claimNotifyEvent.PcsCatastropheCode = ECFPCSCategoryCode_Ext.TC_A18
      _claimNotifyEvent.UCR = ucr
      _claimNotifyEvent.Claim = claim
      _activityCreationService.createActivities(_claimNotifyEvent)
    }, ECFConstants.ECF_SUPER_USER)
    var activity = claim.Activities.firstWhere(\elt ->
        elt.ActivityPattern.Code == ECFConstants.ECF_CLAIM_ACTIVITY_PATTERN_CODE)
    assertNotNull("No activity is created. ", activity)
    assertNotNull("No activity is created or no message attached.", activity.LMMessage_Ext)
  }

  function testCreateActivityForExistingClaim_ForClaimRetrieve() {
    var ucr = ClaimBuilderHelper.getNextUCR()
    var claim = ClaimBuilderHelper.createClaimWithAClaimRetrieveMessage(ucr)
    var _claimRetrieveEventRs = ECFMessageUtil.createNewClaimRetrieveRs()
    var _claimRetrieveEvent = ECFMessageEntityUtil.createClaimRetrieveRs(_claimRetrieveEventRs)
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _claimRetrieveEvent.PcsCatastropheCode = ECFPCSCategoryCode_Ext.TC_A18
      _claimRetrieveEvent.UCR = ucr
      _claimRetrieveEvent.Claim = claim
      _activityCreationService.createActivities(_claimRetrieveEvent)
    }, ECFConstants.ECF_SUPER_USER)
    var activity = claim.Activities.firstWhere(\elt ->
        elt.ActivityPattern.Code == ECFConstants.ECF_CLAIM_ACTIVITY_PATTERN_CODE)
    assertNotNull("No activity is created. ", activity)
    assertNotNull("No activity is created or no message attached.", activity.LMMessage_Ext)
  }

  function testCreateActivityForExistingClaimWithAllReasons() {
    var ucr = ClaimBuilderHelper.getNextUCR()
    var claim = ClaimBuilderHelper.createClaimWithAClaimNotifyMessage(ucr)
    var _claimNotifyEventRq = ECFMessageUtil.createNewClaimNotifyRq()
    var _claimNotifyEvent = ECFMessageEntityUtil.createClaimNotifyRq(_claimNotifyEventRq)
    var cn1 : ECFMessageClaimNotifyRq_Ext
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      cn1 = bundle.add((claim.LMMessages.first() as ECFMessageClaimNotifyRq_Ext))
      cn1.LossCause = "Helo"
      cn1.LcoCatastropheCode = ECFLCOCategoryCode_Ext.TC_00F
      cn1.PcsCatastropheCode = ECFPCSCategoryCode_Ext.TC_A20
    }, ECFConstants.ECF_SUPER_USER)
    cn1 = gw.api.database.Query.make(ECFMessage_Ext).compare(ECFMessage_Ext#UUID, gw.api.database.Relop.Equals, cn1.UUID).select().AtMostOneRow as ECFMessageClaimNotifyRq_Ext
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _claimNotifyEvent.MessageState = ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE
      _claimNotifyEvent.TransactionStatus = ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED
      _claimNotifyEvent.ActionCode = ECFActionCode_Ext.TC_A
      _claimNotifyEvent.PcsCatastropheCode = ECFPCSCategoryCode_Ext.TC_A18
      _claimNotifyEvent.LossCause = "Heli"
      _claimNotifyEvent.LcoCatastropheCode = ECFLCOCategoryCode_Ext.TC_00J
      _claimNotifyEvent.UCR = ucr
      _claimNotifyEvent.Claim = claim
      _claimNotifyEvent.ECFTransactionState.UUID = _claimNotifyEvent.UUID

      _activityCreationService.createActivities(_claimNotifyEvent)
    }, ECFConstants.ECF_SUPER_USER)
    var activity = claim.Activities.firstWhere(\elt ->
        elt.ActivityPattern.Code == ECFConstants.ECF_CLAIM_ACTIVITY_PATTERN_CODE)
    assertNotNull("No activity is created. ", activity)
    assertNotNull("No activity is created or no message attached.", activity.LMMessage_Ext)
    assertTrue("Respondabe activity only should be created.", activity.Description.contains(DisplayKey.get("Accelerator.IPLM.Activity.ECF.RespondableMessageDescription", _claimNotifyEvent.TR)))
    assertTrue("Loss cause description should be appended.",
        activity.Description.contains(DisplayKey.get("Accelerator.IPLM.Activity.ECF.LossCauseDescription",
            DisplayKey.get("Accelerator.IPLM.Activity.ECF.FieldChanges.FromTo", cn1.LossCause, _claimNotifyEvent.LossCause))))
    assertTrue("LcoCatastropheCode description should be appended.", activity.Description.contains(
        DisplayKey.get("Accelerator.IPLM.Activity.ECF.LcoCatastropheCodeDescription", DisplayKey.get("Accelerator.IPLM.Activity.ECF.FieldChanges.FromTo", cn1.LcoCatastropheCode, _claimNotifyEvent.LcoCatastropheCode))))
    assertTrue("PcsCatastropheCodeDescription description should be appended.", activity.Description.contains(DisplayKey.get("Accelerator.IPLM.Activity.ECF.PcsCatastropheCodeDescription", DisplayKey.get("Accelerator.IPLM.Activity.ECF.FieldChanges.FromTo", cn1.PcsCatastropheCode, _claimNotifyEvent.PcsCatastropheCode))))
  }

  function testCreateActivityForRespondableClaimNotifyForNewClaim() {
    var claim = ClaimBuilderHelper.createClaimWithAClaimNotifyMessage(ClaimBuilderHelper.getNextUCR())
    var _claimNotifyEvent = claim.LMMessages.first() as ECFMessageClaimNotifyRq_Ext
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _claimNotifyEvent.TransactionStatus = ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED
      _claimNotifyEvent.ActionCode = ECFActionCode_Ext.TC_A
      _claimNotifyEvent.MessageState = ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE
      RespondRulesContext.updateState(_claimNotifyEvent)

      _activityCreationService.createActivities(_claimNotifyEvent)
    }, ECFConstants.ECF_SUPER_USER)
    var activity = claim.Activities.firstWhere(\elt ->
        elt.ActivityPattern.Code == ECFConstants.ECF_CLAIM_ACTIVITY_PATTERN_CODE)
    assertNotNull("No activity is created. ", activity)
    assertTrue("Respondabe activity only should be created.", activity.Description.contains(DisplayKey.get("Accelerator.IPLM.Activity.ECF.RespondableMessageDescription", _claimNotifyEvent.TR)))
    assertTrue("Activity not created.", activity.Description.contains(claim.ClaimNumber))
    assertNotNull("No activity is created or no message attached.", activity.LMMessage_Ext)
  }

  function testCreateActivityForRespondableClaimNotifyForExtistingClaimWithAppending() {
    var ucr = ClaimBuilderHelper.getNextUCR()
    var claim = ClaimBuilderHelper.createClaimWithAClaimNotifyMessage(ucr)
    var _claimNotifyEventRq = ECFMessageUtil.createNewClaimNotifyRq()
    var _claimNotifyEvent = ECFMessageEntityUtil.createClaimNotifyRq(_claimNotifyEventRq)
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _claimNotifyEvent.PcsCatastropheCode = ECFPCSCategoryCode_Ext.TC_A18
      _claimNotifyEvent.UCR = ucr
      _claimNotifyEvent.Claim = claim
      _claimNotifyEvent.MessageState = ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE
      _claimNotifyEvent.TransactionStatus = ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED
      _claimNotifyEvent.ActionCode = ECFActionCode_Ext.TC_A
      _claimNotifyEvent.ECFTransactionState.UUID = _claimNotifyEvent.UUID
      _activityCreationService.createActivities(_claimNotifyEvent)
    }, ECFConstants.ECF_SUPER_USER)
    var activity = claim.Activities.firstWhere(\elt ->
        elt.ActivityPattern.Code == ECFConstants.ECF_CLAIM_ACTIVITY_PATTERN_CODE)
    assertNotNull("No activity is created. ", activity)
    assertTrue("No activity is created. ", activity.Description.contains(DisplayKey.get("Accelerator.IPLM.Activity.ECF.RespondableMessageDescription", _claimNotifyEvent.TR)))
    assertNotNull("No activity is created or no message attached.", activity.LMMessage_Ext)
  }

  function testCreateActivityForRespondableClaimNotifyForExtistingClaimWithoutAppending() {
    var ucr = ClaimBuilderHelper.getNextUCR()
    var claim = ClaimBuilderHelper.createClaimWithAClaimNotifyMessage(ucr)
    var _claimNotifyEventRq = ECFMessageUtil.createNewClaimNotifyRq()
    var _claimNotifyEvent = ECFMessageEntityUtil.createClaimNotifyRq(_claimNotifyEventRq)
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _claimNotifyEvent.UCR = ucr
      _claimNotifyEvent.Claim = claim
      _claimNotifyEvent.MessageState = ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE
      _claimNotifyEvent.TransactionStatus = ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED
      _claimNotifyEvent.ActionCode = ECFActionCode_Ext.TC_A
      _claimNotifyEvent.ECFTransactionState.UUID = _claimNotifyEvent.UUID
      _activityCreationService.createActivities(_claimNotifyEvent)
    }, ECFConstants.ECF_SUPER_USER)
    var activity = claim.Activities.firstWhere(\elt ->
        elt.ActivityPattern.Code == ECFConstants.ECF_CLAIM_ACTIVITY_PATTERN_CODE)
    assertNotNull("No activity is created. ", activity)
    assertTrue("No activity is created. ", activity.Description.contains(DisplayKey.get("Accelerator.IPLM.Activity.ECF.RespondableMessageDescription", _claimNotifyEvent.TR)))
    assertNotNull("No activity is created or no message attached.", activity.LMMessage_Ext)
  }

  function testSkipCreateActivity() {
    var ucr = ClaimBuilderHelper.getNextUCR()
    var claim = ClaimBuilderHelper.createClaimWithAClaimNotifyMessage(ucr)
    var _claimNotifyEventRq = ECFMessageUtil.createNewClaimNotifyRq()
    var _claimNotifyEvent = ECFMessageEntityUtil.createClaimNotifyRq(_claimNotifyEventRq)
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _claimNotifyEvent.UCR = ucr
      _claimNotifyEvent.Claim = claim
    }, ECFConstants.ECF_SUPER_USER)
    var activity = claim.Activities.firstWhere(\elt ->
        elt.ActivityPattern.Code == ECFConstants.ECF_CLAIM_ACTIVITY_PATTERN_CODE)
    assertNull("No activity should be created. ", activity)
    claim = gw.api.database.Query.make(Claim).compare(Claim#ClaimNumber, gw.api.database.Relop.Equals, claim.ClaimNumber).select().AtMostOneRow
    assertEquals("Claim should not have any activity", 0, claim.Activities.Count)
  }

  function testCreateActivityWithCorrectDescriptionWhenChangingLCOFromNull() {
    final var expectedCode = ECFLCOCategoryCode_Ext.TC_00A
    final var expectedDescription = DisplayKey.get("Accelerator.IPLM.Activity.ECF.LcoCatastropheCodeDescription", DisplayKey.get("Accelerator.IPLM.Activity.ECF.FieldChanges.To", expectedCode))

    // Process the first activity
    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRqWithLinkedClaim()
    processActivities(claimNotify)

    // Send a new Claim Notify to create a new activity for changing the Claim
    claimNotify = ECFMessageEntityUtil.createClaimNotifyRqWithLinkedClaim(claimNotify.Claim)
    claimNotify = changeMessageLCOCode(claimNotify, expectedCode)
    processActivities(claimNotify)

    var activity = getLatestActivityForClaim(claimNotify.Claim)
    assertTrue("Activity description did not contain the expected message. Expected: <${expectedDescription}> Got: <${activity.Description}>}", activity.Description.containsIgnoreCase(expectedDescription))
  }

  function testCreateActivityWithCorrectDescriptionWhenChangingLCO() {
    final var initialCode = ECFLCOCategoryCode_Ext.TC_00B
    final var expectedCode = ECFLCOCategoryCode_Ext.TC_00A
    final var expectedDescription = DisplayKey.get("Accelerator.IPLM.Activity.ECF.LcoCatastropheCodeDescription", DisplayKey.get("Accelerator.IPLM.Activity.ECF.FieldChanges.FromTo", initialCode, expectedCode))

    // Process the first activity
    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRqWithLinkedClaim()
    claimNotify = changeMessageLCOCode(claimNotify, initialCode)
    processActivities(claimNotify)

    // Send a new Claim Notify to create a new activity for changing the Claim
    claimNotify = ECFMessageEntityUtil.createClaimNotifyRqWithLinkedClaim(claimNotify.Claim)
    claimNotify = changeMessageLCOCode(claimNotify, expectedCode)
    processActivities(claimNotify)

    var activity = getLatestActivityForClaim(claimNotify.Claim)
    assertTrue("Activity description did not contain the expected message. Expected: <${expectedDescription}> Got: <${activity.Description}>}", activity.Description.containsIgnoreCase(expectedDescription))
  }

  function testCreateActivityWithCorrectDescriptionWhenChangingPCSFromNull() {
    final var expectedCode = ECFPCSCategoryCode_Ext.TC_A12
    final var expectedDescription = DisplayKey.get("Accelerator.IPLM.Activity.ECF.PcsCatastropheCodeDescription", DisplayKey.get("Accelerator.IPLM.Activity.ECF.FieldChanges.To", expectedCode))

    // Process the first activity
    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRqWithLinkedClaim()
    processActivities(claimNotify)

    // Send a new Claim Notify to create a new activity for changing the Claim
    claimNotify = ECFMessageEntityUtil.createClaimNotifyRqWithLinkedClaim(claimNotify.Claim)
    claimNotify = changeMessagePCSCode(claimNotify, expectedCode)
    processActivities(claimNotify)

    var activity = getLatestActivityForClaim(claimNotify.Claim)
    assertTrue("Activity description did not contain the expected message. Expected: <${expectedDescription}> Got: <${activity.Description}>}", activity.Description.containsIgnoreCase(expectedDescription))
  }

  function testCreateActivityWithCorrectDescriptionWhenChangingPCS() {
    final var initialCode = ECFPCSCategoryCode_Ext.TC_A11
    final var expectedCode = ECFPCSCategoryCode_Ext.TC_A12
    final var expectedDescription = DisplayKey.get("Accelerator.IPLM.Activity.ECF.PcsCatastropheCodeDescription", DisplayKey.get("Accelerator.IPLM.Activity.ECF.FieldChanges.FromTo", initialCode, expectedCode))

    // Process the first activity
    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRqWithLinkedClaim()
    claimNotify = changeMessagePCSCode(claimNotify, initialCode)
    processActivities(claimNotify)

    // Send a new Claim Notify to create a new activity for changing the Claim
    claimNotify = ECFMessageEntityUtil.createClaimNotifyRqWithLinkedClaim(claimNotify.Claim)
    claimNotify = changeMessagePCSCode(claimNotify, expectedCode)
    processActivities(claimNotify)

    var activity = getLatestActivityForClaim(claimNotify.Claim)
    assertTrue("Activity description did not contain the expected message. Expected: <${expectedDescription}> Got: <${activity.Description}>}", activity.Description.containsIgnoreCase(expectedDescription))
  }

  function testCreateActivityWithCorrectDescriptionWhenChangingLossCauseFromNull() {
    final var expectedCode = "Abc"
    final var expectedDescription = DisplayKey.get("Accelerator.IPLM.Activity.ECF.LossCauseDescription", DisplayKey.get("Accelerator.IPLM.Activity.ECF.FieldChanges.To", expectedCode))

    // Process the first activity
    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRqWithLinkedClaim()
    processActivities(claimNotify)

    // Send a new Claim Notify to create a new activity for changing the Claim
    claimNotify = ECFMessageEntityUtil.createClaimNotifyRqWithLinkedClaim(claimNotify.Claim)
    claimNotify = changeMessageLossCause(claimNotify, expectedCode)
    processActivities(claimNotify)

    var activity = getLatestActivityForClaim(claimNotify.Claim)
    assertTrue("Activity description did not contain the expected message. Expected: <${expectedDescription}> Got: <${activity.Description}>}", activity.Description.containsIgnoreCase(expectedDescription))
  }

  function testCreateActivityWithCorrectDescriptionWhenRemovingLCO() {
    final var initialCode = ECFLCOCategoryCode_Ext.TC_00B
    final var expectedDescription = DisplayKey.get("Accelerator.IPLM.Activity.ECF.LcoCatastropheCodeDescription", DisplayKey.get("Accelerator.IPLM.Activity.ECF.FieldChanges.Removed"))

    // Process the first activity
    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRqWithLinkedClaim()
    claimNotify = changeMessageLCOCode(claimNotify, initialCode)
    processActivities(claimNotify)

    // Send a new Claim Notify to create a new activity for changing the Claim
    claimNotify = ECFMessageEntityUtil.createClaimNotifyRqWithLinkedClaim(claimNotify.Claim)
    claimNotify = changeMessageLCOCode(claimNotify, null)
    processActivities(claimNotify)

    var activity = getLatestActivityForClaim(claimNotify.Claim)
    assertTrue("Activity description did not contain the expected message. Expected: <${expectedDescription}> Got: <${activity.Description}>}", activity.Description.containsIgnoreCase(expectedDescription))
  }

  function testCreateActivityWithCorrectDescriptionWhenRemovingPCS() {
    final var initialCode = ECFPCSCategoryCode_Ext.TC_A11
    final var expectedDescription = DisplayKey.get("Accelerator.IPLM.Activity.ECF.PcsCatastropheCodeDescription", DisplayKey.get("Accelerator.IPLM.Activity.ECF.FieldChanges.Removed"))

    // Process the first activity
    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRqWithLinkedClaim()
    claimNotify = changeMessagePCSCode(claimNotify, initialCode)
    processActivities(claimNotify)

    // Send a new Claim Notify to create a new activity for changing the Claim
    claimNotify = ECFMessageEntityUtil.createClaimNotifyRqWithLinkedClaim(claimNotify.Claim)
    claimNotify = changeMessagePCSCode(claimNotify, null)
    processActivities(claimNotify)

    var activity = getLatestActivityForClaim(claimNotify.Claim)
    assertTrue("Activity description did not contain the expected message. Expected: <${expectedDescription}> Got: <${activity.Description}>}", activity.Description.containsIgnoreCase(expectedDescription))
  }

  function testCreateActivityWithCorrectDescriptionWhenRemovingLossCause() {
    final var initialCode = "Abc"
    final var expectedDescription = DisplayKey.get("Accelerator.IPLM.Activity.ECF.LossCauseDescription", DisplayKey.get("Accelerator.IPLM.Activity.ECF.FieldChanges.Removed"))

    // Process the first activity
    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRqWithLinkedClaim()
    claimNotify = changeMessageLossCause(claimNotify, initialCode)
    processActivities(claimNotify)

    // Send a new Claim Notify to create a new activity for changing the Claim
    claimNotify = ECFMessageEntityUtil.createClaimNotifyRqWithLinkedClaim(claimNotify.Claim)
    claimNotify = changeMessageLossCause(claimNotify, null)
    processActivities(claimNotify)

    var activity = getLatestActivityForClaim(claimNotify.Claim)
    assertTrue("Activity description did not contain the expected message. Expected: <${expectedDescription}> Got: <${activity.Description}>}", activity.Description.containsIgnoreCase(expectedDescription))
  }

  function testCreateActivityWithCorrectDescriptionWhenChangingLossCause() {
    final var initialCode = "Abc"
    final var expectedCode = "Def"
    final var expectedDescription = DisplayKey.get("Accelerator.IPLM.Activity.ECF.LossCauseDescription", DisplayKey.get("Accelerator.IPLM.Activity.ECF.FieldChanges.FromTo", initialCode, expectedCode))

    // Process the first activity
    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRqWithLinkedClaim()
    claimNotify = changeMessageLossCause(claimNotify, initialCode)
    processActivities(claimNotify)

    // Send a new Claim Notify to create a new activity for changing the Claim
    claimNotify = ECFMessageEntityUtil.createClaimNotifyRqWithLinkedClaim(claimNotify.Claim)
    claimNotify = changeMessageLossCause(claimNotify, expectedCode)
    processActivities(claimNotify)

    var activity = getLatestActivityForClaim(claimNotify.Claim)
    assertTrue("Activity description did not contain the expected message. Expected: <${expectedDescription}> Got: <${activity.Description}>}", activity.Description.containsIgnoreCase(expectedDescription))
  }

  function testCreateActivityForClaimResponseAuthorisation() {
    var pattern = "approve_ecf_transaction"
    var msg = ECFMessageEntityUtil.createClaimResponseRq()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      msg.Claim = ClaimBuilderHelper.createClaim()
    }, ECFConstants.ECF_SUPER_USER)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _activityCreationService.createActivityForClaimResponseAuthorisation(msg)
    }, ECFConstants.ECF_SUPER_USER)

    var activity = getLatestActivityForClaim(msg.Claim, pattern)

    assertNotNull("Activity not created", activity)
  }

  function testCreateActivityForClaimResponseAuthorizationRejection() {
    var pattern = ECFConstants.OOTB_APPROVAL_DENIED
    var msg = ECFMessageEntityUtil.createClaimResponseRq()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      msg.Claim = ClaimBuilderHelper.createClaim()
    }, ECFConstants.ECF_SUPER_USER)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _activityCreationService.createActivityForClaimResponseAuthorisation(msg)
    }, ECFConstants.ECF_SUPER_USER)

    var activity = getLatestActivityForClaim(msg.Claim, "approve_ecf_transaction")

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _activityCreationService.createActivityForClaimResponseAuthorizationRejection(activity)
    }, ECFConstants.ECF_SUPER_USER)

    activity = getLatestActivityForClaim(msg.Claim, pattern)

    assertNotNull("Activity not created", activity)
  }

  function testCreateActivityForPendingResponseBeingSuperseded() {
    var ucr = ClaimBuilderHelper.getNextUCR()
    var tr = "TR1"
    var claim = ClaimBuilderHelper.createClaimWithAClaimNotifyMessage(ucr)

    var originalClaimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
    var claimResponse = ECFMessageEntityUtil.createClaimResponseRq()
    var supersedingClaimNotify = ECFMessageEntityUtil.createClaimNotifyRq()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      originalClaimNotify = bundle.add(originalClaimNotify)
      originalClaimNotify.UCR = ucr
      originalClaimNotify.TR = tr
      originalClaimNotify.Claim = claim

      supersedingClaimNotify = bundle.add(supersedingClaimNotify)
      supersedingClaimNotify.UCR = ucr
      supersedingClaimNotify.TR = tr
      supersedingClaimNotify.Claim = claim

      claimResponse = bundle.add(claimResponse)
      claimResponse.Status = ECFMessageStatus_Ext.TC_FINANCIALAUTHORISATION
      claimResponse.TR = tr
      claimResponse.Claim = claim
    }, ECFConstants.ECF_SUPER_USER)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _activityCreationService.createActivities(supersedingClaimNotify)
    }, ECFConstants.ECF_SUPER_USER)

    var activity = claim.Activities.firstWhere(\elt ->
        elt.ActivityPattern.Code == ECFConstants.ECF_CLAIM_ACTIVITY_PATTERN_CODE)
    assertNotNull("No activity is created. ", activity)
    assertTrue("Activity does not contain PreviousResponseSuperseded message", activity.Description.contains(DisplayKey.get("Accelerator.IPLM.Activity.ECF.PreviousResponseSuperseded")))
  }

  function testClosePreviousActivityForPendingResponseBeingSuperseded() {
    var ucr = ClaimBuilderHelper.getNextUCR()
    var tr = "TR1"
    var claim = ClaimBuilderHelper.createClaimWithAClaimNotifyMessage(ucr)

    var originalClaimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
    var claimResponse = ECFMessageEntityUtil.createClaimResponseRq()
    var supersedingClaimNotify = ECFMessageEntityUtil.createClaimNotifyRq()

    var activity : Activity

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      originalClaimNotify = bundle.add(originalClaimNotify)
      originalClaimNotify.UCR = ucr
      originalClaimNotify.TR = tr
      originalClaimNotify.Claim = claim

      supersedingClaimNotify = bundle.add(supersedingClaimNotify)
      supersedingClaimNotify.UCR = ucr
      supersedingClaimNotify.TR = tr
      supersedingClaimNotify.Claim = claim

      claimResponse = bundle.add(claimResponse)
      claimResponse.Status = ECFMessageStatus_Ext.TC_FINANCIALAUTHORISATION
      claimResponse.TR = tr
      claimResponse.Claim = claim

      new ECFActivityCreationService().createActivityForClaimResponseAuthorisation(claimResponse)
      activity = claimResponse.ApprovalActivity
    }, ECFConstants.ECF_SUPER_USER)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _activityCreationService.createActivities(supersedingClaimNotify)
    }, ECFConstants.ECF_SUPER_USER)

    assertTrue("approve_ecf_transaction Activity should be now completed", activity.Status == ActivityStatus.TC_COMPLETE)
  }

  private function changeMessageLCOCode(ecfMessage : ECFMessageClaimNotifyRq_Ext, lcoCode : ECFLCOCategoryCode_Ext) : ECFMessageClaimNotifyRq_Ext {
    if (ecfMessage.LcoCatastropheCode != lcoCode) {
      gw.transaction.Transaction.runWithNewBundle(\bundle -> {
        ecfMessage = bundle.add(ecfMessage)
        ecfMessage.LcoCatastropheCode = lcoCode
      }, ECFConstants.ECF_SUPER_USER)
    }
    return ecfMessage
  }

  private function changeMessagePCSCode(ecfMessage : ECFMessageClaimNotifyRq_Ext, pcsCode : ECFPCSCategoryCode_Ext) : ECFMessageClaimNotifyRq_Ext {
    if (ecfMessage.PcsCatastropheCode != pcsCode) {
      gw.transaction.Transaction.runWithNewBundle(\bundle -> {
        ecfMessage = bundle.add(ecfMessage)
        ecfMessage.PcsCatastropheCode = pcsCode
      }, ECFConstants.ECF_SUPER_USER)
    }
    return ecfMessage
  }

  private function changeMessageLossCause(ecfMessage : ECFMessageClaimNotifyRq_Ext, lossCause : String) : ECFMessageClaimNotifyRq_Ext {
    if (ecfMessage.LossCause != lossCause) {
      gw.transaction.Transaction.runWithNewBundle(\bundle -> {
        ecfMessage = bundle.add(ecfMessage)
        ecfMessage.LossCause = lossCause
      }, ECFConstants.ECF_SUPER_USER)
    }
    return ecfMessage
  }

  private function processActivities(ecfMessage : ECFMessageClaimNotifyRq_Ext) {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _activityCreationService.createActivities(ecfMessage)
    }, ECFConstants.ECF_SUPER_USER)
  }

  private function getLatestActivityForClaim(claim : Claim, activityPatternCode : String = ECFConstants.ECF_CLAIM_ACTIVITY_PATTERN_CODE) : Activity {
    return claim.Activities.orderBy(\elt -> elt.CreateTime).lastWhere(\elt -> elt.ActivityPattern.Code == activityPatternCode)
  }
}