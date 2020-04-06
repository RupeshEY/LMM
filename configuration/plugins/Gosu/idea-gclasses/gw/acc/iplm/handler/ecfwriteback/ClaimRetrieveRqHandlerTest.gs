package gw.acc.iplm.handler.ecfwriteback

uses gw.acc.iplm.handler.BaseHandlerTest
uses gw.acc.iplm.services.message.ecfwriteback.ClaimRetrieveRqService

/**
 * Most tests are defined and inherited from the parent class. Custom tests can be added in this class.
 */
class ClaimRetrieveRqHandlerTest extends BaseHandlerTest {

  override function beforeMethod() {
    prepareTest()
        .forHandler(new ClaimRetrieveRqHandler())
        .withValidSubtypes({typekey.LMMessage_Ext.TC_ECFMESSAGECLAIMRETRIEVERQ_EXT})
        .withExpectedServiceClass(ClaimRetrieveRqService)
  }
}