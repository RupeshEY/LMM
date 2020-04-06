package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/claims/TeamClaimsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TeamClaimsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/team/claims/TeamClaimsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends IteratorEntryExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on Link (id=Claimant) at TeamClaimsLV.pcf: line 106, column 37
    function label_47 () : java.lang.Object {
      return claimantName
    }
    
    // 'visible' attribute on Link (id=ClaimantSeperator) at TeamClaimsLV.pcf: line 110, column 111
    function visible_48 () : java.lang.Boolean {
      return claimantList.length > 1 and claimantName != claimantList[claimantList.length - 1]
    }
    
    property get claimantName () : java.lang.String {
      return getIteratedValue(2) as java.lang.String
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/team/claims/TeamClaimsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends TeamClaimsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=ClaimNumber) at TeamClaimsLV.pcf: line 75, column 46
    function action_28 () : void {
      pcf.Claim.go(ClaimTeamView.Claim)
    }
    
    // 'action' attribute on TextCell (id=Insured) at TeamClaimsLV.pcf: line 95, column 48
    function action_43 () : void {
      ClaimContactDetailPopup.push(ClaimTeamView.Insured, ClaimTeamView.Claim)
    }
    
    // 'action' attribute on TextCell (id=ClaimNumber) at TeamClaimsLV.pcf: line 75, column 46
    function action_dest_29 () : pcf.api.Destination {
      return pcf.Claim.createDestination(ClaimTeamView.Claim)
    }
    
    // 'action' attribute on TextCell (id=Insured) at TeamClaimsLV.pcf: line 95, column 48
    function action_dest_44 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(ClaimTeamView.Insured, ClaimTeamView.Claim)
    }
    
    // 'condition' attribute on ToolbarFlag at TeamClaimsLV.pcf: line 34, column 31
    function condition_23 () : java.lang.Boolean {
      return ClaimTeamView.canRemoveFlag()
    }
    
    // 'initialValue' attribute on Variable at TeamClaimsLV.pcf: line 29, column 26
    function initialValue_22 () : String[] {
      return ClaimTeamView.getClaimantNames()
    }
    
    // RowIterator at TeamClaimsLV.pcf: line 25, column 87
    function initializeVariables_56 () : void {
        claimantList = ClaimTeamView.getClaimantNames();

    }
    
    // 'value' attribute on BooleanRadioCell (id=Flagged) at TeamClaimsLV.pcf: line 69, column 51
    function valueRoot_26 () : java.lang.Object {
      return ClaimTeamView
    }
    
    // 'value' attribute on BooleanRadioCell (id=Flagged) at TeamClaimsLV.pcf: line 69, column 51
    function value_24 () : java.lang.Boolean {
      return ClaimTeamView.CurrentlyFlagged
    }
    
    // 'value' attribute on TextCell (id=ClaimNumber) at TeamClaimsLV.pcf: line 75, column 46
    function value_27 () : java.lang.String {
      return ClaimTeamView.ClaimNumber
    }
    
    // 'value' attribute on TextCell (id=Assignee) at TeamClaimsLV.pcf: line 80, column 56
    function value_32 () : java.lang.String {
      return ClaimTeamView.AssigneeDisplayString
    }
    
    // 'value' attribute on TextCell (id=WorkloadWeight) at TeamClaimsLV.pcf: line 86, column 111
    function value_36 () : java.lang.Integer {
      return ClaimTeamView.WorkloadWeight
    }
    
    // 'value' attribute on TextCell (id=PolicyID) at TeamClaimsLV.pcf: line 90, column 47
    function value_39 () : java.lang.String {
      return ClaimTeamView.PolicyNumber
    }
    
    // 'value' attribute on TextCell (id=Insured) at TeamClaimsLV.pcf: line 95, column 48
    function value_42 () : java.lang.String {
      return ClaimTeamView.InsuredDenorm
    }
    
    // 'value' attribute on LinkIterator (id=ClaimantName) at TeamClaimsLV.pcf: line 103, column 44
    function value_49 () : java.lang.String[] {
      return claimantList
    }
    
    // 'value' attribute on CurrencyCell (id=TotalIncurredNet) at TeamClaimsLV.pcf: line 117, column 51
    function value_50 () : gw.api.financials.CurrencyAmount {
      return ClaimTeamView.TotalIncurredNet
    }
    
    // 'value' attribute on DateCell (id=LossDate) at TeamClaimsLV.pcf: line 121, column 43
    function value_53 () : java.util.Date {
      return ClaimTeamView.LossDate
    }
    
    // 'visible' attribute on TextCell (id=WorkloadWeight) at TeamClaimsLV.pcf: line 86, column 111
    function visible_35 () : java.lang.Boolean {
      return gw.api.system.CCConfigParameters.WeightedAssignmentEnabled.Value and perm.System.wwlview
    }
    
    property get ClaimTeamView () : entity.ClaimTeamView {
      return getIteratedValue(1) as entity.ClaimTeamView
    }
    
    property get claimantList () : String[] {
      return getVariableValue("claimantList", 1) as String[]
    }
    
    property set claimantList ($arg :  String[]) {
      setVariableValue("claimantList", 1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/team/claims/TeamClaimsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamClaimsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'cacheKey' attribute on ToolbarFilter at TeamClaimsLV.pcf: line 37, column 33
    function cacheKey_10 () : java.lang.String {
      return FilterSet.CacheKey
    }
    
    // 'filter' attribute on ToolbarFilterOption at TeamClaimsLV.pcf: line 41, column 33
    function filter_0 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenOwnedFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at TeamClaimsLV.pcf: line 44, column 78
    function filter_1 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenNewOwnedFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at TeamClaimsLV.pcf: line 47, column 82
    function filter_2 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenFlaggedOwnedFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at TeamClaimsLV.pcf: line 51, column 52
    function filter_3 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.getClosedLastNDaysOwnedFilter(90)
    }
    
    // 'filter' attribute on ToolbarFilterOption at TeamClaimsLV.pcf: line 55, column 54
    function filter_6 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenRelatedFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at TeamClaimsLV.pcf: line 59, column 54
    function filter_8 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenNewRelatedFilter
    }
    
    // 'label' attribute on ToolbarFilterOption at TeamClaimsLV.pcf: line 51, column 52
    function label_4 () : java.lang.Object {
      return DisplayKey.get("Java.ToolBar.Claims.ClosedLastNDays", 90)
    }
    
    // 'sortBy' attribute on RowIterator at TeamClaimsLV.pcf: line 69, column 51
    function sortValue_11 (ClaimTeamView :  entity.ClaimTeamView) : java.lang.Object {
      return ClaimTeamView.Flagged
    }
    
    // 'value' attribute on RowIterator at TeamClaimsLV.pcf: line 75, column 46
    function sortValue_12 (ClaimTeamView :  entity.ClaimTeamView) : java.lang.Object {
      return ClaimTeamView.ClaimNumber
    }
    
    // 'sortBy' attribute on RowIterator at TeamClaimsLV.pcf: line 80, column 56
    function sortValue_13 (ClaimTeamView :  entity.ClaimTeamView) : java.lang.Object {
      return ClaimTeamView.AssignmentStatus
    }
    
    // 'sortBy' attribute on RowIterator at TeamClaimsLV.pcf: line 80, column 56
    function sortValue_14 (ClaimTeamView :  entity.ClaimTeamView) : java.lang.Object {
      return ClaimTeamView.AssignedUser
    }
    
    // 'sortBy' attribute on RowIterator at TeamClaimsLV.pcf: line 80, column 56
    function sortValue_15 (ClaimTeamView :  entity.ClaimTeamView) : java.lang.Object {
      return ClaimTeamView.AssignedQueue
    }
    
    // 'value' attribute on RowIterator at TeamClaimsLV.pcf: line 86, column 111
    function sortValue_17 (ClaimTeamView :  entity.ClaimTeamView) : java.lang.Object {
      return ClaimTeamView.WorkloadWeight
    }
    
    // 'value' attribute on RowIterator at TeamClaimsLV.pcf: line 90, column 47
    function sortValue_18 (ClaimTeamView :  entity.ClaimTeamView) : java.lang.Object {
      return ClaimTeamView.PolicyNumber
    }
    
    // 'value' attribute on RowIterator at TeamClaimsLV.pcf: line 95, column 48
    function sortValue_19 (ClaimTeamView :  entity.ClaimTeamView) : java.lang.Object {
      return ClaimTeamView.InsuredDenorm
    }
    
    // 'value' attribute on RowIterator at TeamClaimsLV.pcf: line 117, column 51
    function sortValue_20 (ClaimTeamView :  entity.ClaimTeamView) : java.lang.Object {
      return ClaimTeamView.TotalIncurredNet
    }
    
    // 'value' attribute on RowIterator at TeamClaimsLV.pcf: line 121, column 43
    function sortValue_21 (ClaimTeamView :  entity.ClaimTeamView) : java.lang.Object {
      return ClaimTeamView.LossDate
    }
    
    // 'value' attribute on RowIterator at TeamClaimsLV.pcf: line 25, column 87
    function value_57 () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return ClaimTeamViewList
    }
    
    // 'visible' attribute on RowIterator at TeamClaimsLV.pcf: line 86, column 111
    function visible_16 () : java.lang.Boolean {
      return gw.api.system.CCConfigParameters.WeightedAssignmentEnabled.Value and perm.System.wwlview
    }
    
    // 'visible' attribute on ToolbarFilterOption at TeamClaimsLV.pcf: line 51, column 52
    function visible_5 () : java.lang.Boolean {
      return FilterSet.ClosedFilterEnabled
    }
    
    // 'visible' attribute on ToolbarFilterOption at TeamClaimsLV.pcf: line 55, column 54
    function visible_7 () : java.lang.Boolean {
      return FilterSet.RelatedFiltersEnabled
    }
    
    property get ClaimTeamViewList () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return getRequireValue("ClaimTeamViewList", 0) as gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>
    }
    
    property set ClaimTeamViewList ($arg :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) {
      setRequireValue("ClaimTeamViewList", 0, $arg)
    }
    
    property get FilterSet () : gw.api.team.TeamClaimFilterSet {
      return getRequireValue("FilterSet", 0) as gw.api.team.TeamClaimFilterSet
    }
    
    property set FilterSet ($arg :  gw.api.team.TeamClaimFilterSet) {
      setRequireValue("FilterSet", 0, $arg)
    }
    
    
  }
  
  
}