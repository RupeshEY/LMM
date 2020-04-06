package gw.plugin.taxframework
uses gw.plugin.financials.IBackupWithholdingPlugin
uses gw.util.BackupWithholdingCalculator

@Export
class BackupWithholdingPlugin implements IBackupWithholdingPlugin
{
  private var backupWithholdingCalculator : BackupWithholdingCalculator
  
  construct()
  {
    backupWithholdingCalculator = new BackupWithholdingCalculator()
  }

  override function getDeductions( check : Check ) : Deduction[]
  {
    return backupWithholdingCalculator.computeDeductions( check )
  }

}
