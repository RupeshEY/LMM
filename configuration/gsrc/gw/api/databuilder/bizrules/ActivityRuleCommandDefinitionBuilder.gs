package gw.api.databuilder.bizrules

uses com.google.common.collect.Maps
uses gw.bizrules.databuilder.ExpressionFragmentBuilder
uses gw.bizrules.databuilder.ExpressionFragmentBuilders
uses gw.bizrules.databuilder.RuleCommandDefinitionBuilder
uses gw.bizrules.ruleaction.config.BaseCommandParameterConfig
uses gw.bizrules.ruleaction.config.CCCommandParameterDefinition
uses gw.pl.persistence.core.Bundle

@Export
abstract class ActivityRuleCommandDefinitionBuilder<B extends ActivityRuleCommandDefinitionBuilder, T extends BaseCommandParameterConfig>
    extends RuleCommandDefinitionBuilder {

  private var _commandParameters = Maps.newHashMap<String,ExpressionFragmentBuilder>()

  construct(key : RuleActionKey) {
    super()
    withRuleActionKey(key)
  }

  function withClaimContextParameter() : B {
    addToMap(Config.CLAIM,ExpressionFragmentBuilders.forCodeExpression("claim"))
    return this as B
  }

  function withExposureContextParameter() : B {
    addToMap(Config.EXPOSURE,ExpressionFragmentBuilders.forCodeExpression("exposure"))
    return this as B
  }

  function withCheckContextParameter() : B {
    addToMap(Config.CHECK,ExpressionFragmentBuilders.forCodeExpression("check"))
    return this as B
  }

  function withRecoveryContextParameter() : B {
    addToMap(Config.RECOVERY,ExpressionFragmentBuilders.forCodeExpression("recovery"))
    return this as B
  }

  function withReserveContextParameter() : B {
    addToMap(Config.RESERVE,ExpressionFragmentBuilders.forCodeExpression("reserve"))
    return this as B
  }

  function withRecoveryReserveContextParameter() : B {
    addToMap(Config.RECOVERYRESERVE,ExpressionFragmentBuilders.forCodeExpression("recoveryreserve"))
    return this as B
  }

  function withSubrogationContextParameter() : B {
    addToMap(Config.SUBROGATION,ExpressionFragmentBuilders.forCodeExpression("subrogation"))
    return this as B
  }

  function withOrderNumber(n : int) : B {
    return super.withOrderNumber(n) as B
  }

  function createCommandDefinition() : RuleCommandDefinition {
    addRuleCommandParameters()
    return create()
  }

  function createCommandDefinition(bundle : Bundle) : RuleCommandDefinition {
    addRuleCommandParameters()
    return create(bundle)
  }

  function createAndCommitCommandDefinition() : RuleCommandDefinition {
    addRuleCommandParameters()
    return createAndCommit()
  }

  private function addRuleCommandParameters() {
    for (entry in _commandParameters.entrySet()) {
      addRuleCommandParameter(entry.Key,entry.Value)
    }
  }

  protected function addToMap(param : CCCommandParameterDefinition, value : ExpressionFragmentBuilder) {
    _commandParameters.put(param.getName(), value)
  }

  protected abstract property get Config() : T
}