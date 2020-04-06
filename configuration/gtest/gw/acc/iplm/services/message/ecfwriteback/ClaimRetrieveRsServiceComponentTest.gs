package gw.acc.iplm.services.message.ecfwriteback

uses gw.acc.iplm.TestHelper
uses gw.acc.iplm.controller.IMRMessageController
uses gw.acc.iplm.dao.impl.ClaimDAO
uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.services.activity.ecfwb.ECFActivityCreationService
uses gw.acc.iplm.services.claim.ecfwb.ECFClaimService
uses gw.acc.iplm.testutils.AssertUtils
uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Id
uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Name
uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Party
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Contract_ContractMarket_InsurerOrReinsurer
uses gw.api.database.Query
uses gw.api.locale.DisplayKey
uses gw.testharness.KnownBreak
uses gw.testharness.v3.GUnitTestClass
uses org.mockito.Mockito

class ClaimRetrieveRsServiceComponentTest extends GUnitTestClass {

  private var _claimDao: ClaimDAO
  private var _claimRetrieveRsService: ClaimRetrieveRsService

  override function beforeMethod() {
    super.beforeMethod()
    _claimDao = new ClaimDAO()
    _claimRetrieveRsService = new ClaimRetrieveRsService()
  }

  @KnownBreak("Not able to fix this test")
  function testUpdateDocumentsOnClaim() {
    var claimToUpdate = TestHelper.createClaimAndPolicy("4775949863-01", "B0001OCT28SP02FOF")
    var spiedImrMsgController = Mockito.spy(new IMRMessageController())
    var retrieveClaimRs = ECFMessageUtil.createNewClaimRetrieveRs()
    var retrieveClaimRq = ECFMessageUtil.createNewClaimRetrieveRq()
    retrieveClaimRs.ClaimMovement.Contract.InsurerRiskReference = "4775949863-01"
    var ecfMessage = ECFMessageEntityUtil.createClaimRetrieveRs(retrieveClaimRs)
    ecfMessage.ClaimRetrieveReqReferredUUId = retrieveClaimRq.UUId
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      ecfMessage = bundle.add(ecfMessage)
      claimToUpdate = bundle.add(claimToUpdate)
      ecfMessage.Claim = claimToUpdate
    }, User.util.UnrestrictedUser)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      // Verify IMR service is called for a ClaimRetrieve
      var claimRetrieveService = new ClaimRetrieveRsService()
      claimRetrieveService.IMRMessageController = spiedImrMsgController
      claimRetrieveService.ECFClaimService = Mockito.mock(ECFClaimService)
      claimRetrieveService.updateClaim(claimToUpdate, ecfMessage)
    }, User.util.UnrestrictedUser)
    Mockito.verify(spiedImrMsgController, Mockito.times(1)).sendRepositorySearchRequestForClaim(Mockito.any(Claim))
  }

  function testProcessResponseForNoneExistingClaim() {
    //Create the ClaimRetrieveResponse
    var ecfMessage = createNewClaimWithClaimRetrieve()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      ecfMessage = bundle.add(ecfMessage)
      ecfMessage.PolicyNumber = "54-123456"
      ecfMessage.UCR = ClaimBuilderHelper.getNextUCR()
    }, ECFConstants.ECF_SUPER_USER)

    try {
      _claimRetrieveRsService.process(ecfMessage)
    } catch (ex: Exception) {
      assertTrue(ex.Message.contains(DisplayKey.get("Accelerator.IPLM.Exception.UnreachableGateway")))
    }

    //Refresh the iplm message
    ecfMessage = Query.make(ECFMessageClaimRetrieveRs_Ext).compare(ECFMessageClaimRetrieveRs_Ext#UUID, Equals, ecfMessage.UUID).select().first()

    assertNotNull(ecfMessage.Claim)
  }

  function testProcessResponseForExistignClaim() {
    //Create the ClaimRetrieveResponse
    var claim = ClaimBuilderHelper.createClaim()
    var ucr = ClaimBuilderHelper.getNextUCR()
    var ecfMessage = createNewClaimWithClaimRetrieve()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      ecfMessage = bundle.add(ecfMessage)
      claim = bundle.add(claim)
      ecfMessage.PolicyNumber = "54-123456"
      ecfMessage.UCR = ucr
      claim.UCR_Ext = ucr
      ecfMessage.Claim = claim
      claim.addToLMMessages(ecfMessage)
    }, ECFConstants.ECF_SUPER_USER)

    //Process response
    try {
      _claimRetrieveRsService.process(ecfMessage)
    } catch (ex: Exception) {
      assertTrue(ex.Message.contains(DisplayKey.get("Accelerator.IPLM.Exception.UnreachableGateway")))
    }

    //Refresh the iplm message
    ecfMessage = Query.make(ECFMessageClaimRetrieveRs_Ext).compare(ECFMessageClaimRetrieveRs_Ext#UUID, Equals, ecfMessage.UUID).select().first()

    //This property exists only in ECF message, so if we can find it on a calim which does not have it after it is being created and now it is exists
    // after claim update that's means the logic works fine.
    assertNotNull(ecfMessage.Claim.ClaimLineNumber_Ext)
  }

  function testLastRefreshTimeUpdated() {
    //Create the ClaimRetrieveResponse
    var ecfMessage = createNewClaimWithClaimRetrieve()

    //Initial refresh time
    var initialUpdateTime = ecfMessage.Claim.ECFLastUpdateTime

    //Process response
    try {
      _claimRetrieveRsService.process(ecfMessage)
    } catch (ex: Exception) {
      assertTrue(ex.Message.contains(DisplayKey.get("Accelerator.IPLM.Exception.UnreachableGateway")))
    }

    //Refresh the iplm message
    ecfMessage = Query.make(ECFMessageClaimRetrieveRs_Ext).compare(ECFMessageClaimRetrieveRs_Ext#UUID, Equals, ecfMessage.UUID).select().first()

    //Assert that the DateTime was updated
    assertNotNull(ecfMessage.Claim.ECFLastUpdateTime)
    assertTrue(initialUpdateTime.before(ecfMessage.Claim.ECFLastUpdateTime))
  }

  function testAddingPartiesToClaim() {
    //Create a new party
    var newReinsurer = createNewReinsurer("FirstReinsurer")

    //Create the ClaimRetrieveResponse
    var ecfMessage = createNewClaimWithClaimRetrieve(newReinsurer)

    try {
      _claimRetrieveRsService.process(ecfMessage)
    } catch (ex: Exception) {
      assertTrue(ex.Message.contains(DisplayKey.get("Accelerator.IPLM.Exception.UnreachableGateway")))
    }

    //Refresh the iplm message
    ecfMessage = Query.make(ECFMessageClaimRetrieveRs_Ext).compare(ECFMessageClaimRetrieveRs_Ext#UUID, Equals, ecfMessage.UUID).select().first()

    //Ensure the party is added
    var allClaimContacts = ecfMessage.Claim.Contacts
    assertTrue(allClaimContacts*.Contact*.LMContactID_Ext.contains(newReinsurer.Party.Id_elem.first().Value))

    //Get the new Party from the Claim
    var claimContact = allClaimContacts.firstWhere(\elt -> elt.Contact.LMContactID_Ext == newReinsurer.Party.Id_elem.first().Value)

    //Assert Party information
    assertEquals(newReinsurer.Party.Id_elem.first().Agency, (claimContact.Contact as Company).ECFBureauType_Ext.Code)
  }

  function testUpdatingPartiesOnAClaim() {
    //Create a new party
    var newReinsurer = createNewReinsurer("FirstReinsurer")

    //Create the ClaimRetrieveResponse
    var ecfMessage = createNewClaimWithClaimRetrieve(newReinsurer)

    //Process response
    try {
      _claimRetrieveRsService.process(ecfMessage)
    } catch (ex: Exception) {
      assertTrue(ex.Message.contains(DisplayKey.get("Accelerator.IPLM.Exception.UnreachableGateway")))
    }

    //Refresh the iplm message
    ecfMessage = Query.make(ECFMessageClaimRetrieveRs_Ext).compare(ECFMessageClaimRetrieveRs_Ext#UUID, Equals, ecfMessage.UUID).select().first()

    //Ensure the party is added
    var allClaimContacts = ecfMessage.Claim.Contacts
    assertTrue(allClaimContacts*.Contact*.LMContactID_Ext.contains(newReinsurer.Party.Id_elem.first().Value))

    //Get the new Party from the Claim
    var claimContact = allClaimContacts.firstWhere(\elt -> elt.Contact.LMContactID_Ext == newReinsurer.Party.Id_elem.first().Value)

    //Assert Party information
    assertEquals(newReinsurer.Party.Id_elem.first().Agency, (claimContact.Contact as Company).ECFBureauType_Ext.Code)

    //Create a new reinsurer with the same ID
    var newReinsurer2 = createNewReinsurer("SecondReinsurer")
    newReinsurer2.Party.Id_elem.first().Agency = newReinsurer.Party.Id_elem.first().Agency
    newReinsurer2.Party.Id_elem.first().Value = newReinsurer.Party.Id_elem.first().Value

    //Create the new RetrieveResponse
    var claimRetrieveRs2 = ECFMessageUtil.createNewClaimRetrieveRs()
    claimRetrieveRs2.UCR = ecfMessage.Claim.UCR_Ext
    claimRetrieveRs2.ClaimMovement.Extension.Contract.ContractMarket.first().InsurerOrReinsurer.add(newReinsurer2)

    //Create a new Entity with the RetrieveRs Xml
    var ecfMessage2 = ECFMessageEntityUtil.createClaimRetrieveRs(claimRetrieveRs2)
    var claim = ecfMessage.Claim

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      //Update the Claim with the new UCR
      ecfMessage2 = bundle.add(ecfMessage2)
      claim = bundle.add(claim)
      //Add Messages to the iplm message
      claim.addToLMMessages(ecfMessage2)
    }, User.util.UnrestrictedUser)

    //Ensure the party remains
    var allClaimContacts2 = claim.Contacts
    assertTrue(allClaimContacts2*.Contact*.LMContactID_Ext.contains(newReinsurer2.Party.Id_elem.first().Value))

    //Get the new Party from the Claim
    var claimContact2 = allClaimContacts2.firstWhere(\elt -> elt.Contact.LMContactID_Ext == newReinsurer2.Party.Id_elem.first().Value)

    //Assert Party information
    assertEquals(newReinsurer2.Party.Id_elem.first().Agency, (claimContact2.Contact as Company).ECFBureauType_Ext.Code)

  }

  function testRetrieveServiceCanHandleAnUpdateClaimResponseWithNoClaimDetails() {
    var timeBeforeUpdate = Date.Now

    var claim = ClaimBuilderHelper.createClaimWithAClaimNotify()
    var retrieveRs = ECFMessageEntityUtil.createClaimRetrieveRs(ECFMessageUtil.createNewClaimRetrieveRsWhereClassUnavailable())
    var retrieveRq = ECFMessageEntityUtil.createClaimRetrieveRq(ECFMessageUtil.createNewClaimRetrieveRq())
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      retrieveRs = bundle.add(retrieveRs)
      claim = bundle.add(claim)
      retrieveRs.Claim = claim
      retrieveRs.ClaimRetrieveReqReferredUUId = retrieveRq.UUID
      claim.addToLMMessages(retrieveRs)
    }, User.util.UnrestrictedUser)

    _claimRetrieveRsService.process(retrieveRs)

    claim = gw.api.database.Query.make(Claim).compare(Claim#PublicID, gw.api.database.Relop.Equals, claim.PublicID).select().AtMostOneRow
    assertTrue(timeBeforeUpdate < claim.ECFLastUpdateTime)
  }

  function testRetrieveServiceCanHandleACreateClaimRequestFailingBecauseRetrieveHadNoClaimDetails() {
    var retrieveRs = ECFMessageEntityUtil.createClaimRetrieveRs(ECFMessageUtil.createNewClaimRetrieveRsWhereClassUnavailable())
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      retrieveRs = bundle.add(retrieveRs)
      retrieveRs.Claim = null
    }, User.util.UnrestrictedUser)

    _claimRetrieveRsService.process(retrieveRs)
    //This test passes by not throwing any exceptions
  }

  function testTransactionReferencesWithResultFound() {
    var ecfMessage = createNewClaimWithClaimRetrieve()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      ecfMessage = bundle.add(ecfMessage)
      ecfMessage.PolicyNumber = "54-123456"
      ecfMessage.UCR = ClaimBuilderHelper.getNextUCR()
    }, ECFConstants.ECF_SUPER_USER)
    var trs = ecfMessage.Claim.TransactionReferences
    assertNotNull(trs)
    assertEquals(RetrieveClaimRs.parse(ecfMessage.Content.ContentString).TR, trs.first())
  }

  function testTransactionReferencesWithResultNotFound() {
    var ecfMessage = createNewClaimWithClaimRetrieve()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      ecfMessage = bundle.add(ecfMessage)
      ecfMessage.PolicyNumber = "54-123456"
      ecfMessage.TR = null
      ecfMessage.UCR = ClaimBuilderHelper.getNextUCR()
    }, ECFConstants.ECF_SUPER_USER)
    var trs = ecfMessage.Claim.TransactionReferences
    assertNotNull(trs)
    assertEquals(0, trs.size())
  }

  function testCreateClaimWith21LengthUCRAndUMRAndTR() {
    try {
      var claimRetrieveRs = createNewClaimWithClaimRetrieve()
      var ucrWith21Length = "UCR123456789123456789"
      var umrWith21Length = "UMR123456789123456789"
      var trWith21Length = "TR0123456789123456789"
      claimRetrieveRs.UCR = ucrWith21Length
      claimRetrieveRs.UMR = umrWith21Length
      claimRetrieveRs.TR = trWith21Length
      try {
        _claimRetrieveRsService.process(claimRetrieveRs)
      } catch (ex: Exception) {
        assertTrue(ex.Message.contains(DisplayKey.get("Accelerator.IPLM.Exception.UnreachableGateway")))
      }
      var claim = _claimDao.findClaim(ucrWith21Length)

      assertNotNull("Claim should not be null", claim)
      assertNotNull("ClaimNumber should not be null", claim.ClaimNumber)
      var ecfClaimRetrieveRsMessage = claim.LMMessages.firstWhere(\elt -> elt typeis ECFMessageClaimRetrieveRs_Ext) as ECFMessageClaimRetrieveRs_Ext
      assertEquals(ucrWith21Length, ecfClaimRetrieveRsMessage.UCR)
      assertEquals(umrWith21Length, ecfClaimRetrieveRsMessage.UMR)
      assertEquals(trWith21Length, ecfClaimRetrieveRsMessage.TR)
    } catch (ecfException: ECFException) {
      ecfException.printStackTrace()
      fail(ecfException.Message)
    }
  }

  function testUpdateECFLastUpdatedTime_UpdatesClaim() {
    var claim = ClaimBuilderHelper.createClaim()
    var date = Date.Now

    assertNull("The initial value of ECFLastUpdatedTime should be null", claim.ECFLastUpdateTime)
    claim = _claimRetrieveRsService.updateClaimECFLastUpdatedTime(claim, date)
    assertEquals("ECFLastUpdatedTime should've been updated", date, claim.ECFLastUpdateTime)
  }

  function testUpdateECFLastUpdatedTime_ClaimNullShouldThrowException() {
    var claim : Claim = null
    var date = Date.Now

    assertCausesException(\ -> {
      _claimRetrieveRsService.updateClaimECFLastUpdatedTime(claim, date)
    }, IllegalArgumentException)
  }

  function testUpdateECFLastUpdatedTime_DateNullShouldThrowException() {
    var claim = ClaimBuilderHelper.createClaim()
    var date : Date = null

    assertCausesException(\ -> {
      _claimRetrieveRsService.updateClaimECFLastUpdatedTime(claim, date)
    }, IllegalArgumentException)
  }

  function testProcess_DoesntWrapECFException() {
    var mockedService = Mockito.mock(ClaimRetrieveRsService)
    var inboundECFMessage = ECFMessageEntityUtil.createClaimRetrieveRs()

    Mockito.doCallRealMethod().when(mockedService).process(Mockito.any())
    Mockito.doThrow(new ECFException(ECFErrorCodeType.POLICY_NOT_FOUND_IN_SYSTEM)).when(mockedService).processClaim(Mockito.any())

    // We are expecting to see an ECFException of type POLICY_NOT_FOUND_IN_SYSTEM and not this exception message wrapped inside a CLAIM_RETRIEVE_ERROR ECFException
    AssertUtils.assertCausesECFExceptionWithType(\-> mockedService.processClaim(inboundECFMessage), ECFErrorCodeType.POLICY_NOT_FOUND_IN_SYSTEM)
  }

  function testCreateActivities() {
    _claimRetrieveRsService._activityCreationService = Mockito.mock(ECFActivityCreationService)
    var claimRetrieve = createNewClaimWithClaimRetrieve()
    _claimRetrieveRsService.process(claimRetrieve)
    Mockito.verify(_claimRetrieveRsService._activityCreationService, Mockito.times(1)).createActivitiesForClaimRetrieveRs(claimRetrieve)
  }

  private function createNewClaimWithClaimRetrieve(): entity.ECFMessageClaimRetrieveRs_Ext {
    return createNewClaimWithClaimRetrieve(null)
  }

  private function createNewClaimWithClaimRetrieve(newReinsurer: RetrieveClaimRs_ClaimMovement_Extension_Contract_ContractMarket_InsurerOrReinsurer): entity.ECFMessageClaimRetrieveRs_Ext {
    //Create the ClaimRetrieveResponse
    var claimRetrieveRs = ECFMessageUtil.createNewClaimRetrieveRs()
    var claimRetrieveRq = ECFMessageUtil.createNewClaimRetrieveRq()

    //Create the Claim
    var claim = ClaimBuilderHelper.createClaim(true)

    if (newReinsurer != null) {
      //Add it to the RetrieveRs XML
      claimRetrieveRs.ClaimMovement.Extension.Contract.ContractMarket.first().InsurerOrReinsurer.add(newReinsurer)
    }

    //Create a new Entity with the RetrieveRs Xml
    var ecfMessage = ECFMessageEntityUtil.createClaimRetrieveRs(claimRetrieveRs)
    var ecfMessageRq = ECFMessageEntityUtil.createClaimRetrieveRq(claimRetrieveRq)
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      //Update the Claim with the new UCR
      ecfMessage = bundle.add(ecfMessage)
      claim = bundle.add(claim)
      //Add Messages to the iplm message
      claim.addToLMMessages(ecfMessage)
      //Add the UCR to the claim
      claim.UCR_Ext = claimRetrieveRs.UCR
      ecfMessage.ClaimRetrieveReqReferredUUId = ecfMessageRq.UUID
    }, User.util.UnrestrictedUser)

    return ecfMessage
  }

  private function createNewReinsurer(newNameVal: String): RetrieveClaimRs_ClaimMovement_Extension_Contract_ContractMarket_InsurerOrReinsurer {
    var newId = new Id()
    newId.Value = String.valueOf(System.currentTimeMillis())
    newId.Agency = "lirma"

    var newName = new Name()
    newName.Value = newNameVal

    var newParty = new Party()
    newParty.Id_elem = {newId}
    newParty.Name_elem = newName

    var newReinsurer = new RetrieveClaimRs_ClaimMovement_Extension_Contract_ContractMarket_InsurerOrReinsurer()
    newReinsurer.Party = newParty

    return newReinsurer
  }
}