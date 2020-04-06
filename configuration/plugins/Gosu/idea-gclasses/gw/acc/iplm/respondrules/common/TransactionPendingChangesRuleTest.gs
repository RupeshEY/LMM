package gw.acc.iplm.respondrules.common

uses gw.acc.iplm.config.LMCompaniesDataLoader
uses gw.acc.iplm.respondrules.RespondRuleTester
uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Party
uses gw.api.util.ConfigAccess

uses java.io.File

class TransactionPendingChangesRuleTest extends RespondRuleTester {

  protected static var _lirmaClaimNotifyFile: File = ConfigAccess.getConfigFile("config/iplm/testresources/claimnotify/ClaimNotifyEventRq-Lirma-SAMPLE.xml")
  protected static var _lirmaCompany: Party = new LMCompaniesDataLoader().LirmaCompanies.first()

  function testUpdateTansactionState_TransactionStatus_3() {
    var claimNotify = createClaimNotifyRqEntity(_lirmaClaimNotifyFile, _lirmaCompany)
    claimNotify = setTransactionStatus(claimNotify, TC_3)

    assertTrue("The transaction state should be updated for a Transaction Status of 3", updateTransactionState(claimNotify))
  }

  function testUpdateTansactionState_TransactionStatus_4() {
    var claimNotify = createClaimNotifyRqEntity(_lirmaClaimNotifyFile, _lirmaCompany)
    claimNotify = setTransactionStatus(claimNotify, TC_4)

    assertTrue("The transaction state should be updated for a Transaction Status of 4", updateTransactionState(claimNotify))
  }

  function testUpdateTansactionState_TransactionStatus_Not3or4() {
    var transactionStatus = ECFTransactionStatus_Ext.AllTypeKeys.firstWhere(\ ts -> ts != TC_3 and ts != TC_4)

    var claimNotify = createClaimNotifyRqEntity(_lirmaClaimNotifyFile, _lirmaCompany)
    claimNotify = setTransactionStatus(claimNotify, transactionStatus)

    assertFalse("The transaction state should only be updated for a Transaction Status of 3 or 4", updateTransactionState(claimNotify))
  }

  function updateTransactionState(claimNotify: ECFMessageClaimNotifyRq_Ext): boolean {
    return new TransactionPendingChangesRule().updateTansactionState(claimNotify)
  }
}