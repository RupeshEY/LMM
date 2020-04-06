package gw.acc.iplm.respondrules.ilu

/**
 * The test IDs in this class are derived from a BDD set of cases found here:
 * https://confluence.guidewire.com/display/ACC/US9362+-+ClaimNotify+Response+Button+Conditions
 */
class IluRespondButtonAvailabilityTest extends IluRespondRuleTester {

  /**
   * Broker releases new transaction - Carrier is ILU Lead
   * <p>
   * ILU-A-01
   */
  public function testNewTransaction_ILULead() {
    var claimNoitfy = createClaimNotifyRqEntity()
    claimNoitfy = setTransactionStatus(claimNoitfy, TC_10_AWAITING_QUERIED)
    claimNoitfy = setExplanation(claimNoitfy, TC_A)
    claimNoitfy = setActionParticipant(claimNoitfy, _brokerId)
    claimNoitfy = setLead(claimNoitfy, _iluTestId)
    claimNoitfy = setSecondAgreementParty(claimNoitfy, _otherCarrierId)
    claimNoitfy = processClaimNotifyEntity(claimNoitfy)
    assertTrue(respondButtonAvailable(claimNoitfy))
  }

  /**
   * Broker releases new transaction - Carrier is ILU SAP
   * <p>
   * ILU-A-02
   */
  public function testNewTransaction_ILUSAP() {
    var claimNoitfy = createClaimNotifyRqEntity()
    claimNoitfy = setTransactionStatus(claimNoitfy, TC_10_AWAITING_QUERIED)
    claimNoitfy = setExplanation(claimNoitfy, TC_A)
    claimNoitfy = setActionParticipant(claimNoitfy, _brokerId)
    claimNoitfy = setLead(claimNoitfy, _iluLeadId)
    claimNoitfy = setSecondAgreementParty(claimNoitfy, _iluTestId)
    claimNoitfy = processClaimNotifyEntity(claimNoitfy)
    assertFalse(respondButtonAvailable(claimNoitfy))
  }

  /**
   * Broker updates a transaction - Carrier is ILU Lead
   * <p>
   * ILU-A-03
   */
  public function testUpdatedTransaction_ILULead() {
    var claimNoitfy = createClaimNotifyRqEntity()
    claimNoitfy = setTransactionStatus(claimNoitfy, TC_10_AWAITING_QUERIED)
    claimNoitfy = setExplanation(claimNoitfy, TC_U)
    claimNoitfy = setActionParticipant(claimNoitfy, _brokerId)
    claimNoitfy = setLead(claimNoitfy, _iluTestId)
    claimNoitfy = setSecondAgreementParty(claimNoitfy, _iluSAPId)
    claimNoitfy = processClaimNotifyEntity(claimNoitfy)
    assertTrue(respondButtonAvailable(claimNoitfy))
  }

  /**
   * Broker updates a transaction - Carrier is ILU SAP
   * <p>
   * ILU-A-04
   */
  public function testUpdatedTransaction_ILUSAP() {
    var claimNoitfy = createClaimNotifyRqEntity()
    claimNoitfy = setTransactionStatus(claimNoitfy, TC_10_AWAITING_QUERIED)
    claimNoitfy = setExplanation(claimNoitfy, TC_U)
    claimNoitfy = setActionParticipant(claimNoitfy, _brokerId)
    claimNoitfy = setLead(claimNoitfy, _iluLeadId)
    claimNoitfy = setSecondAgreementParty(claimNoitfy, _iluTestId)
    claimNoitfy = processClaimNotifyEntity(claimNoitfy)
    assertFalse(respondButtonAvailable(claimNoitfy))
  }

  /**
   * XChanging acknowledges Claim is Pending - Carrier is ILU Lead
   * <p>
   * ILU-A-05
   */
  public function testClaimIsPending_ILULead() {
    var claimNoitfy = createClaimNotifyRqEntity()
    claimNoitfy = setTransactionStatus(claimNoitfy, TC_12_PENDED_REJECTED)
    claimNoitfy = setExplanation(claimNoitfy, TC_R)
    claimNoitfy = setResponseCode(claimNoitfy, TC_PEN)
    claimNoitfy = setActionParticipant(claimNoitfy, _iluTestId)
    claimNoitfy = setLead(claimNoitfy, _iluTestId)
    claimNoitfy = setSecondAgreementParty(claimNoitfy, _iluSAPId)
    claimNoitfy = processClaimNotifyEntity(claimNoitfy)
    assertTrue(respondButtonAvailable(claimNoitfy))
  }

