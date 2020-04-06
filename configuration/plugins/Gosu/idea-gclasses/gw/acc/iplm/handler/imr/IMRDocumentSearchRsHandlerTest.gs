package gw.acc.iplm.handler.imr

uses gw.acc.iplm.handler.BaseHandlerTest
uses gw.acc.iplm.services.message.imr.IMRDocumentSearchRsService

/**
 * Most tests are defined and inherited from the parent class. Custom tests can be added in this class.
 */
class IMRDocumentSearchRsHandlerTest extends BaseHandlerTest {

  override function beforeMethod() {
    prepareTest()
        .forHandler(new IMRDocumentSearchRsHandler())
        .withValidSubtypes({typekey.LMMessage_Ext.TC_ECFMESSAGEDOCUMENTSEARCHRS_EXT})
        .withExpectedServiceClass(IMRDocumentSearchRsService)
  }
}