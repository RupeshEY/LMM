package gw.acc.iplm.services.claim.ecfwb

uses gw.acc.iplm.dao.impl.ClaimDAO
uses gw.acc.iplm.services.policy.ECFPolicyService
uses gw.acc.iplm.testutils.AssertUtils
uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.testutils.EntityUtil
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.ClaimNotifyEventRq
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs
uses gw.testharness.v3.GUnitTestClass
uses org.mockito.Mockito

uses java.text.SimpleDateFormat

class ECFClaimServiceTest extends GUnitTestClass {

  var _ecfClaimService : ECFClaimService
  var _claimDAO : ClaimDAO
  var _policyService: ECFPolicyService

  override function beforeMethod() {
    super.beforeMethod()
    _claimDAO = Mockito.mock(ClaimDAO)
    _policyService = Mockito.mock(ECFPolicyService)
    _ecfClaimService = new ECFClaimService(_claimDAO, _policyService)
  }

  override function afterMethod(t: Throwable) {
    super.afterMethod(t)
    ECFMessageEntityUtil.deleteAllECFMessagesFromDB()
    ECFMessageEntityUtil.deleteAllCatastrophes()
  }

  public function testMapClaimRetrieveResponseToClaim() {
    var claimRetrieveXml = getClaimRetrieveRs()
    var ecfMessage = createRetrieveRsEntityAndClaim(claimRetrieveXml)
    var updatedClaim = callMapper(ecfMessage)

    assertNotNull(updatedClaim.ClaimNumber)
    assertEquals(ecfMessage.Claim.ClaimNumber, updatedClaim.ClaimNumber)
  }

  public function testMapClaimNotifyRequestToClaim() {
    var claimNotify = getClaimNotifyRq()
    var ecfMessage = createClaimNotifyRqEntityAndClaim(claimNotify)
    var updatedClaim = callMapper(ecfMessage)

    assertNotNull(updatedClaim.ClaimNumber)
    assertEquals(ecfMessage.Claim.ClaimNumber, updatedClaim.ClaimNumber)
  }

  public function testDescriptionUpdatedClaimRetrieve() {
    //Create the Response
    var claimRetrieveXml = getClaimRetrieveRs()
    var newLossDetails = getRandomString()
    claimRetrieveXml.LossDetails = newLossDetails

    //Create the Response entity and Claim
    var ecfMessage = createRetrieveRsEntityAndClaim(claimRetrieveXml)

    //Map the claim
    var updatedClaim = callMapper(ecfMessage)

    //Get the newly reported date
    assertNotNull(updatedClaim.Description)
    assertEquals(newLossDetails, updatedClaim.Description)
  }

  public function testDescriptionUpdatedClaimNotify() {
    //Create the Response
    var claimNotify = getClaimNotifyRq()
    var newLossDetails = getRandomString()
    claimNotify.ClaimMovement.LossDetails = newLossDetails

    //Create the Response entity and Claim
    var ecfMessage = createClaimNotifyRqEntityAndClaim(claimNotify)

    //Map the claim
    var updatedClaim = callMapper(ecfMessage)

    //Get the newly reported date
    assertNotNull(updatedClaim.Description)
    assertEquals(newLossDetails, updatedClaim.Description)
  }

  public function testLossLocationUpdatedClaimRetrieve() {
    //Create the Response
    var claimRetrieveXml = getClaimRetrieveRs()
    var newLossLocationDescription = getRandomString()
    claimRetrieveXml.ClaimLossLocationDescription = newLossLocationDescription

    //Create the Response entity and Claim
    var ecfMessage = createRetrieveRsEntityAndClaim(claimRetrieveXml)

    //Map the claim
    var updatedClaim = callMapper(ecfMessage)

    //Get the newly reported date
    assertNotNull(updatedClaim.LossLocation.Description)
    assertEquals(newLossLocationDescription, updatedClaim.LossLocation.Description)
  }

  public function testLossLocationUpdatedClaimNotify() {
    //Create the Response
    var claimNotify = getClaimNotifyRq()
    var newLossLocationDescription = getRandomString()
    claimNotify.ClaimMovement.Claim.LossLocation.Location.Description = newLossLocationDescription

    //Create the Response entity and Claim
    var ecfMessage = createClaimNotifyRqEntityAndClaim(claimNotify)

    //Map the claim
    var updatedClaim = callMapper(ecfMessage)

    //Get the newly reported date
    assertNotNull(updatedClaim.LossLocation.Description)
    assertEquals(newLossLocationDescription, updatedClaim.LossLocation.Description)
  }

