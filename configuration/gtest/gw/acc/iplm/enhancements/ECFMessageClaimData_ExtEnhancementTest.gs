package gw.acc.iplm.enhancements

uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.api.testdata.TestDataUtil
uses gw.testharness.v3.GUnitTestClass
uses org.mockito.Mockito

/**
 * Tests for the ECFMessageClaimData_Ext entity enhancements.ß
 */
class ECFMessageClaimData_ExtEnhancementTest extends GUnitTestClass {

  private var _claimData: ECFMessageClaimData_Ext
  private static final var NEW_LINE_CHARACTER_LENGTH = System.lineSeparator().length()

  override function afterMethod(t: Throwable) {
    super.afterMethod(t)
    ECFMessageEntityUtil.deleteAllCatastrophes()
  }

  /**
   * Tests that the Message is Lloyd's because the Insurer is Lloyds, despite the Broker being LIRMA.
   */
  function testMessageIsLloyds() {
    _claimData = Mockito.mock(ECFMessageClaimData_Ext)
    var contactData = Mockito.mock(ECFMessageClaimDataContacts_Ext)
    Mockito.when(_claimData.ECFContactData).thenReturn(contactData)
    Mockito.when(contactData.InsurerAgency).thenReturn(ECFBureauType_Ext.TC_LLOYDS.getCode())
    Mockito.when(_claimData.BureauType).thenReturn(ECFBureauType_Ext.TC_LIRMA)

    assertTrue(_claimData.LloydsMessage)
  }

  /**
   * Tests that the Message is not Lloyd's because the Insurer is LIRMA, despite the Broker being Lloyd's.
   */
  function testMessageIsNotLloyds() {
    _claimData = Mockito.mock(ECFMessageClaimData_Ext)
    var contactData = Mockito.mock(ECFMessageClaimDataContacts_Ext)
    Mockito.when(_claimData.ECFContactData).thenReturn(contactData)
    Mockito.when(contactData.InsurerAgency).thenReturn(ECFBureauType_Ext.TC_LIRMA.getCode())
    Mockito.when(_claimData.BureauType).thenReturn(ECFBureauType_Ext.TC_LLOYDS)

    assertFalse(_claimData.LloydsMessage)
  }


  function testGetParticipantFunctionForParty() {
    var _claimNotifyEventRq = ECFMessageUtil.createNewClaimNotifyRq()
    var _claimNotifyEvent = ECFMessageEntityUtil.createClaimNotifyRq(_claimNotifyEventRq)
    var contractMarketInsurerOrReinsureListArray = _claimNotifyEventRq.ClaimMovement.Extension.Contract.ContractMarket*.InsurerOrReinsurer
    for (insurerOrReinsure in contractMarketInsurerOrReinsureListArray) {
      for (insurerOrReinsureParty in insurerOrReinsure) {
        var role = _claimNotifyEvent.getParticipantFunctionForParty(insurerOrReinsureParty.Party.FirstId)
        assertNotNull("Party Role should have a value for id ${insurerOrReinsureParty.Party.FirstId}", role)
      }
    }
  }

