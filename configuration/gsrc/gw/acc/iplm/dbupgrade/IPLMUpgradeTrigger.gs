package gw.acc.iplm.dbupgrade

uses gw.acc.iplm.dbupgrade.aftertriggers.LMImportRiskCodeAfterUpgradeTrigger
uses gw.acc.iplm.dbupgrade.aftertriggers.LMSCMCreationDateAfterUpgradeTrigger
uses gw.acc.iplm.dbupgrade.aftertriggers.LMSCMFinancialsAfterUpgradeTrigger
uses gw.acc.iplm.dbupgrade.aftertriggers.LMSCMCurrenciesAfterUpgradeTrigger
uses gw.acc.iplm.dbupgrade.aftertriggers.LMSCMOCRFieldsAfterUpgradeTrigger
uses gw.acc.iplm.dbupgrade.aftertriggers.LMSCMNarrativeAfterUpgradeTrigger
uses gw.acc.iplm.dbupgrade.aftertriggers.LMSCMReceiverShareAfterUpgradeTrigger
uses gw.acc.iplm.dbupgrade.aftertriggers.LMSCMSyndicateAfterUpgradeTrigger
uses gw.acc.iplm.dbupgrade.aftertriggers.PostRsCategoryAfterUpgradeTrigger
uses gw.acc.iplm.dbupgrade.aftertriggers.LMSCMRiskCodeAfterUpgradeTrigger
uses gw.acc.iplm.dbupgrade.beforetriggers.LMMessageCategoryBeforeUpgradeTrigger
uses gw.acc.iplm.dbupgrade.beforetriggers.LMMessageDirectionBeforeUpgradeTrigger
uses gw.acc.iplm.dbupgrade.beforetriggers.LMSCMDropUnusedColumnsBeforeUpgradeTrigger
uses gw.acc.iplm.dbupgrade.beforetriggers.LMSCMMovementReferenceBeforeUpgradeTrigger
uses gw.acc.iplm.dbupgrade.beforetriggers.LMSCMReceiverShareBeforeUpgradeTrigger
uses gw.acc.iplm.dbupgrade.beforetriggers.activitypatterns.IPLMAddActivityPatternForConflictOfInterestTrigger
uses gw.acc.iplm.dbupgrade.beforetriggers.activitypatterns.IPLMAddActivityPatternForECFCatastropheTrigger
uses gw.acc.iplm.dbupgrade.beforetriggers.activitypatterns.IPLMAddActivityPatternForECFMessagesTrigger
uses gw.acc.iplm.dbupgrade.beforetriggers.activitypatterns.IPLMAddActivityPatternForFinancialApprovalTrigger
uses gw.api.database.upgrade.DatamodelChangeWithoutArchivedDocumentChange
uses gw.api.database.upgrade.after.AfterUpgradeVersionTrigger
uses gw.api.database.upgrade.before.BeforeUpgradeVersionTrigger
uses gw.api.datamodel.upgrade.IDatamodelChange
uses gw.plugin.upgrade.IDatamodelUpgrade

class IPLMUpgradeTrigger implements IDatamodelUpgrade {

  public final var MAJOR_VERSION: Integer = 0

  override property get MajorVersion(): int {
    return MAJOR_VERSION
  }

  override property get BeforeUpgradeDatamodelChanges(): List<IDatamodelChange<BeforeUpgradeVersionTrigger>> {
    var list = new ArrayList<IDatamodelChange<BeforeUpgradeVersionTrigger>>()
    list.add(DatamodelChangeWithoutArchivedDocumentChange.make(new LMMessageCategoryBeforeUpgradeTrigger(177)))
    list.add(DatamodelChangeWithoutArchivedDocumentChange.make(new LMMessageDirectionBeforeUpgradeTrigger(177)))
    list.add(DatamodelChangeWithoutArchivedDocumentChange.make(new LMSCMMovementReferenceBeforeUpgradeTrigger(177)))
    list.add(DatamodelChangeWithoutArchivedDocumentChange.make(new LMSCMDropUnusedColumnsBeforeUpgradeTrigger(177)))
    list.add(DatamodelChangeWithoutArchivedDocumentChange.make(new LMSCMReceiverShareBeforeUpgradeTrigger(177)))
    return list
  }

  override property get AfterUpgradeDatamodelChanges(): List<IDatamodelChange<AfterUpgradeVersionTrigger>> {
    var list = new ArrayList<IDatamodelChange<AfterUpgradeVersionTrigger>>()
    list.add(DatamodelChangeWithoutArchivedDocumentChange.make(new PostRsCategoryAfterUpgradeTrigger(177)))
    list.add(DatamodelChangeWithoutArchivedDocumentChange.make(new LMSCMOCRFieldsAfterUpgradeTrigger(177)))
    list.add(DatamodelChangeWithoutArchivedDocumentChange.make(new LMSCMCurrenciesAfterUpgradeTrigger(177)))
    list.add(DatamodelChangeWithoutArchivedDocumentChange.make(new LMSCMCreationDateAfterUpgradeTrigger(177)))
    list.add(DatamodelChangeWithoutArchivedDocumentChange.make(new LMSCMFinancialsAfterUpgradeTrigger(177)))
    list.add(DatamodelChangeWithoutArchivedDocumentChange.make(new LMSCMNarrativeAfterUpgradeTrigger(177)))
    list.add(DatamodelChangeWithoutArchivedDocumentChange.make(new LMSCMSyndicateAfterUpgradeTrigger(177)))
    list.add(DatamodelChangeWithoutArchivedDocumentChange.make(new LMSCMReceiverShareAfterUpgradeTrigger(177)))
    list.add(DatamodelChangeWithoutArchivedDocumentChange.make(new IPLMAddActivityPatternForFinancialApprovalTrigger(177)))
    list.add(DatamodelChangeWithoutArchivedDocumentChange.make(new IPLMAddActivityPatternForECFMessagesTrigger(177)))
    list.add(DatamodelChangeWithoutArchivedDocumentChange.make(new IPLMAddActivityPatternForConflictOfInterestTrigger(177)))
    list.add(DatamodelChangeWithoutArchivedDocumentChange.make(new IPLMAddActivityPatternForECFCatastropheTrigger(177)))
    list.add(DatamodelChangeWithoutArchivedDocumentChange.make(new LMImportRiskCodeAfterUpgradeTrigger(177)))
    list.add(DatamodelChangeWithoutArchivedDocumentChange.make(new LMSCMRiskCodeAfterUpgradeTrigger(177)))
    return list
  }
}