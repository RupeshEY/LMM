package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ActivityRuleFilterCriteriaDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ActivityRuleFilterCriteriaDVExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/ActivityRuleFilterCriteriaDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityRuleFilterCriteriaDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at ActivityRuleFilterCriteriaDV.pcf: line 65, column 26
    function def_onEnter_34 (def :  pcf.ActivityRuleFilterCriteriaRuleActionInputSet) : void {
      def.onEnter(ActivityRuleFilterCriteria)
    }
    
    // 'def' attribute on InputSetRef at ActivityRuleFilterCriteriaDV.pcf: line 65, column 26
    function def_refreshVariables_35 (def :  pcf.ActivityRuleFilterCriteriaRuleActionInputSet) : void {
      def.refreshVariables(ActivityRuleFilterCriteria)
    }
    
    // 'value' attribute on RangeInput (id=Availability) at ActivityRuleFilterCriteriaDV.pcf: line 34, column 29
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityRuleFilterCriteria.Availability = (__VALUE_TO_SET as String)
    }
    
    // 'value' attribute on TextInput (id=TextFilter) at ActivityRuleFilterCriteriaDV.pcf: line 16, column 62
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityRuleFilterCriteria.NameOrDescription = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=LossTypeFilter) at ActivityRuleFilterCriteriaDV.pcf: line 43, column 25
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityRuleFilterCriteria.LossType = (__VALUE_TO_SET as LossType)
    }
    
    // 'value' attribute on TypeKeyInput (id=PolicyTypeFilter) at ActivityRuleFilterCriteriaDV.pcf: line 51, column 25
    function defaultSetter_26 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityRuleFilterCriteria.PolicyType = (__VALUE_TO_SET as PolicyType)
    }
    
    // 'value' attribute on TypeKeyInput (id=JurisdictionFilter) at ActivityRuleFilterCriteriaDV.pcf: line 59, column 25
    function defaultSetter_31 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityRuleFilterCriteria.Jurisdiction = (__VALUE_TO_SET as Jurisdiction)
    }
    
    // 'value' attribute on RangeInput (id=Status) at ActivityRuleFilterCriteriaDV.pcf: line 26, column 121
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityRuleFilterCriteria.Status = (__VALUE_TO_SET as gw.bizrules.management.RuleQueryFactory<ActivityRule, ActivityRuleVersion, ActivityRuleHead>)
    }
    
    // 'optionLabel' attribute on RangeInput (id=Status) at ActivityRuleFilterCriteriaDV.pcf: line 26, column 121
    function optionLabel_8 (VALUE :  gw.bizrules.management.RuleQueryFactory<ActivityRule, ActivityRuleVersion, ActivityRuleHead>) : java.lang.String {
      return VALUE.DisplayName
    }
    
    // 'valueRange' attribute on RangeInput (id=Availability) at ActivityRuleFilterCriteriaDV.pcf: line 34, column 29
    function valueRange_16 () : java.lang.Object {
      return ActivityRuleFilterCriteria.AvailabilityVals
    }
    
    // 'valueRange' attribute on RangeInput (id=Status) at ActivityRuleFilterCriteriaDV.pcf: line 26, column 121
    function valueRange_9 () : java.lang.Object {
      return ActivityRuleFilterCriteria.AvailableStatuses
    }
    
    // 'value' attribute on TextInput (id=TextFilter) at ActivityRuleFilterCriteriaDV.pcf: line 16, column 62
    function valueRoot_3 () : java.lang.Object {
      return ActivityRuleFilterCriteria
    }
    
    // 'value' attribute on TextInput (id=TextFilter) at ActivityRuleFilterCriteriaDV.pcf: line 16, column 62
    function value_0 () : java.lang.String {
      return ActivityRuleFilterCriteria.NameOrDescription
    }
    
    // 'value' attribute on RangeInput (id=Availability) at ActivityRuleFilterCriteriaDV.pcf: line 34, column 29
    function value_12 () : String {
      return ActivityRuleFilterCriteria.Availability
    }
    
    // 'value' attribute on TypeKeyInput (id=LossTypeFilter) at ActivityRuleFilterCriteriaDV.pcf: line 43, column 25
    function value_19 () : LossType {
      return ActivityRuleFilterCriteria.LossType
    }
    
    // 'value' attribute on TypeKeyInput (id=PolicyTypeFilter) at ActivityRuleFilterCriteriaDV.pcf: line 51, column 25
    function value_24 () : PolicyType {
      return ActivityRuleFilterCriteria.PolicyType
    }
    
    // 'value' attribute on TypeKeyInput (id=JurisdictionFilter) at ActivityRuleFilterCriteriaDV.pcf: line 59, column 25
    function value_29 () : Jurisdiction {
      return ActivityRuleFilterCriteria.Jurisdiction
    }
    
    // 'value' attribute on RangeInput (id=Status) at ActivityRuleFilterCriteriaDV.pcf: line 26, column 121
    function value_4 () : gw.bizrules.management.RuleQueryFactory<ActivityRule, ActivityRuleVersion, ActivityRuleHead> {
      return ActivityRuleFilterCriteria.Status
    }
    
    // 'valueRange' attribute on RangeInput (id=Status) at ActivityRuleFilterCriteriaDV.pcf: line 26, column 121
    function verifyValueRangeIsAllowedType_10 ($$arg :  gw.bizrules.management.RuleQueryFactory<ActivityRule, ActivityRuleVersion, ActivityRuleHead>[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Status) at ActivityRuleFilterCriteriaDV.pcf: line 26, column 121
    function verifyValueRangeIsAllowedType_10 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Availability) at ActivityRuleFilterCriteriaDV.pcf: line 34, column 29
    function verifyValueRangeIsAllowedType_17 ($$arg :  String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Availability) at ActivityRuleFilterCriteriaDV.pcf: line 34, column 29
    function verifyValueRangeIsAllowedType_17 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Status) at ActivityRuleFilterCriteriaDV.pcf: line 26, column 121
    function verifyValueRange_11 () : void {
      var __valueRangeArg = ActivityRuleFilterCriteria.AvailableStatuses
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_10(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=Availability) at ActivityRuleFilterCriteriaDV.pcf: line 34, column 29
    function verifyValueRange_18 () : void {
      var __valueRangeArg = ActivityRuleFilterCriteria.AvailabilityVals
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_17(__valueRangeArg)
    }
    
    // 'valueType' attribute on TypeKeyInput (id=LossTypeFilter) at ActivityRuleFilterCriteriaDV.pcf: line 43, column 25
    function verifyValueType_23 () : void {
      var __valueTypeArg : LossType
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : gw.entity.TypeKey = __valueTypeArg
    }
    
    // 'valueType' attribute on TypeKeyInput (id=PolicyTypeFilter) at ActivityRuleFilterCriteriaDV.pcf: line 51, column 25
    function verifyValueType_28 () : void {
      var __valueTypeArg : PolicyType
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : gw.entity.TypeKey = __valueTypeArg
    }
    
    // 'valueType' attribute on TypeKeyInput (id=JurisdictionFilter) at ActivityRuleFilterCriteriaDV.pcf: line 59, column 25
    function verifyValueType_33 () : void {
      var __valueTypeArg : Jurisdiction
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : gw.entity.TypeKey = __valueTypeArg
    }
    
    property get ActivityRuleFilterCriteria () : gw.bizrules.ActivityRuleFilterCriteria {
      return getRequireValue("ActivityRuleFilterCriteria", 0) as gw.bizrules.ActivityRuleFilterCriteria
    }
    
    property set ActivityRuleFilterCriteria ($arg :  gw.bizrules.ActivityRuleFilterCriteria) {
      setRequireValue("ActivityRuleFilterCriteria", 0, $arg)
    }
    
    
  }
  
  
}