package gw.bizrules

uses gw.api.databuilder.bizrules.ActivityRuleBuilder
uses gw.api.databuilder.bizrules.ActivityRuleHeadBuilder
uses gw.api.databuilder.bizrules.GenerateActivityCommandDefinitionBuilder
uses gw.bizrules.databuilder.ExpressionFragmentBuilders
uses gw.bizrules.databuilder.RuleConditionBuilder
uses gw.bizrules.databuilder.RuleConditionLineBuilder
uses gw.bizrules.ruleaction.behavioralcommandparam.assignee.ExposureOwnerActivityAssigneeLoader
uses gw.bizrules.ruleaction.behavioralcommandparam.relatedto.ExposureRelatedTo
uses typekey.ClaimStrategy
uses typekey.ClaimantType
uses typekey.CoverageSubtype
uses typekey.ExposureType
uses typekey.LossType
uses typekey.Parentheses
uses typekey.PolicyType
uses typekey.RuleBooleanOperator
uses typekey.RuleConditionType
uses typekey.RuleContextDefinitionKey
uses typekey.RuleOperator
uses typekey.TriggeringPointKey

/**
 * Builders to create the Exposure Creation Activity Rules
 */
@Export
class ExposureWorkplanBizrulesBuilder extends BizrulesBuilder {

  /**
   * Creates all the Rules and saves them to the database
   */
  public static function createRules() {
    createEXW01000Rule()
    createEXW02100Rule()
    createEXW04100Rule()
    createEXW04200Rule()
    createEXW05100Rule()
    createEXW06100Rule()
    createEXW07100Rule()
    createEXW07200Rule()
    createEXW07300Rule()
    createEXW07400Rule()
  }

  private static function createEXW01000Rule() {
    var head = new ActivityRuleHeadBuilder()
        .withGlobalRuleID("dac0cbd8-7375-4958-9183-974145f58fc0")
        .withSystemId("base-configuration")
        .withStatus(TC_STAGED)
        .withRule(new ActivityRuleBuilder()
            .withName("EXW01000 - Contact Claimant")
            .withDescription("Remind claim owner to contact the claimant for all non-WC exposures")
            .withRuleContextDefinitionKey(RuleContextDefinitionKey.TC_EXPOSURE)
            .withTriggeringPointKey(TriggeringPointKey.TC_CREATION)
            .withRuleCondition(new RuleConditionBuilder()
                .addTrueFalseRuleConditionLine("claim.FirstAndFinal", RuleOperator.TC_ISFALSE)
                .addRuleConditionLine("claim.LossType", RuleOperator.TC_NOTEQUALS, ExpressionFragmentBuilders.forTypeKeyExpression(LossType.TC_WC))
                .addRuleConditionLine("exposure.ClaimantType", RuleOperator.TC_NOTEQUALS, ExpressionFragmentBuilders.forTypeKeyExpression(ClaimantType.TC_INSURED)))
            .addRuleCommandDefinition(new GenerateActivityCommandDefinitionBuilder("contact_claimant")
                .withExposureContextParameter()
                .withRelatedTo(ExposureRelatedTo.NAME)
                .withAssignedTo(ExposureOwnerActivityAssigneeLoader.NAME)
                .withDescription("Contact Claimant Activity Generated")
                .withOrderNumber(0)
                .createCommandDefinition()))
        .createAndCommit()
    isRuleValid(head)
  }

  private static function createEXW02100Rule() {
    var head = new ActivityRuleHeadBuilder()
        .withGlobalRuleID("18f93145-0709-41fb-b4fd-1cfac7c876ff")
        .withSystemId("base-configuration")
        .withStatus(TC_STAGED)
        .withRule(new ActivityRuleBuilder()
            .withName("EXW02100 - Vehicle inspection")
            .withDescription("For vehicle exposures, create Vehicle Inspection activities and assign to exposure owner")
            .withRuleContextDefinitionKey(RuleContextDefinitionKey.TC_EXPOSURE)
            .withTriggeringPointKey(TriggeringPointKey.TC_CREATION)
            .withRuleCondition(new RuleConditionBuilder()
                .addTrueFalseRuleConditionLine("claim.FirstAndFinal", RuleOperator.TC_ISFALSE)
                .addRuleConditionLine("exposure.ExposureType", RuleOperator.TC_EQUALS, ExpressionFragmentBuilders.forTypeKeyExpression(ExposureType.TC_VEHICLEDAMAGE)))
            .addRuleCommandDefinition(new GenerateActivityCommandDefinitionBuilder("vehicle_inspection")
                .withExposureContextParameter()
                .withRelatedTo(ExposureRelatedTo.NAME)
                .withAssignedTo(ExposureOwnerActivityAssigneeLoader.NAME)
                .withDescription("Vehicle Inspection Activity Generated")
                .withOrderNumber(0)
                .createCommandDefinition()))
        .createAndCommit()
    isRuleValid(head)
  }

