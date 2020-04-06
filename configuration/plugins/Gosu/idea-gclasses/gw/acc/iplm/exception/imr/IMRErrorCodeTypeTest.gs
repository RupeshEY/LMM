package gw.acc.iplm.exception.imr

uses gw.testharness.v3.GUnitTestClass
uses org.apache.commons.lang.StringUtils


class IMRErrorCodeTypeTest extends GUnitTestClass {

  private static var allIMRValues = IMRErrorCodeType.AllValues

  function testIMRErrorCodeType_ErrorCode() {
    for (val in allIMRValues index idx) {
      assertNotNull("The IMRErrorCode at index ${idx} was found to have a null 'ErrorCode' value.", val.ErrorCode)
    }
  }

  function testIMRErrorCodeType_ToString() {
    for (val in allIMRValues index idx) {
      assertTrue("The IMRErrorCode at index ${idx} was found to have a blank 'toString()' value.", StringUtils.isNotBlank(val.toString()))
    }
  }

  function testIMRErrorCodeType_PrepareMessage() {
    //Give a parameter array as some ErrorCodes require them
    var paramArray = new String[]{"", "", ""}

    for (val in allIMRValues index idx) {
      assertTrue("The IMRErrorCode at index ${idx} was found to have a blank 'toString()' value.", StringUtils.isNotBlank(val.MessageFormatter.prepareMessage(paramArray)))
    }
  }

}