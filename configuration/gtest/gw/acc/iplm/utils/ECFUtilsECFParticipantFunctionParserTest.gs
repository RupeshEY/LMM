package gw.acc.iplm.utils

uses gw.testharness.v3.GUnitTestClass


class ECFUtilsECFParticipantFunctionParserTest extends GUnitTestClass {

  function testParseAgreementPartyByNull() {
    var ecfParticipantFunction = ECFUtils.ecfParticipantFunctionParser(null)
    assertNull(ecfParticipantFunction)
  }

  function testParseAgreementPartyByIncorrectString() {
    var ecfParticipantFunction = ECFUtils.ecfParticipantFunctionParser("wrong")
    assertNull(ecfParticipantFunction)
  }

  function testParseAgreementPartyByCode() {
    var ecfParticipantFunction = ECFUtils.ecfParticipantFunctionParser(ECFParticipantFunction_Ext.TC_AGREEMENTPARTY.Code)
    assertEquals(ECFParticipantFunction_Ext.TC_AGREEMENTPARTY, ecfParticipantFunction)
  }

  function testParseAgreementPartyByDisplayNameCorrect() {
    var ecfParticipantFunction = ECFUtils.ecfParticipantFunctionParser(ECFParticipantFunction_Ext.TC_AGREEMENTPARTY.DisplayName)
    assertEquals(ECFParticipantFunction_Ext.TC_AGREEMENTPARTY, ecfParticipantFunction)
  }

  function testParseLeadByCode() {
    var ecfParticipantFunction = ECFUtils.ecfParticipantFunctionParser(ECFParticipantFunction_Ext.TC_LEAD.Code)
    assertEquals(ECFParticipantFunction_Ext.TC_LEAD, ecfParticipantFunction)
  }

  function testParseFollowerByCode() {
    var ecfParticipantFunction = ECFUtils.ecfParticipantFunctionParser(ECFParticipantFunction_Ext.TC_FOLLOWER.Code)
    assertEquals(ECFParticipantFunction_Ext.TC_FOLLOWER, ecfParticipantFunction)
  }
}