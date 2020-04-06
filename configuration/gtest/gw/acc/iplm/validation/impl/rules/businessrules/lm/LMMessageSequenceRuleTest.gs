package gw.acc.iplm.validation.impl.rules.businessrules.lm

uses gw.acc.iplm.dao.impl.ClaimDAO
uses gw.acc.iplm.exception.lm.LMErrorCodeType
uses gw.acc.iplm.testutils.AssertUtils
uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.EntityUtil
uses gw.testharness.v3.GUnitTestClass
uses org.mockito.Mockito

class LMMessageSequenceRuleTest extends GUnitTestClass {

  private var _validation : LMMessageSequenceRule

  override function beforeMethod() {
    super.beforeMethod()
    _validation = new LMMessageSequenceRule()
    _validation.ClaimDAO = Mockito.mock(ClaimDAO)
  }

  function testWithValidMessageSequenceNonExistingClaim() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var message = createMessage("OCR1", 1)
      Mockito.when(_validation.ClaimDAO.findClaim(Mockito.any())).thenReturn(null)

      _validation.validate(message)
    })
  }

  function testWithInvalidMessageSequenceNonExistingClaim() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var message = createMessage("OCR1", 2)
      Mockito.when(_validation.ClaimDAO.findClaim(Mockito.any())).thenReturn(null)

      AssertUtils.assertCausesLMExceptionWithType(\-> _validation.validate(message), LMErrorCodeType.PREVIOUS_MOVEMENT_NOT_POSTED)
    })
  }

  function testWithFirstMessageSequenceExistingClaim() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var message = createMessage("OCR1", 1)
      var claim = createClaim()

      _validation.validate(message)
    })
  }

  function testWithSecondInvalidMessageSequenceExistingClaim() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var message = createMessage("OCR1", 2)
      var claim = createClaim()

      AssertUtils.assertCausesLMExceptionWithType(\-> _validation.validate(message), LMErrorCodeType.PREVIOUS_MOVEMENT_NOT_POSTED)
    })
  }

  function testWithSecondMessageSequenceExistingClaim() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var claim = createClaim()

      var message1 = createMessage("OCR1", 1)
      var message2 = createMessage("OCR1", 2)
      claim.addToLMMessages(message1)
      claim.addToLMMessages(message2)

      _validation.validate(message2)
    })
  }

  function testWithThirdMessageSequenceExistingClaim() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var claim = createClaim()

      var message1 = createMessage("OCR1", 1)
      var message2 = createMessage("OCR1", 3)
      claim.addToLMMessages(message1)
      claim.addToLMMessages(message2)

      AssertUtils.assertCausesLMExceptionWithType(\-> _validation.validate(message2), LMErrorCodeType.PREVIOUS_MOVEMENT_NOT_POSTED)
    })
  }

  function testWithFirstMessageSequenceExistingClaimAndOtherOCR() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var claim = createClaim()

      var message1 = createMessage("OCR1", 1)
      var message2 = createMessage("OCR2", 1)
      claim.addToLMMessages(message1)
      claim.addToLMMessages(message2)

      _validation.validate(message2)
    })
  }

  function testOutOfSequenceMessages() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var claim = createClaim()

      var message1 = createMessage("OCR1", 2, :suspended = true)
      var message2 = createMessage("OCR1", 1)
      claim.addToLMMessages(message1)
      claim.addToLMMessages(message2)

      _validation.validate(message2)
    })
  }

  private function createMessage(ocr: String, messageSequence: Integer, suspended: Boolean = false): LMMessageLloydsSCM_Ext {
    var message = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
    message.OCR = ocr
    message.MessageSequence = messageSequence
    message.Suspended = suspended
    return message
  }

  private function createClaim() : Claim {
    var claim = ClaimBuilderHelper.createClaim(false)
    Mockito.when(_validation.ClaimDAO.findClaim(Mockito.any())).thenReturn(claim)
    return claim
  }

}