  private static function createEXW04100Rule() {
    var head = new ActivityRuleHeadBuilder()
        .withGlobalRuleID("3eb233c6-eaaf-407d-8808-3f99871e6846")
        .withSystemId("base-configuration")
        .withStatus(TC_STAGED)
        .withRule(new ActivityRuleBuilder()
            .withName("EXW04100 - Medical report")
            .withDescription("For bodily injury exposures, create Medical Report (claimant) activities")
            .withRuleContextDefinitionKey(RuleContextDefinitionKey.TC_EXPOSURE)
            .withTriggeringPointKey(TriggeringPointKey.TC_CREATION)
            .withRuleCondition(new RuleConditionBuilder()
                .addRuleConditionLine("exposure.ExposureType", RuleOperator.TC_EQUALS, ExpressionFragmentBuilders.forTypeKeyExpression(ExposureType.TC_BODILYINJURYDAMAGE)))
            .addRuleCommandDefinition(new GenerateActivityCommandDefinitionBuilder("medical_report_claimant")
                .withExposureContextParameter()
                .withRelatedTo(ExposureRelatedTo.NAME)
                .withAssignedTo(ExposureOwnerActivityAssigneeLoader.NAME)
                .withDescription("Medical Report Claimant Activity Generated")
                .withOrderNumber(0)
                .createCommandDefinition()))
        .createAndCommit()
    isRuleValid(head)
  }

  private static function createEXW04200Rule() {
    var head = new ActivityRuleHeadBuilder()
        .withGlobalRuleID("4c9e01ac-6b30-417b-aa0c-a2133d34cb08")
        .withSystemId("base-configuration")
        .withStatus(TC_STAGED)
        .withRule(new ActivityRuleBuilder()
            .withName("EXW04200 - IME")
            .withDescription("For bodily injury exposures where strategy is Injury - Investigate, create Independent Medical Exam activity")
            .withRuleContextDefinitionKey(RuleContextDefinitionKey.TC_EXPOSURE)
            .withTriggeringPointKey(TriggeringPointKey.TC_CREATION)
            .withRuleCondition(new RuleConditionBuilder()
                .addRuleConditionLine("exposure.ExposureType", RuleOperator.TC_EQUALS, ExpressionFragmentBuilders.forTypeKeyExpression(ExposureType.TC_BODILYINJURYDAMAGE))
                .addRuleConditionLine("exposure.Strategy", RuleOperator.TC_EQUALS, ExpressionFragmentBuilders.forTypeKeyExpression(ClaimStrategy.TC_INJURY_NORMAL)))
            .addRuleCommandDefinition(new GenerateActivityCommandDefinitionBuilder("IME")
                .withExposureContextParameter()
                .withRelatedTo(ExposureRelatedTo.NAME)
                .withAssignedTo(ExposureOwnerActivityAssigneeLoader.NAME)
                .withDescription("IME Activity Generated")
                .withOrderNumber(0)
                .createCommandDefinition()))
        .createAndCommit()
    isRuleValid(head)
  }

  private static function createEXW05100Rule() {
    var head = new ActivityRuleHeadBuilder()
        .withGlobalRuleID("72d01298-8b66-4eaa-9f6f-8143fd29db33")
        .withSystemId("base-configuration")
        .withStatus(TC_STAGED)
        .withRule(new ActivityRuleBuilder()
            .withName("EXW05100 - Medical Report")
            .withDescription("For Medical Details exposures, create an Initial Med Report activity")
            .withRuleContextDefinitionKey(RuleContextDefinitionKey.TC_EXPOSURE)
            .withTriggeringPointKey(TriggeringPointKey.TC_CREATION)
            .withRuleCondition(new RuleConditionBuilder()
                .addRuleConditionLine("exposure.ExposureType", RuleOperator.TC_EQUALS, ExpressionFragmentBuilders.forTypeKeyExpression(ExposureType.TC_WCINJURYDAMAGE)))
            .addRuleCommandDefinition(new GenerateActivityCommandDefinitionBuilder("initial_med_report")
                .withExposureContextParameter()
                .withRelatedTo(ExposureRelatedTo.NAME)
                .withAssignedTo(ExposureOwnerActivityAssigneeLoader.NAME)
                .withDescription("Initial Med Report Activity Generated")
                .withOrderNumber(0)
                .createCommandDefinition()))
        .createAndCommit()
    isRuleValid(head)
  }

