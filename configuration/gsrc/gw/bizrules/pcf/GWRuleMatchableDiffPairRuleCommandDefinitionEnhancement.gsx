package gw.bizrules.pcf

uses gw.api.locale.DisplayKey
uses gw.bizrules.BizRulesComponentMapper
uses gw.bizrules.IRuleAction
uses gw.bizrules.diff.RuleMatchableDiffPair

enhancement GWRuleMatchableDiffPairRuleCommandDefinitionEnhancement: RuleMatchableDiffPair<RuleCommandDefinition> {
  property get Rows(): List<RuleComparisonRow<String>> {
    var keys = Action.CommandParameterDefinitions.Keys
    return keys != null ? keys.map(\ param -> getRow(param)) : {}
  }

  function getRow(parameterName: String): RuleComparisonRow<String> {
    var label = Action.CommandParameterDefinitions[parameterName]?.ParameterLabel

    var lhs = this.Left?.RuleCommandParameters.ParameterMap[parameterName]?.Expression
    var rhs = this.Right?.RuleCommandParameters.ParameterMap[parameterName]?.Expression

    var diff = this.DiffType == NONE ? false : this.DiffType == MOD ? not lhs.equalsTo(rhs) : true

    return new RuleComparisonRow<String>(label, diff, {lhs.DisplayText, rhs.DisplayText})
  }

  function getRowAsDate(parameterName: String): RuleComparisonRow<Date> {
    var label = Action.CommandParameterDefinitions[parameterName]?.ParameterLabel

    var lhs = this.Left?.RuleCommandParameters.ParameterMap[parameterName]?.Expression as DateExpressionFragment
    var rhs = this.Right?.RuleCommandParameters.ParameterMap[parameterName]?.Expression as DateExpressionFragment

    var diff = this.DiffType == NONE ? false : this.DiffType == MOD ? not lhs.equalsTo(rhs) : true

    return new RuleComparisonRow<Date>(label, diff, {lhs.DateValue, rhs.DateValue})
  }

  property get Title(): String {
    return new RuleCommandDefinitionDisplayHelper(Command).getLabel()
  }

  property get SequenceRow(): RuleComparisonRow<Integer> {
    var lhs = this.Left?.SequenceNumber
    var rhs = this.Right?.SequenceNumber
    var diff = this.DiffType == NONE ? lhs != rhs : this.DiffType == MOD ? lhs != rhs : true

    return new RuleComparisonRow<Integer>(DisplayKey.get("BizRules.Import.Comparison.RuleAction.Sequence"), diff, {lhs, rhs})
  }

  private property get Command(): RuleCommandDefinition {
    return this.Left ?: this.Right
  }

  private property get Action(): IRuleAction {
    return BizRulesComponentMapper.Instance.getRuleAction(Command.RuleActionKey)
  }
}
