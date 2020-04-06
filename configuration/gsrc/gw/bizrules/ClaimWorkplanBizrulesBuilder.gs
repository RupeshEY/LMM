package gw.bizrules

uses gw.api.databuilder.bizrules.ActivityRuleBuilder
uses gw.api.databuilder.bizrules.ActivityRuleHeadBuilder
uses gw.api.databuilder.bizrules.GenerateActivityCommandDefinitionBuilder
uses gw.bizrules.databuilder.ExpressionFragmentBuilders
uses gw.bizrules.databuilder.RuleConditionBuilder
uses typekey.ClaimStrategy
uses typekey.LossCause
uses typekey.LossType
uses typekey.PolicyType
uses typekey.RuleContextDefinitionKey
uses typekey.RuleOperator
uses typekey.TriggeringPointKey
uses typekey.UserExperienceType

/**
 * Builders to create the Claim Creation Activity Rules
 */
@Export
class ClaimWorkplanBizrulesBuilder extends BizrulesBuilder {

  /**
   * Creates all the Rules and saves them to the database
   */
  public static function createRules() {
    createCLW01000Rule()
    createCLW02000Rule()
    createCLW03100Rule()
    createCLW04100Rule()
    createCLW04210Rule()
    createCLW05100Rule()
    createCLW05210Rule()
    createCLW07310Rule()
  }

  private static function createCLW01000Rule() {
    var head = new ActivityRuleHeadBuilder()
        .withGlobalRuleID("83fecd7e-0900-4f5c-9c29-64eab2474ddc")
        .withSystemId("base-configuration")
        .withStatus(TC_STAGED)
        .withRule(new ActivityRuleBuilder()
            .withName("CLW01000 - Contact insured")
            .withDescription("Remind claim owner to contact the insured for all new non-WC claims")
            .withRuleContextDefinitionKey(RuleContextDefinitionKey.TC_CLAIM)
            .withTriggeringPointKey(TriggeringPointKey.TC_CREATION)
            .withRuleCondition(new RuleConditionBuilder()
                .addTrueFalseRuleConditionLine("claim.FirstAndFinal", RuleOperator.TC_ISFALSE)
                .addRuleConditionLine("claim.LossType", RuleOperator.TC_NOTEQUALS, ExpressionFragmentBuilders.forTypeKeyExpression(LossType.TC_WC)))
            .addRuleCommandDefinition(new GenerateActivityCommandDefinitionBuilder("contact_insured")
                .withDescription("Contact Insured Activity Generated")
                .withOrderNumber(0)
                .createCommandDefinition()))
        .createAndCommit()
    isRuleValid(head)
  }

  private static function createCLW02000Rule() {
    var head = new ActivityRuleHeadBuilder()
        .withGlobalRuleID("a9dd1e75-d341-494a-902c-ce5adf368cd2")
        .withSystemId("base-configuration")
        .withStatus(TC_STAGED)
        .withRule(new ActivityRuleBuilder()
            .withName("CLW02000 - Thirty day review")
            .withDescription("Create 30-day Review activity for all new claims")
            .withRuleContextDefinitionKey(RuleContextDefinitionKey.TC_CLAIM)
            .withTriggeringPointKey(TriggeringPointKey.TC_CREATION)
            .withRuleCondition(new RuleConditionBuilder()
                .addTrueFalseRuleConditionLine("claim.FirstAndFinal", RuleOperator.TC_ISFALSE))
            .addRuleCommandDefinition(new GenerateActivityCommandDefinitionBuilder("initial_30day_review")
                .withDescription("Initial 30 Day Review Activity Generated")
                .withOrderNumber(0)
                .createCommandDefinition()))
        .createAndCommit()
    isRuleValid(head)
  }

  private static function createCLW03100Rule() {
    var head = new ActivityRuleHeadBuilder()
        .withGlobalRuleID("38b1f2e1-943b-4dd9-b135-69a191ec20ea")
        .withSystemId("base-configuration")
        .withStatus(TC_STAGED)
        .withRule(new ActivityRuleBuilder()
            .withName("CLW03100 - Verify coverage")
            .withDescription("If claim owner is inexperienced, remind them to Verify Coverage on new claims")
            .withRuleContextDefinitionKey(RuleContextDefinitionKey.TC_CLAIM)
            .withTriggeringPointKey(TriggeringPointKey.TC_CREATION)
            .withRuleCondition(new RuleConditionBuilder()
                .addTrueFalseRuleConditionLine("claim.FirstAndFinal", RuleOperator.TC_ISFALSE)
                .addRuleConditionLine("claim.AssignedUser.ExperienceLevel", RuleOperator.TC_EQUALS, ExpressionFragmentBuilders.forTypeKeyExpression(UserExperienceType.TC_LOW)))
            .addRuleCommandDefinition(new GenerateActivityCommandDefinitionBuilder("coverage")
                .withDescription("Coverage Activity Generated")
                .withOrderNumber(0)
                .createCommandDefinition()))
        .createAndCommit()
    isRuleValid(head)
  }