  public function testLossDateUpdatedClaimRetrieve() {
    //Create the Response
    var claimRetrieveXml = getClaimRetrieveRs()
    var newLossStartDate = getNewLossStartDate()
    var newLossEndDate = getNewLossEndDate()

    //Create the Response entity and Claim
    var ecfMessage = createRetrieveRsEntityAndClaim(claimRetrieveXml)
    ecfMessage.LossStartDate = newLossStartDate
    ecfMessage.LossEndDate = newLossEndDate

    //Map the claim
    var updatedClaim = callMapper(ecfMessage)

    //Get the newly reported date
    assertNotNull(updatedClaim.LossDate)
    assertNotNull(updatedClaim.LossEndDate_Ext)
    assertEquals(newLossStartDate.toString(), updatedClaim.LossDate.toString())
    assertEquals(newLossEndDate.toString(), updatedClaim.LossEndDate_Ext.toString())
  }

  public function testLossDateUpdatedClaimNotify() {
    var claimNotify = getClaimNotifyRq()
    var newLossStartDate = getNewLossStartDate()
    var newLossEndDate = getNewLossEndDate()

    var ecfMessage = createClaimNotifyRqEntityAndClaim(claimNotify)
    ecfMessage.LossStartDate = newLossStartDate
    ecfMessage.LossEndDate = newLossEndDate
    var updatedClaim = callMapper(ecfMessage)

    assertNotNull(updatedClaim.LossDate)
    assertNotNull(updatedClaim.LossEndDate_Ext)
    assertEquals(newLossStartDate.toString(), updatedClaim.LossDate.toString())
    assertEquals(newLossEndDate.toString(), updatedClaim.LossEndDate_Ext.toString())
  }

  public function testClaimTypeUpdatedClaimRetrieve() {
    //Create the Response
    var claimRetrieveXml = getClaimRetrieveRs()
    var newClaimType = "003"
    claimRetrieveXml.ClaimType = newClaimType

    //Create the Response entity and Claim
    var ecfMessage = createRetrieveRsEntityAndClaim(claimRetrieveXml)

    //Map the claim
    var updatedClaim = callMapper(ecfMessage)

    //Get the newly reported date
    assertNotNull(updatedClaim.ClaimTypeCode_Ext)
    assertEquals(newClaimType, updatedClaim.ClaimTypeCode_Ext.Code)
  }

  public function testClaimTypeUpdatedClaimNotify() {
    var claimNotify = getClaimNotifyRq()
    var newClaimType = "003"
    claimNotify.ClaimMovement.Extension.Claim.ClaimType = newClaimType
    var ecfMessage = createClaimNotifyRqEntityAndClaim(claimNotify)
    var updatedClaim = callMapper(ecfMessage)

    assertNotNull(updatedClaim.ClaimTypeCode_Ext)
    assertEquals(newClaimType, updatedClaim.ClaimTypeCode_Ext.Code)
  }

  public function testClaimLineNumberUpdatedClaimRetrieve() {
    //Create the Response
    var claimRetrieveXml = getClaimRetrieveRs()
    var newClaimLineNumber = getRandomThreeDigitInteger()
    claimRetrieveXml.ClaimLineNumber = newClaimLineNumber

    //Create the Response entity and Claim
    var ecfMessage = createRetrieveRsEntityAndClaim(claimRetrieveXml)

    //Map the claim
    var updatedClaim = callMapper(ecfMessage)

    //Get the newly reported date
    assertNotNull(updatedClaim.ClaimLineNumber_Ext)
    assertEquals(newClaimLineNumber, updatedClaim.ClaimLineNumber_Ext)
  }

  public function testClaimLineNumberUpdatedClaimNotify() {
    var claimNotify = getClaimNotifyRq()
    var newClaimLineNumber = getRandomThreeDigitInteger()
    claimNotify.ClaimMovement.Extension.Claim.ClaimLineNumber = newClaimLineNumber
    var ecfMessage = createClaimNotifyRqEntityAndClaim(claimNotify)
    var updatedClaim = callMapper(ecfMessage)

    assertNotNull(updatedClaim.ClaimLineNumber_Ext)
    assertEquals(newClaimLineNumber, updatedClaim.ClaimLineNumber_Ext)
  }

