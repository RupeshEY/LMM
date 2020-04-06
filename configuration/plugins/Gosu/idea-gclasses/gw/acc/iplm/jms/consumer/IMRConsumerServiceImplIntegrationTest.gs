package gw.acc.iplm.jms.consumer

uses gw.testharness.v3.GUnitTestClass

class IMRConsumerServiceImplIntegrationTest extends GUnitTestClass {

  private var _imrConsumerServiceUnderTest: IMRConsumerService

  override function afterMethod(t : Throwable) {
    super.afterMethod(t)
    _imrConsumerServiceUnderTest = null
  }

  override function beforeMethod() {
    super.beforeMethod()
    _imrConsumerServiceUnderTest = new IMRConsumerService()
  }

  /**
   * Test that the parameters on the consumer service have not been set.
   */
  function testSetParametersNull() {
    _imrConsumerServiceUnderTest.setParameters(null)
    assertNull(_imrConsumerServiceUnderTest.QueueConnectionFactory)
    assertNull(_imrConsumerServiceUnderTest.RecvQueue)
    assertNull(_imrConsumerServiceUnderTest.Backup)
    assertNull(_imrConsumerServiceUnderTest.Failure)
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

    _imrConsumerServiceUnderTest.setParameters(hash)
    assertEquals("ActiveMQ", _imrConsumerServiceUnderTest.QueueConnectionFactory)
    assertEquals("Queue", _imrConsumerServiceUnderTest.RecvQueue)
    assertEquals("Backup", _imrConsumerServiceUnderTest.Backup)
    assertEquals("Failure", _imrConsumerServiceUnderTest.Failure)
  }
}