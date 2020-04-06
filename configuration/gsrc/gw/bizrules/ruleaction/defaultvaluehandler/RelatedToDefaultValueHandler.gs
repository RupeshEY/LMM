package gw.bizrules.ruleaction.defaultvaluehandler

uses gw.bizrules.ruleaction.behavioralcommandparam.relatedto.ActivityRulesRelatedToFactory
uses gw.bizrules.ruleaction.behavioralcommandparam.relatedto.ActivityRulesRelatedTo
uses gw.bizrules.ruleaction.behavioralcommandparam.relatedto.ClaimRelatedTo
uses gw.bizrules.ruleaction.behavioralcommandparam.relatedto.ExposureRelatedTo
uses gw.bizrules.ruleaction.behavioralcommandparam.relatedto.SubrogationRelatedTo

/**
 * Default Value Handler for the ActivityRulesRelatedTo command parameter
 */
@Export
class RelatedToDefaultValueHandler extends FactoryDefaultValueHandler<ActivityRulesRelatedTo> {

  /**
   * Defines the default value for each context type
   */
  private static var _defaultRelatedToMap =
      new HashMap<RuleContextDefinitionKey, ActivityRulesRelatedTo>(){
          RuleContextDefinitionKey.TC_EXPOSURE->ExposureRelatedTo.INSTANCE,
          RuleContextDefinitionKey.TC_EXPOSUREITERATIVE->ExposureRelatedTo.INSTANCE,
          RuleContextDefinitionKey.TC_CLAIM->ClaimRelatedTo.INSTANCE,
          RuleContextDefinitionKey.TC_CHECKSETITERATIVE->ClaimRelatedTo.INSTANCE,
          RuleContextDefinitionKey.TC_RECOVERYSETITERATIVE->ClaimRelatedTo.INSTANCE,
          RuleContextDefinitionKey.TC_RESERVESETITERATIVE->ClaimRelatedTo.INSTANCE,
          RuleContextDefinitionKey.TC_RECOVERYRESERVESETITERATIVE->ClaimRelatedTo.INSTANCE,
          RuleContextDefinitionKey.TC_SUBROGATIONITERATIVE->ClaimRelatedTo.INSTANCE
  }

  /**
   * Defines the supported values for each context type
   */
  private static var _relatedToSupportedContexts =
      new HashMap<RuleContextDefinitionKey, List<ActivityRulesRelatedTo>>() {
      RuleContextDefinitionKey.TC_EXPOSURE -> {
          ClaimRelatedTo.INSTANCE,
          ExposureRelatedTo.INSTANCE
      },
      RuleContextDefinitionKey.TC_EXPOSUREITERATIVE -> {
          ClaimRelatedTo.INSTANCE,
          ExposureRelatedTo.INSTANCE
      },
      RuleContextDefinitionKey.TC_CLAIM -> {
          ClaimRelatedTo.INSTANCE
      },
      RuleContextDefinitionKey.TC_CHECKSETITERATIVE -> {
          ClaimRelatedTo.INSTANCE
      },
      RuleContextDefinitionKey.TC_RECOVERYSETITERATIVE -> {
          ClaimRelatedTo.INSTANCE
      },
      RuleContextDefinitionKey.TC_RESERVESETITERATIVE -> {
          ClaimRelatedTo.INSTANCE
      },
      RuleContextDefinitionKey.TC_RECOVERYRESERVESETITERATIVE -> {
          ClaimRelatedTo.INSTANCE
      },
      RuleContextDefinitionKey.TC_SUBROGATIONITERATIVE -> {
          ClaimRelatedTo.INSTANCE,
          SubrogationRelatedTo.INSTANCE
      }
  }

  /**
   * Defines the supported values for each rule action type
   */
  private static var _relatedToSupportedActions =
      new HashMap<RuleActionKey, List<ActivityRulesRelatedTo>>() {
      RuleActionKey.TC_GENERATEACTIVITY -> {
          ClaimRelatedTo.INSTANCE,
          ExposureRelatedTo.INSTANCE
      },
      RuleActionKey.TC_GENERATEHISTORYEVENT ->
          ActivityRulesRelatedToFactory.INSTANCE.getAllValues()
  }

  override function getDefaultValueForRuleKey(ruleContextKey: RuleContextDefinitionKey): ActivityRulesRelatedTo {
    if(ruleContextKey == null) {
      return null
    }
    var defaultRelatedTo = _defaultRelatedToMap.get(ruleContextKey)
    if (defaultRelatedTo == null) {
      throw new IllegalStateException("Unknown context: " + ruleContextKey)
    }
    return defaultRelatedTo
  }

  override public function getDefaultValueForRuleKeyAsString(ruleContextKey: RuleContextDefinitionKey): String {
    return getDefaultValueForRuleKey(ruleContextKey).Name
  }

  override function getAvailableValuesForContextAndAction(ruleContextKey: RuleContextDefinitionKey, ruleActionKey : RuleActionKey): List<ActivityRulesRelatedTo> {
    if(ruleContextKey == null) {
      return new ArrayList<ActivityRulesRelatedTo>()
    }
    var availableValuesForAction : List<ActivityRulesRelatedTo>
    if(ruleActionKey == null) {
      availableValuesForAction = ActivityRulesRelatedToFactory.INSTANCE.getAllValues()
    } else {
      availableValuesForAction = _relatedToSupportedActions.get(ruleActionKey)
    }
    if (availableValuesForAction == null) {
      throw new IllegalStateException("Unknown action: " + ruleActionKey)
    }
    var availableValuesForContext = new ArrayList<ActivityRulesRelatedTo>(_relatedToSupportedContexts.get(ruleContextKey))
    if (availableValuesForContext == null) {
      throw new IllegalStateException("Unknown context: " + ruleContextKey)
    }
    availableValuesForContext.retainAll(availableValuesForAction)
    return availableValuesForContext
  }

  override public function getValueFromFactory(key : String) : ActivityRulesRelatedTo {
    return ActivityRulesRelatedToFactory.INSTANCE.getInstance(key)
  }

}