package gw.bizrules.ruleaction.defaultvaluehandler

uses gw.bizrules.ruleaction.behavioralcommandparam.assignee.ActivityAssigneeLoaderFactory
uses gw.bizrules.ruleaction.behavioralcommandparam.assignee.ActivityAssigneeLoader
uses gw.bizrules.ruleaction.behavioralcommandparam.assignee.AutoAssignActivityAssigneeLoader
uses gw.bizrules.ruleaction.behavioralcommandparam.assignee.CheckCreatorActivityAssigneeLoader
uses gw.bizrules.ruleaction.behavioralcommandparam.assignee.ClaimOwnerActivityAssigneeLoader
uses gw.bizrules.ruleaction.behavioralcommandparam.assignee.ExposureOwnerActivityAssigneeLoader
uses gw.bizrules.ruleaction.behavioralcommandparam.assignee.GroupActivityAssigneeLoader
uses gw.bizrules.ruleaction.behavioralcommandparam.assignee.GroupSupervisorActivityAssigneeLoader
uses gw.bizrules.ruleaction.behavioralcommandparam.assignee.QueueActivityAssigneeLoader
uses gw.bizrules.ruleaction.behavioralcommandparam.assignee.RecoveryCreatorActivityAssigneeLoader
uses gw.bizrules.ruleaction.behavioralcommandparam.assignee.RecoveryReserveCreatorActivityAssigneeLoader
uses gw.bizrules.ruleaction.behavioralcommandparam.assignee.ReserveCreatorActivityAssigneeLoader
uses gw.bizrules.ruleaction.behavioralcommandparam.assignee.SubrogationOwnerActivityAssigneeLoader
uses gw.bizrules.ruleaction.behavioralcommandparam.assignee.UserRoleActivityAssigneeLoader

/**
 * Default Value Handler for the ActivityAssigneeLoader command parameter
 */
@Export
class ActivityAssigneeDefaultValueHandler extends FactoryDefaultValueHandler<ActivityAssigneeLoader> {

  override function getDefaultValueForRuleKey(ruleContextKey: RuleContextDefinitionKey): ActivityAssigneeLoader {
    return AutoAssignActivityAssigneeLoader.INSTANCE
  }

  override public function getDefaultValueForRuleKeyAsString(ruleContextKey: RuleContextDefinitionKey): String {
    return getDefaultValueForRuleKey(ruleContextKey).Name
  }

  override function getAvailableValuesForContextAndAction(ruleContextKey: RuleContextDefinitionKey, ruleActionKey : RuleActionKey): List<ActivityAssigneeLoader> {
    var assignees = {
        ClaimOwnerActivityAssigneeLoader.INSTANCE,
        AutoAssignActivityAssigneeLoader.INSTANCE,
        GroupActivityAssigneeLoader.INSTANCE,
        QueueActivityAssigneeLoader.INSTANCE,
        UserRoleActivityAssigneeLoader.INSTANCE,
        GroupSupervisorActivityAssigneeLoader.INSTANCE
    }
    if (ruleContextKey == RuleContextDefinitionKey.TC_EXPOSURE or ruleContextKey == RuleContextDefinitionKey.TC_EXPOSUREITERATIVE) {
      assignees.add(ExposureOwnerActivityAssigneeLoader.INSTANCE)
    } else if (ruleContextKey == RuleContextDefinitionKey.TC_RECOVERYSETITERATIVE) {
      assignees.add(RecoveryCreatorActivityAssigneeLoader.INSTANCE)
    } else if (ruleContextKey == RuleContextDefinitionKey.TC_RESERVESETITERATIVE) {
      assignees.add(ReserveCreatorActivityAssigneeLoader.INSTANCE)
    } else if (ruleContextKey == RuleContextDefinitionKey.TC_RECOVERYRESERVESETITERATIVE) {
      assignees.add(RecoveryReserveCreatorActivityAssigneeLoader.INSTANCE)
    } else if (ruleContextKey == RuleContextDefinitionKey.TC_SUBROGATIONITERATIVE) {
      assignees.add(SubrogationOwnerActivityAssigneeLoader.INSTANCE)
    } else if (ruleContextKey == RuleContextDefinitionKey.TC_CHECKSETITERATIVE) {
      assignees.add(CheckCreatorActivityAssigneeLoader.INSTANCE)
    }
    return assignees
  }

  override public function getValueFromFactory(key : String) : ActivityAssigneeLoader {
    return ActivityAssigneeLoaderFactory.INSTANCE.getInstance(key)
  }


}