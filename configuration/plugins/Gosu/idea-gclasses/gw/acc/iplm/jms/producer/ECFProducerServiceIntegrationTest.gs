package gw.acc.iplm.jms.producer

uses gw.testharness.KnownBreak
uses gw.testharness.v3.GUnitTestClass

/**
 * This class tests the ECFProducerService class.
 * It relies on an Active MQ instance running on the defined URL and port.
 */
@KnownBreak("Requires an Active MQ Instance")
class ECFProducerServiceIntegrationTest extends GUnitTestClass {

  function testConstructorAndSetup() {
    var ecfPS = new ECFProducerService()
    assertNotNull("ECFProducerService was null after initialization", ecfPS)
  }

}