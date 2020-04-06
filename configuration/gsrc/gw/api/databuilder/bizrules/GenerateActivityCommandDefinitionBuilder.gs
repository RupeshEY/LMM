package gw.api.databuilder.bizrules

uses gw.bizrules.databuilder.ExpressionFragmentBuilders
uses gw.bizrules.databuilder.GosuTemplateExpressionFragmentBuilder
uses gw.bizrules.databuilder.TypeKeyExpressionFragmentBuilder
uses gw.bizrules.ruleaction.behavioralcommandparam.activityrestriction.NoActivityRestriction
uses gw.bizrules.ruleaction.behavioralcommandparam.assignee.AutoAssignActivityAssigneeLoader
uses gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterConfig
uses gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet
uses gw.bizrules.ruleaction.behavioralcommandparam.relatedto.ClaimRelatedTo

/**
 * Builder to create a Generate Activity Rule Action. Please provide all required parameters
 * and ensure that at least one Context Definition (such as Claim, Exposure etc.) is
 * defined.
 * The Builder tries to fill all fields based on Activity Pattern.
 */
@Export
class GenerateActivityCommandDefinitionBuilder extends HasRelatedToCommandDefinitionBuilder<GenerateActivityCommandDefinitionBuilder, GenerateActivityCommandParameterConfig> {

  construct(pattern: String) {
    super(RuleActionKey.TC_GENERATEACTIVITY)
    addActionCommandParametersForPattern(pattern)
  }

  function withPriority(priority : Priority) : GenerateActivityCommandDefinitionBuilder {
    addToMap(Config.PRIORITY,ExpressionFragmentBuilders.forTypeKeyExpression(priority))
    return this
  }

  function withCalendarImportance(importance : ImportanceLevel) : GenerateActivityCommandDefinitionBuilder {
    addToMap(Config.CALENDAR_IMPORTANCE,ExpressionFragmentBuilders.forTypeKeyExpression(importance))
    return this
  }

  function withSubject(subject : String) : GenerateActivityCommandDefinitionBuilder {
    addToMap(Config.SUBJECT,ExpressionFragmentBuilders.forGosuTemplateExpression(subject))
    return this
  }

  function withAdditionalRestrictions(restriction : String) : GenerateActivityCommandDefinitionBuilder {
    addToMap(Config.ACTIVITY_RESTRICTION,ExpressionFragmentBuilders.forGosuTemplateExpression(restriction))
    return this
  }

  function withDescription(description : String) : GenerateActivityCommandDefinitionBuilder {
    addToMap(Config.DESCRIPTION,ExpressionFragmentBuilders.forGosuTemplateExpression(description))
    return this
  }

  function withAssignedTo(assignedTo : String) : GenerateActivityCommandDefinitionBuilder {
    addToMap(Config.ASSIGNED_TO,ExpressionFragmentBuilders.forGosuTemplateExpression(assignedTo))
    return this
  }

  function withTargetDays(targetDays : int) : GenerateActivityCommandDefinitionBuilder {
    addToMap(Config.TARGET_DAYS,ExpressionFragmentBuilders.forCodeExpression(targetDays as String))
    return this
  }

  function withTargetHours(targetHours : int) : GenerateActivityCommandDefinitionBuilder {
    addToMap(Config.TARGET_HOURS,ExpressionFragmentBuilders.forCodeExpression(targetHours as String))
    return this
  }

  function withTargetStartPoint(targetStartpoint : StartPointType) : GenerateActivityCommandDefinitionBuilder {
    addToMap(Config.TARGET_STARTPOINT,ExpressionFragmentBuilders.forTypeKeyExpression(targetStartpoint))
    return this
  }

  function withTargetIncludeDays(targetIncludedays : IncludeDaysType) : GenerateActivityCommandDefinitionBuilder {
    addToMap(Config.TARGET_INCLUDEDAYS,ExpressionFragmentBuilders.forTypeKeyExpression(targetIncludedays))
    return this
  }

