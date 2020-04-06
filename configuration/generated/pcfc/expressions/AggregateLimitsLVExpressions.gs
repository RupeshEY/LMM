package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/AggregateLimitsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AggregateLimitsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/AggregateLimitsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AggregateLimitsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at AggregateLimitsLV.pcf: line 35, column 23
    function sortValue_0 (AggregateLimit :  entity.AggregateLimit) : java.lang.Object {
      return AggregateLimit.PolicyPeriod.PolicyPeriodType
    }
    
    // 'value' attribute on RowIterator at AggregateLimitsLV.pcf: line 41, column 24
    function sortValue_1 (AggregateLimit :  entity.AggregateLimit) : java.lang.Object {
      return AggregateLimit.ValueType
    }
    
    // 'value' attribute on RowIterator at AggregateLimitsLV.pcf: line 47, column 24
    function sortValue_2 (AggregateLimit :  entity.AggregateLimit) : java.lang.Object {
      return AggregateLimit.LimitAmount
    }
    
    // 'value' attribute on RowIterator at AggregateLimitsLV.pcf: line 56, column 24
    function sortValue_3 (AggregateLimit :  entity.AggregateLimit) : java.lang.Object {
      return AggregateLimit.LimitUsed
    }
    
    // 'value' attribute on RowIterator at AggregateLimitsLV.pcf: line 62, column 24
    function sortValue_4 (AggregateLimit :  entity.AggregateLimit) : java.lang.Object {
      return AggregateLimit.LimitRemaining
    }
    
    // 'value' attribute on RowIterator at AggregateLimitsLV.pcf: line 68, column 24
    function sortValue_5 (AggregateLimit :  entity.AggregateLimit) : java.lang.Object {
      return AggregateLimit.AggLimitCalcCriteria
    }
    
    // 'value' attribute on RowIterator at AggregateLimitsLV.pcf: line 73, column 24
    function sortValue_6 (AggregateLimit :  entity.AggregateLimit) : java.lang.Object {
      return AggregateLimit.getCoverageNames()
    }
    
    // 'value' attribute on RowIterator at AggregateLimitsLV.pcf: line 24, column 43
    function value_34 () : entity.AggregateLimit[] {
      return AggregateLimitList
    }
    
    property get AggregateLimitList () : AggregateLimit[] {
      return getRequireValue("AggregateLimitList", 0) as AggregateLimit[]
    }
    
    property set AggregateLimitList ($arg :  AggregateLimit[]) {
      setRequireValue("AggregateLimitList", 0, $arg)
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/policy/AggregateLimitsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends AggregateLimitsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on CurrencyCell (id=AmountUsed) at AggregateLimitsLV.pcf: line 56, column 24
    function action_21 () : void {
      AggregateLimitClaimsWorksheet.goInWorkspace(Claim, AggregateLimit)
    }
    
    // 'action' attribute on TypeKeyCell (id=PeriodType) at AggregateLimitsLV.pcf: line 35, column 23
    function action_8 () : void {
      ClaimPolicyAggregateLimitDetail.drilldown(Claim, AggregateLimit)
    }
    
    // 'action' attribute on CurrencyCell (id=AmountUsed) at AggregateLimitsLV.pcf: line 56, column 24
    function action_dest_22 () : pcf.api.Destination {
      return pcf.AggregateLimitClaimsWorksheet.createDestination(Claim, AggregateLimit)
    }
    
    // 'action' attribute on TypeKeyCell (id=PeriodType) at AggregateLimitsLV.pcf: line 35, column 23
    function action_dest_9 () : pcf.api.Destination {
      return pcf.ClaimPolicyAggregateLimitDetail.createDestination(Claim, AggregateLimit)
    }
    
    // 'available' attribute on CurrencyCell (id=AmountUsed) at AggregateLimitsLV.pcf: line 56, column 24
    function available_18 () : java.lang.Boolean {
      return not (AggregateLimit.LimitUsed.Amount.signum() == 0)
    }
    
    // 'fontColor' attribute on CurrencyCell (id=AmountUsed) at AggregateLimitsLV.pcf: line 56, column 24
    function fontColor_23 () : java.lang.String {
      return AggregateLimit.LimitUsed > AggregateLimit.LimitAmount ? "Red" : ""
    }
    
    // 'value' attribute on TypeKeyCell (id=PeriodType) at AggregateLimitsLV.pcf: line 35, column 23
    function valueRoot_11 () : java.lang.Object {
      return AggregateLimit.PolicyPeriod
    }
    
    // 'value' attribute on TypeKeyCell (id=ValueType) at AggregateLimitsLV.pcf: line 41, column 24
    function valueRoot_14 () : java.lang.Object {
      return AggregateLimit
    }
    
    // 'value' attribute on TypeKeyCell (id=ValueType) at AggregateLimitsLV.pcf: line 41, column 24
    function value_12 () : typekey.AggregateType {
      return AggregateLimit.ValueType
    }
    
    // 'value' attribute on CurrencyCell (id=LimitAmount) at AggregateLimitsLV.pcf: line 47, column 24
    function value_15 () : gw.api.financials.CurrencyAmount {
      return AggregateLimit.LimitAmount
    }
    
    // 'value' attribute on CurrencyCell (id=AmountUsed) at AggregateLimitsLV.pcf: line 56, column 24
    function value_19 () : gw.api.financials.CurrencyAmount {
      return AggregateLimit.LimitUsed
    }
    
    // 'value' attribute on CurrencyCell (id=AmountRemaining) at AggregateLimitsLV.pcf: line 62, column 24
    function value_26 () : gw.api.financials.CurrencyAmount {
      return AggregateLimit.LimitRemaining
    }
    
    // 'value' attribute on TypeKeyCell (id=AggLimitCalcCriteria) at AggregateLimitsLV.pcf: line 68, column 24
    function value_29 () : typekey.AggLimitCalcCriteria {
      return AggregateLimit.AggLimitCalcCriteria
    }
    
    // 'value' attribute on TextCell (id=Coverages) at AggregateLimitsLV.pcf: line 73, column 24
    function value_32 () : java.lang.String {
      return AggregateLimit.getCoverageNames()
    }
    
    // 'value' attribute on TypeKeyCell (id=PeriodType) at AggregateLimitsLV.pcf: line 35, column 23
    function value_7 () : typekey.PolicyPeriodType {
      return AggregateLimit.PolicyPeriod.PolicyPeriodType
    }
    
    property get AggregateLimit () : entity.AggregateLimit {
      return getIteratedValue(1) as entity.AggregateLimit
    }
    
    
  }
  
  
}