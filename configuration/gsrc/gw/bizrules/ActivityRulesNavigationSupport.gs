package gw.bizrules

uses gw.cc.bizrules.ActivityRulesVersionController
uses gw.api.util.DisplayableException
uses gw.bizrules.pcf.DefaultBizRulesPageNavigationSupport
uses gw.bizrules.pcf.RuleExportImportPageHelper
uses gw.cc.bizrules.ActivityRulesUtil
uses pcf.ActivityRuleComparisonPopup
uses pcf.ActivityRuleExportImportStatus
uses pcf.ActivityRulePopup
uses pcf.ActivityRules
uses pcf.CreateActivityRule

/**
 * Class to define the right pages for navigation for the Business Rules Framework
 */
@Export
class ActivityRulesNavigationSupport extends DefaultBizRulesPageNavigationSupport<ActivityRule, ActivityRuleVersion, ActivityRuleHead> {

  static final var _instance = new ActivityRulesNavigationSupport()

  private construct() {
  }

  static property get Instance(): ActivityRulesNavigationSupport {
    return _instance
  }

  override property get VersionController(): ActivityRulesVersionController {
    return ActivityRulesUtil.VersionController
  }

  override function pushRuleVersionDetailsPopup(version: ActivityRuleVersion, importing : boolean) {
    ActivityRulePopup.push(version, importing)
  }

  override function goToCreateRulePage() {
    CreateActivityRule.go(UUID.randomUUID().toString())
  }

  override function goToCloneRulePage(ruleToClone: ActivityRule) {
    CreateActivityRule.go(ruleToClone, UUID.randomUUID().toString())
  }

  override function pushRuleComparisonPopup(
      importEntry : RuleImportTaskEntry, importHelper : RuleExportImportPageHelper) {
    if (importEntry.ImportedVersion typeis ActivityRuleVersion) {
      ActivityRuleComparisonPopup.push(importEntry, importHelper as RuleExportImportPageHelper<ActivityRuleVersion>);
    } else {
      throw new DisplayableException(String.format(
          "Version comparison for imported rule type: %s is not supported",
          {importEntry.ImportedVersion.IntrinsicType.Name}));
    }
  }

  override function goToExportImportStatusPage() {
    ActivityRuleExportImportStatus.go()
  }

  override function goToRulesListPage() {
    ActivityRules.go()
  }

}
