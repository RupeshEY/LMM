package gw.acc.iplm.handler.imr

uses gw.acc.iplm.handler.BaseHandlerTest
uses gw.acc.iplm.services.message.imr.IMRDocumentPostRsService

/**
 * Most tests are defined and inherited from the parent class. Custom tests can be added in this class.
 */
class IMRDocumentPostRsHandlerTest extends BaseHandlerTest {

    override function beforeMethod() {
        prepareTest()
        .forHandler(new IMRDocumentPostRsHandler())
        .withValidSubtypes({typekey.LMMessage_Ext.TC_ECFMESSAGEDOCUMENTPOSTRS_EXT})
        .withExpectedServiceClass(IMRDocumentPostRsService)
    }
}