package gw.acc.iplm.respondrules.common

uses gw.acc.iplm.services.EntityMapperService
uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.ClaimNotifyEventRq
uses gw.api.util.ConfigAccess
uses gw.testharness.v3.GUnitTestClass

uses java.io.File

class TransactionEEventRuleTest extends GUnitTestClass {

  private var _lirmaClaimNotifyFile: File = ConfigAccess.getConfigFile("config/iplm/testresources/claimnotify/ClaimNotifyEventRq-Lirma-SAMPLE.xml")
  private var _testUCR: String

  override public function beforeMethod() {
    super.beforeMethod()
    _testUCR = ClaimBuilderHelper.getNextUCR()
  }

  function testUpdateTansactionState_ActionCode_E() {
    var claimNotify = createClaimNotifyRqEntity(_lirmaClaimNotifyFile)
    claimNotify = createAndSetNewClaim(claimNotify)
    claimNotify = setActionCode(claimNotify, ECFActionCode_Ext.TC_E)

    assertTrue("The transaction state should be updated for an Action Code E", updateTransactionState(claimNotify))
  }

  function testUpdateTansactionState_ActionCode_NotE() {
    var actionCode = ECFActionCode_Ext.AllTypeKeys.firstWhere(\ ac -> ac != ECFActionCode_Ext.TC_E)

    var claimNotify = createClaimNotifyRqEntity(_lirmaClaimNotifyFile)
    claimNotify = createAndSetNewClaim(claimNotify)
    claimNotify = setActionCode(claimNotify, actionCode)

    assertFalse("The transaction state should not be updated for anything other than an Action Code E", updateTransactionState(claimNotify))
  }

  function updateTransactionState(claimNotify: ECFMessageClaimNotifyRq_Ext): boolean {
    return new TransactionEEventRule().updateTansactionState(claimNotify)
  }

  private function createAndSetNewClaim(claimNotify : ECFMessageClaimNotifyRq_Ext) : ECFMessageClaimNotifyRq_Ext{
    var newClaim = ClaimBuilderHelper.createClaim(true)

    gw.transaction.Transaction.runWithNewBundle(\ bundle -> {
      claimNotify = bundle.add(claimNotify)
      newClaim = bundle.add(newClaim)

      claimNotify.Claim = newClaim
    }, User.util.UnrestrictedUser)
    return claimNotify
  }

  private function setActionCode(claimNotifyEntity: ECFMessageClaimNotifyRq_Ext, actionCode: ECFActionCode_Ext): ECFMessageClaimNotifyRq_Ext {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotifyEntity = bundle.add(claimNotifyEntity)
      claimNotifyEntity.ActionCode = actionCode
    }, User.util.UnrestrictedUser)

    return claimNotifyEntity
  }

  private function createClaimNotifyRqEntity(xml : File): ECFMessageClaimNotifyRq_Ext {
    var xmlElement = ECFMessageUtil.createNewXmlMessage(xml)
    var claimNotifyXml =  ClaimNotifyEventRq.parse(xmlElement.asUTFString())
    claimNotifyXml.UCR = _testUCR
    var claimNotifyEntity = new EntityMapperService().createEntity(claimNotifyXml) as ECFMessageClaimNotifyRq_Ext

    return claimNotifyEntity
  }
}