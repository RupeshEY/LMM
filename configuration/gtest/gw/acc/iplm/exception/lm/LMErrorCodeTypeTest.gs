package gw.acc.iplm.exception.lm

uses gw.testharness.v3.GUnitTestClass
uses org.apache.commons.lang.StringUtils

class LMErrorCodeTypeTest extends GUnitTestClass {

  private static var allLMValues = LMErrorCodeType.AllValues

  function testLMErrorCodeType_ErrorCode() {
    for (val in allLMValues index idx) {
      assertNotNull("The LMErrorCode at index ${idx} was found to have a null 'ErrorCode' value.", val.ErrorCode)
    }
  }

  function testLMErrorCodeType_ToString() {
    for (val in allLMValues index idx) {
      assertTrue("The LMErrorCode at index ${idx} was found to have a blank 'toString()' value.", StringUtils.isNotBlank(val.toString()))
    }
  }

  function testLMErrorCodeType_PrepareMessage() {
    //Give a parameter array as some ErrorCodes require them
    var paramArray = new String[]{"", "", ""}

    for (val in allLMValues index idx) {
      assertTrue("The LMErrorCode at index ${idx} was found to have a blank 'toString()' value.", StringUtils.isNotBlank(val.MessageFormatter.prepareMessage(paramArray)))
    }
  }

}