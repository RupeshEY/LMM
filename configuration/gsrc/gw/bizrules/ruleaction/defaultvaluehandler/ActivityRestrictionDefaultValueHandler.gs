package gw.bizrules.ruleaction.defaultvaluehandler

uses gw.bizrules.ruleaction.behavioralcommandparam.activityrestriction.ActivityRestriction
uses gw.bizrules.ruleaction.behavioralcommandparam.activityrestriction.ActivityRestrictionFactory
uses gw.bizrules.ruleaction.behavioralcommandparam.activityrestriction.DuplicateAssigneeActivityRestriction
uses gw.bizrules.ruleaction.behavioralcommandparam.activityrestriction.DuplicateClaimActivityRestriction
uses gw.bizrules.ruleaction.behavioralcommandparam.activityrestriction.DuplicateExposureActivityRestriction
uses gw.bizrules.ruleaction.behavioralcommandparam.activityrestriction.DuplicateOpenAssigneeActivityRestriction
uses gw.bizrules.ruleaction.behavioralcommandparam.activityrestriction.DuplicateOpenClaimActivityRestriction
uses gw.bizrules.ruleaction.behavioralcommandparam.activityrestriction.DuplicateOpenExposureActivityRestriction
uses gw.bizrules.ruleaction.behavioralcommandparam.activityrestriction.NoActivityRestriction

/**
 * Default Value Handler for the ActivityRestriction command parameter
 */
@Export
class ActivityRestrictionDefaultValueHandler extends FactoryDefaultValueHandler<ActivityRestriction> {

  override function getDefaultValueForRuleKey(ruleContextKey: RuleContextDefinitionKey): ActivityRestriction {
    return NoActivityRestriction.INSTANCE
  }

  override public function getDefaultValueForRuleKeyAsString(ruleContextKey: RuleContextDefinitionKey): String {
    return getDefaultValueForRuleKey(ruleContextKey).Name
  }

  override function getAvailableValuesForContextAndAction(ruleContextKey: RuleContextDefinitionKey, ruleActionKey : RuleActionKey): List<ActivityRestriction> {
    var restrictsList = new ArrayList<ActivityRestriction>()

    if (ruleContextKey == RuleContextDefinitionKey.TC_EXPOSURE
        || ruleContextKey == RuleContextDefinitionKey.TC_EXPOSUREITERATIVE) {
      restrictsList.add(DuplicateExposureActivityRestriction.INSTANCE)
      restrictsList.add(DuplicateOpenExposureActivityRestriction.INSTANCE)
    }
    if (ruleContextKey == RuleContextDefinitionKey.TC_EXPOSURE
        || ruleContextKey == RuleContextDefinitionKey.TC_CLAIM
        || ruleContextKey == RuleContextDefinitionKey.TC_EXPOSUREITERATIVE
        || ruleContextKey == RuleContextDefinitionKey.TC_CHECKSETITERATIVE
        || ruleContextKey == RuleContextDefinitionKey.TC_RECOVERYSETITERATIVE
        || ruleContextKey == RuleContextDefinitionKey.TC_RESERVESETITERATIVE
        || ruleContextKey == RuleContextDefinitionKey.TC_RECOVERYRESERVESETITERATIVE
        || ruleContextKey == RuleContextDefinitionKey.TC_SUBROGATIONITERATIVE
        || ruleContextKey == null) {
      restrictsList.add(NoActivityRestriction.INSTANCE)
      restrictsList.add(DuplicateClaimActivityRestriction.INSTANCE)
      restrictsList.add(DuplicateOpenClaimActivityRestriction.INSTANCE)
      restrictsList.add(DuplicateAssigneeActivityRestriction.INSTANCE)
      restrictsList.add(DuplicateOpenAssigneeActivityRestriction.INSTANCE)
    } else {
      throw new IllegalStateException("Unknown ruleContextKey: " + ruleContextKey)
    }
    restrictsList.sort(\ val1, val2 -> val1.Name.compareTo(val2.Name))
    return restrictsList
  }

  override public function getValueFromFactory(key : String) : ActivityRestriction {
    return ActivityRestrictionFactory.INSTANCE.getInstance(key)
  }

}