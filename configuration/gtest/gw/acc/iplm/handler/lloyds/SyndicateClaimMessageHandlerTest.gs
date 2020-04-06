package gw.acc.iplm.handler.lloyds

uses gw.acc.iplm.handler.BaseHandlerTest
uses gw.acc.iplm.services.message.lloyds.SyndicateClaimMessageService

class SyndicateClaimMessageHandlerTest extends BaseHandlerTest {
  override function beforeMethod() {
    prepareTest()
    .forHandler(new SyndicateClaimMessageHandler())
    .withValidSubtypes({typekey.LMMessage_Ext.TC_LMMESSAGELLOYDSSCM_EXT})
    .withExpectedServiceClass(SyndicateClaimMessageService)
  }
}