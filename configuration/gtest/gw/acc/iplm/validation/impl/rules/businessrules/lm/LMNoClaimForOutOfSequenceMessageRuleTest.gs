package gw.acc.iplm.validation.impl.rules.businessrules.lm

uses gw.acc.iplm.dao.impl.ClaimDAO
uses gw.acc.iplm.exception.lm.LMErrorCodeType
uses gw.acc.iplm.testutils.AssertUtils
uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.EntityUtil
uses gw.testharness.v3.GUnitTestClass
uses org.mockito.Mockito

class LMNoClaimForOutOfSequenceMessageRuleTest extends GUnitTestClass {

  private var _validation: LMNoClaimForOutOfSequenceMessageRule
  private var _claimDAO: ClaimDAO

  override function beforeMethod() {
    super.beforeMethod()
    _claimDAO = Mockito.mock(ClaimDAO)
    _validation = new LMNoClaimForOutOfSequenceMessageRule(_claimDAO)
  }

  function testForRegularMessageWithNoClaim_ShouldNotThrowException() {
    var message = createMessage("AA")
    Mockito.when(_claimDAO.findClaim(message.UCR)).thenReturn(null)
    AssertUtils.assertNoLMExceptionThrown(\-> _validation.validate(message), "Regular Message with No Claim shouldn't trigger validation")
  }

  function testForRegularMessageWithAClaim_ShouldNotThrowException(){
    var message = createMessage("AA")
    var claim = ClaimBuilderHelper.createClaim(true)
    Mockito.when(_claimDAO.findClaim(message.UCR)).thenReturn(claim)
    AssertUtils.assertNoLMExceptionThrown(\-> _validation.validate(message), "Regular Message with No Claim shouldn't trigger validation")
  }

  function testForOutOfSequenceMessageWithNoClaim_ShouldThrowException(){
    var message = createMessage("XA")
    Mockito.when(_claimDAO.findClaim(message.UCR)).thenReturn(null)
    AssertUtils.assertCausesLMExceptionWithType(\-> _validation.validate(message), LMErrorCodeType.NO_CLAIM_FOR_OUT_OF_SEQUENCE_MESSAGE)
  }

  function testForOutOfSequenceMessageWithAClaim_ShouldNotThrowException(){
    var message = createMessage("XA")
    var claim = ClaimBuilderHelper.createClaim(true)
    Mockito.when(_claimDAO.findClaim(message.UCR)).thenReturn(claim)
    AssertUtils.assertNoLMExceptionThrown(\-> _validation.validate(message), "Regular Message with No Claim shouldn't trigger validation")
  }

  private function createMessage(movementReferenceSequence: String) : LMMessageLloydsSCM_Ext {
    var message : LMMessageLloydsSCM_Ext
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      message = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      message.MovementReferenceSequence = movementReferenceSequence
    })
    return message
  }

}