  /**
   * XChanging acknowledges Claim is Pending - Carrier is ILU SAP
   * <p>
   * ILU-A-06
   */
  public function testClaimIsPending_ILUSAP() {
    var claimNoitfy = createClaimNotifyRqEntity()
    claimNoitfy = setTransactionStatus(claimNoitfy, TC_12_PENDED_REJECTED)
    claimNoitfy = setExplanation(claimNoitfy, TC_R)
    claimNoitfy = setResponseCode(claimNoitfy, TC_PEN)
    claimNoitfy = setActionParticipant(claimNoitfy, _iluLeadId)
    claimNoitfy = setLead(claimNoitfy, _iluLeadId)
    claimNoitfy = setSecondAgreementParty(claimNoitfy, _iluTestId)
    claimNoitfy = processClaimNotifyEntity(claimNoitfy)
    assertFalse(respondButtonAvailable(claimNoitfy))
  }

  /**
   * XChanging acknowledges an agreement From Lead - Carrier is ILU Lead
   * <p>
   * ILU-A-07
   */
  public function testClaimIsAgreedByLead_ILULead() {
    var claimNoitfy = createClaimNotifyRqEntity()
    claimNoitfy = setTransactionStatus(claimNoitfy, TC_15_PART_AUT)
    claimNoitfy = setExplanation(claimNoitfy, TC_R)
    claimNoitfy = setResponseCode(claimNoitfy, ECFResponseCode_Ext.TC_AUT)
    claimNoitfy = setActionParticipant(claimNoitfy, _iluTestId)
    claimNoitfy = setLead(claimNoitfy, _iluTestId)
    claimNoitfy = setSecondAgreementParty(claimNoitfy, _iluSAPId)
    claimNoitfy = processClaimNotifyEntity(claimNoitfy)
    assertFalse(respondButtonAvailable(claimNoitfy))
  }

  /**
   * XChanging acknowledges an agreement From Lead - Carrier is ILU SAP
   * <p>
   * ILU-A-07-2
   */
  public function testClaimIsAgreedByLead_ILUSAP() {
    var claimNoitfy = createClaimNotifyRqEntity()
    claimNoitfy = setTransactionStatus(claimNoitfy, TC_15_PART_AUT)
    claimNoitfy = setExplanation(claimNoitfy, TC_R)
    claimNoitfy = setResponseCode(claimNoitfy, ECFResponseCode_Ext.TC_AUT)
    claimNoitfy = setActionParticipant(claimNoitfy, _iluLeadId)
    claimNoitfy = setLead(claimNoitfy, _iluLeadId)
    claimNoitfy = setSecondAgreementParty(claimNoitfy, _iluTestId)
    claimNoitfy = processClaimNotifyEntity(claimNoitfy)
    assertTrue(respondButtonAvailable(claimNoitfy))
  }

  /**
   * XChanging acknowledges an agreement from another SAP - Carrier is ILU SAP who has not yet agreed
   * <p>
   * ILU-A-08
   */
  public function testClaimIsAgreedByOtherSAP_ILUSAP() {
    var claimNoitfy = createClaimNotifyRqEntity()
    claimNoitfy = setTransactionStatus(claimNoitfy, TC_15_PART_AUT)
    claimNoitfy = setExplanation(claimNoitfy, TC_R)
    claimNoitfy = setResponseCode(claimNoitfy, ECFResponseCode_Ext.TC_AUT)
    claimNoitfy = setActionParticipant(claimNoitfy, _otherCarrierId)
    claimNoitfy = setLead(claimNoitfy, _iluLeadId)
    claimNoitfy = setSecondAgreementParty(claimNoitfy, {_otherCarrierId, _iluTestId})
    claimNoitfy = processClaimNotifyEntity(claimNoitfy)
    assertTrue(respondButtonAvailable(claimNoitfy))
  }

