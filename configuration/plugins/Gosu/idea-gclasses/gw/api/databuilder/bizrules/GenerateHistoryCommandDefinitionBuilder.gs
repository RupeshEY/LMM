package gw.api.databuilder.bizrules

uses gw.bizrules.databuilder.ExpressionFragmentBuilders
uses gw.bizrules.databuilder.TypeKeyExpressionFragmentBuilder
uses gw.bizrules.ruleaction.generatehistoryevent.config.GenerateHistoryEventCommandParameterConfig
uses gw.bizrules.ruleaction.generatehistoryevent.config.GenerateHistoryEventCommandParameterSet
uses gw.entity.TypeKey

/**
 * Builder to create a Generate History Rule Action. Please provide all required parameters
 * and ensure that at least one Context Definition (such as Claim, Exposure etc.) is
 * defined.
 */
@Export
class GenerateHistoryCommandDefinitionBuilder extends HasRelatedToCommandDefinitionBuilder<GenerateHistoryCommandDefinitionBuilder, GenerateHistoryEventCommandParameterConfig> {

  construct() {
    super(RuleActionKey.TC_GENERATEHISTORYEVENT)
    addToMap(Config.TYPE, new TypeKeyExpressionFragmentBuilder())
    withClaimContextParameter()
  }

  function withType(type : TypeKey) : GenerateHistoryCommandDefinitionBuilder {
    addToMap(Config.TYPE,ExpressionFragmentBuilders.forTypeKeyExpression(type))
    return this
  }

  function withDescription(description : String) : GenerateHistoryCommandDefinitionBuilder {
    addToMap(Config.DESCRIPTION,ExpressionFragmentBuilders.forGosuTemplateExpression(description))
    return this
  }

  protected override property get Config(): GenerateHistoryEventCommandParameterConfig {
    return GenerateHistoryEventCommandParameterSet.Config
  }
}