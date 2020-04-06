package gw.bizrules

uses gw.api.locale.DisplayKey
uses gw.bizrules.pcf.CommandDefinitionUIConfig
uses gw.bizrules.pcf.RuleVersionComparisonController
uses pcf.ActivityRuleComparisonPopup
uses gw.bizrules.pcf.RuleComparisonRow

@Export
class RuleVersionComparisonHelper extends RuleVersionComparisonController<ActivityRuleVersion> {

  private final var _updateTime: RuleComparisonRow<Date> as readonly TimeRow
  private final var _updateUserName: RuleComparisonRow<String> as readonly UserNameRow
  private final var _updateSystemId: RuleComparisonRow<String> as readonly SystemIdRow
  private final var _updateDescription: RuleComparisonRow<String> as readonly DescriptionRow
  private final var _updateAvailableToRun: RuleComparisonRow<Boolean> as readonly AvailableToRunRow
  private final var _updateRuleCondition: RuleComparisonRow<RuleCondition> as readonly RuleCoditionRow
  private final var _triggerRow: RuleComparisonRow<TriggeringPointKey> as readonly TriggerRow
  private final var _contextRow: RuleComparisonRow<RuleContextDefinitionKey> as readonly ContextRow
  private final var _lossTypeRow : RuleComparisonRow<String> as readonly LossTypeRow
  private final var _policyTypeRow: RuleComparisonRow<String> as readonly PolicyTypeRow
  private final var _jurisdictionsRow: RuleComparisonRow<String> as readonly JurisdictionsRow
  private final var _nameRow : RuleComparisonRow<String> as readonly NameRow

  private final var ALL = (DisplayKey.get('Web.ActivityRules.Rule.ApplicabilityCriteria.All'))

  construct(left: ActivityRuleVersion, right: ActivityRuleVersion, currentLocation: ActivityRuleComparisonPopup) {
    super(left, right, 1/* total number of columns used to display each Rule */, ActivityRulePanelSetHelper.UIConfigs, currentLocation)
    _nameRow = createRow(DisplayKey.get('Web.ActivityRules.Rule.Name'), \v->v.Rule.Name)
    _updateTime = createRow("Update Time", \v->v.Rule.UpdateTime)
    _updateUserName = createRow("Update Username", \v->v.Rule.UpdateUserName)
    _updateSystemId = createRow("Update SystemId", \v->v.Rule.UpdateSystemId)
    _updateDescription = createRow(DisplayKey.get("Web.ActivityRules.Rule.Description"), \v->v.Rule.Description)
    _updateAvailableToRun = createRow(DisplayKey.get("BizRules.RuleDetailsPage.AvailableToRun"), \v->v.Rule.AvailableToRun)
    _updateRuleCondition = createRow(DisplayKey.get("Web.ActivityRules.Rule.Condition.Title"), \v -> v.Rule.RuleCondition);
    _triggerRow = createRow(DisplayKey.get("Web.ActivityRules.Rule.Trigger"), \v -> v.Rule.TriggeringPointKey)
    _contextRow = createRow(DisplayKey.get("Web.ActivityRules.Rule.Context"), \v -> v.Rule.RuleContextDefinitionKey)
    _lossTypeRow = createRow(DisplayKey.get("Web.ActivityRules.Rule.ApplicabilityCriteria.LossType"), \v -> str((v.Rule as ActivityRule).LossTypes))
    _policyTypeRow = createRow(DisplayKey.get("Web.ActivityRules.Rule.ApplicabilityCriteria.PolicyType"), \v -> str((v.Rule as ActivityRule).PolicyTypes))
    _jurisdictionsRow = createRow(DisplayKey.get("Web.ActivityRules.Rule.ApplicabilityCriteria.Jurisdiction"), \v -> str((v.Rule as ActivityRule).Jurisdictions))
  }

  private function str(jurisdictions: AppCritJurisdiction[]): String {
    return str(jurisdictions*.Jurisdiction*.DisplayName.sort().toList())
  }

  private function str(policyTypes: AppCritPolicyType[]): String {
    return str(policyTypes*.PolicyType*.DisplayName.sort().toList())
  }

  private function str(lossTypes: AppCritLossType[]): String {
    return str(lossTypes*.LossType*.DisplayName.sort().toList());
  }

  private function str(strings:List<String>) : String {
    return strings.Empty?ALL:strings.toString()
  }


  private function createRow<T>(label: String, getter(v: RuleVersion): T, isDifferent: Boolean = null): RuleComparisonRow<T> {
    var values = RuleVersions.map(\v -> getter(v))
    if (isDifferent == null) {
      isDifferent = valuesDiffer(values)
    }
    return new RuleComparisonRow<T>(label, isDifferent, values)
  }
}