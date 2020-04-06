package gw.acc.iplm.respondrules.lloyds.common

uses gw.acc.iplm.respondrules.lloyds.LloydsRespondRuleTester

class LloydsAgreementAcknowledgementRuleTest extends LloydsRespondRuleTester {

  public function testStateUpdatedForAgreementAck_AP_14_Agree() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_14_PART_AUT)
    claimNotify = setResponseCode(claimNotify, TC_AGREE_PAY)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId, _otherCarrierId})
    claimNotify = setActionParticipant(claimNotify, _lloydsTestId)
    claimNotify = setLead(claimNotify, _otherCarrierId2)

    assertTrue("The transaction state should be updated for a 14 agree/pay for SAP", updateTransactionState(claimNotify))
    var transaction = claimNotify.ECFTransactionState.refresh() as ECFTransactionState_Ext
    assertTrue(transaction.Agreed)
    assertNull(transaction.UUID)
  }

  public function testStateUpdatedForAgreementAck_Lead_14_Agree() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_14_PART_AUT)
    claimNotify = setResponseCode(claimNotify, TC_AGREE_PAY)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId2, _otherCarrierId})
    claimNotify = setActionParticipant(claimNotify, _lloydsTestId)
    claimNotify = setLead(claimNotify, _lloydsTestId)

    assertTrue("The transaction state should be updated for  a 14 agree/pay for Lead", updateTransactionState(claimNotify))
    var transaction = claimNotify.ECFTransactionState.refresh() as ECFTransactionState_Ext
    assertTrue(transaction.Agreed)
    assertNull(transaction.UUID)
  }

  public function testStateUpdatedForAgreementAck_AP_15_Agree() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_15_PART_AUT)
    claimNotify = setResponseCode(claimNotify, TC_AGREE_PAY)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId, _otherCarrierId})
    claimNotify = setActionParticipant(claimNotify, _lloydsTestId)
    claimNotify = setLead(claimNotify, _otherCarrierId2)

    assertTrue("The transaction state should be updated for a 15 agree/pay for SAP", updateTransactionState(claimNotify))
    var transaction = claimNotify.ECFTransactionState.refresh() as ECFTransactionState_Ext
    assertTrue(transaction.Agreed)
    assertNull(transaction.UUID)
  }

  public function testStateUpdatedForAgreementAck_Lead_15_Agree() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_15_PART_AUT)
    claimNotify = setResponseCode(claimNotify, TC_AGREE_PAY)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId2, _otherCarrierId})
    claimNotify = setActionParticipant(claimNotify, _lloydsTestId)
    claimNotify = setLead(claimNotify, _lloydsTestId)

    assertTrue("The transaction state should be updated for  a 15 agree/pay for Lead", updateTransactionState(claimNotify))
    var transaction = claimNotify.ECFTransactionState.refresh() as ECFTransactionState_Ext
    assertTrue(transaction.Agreed)
    assertNull(transaction.UUID)
  }

  public function testStateUpdatedForAgreementAck_AP_14_Seen() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_14_PART_AUT)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_SEEN_ACTION)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId, _otherCarrierId})
    claimNotify = setActionParticipant(claimNotify, _lloydsTestId)
    claimNotify = setLead(claimNotify, _otherCarrierId2)

    assertTrue("The transaction state should be updated for a 14 seen/action for SAP", updateTransactionState(claimNotify))
    var transaction = claimNotify.ECFTransactionState.refresh() as ECFTransactionState_Ext
    assertTrue(transaction.Agreed)
    assertNull(transaction.UUID)
  }

  public function testStateUpdatedForAgreementAck_Lead_14_Seen() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_14_PART_AUT)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_SEEN_ACTION)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId2, _otherCarrierId})
    claimNotify = setActionParticipant(claimNotify, _lloydsTestId)
    claimNotify = setLead(claimNotify, _lloydsTestId)

    assertTrue("The transaction state should be updated for a 14 seen/action for Lead", updateTransactionState(claimNotify))
    var transaction = claimNotify.ECFTransactionState.refresh() as ECFTransactionState_Ext
    assertTrue(transaction.Agreed)
    assertNull(transaction.UUID)
  }

  public function testStateUpdatedForAgreementAck_AP_15_Seen() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_15_PART_AUT)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_SEEN_ACTION)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId, _otherCarrierId})
    claimNotify = setActionParticipant(claimNotify, _lloydsTestId)
    claimNotify = setLead(claimNotify, _otherCarrierId2)

    assertTrue("The transaction state should be updated for a 15 seen/action for SAP", updateTransactionState(claimNotify))
    var transaction = claimNotify.ECFTransactionState.refresh() as ECFTransactionState_Ext
    assertTrue(transaction.Agreed)
    assertNull(transaction.UUID)
  }

  public function testStateUpdatedForAgreementAck_Lead_15_Seen() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_15_PART_AUT)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_SEEN_ACTION)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId2, _otherCarrierId})
    claimNotify = setActionParticipant(claimNotify, _lloydsTestId)
    claimNotify = setLead(claimNotify, _lloydsTestId)

    assertTrue("The transaction state should be updated for a 15 seen/action for SAP", updateTransactionState(claimNotify))
    var transaction = claimNotify.ECFTransactionState.refresh() as ECFTransactionState_Ext
    assertTrue(transaction.Agreed)
    assertNull(transaction.UUID)
  }

  public function testStateNotUpdatedForAnotherPartyAgreementAck() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_15_PART_AUT)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_SEEN_ACTION)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId2, _otherCarrierId})
    claimNotify = setActionParticipant(claimNotify, _otherCarrierId)
    claimNotify = setLead(claimNotify, _lloydsTestId)

    assertFalse("The transaction state should not be updated for another party's agreement", updateTransactionState(claimNotify))
  }

  public function testStateNotUpdatedForAnotherTransactionStatus() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_SEEN_ACTION)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId2, _otherCarrierId})
    claimNotify = setActionParticipant(claimNotify, _lloydsTestId)
    claimNotify = setLead(claimNotify, _lloydsTestId)

    assertFalse("The transaction state should not be updated for another tx status", updateTransactionState(claimNotify))
  }

  public function testStateNotUpdatedForAnotherResponseCode() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_14_PART_AUT)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_QUERY_RETURN)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId2, _otherCarrierId})
    claimNotify = setActionParticipant(claimNotify, _lloydsTestId)
    claimNotify = setLead(claimNotify, _lloydsTestId)

    assertFalse("The transaction state should not be updated for another response code", updateTransactionState(claimNotify))
  }

  private function updateTransactionState(claimNotify: ECFMessageClaimNotifyRq_Ext): boolean {
    return new LloydsAgreementAcknowledgementRule().updateTansactionState(claimNotify)
  }

  private function createClaimNotifyRqEntity(): ECFMessageClaimNotifyRq_Ext {
    return super.createClaimNotifyRqEntity(_lloydsTestId)
  }

}