  public function testFindRelatedClaimResponseForErrorNotify() {
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
      claimResponseRq.SenderPartyId = claimResponseMessage.Insurer.Party.FirstId

      var claimNotifyMessage2 = ECFMessageUtil.createNewRespondErrorNotifyRq()
      claimNotifyMessage2.ClaimResponseUUId = claimResponseRq.UUID
      claimNotifyRq2 = ECFMessageEntityUtil.createClaimNotifyRq(claimNotifyMessage2)
      claimNotifyRq2 = bundle.add(claimNotifyRq2)
      claimNotifyRq2.ClaimResponseUUId = claimResponseRq.UUID
      claimNotifyRq2.MessageState = ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE
      claimNotifyRq2.ActionParticipant = claimResponseMessage.Insurer.Party.FirstId
      claimNotifyRq2.ECFContractMarkets.each(\elt -> {
        elt.IsPrimaryRole = false
      })

      var claimRole = new ECFContractMarket_Ext()
      claimRole.IsPrimaryRole = true
      claimRole.PartyID = "GW2001"
      claimRole.PartyName = "Guidewire limited"
      claimRole.Bureau = ECFBureauType_Ext.TC_LIRMA
      claimRole.ParticipantFunction = ECFParticipantFunction_Ext.TC_LEAD
      claimNotifyRq2.addToECFContractMarkets(claimRole)

    }, User.util.UnrestrictedUser)

    ECFMessageEntityUtil.addClaimToMessage(claimNotifyRq2, null)
    ECFMessageEntityUtil.addClaimToMessage(claimResponseRq, claimNotifyRq2.Claim)
    ECFMessageEntityUtil.addClaimToMessage(claimNotifyRq1, claimNotifyRq2.Claim)

    assertNotNull(claimNotifyRq2.ClaimDataMessageErrorRelatedClaimResponse)
  }

  public function testFindRelatedClaimResponseForErrorNotifyRefersToClaimRetrieveRs() {
    var claimRetrieveRs: ECFMessageClaimRetrieveRs_Ext
    var claimResponseRq: ECFMessageClaimResponseRq_Ext
    var respondClaimNotify: ECFMessageClaimNotifyRq_Ext

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimRetrieveRsMessage = ECFMessageUtil.createNewClaimRetrieveRs()
      claimRetrieveRs = ECFMessageEntityUtil.createClaimRetrieveRs(claimRetrieveRsMessage)
      claimRetrieveRs = bundle.add(claimRetrieveRs)
      claimRetrieveRs.MessageState = ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE

      var claimResponseMessage = ECFMessageUtil.createNewClaimResponseRq()
      claimResponseRq = ECFMessageEntityUtil.createClaimResponseRq(claimResponseMessage)
      claimResponseRq = bundle.add(claimResponseRq)
      claimResponseRq.ReferredUUID = claimRetrieveRs.UUID
      claimResponseRq.ResponseCode = ECFResponseCode_Ext.TC_AGREE_PAY
      claimResponseRq.SenderPartyId = claimResponseMessage.Insurer.Party.FirstId

      var respondErrorNotifyMessage = ECFMessageUtil.createNewRespondErrorNotifyRq()
      respondErrorNotifyMessage.ClaimResponseUUId = claimResponseRq.UUID
      respondClaimNotify = ECFMessageEntityUtil.createClaimNotifyRq(respondErrorNotifyMessage)
      respondClaimNotify = bundle.add(respondClaimNotify)
      respondClaimNotify.ClaimResponseUUId = claimResponseRq.UUID
      respondClaimNotify.MessageState = ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE
      respondClaimNotify.ECFContractMarkets.each(\elt -> {
        elt.IsPrimaryRole = false
      })

      var claimRole = new ECFContractMarket_Ext()
      claimRole.IsPrimaryRole = true
      claimRole.PartyID = "GW2001"
      claimRole.PartyName = "Guidewire limited"
      claimRole.Bureau = ECFBureauType_Ext.TC_LIRMA
      claimRole.ParticipantFunction = ECFParticipantFunction_Ext.TC_LEAD
      respondClaimNotify.addToECFContractMarkets(claimRole)

    }, User.util.UnrestrictedUser)

    ECFMessageEntityUtil.addClaimToMessage(respondClaimNotify, null)
    ECFMessageEntityUtil.addClaimToMessage(claimResponseRq, respondClaimNotify.Claim)
    ECFMessageEntityUtil.addClaimToMessage(claimRetrieveRs, respondClaimNotify.Claim)

    assertNotNull(respondClaimNotify.ClaimDataMessageErrorRelatedClaimResponse)
  }

  public function testRespondableForClaimRetrieveRs() {
    var claimRetrieveRsMessage = ECFMessageUtil.createNewClaimRetrieveRs()
    var claimRetrieveRs = ECFMessageEntityUtil.createClaimRetrieveRs(claimRetrieveRsMessage)
    ECFMessageEntityUtil.addClaimToMessage(claimRetrieveRs, null)
    assertTrue((claimRetrieveRs.Claim.LMMessages.first() as ECFMessageClaimData_Ext).Respondable)
  }

  public function testFormattedPublicComments() {
    var newLineSize = NEW_LINE_CHARACTER_LENGTH
    var claimData = ECFMessageEntityUtil.createClaimNotifyRq()
    var numberChars: int
    for (comment in claimData.PublicComments) {
      numberChars += comment.Detail.length + newLineSize
    }

    assertEquals(numberChars, claimData.FormattedPublicComments.length)
  }

  public function testFormattedPublicComments_Has15Comments() {
    var newLineSize = NEW_LINE_CHARACTER_LENGTH
    var claimData = ECFMessageEntityUtil.createClaimNotifyRq()
    claimData.PublicComments = new ArrayList<ECFMessagePublicComment_Ext>().toTypedArray()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      for (1..15) {
        var comment = new ECFMessagePublicComment_Ext()
        comment.Detail = Long.toString(System.currentTimeMillis())
        comment.ECFMessage = claimData
      }

    }, User.util.UnrestrictedUser)

    var numberChars: int
    for (comment in claimData.PublicComments) {
      numberChars += comment.Detail.length + newLineSize
    }

    assertEquals(numberChars, claimData.FormattedPublicComments.length)
  }

  public function testFormattedPublicComments_HasNoComments() {
    var newLineSize = NEW_LINE_CHARACTER_LENGTH
    var claimData = ECFMessageEntityUtil.createClaimNotifyRq()
    claimData.PublicComments = new ArrayList<ECFMessagePublicComment_Ext>().toTypedArray()

    var numberChars: int
    for (comment in claimData.PublicComments) {
      numberChars += comment.Detail.length + newLineSize
    }

    assertEquals(numberChars, claimData.FormattedPublicComments.length)
  }

  public function testFormattedPrivateComments() {
    var newLineSize = NEW_LINE_CHARACTER_LENGTH
    var claimData = ECFMessageEntityUtil.createClaimNotifyRq()
    var numberChars: int
    for (comment in claimData.PrivateComments) {
      numberChars += comment.Detail.length + newLineSize
    }

    assertEquals(numberChars, claimData.FormattedPrivateComments.length)
  }

  public function testFormattedPrivateComments_Has15Comments() {
    var newLineSize = NEW_LINE_CHARACTER_LENGTH
    var claimData = ECFMessageEntityUtil.createClaimNotifyRq()
    claimData.PrivateComments = new ArrayList<ECFMessagePrivateComment_Ext>().toTypedArray()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      for (1..15) {
        var comment = new ECFMessagePrivateComment_Ext()
        comment.Detail = Long.toString(System.currentTimeMillis())
        comment.ECFMessage = claimData
      }

    }, User.util.UnrestrictedUser)

    var numberChars: int
    for (comment in claimData.PrivateComments) {
      numberChars += comment.Detail.length + newLineSize
    }

    assertEquals(numberChars, claimData.FormattedPrivateComments.length)
  }

  public function testFormattedPrivateComments_HasNoComments() {
    var newLineSize = NEW_LINE_CHARACTER_LENGTH
    var claimData = ECFMessageEntityUtil.createClaimNotifyRq()
    claimData.PrivateComments = new ArrayList<ECFMessagePrivateComment_Ext>().toTypedArray()

    var numberChars: int
    for (comment in claimData.PrivateComments) {
      numberChars += comment.Detail.length + newLineSize
    }

    assertEquals(numberChars, claimData.FormattedPrivateComments.length)
  }

  public function testLcoOrPcsCatastropheCode_WithNullCodes() {
    //GIVEN
    _claimData = Mockito.mock(ECFMessageClaimData_Ext)

    //WHEN
    var result = _claimData.LcoOrPcsCatastropheCode

    //THEN
    assertNull(result)
  }

  public function testLcoOrPcsCatastropheCode_WithPcsCode() {
    //GIVEN
    var pcsCode = ECFPCSCategoryCode_Ext.TC_A11
    _claimData = Mockito.mock(ECFMessageClaimData_Ext)
    Mockito.when(_claimData.PcsCatastropheCode).thenReturn(pcsCode)

    //WHEN
    var result = _claimData.LcoOrPcsCatastropheCode

    //THEN
    assertEquals(result, pcsCode.Code)
  }

  public function testLcoOrPcsCatastropheCode_WithLcoCode() {
    //GIVEN
    var lcoCode = ECFLCOCategoryCode_Ext.TC_10T
    _claimData = Mockito.mock(ECFMessageClaimData_Ext)
    Mockito.when(_claimData.LcoCatastropheCode).thenReturn(lcoCode)

    //WHEN
    var result = _claimData.LcoOrPcsCatastropheCode

    //THEN
    assertEquals(result, lcoCode.Code)
  }

  public function testLcoOrPcsCatastropheCode_WithLcoAndPcsCode() {
    //GIVEN
    var pcsCode = ECFPCSCategoryCode_Ext.TC_A11
    var lcoCode = ECFLCOCategoryCode_Ext.TC_10T
    _claimData = Mockito.mock(ECFMessageClaimData_Ext)
    Mockito.when(_claimData.PcsCatastropheCode).thenReturn(pcsCode)
    Mockito.when(_claimData.LcoCatastropheCode).thenReturn(lcoCode)

    //WHEN
    var result = _claimData.LcoOrPcsCatastropheCode

    //THEN
    assertEquals(result, lcoCode.Code)
  }

  public function testCatastropheByLcoOrPcsCode_WithNullCodes() {
    //GIVEN
    _claimData = Mockito.mock(ECFMessageClaimData_Ext)
    //WHEN
    var catastrophe = _claimData.CatastropheByLcoOrPcsCode
    //THEN
    assertNull(catastrophe)
  }

  public function testCatastropheByLcoOrPcsCode_WithNewLcoCode() {
    //GIVEN
    _claimData = Mockito.mock(ECFMessageClaimData_Ext)
    Mockito.when(_claimData.LcoCatastropheCode).thenReturn(ECFLCOCategoryCode_Ext.TC_00A)
    //WHEN
    var catastrophe = _claimData.CatastropheByLcoOrPcsCode
    //THEN
    assertNull(catastrophe)
  }

  public function testCatastropheByLcoOrPcsCode_WithExistingLcoCode() {
    //GIVEN
    var lcoCode = ECFLCOCategoryCode_Ext.TC_00A
    ClaimBuilderHelper.createLCOCatastrophe(lcoCode.Code)
    _claimData = Mockito.mock(ECFMessageClaimData_Ext)
    Mockito.when(_claimData.LcoCatastropheCode).thenReturn(lcoCode)
    //WHEN
    var catastrophe = _claimData.CatastropheByLcoOrPcsCode
    //THEN
    assertNotNull(catastrophe)
    assertEquals(lcoCode.Code, catastrophe.LCOCode)
  }

  public function testCatastropheByLcoOrPcsCode_WithNewPcsCode() {
    //GIVEN
    _claimData = Mockito.mock(ECFMessageClaimData_Ext)
    Mockito.when(_claimData.PcsCatastropheCode).thenReturn(ECFPCSCategoryCode_Ext.TC_Y38)
    //WHEN
    var catastrophe = _claimData.CatastropheByLcoOrPcsCode
    //THEN
    assertNull(catastrophe)
  }

  public function testCatastropheByLcoOrPcsCode_WithExistingPcsCode() {
    //GIVEN
    var pcsCatastropheCode = ECFPCSCategoryCode_Ext.TC_Y38
    ClaimBuilderHelper.createPCSCatastrophe(pcsCatastropheCode.Code)
    _claimData = Mockito.mock(ECFMessageClaimData_Ext)
    Mockito.when(_claimData.PcsCatastropheCode).thenReturn(pcsCatastropheCode)
    //WHEN
    var catastrophe = _claimData.CatastropheByLcoOrPcsCode
    //THEN
    assertNotNull(catastrophe)
    assertEquals(pcsCatastropheCode.Code, catastrophe.PCSCatastropheNumber)
  }

  public function testCatastropheByLcoOrPcsCode_WithExistingLcoAndPcsCode() {
    //GIVEN
    var lcoCode = ECFLCOCategoryCode_Ext.TC_00A
    var pcsCatastropheCode = ECFPCSCategoryCode_Ext.TC_Y38
    ClaimBuilderHelper.createLCOCatastrophe(lcoCode.Code)
    ClaimBuilderHelper.createPCSCatastrophe(pcsCatastropheCode.Code)
    _claimData = Mockito.mock(ECFMessageClaimData_Ext)
    Mockito.when(_claimData.LcoCatastropheCode).thenReturn(lcoCode)
    Mockito.when(_claimData.PcsCatastropheCode).thenReturn(pcsCatastropheCode)
    //WHEN
    var catastrophe = _claimData.CatastropheByLcoOrPcsCode
    //THEN
    assertNotNull(catastrophe)
    assertEquals(lcoCode.Code, catastrophe.LCOCode)
  }

  public function testHasCatastropheCodeDifferentFromLast_WithNullCodesAndNoLastMessage() {
    //GIVEN
    var claim: Claim
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        claim = ClaimBuilderHelper.createClaim(false)
      })
    })
    _claimData = Mockito.mock(ECFMessageClaimData_Ext)
    Mockito.when(_claimData.UUID).thenReturn(UUID.randomUUID().toString())
    Mockito.when(_claimData.Claim).thenReturn(claim)

    //WHEN
    var result = _claimData.HasCatastropheCodeDifferentFromLast

    //THEN
    assertFalse(result)
  }

  public function testHasCatastropheCodeDifferentFromLast_WithLcoCodeAndNoLastMessage() {
    //GIVEN
    var claim: Claim
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        claim = ClaimBuilderHelper.createClaim(false)
      })
    })
    _claimData = Mockito.mock(ECFMessageClaimData_Ext)
    Mockito.when(_claimData.LcoCatastropheCode).thenReturn(ECFLCOCategoryCode_Ext.TC_00A)
    Mockito.when(_claimData.UUID).thenReturn(UUID.randomUUID().toString())
    Mockito.when(_claimData.Claim).thenReturn(claim)

    //WHEN
    var result = _claimData.HasCatastropheCodeDifferentFromLast

    //THEN
    assertTrue(result)
  }

  public function testHasCatastropheCodeDifferentFromLast_WithPcsCodeAndNoLastMessage() {
    //GIVEN
    var claim: Claim
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        claim = ClaimBuilderHelper.createClaim(false)
      })
    })
    _claimData = Mockito.mock(ECFMessageClaimData_Ext)
    Mockito.when(_claimData.PcsCatastropheCode).thenReturn(ECFPCSCategoryCode_Ext.TC_Y39)
    Mockito.when(_claimData.UUID).thenReturn(UUID.randomUUID().toString())
    Mockito.when(_claimData.Claim).thenReturn(claim)

    //WHEN
    var result = _claimData.HasCatastropheCodeDifferentFromLast

    //THEN
    assertTrue(result)
  }

  public function testHasCatastropheCodeDifferentFromLast_WithLcoCodeAndLastLcoEquals() {
    //GIVEN
    var claim: Claim
    var testLcoCode = ECFLCOCategoryCode_Ext.TC_00B
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        var claimNotifyRq1 = createClaimNotifyRq(ECFLCOCategoryCode_Ext.TC_00A, null)
        var claimNotifyRq2 = createClaimNotifyRq(testLcoCode, null)
        var claimNotifyRq3 = createClaimNotifyRq(ECFLCOCategoryCode_Ext.TC_00C, null)
        claimNotifyRq3.Suspended = true
        claim = ClaimBuilderHelper.createClaim(false)
        claim.addToLMMessages(claimNotifyRq1)
        claim.addToLMMessages(claimNotifyRq2)
        claim.addToLMMessages(claimNotifyRq3)
      })
    })
    _claimData = Mockito.mock(ECFMessageClaimData_Ext)
    Mockito.when(_claimData.LcoCatastropheCode).thenReturn(testLcoCode)
    Mockito.when(_claimData.UUID).thenReturn(UUID.randomUUID().toString())
    Mockito.when(_claimData.Claim).thenReturn(claim)

    //WHEN
    var result = _claimData.HasCatastropheCodeDifferentFromLast

    //THEN
    assertFalse(result)
  }

  public function testHasCatastropheCodeDifferentFromLast_WithLcoCodeAndLastLcoDifferent() {
    //GIVEN
    var claim: Claim
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        var claimNotifyRq1 = createClaimNotifyRq(ECFLCOCategoryCode_Ext.TC_00A, null)
        var claimNotifyRq2 = createClaimNotifyRq(ECFLCOCategoryCode_Ext.TC_00B, null)
        var claimNotifyRq3 = createClaimNotifyRq(ECFLCOCategoryCode_Ext.TC_00C, null)
        claimNotifyRq3.Suspended = true
        claim = ClaimBuilderHelper.createClaim(false)
        claim.addToLMMessages(claimNotifyRq1)
        claim.addToLMMessages(claimNotifyRq2)
        claim.addToLMMessages(claimNotifyRq3)
      })
    })
    _claimData = Mockito.mock(ECFMessageClaimData_Ext)
    Mockito.when(_claimData.LcoCatastropheCode).thenReturn(ECFLCOCategoryCode_Ext.TC_00D)
    Mockito.when(_claimData.UUID).thenReturn(UUID.randomUUID().toString())
    Mockito.when(_claimData.Claim).thenReturn(claim)

    //WHEN
    var result = _claimData.HasCatastropheCodeDifferentFromLast

    //THEN
    assertTrue(result)
  }

  public function testHasCatastropheCodeDifferentFromLast_WithLcoCodeAndLastWithPcs() {
    //GIVEN
    var claim: Claim
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        var claimNotifyRq1 = createClaimNotifyRq(ECFLCOCategoryCode_Ext.TC_00A, null)
        var claimNotifyRq2 = createClaimNotifyRq(null, ECFPCSCategoryCode_Ext.TC_Y39)
        var claimNotifyRq3 = createClaimNotifyRq(ECFLCOCategoryCode_Ext.TC_00C, null)
        claimNotifyRq3.Suspended = true
        claim = ClaimBuilderHelper.createClaim(false)
        claim.addToLMMessages(claimNotifyRq1)
        claim.addToLMMessages(claimNotifyRq2)
        claim.addToLMMessages(claimNotifyRq3)
      })
    })
    _claimData = Mockito.mock(ECFMessageClaimData_Ext)
    Mockito.when(_claimData.LcoCatastropheCode).thenReturn(ECFLCOCategoryCode_Ext.TC_00B)
    Mockito.when(_claimData.UUID).thenReturn(UUID.randomUUID().toString())
    Mockito.when(_claimData.Claim).thenReturn(claim)

    //WHEN
    var result = _claimData.HasCatastropheCodeDifferentFromLast

    //THEN
    assertTrue(result)
  }

  public function testHasCatastropheCodeDifferentFromLast_WithPcsCodeAndLastPcsEquals() {
    //GIVEN
    var claim: Claim
    var testPcsCode = ECFPCSCategoryCode_Ext.TC_Y39
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        var claimNotifyRq1 = createClaimNotifyRq(null, ECFPCSCategoryCode_Ext.TC_Y38)
        var claimNotifyRq2 = createClaimNotifyRq(null, testPcsCode)
        var claimNotifyRq3 = createClaimNotifyRq(null, ECFPCSCategoryCode_Ext.TC_Y40)
        claimNotifyRq3.Suspended = true
        claim = ClaimBuilderHelper.createClaim(false)
        claim.addToLMMessages(claimNotifyRq1)
        claim.addToLMMessages(claimNotifyRq2)
        claim.addToLMMessages(claimNotifyRq3)
      })
    })
    _claimData = Mockito.mock(ECFMessageClaimData_Ext)
    Mockito.when(_claimData.PcsCatastropheCode).thenReturn(testPcsCode)
    Mockito.when(_claimData.UUID).thenReturn(UUID.randomUUID().toString())
    Mockito.when(_claimData.Claim).thenReturn(claim)

    //WHEN
    var result = _claimData.HasCatastropheCodeDifferentFromLast

    //THEN
    assertFalse(result)
  }

  public function testHasCatastropheCodeDifferentFromLast_WithPcsCodeAndLastPcsDifferent() {
    //GIVEN
    var claim: Claim
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        var claimNotifyRq1 = createClaimNotifyRq(null, ECFPCSCategoryCode_Ext.TC_Y38)
        var claimNotifyRq2 = createClaimNotifyRq(null, ECFPCSCategoryCode_Ext.TC_Y39)
        var claimNotifyRq3 = createClaimNotifyRq(null, ECFPCSCategoryCode_Ext.TC_Y40)
        claimNotifyRq3.Suspended = true
        claim = ClaimBuilderHelper.createClaim(false)
        claim.addToLMMessages(claimNotifyRq1)
        claim.addToLMMessages(claimNotifyRq2)
        claim.addToLMMessages(claimNotifyRq3)
      })
    })
    _claimData = Mockito.mock(ECFMessageClaimData_Ext)
    Mockito.when(_claimData.PcsCatastropheCode).thenReturn(ECFPCSCategoryCode_Ext.TC_Y41)
    Mockito.when(_claimData.UUID).thenReturn(UUID.randomUUID().toString())
    Mockito.when(_claimData.Claim).thenReturn(claim)

    //WHEN
    var result = _claimData.HasCatastropheCodeDifferentFromLast

    //THEN
    assertTrue(result)
  }

  public function testHasCatastropheCodeDifferentFromLast_WithPcsCodeAndLastWithLco() {
    //GIVEN
    var claim: Claim
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        var claimNotifyRq1 = createClaimNotifyRq(null, ECFPCSCategoryCode_Ext.TC_Y38)
        var claimNotifyRq2 = createClaimNotifyRq(ECFLCOCategoryCode_Ext.TC_00A, null)
        var claimNotifyRq3 = createClaimNotifyRq(null, ECFPCSCategoryCode_Ext.TC_Y40)
        claimNotifyRq3.Suspended = true
        claim = ClaimBuilderHelper.createClaim(false)
        claim.addToLMMessages(claimNotifyRq1)
        claim.addToLMMessages(claimNotifyRq2)
        claim.addToLMMessages(claimNotifyRq3)
      })
    })
    _claimData = Mockito.mock(ECFMessageClaimData_Ext)
    Mockito.when(_claimData.PcsCatastropheCode).thenReturn(ECFPCSCategoryCode_Ext.TC_Y39)
    Mockito.when(_claimData.UUID).thenReturn(UUID.randomUUID().toString())
    Mockito.when(_claimData.Claim).thenReturn(claim)

    //WHEN
    var result = _claimData.HasCatastropheCodeDifferentFromLast

    //THEN
    assertTrue(result)
  }

  public function testHasCatastropheCodeDifferentFromLast_WithLcoAndPcsCodeAndLastLcoAndPcsEquals() {
    //GIVEN
    var claim: Claim
    var testLcoCode = ECFLCOCategoryCode_Ext.TC_00B
    var testPcsCode = ECFPCSCategoryCode_Ext.TC_Y39
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        var claimNotifyRq1 = createClaimNotifyRq(ECFLCOCategoryCode_Ext.TC_00A, ECFPCSCategoryCode_Ext.TC_Y38)
        var claimNotifyRq2 = createClaimNotifyRq(testLcoCode, testPcsCode)
        var claimNotifyRq3 = createClaimNotifyRq(ECFLCOCategoryCode_Ext.TC_00C, ECFPCSCategoryCode_Ext.TC_Y40)
        claimNotifyRq3.Suspended = true
        claim = ClaimBuilderHelper.createClaim(false)
        claim.addToLMMessages(claimNotifyRq1)
        claim.addToLMMessages(claimNotifyRq2)
        claim.addToLMMessages(claimNotifyRq3)
      })
    })
    _claimData = Mockito.mock(ECFMessageClaimData_Ext)
    Mockito.when(_claimData.LcoCatastropheCode).thenReturn(testLcoCode)
    Mockito.when(_claimData.PcsCatastropheCode).thenReturn(testPcsCode)
    Mockito.when(_claimData.UUID).thenReturn(UUID.randomUUID().toString())
    Mockito.when(_claimData.Claim).thenReturn(claim)

    //WHEN
    var result = _claimData.HasCatastropheCodeDifferentFromLast

    //THEN
    assertFalse(result)
  }

  public function testHasNewCatastropheCode_NullPcsCode() {
    //GIVEN
    _claimData = Mockito.mock(ECFMessageClaimData_Ext)

    testHasNewCatastropheCode(false)
  }

  public function testHasNewCatastropheCode_NewPcsCode() {
    //GIVEN
    _claimData = Mockito.mock(ECFMessageClaimData_Ext)
    Mockito.when(_claimData.PcsCatastropheCode).thenReturn(ECFPCSCategoryCode_Ext.TC_Y38)

    testHasNewCatastropheCode(true)
  }

  public function testHasNewCatastropheCode_ExistingPcsCode() {
    //GIVEN
    var pcsCatastropheCode = ECFPCSCategoryCode_Ext.TC_Y38
    ClaimBuilderHelper.createPCSCatastrophe(pcsCatastropheCode.Code)
    _claimData = Mockito.mock(ECFMessageClaimData_Ext)
    Mockito.when(_claimData.PcsCatastropheCode).thenReturn(pcsCatastropheCode)

    testHasNewCatastropheCode(false)
  }

  public function testHasNewCatastropheCode_NullLcoCode() {
    //GIVEN
    _claimData = Mockito.mock(ECFMessageClaimData_Ext)

    testHasNewCatastropheCode(false)
  }

  public function testHasNewCatastropheCode_NewLcoCode() {
    //GIVEN
    _claimData = Mockito.mock(ECFMessageClaimData_Ext)
    Mockito.when(_claimData.LcoCatastropheCode).thenReturn(ECFLCOCategoryCode_Ext.TC_10T)

    testHasNewCatastropheCode(true)
  }

  public function testHasNewCatastropheCode_ExistingLcoCode() {
    //GIVEN
    var lcoCatastropheCode = ECFLCOCategoryCode_Ext.TC_10T
    ClaimBuilderHelper.createLCOCatastrophe(lcoCatastropheCode.Code)
    _claimData = Mockito.mock(ECFMessageClaimData_Ext)
    Mockito.when(_claimData.LcoCatastropheCode).thenReturn(lcoCatastropheCode)

    testHasNewCatastropheCode(false)
  }

  private function testHasNewCatastropheCode(expectedResult: boolean) {
    //WHEN
    var result = _claimData.HasNewCatastropheCode
    //THEN
    assertEquals(expectedResult, result)
  }

  public function testSyndicateID() {
    var claimRetrieveRs = ECFMessageEntityUtil.createClaimRetrieveRs()

    assertEquals("The Syndicate ID should be the last section of the ReceiverID field", "0623", claimRetrieveRs.SyndicateID)
  }

  public function testApplicableToClaim(){
    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
    claimNotify.Suspended = true
    claimNotify.ActionCode = ECFActionCode_Ext.TC_U
    claimNotify.ValidationErrorCode = ECFErrorCodeType.CLAIM_DATA_POLICY_UCR_NOT_FOUND_ERROR.ErrorCode
    assertTrue(claimNotify.ApplicableToClaim)
  }

  public function testNotApplicableToClaim(){
    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
    assertFalse(claimNotify.ApplicableToClaim)
  }

  public function testNotApplicableToClaim_ClaimRetrieve(){
    var claimRetrieve = ECFMessageEntityUtil.createClaimRetrieveRs()
    assertFalse(claimRetrieve.ApplicableToClaim)
  }

  public function testApplicableToPolicy(){
    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
    claimNotify.Suspended = true
    claimNotify.ActionCode = ECFActionCode_Ext.TC_U
    claimNotify.ValidationErrorCode = ECFErrorCodeType.CLAIM_DATA_POLICY_UCR_NOT_FOUND_ERROR.ErrorCode
    assertTrue(claimNotify.ApplicableToPolicy)
  }

  public function testApplicableToPolicy_ClaimRetrieve(){
    var claimRetrieve = ECFMessageEntityUtil.createClaimRetrieveRs()
    claimRetrieve.Suspended = true
    claimRetrieve.ValidationErrorCode = ECFErrorCodeType.CLAIM_DATA_POLICY_UCR_NOT_FOUND_ERROR.ErrorCode
    assertTrue(claimRetrieve.ApplicableToPolicy)
  }

  public function testNotApplicableToPolicy(){
    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
    assertFalse(claimNotify.ApplicableToPolicy)
  }

  public function testNotApplicableToPolicy_ClaimRetrieve(){
    var claimRetrieve = ECFMessageEntityUtil.createClaimRetrieveRs()
    assertFalse(claimRetrieve.ApplicableToPolicy)
  }

  public function testLirmaLeadCirculated() {
    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
    claimNotify.ECFContactData.InsurerAgency = ECFBureauType_Ext.TC_LIRMA.getCode()
    claimNotify.TransactionStatus = ECFTransactionStatus_Ext.TC_20_CIRCULATED

    assertTrue(claimNotify.LirmaLeadCirculated)
  }

  public function testLirmaLeadCirculated_False() {
    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
    claimNotify.ECFContactData.InsurerAgency = ECFBureauType_Ext.TC_LIRMA.getCode()
    claimNotify.TransactionStatus = ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED

    assertFalse(claimNotify.LirmaLeadCirculated)
  }

  public function testFinancialsSortedByCurrency() {
    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
    var expectedSortedFinancials = {claimNotify.Financials.where(\elt -> elt.Currency == Currency.TC_EUR)[0],
                                    claimNotify.Financials.where(\elt -> elt.Currency == Currency.TC_GBP)[0],
                                    claimNotify.Financials.where(\elt -> elt.Currency == Currency.TC_USD)[0]}

    assertNotSame(claimNotify.Financials, claimNotify.FinancialsSortedByCurrency)
    assertEquals(expectedSortedFinancials[0], claimNotify.FinancialsSortedByCurrency[0])
    assertEquals(expectedSortedFinancials[1], claimNotify.FinancialsSortedByCurrency[1])
    assertEquals(expectedSortedFinancials[2], claimNotify.FinancialsSortedByCurrency[2])
  }

  public function testTransactionStatusType_MatchesDisplayName() {
    final var expectedTransactionType = ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED
    final var transactionTypeString = " 10 - AWAITING / QUERIED "

    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
    claimNotify.TransactionStatusType = transactionTypeString

    assertEquals(expectedTransactionType, claimNotify.TransactionStatus)
  }

  public function testTransactionStatusType_MatchesCode() {
    final var expectedTransactionType = ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED
    final var transactionTypeString = "10-AWAITING-QUERIED"

    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
    claimNotify.TransactionStatusType = transactionTypeString

    assertEquals(expectedTransactionType, claimNotify.TransactionStatus)
  }

  public function testTransactionStatusType_UnknownInput() {
    final var transactionTypeString = "ThisIsAnUnknownTransactionStatus"

    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
    claimNotify.TransactionStatusType = transactionTypeString

    assertNull(claimNotify.TransactionStatus)
  }

  public function testTransactionStatusType_LowerCaseInputMatchesDisplayName() {
    final var expectedTransactionType = ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED
    final var transactionTypeString = " 10 - awaiting / QUERIED "

    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
    claimNotify.TransactionStatusType = transactionTypeString

    assertEquals(expectedTransactionType, claimNotify.TransactionStatus)
  }

  public function testTransactionStatusType_LowerCaseInputMatchesCode() {
    final var expectedTransactionType = ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED
    final var transactionTypeString = "10-AWAITING-queried"

    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
    claimNotify.TransactionStatusType = transactionTypeString

    assertEquals(expectedTransactionType, claimNotify.TransactionStatus)
  }

  private function createClaimNotifyRq(lcoCode: ECFLCOCategoryCode_Ext, pcsCode: ECFPCSCategoryCode_Ext): ECFMessageClaimNotifyRq_Ext {
    var claimNotifyRq = ECFMessageEntityUtil.createClaimNotifyRq()
    claimNotifyRq.UUID = UUID.randomUUID().toString()
    claimNotifyRq.Suspended = false
    claimNotifyRq.LcoCatastropheCode = lcoCode
    claimNotifyRq.PcsCatastropheCode = pcsCode
    return claimNotifyRq
  }
}
