package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/subrogation/SubrogationsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SubrogationsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/subrogation/SubrogationsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends SubrogationsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Claim) at SubrogationsLV.pcf: line 50, column 65
    function action_12 () : void {
      pcf.Claim.go(subrogationView.SubrogationClaim)
    }
    
    // 'action' attribute on TypeKeyCell (id=Status) at SubrogationsLV.pcf: line 68, column 50
    function action_24 () : void {
      pcf.ClaimSubrogationGroup.go(subrogationView.SubrogationClaim)
    }
    
    // 'action' attribute on TextCell (id=Claim) at SubrogationsLV.pcf: line 50, column 65
    function action_dest_13 () : pcf.api.Destination {
      return pcf.Claim.createDestination(subrogationView.SubrogationClaim)
    }
    
    // 'action' attribute on TypeKeyCell (id=Status) at SubrogationsLV.pcf: line 68, column 50
    function action_dest_25 () : pcf.api.Destination {
      return pcf.ClaimSubrogationGroup.createDestination(subrogationView.SubrogationClaim)
    }
    
    // 'condition' attribute on ToolbarFlag at SubrogationsLV.pcf: line 44, column 38
    function condition_10 () : java.lang.Boolean {
      return subrogationView.Subrogation.SubrogationSummary.EscalateSubro
    }
    
    // 'value' attribute on TextCell (id=Claim) at SubrogationsLV.pcf: line 50, column 65
    function valueRoot_15 () : java.lang.Object {
      return subrogationView.SubrogationClaim
    }
    
    // 'value' attribute on TextCell (id=Exposure) at SubrogationsLV.pcf: line 55, column 40
    function valueRoot_18 () : java.lang.Object {
      return subrogationView
    }
    
    // 'value' attribute on TextCell (id=Claim) at SubrogationsLV.pcf: line 50, column 65
    function value_11 () : java.lang.String {
      return subrogationView.SubrogationClaim.ClaimNumber
    }
    
    // 'value' attribute on TextCell (id=Exposure) at SubrogationsLV.pcf: line 55, column 40
    function value_16 () : entity.Exposure {
      return subrogationView.Exposure
    }
    
    // 'value' attribute on TextCell (id=AssignedUser) at SubrogationsLV.pcf: line 62, column 32
    function value_20 () : entity.User {
      return subrogationView.AssignedUser
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at SubrogationsLV.pcf: line 68, column 50
    function value_23 () : typekey.SubrogationStatus {
      return subrogationView.SubrogationStatus
    }
    
    // 'value' attribute on DateCell (id=ReferralDate) at SubrogationsLV.pcf: line 75, column 60
    function value_28 () : java.util.Date {
      return subrogationView.SubrogationReferralDate
    }
    
    // 'value' attribute on CurrencyCell (id=TotalIncurredNet) at SubrogationsLV.pcf: line 81, column 53
    function value_31 () : gw.api.financials.CurrencyAmount {
      return subrogationView.TotalIncurredNet
    }
    
    // 'value' attribute on TextCell (id=ExpectedRecoveryPercentage) at SubrogationsLV.pcf: line 88, column 102
    function value_34 () : java.lang.String {
      return util.Display.DisplayPercent(subrogationView.TotalExpectedRecoveryPercentage, 100)
    }
    
    // 'value' attribute on CurrencyCell (id=SubrogationRecoveries) at SubrogationsLV.pcf: line 94, column 83
    function value_36 () : gw.api.financials.CurrencyAmount {
      return subrogationView.TotalRecoveriesWithSubrogationRecoveryCategory
    }
    
    // 'visible' attribute on TextCell (id=AssignedUser) at SubrogationsLV.pcf: line 62, column 32
    function visible_19 () : java.lang.Boolean {
      return showOwner
    }
    
    property get subrogationView () : entity.SubrogationView {
      return getIteratedValue(1) as entity.SubrogationView
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/subrogation/SubrogationsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubrogationsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'cacheKey' attribute on ToolbarFilter at SubrogationsLV.pcf: line 30, column 42
    function cacheKey_4 () : java.lang.String {
      return filterSet.CacheKey
    }
    
    // 'filter' attribute on ToolbarFilterOption at SubrogationsLV.pcf: line 34, column 33
    function filter_1 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return filterSet.ActiveFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at SubrogationsLV.pcf: line 37, column 84
    function filter_2 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return filterSet.AllFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at SubrogationsLV.pcf: line 40, column 84
    function filter_3 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return filterSet.NewFilter
    }
    
    // 'initialValue' attribute on Variable at SubrogationsLV.pcf: line 20, column 55
    function initialValue_0 () : gw.api.subrogation.SubrogationFilterSet {
      return new gw.api.subrogation.SubrogationFilterSet()
    }
    
    // 'value' attribute on RowIterator at SubrogationsLV.pcf: line 50, column 65
    function sortValue_5 (subrogationView :  entity.SubrogationView) : java.lang.Object {
      return subrogationView.SubrogationClaim.ClaimNumber
    }
    
    // 'value' attribute on RowIterator at SubrogationsLV.pcf: line 55, column 40
    function sortValue_6 (subrogationView :  entity.SubrogationView) : java.lang.Object {
      return subrogationView.Exposure
    }
    
    // 'value' attribute on RowIterator at SubrogationsLV.pcf: line 68, column 50
    function sortValue_8 (subrogationView :  entity.SubrogationView) : java.lang.Object {
      return subrogationView.SubrogationStatus
    }
    
    // 'value' attribute on RowIterator at SubrogationsLV.pcf: line 75, column 60
    function sortValue_9 (subrogationView :  entity.SubrogationView) : java.lang.Object {
      return subrogationView.SubrogationReferralDate
    }
    
    // 'value' attribute on RowIterator at SubrogationsLV.pcf: line 27, column 79
    function value_39 () : gw.api.database.IQueryBeanResult<entity.SubrogationView> {
      return subrogationViews
    }
    
    // 'visible' attribute on RowIterator at SubrogationsLV.pcf: line 62, column 32
    function visible_7 () : java.lang.Boolean {
      return showOwner
    }
    
    property get filterSet () : gw.api.subrogation.SubrogationFilterSet {
      return getVariableValue("filterSet", 0) as gw.api.subrogation.SubrogationFilterSet
    }
    
    property set filterSet ($arg :  gw.api.subrogation.SubrogationFilterSet) {
      setVariableValue("filterSet", 0, $arg)
    }
    
    property get showOwner () : boolean {
      return getRequireValue("showOwner", 0) as java.lang.Boolean
    }
    
    property set showOwner ($arg :  boolean) {
      setRequireValue("showOwner", 0, $arg)
    }
    
    property get subrogationViews () : gw.api.database.IQueryBeanResult<SubrogationView> {
      return getRequireValue("subrogationViews", 0) as gw.api.database.IQueryBeanResult<SubrogationView>
    }
    
    property set subrogationViews ($arg :  gw.api.database.IQueryBeanResult<SubrogationView>) {
      setRequireValue("subrogationViews", 0, $arg)
    }
    
    
  }
  
  
}