  /**
   * XChanging acknowledges an agreement from another SAP - Carrier is ILU Lead
   * <p>
   * ILU-A-08-2
   */
  public function testClaimIsAgreedByOtherSAP_ILULead() {
    var claimNoitfy = createClaimNotifyRqEntity()
    claimNoitfy = setTransactionStatus(claimNoitfy, TC_15_PART_AUT)
    claimNoitfy = setExplanation(claimNoitfy, TC_R)
    claimNoitfy = setResponseCode(claimNoitfy, ECFResponseCode_Ext.TC_AUT)
    claimNoitfy = setActionParticipant(claimNoitfy, _otherCarrierId)
    claimNoitfy = setLead(claimNoitfy, _iluTestId)
    claimNoitfy = setSecondAgreementParty(claimNoitfy, {_otherCarrierId, _iluSAPId})
    claimNoitfy = processClaimNotifyEntity(claimNoitfy)
    assertFalse(respondButtonAvailable(claimNoitfy))
  }

  /**
   * XChanging acknowledges an agreement - Carrier is ILU SAP who has already agreed
   * <p>
   * ILU-A-09
   */
  public function testClaimIsAgreedAndSAPHasAlreadyAgreed_ILUSAP() {
    // Message where SAP agrees
    var claimNoitfySAPAgrees = createClaimNotifyRqEntity()
    claimNoitfySAPAgrees = setTransactionStatus(claimNoitfySAPAgrees, TC_15_PART_AUT)
    claimNoitfySAPAgrees = setExplanation(claimNoitfySAPAgrees, TC_R)
    claimNoitfySAPAgrees = setResponseCode(claimNoitfySAPAgrees, ECFResponseCode_Ext.TC_AUT)
    claimNoitfySAPAgrees = setActionParticipant(claimNoitfySAPAgrees, _iluTestId)
    claimNoitfySAPAgrees = setLead(claimNoitfySAPAgrees, _iluLeadId)
    claimNoitfySAPAgrees = setSecondAgreementParty(claimNoitfySAPAgrees, {_otherCarrierId, _iluTestId})
    claimNoitfySAPAgrees = processClaimNotifyEntity(claimNoitfySAPAgrees)
    assertFalse(respondButtonAvailable(claimNoitfySAPAgrees))

    // Another message where some other SAP agrees
    var claimNoitfy = createClaimNotifyRqEntity()
    claimNoitfy = setTransactionStatus(claimNoitfy, TC_15_PART_AUT)
    claimNoitfy = setExplanation(claimNoitfy, TC_R)
    claimNoitfy = setResponseCode(claimNoitfySAPAgrees, ECFResponseCode_Ext.TC_AUT)
    claimNoitfy = setActionParticipant(claimNoitfy, _otherCarrierId)
    claimNoitfy = setLead(claimNoitfy, _iluLeadId)
    claimNoitfy = setSecondAgreementParty(claimNoitfy, {_otherCarrierId, _iluTestId})
    claimNoitfy = processClaimNotifyEntity(claimNoitfy)
    assertFalse(respondButtonAvailable(claimNoitfy))
  }

  /**
   * XChanging acknowledges all SAP have agreed - Carrier is ILU Lead
   * <p>
   * ILU-A-10
   */
  public function testAllPartiesHaveAgreed_ILULead() {
    var claimNoitfy = createClaimNotifyRqEntity()
    claimNoitfy = setTransactionStatus(claimNoitfy, TC_30_AUTHORSD)
    claimNoitfy = setExplanation(claimNoitfy, TC_R)
    claimNoitfy = setResponseCode(claimNoitfy, ECFResponseCode_Ext.TC_AUT)
    claimNoitfy = setActionParticipant(claimNoitfy, _otherCarrierId)
    claimNoitfy = setLead(claimNoitfy, _iluTestId)
    claimNoitfy = setSecondAgreementParty(claimNoitfy, {_otherCarrierId,_iluSAPId})
    claimNoitfy = processClaimNotifyEntity(claimNoitfy)
    assertFalse(respondButtonAvailable(claimNoitfy))
  }

