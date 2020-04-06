package gw.acc.iplm.services.message.ecfwriteback

uses gw.acc.iplm.TestHelper
uses gw.acc.iplm.controller.IMRMessageController
uses gw.acc.iplm.dao.impl.ClaimDAO
uses gw.acc.iplm.dto.LMMessageDTO
uses gw.acc.iplm.entitymapper.ecfwb.claimnotify.ClaimNotifyRqEntityMapper
uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.ClaimNotifyEventRq
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ParallelUniqueClaimReference
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ErrorsAndWarnings_Result
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.enums.ClaimNotifyEventRqType_ErrorsAndWarnings_Result_ErrorWarningLevel
uses gw.api.database.Query
uses gw.api.locale.DisplayKey
uses gw.testharness.v3.GUnitTestClass
uses org.mockito.Mockito

class ClaimNotifyServiceComponentTest extends GUnitTestClass {

  private var _claimDao: ClaimDAO
  private var _claimNotifyService: ClaimNotifyService

  override function beforeMethod() {
    super.beforeMethod()
    _claimDao = new ClaimDAO()
    _claimNotifyService = new ClaimNotifyService()
  }

  function testUpdateClaim() {
    try {
      var claimNotifyMsg = ECFMessageUtil.createNewClaimNotifyRq()
      claimNotifyMsg.ClaimMovement.Claim.BrokerReference = ClaimBuilderHelper.getNextUCR()
      var ucr = ClaimBuilderHelper.getNextUCR()
      var initialClaim = TestHelper.createClaimAndPolicy(ClaimBuilderHelper.getNextPolicyNum(), ucr)
      var initialUpdateTime = initialClaim.ECFLastUpdateTime

      //Existing UCR (Broker Reference number), which exist in Claim Center
      claimNotifyMsg.ClaimMovement.Claim.BrokerReference = ucr
      claimNotifyMsg.ClaimMovement.Extension.Claim.LossPeriod.StartDate = "2013-12"
      claimNotifyMsg.ClaimMovement.Extension.Claim.LossPeriod.EndDate = "2015"
      claimNotifyMsg.ClaimMovement.Contract.InsuredRiskReference = "54-253465"
      claimNotifyMsg.ClaimMovement.LossDetails = "Brexit"
      claimNotifyMsg.ClaimMovement.Claim.LossLocation.Location.Description = "Loss Description"

      var ecfMessage = ECFMessageEntityUtil.createClaimNotifyRq(claimNotifyMsg)
      try {
        _claimNotifyService.process(ecfMessage)
      } catch (ex: Exception) {
        assertTrue(ex.Message.contains(DisplayKey.get("Accelerator.IPLM.Exception.UnreachableGateway")))
      }

      //find claim to assert values after processing message
      var claim = _claimDao.findClaim(ucr)

      assertNotNull(claim)
      assertNotNull("ClaimNumber should not be null", claim.ClaimNumber)
      assertTrue(initialUpdateTime.before(claim.ECFLastUpdateTime))
      assertEquals(claim.Description, claimNotifyMsg.ClaimMovement.LossDetails)
      assertEquals(claimNotifyMsg.ClaimMovement.Claim.LossLocation.Location.Description, claim.LossLocation.Description)
    } catch (ecfException: ECFException) {
      ecfException.printStackTrace()
      fail(ecfException.Message)
    }
  }

