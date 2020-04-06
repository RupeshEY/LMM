package gw.acc.iplm.dbupgrade.aftertriggers

uses gw.acc.iplm.utils.ECFConstants
uses gw.api.database.InOperation
uses gw.api.database.Query
uses gw.api.database.upgrade.after.AfterUpgradeVersionTrigger

class PostRsCategoryAfterUpgradeTrigger extends AfterUpgradeVersionTrigger {

  private static var REFERRED_UUID_COL = "ReferredUUID"
  private static var UUID_COL = "UUID"

  construct(minorVersionWhenTriggerIsApplicable: int) {
    super(minorVersionWhenTriggerIsApplicable)
  }

  override function execute() {

    var docSearchPostRsList = getPostRsMessages(ECFMessageDocumentSearchRq_Ext)
    var docDownloadPostRsList = getPostRsMessages(ECFMessageDocumentDownloadRq_Ext)
    var docUploadPostRsList = getPostRsMessages(ECFMessageDocumentUploadRq_Ext)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      docSearchPostRsList.each(\msg -> {
        msg = bundle.add(msg)
        msg.MessageCategory = LMMessageCategory_Ext.TC_IMRDOCUMENTSEARCH
      })

      docDownloadPostRsList.each(\msg -> {
        msg = bundle.add(msg)
        msg.MessageCategory = LMMessageCategory_Ext.TC_IMRDOCUMENTDOWNLOAD
      })

      docUploadPostRsList.each(\msg -> {
        msg = bundle.add(msg)
        msg.MessageCategory = LMMessageCategory_Ext.TC_IMRDOCUMENTUPLOAD
      })
    }, ECFConstants.ECF_SUPER_USER)

  }

  private function getPostRsMessages(imrMessageType: Type): List<entity.ECFMessageDocumentPostRs_Ext> {
    return Query.make(ECFMessageDocumentPostRs_Ext)
        .subselect(REFERRED_UUID_COL, InOperation.CompareIn, Query.make(imrMessageType), UUID_COL)
        .select().toList()
  }

  override property get Description(): String {
    return "Populates the MessageCategory column on the ECFMessageDocumentPostRs_Ext entities."
  }

}