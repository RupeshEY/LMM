package gw.acc.iplm.respondrules.common

uses gw.acc.iplm.services.EntityMapperService
uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.ClaimNotifyEventRq
uses gw.api.util.ConfigAccess
uses gw.testharness.v3.GUnitTestClass

uses java.io.File

class TransactionCompleteRuleTest extends GUnitTestClass {

  private var _lirmaClaimNotifyFile: File = ConfigAccess.getConfigFile("config/iplm/testresources/claimnotify/ClaimNotifyEventRq-Lirma-SAMPLE.xml")
  private var _testUCR: String

  override public function beforeMethod() {
    super.beforeMethod()
    _testUCR = ClaimBuilderHelper.getNextUCR()
  }

  function testUpdateTansactionState_TransactionStatus_40() {
    var claimNotify = createClaimNotifyRqEntity(_lirmaClaimNotifyFile)
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_40_COMPLETE)

    assertTrue("The transaction state should be updated for a Transaction Status of 40-COMPLETE", updateTransactionState(claimNotify))
  }

  function testUpdateTansactionState_TransactionStatus_Not40() {
    var transactionStatus = ECFTransactionStatus_Ext.AllTypeKeys.firstWhere(\ ts -> ts != ECFTransactionStatus_Ext.TC_40_COMPLETE)

    var claimNotify = createClaimNotifyRqEntity(_lirmaClaimNotifyFile)
    claimNotify = setTransactionStatus(claimNotify, transactionStatus)

    assertFalse("The transaction state should not be updated for anything other than a Transaction Status of 40-COMPLETE", updateTransactionState(claimNotify))
  }

  protected function setTransactionStatus(claimNotifyEntity: ECFMessageClaimNotifyRq_Ext, transactionStatus: ECFTransactionStatus_Ext): ECFMessageClaimNotifyRq_Ext {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotifyEntity = bundle.add(claimNotifyEntity)
      claimNotifyEntity.TransactionStatus = transactionStatus
    }, User.util.UnrestrictedUser)

    return claimNotifyEntity
  }

  protected function createClaimNotifyRqEntity(xml : File): ECFMessageClaimNotifyRq_Ext {
    var xmlElement = ECFMessageUtil.createNewXmlMessage(xml)
    var claimNotifyXml =  ClaimNotifyEventRq.parse(xmlElement.asUTFString())
    claimNotifyXml.UCR = _testUCR
    var claimNotifyEntity = new EntityMapperService().createEntity(claimNotifyXml) as ECFMessageClaimNotifyRq_Ext

    return claimNotifyEntity
  }

  private function updateTransactionState(claimNotify: ECFMessageClaimNotifyRq_Ext): boolean {
    return new TransactionCompleteRule().updateTansactionState(claimNotify)
  }

}