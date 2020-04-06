package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ActivityRuleFilterCriteriaRuleActionInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ActivityRuleFilterCriteriaRuleActionInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/ActivityRuleFilterCriteriaRuleActionInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityRuleFilterCriteriaRuleActionInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RangeInput (id=HistoryEventType) at ActivityRuleFilterCriteriaRuleActionInputSet.pcf: line 38, column 99
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityRuleFilterCriteria.HistoryEventType = (__VALUE_TO_SET as gw.bizrules.ruleaction.generatehistoryevent.HistoryTypeWrapper)
    }
    
    // 'value' attribute on TypeKeyInput (id=ActionTypeFilter) at ActivityRuleFilterCriteriaRuleActionInputSet.pcf: line 17, column 23
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityRuleFilterCriteria.RuleActionKey = (__VALUE_TO_SET as RuleActionKey)
    }
    
    // 'value' attribute on TextInput (id=Expression) at ActivityRuleFilterCriteriaRuleActionInputSet.pcf: line 46, column 87
    function defaultSetter_27 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityRuleFilterCriteria.Expression = (__VALUE_TO_SET as String)
    }
    
    // 'value' attribute on RangeInput (id=ActivityPattern) at ActivityRuleFilterCriteriaRuleActionInputSet.pcf: line 28, column 95
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityRuleFilterCriteria.ActivityPattern = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'valueRange' attribute on RangeInput (id=ActivityPattern) at ActivityRuleFilterCriteriaRuleActionInputSet.pcf: line 28, column 95
    function valueRange_11 () : java.lang.Object {
      return gw.api.database.Query.make(entity.ActivityPattern).select().map(\elt -> elt.Code).toTypedArray()
    }
    
    // 'valueRange' attribute on RangeInput (id=HistoryEventType) at ActivityRuleFilterCriteriaRuleActionInputSet.pcf: line 38, column 99
    function valueRange_20 () : java.lang.Object {
      return gw.bizrules.ruleaction.generatehistoryevent.HistoryTypeWrapper.PossibleValues
    }
    
    // 'value' attribute on TypeKeyInput (id=ActionTypeFilter) at ActivityRuleFilterCriteriaRuleActionInputSet.pcf: line 17, column 23
    function valueRoot_3 () : java.lang.Object {
      return ActivityRuleFilterCriteria
    }
    
    // 'value' attribute on TypeKeyInput (id=ActionTypeFilter) at ActivityRuleFilterCriteriaRuleActionInputSet.pcf: line 17, column 23
    function value_0 () : RuleActionKey {
      return ActivityRuleFilterCriteria.RuleActionKey
    }
    
    // 'value' attribute on RangeInput (id=HistoryEventType) at ActivityRuleFilterCriteriaRuleActionInputSet.pcf: line 38, column 99
    function value_15 () : gw.bizrules.ruleaction.generatehistoryevent.HistoryTypeWrapper {
      return ActivityRuleFilterCriteria.HistoryEventType
    }
    
    // 'value' attribute on TextInput (id=Expression) at ActivityRuleFilterCriteriaRuleActionInputSet.pcf: line 46, column 87
    function value_24 () : String {
      return ActivityRuleFilterCriteria.Expression
    }
    
    // 'value' attribute on RangeInput (id=ActivityPattern) at ActivityRuleFilterCriteriaRuleActionInputSet.pcf: line 28, column 95
    function value_6 () : java.lang.String {
      return ActivityRuleFilterCriteria.ActivityPattern
    }
    
    // 'valueRange' attribute on RangeInput (id=ActivityPattern) at ActivityRuleFilterCriteriaRuleActionInputSet.pcf: line 28, column 95
    function verifyValueRangeIsAllowedType_12 ($$arg :  java.lang.String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ActivityPattern) at ActivityRuleFilterCriteriaRuleActionInputSet.pcf: line 28, column 95
    function verifyValueRangeIsAllowedType_12 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=HistoryEventType) at ActivityRuleFilterCriteriaRuleActionInputSet.pcf: line 38, column 99
    function verifyValueRangeIsAllowedType_21 ($$arg :  gw.bizrules.ruleaction.generatehistoryevent.HistoryTypeWrapper[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=HistoryEventType) at ActivityRuleFilterCriteriaRuleActionInputSet.pcf: line 38, column 99
    function verifyValueRangeIsAllowedType_21 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ActivityPattern) at ActivityRuleFilterCriteriaRuleActionInputSet.pcf: line 28, column 95
    function verifyValueRange_13 () : void {
      var __valueRangeArg = gw.api.database.Query.make(entity.ActivityPattern).select().map(\elt -> elt.Code).toTypedArray()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_12(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=HistoryEventType) at ActivityRuleFilterCriteriaRuleActionInputSet.pcf: line 38, column 99
    function verifyValueRange_22 () : void {
      var __valueRangeArg = gw.bizrules.ruleaction.generatehistoryevent.HistoryTypeWrapper.PossibleValues
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_21(__valueRangeArg)
    }
    
    // 'valueType' attribute on TypeKeyInput (id=ActionTypeFilter) at ActivityRuleFilterCriteriaRuleActionInputSet.pcf: line 17, column 23
    function verifyValueType_4 () : void {
      var __valueTypeArg : RuleActionKey
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : gw.entity.TypeKey = __valueTypeArg
    }
    
    // 'visible' attribute on RangeInput (id=HistoryEventType) at ActivityRuleFilterCriteriaRuleActionInputSet.pcf: line 38, column 99
    function visible_14 () : java.lang.Boolean {
      return ActivityRuleFilterCriteria.RuleActionKey == RuleActionKey.TC_GENERATEHISTORYEVENT
    }
    
    // 'visible' attribute on TextInput (id=Expression) at ActivityRuleFilterCriteriaRuleActionInputSet.pcf: line 46, column 87
    function visible_23 () : java.lang.Boolean {
      return ActivityRuleFilterCriteria.RuleActionKey == RuleActionKey.TC_SETFIELD
    }
    
    // 'visible' attribute on RangeInput (id=ActivityPattern) at ActivityRuleFilterCriteriaRuleActionInputSet.pcf: line 28, column 95
    function visible_5 () : java.lang.Boolean {
      return ActivityRuleFilterCriteria.RuleActionKey == RuleActionKey.TC_GENERATEACTIVITY
    }
    
    property get ActivityRuleFilterCriteria () : gw.bizrules.ActivityRuleFilterCriteria {
      return getRequireValue("ActivityRuleFilterCriteria", 0) as gw.bizrules.ActivityRuleFilterCriteria
    }
    
    property set ActivityRuleFilterCriteria ($arg :  gw.bizrules.ActivityRuleFilterCriteria) {
      setRequireValue("ActivityRuleFilterCriteria", 0, $arg)
    }
    
    
  }
  
  
}