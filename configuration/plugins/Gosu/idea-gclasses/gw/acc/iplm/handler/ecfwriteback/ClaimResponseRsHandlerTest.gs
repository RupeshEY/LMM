package gw.acc.iplm.handler.ecfwriteback

uses gw.acc.iplm.handler.BaseHandlerTest
uses gw.acc.iplm.services.message.ecfwriteback.ClaimResponseRsService

/**
 * Most tests are defined and inherited from the parent class. Custom tests can be added in this class.
 */
class ClaimResponseRsHandlerTest extends BaseHandlerTest {

  override function beforeMethod() {
    prepareTest()
        .forHandler(new ClaimResponseRsHandler())
        .withValidSubtypes({typekey.LMMessage_Ext.TC_ECFMESSAGECLAIMRESPONSERS_EXT})
        .withExpectedServiceClass(ClaimResponseRsService)
  }
}