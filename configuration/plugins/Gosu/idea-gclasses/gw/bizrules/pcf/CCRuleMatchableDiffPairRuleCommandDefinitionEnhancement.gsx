package gw.bizrules.pcf

uses gw.bizrules.BizRulesComponentMapper
uses gw.bizrules.IRuleAction
uses gw.bizrules.diff.RuleMatchableDiffPair
uses gw.entity.TypeKey

@Export
enhancement CCRuleMatchableDiffPairRuleCommandDefinitionEnhancement: RuleMatchableDiffPair<RuleCommandDefinition> {

  function getRowAsTypeKey(parameterName: String): gw.bizrules.pcf.RuleComparisonRow<TypeKey> {
    var label = Action.CommandParameterDefinitions[parameterName]?.ParameterLabel

    var lhs = this.Left?.RuleCommandParameters.ParameterMap[parameterName]?.Expression as TypeKeyExpressionFragment
    var rhs = this.Right?.RuleCommandParameters.ParameterMap[parameterName]?.Expression as TypeKeyExpressionFragment

    var diff = this.DiffType == NONE ? false : this.DiffType == MOD ? not lhs.equalsTo(rhs) : true

    return new gw.bizrules.pcf.RuleComparisonRow<gw.entity.TypeKey>(label, diff, {lhs.TypeKeyValue, rhs.TypeKeyValue})
  }

  function getRowAsInteger(parameterName: String): gw.bizrules.pcf.RuleComparisonRow<Integer> {
    var label = Action.CommandParameterDefinitions[parameterName]?.ParameterLabel

    var lhs = this.Left?.RuleCommandParameters.ParameterMap[parameterName]?.Expression
    var rhs = this.Right?.RuleCommandParameters.ParameterMap[parameterName]?.Expression

    var diff = this.DiffType == NONE ? false : this.DiffType == MOD ? not lhs.equalsTo(rhs) : true

    return new gw.bizrules.pcf.RuleComparisonRow<Integer>(label, diff, {lhs.IntegerValue, rhs.IntegerValue})
  }

  function getRowAsBoolean(parameterName: String): gw.bizrules.pcf.RuleComparisonRow<Boolean> {
    var label = Action.CommandParameterDefinitions[parameterName]?.ParameterLabel

    var lhs = this.Left?.RuleCommandParameters.ParameterMap[parameterName]?.Expression
    var rhs = this.Right?.RuleCommandParameters.ParameterMap[parameterName]?.Expression

    var diff = this.DiffType == NONE ? false : this.DiffType == MOD ? not lhs.equalsTo(rhs) : true

    return new gw.bizrules.pcf.RuleComparisonRow<Boolean>(label, diff, {lhs.BooleanValue, rhs.BooleanValue})
  }

  function isRowEmpty(parameterName: String): boolean {
    var lhs = this.Left?.RuleCommandParameters.ParameterMap[parameterName]?.Expression
    var rhs = this.Right?.RuleCommandParameters.ParameterMap[parameterName]?.Expression
    var result = (lhs==null or lhs.DisplayText.isEmpty())
    result = result and ((rhs==null) or rhs.DisplayText.isEmpty())
    return result
  }

  private property get Command(): RuleCommandDefinition {
    return this.Left ?: this.Right
  }

  private property get Action(): IRuleAction {
    return BizRulesComponentMapper.Instance.getRuleAction(Command.RuleActionKey)
  }

}
