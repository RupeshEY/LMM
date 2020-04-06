package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/PolicyLocationSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PolicyLocationSearchResultsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/search/claims/PolicyLocationSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends PolicyLocationSearchResultsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=PolicyNumber) at PolicyLocationSearchResultsLV.pcf: line 33, column 80
    function action_15 () : void {
      ViewPolicy.push(gw.api.heatmap.CatastropheHeatMap.getPolicySystemURL(), PolicyLocationSearchEntry.PolicyNumber, PolicyEffectiveDate)
    }
    
    // 'action' attribute on TextCell (id=ClaimNumber) at PolicyLocationSearchResultsLV.pcf: line 48, column 58
    function action_27 () : void {
      if (PolicyLocationSearchEntry.ClaimID != null) ClaimForward.go(gw.transaction.Transaction.getCurrent().loadBean(PolicyLocationSearchEntry.ClaimID) as Claim)
    }
    
    // 'action' attribute on TextCell (id=PolicyNumber) at PolicyLocationSearchResultsLV.pcf: line 33, column 80
    function action_dest_16 () : pcf.api.Destination {
      return pcf.ViewPolicy.createDestination(gw.api.heatmap.CatastropheHeatMap.getPolicySystemURL(), PolicyLocationSearchEntry.PolicyNumber, PolicyEffectiveDate)
    }
    
    // 'value' attribute on TextCell (id=PolicyNumber) at PolicyLocationSearchResultsLV.pcf: line 33, column 80
    function valueRoot_18 () : java.lang.Object {
      return PolicyLocationSearchEntry
    }
    
    // 'value' attribute on TextCell (id=PolicyNumber) at PolicyLocationSearchResultsLV.pcf: line 33, column 80
    function value_14 () : java.lang.String {
      return PolicyLocationSearchEntry.PolicyNumber
    }
    
    // 'value' attribute on TextCell (id=Insured) at PolicyLocationSearchResultsLV.pcf: line 43, column 58
    function value_23 () : java.lang.String {
      return PolicyLocationSearchEntry.InsuredName
    }
    
    // 'value' attribute on TextCell (id=ClaimNumber) at PolicyLocationSearchResultsLV.pcf: line 48, column 58
    function value_26 () : java.lang.String {
      return PolicyLocationSearchEntry.ClaimNumber
    }
    
    // 'value' attribute on TextCell (id=Address) at PolicyLocationSearchResultsLV.pcf: line 52, column 59
    function value_30 () : java.lang.String {
      return PolicyLocationSearchEntry.AddressLine1
    }
    
    // 'value' attribute on TextCell (id=City) at PolicyLocationSearchResultsLV.pcf: line 57, column 51
    function value_33 () : java.lang.String {
      return PolicyLocationSearchEntry.City
    }
    
    // 'value' attribute on TextCell (id=Phone) at PolicyLocationSearchResultsLV.pcf: line 61, column 52
    function value_36 () : java.lang.String {
      return PolicyLocationSearchEntry.Phone
    }
    
    // 'value' attribute on CurrencyCell (id=Status) at PolicyLocationSearchResultsLV.pcf: line 67, column 59
    function value_39 () : gw.api.financials.CurrencyAmount {
      return PolicyLocationSearchEntry.TotalInsured
    }
    
    // 'visible' attribute on TextCell (id=PolicyNumber) at PolicyLocationSearchResultsLV.pcf: line 33, column 80
    function visible_13 () : java.lang.Boolean {
      return gw.api.heatmap.CatastropheHeatMap.canJumpToPolicySystem()
    }
    
    // 'visible' attribute on TextCell (id=PolicyNumberNoLInk) at PolicyLocationSearchResultsLV.pcf: line 38, column 84
    function visible_19 () : java.lang.Boolean {
      return not gw.api.heatmap.CatastropheHeatMap.canJumpToPolicySystem()
    }
    
    property get PolicyLocationSearchEntry () : gw.api.heatmap.CatastropheSearchCriteria.PolicyLocationSearchResult {
      return getIteratedValue(1) as gw.api.heatmap.CatastropheSearchCriteria.PolicyLocationSearchResult
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/search/claims/PolicyLocationSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyLocationSearchResultsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'sortBy' attribute on IteratorSort at PolicyLocationSearchResultsLV.pcf: line 20, column 24
    function sortBy_0 (PolicyLocationSearchEntry :  gw.api.heatmap.CatastropheSearchCriteria.PolicyLocationSearchResult) : java.lang.Object {
      return PolicyLocationSearchEntry.PolicyNumber
    }
    
    // 'sortBy' attribute on IteratorSort at PolicyLocationSearchResultsLV.pcf: line 23, column 24
    function sortBy_1 (PolicyLocationSearchEntry :  gw.api.heatmap.CatastropheSearchCriteria.PolicyLocationSearchResult) : java.lang.Object {
      return PolicyLocationSearchEntry.City
    }
    
    // 'sortBy' attribute on IteratorSort at PolicyLocationSearchResultsLV.pcf: line 26, column 24
    function sortBy_2 (PolicyLocationSearchEntry :  gw.api.heatmap.CatastropheSearchCriteria.PolicyLocationSearchResult) : java.lang.Object {
      return PolicyLocationSearchEntry.AddressLine1
    }
    
    // 'value' attribute on RowIterator at PolicyLocationSearchResultsLV.pcf: line 57, column 51
    function sortValue_10 (PolicyLocationSearchEntry :  gw.api.heatmap.CatastropheSearchCriteria.PolicyLocationSearchResult) : java.lang.Object {
      return PolicyLocationSearchEntry.City
    }
    
    // 'value' attribute on RowIterator at PolicyLocationSearchResultsLV.pcf: line 61, column 52
    function sortValue_11 (PolicyLocationSearchEntry :  gw.api.heatmap.CatastropheSearchCriteria.PolicyLocationSearchResult) : java.lang.Object {
      return PolicyLocationSearchEntry.Phone
    }
    
    // 'value' attribute on RowIterator at PolicyLocationSearchResultsLV.pcf: line 67, column 59
    function sortValue_12 (PolicyLocationSearchEntry :  gw.api.heatmap.CatastropheSearchCriteria.PolicyLocationSearchResult) : java.lang.Object {
      return PolicyLocationSearchEntry.TotalInsured
    }
    
    // 'value' attribute on RowIterator at PolicyLocationSearchResultsLV.pcf: line 33, column 80
    function sortValue_4 (PolicyLocationSearchEntry :  gw.api.heatmap.CatastropheSearchCriteria.PolicyLocationSearchResult) : java.lang.Object {
      return PolicyLocationSearchEntry.PolicyNumber
    }
    
    // 'value' attribute on RowIterator at PolicyLocationSearchResultsLV.pcf: line 38, column 84
    function sortValue_6 (PolicyLocationSearchEntry :  gw.api.heatmap.CatastropheSearchCriteria.PolicyLocationSearchResult) : java.lang.Object {
      return PolicyLocationSearchEntry.PolicyNumber
    }
    
    // 'value' attribute on RowIterator at PolicyLocationSearchResultsLV.pcf: line 43, column 58
    function sortValue_7 (PolicyLocationSearchEntry :  gw.api.heatmap.CatastropheSearchCriteria.PolicyLocationSearchResult) : java.lang.Object {
      return PolicyLocationSearchEntry.InsuredName
    }
    
    // 'value' attribute on RowIterator at PolicyLocationSearchResultsLV.pcf: line 48, column 58
    function sortValue_8 (PolicyLocationSearchEntry :  gw.api.heatmap.CatastropheSearchCriteria.PolicyLocationSearchResult) : java.lang.Object {
      return PolicyLocationSearchEntry.ClaimNumber
    }
    
    // 'value' attribute on RowIterator at PolicyLocationSearchResultsLV.pcf: line 52, column 59
    function sortValue_9 (PolicyLocationSearchEntry :  gw.api.heatmap.CatastropheSearchCriteria.PolicyLocationSearchResult) : java.lang.Object {
      return PolicyLocationSearchEntry.AddressLine1
    }
    
    // 'value' attribute on RowIterator at PolicyLocationSearchResultsLV.pcf: line 17, column 109
    function value_42 () : java.util.List<gw.api.heatmap.CatastropheSearchCriteria.PolicyLocationSearchResult> {
      return PolicyLocationSearchList
    }
    
    // 'visible' attribute on RowIterator at PolicyLocationSearchResultsLV.pcf: line 33, column 80
    function visible_3 () : java.lang.Boolean {
      return gw.api.heatmap.CatastropheHeatMap.canJumpToPolicySystem()
    }
    
    // 'visible' attribute on RowIterator at PolicyLocationSearchResultsLV.pcf: line 38, column 84
    function visible_5 () : java.lang.Boolean {
      return not gw.api.heatmap.CatastropheHeatMap.canJumpToPolicySystem()
    }
    
    property get PolicyEffectiveDate () : java.util.Date {
      return getRequireValue("PolicyEffectiveDate", 0) as java.util.Date
    }
    
    property set PolicyEffectiveDate ($arg :  java.util.Date) {
      setRequireValue("PolicyEffectiveDate", 0, $arg)
    }
    
    property get PolicyLocationSearchList () : List<gw.api.heatmap.CatastropheSearchCriteria.PolicyLocationSearchResult> {
      return getRequireValue("PolicyLocationSearchList", 0) as List<gw.api.heatmap.CatastropheSearchCriteria.PolicyLocationSearchResult>
    }
    
    property set PolicyLocationSearchList ($arg :  List<gw.api.heatmap.CatastropheSearchCriteria.PolicyLocationSearchResult>) {
      setRequireValue("PolicyLocationSearchList", 0, $arg)
    }
    
    
  }
  
  
}