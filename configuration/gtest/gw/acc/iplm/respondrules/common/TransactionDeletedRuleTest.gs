package gw.acc.iplm.respondrules.common

uses gw.acc.iplm.services.EntityMapperService
uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.ClaimNotifyEventRq
uses gw.api.util.ConfigAccess
uses gw.testharness.v3.GUnitTestClass

uses java.io.File

class TransactionDeletedRuleTest extends GUnitTestClass {

  private var _lirmaClaimNotifyFile: File = ConfigAccess.getConfigFile("config/iplm/testresources/claimnotify/ClaimNotifyEventRq-Lirma-SAMPLE.xml")
  private var _testUCR: String

  override public function beforeMethod() {
    super.beforeMethod()
    _testUCR = ClaimBuilderHelper.getNextUCR()
  }

  function testUpdateTansactionState_ActionCode_D_LIRMA() {
    var claimNotify = createClaimNotifyRqEntity(_lirmaClaimNotifyFile)
    claimNotify = setActionCode(claimNotify, ECFActionCode_Ext.TC_D)
    assertTrue("The transaction state should be updated for an Action Code D", updateTransactionState(claimNotify))
  }

  function testUpdateTansactionState_ActionCode_NotD_LIRMA() {
    var actionCode = ECFActionCode_Ext.AllTypeKeys.firstWhere(\ ac -> ac != ECFActionCode_Ext.TC_D)
    var claimNotify = createClaimNotifyRqEntity(_lirmaClaimNotifyFile)
    claimNotify = setActionCode(claimNotify, actionCode)
    assertFalse("The transaction state should not be updated for an action code other than Action Code D", updateTransactionState(claimNotify))
  }

  function testUpdateTansactionState_ActionCodeD_MarkedAsAgreed() {
    // A deleted transaction can not be undeleted - A new transaction will be released.
    // So we can mark this as 'agreed' to 'close' the transaction
    var claimNotify = createClaimNotifyRqEntity(_lirmaClaimNotifyFile)
    claimNotify = setActionCode(claimNotify, ECFActionCode_Ext.TC_D)
    updateTransactionState(claimNotify)
    claimNotify = claimNotify.refresh() as ECFMessageClaimNotifyRq_Ext
    assertTrue("The transaction state should be closed", claimNotify.ECFTransactionState.Agreed)
  }

  function testUpdateTansactionState_TransactionStatus_DELETED() {
    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq(ECFMessageUtil.createNewTransactionErrorNotifyRq())
    claimNotify.TransactionStatus = ECFTransactionStatus_Ext.TC_DELETED
    assertTrue("The transaction state should be updated for transaction status DELETED", updateTransactionState(claimNotify))
  }

  protected function createClaimNotifyRqEntity(xml : File): ECFMessageClaimNotifyRq_Ext {
    var xmlElement = ECFMessageUtil.createNewXmlMessage(xml)
    var claimNotifyXml =  ClaimNotifyEventRq.parse(xmlElement.asUTFString())
    claimNotifyXml.UCR = _testUCR
    var claimNotifyEntity = new EntityMapperService().createEntity(claimNotifyXml) as ECFMessageClaimNotifyRq_Ext

    return claimNotifyEntity
  }

  private function setActionCode(claimNotifyEntity: ECFMessageClaimNotifyRq_Ext, actionCode: ECFActionCode_Ext): ECFMessageClaimNotifyRq_Ext {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotifyEntity = bundle.add(claimNotifyEntity)
      claimNotifyEntity.ActionCode = actionCode
    }, User.util.UnrestrictedUser)

    return claimNotifyEntity
  }

  private function updateTransactionState(claimNotify: ECFMessageClaimNotifyRq_Ext): boolean {
    return new TransactionDeletedRule().updateTansactionState(claimNotify)
  }

}