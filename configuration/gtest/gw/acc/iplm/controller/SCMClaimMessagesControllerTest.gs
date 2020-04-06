package gw.acc.iplm.controller

uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.EntityUtil
uses gw.testharness.v3.GUnitTestClass

class SCMClaimMessagesControllerTest extends GUnitTestClass {

  function testDistinctOCRsForAllSCMMessages() {

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var listOfMessages = {createSCMMessageWithOCR("OCR1"), createSCMMessageWithOCR("OCR1"), createSCMMessageWithOCR("OCR2")}
      var claim = createClaimWithListOfMessages(listOfMessages)
      var controller = new SCMClaimMessagesController(claim)

      final var expectedOCRs = {"OCR1", "OCR2"}
      assertEquals(expectedOCRs, controller.distinctOCRsForAllSCMMessages())
    })
  }

  function testScmMessagesWithOCR() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var listOfMessages = {createSCMMessageWithOCR("OCR1"), createSCMMessageWithOCR("OCR1"), createSCMMessageWithOCR("OCR2")}
      var claim = createClaimWithListOfMessages(listOfMessages)
      var controller = new SCMClaimMessagesController(claim)

      final var expectedOCRs = {listOfMessages[2]}
      assertEquals(expectedOCRs, controller.scmMessagesWithOCR("OCR2"))
    })
  }

  private function createClaimWithListOfMessages(messages: List<LMMessageLloydsSCM_Ext>) : Claim {
    var claim = ClaimBuilderHelper.createClaim(true)
    messages.each(\msg -> claim.addToLMMessages(msg))

    return claim
  }

  private function createSCMMessageWithOCR(ocr: String) : LMMessageLloydsSCM_Ext {
    var message = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
    message.OCR = ocr

    return message
  }
  
}