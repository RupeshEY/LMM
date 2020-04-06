package gw.acc.iplm.jms.consumer

uses gw.testharness.v3.GUnitTestClass

class LMMConsumerServiceImplIntegrationTest extends GUnitTestClass {

  private var _lmmConsumerServiceUnderTest: ECFConsumerService

  override function afterMethod(t : Throwable) {
    super.afterMethod(t)
    _lmmConsumerServiceUnderTest = null
  }

  override function beforeMethod() {
    super.beforeMethod()
    _lmmConsumerServiceUnderTest = new ECFConsumerService()
  }

  /**
   * Test that the parameters on the consumer service have not been set.
   */
  function testSetParametersNull() {
    _lmmConsumerServiceUnderTest.setParameters(null)
    assertNull(_lmmConsumerServiceUnderTest.QueueConnectionFactory)
    assertNull(_lmmConsumerServiceUnderTest.RecvQueue)
    assertNull(_lmmConsumerServiceUnderTest.Backup)
    assertNull(_lmmConsumerServiceUnderTest.Failure)
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

    _lmmConsumerServiceUnderTest.setParameters(hash)
    assertEquals("ActiveMQ", _lmmConsumerServiceUnderTest.QueueConnectionFactory)
    assertEquals("Queue", _lmmConsumerServiceUnderTest.RecvQueue)
    assertEquals("Backup", _lmmConsumerServiceUnderTest.Backup)
    assertEquals("Failure", _lmmConsumerServiceUnderTest.Failure)
  }
}