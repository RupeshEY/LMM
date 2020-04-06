package gw.acc.iplm.handler.ecfwriteback

uses gw.acc.iplm.handler.AbstractBaseHandler
uses gw.acc.iplm.services.message.ecfwriteback.ClaimNotifyService
uses gw.acc.iplm.services.message.ecfwriteback.RespondErrorNotifyService
uses gw.acc.iplm.services.message.ecfwriteback.TransactionErrorNotifyService

class ClaimNotifyHandler extends AbstractBaseHandler<ECFMessageClaimNotifyRq_Ext> {

  private var _respondErrorNotifyService: RespondErrorNotifyService as RespondErrorNotifyService = new RespondErrorNotifyService()
  private var _transactionErrorNotifyService: TransactionErrorNotifyService as TransactionErrorNotifyService = new TransactionErrorNotifyService()

  construct() {
    super(new ClaimNotifyService())
  }

  override function canHandle(messageType: typekey.LMMessage_Ext): boolean {
    return messageType == typekey.LMMessage_Ext.TC_ECFMESSAGECLAIMNOTIFYRQ_EXT
  }

  override function processMessage(ecfMessage: ECFMessageClaimNotifyRq_Ext) {
    if (ecfMessage.MessageType == ECFMessageType_Ext.TC_RESPONDERRORNOTIFY) {
      this.Service = _respondErrorNotifyService
    } else if (ecfMessage.MessageType == ECFMessageType_Ext.TC_TRANSACTIONERRORNOTIFY) {
      this.Service = _transactionErrorNotifyService
    }

    super.processMessage(ecfMessage)
  }
}