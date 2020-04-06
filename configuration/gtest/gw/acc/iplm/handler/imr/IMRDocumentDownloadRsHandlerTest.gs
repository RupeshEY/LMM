package gw.acc.iplm.handler.imr

uses gw.acc.iplm.handler.BaseHandlerTest
uses gw.acc.iplm.services.message.imr.IMRDocumentDownloadRsService

/**
 * Most tests are defined and inherited from the parent class. Custom tests can be added in this class.
 */
class IMRDocumentDownloadRsHandlerTest extends BaseHandlerTest {

  override function beforeMethod() {
    prepareTest()
        .forHandler(new IMRDocumentDownloadRsHandler())
        .withValidSubtypes({typekey.LMMessage_Ext.TC_ECFMESSAGEDOCUMENTDOWNLOADRS_EXT})
        .withExpectedServiceClass(IMRDocumentDownloadRsService)
  }
}