  /**
   * XChanging acknowledges all SAP have agreed - Carrier is ILU SAP
   * <p>
   * ILU-A-11
   */
  public function testAllPartiesHaveAgreed_ILUSAP() {
    var claimNoitfy = createClaimNotifyRqEntity()
    claimNoitfy = setTransactionStatus(claimNoitfy, TC_30_AUTHORSD)
    claimNoitfy = setExplanation(claimNoitfy, TC_R)
    claimNoitfy = setResponseCode(claimNoitfy, ECFResponseCode_Ext.TC_AUT)
    claimNoitfy = setActionParticipant(claimNoitfy, _otherCarrierId)
    claimNoitfy = setLead(claimNoitfy, _iluLeadId)
    claimNoitfy = setSecondAgreementParty(claimNoitfy, {_otherCarrierId,_iluTestId})
    claimNoitfy = processClaimNotifyEntity(claimNoitfy)
    assertFalse(respondButtonAvailable(claimNoitfy))
  }

  /**
   * XChanging acknowledges Claim as Signed - Carrier is ILU Lead
   * <p>
   * ILU-A-12
   */
  public function testClaimIsSigned_ILULead() {
    var claimNoitfy = createClaimNotifyRqEntity()
    claimNoitfy = setTransactionStatus(claimNoitfy, TC_40_COMPLETE)
    claimNoitfy = setExplanation(claimNoitfy, TC_U)
    claimNoitfy = setActionParticipant(claimNoitfy, _systemId)
    claimNoitfy = setLead(claimNoitfy, _iluTestId)
    claimNoitfy = setSecondAgreementParty(claimNoitfy, _iluSAPId)
    claimNoitfy = processClaimNotifyEntity(claimNoitfy)
    assertFalse(respondButtonAvailable(claimNoitfy))
  }

  /**
   * XChanging acknowledges Claim as Signed - Carrier is ILU SAP
   * <p>
   * ILU-A-13
   */
  public function testClaimIsSigned_ILUSAP() {
    var claimNoitfy = createClaimNotifyRqEntity()
    claimNoitfy = setTransactionStatus(claimNoitfy, TC_40_COMPLETE)
    claimNoitfy = setExplanation(claimNoitfy, TC_U)
    claimNoitfy = setActionParticipant(claimNoitfy, _systemId)
    claimNoitfy = setLead(claimNoitfy, _iluLeadId)
    claimNoitfy = setSecondAgreementParty(claimNoitfy, _iluTestId)
    claimNoitfy = processClaimNotifyEntity(claimNoitfy)
    assertFalse(respondButtonAvailable(claimNoitfy))
  }

  /**
   * Transaction is in error  - Carrier is ILU Lead
   * <p>
   * ILU-B-01
   */
  public function testTransactionInError_ILULead() {
    var claimNoitfy = createClaimNotifyRqEntity()
    claimNoitfy = setTransactionStatus(claimNoitfy, TC_3)
    claimNoitfy = setExplanation(claimNoitfy, TC_U)
    claimNoitfy = setActionParticipant(claimNoitfy, _brokerId)
    claimNoitfy = setLead(claimNoitfy, _iluTestId)
    claimNoitfy = setSecondAgreementParty(claimNoitfy, _iluSAPId)
    claimNoitfy = processClaimNotifyEntity(claimNoitfy)
    assertFalse(respondButtonAvailable(claimNoitfy))
  }

  /**
   * Transaction is in error  - Carrier is ILU SAP
   * <p>
   * ILU-B-02
   */
  public function testTransactionInError_ILUSAP() {
    var claimNoitfy = createClaimNotifyRqEntity()
    claimNoitfy = setTransactionStatus(claimNoitfy, TC_3)
    claimNoitfy = setExplanation(claimNoitfy, TC_U)
    claimNoitfy = setActionParticipant(claimNoitfy, _brokerId)
    claimNoitfy = setLead(claimNoitfy, _iluLeadId)
    claimNoitfy = setSecondAgreementParty(claimNoitfy, _iluTestId)
    claimNoitfy = processClaimNotifyEntity(claimNoitfy)
    assertFalse(respondButtonAvailable(claimNoitfy))
  }