  function testCreateClaim() {
    try {
      var claimNotifyMsg = ECFMessageUtil.createNewClaimNotifyRq()
      claimNotifyMsg.ClaimMovement.Claim.BrokerReference = ClaimBuilderHelper.getNextUCR()
      var ucr = claimNotifyMsg.ClaimMovement.Claim.BrokerReference
      var policyNumber = ClaimBuilderHelper.getNextPolicyNum()
      TestHelper.createClaimAndPolicy(policyNumber, ucr)

      //New UCR (Broker Reference number), which dosen't exist in Claim Center
      claimNotifyMsg.ClaimMovement.Claim.BrokerReference = ucr
      claimNotifyMsg.ClaimMovement.Extension.Claim.LossPeriod.StartDate = "2013-12"
      claimNotifyMsg.ClaimMovement.Extension.Claim.LossPeriod.EndDate = "2015"
      claimNotifyMsg.ClaimMovement.Contract.InsurerRiskReference = policyNumber
      claimNotifyMsg.ClaimMovement.LossDetails = "Brexit"
      claimNotifyMsg.ClaimMovement.Claim.LossLocation.Location.Description = "Loss Description"

      var ecfMessage = ECFMessageEntityUtil.createClaimNotifyRq(claimNotifyMsg)

      try {
        _claimNotifyService.process(ecfMessage)
      } catch (ex: Exception) {
        assertTrue(ex.Message.contains(DisplayKey.get("Accelerator.IPLM.Exception.UnreachableGateway")))
      }
      //find claim to assert values after processing message
      var claim = _claimDao.findClaim(ucr)
      assertNotNull("Claim should not be null", claim)
      assertNotNull("ClaimNumber should not be null", claim.ClaimNumber)
      var ecfClaimNotifyMessage = claim.LMMessages.firstWhere(\elt -> elt typeis ECFMessageClaimNotifyRq_Ext) as ECFMessageClaimNotifyRq_Ext
      assertEquals(ECFClaimTransactionType_Ext.TC_FIRSTADVICEANDSETTLEMENT, ecfClaimNotifyMessage.TransactionType)
      assertEquals(ECFClaimMessageState_Ext.TC_RESPONDED, ecfClaimNotifyMessage.MessageState)
      assertEquals("001", ecfClaimNotifyMessage.TransactionSequence)
      assertEquals(140d, ecfClaimNotifyMessage.MessageSequence.doubleValue(), 0.001d)
      assertEquals("10-AWAITING/QUERIED", ecfClaimNotifyMessage.TransactionStatus.DisplayName)
      assertEquals(claimNotifyMsg.ClaimMovement.LossDetails, claim.Description)
      assertEquals(claimNotifyMsg.ClaimMovement.Claim.LossLocation.Location.Description, claim.LossLocation.Description)
    } catch (ecfException: ECFException) {
      ecfException.printStackTrace()
      fail(ecfException.Message)
    }
  }

