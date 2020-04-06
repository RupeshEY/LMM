package gw.bizrules

uses entity.ActivityPattern
uses gw.api.databuilder.bizrules.ActivityRuleBuilder
uses gw.api.databuilder.bizrules.ActivityRuleHeadBuilder
uses gw.api.databuilder.bizrules.GenerateActivityCommandDefinitionBuilder
uses gw.api.locale.DisplayKey
uses gw.bizrules.databuilder.ExpressionFragmentBuilders
uses gw.bizrules.databuilder.RuleConditionBuilder
uses gw.bizrules.databuilder.RuleConditionLineBuilder
uses gw.bizrules.ruleaction.behavioralcommandparam.assignee.CheckCreatorActivityAssigneeLoader
uses gw.bizrules.ruleaction.behavioralcommandparam.assignee.RecoveryCreatorActivityAssigneeLoader
uses typekey.RuleContextDefinitionKey
uses typekey.RuleOperator
uses typekey.TransactionStatus
uses typekey.TriggeringPointKey

/**
 * Builders to create the Transaction Update Activity Rules
 */
@Export
class TransactionPreupdateBizrulesBuilder extends BizrulesBuilder {

  /**
   * Creates all the Rules and saves them to the database
   */
  public static function createRules() {
    createTPU01000Rule()
    createTPU02000Rule()
  }

  private static function createTPU01000Rule() {
    var activityPattern = ActivityPattern.finder.getActivityPatternByCode("check_denied");
    var currentDescription = activityPattern.getDescription()
    var newDescription = (currentDescription != null and currentDescription.length > 0) ? currentDescription + " - " : ""
    var description = newDescription + DisplayKey.get("Java.Financials.Check.Deny.Activity.DescriptionDetails",
        "\${check.PayTo}", "\${check.NetAmountDisplayValue}")

    var head = new ActivityRuleHeadBuilder()
        .withGlobalRuleID("c3f3cae0-539a-4445-97e3-391b6b80eb8d")
        .withSystemId("base-configuration")
        .withStatus(TC_STAGED)
        .withRule(new ActivityRuleBuilder()
            .withName("TPU01000 - Create Activity After Check Denial")
            .withDescription("When check is denied, create notification for the check creator")
            .withRuleContextDefinitionKey(RuleContextDefinitionKey.TC_CHECKSETITERATIVE)
            .withTriggeringPointKey(TriggeringPointKey.TC_UPDATE)
            .withRuleCondition(new RuleConditionBuilder()
                .addRuleConditionLine(new RuleConditionLineBuilder()
                    .withLeftOperand(ExpressionFragmentBuilders.forPropertyReference("check.Status", true))
                    .withOperator(RuleOperator.TC_NOTEQUALS)
                    .withLineNumber(0)
                    .withRightOperand("check.Status"))
                .addRuleConditionLine(new RuleConditionLineBuilder()
                    .withLeftOperand("check.Status")
                    .withOperator(RuleOperator.TC_EQUALS)
                    .withLineNumber(1)
                    .withRightOperand(ExpressionFragmentBuilders.forTypeKeyExpression(TransactionStatus.TC_DENIED))))
            .addRuleCommandDefinition(new GenerateActivityCommandDefinitionBuilder("check_denied")
                .withCheckContextParameter()
                .withDescription(description)
                .withAssignedTo(CheckCreatorActivityAssigneeLoader.NAME)
                .withOrderNumber(0)
                .createCommandDefinition()))
            .createAndCommit()
    isRuleValid(head)
  }

  private static function createTPU02000Rule() {
    var activityPattern = ActivityPattern.finder.getActivityPatternByCode("recovery_denied");
    var currentDescription = activityPattern.getDescription()
    var newDescription = (currentDescription != null and currentDescription.length > 0) ? currentDescription + " - " : ""
    var description = newDescription + DisplayKey.get("Java.Financials.Recovery.Deny.Activity.DescriptionDetails",
        "\${recovery.Payer}", "\${recovery.TransactionAmountDisplayValue}")

    var head = new ActivityRuleHeadBuilder()
        .withGlobalRuleID("0562e67d-b151-4cbf-b596-99377032775f")
        .withSystemId("base-configuration")
        .withStatus(TC_STAGED)
        .withRule(new ActivityRuleBuilder()
            .withName("TPU02000 - Create Activity After Recovery Denial")
            .withDescription("When recovery is denied, create notification for recovery creator")
            .withRuleContextDefinitionKey(RuleContextDefinitionKey.TC_RECOVERYSETITERATIVE)
            .withTriggeringPointKey(TriggeringPointKey.TC_UPDATE)
            .withRuleCondition(new RuleConditionBuilder()
                .addRuleConditionLine(new RuleConditionLineBuilder()
                    .withLeftOperand(ExpressionFragmentBuilders.forPropertyReference("recovery.Status", true))
                    .withOperator(RuleOperator.TC_NOTEQUALS)
                    .withLineNumber(0)
                    .withRightOperand("recovery.Status"))
                .addRuleConditionLine(new RuleConditionLineBuilder()
                    .withLeftOperand("recovery.Status")
                    .withOperator(RuleOperator.TC_EQUALS)
                    .withLineNumber(1)
                    .withRightOperand(ExpressionFragmentBuilders.forTypeKeyExpression(TransactionStatus.TC_DENIED))))
            .addRuleCommandDefinition(new GenerateActivityCommandDefinitionBuilder("recovery_denied")
                .withRecoveryContextParameter()
                .withDescription(description)
                .withAssignedTo(RecoveryCreatorActivityAssigneeLoader.NAME)
                .withOrderNumber(0)
                .createCommandDefinition()))
        .createAndCommit()
    isRuleValid(head)
  }
}