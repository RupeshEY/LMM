package gw.acc.iplm.handler.imr

uses gw.acc.iplm.handler.BaseHandlerTest
uses gw.acc.iplm.services.message.imr.IMRDocumentDownloadRqService

/**
 * Most tests are defined and inherited from the parent class. Custom tests can be added in this class.
 */
class IMRDocumentDownloadRqHandlerTest extends BaseHandlerTest {

  override function beforeMethod() {
    prepareTest()
        .forHandler(new IMRDocumentDownloadRqHandler())
        .withValidSubtypes({typekey.LMMessage_Ext.TC_ECFMESSAGEDOCUMENTDOWNLOADRQ_EXT})
        .withExpectedServiceClass(IMRDocumentDownloadRqService)
  }
}