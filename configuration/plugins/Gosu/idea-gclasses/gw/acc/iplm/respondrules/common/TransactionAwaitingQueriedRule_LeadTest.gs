package gw.acc.iplm.respondrules.common

uses gw.acc.iplm.config.LMCompaniesDataLoader
uses gw.acc.iplm.respondrules.RespondRuleTester
uses gw.api.database.Query
uses gw.api.util.ConfigAccess

uses java.io.File

class TransactionAwaitingQueriedRule_LeadTest extends RespondRuleTester {

  private var _lirmaClaimNotifyFile: File = ConfigAccess.getConfigFile("config/iplm/testresources/claimnotify/ClaimNotifyEventRq-Lirma-SAMPLE.xml")
  private var _lirmaId: String = new LMCompaniesDataLoader().LirmaCompanies.first().FirstId

  override public function beforeMethod() {
    super.beforeMethod()
    _carrierBureau = ECFBureauType_Ext.TC_LIRMA
  }

  function testUpdateTansactionState() {
    var claimNotify = createClaimNotifyWithSufficientCriteria()
    claimNotify = setActionCode(claimNotify, ECFActionCode_Ext.TC_A)
    assertTrue("The transaction state should be updated.", updateTransactionState(claimNotify))
    var transaction = claimNotify.ECFTransactionState.refresh() as ECFTransactionState_Ext
    assertFalse(transaction.Agreed)
    assertEquals(claimNotify.UUID, transaction.UUID)
  }

    function testUpdateTansactionState_ActionCodeU() {
    var claimNotify = createClaimNotifyWithSufficientCriteria()
    claimNotify = setActionCode(claimNotify, ECFActionCode_Ext.TC_U)
    assertTrue("The transaction state should be updated.", updateTransactionState(claimNotify))
      var transaction = claimNotify.ECFTransactionState.refresh() as ECFTransactionState_Ext
      assertFalse(transaction.Agreed)
      assertEquals(claimNotify.UUID, transaction.UUID)
  }

  function testUpdateTansactionState_ActionCodeR() {
    var claimNotify = createClaimNotifyWithSufficientCriteria()
    claimNotify = setActionCode(claimNotify, ECFActionCode_Ext.TC_R)
    assertTrue("The transaction state should be updated for Action Code R.", updateTransactionState(claimNotify))
    var transaction = claimNotify.ECFTransactionState.refresh() as ECFTransactionState_Ext
    assertFalse(transaction.Agreed)
    assertEquals(claimNotify.UUID, transaction.UUID)
  }

  function testUpdateTansactionState_TransactionStatusPurged() {
    var claimNotify = createClaimNotifyWithSufficientCriteria()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_8_PURGED)
    assertFalse("The transaction state not be updated for Transaction Status 8-PURGED.", updateTransactionState(claimNotify))
  }

  function testUpdateTansactionState_SecondAgreementParty() {
    var claimNotify = createClaimNotifyWithSufficientCriteria()
    claimNotify = setLead(claimNotify, _otherCarrierId)
    claimNotify = setSecondAgreementParty(claimNotify, {_lirmaId, _otherCarrierId2})
    assertFalse("The transaction state not be updated when the receiever is an SAP.", updateTransactionState(claimNotify))
  }

  function testAgreementIsReset() {
    var claimNotify = createClaimNotifyWithSufficientCriteria()
    claimNotify = setActionCode(claimNotify, ECFActionCode_Ext.TC_A)
    claimNotify = setAgreement(claimNotify, true)
    assertTrue("The transaction state should be updated.", updateTransactionState(claimNotify))
    var transaction = reloadTransactionState(claimNotify)
    assertFalse(transaction.Agreed)
    assertEquals(claimNotify.UUID, transaction.UUID)
  }

  /**
   * For whatever bundle reason, .refresh() doesn't work...
   */
  private function reloadTransactionState(claimNotify: ECFMessageClaimNotifyRq_Ext) : ECFTransactionState_Ext{
    return Query.make(ECFTransactionState_Ext)
        .compare(ECFTransactionState_Ext#UCR, Equals, claimNotify.UCR)
        .compare(ECFTransactionState_Ext#TR, Equals, claimNotify.TR)
        .compare(ECFTransactionState_Ext#ReceiverId, Equals, claimNotify.ReceiverPartyId)
        .select().first()
  }

  private function setAgreement(claimNotify: ECFMessageClaimNotifyRq_Ext, agree : boolean): ECFMessageClaimNotifyRq_Ext{
    claimNotify.ECFTransactionState.Agreed = agree
    return claimNotify
  }

  function updateTransactionState(claimNotify: ECFMessageClaimNotifyRq_Ext): boolean {
    return new TransactionAwaitingQueriedRule_Lead().updateTansactionState(claimNotify)
  }

  private function createClaimNotifyWithSufficientCriteria(): ECFMessageClaimNotifyRq_Ext {
    var claimNotify = createClaimNotifyRqEntity(_lirmaClaimNotifyFile, new LMCompaniesDataLoader().LirmaCompanies.first())
    claimNotify = setLead(claimNotify, _lirmaId)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId, _otherCarrierId2})
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED)

    return claimNotify
  }
}