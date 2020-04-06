package gw.acc.iplm.utils.pcf.suspensequeue

uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.utils.pcf.suspensequeue.LMMessageAssignmentPopup
uses gw.testharness.v3.GUnitTestClass

class LMMessageAssignmentPopupTest extends GUnitTestClass {

  function testPopupClassCreatedForECFMessageType() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var message = ECFMessageEntityUtil.createClaimNotifyRq()
      var eCFMessageAssignmentPopup = new LMMessageAssignmentPopup(message)
      assertEquals(LMMessage_Ext.Type, eCFMessageAssignmentPopup.AssignableType)
    }, User.util.UnrestrictedUser)
  }

  function testPopupClassCreatedWithSuggestedAssigneeBuilder() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var message = ECFMessageEntityUtil.createClaimNotifyRq()
      var eCFMessageAssignmentPopup = new LMMessageAssignmentPopup(message)
      assertNotNull("No suggestion asignees were added", eCFMessageAssignmentPopup.SuggestedAssignees)
    }, User.util.UnrestrictedUser)
  }

  function testPopupClassCreatedWithCorrectAsignees() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var message = ECFMessageEntityUtil.createClaimNotifyRq()
      var eCFMessageAssignmentPopup = new LMMessageAssignmentPopup(message)
      assertTrue("Assignee picker does not include users, but should", eCFMessageAssignmentPopup.Picker.getAllowedAssignmentSearchTypes().contains(AssignmentSearchType.TC_USER))
      assertTrue("Assignee picker does not include groups, but should", eCFMessageAssignmentPopup.Picker.getAllowedAssignmentSearchTypes().contains(AssignmentSearchType.TC_GROUP))
      assertFalse("Assignee picker includes queues, but should not", eCFMessageAssignmentPopup.Picker.getAllowedAssignmentSearchTypes().contains(AssignmentSearchType.TC_QUEUE))
    }, User.util.UnrestrictedUser)
  }
}