  /**
   * Awaiting update of earlier transaction  - Carrier is ILU Lead
   * <p>
   * ILU-B-03
   */
  public function testTransactionInWaiting_ILULead() {
    var claimNoitfy = createClaimNotifyRqEntity()
    claimNoitfy = setTransactionStatus(claimNoitfy, TC_4)
    claimNoitfy = setExplanation(claimNoitfy, TC_U)
    claimNoitfy = setActionParticipant(claimNoitfy, _brokerId)
    claimNoitfy = setLead(claimNoitfy, _iluTestId)
    claimNoitfy = setSecondAgreementParty(claimNoitfy, _iluSAPId)
    claimNoitfy = processClaimNotifyEntity(claimNoitfy)
    assertFalse(respondButtonAvailable(claimNoitfy))
  }

  /**
   * Awaiting update of earlier transaction  - Carrier is ILU SAP
   * <p>
   * ILU-B-04
   */
  public function testTransactionInWaiting_ILUSAP() {
    var claimNoitfy = createClaimNotifyRqEntity()
    claimNoitfy = setTransactionStatus(claimNoitfy, TC_4)
    claimNoitfy = setExplanation(claimNoitfy, TC_U)
    claimNoitfy = setActionParticipant(claimNoitfy, _brokerId)
    claimNoitfy = setLead(claimNoitfy, _iluLeadId)
    claimNoitfy = setSecondAgreementParty(claimNoitfy, _iluTestId)
    claimNoitfy = processClaimNotifyEntity(claimNoitfy)
    assertFalse(respondButtonAvailable(claimNoitfy))
  }

  /**
   * Broker deletes the transaction - Carrier is ILU Lead
   * <p>
   * ILU-B-05
   */
  public function testTransactionDeleted_ILULead() {
    var claimNoitfy = createClaimNotifyRqEntity()
    claimNoitfy = setTransactionStatus(claimNoitfy, TC_10_AWAITING_QUERIED)
    claimNoitfy = setExplanation(claimNoitfy, TC_D)
    claimNoitfy = setActionParticipant(claimNoitfy, _brokerId)
    claimNoitfy = setLead(claimNoitfy, _iluTestId)
    claimNoitfy = setSecondAgreementParty(claimNoitfy, _iluSAPId)
    claimNoitfy = processClaimNotifyEntity(claimNoitfy)
    assertFalse(respondButtonAvailable(claimNoitfy))
  }

  /**
   * Broker deletes the transaction - Carrier is ILU SAP
   * <p>
   * ILU-B-06
   */
  public function testTransactionDeleted_ILUSAP() {
    var claimNoitfy = createClaimNotifyRqEntity()
    claimNoitfy = setTransactionStatus(claimNoitfy, TC_10_AWAITING_QUERIED)
    claimNoitfy = setExplanation(claimNoitfy, TC_D)
    claimNoitfy = setActionParticipant(claimNoitfy, _brokerId)
    claimNoitfy = setLead(claimNoitfy, _iluLeadId)
    claimNoitfy = setSecondAgreementParty(claimNoitfy, _iluTestId)
    claimNoitfy = processClaimNotifyEntity(claimNoitfy)
    assertFalse(respondButtonAvailable(claimNoitfy))
  }

  /**
   * Claim is put into pending awaiting reinstatement - Carrier is ILU Lead
   * <p>
   * ILU-B-07
   */
  public function testTransactionIsPendingReinstatement_ILULead() {
    var claimNoitfy = createClaimNotifyRqEntity()
    claimNoitfy = setTransactionStatus(claimNoitfy, TC_24_RIP_REQD)
    claimNoitfy = setExplanation(claimNoitfy, TC_U)
    claimNoitfy = setActionParticipant(claimNoitfy, _brokerId)
    claimNoitfy = setLead(claimNoitfy, _iluTestId)
    claimNoitfy = setSecondAgreementParty(claimNoitfy, _iluSAPId)
    claimNoitfy = processClaimNotifyEntity(claimNoitfy)
    assertFalse(respondButtonAvailable(claimNoitfy))
  }

