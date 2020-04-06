package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/AggregateLimitDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AggregateLimitDetailDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/AggregateLimitDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AggregateLimitDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'available' attribute on CurrencyInput (id=AggregateLimit_LimitAmount) at AggregateLimitDetailDV.pcf: line 51, column 45
    function available_15 () : java.lang.Boolean {
      return PolicyPeriodType != null
    }
    
    // 'def' attribute on ListViewInput at AggregateLimitDetailDV.pcf: line 84, column 87
    function def_onEnter_40 (def :  pcf.AggregateLimitCoveragesLV) : void {
      def.onEnter(AggregateLimitHelper, Policy, AggregateLimit)
    }
    
    // 'def' attribute on ListViewInput (id=agglimitsListView) at AggregateLimitDetailDV.pcf: line 103, column 34
    function def_onEnter_46 (def :  pcf.AggregateLimitClaimsLV) : void {
      def.onEnter(AggregateLimit.ApplicableNonZeroClaimAggregateLimitRpts, AggregateLimit)
    }
    
    // 'def' attribute on ListViewInput at AggregateLimitDetailDV.pcf: line 84, column 87
    function def_refreshVariables_41 (def :  pcf.AggregateLimitCoveragesLV) : void {
      def.refreshVariables(AggregateLimitHelper, Policy, AggregateLimit)
    }
    
    // 'def' attribute on ListViewInput (id=agglimitsListView) at AggregateLimitDetailDV.pcf: line 103, column 34
    function def_refreshVariables_47 (def :  pcf.AggregateLimitClaimsLV) : void {
      def.refreshVariables(AggregateLimit.ApplicableNonZeroClaimAggregateLimitRpts, AggregateLimit)
    }
    
    // 'value' attribute on TypeKeyInput (id=AggregateLimit_ValueType) at AggregateLimitDetailDV.pcf: line 41, column 43
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      AggregateLimit.ValueType = (__VALUE_TO_SET as typekey.AggregateType)
    }
    
    // 'value' attribute on CurrencyInput (id=AggregateLimit_LimitAmount) at AggregateLimitDetailDV.pcf: line 51, column 45
    function defaultSetter_19 (__VALUE_TO_SET :  java.lang.Object) : void {
      AggregateLimit.LimitAmount = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TypeKeyInput (id=aggLimitCalcCriteria) at AggregateLimitDetailDV.pcf: line 72, column 51
    function defaultSetter_33 (__VALUE_TO_SET :  java.lang.Object) : void {
      AggregateLimit.AggLimitCalcCriteria = (__VALUE_TO_SET as typekey.AggLimitCalcCriteria)
    }
    
    // 'value' attribute on TextAreaInput (id=AggregateLimit_Comments) at AggregateLimitDetailDV.pcf: line 80, column 42
    function defaultSetter_37 (__VALUE_TO_SET :  java.lang.Object) : void {
      AggregateLimit.Comments = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeInput (id=AggregateLimit_PolicyPeriodType) at AggregateLimitDetailDV.pcf: line 31, column 46
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      PolicyPeriodType = (__VALUE_TO_SET as typekey.PolicyPeriodType)
    }
    
    // 'editable' attribute on RangeInput (id=AggregateLimit_PolicyPeriodType) at AggregateLimitDetailDV.pcf: line 31, column 46
    function editable_2 () : java.lang.Boolean {
      return AggregateLimit.New or AggregateLimitHelper.canChangeGrouping(Policy, PolicyPeriodType)
    }
    
    // 'editable' attribute on ListViewInput at AggregateLimitDetailDV.pcf: line 84, column 87
    function editable_39 () : java.lang.Boolean {
      return AggregateLimit.PolicyPeriod != null
    }
    
    // 'initialValue' attribute on Variable at AggregateLimitDetailDV.pcf: line 20, column 32
    function initialValue_0 () : PolicyPeriodType {
      return AggregateLimit.PolicyPeriod.PolicyPeriodType
    }
    
    // 'onChange' attribute on PostOnChange at AggregateLimitDetailDV.pcf: line 33, column 212
    function onChange_1 () : void {
      AggregateLimitHelper.resetCoveragesAndAssign(AggregateLimit, PolicyPeriodType, Policy); AggregateLimitHelper.invalidateListViewCache(CurrentLocation, "AggregateLimitCoveragesLV")
    }
    
    // 'showConfirmMessage' attribute on RangeInput (id=AggregateLimit_PolicyPeriodType) at AggregateLimitDetailDV.pcf: line 31, column 46
    function showConfirmMessage_5 () : java.lang.Boolean {
      return PolicyPeriodType != null and not AggregateLimit.CoverageLines.IsEmpty
    }
    
    // 'valueRange' attribute on RangeInput (id=AggregateLimit_PolicyPeriodType) at AggregateLimitDetailDV.pcf: line 31, column 46
    function valueRange_8 () : java.lang.Object {
      return gw.api.admin.AggregateLimitUtil.getPolicyTypes(Policy)
    }
    
    // 'value' attribute on TypeKeyInput (id=AggregateLimit_ValueType) at AggregateLimitDetailDV.pcf: line 41, column 43
    function valueRoot_14 () : java.lang.Object {
      return AggregateLimit
    }
    
    // 'value' attribute on TypeKeyInput (id=AggregateLimit_ValueType) at AggregateLimitDetailDV.pcf: line 41, column 43
    function value_11 () : typekey.AggregateType {
      return AggregateLimit.ValueType
    }
    
    // 'value' attribute on CurrencyInput (id=AggregateLimit_LimitAmount) at AggregateLimitDetailDV.pcf: line 51, column 45
    function value_16 () : gw.api.financials.CurrencyAmount {
      return AggregateLimit.LimitAmount
    }
    
    // 'value' attribute on CurrencyInput (id=AggregateLimit_AmountUsed) at AggregateLimitDetailDV.pcf: line 58, column 51
    function value_22 () : gw.api.financials.CurrencyAmount {
      return AggregateLimit.LimitUsed
    }
    
    // 'value' attribute on CurrencyInput (id=AggregateLimit_AmountRemaining) at AggregateLimitDetailDV.pcf: line 65, column 51
    function value_27 () : gw.api.financials.CurrencyAmount {
      return AggregateLimit.LimitRemaining
    }
    
    // 'value' attribute on RangeInput (id=AggregateLimit_PolicyPeriodType) at AggregateLimitDetailDV.pcf: line 31, column 46
    function value_3 () : typekey.PolicyPeriodType {
      return PolicyPeriodType
    }
    
    // 'value' attribute on TypeKeyInput (id=aggLimitCalcCriteria) at AggregateLimitDetailDV.pcf: line 72, column 51
    function value_31 () : typekey.AggLimitCalcCriteria {
      return AggregateLimit.AggLimitCalcCriteria
    }
    
    // 'value' attribute on TextAreaInput (id=AggregateLimit_Comments) at AggregateLimitDetailDV.pcf: line 80, column 42
    function value_35 () : java.lang.String {
      return AggregateLimit.Comments
    }
    
    // 'value' attribute on TextInput (id=lid1) at AggregateLimitDetailDV.pcf: line 100, column 105
    function value_43 () : java.lang.String {
      return DisplayKey.get("LV.Policy.AggregateLimits.CalculationUsedForRealized", AggregateLimit.FinancialsCalculationDescription)
    }
    
    // 'valueRange' attribute on RangeInput (id=AggregateLimit_PolicyPeriodType) at AggregateLimitDetailDV.pcf: line 31, column 46
    function verifyValueRangeIsAllowedType_9 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=AggregateLimit_PolicyPeriodType) at AggregateLimitDetailDV.pcf: line 31, column 46
    function verifyValueRangeIsAllowedType_9 ($$arg :  typekey.PolicyPeriodType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=AggregateLimit_PolicyPeriodType) at AggregateLimitDetailDV.pcf: line 31, column 46
    function verifyValueRange_10 () : void {
      var __valueRangeArg = gw.api.admin.AggregateLimitUtil.getPolicyTypes(Policy)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_9(__valueRangeArg)
    }
    
    // 'visible' attribute on CurrencyInput (id=AggregateLimit_AmountUsed) at AggregateLimitDetailDV.pcf: line 58, column 51
    function visible_21 () : java.lang.Boolean {
      return not CurrentLocation.InEditMode
    }
    
    // 'visible' attribute on TextInput (id=lid1) at AggregateLimitDetailDV.pcf: line 100, column 105
    function visible_42 () : java.lang.Boolean {
      return AggregateLimit.PolicyPeriod.PolicyPeriodType == typekey.PolicyPeriodType.TC_POLICY
    }
    
    property get AggregateLimit () : AggregateLimit {
      return getRequireValue("AggregateLimit", 0) as AggregateLimit
    }
    
    property set AggregateLimit ($arg :  AggregateLimit) {
      setRequireValue("AggregateLimit", 0, $arg)
    }
    
    property get AggregateLimitHelper () : gw.api.admin.AggregateLimitHelper {
      return getRequireValue("AggregateLimitHelper", 0) as gw.api.admin.AggregateLimitHelper
    }
    
    property set AggregateLimitHelper ($arg :  gw.api.admin.AggregateLimitHelper) {
      setRequireValue("AggregateLimitHelper", 0, $arg)
    }
    
    property get Policy () : Policy {
      return getRequireValue("Policy", 0) as Policy
    }
    
    property set Policy ($arg :  Policy) {
      setRequireValue("Policy", 0, $arg)
    }
    
    property get PolicyPeriodType () : PolicyPeriodType {
      return getVariableValue("PolicyPeriodType", 0) as PolicyPeriodType
    }
    
    property set PolicyPeriodType ($arg :  PolicyPeriodType) {
      setVariableValue("PolicyPeriodType", 0, $arg)
    }
    
    
  }
  
  
}