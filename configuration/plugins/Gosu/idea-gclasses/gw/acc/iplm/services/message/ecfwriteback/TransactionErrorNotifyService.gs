package gw.acc.iplm.services.message.ecfwriteback

uses gw.acc.iplm.services.api.InboundECFService
uses gw.acc.iplm.utils.ECFConstants

class TransactionErrorNotifyService extends InboundECFService<ECFMessageClaimNotifyRq_Ext> {

  /**
   * Process the Transaction Error
   *
   * @param ecfMessage
   */
  override function process(ecfMessage: ECFMessageClaimNotifyRq_Ext) {
    super.updateTransactionState(ecfMessage)
    super.processActivities(ecfMessage)
    setECFLock(ecfMessage)
    super.updateECFLastUpdatedTime(ecfMessage.Claim.refresh() as Claim)
  }

  private function setECFLock(ecfMessage: ECFMessageClaimNotifyRq_Ext) {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      ecfMessage = bundle.add(ecfMessage)
      ecfMessage.Claim.ECFLocked = isTransactionCodeEEvent(ecfMessage)
    }, ECFConstants.ECF_SUPER_USER)
  }

  private function isTransactionCodeEEvent(ecfData: ECFMessageClaimData_Ext): boolean {
    return ecfData.TransactionStatus == null
        or ecfData.TransactionStatus == ECFTransactionStatus_Ext.TC_3
        or ecfData.TransactionStatus == ECFTransactionStatus_Ext.TC_4
  }
}