  private static function createEXW06100Rule() {
    var head = new ActivityRuleHeadBuilder()
        .withGlobalRuleID("486da068-4425-4705-aba4-3eb7b5e1b222")
        .withSystemId("base-configuration")
        .withStatus(TC_STAGED)
        .withRule(new ActivityRuleBuilder()
            .withName("EXW06100 - Wage Statement")
            .withDescription("Ask for a wage statement for WC Indemnity exposures")
            .withRuleContextDefinitionKey(RuleContextDefinitionKey.TC_EXPOSURE)
            .withTriggeringPointKey(TriggeringPointKey.TC_CREATION)
            .withRuleCondition(new RuleConditionBuilder()
                .addRuleConditionLine("exposure.ExposureType", RuleOperator.TC_EQUALS, ExpressionFragmentBuilders.forTypeKeyExpression(ExposureType.TC_LOSTWAGES)))
            .addRuleCommandDefinition(new GenerateActivityCommandDefinitionBuilder("wage_stmt")
                .withExposureContextParameter()
                .withRelatedTo(ExposureRelatedTo.NAME)
                .withAssignedTo(ExposureOwnerActivityAssigneeLoader.NAME)
                .withDescription("Wage Statement Activity Generated")
                .withOrderNumber(0)
                .createCommandDefinition()))
        .createAndCommit()
    isRuleValid(head)
  }

  private static function createEXW07100Rule() {
    var head = new ActivityRuleHeadBuilder()
        .withGlobalRuleID("20e98f4b-d1fc-4531-b772-33ecdb9feef0")
        .withSystemId("base-configuration")
        .withStatus(TC_STAGED)
        .withRule(new ActivityRuleBuilder()
            .withName("EXW07100 - Get list of damaged items")
            .withDescription("For Homeowners / Content exposures, create an activity to get a list of the items that were damaged")
            .withRuleContextDefinitionKey(RuleContextDefinitionKey.TC_EXPOSURE)
            .withTriggeringPointKey(TriggeringPointKey.TC_CREATION)
            .withRuleCondition(new RuleConditionBuilder()
                .addRuleConditionLine("claim.Policy.PolicyType", RuleOperator.TC_EQUALS, ExpressionFragmentBuilders.forTypeKeyExpression(PolicyType.TC_HOMEOWNERS))
                .addRuleConditionLine("exposure.ExposureType", RuleOperator.TC_EQUALS, ExpressionFragmentBuilders.forTypeKeyExpression(ExposureType.TC_CONTENT))
                .addRuleConditionLine("exposure.CoverageSubType", RuleOperator.TC_EQUALS, ExpressionFragmentBuilders.forTypeKeyExpression(CoverageSubtype.TC_HODWPERSONALPROP)))
            .addRuleCommandDefinition(new GenerateActivityCommandDefinitionBuilder("damaged_items")
                .withExposureContextParameter()
                .withRelatedTo(ExposureRelatedTo.NAME)
                .withAssignedTo(ExposureOwnerActivityAssigneeLoader.NAME)
                .withOrderNumber(0)
                .createCommandDefinition()))
        .createAndCommit()
    isRuleValid(head)
  }

  private static function createEXW07200Rule() {
    var head = new ActivityRuleHeadBuilder()
        .withGlobalRuleID("b1fac403-0eb2-4dbf-92ed-421c30e17d4b")
        .withSystemId("base-configuration")
        .withStatus(TC_STAGED)
        .withRule(new ActivityRuleBuilder()
            .withName("EXW07200 - Contact insured about living expenses")
            .withDescription("Create an activity to contact the insured to determine if additional living expenses are required")
            .withRuleContextDefinitionKey(RuleContextDefinitionKey.TC_EXPOSURE)
            .withTriggeringPointKey(TriggeringPointKey.TC_CREATION)
            .withRuleCondition(new RuleConditionBuilder()
                .addRuleConditionLine("claim.Policy.PolicyType", RuleOperator.TC_EQUALS, ExpressionFragmentBuilders.forTypeKeyExpression(PolicyType.TC_HOMEOWNERS))
                .addRuleConditionLine("exposure.ExposureType", RuleOperator.TC_EQUALS, ExpressionFragmentBuilders.forTypeKeyExpression(ExposureType.TC_LIVINGEXPENSES)))
            .addRuleCommandDefinition(new GenerateActivityCommandDefinitionBuilder("living_expenses")
                .withExposureContextParameter()
                .withRelatedTo(ExposureRelatedTo.NAME)
                .withAssignedTo(ExposureOwnerActivityAssigneeLoader.NAME)
                .withOrderNumber(0)
                .createCommandDefinition()))
        .createAndCommit()
    isRuleValid(head)
  }

