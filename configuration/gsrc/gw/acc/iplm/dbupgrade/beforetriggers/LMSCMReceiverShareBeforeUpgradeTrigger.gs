package gw.acc.iplm.dbupgrade.beforetriggers

uses gw.api.database.upgrade.before.BeforeUpgradeVersionTrigger

class LMSCMReceiverShareBeforeUpgradeTrigger extends BeforeUpgradeVersionTrigger {

  private final var LMMESSAGE_EXT_TABLE = "ccx_lmmessage_ext"
  private final var MESSAGE_SUBTYPE_COLUMN = "subtype"
  private final var RECEIVER_SHARE_COLUMN = LMMessageLloydsSCM_Ext#ReceiverShare.PropertyInfo.Name
  private final var SCM_SUBTYPE_ID = getTypeKeys("cctl_lmmessage_ext").get(LMMessageLloydsSCM_Ext.RelativeName)

  private final var DEFAULT_VALUE = 0bd

  construct(minorVersionWhenTriggerIsApplicable: int) {
    super(minorVersionWhenTriggerIsApplicable)
  }

  override function execute() {
    updateMovementReferenceToDefaultValue()
  }

  private function updateMovementReferenceToDefaultValue() {
    var messageTable = getTable(LMMESSAGE_EXT_TABLE)

    var receiverShareCol = messageTable.getColumn(RECEIVER_SHARE_COLUMN).create()
    var updateTable = messageTable.update()

    updateTable.set(receiverShareCol, DEFAULT_VALUE)
        .compare(MESSAGE_SUBTYPE_COLUMN, Equals, SCM_SUBTYPE_ID)

    updateTable.execute()
  }

  override function hasVersionCheck(): boolean {
    return false
  }

  override property get Description(): String {
    return "Creates and populates the ReceiverShare Column with a default value on the LMMessage_Ext entity."
  }

}