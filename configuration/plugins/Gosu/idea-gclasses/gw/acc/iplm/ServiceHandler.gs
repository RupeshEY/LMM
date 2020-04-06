package gw.acc.iplm

uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.handler.AbstractBaseHandler
uses gw.acc.iplm.handler.ecfwriteback.ClaimNotifyHandler
uses gw.acc.iplm.handler.ecfwriteback.ClaimResponseRqHandler
uses gw.acc.iplm.handler.ecfwriteback.ClaimResponseRsHandler
uses gw.acc.iplm.handler.ecfwriteback.ClaimRetrieveRqHandler
uses gw.acc.iplm.handler.ecfwriteback.ClaimRetrieveRsHandler
uses gw.acc.iplm.handler.imr.IMRDocumentDownloadRqHandler
uses gw.acc.iplm.handler.imr.IMRDocumentDownloadRsHandler
uses gw.acc.iplm.handler.imr.IMRDocumentPostRsHandler
uses gw.acc.iplm.handler.imr.IMRDocumentSearchRqHandler
uses gw.acc.iplm.handler.imr.IMRDocumentSearchRsHandler
uses gw.acc.iplm.handler.imr.IMRDocumentUploadRqHandler
uses gw.acc.iplm.handler.imr.IMRDocumentUploadRsHandler
uses gw.acc.iplm.handler.lloyds.SyndicateClaimMessageHandler

/**
 * This ServiceHandler class uses the 'Chain of Responsibility' design pattern to process incoming XML Strings
 * and forwarding them to the relevant service handlers.
 */
class ServiceHandler {

  /**
   * Chain of message service handlers
   * Initialised with a default handler which throws an 'Unsupported Exception'
   * when an unknown message type is found.
   */
  var _chain: AbstractBaseHandler = new AbstractBaseHandler(null) {

    override function canHandle(lmMessageType: typekey.LMMessage_Ext): boolean {
      return true
    }

    override function processMessage(lmMessage: entity.LMMessage_Ext) {
      throw new ECFException(ECFErrorCodeType.ILLEGAL_MESSAGE_TYPE_ERROR)
    }
  }

  /**
   * Construct the Factory, chaining together the 'Chain of Responsibility'
   */
  construct() {
    //ACC-3786 TODO - change this to some sort of package or annotation scanner
    _chain = _chain
        .add(new ClaimNotifyHandler())
        .add(new ClaimResponseRqHandler())
        .add(new ClaimResponseRsHandler())
        .add(new ClaimRetrieveRqHandler())
        .add(new ClaimRetrieveRsHandler())
        .add(new IMRDocumentSearchRqHandler())
        .add(new IMRDocumentSearchRsHandler())
        .add(new IMRDocumentDownloadRqHandler())
        .add(new IMRDocumentDownloadRsHandler())
        .add(new IMRDocumentUploadRqHandler())
        .add(new IMRDocumentUploadRsHandler())
        .add(new IMRDocumentPostRsHandler())
        .add(new SyndicateClaimMessageHandler())
  }

  /**
   * This method dispatches messages to the relevant service handler after
   * identifying the message type.
   *
   * @param LMMessage_Ext The LMMessage_Ext entity containing the XML message to inspect
   */
  function messageDispatcher(lmMessage: entity.LMMessage_Ext) {
    _chain.handle(lmMessage)
  }
}
