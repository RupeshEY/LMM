package gw.acc.iplm.dbupgrade.beforetriggers

uses gw.api.database.upgrade.before.BeforeUpgradeVersionTrigger

class LMSCMDropUnusedColumnsBeforeUpgradeTrigger extends BeforeUpgradeVersionTrigger {

  private final var LMMESSAGE_EXT_TABLE = "ccx_lmmessage_ext"
  private final var CREATION_DATE_COLUMN = LMMessageLloydsSCM_Ext#CreationDate.PropertyInfo.Name
  private final var EXPLANATION_COLUMN = "explanation" // This column has been renamed to Narrative, so this is the only way to access it

  construct(minorVersionWhenTriggerIsApplicable: int) {
    super(minorVersionWhenTriggerIsApplicable)
  }

  override function execute() {
    updateMovementReferenceToDefaultValue()
  }

  private function updateMovementReferenceToDefaultValue() {
    var messageTable = getTable(LMMESSAGE_EXT_TABLE)
    messageTable.getColumn(CREATION_DATE_COLUMN).drop()
    messageTable.getColumn(EXPLANATION_COLUMN).drop()
  }

  override function hasVersionCheck(): boolean {
    return false
  }

  override property get Description(): String {
    return "Drops the CreationDate and Explanation Columns of SCM messages. These columns were never populated in this release (so they're safe to be dropped) and they are going to be created with a different type/name after this."
  }
}