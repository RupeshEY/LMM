package gw.acc.iplm.dao

uses gw.acc.iplm.entitymapper.ecfwb.claimdata.ECFMessageClaimNotifyRq_ExtBuilder
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.api.database.Query
uses gw.date.Month
uses gw.testharness.v3.GUnitTestClass

class ECFClaimNotifyRqMessageDAOTest extends GUnitTestClass {

  private static final var UCR1 = "UCR1"
  private static final var UMR1 = "UMR1"
  private static final var TR1 = "TR1"
  var dao = new ECFClaimNotifyRqMessageDAO()
  var notifyRqBuilder = new ECFMessageClaimNotifyRq_ExtBuilder()
  var JANUARY1_2016_1PM = Date.create(2016, Month.JANUARY, 1, 13, 0, 0, 0, null)

  override public function beforeMethod() {
    deleteAllMessages()
  }

  function testFindAllSuspendedMsgsForClaimTransaction_ManualCheckTrue() {
    testFindAllSuspendedMsgsForClaimTransasction(true, 3)
  }

  function testFindAllSuspendedMsgsForClaimTransaction_ManualCheckFalse() {
    testFindAllSuspendedMsgsForClaimTransasction(false, 0)
  }

  function testFindAllSuspendedMsgsForClaimTransaction_ManualCheckTrue_TransactionInvalid() {
    var msg1 = validMessageBuilder(true)
    var msg2 = validMessageBuilder(true)
    var msg3 = validMessageBuilder(true)

    var messages = dao.findAllSuspendedMsgsForClaimTransaction("UCR2", "UMR2", "TR2")
    assertEquals(0, messages.Count)
  }

  function testFindAllSuspendedMsgsForClaimTransaction_ManualCheckTrueAndFalse() {
    var msg1 = validMessageBuilder(true)
    var msg2 = validMessageBuilder(true)
    var msg3 = validMessageBuilder(false)
    var msg4 = validMessageBuilder(false)
    var msg5 = validMessageBuilder(false)

    var messages = dao.findAllSuspendedMsgsForClaimTransaction(UCR1, UMR1, TR1)
    assertEquals(2, messages.Count)
  }

  private function testFindAllSuspendedMsgsForClaimTransasction(manualCheck: boolean, expectedResult: int) {
    var msg1 = validMessageBuilder(manualCheck)
    var msg2 = validMessageBuilder(manualCheck)
    var msg3 = validMessageBuilder(manualCheck)

    var messages = dao.findAllSuspendedMsgsForClaimTransaction(UCR1, UMR1, TR1)
    assertEquals(expectedResult, messages.Count)
  }

  private function validMessageBuilder(suspendMessage: boolean): ECFMessageClaimNotifyRq_Ext {
    var cnRqEntity = ECFMessageEntityUtil.createClaimNotifyRq()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      cnRqEntity = bundle.add(cnRqEntity)
      cnRqEntity.UCR = UCR1
      cnRqEntity.UMR = UMR1
      cnRqEntity.TR = TR1
      cnRqEntity.Suspended = suspendMessage
    }, "su")

    return cnRqEntity
  }

  private function deleteAllMessages() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      Query.make(ECFMessageClaimNotifyRq_Ext)
          .select().each(\elt -> bundle.delete(elt))
      Query.make(ECFContractMarket_Ext)
          .select().each(\elt -> bundle.delete(elt))
    }, "su")
  }
}