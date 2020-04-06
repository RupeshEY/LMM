package gw.acc.iplm.dbupgrade.beforetriggers

uses gw.api.database.upgrade.before.BeforeUpgradeVersionTrigger

class LMSCMMovementReferenceBeforeUpgradeTrigger extends BeforeUpgradeVersionTrigger {

  private final var LMMESSAGE_EXT_TABLE = "ccx_lmmessage_ext"
  private final var MESSAGE_SUBTYPE_COLUMN = "subtype"
  private final var MOVEMENT_REFERENCE_SEQUENCE_COLUMN = LMMessageLloydsSCM_Ext#MovementReferenceSequence.PropertyInfo.Name
  private final var SCM_SUBTYPE_ID = getTypeKeys("cctl_lmmessage_ext").get(LMMessageLloydsSCM_Ext.RelativeName)

  private final var DEFAULT_VALUE = "Invalid"

  construct(minorVersionWhenTriggerIsApplicable: int) {
    super(minorVersionWhenTriggerIsApplicable)
  }

  override function execute() {
    updateMovementReferenceToDefaultValue()
  }

  private function updateMovementReferenceToDefaultValue() {
    var messageTable = getTable(LMMESSAGE_EXT_TABLE)

    var movementReferenceSequenceCol = messageTable.getColumn(MOVEMENT_REFERENCE_SEQUENCE_COLUMN).create()
    var updateTable = messageTable.update()

    updateTable.set(movementReferenceSequenceCol, DEFAULT_VALUE)
        .compare(MESSAGE_SUBTYPE_COLUMN, Equals, SCM_SUBTYPE_ID)

    updateTable.execute()
  }

  override function hasVersionCheck(): boolean {
    return false
  }

  override property get Description(): String {
    return "Creates and populates the MovementReference column with a default value on the LMMessage_Ext entity."
  }

}