  function withEscalationDays(escalationDays : int) : GenerateActivityCommandDefinitionBuilder {
    addToMap(Config.ESCALATION_DAYS,ExpressionFragmentBuilders.forCodeExpression(escalationDays as String))
    return this
  }

  function withEscalationHours(escalationHours : int) : GenerateActivityCommandDefinitionBuilder {
    addToMap(Config.ESCALATION_HOURS,ExpressionFragmentBuilders.forCodeExpression(escalationHours as String))
    return this
  }

  function withEscalationStartPoint(escalationStartpoint : StartPointType) : GenerateActivityCommandDefinitionBuilder {
    addToMap(Config.ESCALATION_STARTPOINT,ExpressionFragmentBuilders.forTypeKeyExpression(escalationStartpoint))
    return this
  }

  function withEscalationIncludeDays(escalationIncludedays : IncludeDaysType) : GenerateActivityCommandDefinitionBuilder {
    addToMap(Config.ESCALATION_INCLUDEDAYS,ExpressionFragmentBuilders.forTypeKeyExpression(escalationIncludedays))
    return this
  }

  function withQueue(queue : AssignableQueue) : GenerateActivityCommandDefinitionBuilder {
    assert queue.PublicID != null
    addToMap(Config.QUEUE_ID, ExpressionFragmentBuilders.forGosuTemplateExpression(queue.PublicID))
    return this
  }

  function withGroup(group : Group) : GenerateActivityCommandDefinitionBuilder {
    assert group.PublicID != null
    addToMap(Config.GROUP_ID, ExpressionFragmentBuilders.forGosuTemplateExpression(group.PublicID))
    return this
  }

  function withRole(role : typekey.UserRole) : GenerateActivityCommandDefinitionBuilder {
    addToMap(Config.ROLE, ExpressionFragmentBuilders.forTypeKeyExpression(role))
    return this
  }

  private function addActionCommandParametersForPattern(pattern: String) {
    var activityPattern = ActivityPattern.finder.getActivityPatternByCode(pattern)

    addToMap(Config.PATTERN, ExpressionFragmentBuilders.forCodeExpression("\"" + pattern + "\""))
    addToMap(Config.GROUP_ID, new GosuTemplateExpressionFragmentBuilder())
    addToMap(Config.QUEUE_ID, new GosuTemplateExpressionFragmentBuilder())
    addToMap(Config.ROLE, new TypeKeyExpressionFragmentBuilder())

    withClaimContextParameter()

    withRelatedTo(ClaimRelatedTo.NAME)
    withSubject(activityPattern.Subject)
    withDescription(activityPattern.Description)
    withPriority(activityPattern.Priority)
    withCalendarImportance(ImportanceLevel.TC_NOTONCALENDAR)
    withAssignedTo(AutoAssignActivityAssigneeLoader.NAME)
    withAdditionalRestrictions(NoActivityRestriction.NAME)
    withTargetDays(activityPattern.TargetDays ?: 0)
    withTargetHours(activityPattern.TargetHours ?: 0)
    withTargetStartPoint(activityPattern.TargetStartPoint ?: StartPointType.TC_ACTIVITYCREATION)
    withTargetIncludeDays(activityPattern.TargetIncludeDays ?: IncludeDaysType.TC_ELAPSED)
    withEscalationDays(activityPattern.EscalationDays?:0)
    withEscalationHours(activityPattern.EscalationHours?:0)
    withEscalationStartPoint(activityPattern.EscalationStartPt?:StartPointType.TC_ACTIVITYCREATION)
    withEscalationIncludeDays(activityPattern.EscalationInclDays?:IncludeDaysType.TC_ELAPSED)

  }

  protected override property get Config(): GenerateActivityCommandParameterConfig {
    return GenerateActivityCommandParameterSet.Config
  }
}
