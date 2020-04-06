package gw.acc.iplm.dbupgrade.beforetriggers

uses gw.api.database.upgrade.before.BeforeUpgradeVersionTrigger
uses gw.api.database.upgrade.before.IBeforeUpgradeColumn

class LMMessageCategoryBeforeUpgradeTrigger extends BeforeUpgradeVersionTrigger {

  private static var LMMESSAGE_EXT_TABLE = "ccx_lmmessage_ext"
  private static var MESSAGE_SUBTYPE_COLUMN = "subtype"
  private static var MESSAGE_CATEGORY_COLUMN = "MessageCategory"

  private var _messageCatCol: IBeforeUpgradeColumn
  private var _messageTable = getTable(LMMESSAGE_EXT_TABLE)
  private var _messageSubtypeMap = getTypeKeys("cctl_lmmessage_ext")
  private var _messageCategoryMap = getTypeKeys("cctl_lmmessagecategory_ext")

  construct(minorVersionWhenTriggerIsApplicable: int) {
    super(minorVersionWhenTriggerIsApplicable)
  }

  override function execute() {
    _messageCatCol = _messageTable.getColumn(MESSAGE_CATEGORY_COLUMN).create()

    updateMessageCategory("LloydsSCM", "LMMessageLloydsSCM_Ext")

    updateMessageCategory("IMRDocumentSearch", "ECFMessageDocumentSearchRq_Ext")
    updateMessageCategory("IMRDocumentSearch", "ECFMessageDocumentSearchRs_Ext")

    updateMessageCategory("IMRDocumentDownload", "ECFMessageDocumentDownloadRq_Ext")
    updateMessageCategory("IMRDocumentDownload", "ECFMessageDocumentDownloadRs_Ext")

    updateMessageCategory("IMRDocumentUpload", "ECFMessageDocumentUploadRq_Ext")
    updateMessageCategory("IMRDocumentUpload", "ECFMessageDocumentUploadRs_Ext")

    //PostRs is always being set as DocumentSearch and will be given a real value
    //in the AfterUpgradeTrigger.
    updateMessageCategory("IMRDocumentSearch", "ECFMessageDocumentPostRs_Ext")

    updateMessageCategory("ECFClaimNotify", "ECFMessageClaimNotifyRq_Ext")

    updateMessageCategory("ECFClaimRetrieve", "ECFMessageClaimRetrieveRq_Ext")
    updateMessageCategory("ECFClaimRetrieve", "ECFMessageClaimRetrieveRs_Ext")

    updateMessageCategory("ECFClaimResponse", "ECFMessageClaimResponseRq_Ext")
    updateMessageCategory("ECFClaimResponse", "ECFMessageClaimResponseRs_Ext")
  }

  function updateMessageCategory(messageCategoryKey: String, messageSubtypeKey: String) {
    var updateTable = _messageTable.update()

    updateTable.set(_messageCatCol, _messageCategoryMap.get(messageCategoryKey))
        .compare(MESSAGE_SUBTYPE_COLUMN, Equals, _messageSubtypeMap.get(messageSubtypeKey))

    updateTable.execute()
  }

  override function hasVersionCheck(): boolean {
    return false
  }

  override property get Description(): String {
    return "Creates and populates the MessageCategory column on the LMMessage_Ext entity."
  }

}