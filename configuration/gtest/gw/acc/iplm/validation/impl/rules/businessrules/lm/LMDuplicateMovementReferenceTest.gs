package gw.acc.iplm.validation.impl.rules.businessrules.lm

uses gw.acc.iplm.exception.lm.LMErrorCodeType
uses gw.acc.iplm.testutils.AssertUtils
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.api.database.Query
uses gw.testharness.v3.GUnitTestClass

class LMDuplicateMovementReferenceTest extends GUnitTestClass {

  private var _validation : LMDuplicateMovementReferenceRule

  override function beforeMethod() {
    super.beforeMethod()
    _validation = new LMDuplicateMovementReferenceRule()
  }

  override function afterMethod(t : Throwable) {
    super.afterMethod(t)
    var msgs = Query.make(LMMessageLloydsSCM_Ext).select().toList()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msgs.each(\msg -> {
        bundle.delete(msg)
      })
    }, User.util.UnrestrictedUser)
  }

  /**
   * SCM messages that for a given OCR have a Message Sequence that has been processed before should not be processed against the claim.
   * The message should be suspended and show on the claim owner's suspense queue
   */


  function testWithValidMovementReferenceNonExistingClaim() {
    var message = createMessage("OCR1", "AB", "UCR")
    _validation.validate(message)
  }

  function testWithFirstMovementReferenceExistingClaim() {
    var message = createMessage("OCR1", "AB", "UCR")

    _validation.validate(message)
  }

  function testDuplicateMovementReferenceExistingClaim() {
    var message1 = createMessage("OCR1", "AB", "UCR")
    var message2 = createMessage("OCR1", "AB", "UCR")


    AssertUtils.assertCausesLMExceptionWithType(\-> _validation.validate(message2), LMErrorCodeType.DUPLICATE_MOVEMENT)

  }

  function testDuplicateSequenceWithDifferentOCR() {
    var message1 = createMessage("OCR1", "AB", "UCR")
    var message2 = createMessage("OCR2", "AB", "UCR")

    _validation.validate(message2)
  }

  private function createMessage(ocr : String, movementReferenceSequence : String, ucr : String, suspended : Boolean = false) : LMMessageLloydsSCM_Ext {
    var message = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      message = bundle.add(message)
      message.OCR = ocr
      message.UCR = ucr
      message.MovementReferenceSequence = movementReferenceSequence
      message.Suspended = suspended
    }, User.util.UnrestrictedUser)
    return message
  }

}