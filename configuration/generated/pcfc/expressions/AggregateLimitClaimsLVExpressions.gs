package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/AggregateLimitClaimsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AggregateLimitClaimsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/AggregateLimitClaimsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AggregateLimitClaimsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at AggregateLimitClaimsLV.pcf: line 18, column 47
    function initialValue_0 () : gw.claim.ClaimLimitUsedAmount[] {
      return gw.claim.ClaimLimitUsedAmount.fromClaimAggregateLimitRpts(ClaimAggregateLimitRptList)
    }
    
    // 'value' attribute on RowIterator at AggregateLimitClaimsLV.pcf: line 33, column 41
    function sortValue_1 (claimRow :  gw.claim.ClaimLimitUsedAmount) : java.lang.Object {
      return claimRow.ClaimNumber
    }
    
    // 'value' attribute on RowIterator at AggregateLimitClaimsLV.pcf: line 39, column 39
    function sortValue_2 (claimRow :  gw.claim.ClaimLimitUsedAmount) : java.lang.Object {
      return claimRow.LimitUsed
    }
    
    // 'value' attribute on RowIterator at AggregateLimitClaimsLV.pcf: line 47, column 24
    function sortValue_3 (claimRow :  gw.claim.ClaimLimitUsedAmount) : java.lang.Object {
      return claimRow.NetIncurredContribution
    }
    
    // 'value' attribute on RowIterator at AggregateLimitClaimsLV.pcf: line 54, column 49
    function sortValue_4 (claimRow :  gw.claim.ClaimLimitUsedAmount) : java.lang.Object {
      return claimRow.NetPaidContribution
    }
    
    // '$$sumValue' attribute on RowIterator at AggregateLimitClaimsLV.pcf: line 39, column 39
    function sumValueRoot_6 (claimRow :  gw.claim.ClaimLimitUsedAmount) : java.lang.Object {
      return claimRow
    }
    
    // 'footerSumValue' attribute on RowIterator at AggregateLimitClaimsLV.pcf: line 39, column 39
    function sumValue_5 (claimRow :  gw.claim.ClaimLimitUsedAmount) : java.lang.Object {
      return claimRow.LimitUsed
    }
    
    // 'footerSumValue' attribute on RowIterator at AggregateLimitClaimsLV.pcf: line 47, column 24
    function sumValue_7 (claimRow :  gw.claim.ClaimLimitUsedAmount) : java.lang.Object {
      return claimRow.NetIncurredContribution
    }
    
    // 'footerSumValue' attribute on RowIterator at AggregateLimitClaimsLV.pcf: line 54, column 49
    function sumValue_9 (claimRow :  gw.claim.ClaimLimitUsedAmount) : java.lang.Object {
      return claimRow.NetPaidContribution
    }
    
    // 'value' attribute on RowIterator at AggregateLimitClaimsLV.pcf: line 24, column 51
    function value_28 () : gw.claim.ClaimLimitUsedAmount[] {
      return ClaimLimitUsedAmounts
    }
    
    property get AggregateLimit () : AggregateLimit {
      return getRequireValue("AggregateLimit", 0) as AggregateLimit
    }
    
    property set AggregateLimit ($arg :  AggregateLimit) {
      setRequireValue("AggregateLimit", 0, $arg)
    }
    
    property get ClaimAggregateLimitRptList () : ClaimAggregateLimitRpt[] {
      return getRequireValue("ClaimAggregateLimitRptList", 0) as ClaimAggregateLimitRpt[]
    }
    
    property set ClaimAggregateLimitRptList ($arg :  ClaimAggregateLimitRpt[]) {
      setRequireValue("ClaimAggregateLimitRptList", 0, $arg)
    }
    
    property get ClaimLimitUsedAmounts () : gw.claim.ClaimLimitUsedAmount[] {
      return getVariableValue("ClaimLimitUsedAmounts", 0) as gw.claim.ClaimLimitUsedAmount[]
    }
    
    property set ClaimLimitUsedAmounts ($arg :  gw.claim.ClaimLimitUsedAmount[]) {
      setVariableValue("ClaimLimitUsedAmounts", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/policy/AggregateLimitClaimsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends AggregateLimitClaimsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=CClaimNumber) at AggregateLimitClaimsLV.pcf: line 33, column 41
    function action_14 () : void {
      ClaimFinancialsSummary.goInMain(claimRow.Claim)
    }
    
    // 'action' attribute on TextCell (id=CClaimNumber) at AggregateLimitClaimsLV.pcf: line 33, column 41
    function action_dest_15 () : pcf.api.Destination {
      return pcf.ClaimFinancialsSummary.createDestination(claimRow.Claim)
    }
    
    // 'available' attribute on TextCell (id=CClaimNumber) at AggregateLimitClaimsLV.pcf: line 33, column 41
    function available_11 () : java.lang.Boolean {
      return not claimRow.Archived
    }
    
    // 'useArchivedStyle' attribute on Row at AggregateLimitClaimsLV.pcf: line 26, column 46
    function useArchivedStyle_27 () : java.lang.Boolean {
      return claimRow.Archived
    }
    
    // 'value' attribute on TextCell (id=CClaimNumber) at AggregateLimitClaimsLV.pcf: line 33, column 41
    function valueRoot_17 () : java.lang.Object {
      return claimRow
    }
    
    // 'value' attribute on TextCell (id=CClaimNumber) at AggregateLimitClaimsLV.pcf: line 33, column 41
    function value_12 () : java.lang.String {
      return claimRow.ClaimNumber
    }
    
    // 'value' attribute on CurrencyCell (id=CLimitUsed) at AggregateLimitClaimsLV.pcf: line 39, column 39
    function value_18 () : gw.api.financials.CurrencyAmount {
      return claimRow.LimitUsed
    }
    
    // 'value' attribute on CurrencyCell (id=CNetIncurredContribution) at AggregateLimitClaimsLV.pcf: line 47, column 24
    function value_21 () : gw.api.financials.CurrencyAmount {
      return claimRow.NetIncurredContribution
    }
    
    // 'value' attribute on CurrencyCell (id=CNetPaidContribution) at AggregateLimitClaimsLV.pcf: line 54, column 49
    function value_24 () : gw.api.financials.CurrencyAmount {
      return claimRow.NetPaidContribution
    }
    
    property get claimRow () : gw.claim.ClaimLimitUsedAmount {
      return getIteratedValue(1) as gw.claim.ClaimLimitUsedAmount
    }
    
    
  }
  
  
}