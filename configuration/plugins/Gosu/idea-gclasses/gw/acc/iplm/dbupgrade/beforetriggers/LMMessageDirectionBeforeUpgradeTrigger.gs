package gw.acc.iplm.dbupgrade.beforetriggers

uses gw.api.database.upgrade.before.BeforeUpgradeVersionTrigger
uses gw.api.database.upgrade.before.IBeforeUpgradeColumn

class LMMessageDirectionBeforeUpgradeTrigger extends BeforeUpgradeVersionTrigger {

  private static var LMMESSAGE_EXT_TABLE = "ccx_lmmessage_ext"
  private static var MESSAGE_SUBTYPE_COLUMN = "subtype"
  private static var MESSAGE_DIRECTION_COLUMN = "MessageDirection"

  private var _messageDirCol: IBeforeUpgradeColumn
  private var _messageTable = getTable(LMMESSAGE_EXT_TABLE)
  private var _messageSubtypeMap = getTypeKeys("cctl_lmmessage_ext")
  private var _messageDirectionMap = getTypeKeys("cctl_ecfmessagedirectiontype_ext")

  construct(minorVersionWhenTriggerIsApplicable: int) {
    super(minorVersionWhenTriggerIsApplicable)
  }

  override function execute() {
    _messageTable = getTable(LMMESSAGE_EXT_TABLE)
    _messageDirCol = _messageTable.getColumn(MESSAGE_DIRECTION_COLUMN).create()

    updateMessageDirection("Inbound", "LMMessageLloydsSCM_Ext")
    updateMessageDirection("Inbound", "ECFMessageDocumentSearchRs_Ext")
    updateMessageDirection("Inbound", "ECFMessageDocumentDownloadRs_Ext")
    updateMessageDirection("Inbound", "ECFMessageDocumentUploadRs_Ext")
    updateMessageDirection("Inbound", "ECFMessageDocumentPostRs_Ext")
    updateMessageDirection("Inbound", "ECFMessageClaimNotifyRq_Ext")
    updateMessageDirection("Inbound", "ECFMessageClaimRetrieveRs_Ext")
    updateMessageDirection("Inbound", "ECFMessageClaimResponseRs_Ext")

    updateMessageDirection("Outbound", "ECFMessageDocumentSearchRq_Ext")
    updateMessageDirection("Outbound", "ECFMessageDocumentDownloadRq_Ext")
    updateMessageDirection("Outbound", "ECFMessageDocumentUploadRq_Ext")
    updateMessageDirection("Outbound", "ECFMessageClaimRetrieveRq_Ext")
    updateMessageDirection("Outbound", "ECFMessageClaimResponseRq_Ext")

  }

  function updateMessageDirection(messageDirectionKey: String, messageSubtypeKey: String) {
    var updateTable = _messageTable.update()

    updateTable.set(_messageDirCol, _messageDirectionMap.get(messageDirectionKey))
        .compare(MESSAGE_SUBTYPE_COLUMN, Equals, _messageSubtypeMap.get(messageSubtypeKey))

    updateTable.execute()
  }

  override function hasVersionCheck(): boolean {
    return false
  }

  override property get Description(): String {
    return "Creates and populates the MessageDirection column on the LMMessage_Ext entity."
  }

}