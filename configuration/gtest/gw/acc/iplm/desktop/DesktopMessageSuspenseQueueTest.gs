package gw.acc.iplm.desktop

uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.testharness.v3.GUnitTestClass
uses entity.LMMessage_Ext

class DesktopMessageSuspenseQueueTest extends GUnitTestClass {

  function testGetSuspendedMessagesCount() {

    assertZero(DesktopMessageSuspenseQueue.getSuspendedMessagesCount(User.util.UnrestrictedUser))

    var message1 = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
    var message2 = ECFMessageEntityUtil.createClaimNotifyRq()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      message1 = bundle.add(message1)
      message2 = bundle.add(message2)
      message1 = suspendMessage(message1) as LMMessageLloydsSCM_Ext
      message2 = suspendMessage(message2) as ECFMessageClaimNotifyRq_Ext
    }, User.util.UnrestrictedUser)

    assertEquals(2, DesktopMessageSuspenseQueue.getSuspendedMessagesCount(User.util.UnrestrictedUser))
  }

  private function suspendMessage(message: LMMessage_Ext) : LMMessage_Ext {
    message.Suspended = true
    message.AssignedUser = User.util.UnrestrictedUser

    return message
  }
}