package gw.acc.iplm.validation.impl.validators

uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFSuspenseQueueTestUtil
uses gw.testharness.v3.GUnitTestClass

class ClaimNotifyLogicValidatorTest extends GUnitTestClass {

  private static final var UCR1 = "UCR1"
  private static final var UMR1 = "UMR1"
  private static final var TR1 = "TR1"

  function testValidationFailsForInvalidActionCode() {
    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
    claimNotify.ActionCode = ECFActionCode_Ext.get("H")
    var result = validateClaimNotify(claimNotify)
    assertFalse("Claim Notify XML has unknown Action Code, but validation has passed", result)
  }

  function testValidationFailsForMissingActionCode() {
    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
    claimNotify.ActionCode = null
    var result = validateClaimNotify(claimNotify)
    assertFalse("Claim Notify XML has no Action Code, but validation has passed", result)
  }

  function testValidationFailsForSuspenseQueueRule() {
    //GIVEN
    createSuspendedMessage()
    var claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
    claimNotify.UMR = UMR1
    claimNotify.UCR = UCR1
    claimNotify.TR = TR1
    //WHEN
    var result = validateClaimNotify(claimNotify)
    //THEN
    assertFalse("Claim Notify Message has a suspended transaction, but validation has passed", result)
  }

  private function validateClaimNotify(claimNotify: ECFMessageClaimNotifyRq_Ext): boolean {
    var result: boolean
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      result = new ClaimNotifyLogicValidator().validate(claimNotify).IsValid
    }, User.util.UnrestrictedUser)
    return result
  }

  private function createSuspendedMessage() {
    ECFSuspenseQueueTestUtil.validMessage(UMR1, UCR1, TR1, true)
  }
}