  private static function createEXW07300Rule() {
    var head = new ActivityRuleHeadBuilder()
        .withGlobalRuleID("002cce19-376a-44be-a89c-4ecc7075ae79")
        .withSystemId("base-configuration")
        .withStatus(TC_STAGED)
        .withRule(new ActivityRuleBuilder()
            .withName("EXW07300 - Get property inspected")
            .withDescription("Create an activity to schedule an inspection of the damaged property for dwelling and other property related exposures")
            .withRuleContextDefinitionKey(RuleContextDefinitionKey.TC_EXPOSURE)
            .withTriggeringPointKey(TriggeringPointKey.TC_CREATION)
            .withRuleCondition(new RuleConditionBuilder()
                .withRuleConditionType(RuleConditionType.TC_ADVANCED)
                .addRuleConditionLine("claim.Policy.PolicyType", RuleOperator.TC_EQUALS, ExpressionFragmentBuilders.forTypeKeyExpression(PolicyType.TC_HOMEOWNERS))
                .addRuleConditionLine(new RuleConditionLineBuilder()
                    .withLineNumber(1)
                    .withBooleanOperator(RuleBooleanOperator.TC_AND)
                    .withLeftParens(Parentheses.TC_ONELEFT)
                    .withLeftOperand("exposure.ExposureType")
                    .withOperator(RuleOperator.TC_EQUALS)
                    .withRightOperand(ExpressionFragmentBuilders.forTypeKeyExpression(ExposureType.TC_DWELLING)))
                .addRuleConditionLine(new RuleConditionLineBuilder()
                    .withLineNumber(2)
                    .withBooleanOperator(RuleBooleanOperator.TC_OR)
                    .withLeftOperand("exposure.ExposureType")
                    .withOperator(RuleOperator.TC_EQUALS)
                    .withRightOperand(ExpressionFragmentBuilders.forTypeKeyExpression(ExposureType.TC_OTHERSTRUCTURE)))
                .addRuleConditionLine(new RuleConditionLineBuilder()
                    .withLineNumber(3)
                    .withBooleanOperator(RuleBooleanOperator.TC_OR)
                    .withLeftParens(Parentheses.TC_ONELEFT)
                    .withLeftOperand("exposure.ExposureType")
                    .withOperator(RuleOperator.TC_EQUALS)
                    .withRightOperand(ExpressionFragmentBuilders.forTypeKeyExpression(ExposureType.TC_PROPERTYDAMAGE)))
                .addRuleConditionLine(new RuleConditionLineBuilder()
                    .withLineNumber(4)
                    .withBooleanOperator(RuleBooleanOperator.TC_AND)
                    .withLeftOperand("exposure.CoverageSubType")
                    .withOperator(RuleOperator.TC_EQUALS)
                    .withRightParens(Parentheses.TC_TWORIGHT)
                    .withRightOperand(ExpressionFragmentBuilders.forTypeKeyExpression(CoverageSubtype.TC_HOLIPERSONALLIABPD))))
            .addRuleCommandDefinition(new GenerateActivityCommandDefinitionBuilder("property_inspection")
                .withExposureContextParameter()
                .withRelatedTo(ExposureRelatedTo.NAME)
                .withAssignedTo(ExposureOwnerActivityAssigneeLoader.NAME)
                .withDescription("Property Inspection Activity Generated")
                .withOrderNumber(0)
                .createCommandDefinition()))
        .createAndCommit()
    isRuleValid(head)
  }

  private static function createEXW07400Rule() {
    var head = new ActivityRuleHeadBuilder()
        .withGlobalRuleID("41e49d6e-7561-4954-884d-7191dcdf08a5")
        .withSystemId("base-configuration")
        .withStatus(TC_STAGED)
        .withRule(new ActivityRuleBuilder()
            .withName("EXW07400 - Get claimant medical reports")
            .withDescription("If the exposure type is Med Pay on a Homeowners policy, create an activity to get the claimant’s medical reports")
            .withRuleContextDefinitionKey(RuleContextDefinitionKey.TC_EXPOSURE)
            .withTriggeringPointKey(TriggeringPointKey.TC_CREATION)
            .withRuleCondition(new RuleConditionBuilder()
                .addRuleConditionLine("claim.Policy.PolicyType", RuleOperator.TC_EQUALS, ExpressionFragmentBuilders.forTypeKeyExpression(PolicyType.TC_HOMEOWNERS))
                .addRuleConditionLine("exposure.ExposureType", RuleOperator.TC_EQUALS, ExpressionFragmentBuilders.forTypeKeyExpression(ExposureType.TC_MEDPAY)))
            .addRuleCommandDefinition(new GenerateActivityCommandDefinitionBuilder("medical_report_claimant")
                .withExposureContextParameter()
                .withRelatedTo(ExposureRelatedTo.NAME)
                .withAssignedTo(ExposureOwnerActivityAssigneeLoader.NAME)
                .withDescription("Medical Report Claimant Activity Generated")
                .withOrderNumber(0)
                .createCommandDefinition()))
        .createAndCommit()
    isRuleValid(head)
  }
}