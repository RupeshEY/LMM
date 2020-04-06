package gw.acc.iplm.respondrules.lloyds

uses gw.acc.iplm.services.EntityMapperService
uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.ClaimNotifyEventRq

/**
 * The test IDs in this class are derived from a BDD set of cases found here:
 * https://confluence.guidewire.com/display/ACC/US9362+-+ClaimNotify+Response+Button+Conditions
 */
class LloydsRespondButtonAvailabilityTest extends LloydsRespondRuleTester {


  /**
   * Broker releases new transaction - Carrier is Lloyd's Lead
   * <p>
   * Given:
   * Lloyd's Lead ClaimNotify for a new Claim
   * LloydsStatus is '10-AWAITING/QUERIED'
   * Explanation is 'A'
   * <p>
   * When:
   * Message received by the Lloyd's Lead carrier
   * <p>
   * Then
   * Respond Button should be available.
   * <p>
   * LLOYD-A-01
   */
  function testBrokerReleasesNewTransaction_LloydsLead() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lloydsTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_A)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertTrue(respondButtonAvailable(claimNotify))
  }

  /**
   * Broker releases new transaction - Carrier is Lloyd's SAP
   * <p>
   * Given:
   * Lloyd's SAP ClaimNotify for a new Claim
   * LloydsStatus is '10-AWAITING/QUERIED'
   * Explanation is 'A'
   * <p>
   * When:
   * Message received by the Lloyd's Agreement Party carrier
   * <p>
   * Then
   * Respond Button should not be available.
   * <p>
   * LLOYD-A-02
   */
  function testBrokerReleasesNewTransaction_LloydsSAP() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_A)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * XChanging acknowledges a query - Carrier is Lloyd's Lead
   * <p>
   * Given:
   * Lloyd's Lead ClaimNotify for an existing Claim
   * LloydsStatus is '10-AWAITING/QUERIED'
   * Explanation is 'R'
   * <p>
   * When:
   * Message received by the Lloyd's Lead carrier
   * <p>
   * Then
   * Respond Button should be available.
   * <p>
   * LLOYD-A-03
   */
  function testXchangingAcknowledgesQuery_LloydsLead() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lloydsTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertTrue(respondButtonAvailable(claimNotify))
  }

  /**
   * XChanging acknowledges a query - Carrier is Lloyd's SAP
   * <p>
   * Given:
   * Lloyd's SAP ClaimNotify for an existing Claim
   * LloydsStatus is '10-AWAITING/QUERIED'
   * Explanation is 'R'
   * <p>
   * When:
   * Message received by the Lloyd's Agreement Party carrier
   * <p>
   * Then
   * Respond Button should not be available.
   * <p>
   * LLOYD-A-04
   */
  function testXchangingAcknowledgesQuery_LloydsSAP() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Broker answers a query - Carrier is Lloyd's Lead
   * <p>
   * Given:
   * Lloyd's Lead ClaimNotify for an existing Claim
   * LloydsStatus is '10-AWAITING/QUERIED'
   * Explanation is 'U'
   * <p>
   * When:
   * Message received by the Lloyd's Lead carrier
   * <p>
   * Then
   * Respond Button should be available.
   * <p>
   * LLOYD-A-05
   */
  function testBrokerAnswersQuery_LloydsLead() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lloydsTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_U)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertTrue(respondButtonAvailable(claimNotify))
  }

  /**
   * Broker answers a query - Carrier is Lloyd's SAP
   * <p>
   * Given:
   * Lloyd's SAP ClaimNotify for an existing Claim
   * LloydsStatus is '10-WAITING/QUERIED'
   * Explanation is 'U'
   * <p>
   * When:
   * Message received by the Lloyd's Agreement Party carrier
   * <p>
   * Then
   * Respond Button should not be available.
   * <p>
   * LLOYD-A-06
   */
  function testBrokerAnswersQuery_LloydsSAP() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_U)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * XChanging acknowledges a Lead agreement - Carrier is Lloyd's Lead
   * <p>
   * Given:
   * Lloyd's Lead ClaimNotify for an existing Claim
   * LloydsStatus is '14-PART-AUT'
   * Explanation is 'R'
   * ActionParticipant is the Lead
   * <p>
   * When:
   * Message received by the Lloyd's Lead carrier
   * <p>
   * Then
   * Respond Button should not be available.
   * <p>
   * LLOYD-A-07
   */
  function testLeadAgreement_LloydsLead() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lloydsTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_14_PART_AUT)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, _lloydsTestId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * XChanging acknowledges a Lead agreement - Carrier is Lloyd's SAP
   * <p>
   * Given:
   * Lloyd's SAP ClaimNotify for an existing Claim
   * LloydsStatus is '14-PART-AUT'
   * Explanation is 'R'
   * ActionParticipant is the Lead on the claim
   * <p>
   * When:
   * Message received by the Lloyd's Agreement Party carrier
   * <p>
   * Then
   * Respond Button should be available.
   * <p>
   * LLOYD-A-08
   */
  function testLeadAgreement_LloydsSAP() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, TC_14_PART_AUT)
    claimNotify = setExplanation(claimNotify, TC_R)
    claimNotify = setActionParticipant(claimNotify, _otherCarrierId)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_AGREE_PAY)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertTrue(respondButtonAvailable(claimNotify))
  }

  /**
   * XChanging acknowledges an SAP agreement - Carrier is Lloyd's Lead
   * <p>
   * Given:
   * Lloyd's Lead ClaimNotify for an existing Claim
   * LloydsStatus is '14-PART-AUT'
   * Explanation is 'R'
   * ActionParticipant is an SAP on the claim
   * <p>
   * When:
   * Message received by the Lloyd's Lead carrier
   * <p>
   * Then
   * Respond Button should not be available.
   * <p>
   * LLOYD-A-09
   */
  function testSAPAgreement_LloydsLead() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lloydsTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_14_PART_AUT)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, _otherCarrierId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * XChanging acknowledges an SAP agreement - Carrier is the same Lloyd's SAP
   * <p>
   * Given:
   * Lloyd's SAP ClaimNotify for an existing Claim
   * LloydsStatus is '14-PART-AUT'
   * Explanation is 'R'
   * ActionParticipant is this SAP on the claim
   * <p>
   * When:
   * Message received by the Lloyd's Agreement Party carrier
   * <p>
   * Then
   * Respond Button should be available.
   * <p>
   * LLOYD-A-10
   */
  function testSAPAgreement_LloydsSAP() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_14_PART_AUT)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, _lloydsTestId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertTrue(respondButtonAvailable(claimNotify))
  }

  /**
   * XChanging acknowledges an SAP agreement - Carrier is another Lloyd's SAP and this SAP has not yet agreed
   * <p>
   * Given:
   * Lloyd's SAP ClaimNotify for an existing Claim
   * LloydsStatus is '14-PART-AUT'
   * Explanation is 'R'
   * ActionParticipant is another SAP on the claim
   * The receiving SAP has not yet agreed
   * When:
   * Message received by the Lloyd's Agreement Party carrier
   * <p>
   * Then
   * Respond Button should be available.
   * <p>
   * LLOYD-A-11
   */
  function testAlternativeSAPAgreement_LloydsSAP() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, TC_14_PART_AUT)
    claimNotify = setExplanation(claimNotify, TC_R)
    claimNotify = setActionParticipant(claimNotify, _otherCarrierId2)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_AGREE_PAY)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertTrue(respondButtonAvailable(claimNotify))
  }

  /**
   * XChanging acknowledges an SAP agreement - Carrier is another Lloyd's SAP and this SAP has already agreed
   * <p>
   * Given:
   * Lloyd's SAP ClaimNotify for an existing Claim
   * LloydsStatus is '14-PART-AUT'
   * Explanation is 'R'
   * ActionParticipant is another SAP on the claim
   * The receiving SAP has already agreed
   * <p>
   * When:
   * Message received by the Lloyd's Agreement Party carrier
   * <p>
   * Then
   * Respond Button should not be available.
   * <p>
   * LLOYD-A-12
   */
  function testAlternativeSAPAgreement_LloydsSAP_AlreadyAgreed() {
    var claimNotifyCarrierAgreement = createClaimNotifyRqEntity()

    claimNotifyCarrierAgreement = setLead(claimNotifyCarrierAgreement, _otherCarrierId)
    claimNotifyCarrierAgreement = setSecondAgreementParty(claimNotifyCarrierAgreement, {_lloydsTestId, _otherCarrierId2})
    claimNotifyCarrierAgreement = setTransactionStatus(claimNotifyCarrierAgreement, TC_14_PART_AUT)
    claimNotifyCarrierAgreement = setExplanation(claimNotifyCarrierAgreement, TC_R)
    claimNotifyCarrierAgreement = setActionParticipant(claimNotifyCarrierAgreement, _lloydsTestId)
    claimNotifyCarrierAgreement = setResponseCode(claimNotifyCarrierAgreement, TC_AGREE_PAY)

    claimNotifyCarrierAgreement = processClaimNotifyEntity(claimNotifyCarrierAgreement)

    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, TC_14_PART_AUT)
    claimNotify = setExplanation(claimNotify, TC_R)
    claimNotify = setActionParticipant(claimNotify, _otherCarrierId2)
    claimNotify = setResponseCode(claimNotify, TC_AGREE_PAY)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * XChanging acknowledges all parties have sent agreement - Carrier is Lloyd's Lead
   * <p>
   * Given:
   * Lloyd's Lead ClaimNotify for an existing Claim
   * LloydsStatus is '15-PART-AUT'
   * Explanation is 'R
   * <p>
   * When:
   * Message received by the Lloyd's Lead carrier
   * <p>
   * Then
   * Respond Button should not be available.
   * <p>
   * LLOYD-A-13
   */
  function testAllAgreed_LloydsLead() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lloydsTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_15_PART_AUT)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * XChanging acknowledges all parties have sent agreement - Carrier is Lloyd's SAP
   * <p>
   * Given:
   * Lloyd's SAP ClaimNotify for an existing Claim
   * LloydsStatus is '15-PART-AUT'
   * Explanation is 'R'
   * <p>
   * When:
   * Message received by the Lloyd's Agreement Party carrier
   * <p>
   * Then
   * Respond Button should not be available.
   * <p>
   * LLOYD-A-14
   */
  function testAllAgreed_LloydsSAP() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_15_PART_AUT)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * E-Event - Carrier is Lloyd's Lead
   * <p>
   * Given:
   * Lloyd's Lead ClaimNotify for an existing Claim
   * Explanation is 'E'
   * <p>
   * When:
   * Message received by the Lloyd's Lead carrier
   * <p>
   * Then
   * Respond Button should not be available.
   * <p>
   * LLOYD-A-15
   */
  function testTransactionCompleted_LloydsLead() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lloydsTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_E)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Transaction is completed - Carrier is Lloyd's SAP
   * <p>
   * Given:
   * Lloyd's SAP ClaimNotify for an existing Claim
   * LloydsStatus is '40-COMPLETE'
   * Explanation is 'R'
   * <p>
   * When:
   * Message received by the Lloyd's Agreement Party carrier
   * <p>
   * Then
   * Respond Button should not be available.
   * <p>
   * LLOYD-A-16
   */
  function testTransactionCompleted_LloydsSAP() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_40_COMPLETE)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Broker starts editing transaction in ECF2 - Carrier is Lloyd's Lead
   * <p>
   * Given:
   * Lloyd's Lead ClaimNotify for an existing Claim
   * LloydsStatus is '9-MKT-CHK'
   * Explanation is 'A''
   * <p>
   * When:
   * Message received by the Lloyd's Lead carrier
   * <p>
   * Then
   * Respond Button should not be available.
   * <p>
   * LLOYD-A-17
   */
  function testBrokerEditingTransaction_LloydsLead() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lloydsTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_9_MKT_CHK)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_A)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Broker starts editing transaction in ECF2 - Carrier is Lloyd's SAP
   * <p>
   * Given:
   * Lloyd's SAP ClaimNotify for an existing Claim
   * LloydsStatus is '9-MKT-CHK'
   * Explanation is 'A'
   * <p>
   * When:
   * Message received by the Lloyd's Agreement Party carrier
   * <p>
   * Then
   * Respond Button should not be available.
   * <p>
   * LLOYD-A-18
   */
  function testBrokerEditingTransaction_LloydsSAP() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_9_MKT_CHK)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_A)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Transaction is in error - Carrier is Lloyd's Lead
   * <p>
   * Given:
   * Lloyd's Lead ClaimNotify for an existing Claim
   * LloydsStatus is '3'
   * Explanation is 'A'
   * <p>
   * When:
   * Message received by the Lloyd's Lead carrier
   * <p>
   * Then
   * Respond Button should not be available.
   * <p>
   * LLOYD-B-01
   */
  function testTransactionError_LloydsLead() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lloydsTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_3)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_A)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Transaction is in error - Carrier is Lloyd's SAP
   * <p>
   * Given:
   * Lloyd's SAP ClaimNotify for an existing Claim
   * LloydsStatus is '3'
   * Explanation is 'A'
   * <p>
   * When:
   * Message received by the Lloyd's Agreement Party carrier
   * <p>
   * Then
   * Respond Button should not be available.
   * <p>
   * LLOYD-B-02
   */
  function testTransactionError_LloydsSAP() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_3)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_A)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Awaiting update of earlier transaction - Carrier is Lloyd's Lead
   * <p>
   * Given:
   * Lloyd's Lead ClaimNotify for an existing Claim
   * LloydsStatus is '4'
   * Explanation is 'A'
   * <p>
   * When:
   * Message received by the Lloyd's Lead carrier
   * <p>
   * Then
   * Respond Button should not be available.
   * <p>
   * LLOYD-B-03
   */
  function testAwaitingUpdate_LloydsLead() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lloydsTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_4)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_A)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Awaiting update of earlier transaction - Carrier is Lloyd's SAP
   * <p>
   * Given:
   * Lloyd's SAP ClaimNotify for an existing Claim
   * LloydsStatus is '4'
   * Explanation is 'A'
   * <p>
   * <p>
   * When:
   * Message received by the Lloyd's Agreement Party carrier
   * <p>
   * Then
   * Respond Button should not be available.
   * <p>
   * LLOYD-B-04
   */
  function testAwaitingUpdate_LloydsSAP() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_4)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_A)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Broker deletes the transaction - Carrier is Lloyd's Lead
   * <p>
   * Given:
   * Lloyd's Lead ClaimNotify for an existing Claim
   * Explanation is 'D'
   * <p>
   * When:
   * Message received by the Lloyd's Lead carrier
   * <p>
   * Then
   * Respond Button should not be available.
   * <p>
   * LLOYD-B-05
   */
  function testBrokerDeletesTransaction_LloydsLead() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lloydsTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_D)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Broker deletes the transaction - Carrier is Lloyd's SAP
   * <p>
   * Given:
   * Lloyd's SAP ClaimNotify for an existing Claim
   * Explanation is 'D'
   * <p>
   * When:
   * Message received by the Lloyd's Agreement Party carrier
   * <p>
   * Then
   * Respond Button should not be available.
   * <p>
   * LLOYD-B-06
   */
  function testBrokerDeletesTransaction_LloydsSAP() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId, _otherCarrierId2})
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_D)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Claim goes into VCS - Carrier is Lloyd's Lead
   * <p>
   * Given:
   * Lloyd's Lead ClaimNotify for an existing Claim
   * LloydsStatus is '10-AWAITING/QUERIED'
   * Explanation is 'U'
   * ResponseCode is 'VCS-ENTRY'
   * TriageCategory is 'VCS-Crawford'
   * <p>
   * When:
   * Message received by the Lloyd's Lead carrier
   * <p>
   * Then
   * Respond Button should not be available.
   * <p>
   * LLOYD-B-07
   */
  function testEnteringVCS_LloydsLead() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lloydsTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_U)
    claimNotify = setActionParticipant(claimNotify, _brokerId)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_VCS_ENTRY)
    claimNotify = setTriageCategory(claimNotify, ECFTriageCode_Ext.TC_VCS_CRAWFORD)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Claim goes into VCS - Carrier is Lloyd's SAP
   * <p>
   * Given:
   * Lloyd's SAP ClaimNotify for an existing Claim
   * LloydsStatus is '10-AWAITING/QUERIED'
   * Explanation is 'U'
   * ResponseCode is 'VCS-ENTRY'
   * TriageCategory is 'VCS-Crawford'
   * <p>
   * When:
   * Message received by the Lloyd's Agreement Party carrier
   * <p>
   * Then
   * Respond Button should not be available.
   * <p>
   * LLOYD-B-08
   */
  function testEnteringVCS_LloydsSAP() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_U)
    claimNotify = setActionParticipant(claimNotify, _brokerId)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_VCS_ENTRY)
    claimNotify = setTriageCategory(claimNotify, ECFTriageCode_Ext.TC_VCS_CRAWFORD)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Claim is currently in VCS - Carrier is Lloyd's Lead
   * <p>
   * Given:
   * Lloyd's Lead ClaimNotify for an existing Claim
   * LloydsStatus is '10-AWAITING/QUERIED'
   * Explanation is 'U'
   * <p>
   * When:
   * Message received by the Lloyd's Lead carrier
   * <p>
   * Then
   * Respond Button should not be available.
   * <p>
   * LLOYD-B-09
   */
  function testClaimInVCS_LloydsLead() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lloydsTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_U)
    claimNotify = setActionParticipant(claimNotify, _brokerId)
    claimNotify = setVCSIndicatorOnClaim(claimNotify, true)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Claim goes into VCS - Carrier is Lloyd's SAP
   * <p>
   * Given:
   * Lloyd's SAP ClaimNotify for an existing Claim
   * LloydsStatus is '10-AWAITING/QUERIED'
   * Explanation is 'U'
   * <p>
   * When:
   * Message received by the Lloyd's Agreement Party carrier
   * <p>
   * Then
   * Respond Button should not be available.
   * <p>
   * LLOYD-B-10
   */
  function testClaimInVCS_LloydsSAP() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_U)
    claimNotify = setActionParticipant(claimNotify, _brokerId)
    claimNotify = setVCSIndicatorOnClaim(claimNotify, true)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Claim comes out of Crawford VCS - Carrier is Lloyd's Lead
   * <p>
   * Given:
   * Lloyd's Lead ClaimNotify for an existing Claim
   * LloydsStatus is '10-AWAITING/QUERIED'
   * Explanation is 'U'
   * ResponseCode is 'VCS-EXIT-CFORD'
   * <p>
   * When:
   * Message received by the Lloyd's Lead carrier
   * <p>
   * Then
   * Respond Button should be available.
   * <p>
   * LLOYD-B-11
   */
  function testExitCrawfordVCS_LloydsLead() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lloydsTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_U)
    claimNotify = setActionParticipant(claimNotify, _brokerId)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_VCS_EXIT_CFORD)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertTrue(respondButtonAvailable(claimNotify))
  }

  /**
   * Claim comes out of Crawford VCS - Carrier is Lloyd's SAP
   * <p>
   * Given:
   * Lloyd's SAP ClaimNotify for an existing Claim
   * LloydsStatus is '10-AWAITING/QUERIED'
   * Explanation is 'U'
   * ResponseCode is 'VCS-EXIT-CFORD'
   * <p>
   * When:
   * Message received by the Lloyd's Agreement Party carrier
   * <p>
   * Then
   * Respond Button should not be available.
   * <p>
   * LLOYD-B-12
   */
  function testExitCrawfordVCS_LloydsSAP() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_U)
    claimNotify = setActionParticipant(claimNotify, _brokerId)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_VCS_EXIT_CFORD)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Claim comes out of XCS VCS - Carrier is Lloyd's Lead
   * <p>
   * Given:
   * Claim comes out of XCS VCS - Carrier is Lloyd's Lead
   * <p>
   * When:
   * Lloyd's Lead ClaimNotify for an existing Claim
   * LloydsStatus is '10-AWAITING/QUERIED'
   * Explanation is 'U'
   * ResponseCode is 'VCS-EXIT-XCS'
   * <p>
   * Then
   * Respond Button should be available.
   * <p>
   * LLOYD-B-13
   */
  function testExitXCSVCS_LloydsLead() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lloydsTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_U)
    claimNotify = setActionParticipant(claimNotify, _brokerId)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_VCS_EXIT_XCS)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertTrue(respondButtonAvailable(claimNotify))
  }

  /**
   * Claim comes out of XCS VCS - Carrier is Lloyd's SAP
   * <p>
   * Given:
   * Lloyd's SAP ClaimNotify for an existing Claim
   * LloydsStatus is '10-AWAITING/QUERIED'
   * Explanation is 'U'
   * ResponseCode is 'VCS-EXIT-XCS'
   * <p>
   * When:
   * Message received by the Lloyd's Agreement Party carrier
   * <p>
   * Then
   * Respond Button should be disabled.
   * <p>
   * LLOYD-B-14
   */
  function testExitXCSVCS_LloydsSAP() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_U)
    claimNotify = setActionParticipant(claimNotify, _brokerId)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_VCS_EXIT_XCS)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }


  /**
   * E-Event - Carrier is Lloyd's Lead
   * <p>
   * Given:
   * Lloyd's Lead ClaimNotify for an existing Claim
   * Explanation is 'E'
   * <p>
   * When:
   * Message received by the Lloyd's Lead carrier
   * <p>
   * Then
   * Respond Button should not be available.
   * <p>
   * LLOYD-B-15
   */
  function testEEvent_LloydsLead() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lloydsTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_E)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * E-Event - Carrier is Lloyd's SAP
   * <p>
   * Given:
   * Lloyd's SAP ClaimNotify for an existing Claim
   * Explanation is 'E'
   * <p>
   * When:
   * Message received by the Lloyd's Agreement Party carrier
   * <p>
   * Then
   * Respond Button should not be available.
   * <p>
   * LLOYD-B-16
   */
  function testEEvent_LloydsSAP() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId, _otherCarrierId2})
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_E)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Fully Authorised Lloyds advising transaction
   * Awaiting processing by Xchanging technician
   * Carrier is Lloyd's Lead
   * <p>
   * Given:
   * Lloyd's Lead ClaimNotify for an existing Claim
   * LloydsStatus is '31-ADV BDWN'
   * Explanation is 'U'
   * <p>
   * When:
   * Message received by the Lloyd's Lead carrier
   * <p>
   * Then
   * Respond Button should not be available.
   * <p>
   * LLOYD-B-17
   */
  function testAdvisingTransactionAwaitingTechnician_LloydsLead() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lloydsTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_31_ADV_BDWN)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_U)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Fully Authorised Lloyds advising transaction
   * Awaiting processing by Xchanging technician
   * Carrier is Lloyd's SAP
   * <p>
   * Given:
   * Lloyd's SAP ClaimNotify for an existing Claim
   * LloydsStatus is '31-ADV BDWN'
   * Explanation is 'U'
   * <p>
   * When:
   * Message received by the Lloyd's Agreement Party carrier
   * <p>
   * Then
   * Respond Button should not be available.
   * <p>
   * LLOYD-B-18
   */
  function testAdvisingTransactionAwaitingTechnician_LloydsSAP() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_31_ADV_BDWN)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_U)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Fully Authorised Lloyds settlement transaction
   * Awaiting processing by Xchanging technician
   * Carrier is Lloyd's Lead
   * <p>
   * Given:
   * Lloyd's Lead ClaimNotify for an existing Claim
   * LloydsStatus is '32-SET BDWN'
   * Explanation is 'U'
   * <p>
   * When:
   * Message received by the Lloyd's Lead carrier
   * <p>
   * Then
   * Respond Button should not be available.
   * <p>
   * LLOYD-B-19
   */
  function testSettlementTransactionAwaitingTechnician_LloydsLead() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lloydsTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_32_SET_BDWN)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_U)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Fully Authorised Lloyds settlement transaction
   * Awaiting processing by Xchanging technician
   * Carrier is Lloyd's SAP
   * Given:
   * Lloyd's Lead ClaimNotify for an existing Claim
   * LloydsStatus is '32-SET BDWN'
   * Explanation is 'U'
   * <p>
   * When:
   * Message received by the Lloyd's Agreement Party carrier
   * <p>
   * Then
   * Respond Button should not be available.
   * <p>
   * LLOYD-B-20
   */
  function testSettlementTransactionAwaitingTechnician_LloydsSAP() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_32_SET_BDWN)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_U)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Fully Authorised – Breakdown Incomplete
   * Awaiting processing by Xchanging technician
   * Carrier is Lloyd's Lead
   * Given:
   * Lloyd's Lead ClaimNotify for an existing Claim
   * LloydsStatus is '33-PROCESS'
   * Explanation is 'U
   * <p>
   * When:
   * Message received by the Lloyd's Lead carrier
   * <p>
   * Then
   * Respond Button should not be available.
   * <p>
   * LLOYD-B-21
   */
  function testBreakdownIncompleteAwaitingTechnician_LloydsLead() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lloydsTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_33_PROCESS)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_U)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Fully Authorised – Breakdown Incomplete
   * Awaiting processing by Xchanging technician
   * Carrier is Lloyd's SAP
   * Given:
   * <p>
   * Lloyd's Lead ClaimNotify for an existing Claim
   * LloydsStatus is '33-PROCESS'
   * Explanation is 'U'
   * <p>
   * When
   * Message received by the Lloyd's Agreement Party carrier.
   * <p>
   * Then
   * Respond Button should not be available.
   * <p>
   * LLOYD-B-22
   */
  function testBreakdownIncompleteAwaitingTechnician_LloydsSAP() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_33_PROCESS)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_U)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Fully Authorised – Breakdown Complete
   * Awaiting processing by Xchanging technician
   * Carrier is Lloyd's Lead
   * Given:
   * Lloyd's Lead ClaimNotify for an existing Claim
   * LloydsStatus is '36-RELEASED'
   * Explanation is 'U'
   * <p>
   * When:
   * Message received by the Lloyd's Lead carrier
   * <p>
   * Then
   * Respond Button should not be available.
   * <p>
   * LLOYD-B-23
   */
  function testBreakdownCompleteAwaitingTechnician_LloydsLead() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _lloydsTestId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_36_RELEASED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_U)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  /**
   * Fully Authorised – Breakdown Complete
   * Awaiting processing by Xchanging technician
   * Carrier is Lloyd's SAP
   * Given:
   * Lloyd's SAP ClaimNotify for an existing Claim
   * LloydsStatus is '36-RELEASED'
   * Explanation is 'U'
   * <p>
   * When:
   * Message received by the Lloyd's Agreement Party carrier
   * <p>
   * Then
   * Respond Button should not be available.
   * <p>
   * LLOYD-B-23
   */
  function testBreakdownCompleteAwaitingTechnician_LloydsSAP() {
    var claimNotify = createClaimNotifyRqEntity()

    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_36_RELEASED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_U)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    claimNotify = processClaimNotifyEntity(claimNotify)

    assertFalse(respondButtonAvailable(claimNotify))
  }

  private function setVCSIndicatorOnClaim(claimNotifyEntity : ECFMessageClaimNotifyRq_Ext, vcsIndicator : boolean) : ECFMessageClaimNotifyRq_Ext{
    var claim = ClaimBuilderHelper.createClaim(true)

    gw.transaction.Transaction.runWithNewBundle(\ bundle -> {
      claim = bundle.add(claim)
      claimNotifyEntity = bundle.add(claimNotifyEntity)

      claim.VCSIndicator_Ext = vcsIndicator
      claim.UMR_Ext = claimNotifyEntity.UMR
      claim.UCR_Ext = claimNotifyEntity.UCR

      claimNotifyEntity.Claim = claim
    }, User.util.UnrestrictedUser)
    return claimNotifyEntity
  }

  private function setTriageCategory(claimNotifyEntity : ECFMessageClaimNotifyRq_Ext, triageCategory : ECFTriageCode_Ext) : ECFMessageClaimNotifyRq_Ext{
    gw.transaction.Transaction.runWithNewBundle(\ bundle -> {
      claimNotifyEntity = bundle.add(claimNotifyEntity)
      claimNotifyEntity.TriageCategory = triageCategory
    }, User.util.UnrestrictedUser)
    return claimNotifyEntity
  }

  private function setSecondAgreementParty(claimNotifyEntity: ECFMessageClaimNotifyRq_Ext, sapMap: HashMap<String, typekey.ECFBureauType_Ext>): ECFMessageClaimNotifyRq_Ext {
    var secondAgreementParties = claimNotifyEntity.ECFContractMarkets.where(\elt -> elt.ParticipantFunction == ECFParticipantFunction_Ext.TC_AGREEMENTPARTY)
    var secondAgreementPartyParticipant1 = secondAgreementParties[0]
    var secondAgreementPartyParticipant2 = secondAgreementParties[1]

    var sapArray = sapMap.keySet().toList().toTypedArray()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotifyEntity = bundle.add(claimNotifyEntity)
      secondAgreementPartyParticipant1 = bundle.add(secondAgreementPartyParticipant1)
      secondAgreementPartyParticipant2 = bundle.add(secondAgreementPartyParticipant2)

      secondAgreementPartyParticipant1.PartyID = sapArray[0]
      secondAgreementPartyParticipant1.Bureau = sapMap.get(sapArray[0])

      secondAgreementPartyParticipant2.PartyID = sapArray[1]
      secondAgreementPartyParticipant2.Bureau = sapMap.get(sapArray[0])
    }, User.util.UnrestrictedUser)

    return claimNotifyEntity
  }

  private function createClaimNotifyRqEntity(): ECFMessageClaimNotifyRq_Ext {
    var xmlElement = ECFMessageUtil.createNewXmlMessage(_lloydsClaimNotifyFile)
    var claimNotifyXml =  ClaimNotifyEventRq.parse(xmlElement.asUTFString())
    claimNotifyXml.UCR = _testUCR
    claimNotifyXml.ClaimMovement.Insurer.Party.Id_elem?.first()?.Value = _lloydsTestId
    var claimNotifyEntity = new EntityMapperService().createEntity(claimNotifyXml) as ECFMessageClaimNotifyRq_Ext
    return claimNotifyEntity
  }
}