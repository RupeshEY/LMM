package gw.acc.iplm.handler.ecfwriteback

uses gw.acc.iplm.handler.BaseHandlerTest
uses gw.acc.iplm.services.message.ecfwriteback.ClaimResponseRqService

/**
 * Most tests are defined and inherited from the parent class. Custom tests can be added in this class.
 */
class ClaimResponseRqHandlerTest extends BaseHandlerTest {

  override function beforeMethod() {
    prepareTest()
        .forHandler(new ClaimResponseRqHandler())
        .withValidSubtypes({typekey.LMMessage_Ext.TC_ECFMESSAGECLAIMRESPONSERQ_EXT})
        .withExpectedServiceClass(ClaimResponseRqService)
  }
}