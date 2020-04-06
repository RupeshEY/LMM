package gw.acc.iplm.enhancements

uses gw.acc.iplm.entitymapper.ecfwb.claimdata.ECFMessageClaimNotifyRq_ExtBuilder
uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.EntityUtil
uses gw.acc.iplm.utils.ECFConstants
uses gw.api.testdata.TestDataUtil
uses gw.testharness.v3.GUnitTestClass
uses gw.transaction.Transaction
uses org.mockito.Mockito

class ClaimECFEnhancementTest extends GUnitTestClass {

  private static var notifyRqBuilder = new ECFMessageClaimNotifyRq_ExtBuilder()

  function testZeroValidClaimNotifyRqs() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        var claim = ClaimBuilderHelper.createClaim(false)
        assertEquals(0, claim.ValidClaimNotifyRqs.size())
      })
    })
  }

  function testOnlyInvalidClaimNotifyRqs() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        var notifyRq1 = defaultNotifyRqBuilder().withSuspended(true).create()
        var notifyRq2 = defaultNotifyRqErrorBuilder().create()
        var claim = ClaimBuilderHelper.createClaim(false)
        claim.addToLMMessages(notifyRq1)
        claim.addToLMMessages(notifyRq2)
        assertEquals(0, claim.ValidClaimNotifyRqs.size())
      })
    })
  }

  function testOneValidClaimNotifyRqs() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        var validNotifyRq1 = defaultNotifyRqBuilder().withSuspended(false).create()
        var claim = ClaimBuilderHelper.createClaim(false)
        claim.addToLMMessages(validNotifyRq1)
        assertEquals(1, claim.ValidClaimNotifyRqs.size())
      })
    })
  }

  private function defaultNotifyRqBuilder(): ECFMessageClaimNotifyRq_ExtBuilder {
    notifyRqBuilder.withUCR("ucr1")
        .withOriginTimeStamp(new Date())
        .withUUID(UUID.randomUUID().toString())
        .withContent("c")
        .withMessageType(ECFMessageType_Ext.TC_CLAIMNOTIFY)
    return notifyRqBuilder
  }

  private function defaultNotifyRqErrorBuilder(): ECFMessageClaimNotifyRq_ExtBuilder {
    notifyRqBuilder.withUCR("ucr1")
        .withOriginTimeStamp(new Date())
        .withUUID(UUID.randomUUID().toString())
        .withContent("c")
        .withMessageType(ECFMessageType_Ext.TC_RESPONDERRORNOTIFY)
    return notifyRqBuilder
  }

  public function testClaimRetrieveRssNoResults() {
    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        var claim = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, Date.getCurrentDate().addYears(-2))
        assertEquals(0, claim.ClaimRetrieveRses.size())
      })
    })
  }

  public function testClaimRetrieveRssFoundOne() {
    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        var claim = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, Date.getCurrentDate().addYears(-2))
        var claimNotify = new ECFMessageClaimNotifyRq_Ext(bundle)
        claim.addToLMMessages(claimNotify)
        var claimRetrieve = new ECFMessageClaimRetrieveRs_Ext(bundle)
        claim.addToLMMessages(claimRetrieve)
        assertEquals(1, claim.ClaimRetrieveRses.size())
        assertEquals(claimRetrieve, claim.ClaimRetrieveRses[0])
      })
    })
  }

  public function testLatestClaimRetrieveRsMessageReturnsOneResult() {
    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        var claim = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, Date.getCurrentDate().addYears(-2))
        var claimNotify = new ECFMessageClaimNotifyRq_Ext(bundle)
        claim.addToLMMessages(claimNotify)
        var claimRetrieve = new ECFMessageClaimRetrieveRs_Ext(bundle)
        claim.addToLMMessages(claimRetrieve)
        assertEquals(claimRetrieve, claim.LatestClaimRetrieveRsMessage)
      })
    })
  }

  public function testLatestClaimRetrieveRsMessageReturnsLatestMessage() {
    var claimRetrieve4: ECFMessageClaimRetrieveRs_Ext
    var claim: Claim
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claim = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, Date.getCurrentDate().addYears(-2))
      var claimNotify = ECFMessageEntityUtil.createClaimRetrieveRs()
      claim.addToLMMessages(claimNotify)
      var claimRetrieve = ECFMessageEntityUtil.createClaimRetrieveRs()
      claim.addToLMMessages(claimRetrieve)
      var claimRetrieve2 = ECFMessageEntityUtil.createClaimRetrieveRs()
      claim.addToLMMessages(claimRetrieve2)
      var claimRetrieve3 = ECFMessageEntityUtil.createClaimRetrieveRs()
      claim.addToLMMessages(claimRetrieve3)
      claimRetrieve4 = ECFMessageEntityUtil.createClaimRetrieveRs()
      claim.addToLMMessages(claimRetrieve4)
    }, User.util.UnrestrictedUser)
    assertEquals(claimRetrieve4, claim.LatestClaimRetrieveRsMessage)
  }

  public function testLatestClaimRetrieveRsMessageReturnsNullWhenNoRetrieveMessages() {
    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        var claim = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, Date.getCurrentDate().addYears(-2))
        var claimNotify = new ECFMessageClaimNotifyRq_Ext(bundle)
        claim.addToLMMessages(claimNotify)
        assertNull(claim.LatestClaimRetrieveRsMessage)
      })
    })
  }

  public function testLatestMessagePerTransaction() {
    var testTR1 = "TRTEST1"
    var testTR2 = "TRTEST2"
    var receiverID1 = "TESTID1"
    var receiverID2 = "TESTID2"
    var latestUUID1: String
    var latestUUID2: String
    var claim: Claim

    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        claim = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, Date.getCurrentDate().addYears(-2))
        var claimNotify1 = ECFMessageEntityUtil.createClaimNotifyRq()
        claimNotify1.TR = testTR1
        claimNotify1.ReceiverPartyId = receiverID1
        claim.addToLMMessages(claimNotify1)

        var claimNotify2 = ECFMessageEntityUtil.createClaimNotifyRq()
        claimNotify2.TR = testTR1
        claimNotify2.ReceiverPartyId = receiverID1
        claim.addToLMMessages(claimNotify2)
        latestUUID1 = claimNotify2.UUID

        var claimNotify3 = ECFMessageEntityUtil.createClaimNotifyRq()
        claimNotify3.TR = testTR2
        claimNotify3.ReceiverPartyId = receiverID2
        claim.addToLMMessages(claimNotify3)

        var claimNotify4 = ECFMessageEntityUtil.createClaimNotifyRq()
        claimNotify4.TR = testTR2
        claimNotify4.ReceiverPartyId = receiverID2
        claim.addToLMMessages(claimNotify4)
        latestUUID2 = claimNotify4.UUID
      })
    })

    assertEquals(4, claim.LMMessages.Count)
    assertEquals(2, claim.LatestMessagePerTransaction.Count)
    assertEquals(1, claim.LatestMessagePerTransaction.countWhere(\elt -> elt.UUID == latestUUID1))
    assertEquals(1, claim.LatestMessagePerTransaction.countWhere(\elt -> elt.UUID == latestUUID2))
  }

  public function testLatestMessagePerTransaction_UsingClaimRetrieve() {
    var claimRetrieveTr = "TRTEST1"
    var claimNotifyTr = "TRTEST2"
    var receiverId = "TESTID1"
    var latestCNUUID: String
    var latestCRUUID: String
    var claim: Claim

    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        claim = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, Date.getCurrentDate().addYears(-2))
        var claimNotify1 = ECFMessageEntityUtil.createClaimNotifyRq()
        claimNotify1.TR = claimNotifyTr
        claimNotify1.ReceiverPartyId = receiverId
        claim.addToLMMessages(claimNotify1)

        var claimNotify2 = ECFMessageEntityUtil.createClaimNotifyRq()
        claimNotify2.TR = claimNotifyTr
        claimNotify2.ReceiverPartyId = receiverId
        claim.addToLMMessages(claimNotify2)
        latestCNUUID = claimNotify2.UUID

        var claimRetrieve = ECFMessageEntityUtil.createClaimRetrieveRs()
        claimRetrieve.TR = claimRetrieveTr
        claimRetrieve.ReceiverPartyId = receiverId
        claim.addToLMMessages(claimRetrieve)
        latestCRUUID = claimRetrieve.UUID

      })
    })

    assertEquals(3, claim.LMMessages.Count)
    assertEquals(2, claim.LatestMessagePerTransaction.Count)
    assertEquals(1, claim.LatestMessagePerTransaction.countWhere(\elt -> elt.UUID == latestCNUUID))
    assertEquals(1, claim.LatestMessagePerTransaction.countWhere(\elt -> elt.UUID == latestCRUUID))
  }

  public function testLatestMessagePerTransaction_UsingClaimRetrieveClassIsDown() {
    var claimRetrieveTr = "TRTEST1"
    var claimNotifyTr = "TRTEST2"
    var receiverId = "TESTID1"
    var latestCNUUID: String
    var latestCRUUID: String
    var claim: Claim

    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        claim = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, Date.getCurrentDate().addYears(-2))
        var claimNotify1 = ECFMessageEntityUtil.createClaimNotifyRq()
        claimNotify1.TR = claimNotifyTr
        claimNotify1.ReceiverPartyId = receiverId
        claim.addToLMMessages(claimNotify1)

        var claimNotify2 = ECFMessageEntityUtil.createClaimNotifyRq()
        claimNotify2.TR = claimNotifyTr
        claimNotify2.ReceiverPartyId = receiverId
        claim.addToLMMessages(claimNotify2)
        latestCNUUID = claimNotify2.UUID

        var claimRetrieve = ECFMessageEntityUtil.createClaimRetrieveRs()
        claimRetrieve.TR = claimRetrieveTr
        claimRetrieve.ReceiverPartyId = receiverId
        claimRetrieve = bundle.add(claimRetrieve)
        claimRetrieve.ResponseAcknowledgement.AckLevel = ECFAckLevelCode_Ext.TC_PARTIALRESPONSECLASS
        claim.addToLMMessages(claimRetrieve)
        latestCRUUID = claimRetrieve.UUID
      })
    })

    assertEquals(3, claim.LMMessages.Count)
    assertEquals(1, claim.LatestMessagePerTransaction.Count)
    assertEquals(1, claim.LatestMessagePerTransaction.countWhere(\elt -> elt.UUID == latestCNUUID))
    assertEquals(0, claim.LatestMessagePerTransaction.countWhere(\elt -> elt.UUID == latestCRUUID))
  }

  public function testLatestMessagePerTransaction_UsingClaimRetrieveIsRejected() {
    var claimRetrieveTr = "TRTEST1"
    var claimNotifyTr = "TRTEST2"
    var receiverId = "TESTID1"
    var latestCNUUID: String
    var latestCRUUID: String
    var claim: Claim

    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        claim = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, Date.getCurrentDate().addYears(-2))
        var claimNotify1 = ECFMessageEntityUtil.createClaimNotifyRq()
        claimNotify1.TR = claimNotifyTr
        claimNotify1.ReceiverPartyId = receiverId
        claim.addToLMMessages(claimNotify1)

        var claimNotify2 = ECFMessageEntityUtil.createClaimNotifyRq()
        claimNotify2.TR = claimNotifyTr
        claimNotify2.ReceiverPartyId = receiverId
        claim.addToLMMessages(claimNotify2)
        latestCNUUID = claimNotify2.UUID

        var claimRetrieve = ECFMessageEntityUtil.createClaimRetrieveRs()
        claimRetrieve.TR = claimRetrieveTr
        claimRetrieve.ReceiverPartyId = receiverId
        claimRetrieve = bundle.add(claimRetrieve)
        claimRetrieve.ResponseAcknowledgement.AcknowledgementStatus = ECFAcknowledgementStatus_Ext.TC_REJECTED
        claim.addToLMMessages(claimRetrieve)
        latestCRUUID = claimRetrieve.UUID
      })
    })

    assertEquals(3, claim.LMMessages.Count)
    assertEquals(1, claim.LatestMessagePerTransaction.Count)
    assertEquals(1, claim.LatestMessagePerTransaction.countWhere(\elt -> elt.UUID == latestCNUUID))
    assertEquals(0, claim.LatestMessagePerTransaction.countWhere(\elt -> elt.UUID == latestCRUUID))
  }

  public function testLatestMessagePerTransaction_None() {
    var claim: Claim

    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        claim = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, Date.getCurrentDate().addYears(-2))
      })
    })

    assertEquals(0, claim.LatestMessagePerTransaction.Count)
  }

  public function testLatestMessagePerTransaction_WhereThereAreResponses() {
    var tr = "TRTEST1"
    var receiverId = "TESTID1"
    var latestUUID: String
    var claim: Claim

    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        claim = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, Date.getCurrentDate().addYears(-2))
        var claimNotify1 = ECFMessageEntityUtil.createClaimNotifyRq()
        claimNotify1.TR = tr
        claimNotify1.ReceiverPartyId = receiverId
        claim.addToLMMessages(claimNotify1)

        var response1 = ECFMessageEntityUtil.createClaimResponseRq()
        response1.TR = tr
        response1.SenderPartyId = receiverId
        response1.ReferredUUID = claimNotify1.UUID
        claim.addToLMMessages(response1)

        var claimNotify2 = ECFMessageEntityUtil.createClaimNotifyRq()
        claimNotify2.TR = tr
        claimNotify2.ReceiverPartyId = receiverId
        claim.addToLMMessages(claimNotify2)
        latestUUID = claimNotify2.UUID

        var response2 = ECFMessageEntityUtil.createClaimResponseRq()
        response2.TR = tr
        response2.SenderPartyId = receiverId
        response2.ReferredUUID = claimNotify2.UUID
        claim.addToLMMessages(response2)
      })
    })

    assertEquals(4, claim.LMMessages.Count)
    assertEquals(1, claim.LatestMessagePerTransaction.Count)
    assertEquals(1, claim.LatestMessagePerTransaction.countWhere(\elt -> elt.UUID == latestUUID))
  }

  public function testLatestMessagePerTransaction_WhereLatestRespondableIsNotLatestMessage() {
    var tr = "TRTEST1"
    var receiverId = "TESTID1"
    var respondableUUID: String
    var claim: Claim

    Transaction.runWithNewBundle(\bundle -> {
      claim = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, Date.getCurrentDate().addYears(-2))

      var txState = new ECFTransactionState_Ext(bundle)
      txState.TransactionSequence = 1

      var claimNotify1 = ECFMessageEntityUtil.createClaimNotifyRq()
      claimNotify1.TR = tr
      claimNotify1.ReceiverPartyId = receiverId
      claimNotify1.ECFTransactionState = txState
      claim.addToLMMessages(claimNotify1)

      var claimNotify2 = ECFMessageEntityUtil.createClaimNotifyRq()
      claimNotify2.TR = tr
      claimNotify2.ReceiverPartyId = receiverId
      claimNotify2.ECFTransactionState = txState

      claim.addToLMMessages(claimNotify2)

      var claimNotify3 = ECFMessageEntityUtil.createClaimNotifyRq()
      claimNotify3.TR = tr
      claimNotify3.ReceiverPartyId = receiverId
      claimNotify3.ECFTransactionState = txState
      claim.addToLMMessages(claimNotify3)

      txState.UUID = claimNotify2.UUID
      respondableUUID = claimNotify2.UUID
    }, User.util.UnrestrictedUser)

    assertEquals(3, claim.LMMessages.Count)
    assertEquals(1, claim.LatestMessagePerTransaction.Count)
    assertEquals(1, claim.LatestMessagePerTransaction.countWhere(\elt -> elt.UUID == respondableUUID))
  }

  function testLatestMessageClaimData() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        //GIVEN
        var claimNotifyRq1 = createClaimNotifyRq("UCR_TEST1")
        var claimNotifyRq2 = createClaimNotifyRq("UCR_TEST2")
        var claimNotifyRq3 = createClaimNotifyRq("UCR_TEST3")
        claimNotifyRq3.Suspended = true
        var claim = ClaimBuilderHelper.createClaim(false)
        claim.addToLMMessages(claimNotifyRq1)
        claim.addToLMMessages(claimNotifyRq2)
        claim.addToLMMessages(claimNotifyRq3)

        //WHEN
        var result = claim.LatestMessageClaimData

        //THEN
        assertNotNull(result)
        assertEquals(result.UCR, claimNotifyRq2.UCR)
        assertEquals(result.UUID, claimNotifyRq2.UUID)
        assertEquals(result.CreateTime, claimNotifyRq2.CreateTime)
      })
    })
  }

  function testLatestMessageClaimData_AllSuspended() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        //GIVEN
        var claimNotifyRq1 = createClaimNotifyRq("UCR_TEST1")
        claimNotifyRq1.Suspended = true
        var claimNotifyRq2 = createClaimNotifyRq("UCR_TEST2")
        claimNotifyRq2.Suspended = true
        var claim = ClaimBuilderHelper.createClaim(false)
        claim.addToLMMessages(claimNotifyRq1)
        claim.addToLMMessages(claimNotifyRq2)

        //WHEN
        var result = claim.LatestMessageClaimData

        //THEN
        assertNull(result)
      })
    })
  }

  function testLatestClaimDataMessage_NoMessage() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        //GIVEN
        var claim = ClaimBuilderHelper.createClaim(false)

        //WHEN
        var result = claim.LatestMessageClaimData

        //THEN
        assertNull(result)
      })
    })
  }

  function testGetLatestMessageClaimDataExcludingUUID() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        //GIVEN
        var claimNotifyRq1 = createClaimNotifyRq("UCR_TEST1")
        var claimNotifyRq2 = createClaimNotifyRq("UCR_TEST2")
        var claimNotifyRq3 = createClaimNotifyRq("UCR_TEST3")
        claimNotifyRq3.Suspended = true
        var claimNotifyRq4 = createClaimNotifyRq("UCR_TEST4")
        var claim = ClaimBuilderHelper.createClaim(false)
        claim.addToLMMessages(claimNotifyRq1)
        claim.addToLMMessages(claimNotifyRq2)
        claim.addToLMMessages(claimNotifyRq3)
        claim.addToLMMessages(claimNotifyRq4)

        //WHEN
        var result = claim.getLatestMessageClaimDataExcludingUUID(claimNotifyRq4.UUID)

        //THEN
        assertNotNull(result)
        assertEquals(result.UCR, claimNotifyRq2.UCR)
        assertEquals(result.UUID, claimNotifyRq2.UUID)
        assertEquals(result.CreateTime, claimNotifyRq2.CreateTime)
      })
    })
  }

  function testGetLatestMessageClaimDataExcludingUUID_AllSuspended() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        //GIVEN
        var claimNotifyRq1 = createClaimNotifyRq("UCR_TEST1")
        claimNotifyRq1.Suspended = true
        var claimNotifyRq2 = createClaimNotifyRq("UCR_TEST2")
        claimNotifyRq2.Suspended = true
        var claim = ClaimBuilderHelper.createClaim(false)
        claim.addToLMMessages(claimNotifyRq1)
        claim.addToLMMessages(claimNotifyRq2)

        //WHEN
        var result = claim.getLatestMessageClaimDataExcludingUUID(claimNotifyRq2.UUID)

        //THEN
        assertNull(result)
      })
    })
  }

  function testRespondableTransactionSequenceNumber() {
    var ucr = ClaimBuilderHelper.getNextUCR()
    var claim: Claim
    var claimNotifyRq1: ECFMessageClaimNotifyRq_Ext
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotifyRq1 = createClaimNotifyRq(ucr)
      claim = ClaimBuilderHelper.createClaim(false)
      claim = bundle.add(claim)
      claim.UCR_Ext = ucr
      claim.addToLMMessages(claimNotifyRq1)
    }, ECFConstants.ECF_SUPER_USER)

    var result = claim.RespondableTransactionSequenceNumber(claimNotifyRq1.ReceiverPartyId)

    assertEquals(1, result)
  }

  function testRespondableTransactionSequenceNumber_TwoUnagreedTRs() {
    var ucr = ClaimBuilderHelper.getNextUCR()
    var claim: Claim
    var receiver = "Rec1"
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyRq1 = createClaimNotifyRq(ucr)
      claimNotifyRq1 = bundle.add(claimNotifyRq1)
      claimNotifyRq1.TR = "TR1"
      claimNotifyRq1.ReceiverPartyId = receiver
      claimNotifyRq1.TransactionSequence = "001"
      claimNotifyRq1.ECFTransactionState.TransactionSequence = 1
      claimNotifyRq1.ECFTransactionState.ReceiverId = receiver

      var claimNotifyRq2 = createClaimNotifyRq(ucr)
      claimNotifyRq2 = bundle.add(claimNotifyRq2)
      claimNotifyRq2.TR = "TR2"
      claimNotifyRq2.TransactionSequence = "002"
      claimNotifyRq2.ECFTransactionState.TransactionSequence = 2
      claimNotifyRq2.ECFTransactionState.ReceiverId = receiver

      claim = ClaimBuilderHelper.createClaim(false)
      claim = bundle.add(claim)
      claim.UCR_Ext = ucr
      claim.addToLMMessages(claimNotifyRq1)
      claim.addToLMMessages(claimNotifyRq2)

    }, ECFConstants.ECF_SUPER_USER)

    var result = (claim.refresh() as Claim).RespondableTransactionSequenceNumber(receiver)

    assertNotNull(result)
    assertEquals(1, result)
  }

  function testRespondableTransactionSequenceNumber_TwoTRsOneAgreed() {
    var ucr = ClaimBuilderHelper.getNextUCR()
    var claim: Claim
    var receiver = "Rec1"
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyRq1 = createClaimNotifyRq(ucr)
      claimNotifyRq1 = bundle.add(claimNotifyRq1)
      claimNotifyRq1.TR = "TR1"
      claimNotifyRq1.TransactionSequence = "001"
      claimNotifyRq1.ReceiverPartyId = receiver
      claimNotifyRq1.ECFTransactionState.TransactionSequence = 1
      claimNotifyRq1.ECFTransactionState.ReceiverId = receiver
      claimNotifyRq1.ECFTransactionState.Agreed = true

      var claimNotifyRq2 = createClaimNotifyRq(ucr)
      claimNotifyRq2 = bundle.add(claimNotifyRq2)
      claimNotifyRq2.TR = "TR2"
      claimNotifyRq2.TransactionSequence = "002"
      claimNotifyRq2.ReceiverPartyId = receiver
      claimNotifyRq2.ECFTransactionState.TransactionSequence = 2
      claimNotifyRq2.ECFTransactionState.ReceiverId = receiver

      claim = ClaimBuilderHelper.createClaim(false)
      claim = bundle.add(claim)
      claim.UCR_Ext = ucr
      claim.addToLMMessages(claimNotifyRq1)
      claim.addToLMMessages(claimNotifyRq2)

    }, ECFConstants.ECF_SUPER_USER)

    var result = (claim.refresh() as Claim).RespondableTransactionSequenceNumber(receiver)
    assertNotNull(result)
    assertEquals(2, result)
  }

  function testRespondableTransactionSequenceNumber_TwoTRsBothAgreed() {
    var ucr = ClaimBuilderHelper.getNextUCR()
    var claim: Claim
    var receiver = "Rec1"
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyRq1 = createClaimNotifyRq(ucr)
      claimNotifyRq1 = bundle.add(claimNotifyRq1)
      claimNotifyRq1.TR = "TR1"
      claimNotifyRq1.TransactionSequence = "001"
      claimNotifyRq1.ReceiverPartyId = receiver
      claimNotifyRq1.ECFTransactionState.TransactionSequence = 1
      claimNotifyRq1.ECFTransactionState.ReceiverId = receiver
      claimNotifyRq1.ECFTransactionState.Agreed = true

      var claimNotifyRq2 = createClaimNotifyRq(ucr)
      claimNotifyRq2 = bundle.add(claimNotifyRq2)
      claimNotifyRq2.TR = "TR2"
      claimNotifyRq2.TransactionSequence = "002"
      claimNotifyRq2.ReceiverPartyId = receiver
      claimNotifyRq2.ECFTransactionState.TransactionSequence = 2
      claimNotifyRq2.ECFTransactionState.ReceiverId = receiver
      claimNotifyRq2.ECFTransactionState.Agreed = true

      claim = ClaimBuilderHelper.createClaim(false)
      claim = bundle.add(claim)
      claim.UCR_Ext = ucr
      claim.addToLMMessages(claimNotifyRq1)
      claim.addToLMMessages(claimNotifyRq2)
    }, ECFConstants.ECF_SUPER_USER)

    var result = (claim.refresh() as Claim).RespondableTransactionSequenceNumber(receiver)
    assertEquals(0, result)
  }

  function testRespondableTransactionSequenceNumber_TwoTRsOneAgreedThenReset() {
    var ucr = ClaimBuilderHelper.getNextUCR()
    var claim: Claim
    var receiver = "Rec1"
    var claimNotifyRq1: ECFMessageClaimData_Ext
    var claimNotifyRq2: ECFMessageClaimData_Ext
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotifyRq1 = createClaimNotifyRq(ucr)
      claimNotifyRq1 = bundle.add(claimNotifyRq1)
      claimNotifyRq1.TR = "TR1"
      claimNotifyRq1.TransactionSequence = "001"
      claimNotifyRq1.ReceiverPartyId = receiver
      claimNotifyRq1.ECFTransactionState.TransactionSequence = 1
      claimNotifyRq1.ECFTransactionState.Agreed = true
      claimNotifyRq1.ECFTransactionState.ReceiverId = receiver

      claimNotifyRq2 = createClaimNotifyRq(ucr)
      claimNotifyRq2 = bundle.add(claimNotifyRq2)
      claimNotifyRq2.TR = "TR2"
      claimNotifyRq2.TransactionSequence = "002"
      claimNotifyRq2.ReceiverPartyId = receiver
      claimNotifyRq2.ECFTransactionState.TransactionSequence = 2
      claimNotifyRq2.ECFTransactionState.ReceiverId = receiver

      claim = ClaimBuilderHelper.createClaim(false)
      claim = bundle.add(claim)
      claim.UCR_Ext = ucr
      claim.addToLMMessages(claimNotifyRq1)
      claim.addToLMMessages(claimNotifyRq2)

    }, ECFConstants.ECF_SUPER_USER)

    var result = (claim.refresh() as Claim).RespondableTransactionSequenceNumber(receiver)

    assertNotNull(result)
    assertEquals(2, result)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claim = bundle.add(claim)
      claimNotifyRq1 = bundle.add(claimNotifyRq1)
      claimNotifyRq1.ECFTransactionState.Agreed = false
    }, ECFConstants.ECF_SUPER_USER)

    var resetResult = (claim.refresh() as Claim).RespondableTransactionSequenceNumber(receiver)
    assertEquals(1, resetResult)
  }

  function testRespondableTransactionSequenceNumber_TwoTRsOneAgreedThenResetThenAgreedAgain() {
    var ucr = ClaimBuilderHelper.getNextUCR()
    var claim: Claim
    var receiver = "Rec1"
    var claimNotifyRq1: ECFMessageClaimData_Ext
    var claimNotifyRq2: ECFMessageClaimData_Ext
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotifyRq1 = createClaimNotifyRq(ucr)
      claimNotifyRq1 = bundle.add(claimNotifyRq1)
      claimNotifyRq1.TR = "TR1"
      claimNotifyRq1.TransactionSequence = "001"
      claimNotifyRq1.ReceiverPartyId = receiver
      claimNotifyRq1.ECFTransactionState.TransactionSequence = 1
      claimNotifyRq1.ECFTransactionState.Agreed = true
      claimNotifyRq1.ECFTransactionState.ReceiverId = receiver

      claimNotifyRq2 = createClaimNotifyRq(ucr)
      claimNotifyRq2 = bundle.add(claimNotifyRq2)
      claimNotifyRq2.TR = "TR2"
      claimNotifyRq2.TransactionSequence = "002"
      claimNotifyRq2.ReceiverPartyId = receiver
      claimNotifyRq2.ECFTransactionState.TransactionSequence = 2
      claimNotifyRq2.ECFTransactionState.ReceiverId = receiver

      claim = ClaimBuilderHelper.createClaim(false)
      claim = bundle.add(claim)
      claim.UCR_Ext = ucr
      claim.addToLMMessages(claimNotifyRq1)
      claim.addToLMMessages(claimNotifyRq2)
    }, ECFConstants.ECF_SUPER_USER)

    var result = (claim.refresh() as Claim).RespondableTransactionSequenceNumber(receiver)
    assertEquals(claimNotifyRq2.ECFTransactionState.TransactionSequence, result)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claim = bundle.add(claim)
      claimNotifyRq1 = bundle.add(claimNotifyRq1)
      claimNotifyRq1.ECFTransactionState.Agreed = false
    }, ECFConstants.ECF_SUPER_USER)

    var resetResult = (claim.refresh() as Claim).RespondableTransactionSequenceNumber(receiver)
    assertEquals(claimNotifyRq1.ECFTransactionState.TransactionSequence, resetResult)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claim = bundle.add(claim)
      claimNotifyRq1 = bundle.add(claimNotifyRq1)
      claimNotifyRq1.ECFTransactionState.Agreed = true
    }, ECFConstants.ECF_SUPER_USER)

    var thirdResult = (claim.refresh() as Claim).RespondableTransactionSequenceNumber(receiver)
    assertEquals(claimNotifyRq2.ECFTransactionState.TransactionSequence, thirdResult)
  }

  function testRespondableTransactionSequenceNumber_TenTRsWhereFiveAreAgreed() {
    var ucr = ClaimBuilderHelper.getNextUCR()
    var claim: Claim
    var receiver = "Rec1"
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyRq1 = createClaimNotifyRq(ucr)
      claimNotifyRq1 = bundle.add(claimNotifyRq1)
      claimNotifyRq1.TR = "TR1"
      claimNotifyRq1.TransactionSequence = "001"
      claimNotifyRq1.ReceiverPartyId = receiver
      claimNotifyRq1.ECFTransactionState.TransactionSequence = 1
      claimNotifyRq1.ECFTransactionState.Agreed = true
      claimNotifyRq1.ECFTransactionState.ReceiverId = receiver

      var claimNotifyRq2 = createClaimNotifyRq(ucr)
      claimNotifyRq2 = bundle.add(claimNotifyRq2)
      claimNotifyRq2.TR = "TR2"
      claimNotifyRq2.TransactionSequence = "002"
      claimNotifyRq2.ReceiverPartyId = receiver
      claimNotifyRq2.ECFTransactionState.TransactionSequence = 2
      claimNotifyRq2.ECFTransactionState.Agreed = true
      claimNotifyRq2.ECFTransactionState.ReceiverId = receiver

      var claimNotifyRq3 = createClaimNotifyRq(ucr)
      claimNotifyRq3 = bundle.add(claimNotifyRq3)
      claimNotifyRq3.TR = "TR3"
      claimNotifyRq3.TransactionSequence = "003"
      claimNotifyRq3.ReceiverPartyId = receiver
      claimNotifyRq3.ECFTransactionState.TransactionSequence = 3
      claimNotifyRq3.ECFTransactionState.Agreed = true
      claimNotifyRq3.ECFTransactionState.ReceiverId = receiver

      var claimNotifyRq4 = createClaimNotifyRq(ucr)
      claimNotifyRq4 = bundle.add(claimNotifyRq4)
      claimNotifyRq4.TR = "TR4"
      claimNotifyRq4.TransactionSequence = "004"
      claimNotifyRq4.ReceiverPartyId = receiver
      claimNotifyRq4.ECFTransactionState.TransactionSequence = 4
      claimNotifyRq4.ECFTransactionState.Agreed = true
      claimNotifyRq4.ECFTransactionState.ReceiverId = receiver

      var claimNotifyRq5 = createClaimNotifyRq(ucr)
      claimNotifyRq5 = bundle.add(claimNotifyRq5)
      claimNotifyRq5.TR = "TR5"
      claimNotifyRq5.TransactionSequence = "005"
      claimNotifyRq5.ReceiverPartyId = receiver
      claimNotifyRq5.ECFTransactionState.TransactionSequence = 5
      claimNotifyRq5.ECFTransactionState.Agreed = true
      claimNotifyRq5.ECFTransactionState.ReceiverId = receiver

      var claimNotifyRq6 = createClaimNotifyRq(ucr)
      claimNotifyRq6 = bundle.add(claimNotifyRq6)
      claimNotifyRq6.TR = "TR6"
      claimNotifyRq6.TransactionSequence = "006"
      claimNotifyRq6.ReceiverPartyId = receiver
      claimNotifyRq6.ECFTransactionState.TransactionSequence = 6
      claimNotifyRq6.ECFTransactionState.Agreed = false
      claimNotifyRq6.ECFTransactionState.ReceiverId = receiver

      var claimNotifyRq7 = createClaimNotifyRq(ucr)
      claimNotifyRq7 = bundle.add(claimNotifyRq7)
      claimNotifyRq7.TR = "TR7"
      claimNotifyRq7.TransactionSequence = "007"
      claimNotifyRq7.ReceiverPartyId = receiver
      claimNotifyRq7.ECFTransactionState.TransactionSequence = 7
      claimNotifyRq7.ECFTransactionState.Agreed = false
      claimNotifyRq7.ECFTransactionState.ReceiverId = receiver

      var claimNotifyRq8 = createClaimNotifyRq(ucr)
      claimNotifyRq8 = bundle.add(claimNotifyRq8)
      claimNotifyRq8.TR = "TR8"
      claimNotifyRq8.TransactionSequence = "008"
      claimNotifyRq8.ReceiverPartyId = receiver
      claimNotifyRq8.ECFTransactionState.TransactionSequence = 8
      claimNotifyRq8.ECFTransactionState.Agreed = false
      claimNotifyRq8.ECFTransactionState.ReceiverId = receiver

      var claimNotifyRq9 = createClaimNotifyRq(ucr)
      claimNotifyRq9 = bundle.add(claimNotifyRq9)
      claimNotifyRq9.TR = "TR9"
      claimNotifyRq9.TransactionSequence = "009"
      claimNotifyRq9.ReceiverPartyId = receiver
      claimNotifyRq9.ECFTransactionState.TransactionSequence = 9
      claimNotifyRq9.ECFTransactionState.Agreed = false
      claimNotifyRq9.ECFTransactionState.ReceiverId = receiver

      var claimNotifyRq10 = createClaimNotifyRq(ucr)
      claimNotifyRq10 = bundle.add(claimNotifyRq10)
      claimNotifyRq10.TR = "TR10"
      claimNotifyRq10.TransactionSequence = "010"
      claimNotifyRq10.ReceiverPartyId = receiver
      claimNotifyRq10.ECFTransactionState.TransactionSequence = 10
      claimNotifyRq10.ECFTransactionState.Agreed = false
      claimNotifyRq10.ECFTransactionState.ReceiverId = receiver

      claim = ClaimBuilderHelper.createClaim(false)
      claim = bundle.add(claim)
      claim.UCR_Ext = ucr
      claim.addToLMMessages(claimNotifyRq1)
      claim.addToLMMessages(claimNotifyRq2)
      claim.addToLMMessages(claimNotifyRq3)
      claim.addToLMMessages(claimNotifyRq4)
      claim.addToLMMessages(claimNotifyRq5)
      claim.addToLMMessages(claimNotifyRq6)
      claim.addToLMMessages(claimNotifyRq7)
      claim.addToLMMessages(claimNotifyRq8)
      claim.addToLMMessages(claimNotifyRq9)
      claim.addToLMMessages(claimNotifyRq10)
    }, ECFConstants.ECF_SUPER_USER)

    var result = (claim.refresh() as Claim).RespondableTransactionSequenceNumber(receiver)
    assertEquals(6, result)
  }

  function testRespondableTransactionSequenceNumber_TwoReceiversForSameTR() {
    var ucr = ClaimBuilderHelper.getNextUCR()
    var claim: Claim
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyRq1 = createClaimNotifyRq(ucr)
      claimNotifyRq1 = bundle.add(claimNotifyRq1)
      claimNotifyRq1.TR = "TR1"
      claimNotifyRq1.ReceiverPartyId = "R1"
      claimNotifyRq1.ECFTransactionState.TransactionSequence = 1
      claimNotifyRq1.ECFTransactionState.ReceiverId = "R1"

      var claimNotifyRq2 = createClaimNotifyRq(ucr)
      claimNotifyRq2 = bundle.add(claimNotifyRq2)
      claimNotifyRq2.TR = "TR1"
      claimNotifyRq2.ReceiverPartyId = "R2"
      claimNotifyRq2.ECFTransactionState.TransactionSequence = 1
      claimNotifyRq2.ECFTransactionState.ReceiverId = "R2"

      claim = ClaimBuilderHelper.createClaim(false)
      claim = bundle.add(claim)
      claim.UCR_Ext = ucr
      claim.addToLMMessages(claimNotifyRq1)
      claim.addToLMMessages(claimNotifyRq2)
    }, ECFConstants.ECF_SUPER_USER)

    var resultR1 = (claim.refresh() as Claim).RespondableTransactionSequenceNumber("R1")
    assertEquals(1, resultR1)
    var resultR2 = (claim.refresh() as Claim).RespondableTransactionSequenceNumber("R2")
    assertEquals(1, resultR2)
  }

  function testRespondableTransactionSequenceNumber_TwoUnagreedTRsWithTwoReceiversEach() {
    var ucr = ClaimBuilderHelper.getNextUCR()
    var claim: Claim
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyRq1_r1 = createClaimNotifyRq(ucr)
      claimNotifyRq1_r1 = bundle.add(claimNotifyRq1_r1)
      claimNotifyRq1_r1.TR = "TR1"
      claimNotifyRq1_r1.ReceiverPartyId = "R1"
      claimNotifyRq1_r1.TransactionSequence = "001"
      claimNotifyRq1_r1.ECFTransactionState.TransactionSequence = 1
      claimNotifyRq1_r1.ECFTransactionState.ReceiverId = "R1"

      var claimNotifyRq2_r1 = createClaimNotifyRq(ucr)
      claimNotifyRq2_r1 = bundle.add(claimNotifyRq2_r1)
      claimNotifyRq2_r1.TR = "TR2"
      claimNotifyRq2_r1.ReceiverPartyId = "R1"
      claimNotifyRq2_r1.TransactionSequence = "002"
      claimNotifyRq2_r1.ECFTransactionState.TransactionSequence = 2
      claimNotifyRq2_r1.ECFTransactionState.ReceiverId = "R1"

      var claimNotifyRq1_r2 = createClaimNotifyRq(ucr)
      claimNotifyRq1_r2 = bundle.add(claimNotifyRq1_r2)
      claimNotifyRq1_r2.TR = "TR1"
      claimNotifyRq1_r2.ReceiverPartyId = "R2"
      claimNotifyRq1_r2.TransactionSequence = "001"
      claimNotifyRq1_r2.ECFTransactionState.TransactionSequence = 1
      claimNotifyRq1_r2.ECFTransactionState.ReceiverId = "R2"

      var claimNotifyRq2_r2 = createClaimNotifyRq(ucr)
      claimNotifyRq2_r2 = bundle.add(claimNotifyRq2_r2)
      claimNotifyRq2_r2.TR = "TR2"
      claimNotifyRq2_r2.ReceiverPartyId = "R2"
      claimNotifyRq2_r2.TransactionSequence = "002"
      claimNotifyRq2_r2.ECFTransactionState.TransactionSequence = 2
      claimNotifyRq2_r2.ECFTransactionState.ReceiverId = "R2"

      claim = ClaimBuilderHelper.createClaim(false)
      claim = bundle.add(claim)
      claim.UCR_Ext = ucr
      claim.addToLMMessages(claimNotifyRq1_r1)
      claim.addToLMMessages(claimNotifyRq2_r1)
      claim.addToLMMessages(claimNotifyRq1_r2)
      claim.addToLMMessages(claimNotifyRq2_r2)

    }, ECFConstants.ECF_SUPER_USER)

    var resultR1 = (claim.refresh() as Claim).RespondableTransactionSequenceNumber("R1")
    assertEquals(1, resultR1)
    var resultR2 = (claim.refresh() as Claim).RespondableTransactionSequenceNumber("R2")
    assertEquals(1, resultR2)
  }

  function testRespondableTransactionSequenceNumber_TwoTRsTwoReceiversOneAgreed() {
    var ucr = ClaimBuilderHelper.getNextUCR()
    var claim: Claim
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyRq1_r1 = createClaimNotifyRq(ucr)
      claimNotifyRq1_r1 = bundle.add(claimNotifyRq1_r1)
      claimNotifyRq1_r1.TR = "TR1"
      claimNotifyRq1_r1.ReceiverPartyId = "R1"
      claimNotifyRq1_r1.TransactionSequence = "001"
      claimNotifyRq1_r1.ECFTransactionState.TransactionSequence = 1
      claimNotifyRq1_r1.ECFTransactionState.ReceiverId = "R1"
      claimNotifyRq1_r1.ECFTransactionState.Agreed = true

      var claimNotifyRq2_r1 = createClaimNotifyRq(ucr)
      claimNotifyRq2_r1 = bundle.add(claimNotifyRq2_r1)
      claimNotifyRq2_r1.TR = "TR2"
      claimNotifyRq2_r1.ReceiverPartyId = "R1"
      claimNotifyRq2_r1.TransactionSequence = "002"
      claimNotifyRq2_r1.ECFTransactionState.TransactionSequence = 2
      claimNotifyRq2_r1.ECFTransactionState.ReceiverId = "R1"

      var claimNotifyRq1_r2 = createClaimNotifyRq(ucr)
      claimNotifyRq1_r2 = bundle.add(claimNotifyRq1_r2)
      claimNotifyRq1_r2.TR = "TR1"
      claimNotifyRq1_r2.ReceiverPartyId = "R2"
      claimNotifyRq1_r2.TransactionSequence = "001"
      claimNotifyRq1_r2.ECFTransactionState.TransactionSequence = 1
      claimNotifyRq1_r2.ECFTransactionState.ReceiverId = "R2"

      var claimNotifyRq2_r2 = createClaimNotifyRq(ucr)
      claimNotifyRq2_r2 = bundle.add(claimNotifyRq2_r2)
      claimNotifyRq2_r2.TR = "TR2"
      claimNotifyRq2_r2.ReceiverPartyId = "R2"
      claimNotifyRq2_r2.TransactionSequence = "002"
      claimNotifyRq2_r2.ECFTransactionState.TransactionSequence = 2
      claimNotifyRq2_r2.ECFTransactionState.ReceiverId = "R2"

      claim = ClaimBuilderHelper.createClaim(false)
      claim = bundle.add(claim)
      claim.UCR_Ext = ucr
      claim.addToLMMessages(claimNotifyRq1_r1)
      claim.addToLMMessages(claimNotifyRq2_r1)
      claim.addToLMMessages(claimNotifyRq1_r2)
      claim.addToLMMessages(claimNotifyRq2_r2)

    }, ECFConstants.ECF_SUPER_USER)

    var resultR1 = (claim.refresh() as Claim).RespondableTransactionSequenceNumber("R1")
    assertEquals(2, resultR1)
    var resultR2 = (claim.refresh() as Claim).RespondableTransactionSequenceNumber("R2")
    assertEquals(1, resultR2)
  }

  function testRespondableTransactionSequenceNumber_WithZeroTransactionStates() {
    var ucr = ClaimBuilderHelper.getNextUCR()
    var claim: Claim
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyRq1_r1 = createClaimNotifyRq(ucr)
      claimNotifyRq1_r1 = bundle.add(claimNotifyRq1_r1)
      claimNotifyRq1_r1.TR = "TR1"
      claimNotifyRq1_r1.ReceiverPartyId = "R1"
      claimNotifyRq1_r1.TransactionSequence = "001"
      claimNotifyRq1_r1.ECFTransactionState = null

      claim = ClaimBuilderHelper.createClaim(false)
      claim = bundle.add(claim)
      claim.UCR_Ext = ucr
      claim.addToLMMessages(claimNotifyRq1_r1)

    }, ECFConstants.ECF_SUPER_USER)

    var resultR1 = (claim.refresh() as Claim).RespondableTransactionSequenceNumber("R1")
    assertEquals(0, resultR1)
  }

  function testRespondableTransactionSequenceNumber_WithZeroMessages() {
    var ucr = ClaimBuilderHelper.getNextUCR()
    var claim: Claim
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claim = ClaimBuilderHelper.createClaim(false)
      claim = bundle.add(claim)
      claim.UCR_Ext = ucr
    }, ECFConstants.ECF_SUPER_USER)

    var resultR1 = (claim.refresh() as Claim).RespondableTransactionSequenceNumber("R1")
    assertEquals(0, resultR1)
  }


  function testIsECFVisible_WithSuspendedECFMessages() {
    var claim = Mockito.mock(Claim)
    var ecfMessage = Mockito.mock(ECFMessage_Ext)

    Mockito.when(claim.UCR_Ext).thenReturn("TestUCR")
    Mockito.when(ecfMessage.MessageType).thenReturn(ECFMessageType_Ext.TC_CLAIMNOTIFY)
    Mockito.when(ecfMessage.Suspended).thenReturn(true)
    Mockito.when(claim.LMMessages).thenReturn({ecfMessage})

    assertFalse(new Boolean(claim.isECFVisible()))
  }

  function testIsECFVisible_WithECFMessages() {
    var claim = Mockito.mock(Claim)
    var ecfMessage = Mockito.mock(ECFMessage_Ext)

    Mockito.when(claim.UCR_Ext).thenReturn("TestUCR")
    Mockito.when(ecfMessage.MessageType).thenReturn(ECFMessageType_Ext.TC_CLAIMNOTIFY)
    Mockito.when(claim.LMMessages).thenReturn({ecfMessage})

    assertTrue(new Boolean(claim.isECFVisible()))
  }

  function testIsECFVisible_WithSCMMessages() {
    var claim = Mockito.mock(Claim)
    var ecfMessage = Mockito.mock(ECFMessage_Ext)

    Mockito.when(claim.UCR_Ext).thenReturn("TestUCR")
    Mockito.when(ecfMessage.MessageType).thenReturn(ECFMessageType_Ext.TC_LLOYDSSYNDICATECLAIM)
    Mockito.when(claim.LMMessages).thenReturn({ecfMessage})

    assertFalse(new Boolean(claim.isECFVisible()))
  }

  function testIsECFVisible_WithECFAndSCMMessages() {
    var claim = Mockito.mock(Claim)
    var ecfMessage = Mockito.mock(ECFMessage_Ext)
    var scmMessage = Mockito.mock(ECFMessage_Ext)

    Mockito.when(claim.UCR_Ext).thenReturn("TestUCR")
    Mockito.when(ecfMessage.MessageType).thenReturn(ECFMessageType_Ext.TC_CLAIMNOTIFY)
    Mockito.when(scmMessage.MessageType).thenReturn(ECFMessageType_Ext.TC_LLOYDSSYNDICATECLAIM)
    Mockito.when(claim.LMMessages).thenReturn({ecfMessage, scmMessage})

    assertTrue(new Boolean(claim.isECFVisible()))
  }

  function testIsECFVisible_WithNoMessages() {
    var claim = Mockito.mock(Claim)

    assertFalse(new Boolean(claim.isECFVisible()))
  }

  function testIsLMVisible_WithECFMessages() {
    var claim = Mockito.mock(Claim)
    var ecfMessage = Mockito.mock(ECFMessage_Ext)

    Mockito.when(claim.UCR_Ext).thenReturn("TestUCR")
    Mockito.when(ecfMessage.MessageType).thenReturn(ECFMessageType_Ext.TC_CLAIMNOTIFY)
    Mockito.when(claim.LMMessages).thenReturn({ecfMessage})

    assertTrue(new Boolean(claim.isLMVisible()))
  }

  function testIsLMVisible_WithSCMMessages() {
    var claim = Mockito.mock(Claim)
    var ecfMessage = Mockito.mock(ECFMessage_Ext)

    Mockito.when(claim.UCR_Ext).thenReturn("TestUCR")
    Mockito.when(ecfMessage.MessageType).thenReturn(ECFMessageType_Ext.TC_LLOYDSSYNDICATECLAIM)
    Mockito.when(claim.LMMessages).thenReturn({ecfMessage})

    assertTrue(new Boolean(claim.isLMVisible()))
  }

  function testIsLMVisible_WithECFAndSCMMessages() {
    var claim = Mockito.mock(Claim)
    var ecfMessage = Mockito.mock(ECFMessage_Ext)
    var scmMessage = Mockito.mock(ECFMessage_Ext)

    Mockito.when(claim.UCR_Ext).thenReturn("TestUCR")
    Mockito.when(ecfMessage.MessageType).thenReturn(ECFMessageType_Ext.TC_CLAIMNOTIFY)
    Mockito.when(scmMessage.MessageType).thenReturn(ECFMessageType_Ext.TC_LLOYDSSYNDICATECLAIM)
    Mockito.when(claim.LMMessages).thenReturn({ecfMessage, scmMessage})

    assertTrue(new Boolean(claim.isLMVisible()))
  }

  function testIsLMVisible_WithNoMessages() {
    var claim = Mockito.mock(Claim)

    Mockito.when(claim.UCR_Ext).thenReturn("TestUCR")

    assertFalse(new Boolean(claim.isLMVisible()))
  }

  function testHasSuspendedMessages(){
    var claim = Mockito.mock(Claim)
    var ecfMessage = Mockito.mock(ECFMessage_Ext)

    Mockito.when(claim.UCR_Ext).thenReturn("TestUCR")
    Mockito.when(ecfMessage.MessageType).thenReturn(ECFMessageType_Ext.TC_CLAIMNOTIFY)
    Mockito.when(ecfMessage.Suspended).thenReturn(true)
    Mockito.when(claim.LMMessages).thenReturn({ecfMessage})
    assertTrue(claim.HasSuspendedMessages)
  }

  function testHasSuspendedMessages_False(){
    var claim = Mockito.mock(Claim)
    var ecfMessage = Mockito.mock(ECFMessage_Ext)

    Mockito.when(claim.UCR_Ext).thenReturn("TestUCR")
    Mockito.when(ecfMessage.MessageType).thenReturn(ECFMessageType_Ext.TC_CLAIMNOTIFY)
    Mockito.when(ecfMessage.Suspended).thenReturn(false)
    Mockito.when(claim.LMMessages).thenReturn({ecfMessage})
    assertFalse(claim.HasSuspendedMessages)
  }

  function testGetLatestMessageByOCRExcludingUUID_findsOCR() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var claim = ClaimBuilderHelper.createClaim(false)
      var message = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      message.OCR = "OCR1"
      message.MessageSequence = 1
      claim.addToLMMessages(message)
      assertEquals(message, claim.getHighestSCMMessageSequenceByOCR("OCR1", "RandomUUID"))
    })
  }

  function testGetLatestMessageByOCRExcludingUUID_doesntFindOCR() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var claim = ClaimBuilderHelper.createClaim(false)
      var message = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      message.OCR = "OCR2"
      message.MessageSequence = 1
      claim.addToLMMessages(message)
      assertNull(claim.getHighestSCMMessageSequenceByOCR("OCR1", "RandomUUID"))
    })
  }

  function testGetLatestMessageByOCRExcludingUUID_findsOCRIgnoresSuspended() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var claim = ClaimBuilderHelper.createClaim(false)
      var message = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      message.OCR = "OCR1"
      message.MessageSequence = 1
      var message1 = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      message1.OCR = "OCR1"
      message1.MessageSequence = 2
      message1.Suspended = true
      claim.addToLMMessages(message)
      claim.addToLMMessages(message1)
      assertEquals(message, claim.getHighestSCMMessageSequenceByOCR("OCR1", "RandomUUID"))
    })
  }

  function testTransactionReferences_MultipleMessages() {
    final var ucr = "MultipleMessages"
    final var expectedTransactions = {"TR1", "TR2"}

    var claim: Claim

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyRq1 = createClaimNotifyRq(ucr)
      claimNotifyRq1 = bundle.add(claimNotifyRq1)
      claimNotifyRq1.TR = "TR2"

      var claimNotifyRq2 = createClaimNotifyRq(ucr)
      claimNotifyRq2 = bundle.add(claimNotifyRq2)
      claimNotifyRq2.TR = "TR1"

      var claimNotifyRq3 = createClaimNotifyRq(ucr)
      claimNotifyRq3 = bundle.add(claimNotifyRq3)
      claimNotifyRq3.TR = "TR1"

      claim = ClaimBuilderHelper.createClaim(false)
      claim = bundle.add(claim)
      claim.UCR_Ext = ucr
      claim.addToLMMessages(claimNotifyRq1)
      claim.addToLMMessages(claimNotifyRq2)
      claim.addToLMMessages(claimNotifyRq3)
    }, ECFConstants.ECF_SUPER_USER)

    assertEquals(expectedTransactions, claim.TransactionReferences)
  }

  function testTransactionReferences_SuspendedMessages() {
    final var ucr = "SuspendedMessages"
    final var expectedTransactions = {"TR1"}

    var claim: Claim

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyRq1 = createClaimNotifyRq(ucr)
      claimNotifyRq1 = bundle.add(claimNotifyRq1)
      claimNotifyRq1.TR = "TR2"
      claimNotifyRq1.Suspended = true

      var claimNotifyRq2 = createClaimNotifyRq(ucr)
      claimNotifyRq2 = bundle.add(claimNotifyRq2)
      claimNotifyRq2.TR = "TR1"

      var claimNotifyRq3 = createClaimNotifyRq(ucr)
      claimNotifyRq3 = bundle.add(claimNotifyRq3)
      claimNotifyRq3.TR = "TR1"

      claim = ClaimBuilderHelper.createClaim(false)
      claim = bundle.add(claim)
      claim.UCR_Ext = ucr
      claim.addToLMMessages(claimNotifyRq1)
      claim.addToLMMessages(claimNotifyRq2)
      claim.addToLMMessages(claimNotifyRq3)
    }, ECFConstants.ECF_SUPER_USER)

    assertEquals(expectedTransactions, claim.TransactionReferences)
  }

  function testGetLatestMessageByOCRExcludingUUID_findsOCRIgnoresExcluded() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var claim = ClaimBuilderHelper.createClaim(false)
      var message = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      message.OCR = "OCR1"
      message.MessageSequence = 1
      var message1 = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      message1.OCR = "OCR1"
      message1.MessageSequence = 2
      claim.addToLMMessages(message)
      claim.addToLMMessages(message1)
      assertEquals(message, claim.getHighestSCMMessageSequenceByOCR("OCR1", message1.UUID))
    })
  }

  private function createClaimNotifyRq(ucr: String): ECFMessageClaimNotifyRq_Ext {
    var claimNotifyRq = ECFMessageEntityUtil.createClaimNotifyRq()
    claimNotifyRq.UUID = UUID.randomUUID().toString()
    claimNotifyRq.Suspended = false
    claimNotifyRq.UCR = ucr
    return claimNotifyRq
  }

  public function testGetSCMMessages_NoSCMMessages() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var claim = ClaimBuilderHelper.createClaim(false)

      var amountOfSCMMessages = claim.SCMMessages.Count

      assertEquals(0, amountOfSCMMessages)
    })
  }

  public function testGetSCMMessages_SCMAndNonSCMMessages() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var claim = ClaimBuilderHelper.createClaim(true)

      var newCnRq = ECFMessageEntityUtil.createClaimNotifyRq()
      claim.addToLMMessages(newCnRq)

      var newSCM1 = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      newSCM1.OCR = "OCR1"
      claim.addToLMMessages(newSCM1)

      var newSCM2 = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      newSCM2.OCR = "OCR2"
      claim.addToLMMessages(newSCM2)

      var newSCM3 = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      newSCM3.OCR = "OCR3"
      claim.addToLMMessages(newSCM3)

      var amountOfSCMMessages = claim.SCMMessages.Count

      assertEquals(3, amountOfSCMMessages)
    })
  }

  public function testGetSCMMessages_OnlySCMMessages() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var claim = ClaimBuilderHelper.createClaim(false)

      var newSCM1 = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      newSCM1.OCR = "OCR1"
      claim.addToLMMessages(newSCM1)

      var newSCM2 = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      newSCM2.OCR = "OCR2"
      claim.addToLMMessages(newSCM2)

      var newSCM3 = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      newSCM3.OCR = "OCR3"
      claim.addToLMMessages(newSCM3)

      var amountOfSCMMessages = claim.SCMMessages.Count

      assertEquals(3, amountOfSCMMessages)
    })
  }

  public function testIsSCMVisible_NoSCMMessagesOnTheClaim() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var claim = ClaimBuilderHelper.createClaim(false)

      assertFalse(claim.SCMVisible)
    })
  }

  public function testIsSCMVisible_SuspendedSCMMessagesOnTheClaim() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var claim = ClaimBuilderHelper.createClaim(false)

      var newSCM1 = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      newSCM1.OCR = "OCR1"
      newSCM1.Suspended = true
      claim.addToLMMessages(newSCM1)

      assertFalse(claim.SCMVisible)
    })
  }

  public function testGetSCMMessages_SCMAndNonSCMMessagesOnTheClaim() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var claim = ClaimBuilderHelper.createClaim(true)

      var newCnRq = ECFMessageEntityUtil.createClaimNotifyRq()
      claim.addToLMMessages(newCnRq)

      var newSCM1 = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      newSCM1.OCR = "OCR1"
      claim.addToLMMessages(newSCM1)

      assertTrue(claim.SCMVisible)
    })
  }

  public function testIsSCMVisible_OnlySCMMessagesOnTheClaim() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var claim = ClaimBuilderHelper.createClaim(false)

      var newSCM1 = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      newSCM1.OCR = "OCR1"
      claim.addToLMMessages(newSCM1)

      assertTrue(claim.SCMVisible)
    })
  }

}