package gw.acc.iplm.exception.ecfwb

uses gw.testharness.v3.GUnitTestClass
uses org.apache.commons.lang.StringUtils


class ECFErrorCodeTypeTest extends GUnitTestClass {

  private static var allECFValues = ECFErrorCodeType.AllValues

  function testECFErrorCodeType_ErrorCode() {
    for (val in allECFValues index idx) {
      assertNotNull("The ECFErrorCode at index ${idx} was found to have a null 'ErrorCode' value.", val.ErrorCode)
    }
  }

  function testECFErrorCodeType_ToString() {
    for (val in allECFValues index idx) {
      assertTrue("The ECFErrorCode at index ${idx} was found to have a blank 'toString()' value.", StringUtils.isNotBlank(val.toString()))
    }
  }

  function testECFErrorCodeType_PrepareMessage() {
    //Give a parameter array as some ErrorCodes require them
    var paramArray = new String[]{"", "", ""}

    for (val in allECFValues index idx) {
      assertTrue("The ECFErrorCode at index ${idx} was found to have a blank 'toString()' value.", StringUtils.isNotBlank(val.MessageFormatter.prepareMessage(paramArray)))
    }
  }

}