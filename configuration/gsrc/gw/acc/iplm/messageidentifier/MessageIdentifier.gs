package gw.acc.iplm.messageidentifier

uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.messageidentifier.ecfwriteback.ClaimNotifyRqMessageIdentifier
uses gw.acc.iplm.messageidentifier.ecfwriteback.ClaimResponseRqMessageIdentifier
uses gw.acc.iplm.messageidentifier.ecfwriteback.ClaimResponseRsMessageIdentifier
uses gw.acc.iplm.messageidentifier.ecfwriteback.ClaimRetrieveRqMessageIdentifier
uses gw.acc.iplm.messageidentifier.ecfwriteback.ClaimRetrieveRsMessageIdentifier
uses gw.acc.iplm.messageidentifier.imr.DocumentDownloadReceiptMessageIdentifier
uses gw.acc.iplm.messageidentifier.imr.DocumentDownloadRqMessageIdentifier
uses gw.acc.iplm.messageidentifier.imr.DocumentDownloadRsMessageIdentifier
uses gw.acc.iplm.messageidentifier.imr.DocumentSearchReceiptMessageIdentifier
uses gw.acc.iplm.messageidentifier.imr.DocumentSearchRqMessageIdentifier
uses gw.acc.iplm.messageidentifier.imr.DocumentSearchRsMessageIdentifier
uses gw.acc.iplm.messageidentifier.imr.DocumentUploadReceiptMessageIdentifier
uses gw.acc.iplm.messageidentifier.imr.DocumentUploadRqMessageIdentifier
uses gw.acc.iplm.messageidentifier.imr.DocumentUploadRsMessageIdentifier
uses gw.acc.iplm.messageidentifier.lloyds.SyndicateClaimMessageIdentifier
uses gw.xml.XmlElement

class MessageIdentifier {

  /**
   * Chain of Message Identifier Classes.
   * By default it is initialized with an element that throws an Illegal Message Type Exception when no message was identified
   */
  var _chain : BaseMessageIdentifier = new BaseMessageIdentifier() {

    override function canHandle(element: XmlElement): Boolean {
      return true
    }

    override function messageType(): LMMessageTypeString_Ext {
      throw new ECFException(ECFErrorCodeType.ILLEGAL_MESSAGE_TYPE_ERROR)
    }
  }

  construct() {
    _chain = _chain
                .add(new ClaimNotifyRqMessageIdentifier())
                .add(new ClaimResponseRqMessageIdentifier())
                .add(new ClaimResponseRsMessageIdentifier())
                .add(new ClaimRetrieveRqMessageIdentifier())
                .add(new ClaimRetrieveRsMessageIdentifier())
                .add(new DocumentDownloadRqMessageIdentifier())
                .add(new DocumentDownloadRsMessageIdentifier())
                .add(new DocumentDownloadReceiptMessageIdentifier())
                .add(new DocumentSearchRqMessageIdentifier())
                .add(new DocumentSearchRsMessageIdentifier())
                .add(new DocumentSearchReceiptMessageIdentifier())
                .add(new DocumentUploadRqMessageIdentifier())
                .add(new DocumentUploadRsMessageIdentifier())
                .add(new DocumentUploadReceiptMessageIdentifier())
                .add(new SyndicateClaimMessageIdentifier())
  }

  /**
   * Iterates through the chain and return the first LMMessageTypeString_Ext that was correctly identified
   *
   * @param message - message under analysis
   * @return - LMMessageTypeString_Ext object identified by this chain
   */
  function identifyMessageType(message: XmlElement) : LMMessageTypeString_Ext {
    return _chain.identifyMessageType(message)
  }
}