  private static function createCLW04100Rule() {
    var head = new ActivityRuleHeadBuilder()
        .withGlobalRuleID("cc4b59af-9e80-42b2-af88-7b00168bea85")
        .withSystemId("base-configuration")
        .withStatus(TC_STAGED)
        .withRule(new ActivityRuleBuilder()
            .withName("CLW04100 - Scene inspection")
            .withDescription("For auto claims with strategy Auto - Investigate, create Scene Inspection activity for new claims")
            .withRuleContextDefinitionKey(RuleContextDefinitionKey.TC_CLAIM)
            .withTriggeringPointKey(TriggeringPointKey.TC_CREATION)
            .withRuleCondition(new RuleConditionBuilder()
                .addTrueFalseRuleConditionLine("claim.FirstAndFinal", RuleOperator.TC_ISFALSE)
                .addRuleConditionLine("claim.LossType", RuleOperator.TC_EQUALS, ExpressionFragmentBuilders.forTypeKeyExpression(LossType.TC_AUTO))
                .addRuleConditionLine("claim.Strategy", RuleOperator.TC_EQUALS, ExpressionFragmentBuilders.forTypeKeyExpression(ClaimStrategy.TC_AUTO_NORMAL)))
            .addRuleCommandDefinition(new GenerateActivityCommandDefinitionBuilder("scene_inspection")
                .withDescription("Scene Inspection Activity Generated")
                .withOrderNumber(0)
                .createCommandDefinition()))
        .createAndCommit()
    isRuleValid(head)
  }

  private static function createCLW04210Rule() {
    var head = new ActivityRuleHeadBuilder()
        .withGlobalRuleID("e53fa55a-e69a-4094-94d7-304ce27c14a7")
        .withSystemId("base-configuration")
        .withStatus(TC_STAGED)
        .withRule(new ActivityRuleBuilder()
            .withName("CLW04210 - Police report")
            .withDescription("For auto claims with strategy Auto - Investigate, if claim owner is inexperienced, create Policy Report activity")
            .withRuleContextDefinitionKey(RuleContextDefinitionKey.TC_CLAIM)
            .withTriggeringPointKey(TriggeringPointKey.TC_CREATION)
            .withRuleCondition(new RuleConditionBuilder()
                .addTrueFalseRuleConditionLine("claim.FirstAndFinal", RuleOperator.TC_ISFALSE)
                .addRuleConditionLine("claim.LossType", RuleOperator.TC_EQUALS, ExpressionFragmentBuilders.forTypeKeyExpression(LossType.TC_AUTO))
                .addRuleConditionLine("claim.Strategy", RuleOperator.TC_EQUALS, ExpressionFragmentBuilders.forTypeKeyExpression(ClaimStrategy.TC_AUTO_NORMAL))
                .addRuleConditionLine("claim.AssignedUser.ExperienceLevel", RuleOperator.TC_EQUALS, ExpressionFragmentBuilders.forTypeKeyExpression(UserExperienceType.TC_LOW)))
            .addRuleCommandDefinition(new GenerateActivityCommandDefinitionBuilder("police_report")
                .withDescription("Police Report Activity Generated")
                .withOrderNumber(0)
                .createCommandDefinition()))
        .createAndCommit()
    isRuleValid(head)
  }

