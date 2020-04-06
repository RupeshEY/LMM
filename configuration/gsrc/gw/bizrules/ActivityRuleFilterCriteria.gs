package gw.bizrules

uses gw.api.database.ISelectQueryBuilder
uses gw.api.database.InOperation
uses gw.api.database.Queries
uses gw.api.database.Relop
uses gw.api.database.Table
uses gw.api.locale.DisplayKey
uses gw.api.web.SessionVar
uses gw.bizrules.management.FilterCriteria
uses gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet
uses gw.bizrules.ruleaction.generatehistoryevent.config.GenerateHistoryEventCommandParameterSet
uses gw.bizrules.ruleaction.generatehistoryevent.HistoryTypeWrapper
uses gw.bizrules.ruleaction.setfield.config.SetFieldCommandParameterSet
uses gw.entity.IEntityType
uses gw.lang.reflect.features.PropertyReference

uses java.lang.Exception

/**
 * Class to manage the Activity Rules Search Panel Filter Criteria - This stores all the criteria
 * used to create a filter
 */
@Export
class ActivityRuleFilterCriteria implements java.io.Serializable, FilterCriteria<ActivityRuleVersion> {

  /**
   * Store the instance in a session variable so that navigating away from a page
   * will persist the filter
   */
  private static var _instance  = new SessionVar<ActivityRuleFilterCriteria>()

  /**
   * Filter Fields
   */
  private var _nameOrDescription: String as NameOrDescription

  // Default status is the only filter which is not set to null by default.
  // Store a copy of it for later (to see if filters have been modified)
  private var _defaultStatus : gw.bizrules.management.RuleQueryFactory<ActivityRule, ActivityRuleVersion, ActivityRuleHead>
  private var _status: gw.bizrules.management.RuleQueryFactory<ActivityRule, ActivityRuleVersion, ActivityRuleHead> as Status
  private var _availableStatuses : gw.bizrules.management.RuleQueryFactory<ActivityRule, ActivityRuleVersion, ActivityRuleHead>[] as AvailableStatuses

  private var _availability: String as Availability
  private var _availabilityVals: List<String> as AvailabilityVals

  private var _lossType: typekey.LossType as LossType
  private var _policyType: typekey.PolicyType as PolicyType
  private var _jurisdiction: Jurisdiction as Jurisdiction

  private var _ruleActionKey: typekey.RuleActionKey as RuleActionKey
  private var _activityPattern: String as ActivityPattern
  private var _historyEventType: HistoryTypeWrapper as HistoryEventType
  private var _expression: String as Expression

  /**
   * Default Constructor
   */
  private construct() {
    var helper = new gw.bizrules.ActivityRulesPageHelper(ActivityRulesNavigationSupport.Instance.VersionController)
    var queryFactories = helper.RuleQueryFactories
    _defaultStatus = queryFactories.get(0)
    _status = _defaultStatus
    _availableStatuses = queryFactories.toTypedArray()
    _availabilityVals = {
        DisplayKey.get("Web.ActivityRules.Rule.RuleDetails.Availability.Available"),
        DisplayKey.get("Web.ActivityRules.Rule.RuleDetails.Availability.Unavailable")
    }
  }

  /**
   * Getter for the instance
   * @return
   */
  public static property get Instance() : ActivityRuleFilterCriteria {
    var retVal = _instance.get()
    if (retVal == null) {
      retVal = new ActivityRuleFilterCriteria()
      _instance.set(retVal)
    }
    return retVal
  }

  /**
   * Checks to see if a filter is present on the page
   * currently
   * @return true/false depending on if the filter is present
   */
  public property get Specified() : boolean {
    return !(_nameOrDescription == null
        && _status == _defaultStatus
        && _availability == null
        && _lossType == null
        && _policyType == null
        && _jurisdiction == null
        && _ruleActionKey == null)
  }

  /**
   * Clears out all the filter variables
   */
  public function clear() {
    _nameOrDescription = null
    _status = _defaultStatus
    _availability = null
    _lossType = null
    _policyType = null
    _jurisdiction = null
    _ruleActionKey = null
    _activityPattern = null
    _historyEventType = null
    _expression = null
  }

  /**
   * Copies a filter criteria from parameter to instance
   * @param criteria
   */
  public function copyFrom(criteria: ActivityRuleFilterCriteria) {
    _nameOrDescription = criteria.NameOrDescription
    _status = criteria.Status
    _availability = criteria.Availability
    _lossType = criteria.LossType
    _policyType = criteria.PolicyType
    _jurisdiction = criteria.Jurisdiction
    _ruleActionKey = criteria.RuleActionKey
    _activityPattern = criteria.ActivityPattern
    _historyEventType = criteria.HistoryEventType
    _expression = criteria.Expression
  }

