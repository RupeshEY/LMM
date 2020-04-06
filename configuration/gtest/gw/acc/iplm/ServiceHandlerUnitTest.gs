package gw.acc.iplm

uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.testharness.v3.GUnitTestClass


class ServiceHandlerUnitTest extends GUnitTestClass {

  var _serviceHandler: ServiceHandler = null

  //ECF Exception with null payload
  public function testWithNullPayLoad() {

    try {
      _serviceHandler = new ServiceHandler()
      _serviceHandler.messageDispatcher(null)
      fail("This line should not execute")
    } catch (ex: ECFException) {
      assertEquals(ECFErrorCodeType.ILLEGAL_MESSAGE_TYPE_ERROR, ex.ECFErrorCode)
    }
  }

}