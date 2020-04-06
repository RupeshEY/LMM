package gw.bizrules

uses gw.api.databuilder.bizrules.ActivityRuleBuilder
uses gw.api.databuilder.bizrules.ActivityRuleHeadBuilder
uses gw.api.databuilder.bizrules.GenerateActivityCommandDefinitionBuilder
uses gw.api.databuilder.bizrules.SetFieldCommandDefinitionBuilder
uses gw.bizrules.databuilder.ContainsExpressionFragmentBuilder
uses gw.bizrules.databuilder.RuleConditionBuilder
uses gw.bizrules.databuilder.RuleConditionLineBuilder
uses gw.bizrules.ruleaction.behavioralcommandparam.assignee.ExposureOwnerActivityAssigneeLoader
uses gw.bizrules.ruleaction.behavioralcommandparam.relatedto.ExposureRelatedTo
uses typekey.Priority
uses typekey.RuleContextDefinitionKey
uses typekey.RuleOperator
uses typekey.TriggeringPointKey

/**
 * Builders to create the Exposure Update Activity Rules
 */
@Export
class ExposurePreupdateBizrulesBuilder extends BizrulesBuilder {

  /**
   * Creates all the Rules and saves them to the database
   */
  public static function createRules() {
    createEPU02000Rule()
  }

  private static function createEPU02000Rule() {
    var head = new ActivityRuleHeadBuilder()
        .withGlobalRuleID("089895c7-ad4b-492e-8b7a-32d3f4da5316")
        .withSystemId("base-configuration")
        .withStatus(TC_STAGED)
        .withRule(new ActivityRuleBuilder()
            .withName("EPU02000 - Salvage")
            .withDescription("For auto claims, if vehicle is total loss, create Salvage activity")
            .withRuleContextDefinitionKey(RuleContextDefinitionKey.TC_EXPOSURE)
            .withTriggeringPointKey(TriggeringPointKey.TC_UPDATE)
            .withRuleCondition(new RuleConditionBuilder()
                .addTrueFalseRuleConditionLine("exposure.VehicleIncident.TotalLoss", RuleOperator.TC_ISTRUE)
                .addRuleConditionLine(new RuleConditionLineBuilder()
                    .withLineNumber(1)
                    .withLeftOperand("exposure.Claim.Activities")
                    .withOperator(RuleOperator.TC_DOESNOTCONTAIN)
                    .withRightOperand(new ContainsExpressionFragmentBuilder()
                        .withAdditionalSymbol("activity")
                        .withRuleCondition(new RuleConditionBuilder()
                            .addRuleConditionLine("activity.Exposure", RuleOperator.TC_NOTEQUALS, "null")
                            .addRuleConditionLine("activity.Exposure.VehicleIncident", RuleOperator.TC_NOTEQUALS, "exposure.VehicleIncident")
                            .addRuleConditionLine("activity.ActivityPattern.Code", RuleOperator.TC_NOTEQUALS, "\"salvage_vehicle\"")))))
            .addRuleCommandDefinition(new GenerateActivityCommandDefinitionBuilder("salvage_vehicle")
                .withRelatedTo(ExposureRelatedTo.NAME)
                .withAssignedTo(ExposureOwnerActivityAssigneeLoader.NAME)
                .withExposureContextParameter()
                .withOrderNumber(0)
                .createCommandDefinition())
            .addRuleCommandDefinition(new GenerateActivityCommandDefinitionBuilder("recover_vehicle")
                .withRelatedTo(ExposureRelatedTo.NAME)
                .withAssignedTo(ExposureOwnerActivityAssigneeLoader.NAME)
                .withExposureContextParameter()
                .withPriority(Priority.TC_NORMAL)
                .withOrderNumber(1)
                .createCommandDefinition())
            .addRuleCommandDefinition(new SetFieldCommandDefinitionBuilder()
                .withExposureContextParameter()
                .withProperty("exposure.VehicleIncident.DateSalvageAssigned")
                .withValue("Util.currentDate()")
                .withSetIfNull(true)
                .withOrderNumber(2)
                .createCommandDefinition()))
        .createAndCommit()
    isRuleValid(head)
  }
}