  /**
   * Creates a new ActivityRuleFilterCriteria object
   * with the same filter fields
   * @return
   */
  public function copy(): ActivityRuleFilterCriteria {
    return new ActivityRuleFilterCriteria() {
        :NameOrDescription = NameOrDescription,
        :Status = Status,
        :Availability = Availability,
        :LossType = LossType,
        :PolicyType = PolicyType,
        :Jurisdiction = Jurisdiction,
        :RuleActionKey = RuleActionKey,
        :ActivityPattern = ActivityPattern,
        :HistoryEventType = HistoryEventType,
        :Expression = Expression
        }
  }

  /**
   * Main method to create the rule query using the filters
   * @param query
   */
  public function apply(query: ISelectQueryBuilder<ActivityRuleVersion>) {
    if (!Specified) {
      return
    }

    var ruleRestriction = query.join(ActivityRuleVersion#Rule)

    if (_nameOrDescription != null && _nameOrDescription.trim() != "") {
      ruleRestriction.or(\r -> {
        r.contains(Rule#Name, _nameOrDescription, true)
        r.contains(Rule#Description, _nameOrDescription, true)
      })
    }

    if(_availability != null) {
      if (_availability == _availabilityVals[0]) {
        ruleRestriction.compare(Rule#AvailableToRun, Relop.Equals, true)
      } else if (_availability == _availabilityVals[1]) {
        ruleRestriction.compare(Rule#AvailableToRun, Relop.Equals, false)
      }
    }

    if (_lossType != null) {
      filter<AppCritLossType, LossType>(ruleRestriction, AppCritLossType#LossType, _lossType, AppCritLossType#ActivityRule)
    }

    if (_policyType != null) {
      filter<AppCritPolicyType, PolicyType>(ruleRestriction, AppCritPolicyType#PolicyType, _policyType, AppCritPolicyType#ActivityRule)
    }

    if (_jurisdiction != null) {
      filter<AppCritJurisdiction, Jurisdiction>(ruleRestriction, AppCritJurisdiction#Jurisdiction, _jurisdiction, AppCritJurisdiction#ActivityRule)
    }

    if (_ruleActionKey != null) {
      var subselectRestriction = ruleRestriction.subselect(Rule#ID, CompareIn, RuleCommandDefinition#Rule)
          .compare(RuleCommandDefinition#RuleActionKey, Relop.Equals, _ruleActionKey)
          .join(RuleCommandParameter#RuleCommandDefinition)

      switch (_ruleActionKey) {
        case RuleActionKey.TC_GENERATEACTIVITY:
          var r = subselectRestriction.compare(RuleCommandParameter#ParameterName, Relop.Equals, GenerateActivityCommandParameterSet.Config.PATTERN.Name)
          if (_activityPattern != null) {
            r.join(RuleCommandParameter#Expression)
                .cast(CodeExpressionFragment)
                .compare(CodeExpressionFragment#CodeText, Relop.Equals, '"' + _activityPattern + '"')
          }
          break
        case RuleActionKey.TC_GENERATEHISTORYEVENT:
          if (_historyEventType != null) {
            var code = ""
            var r = subselectRestriction.compare(RuleCommandParameter#ParameterName, Relop.Equals, GenerateHistoryEventCommandParameterSet.Config.TYPE.Name)
            if(_historyEventType.Type != null) {
              code = _historyEventType.Type.Code
            } else if(_historyEventType.CustomType != null) {
              code = _historyEventType.CustomType.Code
            }
            r.join(RuleCommandParameter#Expression)
                .cast(TypeKeyExpressionFragment)
                .compare(TypeKeyExpressionFragment#Code, Relop.Equals, code)
          }
          break
        case RuleActionKey.TC_SETFIELD:
          var r = subselectRestriction.compare(RuleCommandParameter#ParameterName, Relop.Equals, SetFieldCommandParameterSet.Config.PROPERTY.Name)
          if (_expression != null) {
            r.join(RuleCommandParameter#Expression)
                .cast(PropertyReferenceExpressionFragment)
                .contains(PropertyReferenceExpressionFragment#FullPropertyDenorm, _expression, true)
          }
          break
        default:
          throw new Exception("Unknown RuleActionKey")
      }
    }
  }

  private static function filter<E extends gw.pl.persistence.core.Bean, T>(restriction: Table<ActivityRuleVersion>, filterProp: PropertyReference<E, T>, filterValue: T,
                                                                           ruleProperty: PropertyReference<E, ActivityRule>) {
    var tableQuery = Queries.createQuery<E>(E as IEntityType)
    var filterQuery = Queries.createQuery<E>(E as IEntityType).compare(filterProp, Relop.Equals, filterValue)
    restriction.or(\orRestriction -> {
      orRestriction.subselect(ActivityRule#ID, InOperation.CompareIn, filterQuery, ruleProperty)
      orRestriction.subselect(ActivityRule#ID, InOperation.CompareNotIn, tableQuery, ruleProperty)
    })
  }
}
