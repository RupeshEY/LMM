package gw.acc.iplm.jms.consumer

uses gw.testharness.v3.GUnitTestClass

uses java.io.File

class ECFConsumerServiceImplIntegrationTest extends GUnitTestClass {

  private var _ecfConsumerServiceUnderTest: ECFConsumerService

  override function afterMethod(t : Throwable) {
    super.afterMethod(t)
    _ecfConsumerServiceUnderTest = null
  }

  override function beforeMethod() {
    super.beforeMethod()
    _ecfConsumerServiceUnderTest = new ECFConsumerService()
  }

  /**
   * Test that the parameters on the consumer service have not been set.
   */
  function testSetParametersNull() {
    _ecfConsumerServiceUnderTest.setParameters(null)
    assertNull(_ecfConsumerServiceUnderTest.QueueConnectionFactory)
    assertNull(_ecfConsumerServiceUnderTest.RecvQueue)
    assertNull(_ecfConsumerServiceUnderTest.Backup)
    assertNull(_ecfConsumerServiceUnderTest.Failure)
  }

  /**
   * Test that the parameters on the consumer service have been correctly set.
   */
  function testSetParametersNotNull() {
    var hash = new HashMap<Object, Object>()
    hash.put("jmsProvider", "ActiveMQ")
    hash.put("jmsQueue", "Queue")
    hash.put("backup", "Backup")
    hash.put("failure", "Failure")

    _ecfConsumerServiceUnderTest.setParameters(hash)
    assertEquals("ActiveMQ", _ecfConsumerServiceUnderTest.QueueConnectionFactory)
    assertEquals("Queue", _ecfConsumerServiceUnderTest.RecvQueue)
    assertEquals("Backup", _ecfConsumerServiceUnderTest.Backup)
    assertEquals("Failure", _ecfConsumerServiceUnderTest.Failure)
  }

  protected static function appendToTempDirectory(directoryName: String): String {
    return System.getProperty("java.io.tmpdir") + directoryName + File.separator
  }

}