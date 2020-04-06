package gw.acc.iplm.services

uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.testharness.v3.GUnitTestClass

class LMMessageReprocessServiceTest extends GUnitTestClass {

  private var _service: LMMessageReprocessService

  override function beforeMethod() {
    super.beforeMethod()
    _service = new LMMessageReprocessService()
  }

  override function afterClass() {
    ECFMessageEntityUtil.deleteAllLMMessagesFromDB()
  }

  function testFlagToBeReprocessed() {
    var messages: List<LMMessageLloydsSCM_Ext> = {ECFMessageEntityUtil.createNewLMMessageLloydsSCM(), ECFMessageEntityUtil.createNewLMMessageLloydsSCM()}
    messages = _service.flagToBeReprocessed(messages) as List<LMMessageLloydsSCM_Ext>

    assertEquals(2, messages.Count)
    messages.each(\message -> assertTrue(message.Reprocess))
  }

  function testunflagFromReprocess() {
    var messages: List<LMMessageLloydsSCM_Ext> = {ECFMessageEntityUtil.createNewLMMessageLloydsSCM(), ECFMessageEntityUtil.createNewLMMessageLloydsSCM()}
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      messages.map(\message -> {
        message = bundle.add(message)
        message.Reprocess = true
        return message
      })}, User.util.UnrestrictedUser)
    messages = _service.unflagFromReprocess(messages) as List<LMMessageLloydsSCM_Ext>

    assertEquals(2, messages.Count)
    messages.each(\message -> assertFalse(message.Reprocess))
  }
}