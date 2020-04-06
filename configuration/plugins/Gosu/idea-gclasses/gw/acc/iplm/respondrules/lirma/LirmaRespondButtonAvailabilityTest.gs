package gw.acc.iplm.respondrules.lirma

/**
 * The test IDs in this class are derived from a BDD set of cases found here:
 * https://confluence.guidewire.com/display/ACC/US9362+-+ClaimNotify+Response+Button+Conditions
 */
class LirmaRespondButtonAvailabilityTest extends LirmaRespondRuleTester {

  /**
   * Broker releases new transaction - Carrier is LIRMA Lead
   * <p>
   * LIRMA-A-01
   */
  public function testNewTransaction_LIRMALead() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lirmaTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_A)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertTrue(respondButtonAvailable(claimNotify))
  }

  /**
   * Broker releases new transaction - Carrier is LIRMA SAP
   * <p>
   * LIRMA-A-02
   */
  public function testNewTransaction_LIRMASAP() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lirmaTestId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_A)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Broker changes a transaction - Carrier is LIRMA Lead
   * <p>
   * LIRMA-A-03
   */
  public function testBrokerChangesTransaction_LIRMALead() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lirmaTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_U)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertTrue(respondButtonAvailable(claimNotify))
  }

  /**
   * Broker changes a transaction - Carrier is LIRMA SAP
   * <p>
   * LIRMA-A-04
   */
  public function testBrokerChangesTransaction_LIRMASAP() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lirmaTestId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_U)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * XChanging acknowledges a Lead's Circulation - Carrier is LIRMA Lead
   * <p>
   * LIRMA-A-05
   */
  public function testLeadCirculates_LIRMALead() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lirmaTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_20_CIRCULATED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, _lirmaTestId)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_CIR)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertTrue(respondButtonAvailable(claimNotify))
  }

  /**
   * XChanging acknowledges a Lead's Circulation - Carrier is LIRMA SAP
   * <p>
   * LIRMA-A-06
   */
  public function testLeadCirculates_LIRMASAP() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lirmaTestId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_20_CIRCULATED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, _otherCarrierId)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_CIR)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertTrue(respondButtonAvailable(claimNotify))
  }

  /**
   * XChanging acknowledges an SAP agreement - Carrier is LIRMA Lead who has not yet agreed
   * <p>
   * LIRMA-A-07
   */
  public function testSAPAgrees_LIRMALead_HasNotAgreed() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lirmaTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_20_CIRCULATED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, _otherCarrierId)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_CAA)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertTrue(respondButtonAvailable(claimNotify))
  }

  /**
   * XChanging acknowledges an SAP agreement - Carrier is LIRMA SAP who has not yet agreed
   * <p>
   * LIRMA-A-08
   */
  public function testSAPAgrees_LIRMASAP_HasNotAgreed() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lirmaTestId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_20_CIRCULATED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, _otherCarrierId2)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_CAA)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertTrue(respondButtonAvailable(claimNotify))
  }

  /**
   * XChanging acknowledges an SAP agreement - Carrier is LIRMA Lead who has already agreed
   * <p>
   * LIRMA-A-09
   */
  public function testSAPAgrees_LIRMALead_HasAgreed() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lirmaTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_20_CIRCULATED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, _otherCarrierId)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_CAA)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotify = bundle.add(claimNotify)
      claimNotify.ECFTransactionState.Agreed = true
    }, User.util.UnrestrictedUser)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * XChanging acknowledges an SAP agreement - Carrier is LIRMA SAP who has already agreed
   * <p>
   * LIRMA-A-10
   */
  public function testSAPAgrees_LIRMASAP_HasAgreed() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lirmaTestId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_20_CIRCULATED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, _lirmaTestId)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_CAA)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotify = bundle.add(claimNotify)
      claimNotify.ECFTransactionState.Agreed = true
    }, User.util.UnrestrictedUser)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * XChanging acknowledges all agreement parties have agreed - Carrier is LIRMA Lead
   * <p>
   * LIRMA-A-11
   */
  public function testAllAgreed_LIRMALead() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lirmaTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_40_COMPLETE)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_U)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * XChanging acknowledges all agreement parties have agreed - Carrier is LIRMA SAP
   * <p>
   * LIRMA-A-12
   */
  public function testAllAgreed_LIRMASAP() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lirmaTestId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_40_COMPLETE)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_U)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Broker purges the Claim - Carrier is LIRMA Lead
   * <p>
   * LIRMA-A-13
   */
  public function testClaimPurged_LIRMALead() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lirmaTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_8_PURGED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_U)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Broker purges the Claim - Carrier is LIRMA SAP
   * <p>
   * LIRMA-A-14
   */
  public function testClaimPurged_LIRMASAP() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lirmaTestId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_8_PURGED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_U)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * XChanging acknowledges an SAP agreement - Carrier is LIRMA Lead who has not yet agreed
   * <p>
   * LIRMA-A-15
   */
  public function testSAPAgrees_LIRMALead_HasNotAgreed_Settlement() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lirmaTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_20_CIRCULATED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, _otherCarrierId)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_YES)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertTrue(respondButtonAvailable(claimNotify))
  }

  /**
   * XChanging acknowledges an SAP agreement - Carrier is LIRMA SAP who has not yet agreed
   * <p>
   * LIRMA-A-16
   */
  public function testSAPAgrees_LIRMASAP_HasNotAgreed_Settlement() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lirmaTestId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_20_CIRCULATED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, _otherCarrierId2)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_YES)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertTrue(respondButtonAvailable(claimNotify))
  }

  /**
   * XChanging acknowledges an SAP agreement - Carrier is LIRMA Lead who has already agreed
   * <p>
   * LIRMA-A-17
   */
  public function testSAPAgrees_LIRMALead_HasAgreed_Settlement() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lirmaTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_20_CIRCULATED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, _otherCarrierId)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_YES)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotify = bundle.add(claimNotify)
      claimNotify.ECFTransactionState.Agreed = true
    }, User.util.UnrestrictedUser)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * XChanging acknowledges an SAP agreement - Carrier is LIRMA SAP who has already agreed
   * <p>
   * LIRMA-A-18
   */
  public function testSAPAgrees_LIRMASAP_HasAgreed_Settlement() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lirmaTestId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_20_CIRCULATED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, _lirmaTestId)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_YES)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotify = bundle.add(claimNotify)
      claimNotify.ECFTransactionState.Agreed = true
    }, User.util.UnrestrictedUser)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Transaction is in error - Carrier is LIRMA Lead
   * <p>
   * LIRMA-B-01
   */
  public function testTransactionInError_LIRMALead() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lirmaTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_3)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_A)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Transaction is in error - Carrier is LIRMA SAP
   * <p>
   * LIRMA-B-02
   */
  public function testTransactionInError_LIRMASAP() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lirmaTestId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_3)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_A)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Awaiting update of earlier transaction - Carrier is LIRMA Lead
   * <p>
   * LIRMA-B-03
   */
  public function testAwaitingUpdate_LIRMALead() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lirmaTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_4)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_A)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Awaiting update of earlier transaction - Carrier is LIRMA SAP
   * <p>
   * LIRMA-B-04
   */
  public function testAwaitingUpdate_LIRMASAP() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lirmaTestId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_4)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_A)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Claim is rejected by the Lead - Carrier is LIRMA Lead
   * <p>
   * LIRMA-B-05
   */
  public function testClaimRejected_LIRMALead() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lirmaTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_12_REJ)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, _lirmaTestId)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_REJ)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Claim is rejected by the Lead - Carrier is LIRMA SAP
   * <p>
   * LIRMA-B-06
   */
  public function testClaimRejected_LIRMASAP() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lirmaTestId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_12_REJ)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, _otherCarrierId)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_REJ)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Claim is cancelled by the Lead - Carrier is LIRMA Lead
   * <p>
   * LIRMA-B-07
   */
  public function testClaimCancelled_LIRMALead() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lirmaTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_45_CANCELD)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, _lirmaTestId)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_CAN)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Claim is cancelled by the Lead - Carrier is LIRMA SAP
   * <p>
   * LIRMA-B-08
   */
  public function testClaimCancelled_LIRMASAP() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lirmaTestId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_45_CANCELD)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, _otherCarrierId)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_CAN)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * E-Event - Carrier is LIRMA Lead
   * <p>
   * LIRMA-B-09
   */
  public function testEEvent_LIRMALead() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lirmaTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_E)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * E-Event - Carrier is LIRMA SAP
   * <p>
   * LIRMA-B-10
   */
  public function testEEvent_LIRMASAP() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lirmaTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_E)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Broker deletes the transaction - Carrier is LIRMA Lead
   * <p>
   * LIRMA-B-11
   */
  public function testClaimDeleted_LIRMALead() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lirmaTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_40_COMPLETE)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_D)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Broker deletes the transaction - Carrier is LIRMA SAP
   * <p>
   * LIRMA-B-12
   */
  public function testClaimDeleted_LIRMASAP() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lirmaTestId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_40_COMPLETE)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_D)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  public function testTransactionIsPurged_ILUSAP() {
    var claimNoitfy = createClaimNotifyRqEntity()
    claimNoitfy = setTransactionStatus(claimNoitfy, ECFTransactionStatus_Ext.TC_8_PURGED)
    claimNoitfy = setExplanation(claimNoitfy, TC_U)
    claimNoitfy = setActionParticipant(claimNoitfy, _brokerId)
    claimNoitfy = setLead(claimNoitfy, _otherCarrierId)
    claimNoitfy = setSecondAgreementParty(claimNoitfy, {_lirmaTestId, _otherCarrierId2})
    claimNoitfy = processClaimNotifyEntity(claimNoitfy)
    assertFalse(respondButtonAvailable(claimNoitfy))
  }

  public function testTransactionIsPurged_ILULead() {
    var claimNoitfy = createClaimNotifyRqEntity()
    claimNoitfy = setTransactionStatus(claimNoitfy, ECFTransactionStatus_Ext.TC_8_PURGED)
    claimNoitfy = setExplanation(claimNoitfy, TC_U)
    claimNoitfy = setActionParticipant(claimNoitfy, _brokerId)
    claimNoitfy = setLead(claimNoitfy, _lirmaTestId)
    claimNoitfy = setSecondAgreementParty(claimNoitfy, {_otherCarrierId, _otherCarrierId2})
    claimNoitfy = processClaimNotifyEntity(claimNoitfy)
    assertFalse(respondButtonAvailable(claimNoitfy))
  }

  override function createClaimNotifyRqEntity(): ECFMessageClaimNotifyRq_Ext {
    return super.createClaimNotifyRqEntity(_lirmaTestId)
  }
}