  public function testPartiesAddedClaimRetrieve() {
    //Create the Response
    var claimRetrieveXml = getClaimRetrieveRs()

    //Ensure the party has a unique name
    var newName = getTimeStampString()
    claimRetrieveXml.ClaimMovement.Extension.Contract.ContractMarket.first().InsurerOrReinsurer.first().Party.Name = newName

    //Create the Response entity and Claim
    var ecfMessage = createRetrieveRsEntityAndClaim(claimRetrieveXml)

    //Ensure the party with the unique name is not on the Claim
    var allContactNames = ecfMessage.Claim.Contacts*.Contact*.DisplayName
    assertSame(0, allContactNames.where(\name -> name.toLowerCase().contains(newName)).Count)

    //Map the claim
    var updatedClaim = callMapper(ecfMessage)

    //Get the newly added Party
    //Ensure the party with the unique name is not on the Claim
    var newAllContactNames = updatedClaim.Contacts*.Contact*.DisplayName
    var matchingContacts = newAllContactNames.where(\name -> name.toLowerCase().contains(newName))

    assertEquals(1, matchingContacts.Count)
    assertEquals(newName, matchingContacts.first())
  }

  public function testPartiesAddedClaimNotify() {
    var claimNotify = getClaimNotifyRq()
    var nonCarrierNameInXmlSample = "SYNDICATE 2001"
    var ecfMessage: ECFMessageClaimNotifyRq_Ext
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      ecfMessage = bundle.add(createClaimNotifyRqEntityAndClaim(claimNotify))
    }, User.util.UnrestrictedUser)

    //Ensure the party with the unique name is not on the Claim
    var allContactNames = ecfMessage.Claim.Contacts*.Contact*.DisplayName
    assertSame(0, allContactNames.where(\name -> name.contains(nonCarrierNameInXmlSample)).Count)

    //Map the claim
    var updatedClaim = callMapper(ecfMessage)

    //Get the newly added Party
    //Ensure the party with the unique name is not on the Claim
    var newAllContactNames = updatedClaim.Contacts*.Contact*.DisplayName
    var matchingContacts = newAllContactNames.where(\name -> name.contains(nonCarrierNameInXmlSample))

    assertEquals(1, matchingContacts.Count)
    assertEquals(nonCarrierNameInXmlSample, matchingContacts.first())
  }

  public function testSettingEEvent() {
    //Create the Response
    var claimRetrieveXml = getClaimRetrieveRs()
    claimRetrieveXml.LloydsStatus = ECFTransactionStatus_Ext.TC_3.DisplayName

    //Create the Response entity and Claim
    var ecfMessage = createRetrieveRsEntityAndClaim(claimRetrieveXml)

    //Map the claim
    var updatedClaim = callMapper(ecfMessage)

    //Get the newly reported date
    assertTrue(updatedClaim.ECFLocked)
  }

  public function testNotSettingEEvent() {
    //Create the Response
    var claimRetrieveXml = getClaimRetrieveRs()
    claimRetrieveXml.LloydsStatus = ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED.DisplayName

    //Create the Response entity and Claim
    var ecfMessage = createRetrieveRsEntityAndClaim(claimRetrieveXml)

    //Map the claim
    var updatedClaim = callMapper(ecfMessage)

    //Get the newly reported date
    assertFalse(updatedClaim.ECFLocked)
  }

  public function testClaimNotifyEEventFlagsTheClaim() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var claim = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, Date.getCurrentDate().addYears(-2))
      var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
      claimNotify.UCR = ClaimBuilderHelper.getNextUCR()
      claimNotify.ActionCode = ECFActionCode_Ext.get("E")

      new ECFClaimService().updateClaimData(claimNotify, claim)

      assertNotNull(claim.EEventTime_Ext)
      assertTrue(claim.ECFLocked)
    })
  }

  public function testClaimNotifyEEventFlagGetsRemoved() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var claim = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, Date.getCurrentDate().addYears(-2))
      var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
      claimNotify.UCR = ClaimBuilderHelper.getNextUCR()
      claimNotify.ActionCode = ECFActionCode_Ext.get("E")

      new ECFClaimService().updateClaimData(claimNotify, claim)

      assertNotNull(claim.EEventTime_Ext)
      assertTrue(claim.ECFLocked)

      claimNotify.ActionCode = ECFActionCode_Ext.get("A")
      new ECFClaimService().updateClaimData(claimNotify, claim)
      assertNull(claim.EEventTime_Ext)
      assertFalse(claim.ECFLocked)

    })
  }

  public function testClaimNotifyEEventFlagNotRemovedForRCode() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var claim = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, Date.getCurrentDate().addYears(-2))
      var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
      claimNotify.UCR = ClaimBuilderHelper.getNextUCR()
      claimNotify.ActionCode = ECFActionCode_Ext.get("E")

      new ECFClaimService().updateClaimData(claimNotify, claim)

      assertNotNull(claim.EEventTime_Ext)
      assertTrue(claim.ECFLocked)

      claimNotify.ActionCode = ECFActionCode_Ext.get("R")
      new ECFClaimService().updateClaimData(claimNotify, claim)
      assertNotNull(claim.EEventTime_Ext)
      assertTrue(claim.ECFLocked)

    })
  }

  public function testEEventFlagRemovedAfterTimeout() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var claim = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, Date.getCurrentDate().addYears(-2))
      var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
      claimNotify.UCR = ClaimBuilderHelper.getNextUCR()
      claimNotify.ActionCode = ECFActionCode_Ext.get("E")

      new ECFClaimService().updateClaimData(claimNotify, claim)

      assertNotNull(claim.EEventTime_Ext)
      assertTrue(claim.ECFLocked)

      var timeOutHours = ScriptParameters.getClaimNotify_EEvent_TimeOut_Hours()
      claim.EEventTime_Ext = Date.Now.addHours(-timeOutHours).addMinutes(-1)
      assertFalse(claim.ECFLocked)
    })
  }

  public function testEEventFlagWithTransactionStatusValid() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var claim = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, Date.getCurrentDate().addYears(-2))
      var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
      claimNotify.UCR = ClaimBuilderHelper.getNextUCR()
      claimNotify.ActionCode = ECFActionCode_Ext.get("A")
      claimNotify.TransactionStatus = ECFTransactionStatus_Ext.get("3")

      new ECFClaimService().updateClaimData(claimNotify, claim)

      assertNotNull(claim.EEventTime_Ext)
      assertTrue("Claim should be ECF Locked but isn't", claim.ECFLocked)
    })
  }

  public function testEEventFlagWithTransactionStatusInvalid() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var claim = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, Date.getCurrentDate().addYears(-2))
      var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
      claimNotify.UCR = ClaimBuilderHelper.getNextUCR()
      claimNotify.ActionCode = ECFActionCode_Ext.get("A")
      claimNotify.TransactionStatus = ECFTransactionStatus_Ext.get("8-PURGED")

      new ECFClaimService().updateClaimData(claimNotify, claim)

      assertFalse("Claim should not be ECF Locked but is", claim.ECFLocked)
    })
  }

  public function testMaintainingVSCIndicator_VCS_XCS() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {

      var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
      claimNotify.UCR = ClaimBuilderHelper.getNextUCR()
      claimNotify.TriageCategory = ECFTriageCode_Ext.TC_VCS_XCS

      var claim = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, Date.getCurrentDate().addYears(-2))
      claim.VCSIndicator_Ext = true
      claim.UCR_Ext = claimNotify.UCR

      new ECFClaimService().updateClaimData(claimNotify, claim)

      assertTrue("Claim should have the VCS Indicator marked as true", claim.VCSIndicator_Ext)
    })
  }

  public function testMaintainingVSCIndicator_VCS_CRAWFORD() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {

      var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
      claimNotify.UCR = ClaimBuilderHelper.getNextUCR()
      claimNotify.TriageCategory = ECFTriageCode_Ext.TC_VCS_CRAWFORD

      var claim = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, Date.getCurrentDate().addYears(-2))
      claim.VCSIndicator_Ext = true
      claim.UCR_Ext = claimNotify.UCR

      new ECFClaimService().updateClaimData(claimNotify, claim)

      assertTrue("Claim should have the VCS Indicator marked as true", claim.VCSIndicator_Ext)
    })
  }

  public function testAddingVSCIndicator_VCS_XCS() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {

      var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
      claimNotify.UCR = ClaimBuilderHelper.getNextUCR()
      claimNotify.TriageCategory = ECFTriageCode_Ext.TC_VCS_XCS

      var claim = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, Date.getCurrentDate().addYears(-2))
      claim.VCSIndicator_Ext = false
      claim.UCR_Ext = claimNotify.UCR

      new ECFClaimService().updateClaimData(claimNotify, claim)

      assertTrue("Claim should have the VCS Indicator marked as true", claim.VCSIndicator_Ext)
    })
  }

  public function testAddingVSCIndicator_VCS_CRAWFORD() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {

      var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
      claimNotify.UCR = ClaimBuilderHelper.getNextUCR()
      claimNotify.TriageCategory = ECFTriageCode_Ext.TC_VCS_CRAWFORD

      var claim = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, Date.getCurrentDate().addYears(-2))
      claim.VCSIndicator_Ext = false
      claim.UCR_Ext = claimNotify.UCR

      new ECFClaimService().updateClaimData(claimNotify, claim)

      assertTrue("Claim should have the VCS Indicator marked as true", claim.VCSIndicator_Ext)
    })
  }

  public function testRemovingVSCIndicator_VCS_EXIT_XCS() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {

      var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
      claimNotify.UCR = ClaimBuilderHelper.getNextUCR()
      claimNotify.TriageCategory = null
      claimNotify.ResponseCode = ECFResponseCode_Ext.TC_VCS_EXIT_XCS

      var claim = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, Date.getCurrentDate().addYears(-2))
      claim.VCSIndicator_Ext = true
      claim.UCR_Ext = claimNotify.UCR

      new ECFClaimService().updateClaimData(claimNotify, claim)

      assertFalse("Claim should have the VCS Indicator marked as false", claim.VCSIndicator_Ext)
    })
  }

  public function testRemovingVSCIndicator_VCS_EXIT_CFORD() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
      claimNotify.UCR = ClaimBuilderHelper.getNextUCR()
      claimNotify.TriageCategory = null
      claimNotify.ResponseCode = ECFResponseCode_Ext.TC_VCS_EXIT_CFORD

      var claim = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, Date.getCurrentDate().addYears(-2))
      claim.VCSIndicator_Ext = true
      claim.UCR_Ext = claimNotify.UCR

      new ECFClaimService().updateClaimData(claimNotify, claim)

      assertFalse("Claim should have the VCS Indicator marked as false", claim.VCSIndicator_Ext)
    })
  }

  public function testSettingUberPrecautionaryFlag_true() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
      claimNotify.UCR = ClaimBuilderHelper.getNextUCR()
      claimNotify.OutstandingAmountQualifier = ECFOutstandingQualifierCode_Ext.TC_U
      var claim = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, Date.getCurrentDate().addYears(-2))
      claim.UberPrecautionaryFlag_Ext = false
      claim.UCR_Ext = claimNotify.UCR

      new ECFClaimService().updateClaimData(claimNotify, claim)
      assertTrue("Claim UberPrecautionaryFlag should be marked as true", claim.UberPrecautionaryFlag_Ext)
    })
  }

  public function testupdateCatastrophes_LCOAndPCS_AlreadyExist() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      ClaimBuilderHelper.createLCOCatastrophe(ECFLCOCategoryCode_Ext.TC_00B.Code)
      ClaimBuilderHelper.createPCSCatastrophe(ECFPCSCategoryCode_Ext.TC_A11.Code)
      var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
      claimNotify.UCR = ClaimBuilderHelper.getNextUCR()
      claimNotify.LcoCatastropheCode = ECFLCOCategoryCode_Ext.TC_00B
      claimNotify.PcsCatastropheCode = ECFPCSCategoryCode_Ext.TC_A11
      var claim = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, Date.getCurrentDate().addYears(-2))
      claim.UberPrecautionaryFlag_Ext = true
      claim.UCR_Ext = claimNotify.UCR
      var updatedClaim = new ECFClaimService().updateClaimData(claimNotify, claim)
      assertEquals("00B", updatedClaim.Catastrophe.LCOCode)
      assertEquals("LCO-00B", updatedClaim.Catastrophe.Name)
    })
  }

  public function testupdateCatastrophes_LCO_AlreadyExist() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      ClaimBuilderHelper.createLCOCatastrophe(ECFLCOCategoryCode_Ext.TC_00B.Code)
      var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
      claimNotify.UCR = ClaimBuilderHelper.getNextUCR()
      claimNotify.LcoCatastropheCode = ECFLCOCategoryCode_Ext.TC_00B
      var claim = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, Date.getCurrentDate().addYears(-2))
      claim.UberPrecautionaryFlag_Ext = true
      claim.UCR_Ext = claimNotify.UCR
      var updatedClaim = new ECFClaimService().updateClaimData(claimNotify, claim)
      assertEquals("00B", updatedClaim.Catastrophe.LCOCode)
      assertEquals("LCO-00B", updatedClaim.Catastrophe.Name)
    })
  }

  public function testupdateCatastrophes_PCS_AlreadyExist() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      ClaimBuilderHelper.createPCSCatastrophe(ECFPCSCategoryCode_Ext.TC_A11.Code)
      var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
      claimNotify.UCR = ClaimBuilderHelper.getNextUCR()
      claimNotify.PcsCatastropheCode = ECFPCSCategoryCode_Ext.TC_A11
      var claim = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, Date.getCurrentDate().addYears(-2))
      claim.UberPrecautionaryFlag_Ext = true
      claim.UCR_Ext = claimNotify.UCR
      var updatedClaim = new ECFClaimService().updateClaimData(claimNotify, claim)
      assertEquals("A11", updatedClaim.Catastrophe.PCSCatastropheNumber)
      assertEquals("PCS-A11", updatedClaim.Catastrophe.Name)
    })
  }

  public function testupdateCatastrophes_LCO_NotExist() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
      claimNotify.UCR = ClaimBuilderHelper.getNextUCR()
      claimNotify.LcoCatastropheCode = ECFLCOCategoryCode_Ext.TC_00B
      var claim = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, Date.getCurrentDate().addYears(-2))
      claim.UberPrecautionaryFlag_Ext = true
      claim.UCR_Ext = claimNotify.UCR
      var updatedClaim = new ECFClaimService().updateClaimData(claimNotify, claim)
      assertNull("LCO Catastrophe code should be null", updatedClaim.Catastrophe)
    })
  }

  public function testupdateCatastrophes_PCS_NotExist() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
      claimNotify.UCR = ClaimBuilderHelper.getNextUCR()
      claimNotify.PcsCatastropheCode = ECFPCSCategoryCode_Ext.TC_A11
      var claim = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, Date.getCurrentDate().addYears(-2))
      claim.UberPrecautionaryFlag_Ext = true
      claim.UCR_Ext = claimNotify.UCR
      var updatedClaim = new ECFClaimService().updateClaimData(claimNotify, claim)
      assertNull("PCS Catastrophe code should be null", updatedClaim.Catastrophe)
    })
  }

  public function testSettingUberPrecautionaryFlag_false() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
      claimNotify.UCR = ClaimBuilderHelper.getNextUCR()
      claimNotify.OutstandingAmountQualifier = ECFOutstandingQualifierCode_Ext.TC_C
      var claim = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, Date.getCurrentDate().addYears(-2))
      claim.UberPrecautionaryFlag_Ext = true
      claim.UCR_Ext = claimNotify.UCR

      new ECFClaimService().updateClaimData(claimNotify, claim)
      assertFalse("Claim UberPrecautionaryFlag should be marked as false", claim.UberPrecautionaryFlag_Ext)
    })
  }

  public function testSettingUberPrecautionaryFlag_null() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
      claimNotify.UCR = ClaimBuilderHelper.getNextUCR()
      claimNotify.OutstandingAmountQualifier = null
      var claim = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, Date.getCurrentDate().addYears(-2))
      claim.UberPrecautionaryFlag_Ext = true
      claim.UCR_Ext = claimNotify.UCR

      new ECFClaimService().updateClaimData(claimNotify, claim)
      assertFalse("Claim UberPrecautionaryFlag should be marked as false", claim.UberPrecautionaryFlag_Ext)
    })
  }

  function testInitializeClaim_NoPolicyNumber() {
    final var policyNumber: String = null

    AssertUtils.assertCausesECFExceptionWithType(\-> _ecfClaimService.initializeClaim(policyNumber), POLICY_NUMBER_BLANK)
  }

  function testInitializeClaim_EmptyPolicyNumber() {
    final var policyNumber: String = " "

    AssertUtils.assertCausesECFExceptionWithType(\-> _ecfClaimService.initializeClaim(policyNumber), POLICY_NUMBER_BLANK)
  }

  function testInitializeClaim() {
    final var policyNumber = "23-502012"

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var policy = new ECFPolicyService().findPolicy(policyNumber)
      Mockito.when(_policyService.findPolicy(policyNumber)).thenReturn(policy)
      var claim = _ecfClaimService.initializeClaim(policyNumber)

      assertTrue(claim.New)
      assertEquals(policy, claim.Policy)
      assertNotNull(claim.LOBCode)
      assertNotNull(claim.LossType)
    })
  }

  function testCreateClaim() {
    var claim = Mockito.mock(Claim)
    Mockito.when(_claimDAO.createClaim(claim)).thenReturn(claim)

    var returnedClaim = _ecfClaimService.persistClaim(claim)
    Mockito.verify(_claimDAO, Mockito.times(1)).createClaim(claim)
    assertEquals(claim, returnedClaim)
  }

  private function getClaimRetrieveRs(): RetrieveClaimRs {
    return ECFMessageUtil.createNewClaimRetrieveRs()
  }

  private function getClaimNotifyRq(): ClaimNotifyEventRq {
    return ECFMessageUtil.createNewClaimNotifyRq()
  }

  private function createRetrieveRsEntityAndClaim(claimRetrieveRs: RetrieveClaimRs): ECFMessageClaimRetrieveRs_Ext {
    var claimRetrieveEntity = ECFMessageEntityUtil.createClaimRetrieveRs(claimRetrieveRs)
    claimRetrieveEntity = addNewClaimToMessage(claimRetrieveEntity) as ECFMessageClaimRetrieveRs_Ext
    return claimRetrieveEntity
  }

  private function createClaimNotifyRqEntityAndClaim(claimNotify: ClaimNotifyEventRq): ECFMessageClaimNotifyRq_Ext {
    var claimNotifyEntity = ECFMessageEntityUtil.createClaimNotifyRq(claimNotify)
    claimNotifyEntity = addNewClaimToMessage(claimNotifyEntity) as ECFMessageClaimNotifyRq_Ext
    return claimNotifyEntity
  }

  private function addNewClaimToMessage(message: ECFMessageClaimData_Ext): ECFMessageClaimData_Ext {
    var newClaim = ClaimBuilderHelper.createClaim(true)
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaim = bundle.add(newClaim)
      newClaim.UCR_Ext = message.UCR
      newClaim.LossDate = message.LossStartDate
    }, User.util.UnrestrictedUser)

    ECFMessageEntityUtil.addClaimToMessage(message, newClaim)

    return message.refresh() as ECFMessageClaimData_Ext
  }

  private function callMapper(ecfMessage: ECFMessageClaimData_Ext): Claim {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      ecfMessage = bundle.add(ecfMessage)
      ecfMessage.Claim = bundle.add(ecfMessage.Claim)
      new ECFClaimService().updateClaimData(ecfMessage, ecfMessage.Claim)
    }, User.util.UnrestrictedUser)
    return ecfMessage.Claim
  }

  private function getFlexibleDate(date: Date): String {
    return new SimpleDateFormat("yyyy-MM-dd").format(date)
  }

  private function getNewLossStartDate(): Date {
    return Date.Now.addMonths(-3).trimToMidnight()
  }

  private function getNewLossEndDate(): Date {
    return Date.Now.addMonths(-2).trimToMidnight()
  }

  private function getRandomThreeDigitInteger(): int {
    var min = 100
    var max = 999
    var randomInt = new Random().nextInt((max - min) + 1) + min
    return randomInt
  }

  private function getTimeStampString(): String {
    return String.valueOf(System.currentTimeMillis())
  }

  private function getRandomString(): String {
    return UUID.randomUUID().toString()
  }

}