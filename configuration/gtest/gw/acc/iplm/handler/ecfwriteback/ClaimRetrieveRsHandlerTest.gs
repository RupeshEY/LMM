package gw.acc.iplm.handler.ecfwriteback

uses gw.acc.iplm.handler.BaseHandlerTest
uses gw.acc.iplm.services.message.ecfwriteback.ClaimRetrieveRsService

/**
 * Most tests are defined and inherited from the parent class. Custom tests can be added in this class.
 */
class ClaimRetrieveRsHandlerTest extends BaseHandlerTest {

  override function beforeMethod() {
    prepareTest()
        .forHandler(new ClaimRetrieveRsHandler())
        .withValidSubtypes({typekey.LMMessage_Ext.TC_ECFMESSAGECLAIMRETRIEVERS_EXT})
        .withExpectedServiceClass(ClaimRetrieveRsService)
  }
}