package gw.acc.iplm.handler.imr

uses gw.acc.iplm.handler.BaseHandlerTest
uses gw.acc.iplm.services.message.imr.IMRDocumentUploadRsService

/**
 * Most tests are defined and inherited from the parent class. Custom tests can be added in this class.
 */
class IMRDocumentUploadRsHandlerTest extends BaseHandlerTest {

  override function beforeMethod() {
    prepareTest()
        .forHandler(new IMRDocumentUploadRsHandler())
        .withValidSubtypes({typekey.LMMessage_Ext.TC_ECFMESSAGEDOCUMENTUPLOADRS_EXT})
        .withExpectedServiceClass(IMRDocumentUploadRsService)
  }
}