  private static function createCLW05100Rule() {
    var head = new ActivityRuleHeadBuilder()
        .withGlobalRuleID("c8cd3b3b-dcf3-4b7b-9795-7b5eca1a0f9b")
        .withSystemId("base-configuration")
        .withStatus(TC_STAGED)
        .withRule(new ActivityRuleBuilder()
            .withName("CLW05100 - Property inspection")
            .withDescription("For property claims with strategy Property - Investigate, create Property Inspection activity")
            .withRuleContextDefinitionKey(RuleContextDefinitionKey.TC_CLAIM)
            .withTriggeringPointKey(TriggeringPointKey.TC_CREATION)
            .withRuleCondition(new RuleConditionBuilder()
                .addTrueFalseRuleConditionLine("claim.FirstAndFinal", RuleOperator.TC_ISFALSE)
                .addRuleConditionLine("claim.LossType", RuleOperator.TC_EQUALS, ExpressionFragmentBuilders.forTypeKeyExpression(LossType.TC_PR))
                .addRuleConditionLine("claim.Strategy", RuleOperator.TC_EQUALS, ExpressionFragmentBuilders.forTypeKeyExpression(ClaimStrategy.TC_PROP_NORMAL)))
            .addRuleCommandDefinition(new GenerateActivityCommandDefinitionBuilder("property_inspection")
                .withDescription("Property Inspection Activity Generated")
                .withOrderNumber(0)
                .createCommandDefinition()))
        .createAndCommit()
    isRuleValid(head)
  }

  private static function createCLW05210Rule() {
    var head = new ActivityRuleHeadBuilder()
        .withGlobalRuleID("a1b18476-e6e5-4f84-8f51-96acf74dca31")
        .withSystemId("base-configuration")
        .withStatus(TC_STAGED)
        .withRule(new ActivityRuleBuilder()
            .withName("CLW05210 - Police report")
            .withDescription("For property claims with strategy Property - Investigate, if claim owner is inexperienced and loss cause is fire, create Policy Report activity")
            .withRuleContextDefinitionKey(RuleContextDefinitionKey.TC_CLAIM)
            .withTriggeringPointKey(TriggeringPointKey.TC_CREATION)
            .withRuleCondition(new RuleConditionBuilder()
                .addTrueFalseRuleConditionLine("claim.FirstAndFinal", RuleOperator.TC_ISFALSE)
                .addRuleConditionLine("claim.LossType", RuleOperator.TC_EQUALS, ExpressionFragmentBuilders.forTypeKeyExpression(LossType.TC_PR))
                .addRuleConditionLine("claim.Strategy", RuleOperator.TC_EQUALS, ExpressionFragmentBuilders.forTypeKeyExpression(ClaimStrategy.TC_PROP_NORMAL))
                .addRuleConditionLine("claim.AssignedUser.ExperienceLevel", RuleOperator.TC_EQUALS, ExpressionFragmentBuilders.forTypeKeyExpression(UserExperienceType.TC_LOW))
                .addRuleConditionLine("claim.LossCause", RuleOperator.TC_EQUALS, ExpressionFragmentBuilders.forTypeKeyExpression(LossCause.TC_FIRE)))
            .addRuleCommandDefinition(new GenerateActivityCommandDefinitionBuilder("police_report")
                .withDescription("Police Report Activity Generated")
                .withOrderNumber(0)
                .createCommandDefinition()))
        .createAndCommit()
    isRuleValid(head)
  }

  private static function createCLW07310Rule() {
    var head = new ActivityRuleHeadBuilder()
        .withGlobalRuleID("b01fa787-77ab-4557-a14e-eeecc92ab0ab")
        .withSystemId("base-configuration")
        .withStatus(TC_STAGED)
        .withRule(new ActivityRuleBuilder()
            .withName("CLW07310 - Get Employee Injury Notice")
            .withDescription("For WC claims where claim owner is inexperienced, create Get Employee Injury Notice activity")
            .withRuleContextDefinitionKey(RuleContextDefinitionKey.TC_CLAIM)
            .withTriggeringPointKey(TriggeringPointKey.TC_CREATION)
            .withRuleCondition(new RuleConditionBuilder()
                .addRuleConditionLine("claim.LossType", RuleOperator.TC_EQUALS, ExpressionFragmentBuilders.forTypeKeyExpression(LossType.TC_WC))
                .addRuleConditionLine("claim.AssignedUser.ExperienceLevel", RuleOperator.TC_EQUALS, ExpressionFragmentBuilders.forTypeKeyExpression(UserExperienceType.TC_LOW)))
            .addRuleCommandDefinition(new GenerateActivityCommandDefinitionBuilder("employee_notice")
                .withDescription("Employee Notice Activity Generated")
                .withOrderNumber(0)
                .createCommandDefinition()))
        .createAndCommit()
    isRuleValid(head)
  }
}