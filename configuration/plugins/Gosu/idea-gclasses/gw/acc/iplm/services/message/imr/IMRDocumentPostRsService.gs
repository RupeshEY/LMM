package gw.acc.iplm.services.message.imr

uses gw.acc.iplm.services.activity.ActivityBuilder
uses gw.acc.iplm.services.api.InboundIMRService
uses gw.acc.iplm.utils.ECFConstants
uses gw.api.locale.DisplayKey

class IMRDocumentPostRsService extends InboundIMRService<ECFMessageDocumentPostRs_Ext> {

  override function process(message: ECFMessageDocumentPostRs_Ext) {
    LOGGER.info("Start processing Document Receipt Message")

    resetDocumentStatusWhenFailed(message)
    createActivityWhenFailed(message)
  }

  private function resetDocumentStatusWhenFailed(message: ECFMessageDocumentPostRs_Ext) {
    final var messageTypeToECFStatusMap = {ECFMessageType_Ext.TC_REPOSITORYDOWNLOAD -> ECFDocumentStatus_Ext.TC_ON_IMR,
                                           ECFMessageType_Ext.TC_REPOSITORYUPLOAD -> ECFDocumentStatus_Ext.TC_ON_DMS }

    if (message.OperationStatus != ECFDocumentMsgStatus_Ext.TC_RECEIVED and messageTypeToECFStatusMap.containsKey(message.ReferredMessage.MessageType)) {
      final var documentStatus = messageTypeToECFStatusMap.get(message.ReferredMessage.MessageType)

      LOGGER.info("Updating status of Document ${message.ReferredMessage.Document} to ${documentStatus}")

      gw.transaction.Transaction.runWithNewBundle(\bundle -> {
        var document = bundle.add(message.ReferredMessage.Document)
        document.ECFStatus = documentStatus
      }, ECFConstants.ECF_SUPER_USER)

    }
  }

  private function createActivityWhenFailed(message: ECFMessageDocumentPostRs_Ext): void {

    if (message.OperationStatus != ECFDocumentMsgStatus_Ext.TC_RECEIVED) {
      gw.transaction.Transaction.runWithNewBundle(\bundle -> {

        new ActivityBuilder(message.Claim)
            .withShortSubject(DisplayKey.get("Accelerator.IPLM.Activity.IMR.PostRsFailed.ShortSubject"))
            .withSubject(DisplayKey.get("Accelerator.IPLM.Activity.IMR.PostRsFailed.Subject", message.ReferredMessage.MessageTypeString))
            .withDescription(DisplayKey.get("Accelerator.IPLM.Activity.IMR.PostRsFailed.Description", message.ReferredMessage.MessageTypeString, message.Claim, message.OperationStatus))
            .withMessage(message)
            .createActivity()

      }, ECFConstants.ECF_SUPER_USER)
    }
  }
}