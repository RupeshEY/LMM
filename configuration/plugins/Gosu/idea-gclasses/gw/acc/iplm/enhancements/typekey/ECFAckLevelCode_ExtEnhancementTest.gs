package gw.acc.iplm.enhancements.typekey

uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.testharness.v3.GUnitTestClass

class ECFAckLevelCode_ExtEnhancementTest extends GUnitTestClass {

  function testGetByNameRetrivesElement() {
    var ackLevel = ECFAckLevelCode_ExtEnhancement.getByName("Partial Response - CLASS Unavailable/Unable to retrieve CLASS data")

    assertEquals("Did not find correct element", ECFAckLevelCode_Ext.TC_PARTIALRESPONSECLASS, ackLevel)
  }

  function testGetByNameRetrivesUnknownOnUnknownName() {
    var ackLevel = ECFAckLevelCode_ExtEnhancement.getByName("This is an unknown message")

    assertEquals("Expecting unknown level code", ECFAckLevelCode_Ext.TC_UNKNOWN, ackLevel)
  }

  function testECFErrorCodeOnNonErrorResponse() {
    var ackLevel = ECFAckLevelCode_Ext.TC_SUCCESS

    assertNull("Error Code should be null when message was successfull", ackLevel.ECFErrorCode)
  }

  function testECFErrorCodeOnErrorResponse() {
    var ackLevel = ECFAckLevelCode_Ext.TC_PARTIALRESPONSEIMR

    assertEquals("Error Code should be defined", ECFErrorCodeType.CLAIM_RETRIEVE_RESPONSE_IMR_UNAVAILABLE.ErrorCode, ackLevel.ECFErrorCode.ErrorCode)
  }
}