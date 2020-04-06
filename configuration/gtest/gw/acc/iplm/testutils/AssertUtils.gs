package gw.acc.iplm.testutils

uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.exception.lm.LMErrorCodeType
uses gw.acc.iplm.exception.lm.LMException
uses gw.testharness.v3.GUnitTestClass

class AssertUtils {

  public static function assertCausesECFExceptionWithType(runnable: Runnable, errorCodeType: ECFErrorCodeType) {
    try {
      runnable.run()
    } catch (ex: ECFException) {
      GUnitTestClass.assertEquals("Thrown ECFException had a different Error Code Type.", errorCodeType, ex.ECFErrorCode)
      return
    } catch (ex: Exception) {
      GUnitTestClass.fail("Expected an ECFException to be thrown. Got exception ${ex.Class}")
    }
    GUnitTestClass.fail("Expected an ECFException to be thrown. No exceptions were thrown.")
  }

  public static function assertCausesLMExceptionWithType(runnable: Runnable, errorCodeType: LMErrorCodeType) {
    try {
      runnable.run()
    } catch (ex: LMException) {
      GUnitTestClass.assertEquals("Thrown LMException had a different Error Code Type.", errorCodeType, ex.LMErrorCode)
      return
    } catch (ex: Exception) {
      GUnitTestClass.fail("Expected an LMException to be thrown. Got exception ${ex.Class}")
    }
    GUnitTestClass.fail("Expected an LMException to be thrown. No exceptions were thrown.")
  }

  public static function assertNoLMExceptionThrown(runnable: Runnable, failMessage:String)
  {
    try {
      runnable.run()
    }
    catch(ex:LMException)
    {
      GUnitTestClass.fail(failMessage + "\n"+ex.getStackTraceAsString())
    }
  }

}