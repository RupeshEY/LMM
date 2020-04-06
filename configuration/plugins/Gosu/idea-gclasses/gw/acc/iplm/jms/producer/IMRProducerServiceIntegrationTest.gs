package gw.acc.iplm.jms.producer

uses gw.testharness.KnownBreak
uses gw.testharness.v3.GUnitTestClass

/**
 * This class tests the IMRProducerService class.
 * It relies on an Active MQ instance running on the defined URL and port.
 */
@KnownBreak("Requires an Active MQ Instance")
class IMRProducerServiceIntegrationTest extends GUnitTestClass {

  function testConstructorAndSetup() {
    var imrPS = new IMRProducerService()
    assertNotNull("IMRProducerService was null after initialization", imrPS)
  }

}