  /**
   * Claim is put into pending awaiting reinstatement - Carrier is ILU SAP
   * <p>
   * ILU-B-08
   */
  public function testTransactionIsPendingReinstatemen_ILUSAP() {
    var claimNoitfy = createClaimNotifyRqEntity()
    claimNoitfy = setTransactionStatus(claimNoitfy, TC_24_RIP_REQD)
    claimNoitfy = setExplanation(claimNoitfy, TC_U)
    claimNoitfy = setActionParticipant(claimNoitfy, _brokerId)
    claimNoitfy = setLead(claimNoitfy, _iluLeadId)
    claimNoitfy = setSecondAgreementParty(claimNoitfy, _iluTestId)
    claimNoitfy = processClaimNotifyEntity(claimNoitfy)
    assertFalse(respondButtonAvailable(claimNoitfy))
  }

  /**
   * Claim is put into pending awaiting reinstatement on prev transaction - Carrier is ILU Lead
   * <p>
   * ILU-B-09
   */
  public function testTransactionIsPendingPrevReinstatement_ILULead() {
    var claimNoitfy = createClaimNotifyRqEntity()
    claimNoitfy = setTransactionStatus(claimNoitfy, TC_25_RIP_PREV)
    claimNoitfy = setExplanation(claimNoitfy, TC_U)
    claimNoitfy = setActionParticipant(claimNoitfy, _brokerId)
    claimNoitfy = setLead(claimNoitfy, _iluTestId)
    claimNoitfy = setSecondAgreementParty(claimNoitfy, _iluSAPId)
    claimNoitfy = processClaimNotifyEntity(claimNoitfy)
    assertFalse(respondButtonAvailable(claimNoitfy))
  }

  /**
   * Claim is put into pending awaiting reinstatement on prev transaction - Carrier is ILU SAP
   * <p>
   * ILU-B-10
   */
  public function testTransactionIsPendingPrevReinstatemen_ILUSAP() {
    var claimNoitfy = createClaimNotifyRqEntity()
    claimNoitfy = setTransactionStatus(claimNoitfy, TC_25_RIP_PREV)
    claimNoitfy = setExplanation(claimNoitfy, TC_U)
    claimNoitfy = setActionParticipant(claimNoitfy, _brokerId)
    claimNoitfy = setLead(claimNoitfy, _iluLeadId)
    claimNoitfy = setSecondAgreementParty(claimNoitfy, _iluTestId)
    claimNoitfy = processClaimNotifyEntity(claimNoitfy)
    assertFalse(respondButtonAvailable(claimNoitfy))
  }

  public function testTransactionIsPurged_ILUSAP() {
    var claimNoitfy = createClaimNotifyRqEntity()
    claimNoitfy = setTransactionStatus(claimNoitfy, ECFTransactionStatus_Ext.TC_8_PURGED)
    claimNoitfy = setExplanation(claimNoitfy, TC_U)
    claimNoitfy = setActionParticipant(claimNoitfy, _brokerId)
    claimNoitfy = setLead(claimNoitfy, _iluLeadId)
    claimNoitfy = setSecondAgreementParty(claimNoitfy, _iluTestId)
    claimNoitfy = processClaimNotifyEntity(claimNoitfy)
    assertFalse(respondButtonAvailable(claimNoitfy))
  }

  public function testTransactionIsPurged_ILULead() {
    var claimNoitfy = createClaimNotifyRqEntity()
    claimNoitfy = setTransactionStatus(claimNoitfy, ECFTransactionStatus_Ext.TC_8_PURGED)
    claimNoitfy = setExplanation(claimNoitfy, TC_U)
    claimNoitfy = setActionParticipant(claimNoitfy, _brokerId)
    claimNoitfy = setLead(claimNoitfy, _iluLeadId)
    claimNoitfy = setSecondAgreementParty(claimNoitfy, _iluTestId)
    claimNoitfy = processClaimNotifyEntity(claimNoitfy)
    assertFalse(respondButtonAvailable(claimNoitfy))
  }

  override function createClaimNotifyRqEntity(): ECFMessageClaimNotifyRq_Ext {
    return super.createClaimNotifyRqEntity(_iluTestId)
  }
}