package gw.acc.iplm.dbupgrade.beforetriggers.activitypatterns

uses gw.entity.IEntityPropertyInfo

class IPLMActivityPatternCreateDetails {

  public var _patternCode : String
  public var _activityClass : String
  public var _activityType : String
  public var _category : String
  public var _claimLossType : String
  public var _subject : String
  public var _description : String
  public var _mandatory : boolean
  public var _priority : String
  public var _importance : String
  public var _targetDays : Integer
  public var _targetIncludeDays : String
  public var _targetStartPoint : String
  public var _escalationDays : Integer
  public var _escalationInclDays : String
  public var _escalationStartPt : String
  public var _recurring : boolean = Boolean.FALSE
  public var _automatedOnly : boolean
  public var _escalationBusCalTag : String
  public var _targetBusCalTag : String
  public var _closedClaimAvlble : boolean
  public var _command : String
  public var _externallyOwnded : boolean

  interface AbstractInsertBuilder {
    function mapTypeKey(propInfo : IEntityPropertyInfo, typelist : String, typecode : String) : void

    function mapValue(propInfo : IEntityPropertyInfo, value : Object) : void
  }

  public function setPatternCode(patternCode : String) : IPLMActivityPatternCreateDetails {
    this._patternCode = patternCode
    return this
  }

  public function setActivityClass(activityClass : String) : IPLMActivityPatternCreateDetails {
    this._activityClass = activityClass
    return this
  }

  public function setActivityType(activityType : String) : IPLMActivityPatternCreateDetails {
    this._activityType = activityType
    return this
  }

  public function setCategory(category : String) : IPLMActivityPatternCreateDetails {
    this._category = category
    return this
  }

  public function setClaimLossType(claimLossType : String) : IPLMActivityPatternCreateDetails {
    this._claimLossType = claimLossType
    return this
  }

  public function setSubject(subject : String) : IPLMActivityPatternCreateDetails {
    this._subject = subject
    return this
  }

  public function setDescription(description : String) : IPLMActivityPatternCreateDetails {
    this._description = description
    return this
  }

  public function setMandatory(mandatory : boolean) : IPLMActivityPatternCreateDetails {
    this._mandatory = mandatory
    return this
  }

  public function setPriority(priority : String) : IPLMActivityPatternCreateDetails {
    this._priority = priority
    return this
  }

  public function setImportance(importance : String) : IPLMActivityPatternCreateDetails {
    this._importance = importance
    return this
  }

  public function setTargetDays(targetDays : Integer) : IPLMActivityPatternCreateDetails {
    this._targetDays = targetDays
    return this
  }

  public function setTargetIncludeDays(targetIncludeDays : String) : IPLMActivityPatternCreateDetails {
    this._targetIncludeDays = targetIncludeDays
    return this
  }

  public function setTargetStartPoint(targetStartPoint : String) : IPLMActivityPatternCreateDetails {
    this._targetStartPoint = targetStartPoint
    return this
  }

  public function setEscalationDays(escalationDays : Integer) : IPLMActivityPatternCreateDetails {
    this._escalationDays = escalationDays
    return this
  }

  public function setEscalationInclDays(escalationInclDays : String) : IPLMActivityPatternCreateDetails {
    this._escalationInclDays = escalationInclDays
    return this
  }

  public function setEscalationStartPt(escalationStartPt : String) : IPLMActivityPatternCreateDetails {
    this._escalationStartPt = escalationStartPt
    return this
  }

  public function setAutomatedOnly(automatedOnly : boolean) : IPLMActivityPatternCreateDetails {
    this._automatedOnly = automatedOnly
    return this
  }

  public function setRecurring(recurring : boolean) : IPLMActivityPatternCreateDetails {
    this._recurring = recurring
    return this
  }

  public function setEscalationBusCalTag(escalationBusCalTag : String) : IPLMActivityPatternCreateDetails {
    this._escalationBusCalTag = escalationBusCalTag
    return this
  }

  public function setTargetBusCalTag(targetBusCalTag : String) : IPLMActivityPatternCreateDetails {
    this._targetBusCalTag = targetBusCalTag
    return this
  }

  public function setClosedClaimAvlble(closedClaimAvlble : boolean) : IPLMActivityPatternCreateDetails {
    this._closedClaimAvlble = closedClaimAvlble
    return this
  }

  public function setCommand(command : String) : IPLMActivityPatternCreateDetails {
    this._command = command
    return this
  }

  public function setExternallyOwnded(externallyOwnded : boolean) : IPLMActivityPatternCreateDetails {
    this._externallyOwnded = externallyOwnded
    return this
  }

  public function mapColumns(insertBuilder : AbstractInsertBuilder) : void {
    insertBuilder.mapTypeKey(ActivityPattern.ACTIVITYCLASS_PROP.get(), "activityclass", _activityClass)
    insertBuilder.mapTypeKey(ActivityPattern.TYPE_PROP.get(), "activitytype", _activityType)
    insertBuilder.mapTypeKey(ActivityPattern.CATEGORY_PROP.get(), "activitycategory", _category)
    insertBuilder.mapTypeKey(ActivityPattern.CLAIMLOSSTYPE_PROP.get(), "LossType", _claimLossType)
    insertBuilder.mapValue(ActivityPattern.CODE_PROP.get(), _patternCode)
    insertBuilder.mapValue(ActivityPattern.SUBJECT_PROP.get(), _subject)
    insertBuilder.mapValue(ActivityPattern.DESCRIPTION_PROP.get(), _description)
    insertBuilder.mapValue(ActivityPattern.MANDATORY_PROP.get(), _mandatory)
    insertBuilder.mapTypeKey(ActivityPattern.PRIORITY_PROP.get(), "priority", _priority)
    insertBuilder.mapTypeKey(ActivityPattern.IMPORTANCE_PROP.get(), "importancelevel", _importance)
    insertBuilder.mapValue(ActivityPattern.TARGETDAYS_PROP.get(), _targetDays)
    insertBuilder.mapTypeKey(ActivityPattern.TARGETINCLUDEDAYS_PROP.get(), "includedaystype", _targetIncludeDays)
    insertBuilder.mapTypeKey(ActivityPattern.TARGETSTARTPOINT_PROP.get(), "startpointtype", _targetStartPoint)
    insertBuilder.mapValue(ActivityPattern.ESCALATIONDAYS_PROP.get(), _escalationDays)
    insertBuilder.mapTypeKey(ActivityPattern.ESCALATIONINCLDAYS_PROP.get(), "includedaystype", _escalationInclDays)
    insertBuilder.mapTypeKey(ActivityPattern.ESCALATIONSTARTPT_PROP.get(), "startpointtype", _escalationStartPt)
    insertBuilder.mapValue(ActivityPattern.CLOSEDCLAIMAVLBLE_PROP.get(), _closedClaimAvlble)
    insertBuilder.mapValue(ActivityPattern.AUTOMATEDONLY_PROP.get(), _automatedOnly)
    insertBuilder.mapValue(ActivityPattern.RECURRING_PROP.get(), _recurring)
    insertBuilder.mapValue(ActivityPattern.EXTERNALLYOWNED_PROP.get(), Boolean.FALSE)
    insertBuilder.mapTypeKey(ActivityPattern.ESCALATIONBUSCALTAG_PROP.get(), "holidaytagcode", _escalationBusCalTag)
    insertBuilder.mapTypeKey(ActivityPattern.TARGETBUSCALTAG_PROP.get(), "holidaytagcode", _targetBusCalTag)
    insertBuilder.mapValue(ActivityPattern.COMMAND_PROP.get(), _command)
  }
}