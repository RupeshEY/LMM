package gw.bizrules

uses gw.api.databuilder.bizrules.ActivityRuleBuilder
uses gw.api.databuilder.bizrules.ActivityRuleHeadBuilder
uses gw.api.databuilder.bizrules.GenerateActivityCommandDefinitionBuilder
uses gw.api.locale.DisplayKey
uses gw.bizrules.databuilder.ContainsExpressionFragmentBuilder
uses gw.bizrules.databuilder.ExpressionFragmentBuilders
uses gw.bizrules.databuilder.RuleConditionBuilder
uses gw.bizrules.databuilder.RuleConditionLineBuilder
uses gw.bizrules.ruleaction.behavioralcommandparam.assignee.ClaimOwnerActivityAssigneeLoader
uses gw.bizrules.ruleaction.behavioralcommandparam.assignee.ExposureOwnerActivityAssigneeLoader
uses gw.bizrules.ruleaction.behavioralcommandparam.relatedto.ExposureRelatedTo

/**
 * Builders to create the Claim Exception Activity Rules
 */
@Export
class ClaimExceptionBizrulesBuilder extends BizrulesBuilder {

  /**
   * Creates all the Rules and saves them to the database
   */
  public static function createRules() {
    createCER02000Rule()
    createCER03000Rule()
  }

  private static function createCER02000Rule() {
    var head = new ActivityRuleHeadBuilder()
        .withGlobalRuleID("eb1de201-193e-47b3-9d19-2feeaa19bad8")
        .withSystemId("base-configuration")
        .withStatus(TC_STAGED)
        .withRule(new ActivityRuleBuilder()
            .withName("CER02000 - At least one activity for claim owner")
            .withDescription("Ensures that the claim owner has at least one open activity assigned to them")
            .withRuleContextDefinitionKey(RuleContextDefinitionKey.TC_CLAIM)
            .withTriggeringPointKey(TriggeringPointKey.TC_EXCEPTION)
            .withRuleCondition(new RuleConditionBuilder()
                .addRuleConditionLine("claim.State", RuleOperator.TC_EQUALS, ExpressionFragmentBuilders.forTypeKeyExpression(ClaimState.TC_OPEN))
                .addRuleConditionLine(new RuleConditionLineBuilder()
                    .withLineNumber(1)
                    .withLeftOperand("claim.Activities")
                    .withOperator(RuleOperator.TC_DOESNOTCONTAIN)
                    .withRightOperand(new ContainsExpressionFragmentBuilder()
                        .withAdditionalSymbol("activity")
                        .withRuleCondition(new RuleConditionBuilder()
                            .addRuleConditionLine("activity.Status", RuleOperator.TC_EQUALS, ExpressionFragmentBuilders.forTypeKeyExpression(ActivityStatus.TC_OPEN))
                            .addRuleConditionLine("activity.AssignedUser", RuleOperator.TC_EQUALS, "claim.AssignedUser")))))
            .addRuleCommandDefinition(new GenerateActivityCommandDefinitionBuilder("general_reminder")
                .withAssignedTo(ClaimOwnerActivityAssigneeLoader.NAME)
                .withDescription(DisplayKey.get("Rules.Exception.Claim.NoOpenDiaryAutoReminder"))
                .withPriority(Priority.TC_LOW)
                .withSubject(DisplayKey.get("Rules.Exception.Claim.ReviewClaim"))
                .withTargetDays(5)
                .withOrderNumber(0)
                .createCommandDefinition()))
        .createAndCommit()
    isRuleValid(head)
  }

  private static function createCER03000Rule() {
    var head = new ActivityRuleHeadBuilder()
        .withGlobalRuleID("1cf6b047-f258-40dd-8a68-b0ea7a3afcf9")
        .withSystemId("base-configuration")
        .withStatus(TC_STAGED)
        .withRule(new ActivityRuleBuilder()
            .withName("CER03000 - At least one activity for exposure owner")
            .withDescription("Ensures that the exposure owner has at least one open activity assigned to them")
            .withRuleContextDefinitionKey(RuleContextDefinitionKey.TC_EXPOSUREITERATIVE)
            .withTriggeringPointKey(TriggeringPointKey.TC_EXCEPTION)
            .withRuleCondition(new RuleConditionBuilder()
                .addRuleConditionLine("exposure.State", RuleOperator.TC_EQUALS, ExpressionFragmentBuilders.forTypeKeyExpression(ExposureState.TC_OPEN))
                .addRuleConditionLine(new RuleConditionLineBuilder()
                    .withLineNumber(1)
                    .withLeftOperand("claim.Activities")
                    .withOperator(RuleOperator.TC_DOESNOTCONTAIN)
                    .withRightOperand(new ContainsExpressionFragmentBuilder()
                        .withAdditionalSymbol("activity")
                        .withRuleCondition(new RuleConditionBuilder()
                            .addRuleConditionLine("activity.Status", RuleOperator.TC_EQUALS, ExpressionFragmentBuilders.forTypeKeyExpression(ActivityStatus.TC_OPEN))
                            .addRuleConditionLine("activity.AssignedUser", RuleOperator.TC_EQUALS, "exposure.AssignedUser")))))
            .addRuleCommandDefinition(new GenerateActivityCommandDefinitionBuilder("general_reminder")
                .withExposureContextParameter()
                .withRelatedTo(ExposureRelatedTo.NAME)
                .withAssignedTo(ExposureOwnerActivityAssigneeLoader.NAME)
                .withDescription(DisplayKey.get("Rules.Exception.Exposure.NoOpenDiaryAutoReminder"))
                .withPriority(Priority.TC_LOW)
                .withSubject(DisplayKey.get("Rules.Exception.Claim.ReviewClaim"))
                .withTargetDays(5)
                .withOrderNumber(0)
                .createCommandDefinition()))
        .createAndCommit()
    isRuleValid(head)
  }

}