  function testProcessRequestWithParallelUniqueClaimReference() {
    var ucr = ClaimBuilderHelper.getNextUCR()
    var notifyRqXml = ECFMessageUtil.createNewXmlMessage(ECFMessageUtil.CLAIM_NOTIFY_RQ_FILE)
    var claimNotifyRq = ClaimNotifyEventRq.parse(notifyRqXml.asUTFString())
    claimNotifyRq.ClaimMovement.Extension.Claim.removeChild(ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ParallelUniqueClaimReference.$QNAME)
    var claim1 = ClaimBuilderHelper.createClaim(true)
    var parallelUniqueClaimReferenceList = new ArrayList<String>()
    parallelUniqueClaimReferenceList.add(claim1.UCR_Ext)
    claimNotifyRq.ClaimMovement.Extension.Claim.ParallelUniqueClaimReference = parallelUniqueClaimReferenceList
    claimNotifyRq.ClaimMovement.Claim.BrokerReference = ucr
    var ecfMessage: ECFMessage_Ext
    var ClaimNotifyRqEntityMapper = new ClaimNotifyRqEntityMapper()
    var ecfMessageDTO = new LMMessageDTO(LMMessageTypeString_Ext.TC_ECFMESSAGECLAIMNOTIFYRQ_EXT, claimNotifyRq, null)
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      ecfMessage = ClaimNotifyRqEntityMapper.createNewLMMessage(ecfMessageDTO)
      ecfMessage.Content = new Blob(claimNotifyRq.asUTFString().Bytes)
    }, User.util.UnrestrictedUser)
    try {
      _claimNotifyService.process(ecfMessage as ECFMessageClaimNotifyRq_Ext)
    } catch (ex: Exception) {
      assertTrue(ex.Message.contains(DisplayKey.get("Accelerator.IPLM.Exception.UnreachableGateway")))
    }
    var claim2 = _claimDao.findClaim(ucr)
    assertEquals("Association must be created", 1, claim2.Associations.Count)
    assertEquals("Association type must be EventRelated", ClaimAssocType.TC_EVENTRELATED, claim2.Associations.first().ClaimAssocType)
    assertEquals("Association title must have both UCRs", DisplayKey.get("Accelerator.IPLM.Claim.ClaimAssociation.Title", claim1.UCR_Ext, claim2.UCR_Ext), claim1.Associations.first().Title)

  }

  function testCreateParties() {
    var claimNotifyMsg = ECFMessageUtil.createNewClaimNotifyRq()
    var claim = TestHelper.createClaimAndPolicy(ClaimBuilderHelper.getNextPolicyNum(), ClaimBuilderHelper.getNextUCR())
    claimNotifyMsg.ClaimMovement.Claim.BrokerReference = claim.UCR_Ext
    claimNotifyMsg.UUId = UUID.randomUUID().toString()

    var ecfMessage = ECFMessageEntityUtil.createClaimNotifyRq(claimNotifyMsg)
    try {
      _claimNotifyService.process(ecfMessage)
    } catch (ex: Exception) {
      assertTrue(ex.Message.contains(DisplayKey.get("Accelerator.IPLM.Exception.UnreachableGateway")))
    }


    claim = ECFMessageEntityUtil.refreshClaimFromDatabase(claim)

    assertTrue("Agreement insurer parties should not be null", claim.Contacts*.getRoles()*.getRole().contains(ContactRole.TC_ECFCONTRACTMARKETINSURERORREINSURER_EXT))
    assertEquals("Claim should have just one contract market insurer party", 1, (claim.Contacts.where(\contact -> not(contact.getRoles()*.getRole().where(\role -> role == ContactRole.TC_ECFCONTRACTMARKETINSURERORREINSURER_EXT)).IsEmpty)).length)

    var ecfInsurerParties = (claim.Contacts.where(\contact -> not(contact.getRoles()*.getRole().where(\role -> role == ContactRole.TC_ECFCONTRACTMARKETINSURERORREINSURER_EXT)).IsEmpty))
    assertEquals("Carrier should not exist in Claim Contact list", 0, (ecfInsurerParties.where(\party -> party.Company.ECFBureauId_Ext == "urn:lloyds:2623" and party.Company.Name == "Beazley 2623")).length)

    assertTrue("Agreement broker parties should not be null", claim.Contacts*.getRoles()*.getRole().contains(ContactRole.TC_BROKER_EXT))
    assertEquals("claim should have one broker party", 1, (claim.Contacts.where(\contact -> not(contact.getRoles()*.getRole().where(\role -> role == ContactRole.TC_BROKER_EXT)).IsEmpty)).length)

    var ecfBrokerParties = (claim.Contacts.where(\contact -> not(contact.getRoles()*.getRole().where(\role -> role == ContactRole.TC_BROKER_EXT)).IsEmpty))
    assertEquals("Broker does not exist", 1, (ecfBrokerParties.where(\party -> party.Contact.VendorNumber == "GW0001" and party.Contact.Name == "TEST BROKER 0001")).length)
  }

  function testClaimNotifyMessageLinkedToClaim() {
    var claimNotifyMsg = ECFMessageUtil.createNewClaimNotifyRq()
    claimNotifyMsg.ClaimMovement.Claim.BrokerReference = ClaimBuilderHelper.getNextUCR()
    var ucr = claimNotifyMsg.ClaimMovement.Claim.BrokerReference
    var ecfMessage = ECFMessageEntityUtil.createClaimNotifyRq(claimNotifyMsg)
    try {
      _claimNotifyService.process(ecfMessage)
    } catch (ex: Exception) {
      assertTrue(ex.Message.contains(DisplayKey.get("Accelerator.IPLM.Exception.UnreachableGateway")))
    }
    ecfMessage = ecfMessage.refresh() as ECFMessageClaimNotifyRq_Ext
    var claim = Query.make(Claim).compare(Claim#UCR_Ext, Equals, ucr).select().AtMostOneRow

    assertNotNull(claim)
    assertNotNull(ecfMessage)

    assertEquals(ecfMessage.Claim, claim)
    assertTrue(claim.LMMessages.hasMatch(\elt1 -> elt1.UUID == ecfMessage.UUID))

    assertNotNull(ecfMessage.TR)
    assertEquals(claimNotifyMsg.ClaimMovement.ClaimEntry.BrokerReference, ecfMessage.TR)
  }

  function testDocumentSearchesOnClaimNotifyEntity() {
    var claimNotifyMsg = ECFMessageUtil.createNewClaimNotifyRq()
    claimNotifyMsg.ClaimMovement.Claim.BrokerReference = ClaimBuilderHelper.getNextUCR()
    var ecfMessage = ECFMessageEntityUtil.createClaimNotifyRq(claimNotifyMsg)
    try {
      _claimNotifyService.process(ecfMessage)
    } catch (ex: Exception) {
      assertTrue(ex.Message.contains(DisplayKey.get("Accelerator.IPLM.Exception.UnreachableGateway")))
    }
    ecfMessage = ecfMessage.refresh() as ECFMessageClaimNotifyRq_Ext

    assertNotNull(ecfMessage)

    var docSearchRqXml = ECFMessageUtil.createNewDocumentSearchRq()
    docSearchRqXml.DocumentList.each(\docList -> docList.DocumentItem.each(\docItem -> {
      docItem.ReferredObjects.ClaimEntry.BrokerReference = ecfMessage.TR
    }))
    var docSearchRsXml = ECFMessageUtil.createNewDocumentSearchRs()
    docSearchRsXml.DocumentList.each(\docList -> docList.DocumentItem.each(\docItem -> {
      docItem.ReferredObjects.ClaimEntry.BrokerReference = ecfMessage.TR
    }))

    var docSearchRq = ECFMessageEntityUtil.createDocumentSearchRq(docSearchRqXml)
    var docSearchRs = ECFMessageEntityUtil.createDocumentSearchRs(docSearchRsXml)
    var docSearchMessages = ecfMessage.DocumentSearchMessages

    assertNotNull(docSearchMessages)
    assertTrue(docSearchMessages.hasMatch(\elt1 -> elt1.PublicID == docSearchRq.PublicID))
    assertTrue(docSearchMessages.hasMatch(\elt1 -> elt1.PublicID == docSearchRs.PublicID))
  }

  //Try to create a claim without policy number
  function testCreateClaimWithoutPolicyNumber() {
    try {
      var claimNotifyMsg = ECFMessageUtil.createNewClaimNotifyRq()
      claimNotifyMsg.ClaimMovement.Claim.BrokerReference = ClaimBuilderHelper.getNextUCR()

      //Put a claim in the DB which should not be found.
      TestHelper.createClaimAndPolicy(ClaimBuilderHelper.getNextPolicyNum(), ClaimBuilderHelper.getNextUCR())

      //New UCR (Broker Reference number), which dosen't exist in Claim Center
      claimNotifyMsg.ClaimMovement.Contract.InsurerRiskReference = null
      var ecfMessage = ECFMessageEntityUtil.createClaimNotifyRq(claimNotifyMsg)
      gw.transaction.Transaction.runWithNewBundle(\bundle -> {
        ecfMessage = bundle.add(ecfMessage)
        ecfMessage.PolicyNumber = null
      }, User.util.UnrestrictedUser)
      _claimNotifyService.process(ecfMessage)

      fail("This line should not execute")
    } catch (ex: ECFException) {
      //Exception should occured
      assertEquals(ECFErrorCodeType.CLAIM_NOTIFY_ERROR, ex.ECFErrorCode)
    }
  }

  function testUpdateDocumentsOnClaim() {
    try {
      var claimNotifyMsg = ECFMessageUtil.createNewClaimNotifyRq()
      claimNotifyMsg.ClaimMovement.Claim.BrokerReference = ClaimBuilderHelper.getNextUCR()
      var ucr = claimNotifyMsg.ClaimMovement.Claim.BrokerReference
      var policyNumber = ClaimBuilderHelper.getNextPolicyNum()
      TestHelper.createClaimAndPolicy(policyNumber, ucr)

      //Existing UCR (Broker Reference number), which exist in Claim Center
      claimNotifyMsg.ClaimMovement.Claim.BrokerReference = ucr
      claimNotifyMsg.ClaimMovement.Contract.InsurerRiskReference = policyNumber

      var ecfMessage = ECFMessageEntityUtil.createClaimNotifyRq(claimNotifyMsg)
      _claimDao = new ClaimDAO()
      var mockedImrMsgController = Mockito.mock(IMRMessageController)
      _claimNotifyService = new ClaimNotifyService()
      _claimNotifyService.IMRMessageController = mockedImrMsgController
      _claimNotifyService.process(ecfMessage)

      // Verify IMR service is called for a ClaimNotify
      Mockito.verify(mockedImrMsgController, Mockito.times(1)).sendRepositorySearchRequestForClaim(Mockito.any(Claim), Mockito.any(String))
    } catch (ecfException: ECFException) {
      ecfException.printStackTrace()
      fail(ecfException.Message)
    }
  }

  function testClaimNotifyBeingUpdatedAfterSecondClaimNotifyAcknowledgesFinalResponse() {
    var claimNotifyRq1: ECFMessageClaimNotifyRq_Ext
    var claimResponseRq: ECFMessageClaimResponseRq_Ext
    var claimNotifyRq2: ECFMessageClaimNotifyRq_Ext
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyMessage1 = ECFMessageUtil.createNewClaimNotifyRq()
      claimNotifyRq1 = ECFMessageEntityUtil.createClaimNotifyRq(claimNotifyMessage1)
      claimNotifyRq1 = bundle.add(claimNotifyRq1)
      claimNotifyRq1.MessageState = ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE

      var claimResponseMessage = ECFMessageUtil.createNewClaimResponseRq()
      claimResponseRq = ECFMessageEntityUtil.createClaimResponseRq(claimResponseMessage)
      claimResponseRq = bundle.add(claimResponseRq)
      claimResponseRq.ReferredUUID = claimNotifyRq1.UUID
      claimResponseRq.ResponseCode = ECFResponseCode_Ext.TC_AGREE_PAY

      var claimNotifyMessage2 = ECFMessageUtil.createNewClaimNotifyRq()
      claimNotifyRq2 = ECFMessageEntityUtil.createClaimNotifyRq(claimNotifyMessage2)
      claimNotifyRq2 = bundle.add(claimNotifyRq2)
      claimNotifyRq2.MessageState = ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE
    }, User.util.UnrestrictedUser)
    ECFMessageEntityUtil.addClaimToMessage(claimNotifyRq2, null)
    ECFMessageEntityUtil.addClaimToMessage(claimResponseRq, claimNotifyRq2.Claim)
    ECFMessageEntityUtil.addClaimToMessage(claimNotifyRq1, claimNotifyRq2.Claim)
    assertEquals(ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE, claimResponseRq.ClaimDataResponded.MessageState)
    _claimNotifyService.updatePreviousClaimNotify(claimNotifyRq2.PreviousClaimNotify, ECFClaimMessageState_Ext.TC_RESPONDED)
    assertEquals(ECFClaimMessageState_Ext.TC_RESPONDED, claimResponseRq.ClaimDataResponded.MessageState)
  }

  function testClaimNotifyNotBeingUpdatedAfterSecondClaimNotify() {
    var claimNotifyRq1: ECFMessageClaimNotifyRq_Ext
    var claimResponseRq: ECFMessageClaimResponseRq_Ext
    var claimNotifyRq2: ECFMessageClaimNotifyRq_Ext
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyMessage1 = ECFMessageUtil.createNewClaimNotifyRq()
      claimNotifyMessage1.UUId = UUID.randomUUID().toString()
      claimNotifyRq1 = ECFMessageEntityUtil.createClaimNotifyRq(claimNotifyMessage1)
      claimNotifyRq1 = bundle.add(claimNotifyRq1)
      claimNotifyRq1.MessageState = ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE

      var claimResponseMessage = ECFMessageUtil.createNewClaimResponseRq()
      claimResponseRq = ECFMessageEntityUtil.createClaimResponseRq(claimResponseMessage)
      claimResponseRq = bundle.add(claimResponseRq)
      claimResponseRq.ReferredUUID = claimNotifyRq1.UUID
      claimResponseRq.ResponseCode = ECFResponseCode_Ext.TC_DELEGATE

      var claimNotifyMessage2 = ECFMessageUtil.createNewClaimNotifyRq()
      claimNotifyMessage2.UUId = UUID.randomUUID().toString()
      claimNotifyMessage2.ClaimResponseUUId = claimResponseRq.UUID
      claimNotifyRq2 = ECFMessageEntityUtil.createClaimNotifyRq(claimNotifyMessage2)
      claimNotifyRq2 = bundle.add(claimNotifyRq2)
      claimNotifyRq2.MessageState = ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE
    }, User.util.UnrestrictedUser)
    ECFMessageEntityUtil.addClaimToMessage(claimNotifyRq2, null)
    ECFMessageEntityUtil.addClaimToMessage(claimResponseRq, claimNotifyRq2.Claim)
    ECFMessageEntityUtil.addClaimToMessage(claimNotifyRq1, claimNotifyRq2.Claim)
    assertEquals(ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE, claimResponseRq.ClaimDataResponded.MessageState)
  }

  function testClaimNotifyWithAWarningNotUpdatedForManualCheck() {
    var claimNotifyRq1: ECFMessageClaimNotifyRq_Ext
    var claimResponseRq: ECFMessageClaimResponseRq_Ext
    var claimNotifyRq2: ECFMessageClaimNotifyRq_Ext
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyMessage1 = ECFMessageUtil.createNewClaimNotifyRq()
      claimNotifyMessage1.UUId = UUID.randomUUID().toString()
      claimNotifyRq1 = ECFMessageEntityUtil.createClaimNotifyRq(claimNotifyMessage1)
      claimNotifyRq1 = bundle.add(claimNotifyRq1)
      claimNotifyRq1.MessageState = ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE

      var claimResponseMessage = ECFMessageUtil.createNewClaimResponseRq()
      claimResponseRq = ECFMessageEntityUtil.createClaimResponseRq(claimResponseMessage)
      claimResponseRq = bundle.add(claimResponseRq)
      claimResponseRq.ReferredUUID = claimNotifyRq1.UUID
      claimResponseRq.ResponseCode = ECFResponseCode_Ext.TC_AGREE_PAY

      var claimNotifyMessage2 = ECFMessageUtil.createNewClaimNotifyRq()
      claimNotifyMessage2.UUId = UUID.randomUUID().toString()
      claimNotifyMessage2.ErrorsAndWarnings.Result = new ArrayList<ClaimNotifyEventRqType_ErrorsAndWarnings_Result>()
      var result = new ClaimNotifyEventRqType_ErrorsAndWarnings_Result()
      result.ErrorWarningLevel = ClaimNotifyEventRqType_ErrorsAndWarnings_Result_ErrorWarningLevel._001
      result.ErrorCode = "XYZ"
      result.ErrorWarningDescription = "Test Warning"
      claimNotifyMessage2.ErrorsAndWarnings.Result.add(result)
      claimNotifyRq2 = ECFMessageEntityUtil.createClaimNotifyRq(claimNotifyMessage2)
      claimNotifyRq2 = bundle.add(claimNotifyRq2)
      claimNotifyRq2.MessageState = ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE
    }, User.util.UnrestrictedUser)
    ECFMessageEntityUtil.addClaimToMessage(claimNotifyRq2, null)
    ECFMessageEntityUtil.addClaimToMessage(claimResponseRq, claimNotifyRq2.Claim)
    ECFMessageEntityUtil.addClaimToMessage(claimNotifyRq1, claimNotifyRq2.Claim)
    assertEquals(ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE, claimResponseRq.ClaimDataResponded.MessageState)
    _claimNotifyService.updatePreviousClaimNotify(claimNotifyRq2.PreviousClaimNotify, ECFClaimMessageState_Ext.TC_RESPONDED)
    assertEquals(ECFClaimMessageState_Ext.TC_RESPONDED, claimResponseRq.ClaimDataResponded.MessageState)
    assertFalse(claimResponseRq.ClaimDataResponded.Suspended)
  }

  function testTransactionReferencesWithResultFound() {
    var ecfMessages = TestHelper.
        createECFMessages(ClaimBuilderHelper.getNextPolicyNum(), ClaimBuilderHelper.getNextUCR(), false)
    var trs = ecfMessages.first().Claim.TransactionReferences
    assertNotNull(trs)
    assertEquals("B00001TR", trs.first())
  }

  function testTransactionReferencesWithResultNotFound() {
    var ecfMessages = TestHelper.
        createECFMessageWithoutTR(ClaimBuilderHelper.getNextPolicyNum(), ClaimBuilderHelper.getNextUCR(), false)
    var trs = ecfMessages.first().Claim.TransactionReferences
    assertNotNull(trs)
    assertEquals(0, trs.size())
  }

  function testTransactionReferencesWithResultWithOneNullValue() {
    var ecfMessages = TestHelper.
        createECFMessages(ClaimBuilderHelper.getNextPolicyNum(), ClaimBuilderHelper.getNextUCR(), false)
    var ecfMessage = ecfMessages.first()
    ecfMessage.TR = null
    var trs = ecfMessage.Claim.TransactionReferences
    assertNotNull(trs)
    assertEquals(1, trs.size())
  }

  function testCreateClaimWith21LengthUCRAndUMRAndTR() {
    try {
      var claimNotifyMsg = ECFMessageUtil.createNewClaimNotifyRq()
      var ucrWith21Length="UCR123456789123456789"
      var umrWith21Length="UMR123456789123456789"
      var trWith21Length="TR0123456789123456789"
      claimNotifyMsg.ClaimMovement.Claim.BrokerReference = ucrWith21Length
      claimNotifyMsg.ClaimMovement.Contract.BrokerReference = umrWith21Length
      claimNotifyMsg.ClaimMovement.ClaimEntry.BrokerReference=trWith21Length
      var ecfMessage = ECFMessageEntityUtil.createClaimNotifyRq(claimNotifyMsg)
      try {
        _claimNotifyService.process(ecfMessage)
      } catch (ex: Exception) {
        assertTrue(ex.Message.contains(DisplayKey.get("Accelerator.IPLM.Exception.UnreachableGateway")))
      }
      var claim = _claimDao.findClaim(ucrWith21Length)

      assertNotNull("Claim should not be null", claim)
      assertNotNull("ClaimNumber should not be null", claim.ClaimNumber)
      var ecfClaimNotifyMessage = claim.LMMessages.firstWhere(\elt -> elt typeis ECFMessageClaimNotifyRq_Ext) as ECFMessageClaimNotifyRq_Ext
      assertEquals(ucrWith21Length, ecfClaimNotifyMessage.UCR)
      assertEquals(umrWith21Length, ecfClaimNotifyMessage.UMR)
      assertEquals(trWith21Length, ecfClaimNotifyMessage.TR)
    } catch (ecfException: ECFException) {
      ecfException.printStackTrace()
      fail(ecfException.Message)
    }
  }
}