package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/exposures/TeamExposuresLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TeamExposuresLVExpressions {
  @javax.annotation.Generated("config/web/pcf/team/exposures/TeamExposuresLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends TeamExposuresLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Exposures_CaseID) at TeamExposuresLV.pcf: line 57, column 49
    function action_22 () : void {
      pcf.Claim.go(ExposureTeamView.ExposureClaim)
    }
    
    // 'action' attribute on TextCell (id=Exposures_Order) at TeamExposuresLV.pcf: line 63, column 42
    function action_27 () : void {
      ExposureDetailForward.go(ExposureTeamView.ExposureClaim, ExposureTeamView.Exposure)
    }
    
    // 'action' attribute on TypeKeyCell (id=Exposures_Type) at TeamExposuresLV.pcf: line 69, column 45
    function action_32 () : void {
      ExposureDetailForward.go(ExposureTeamView.ExposureClaim, ExposureTeamView.Exposure)
    }
    
    // 'action' attribute on TextCell (id=Claims_Claimant) at TeamExposuresLV.pcf: line 80, column 50
    function action_40 () : void {
      ClaimContactDetailPopup.push(ExposureTeamView.Claimant, ExposureTeamView.ExposureClaim)
    }
    
    // 'action' attribute on TextCell (id=Exposures_CaseID) at TeamExposuresLV.pcf: line 57, column 49
    function action_dest_23 () : pcf.api.Destination {
      return pcf.Claim.createDestination(ExposureTeamView.ExposureClaim)
    }
    
    // 'action' attribute on TextCell (id=Exposures_Order) at TeamExposuresLV.pcf: line 63, column 42
    function action_dest_28 () : pcf.api.Destination {
      return pcf.ExposureDetailForward.createDestination(ExposureTeamView.ExposureClaim, ExposureTeamView.Exposure)
    }
    
    // 'action' attribute on TypeKeyCell (id=Exposures_Type) at TeamExposuresLV.pcf: line 69, column 45
    function action_dest_33 () : pcf.api.Destination {
      return pcf.ExposureDetailForward.createDestination(ExposureTeamView.ExposureClaim, ExposureTeamView.Exposure)
    }
    
    // 'action' attribute on TextCell (id=Claims_Claimant) at TeamExposuresLV.pcf: line 80, column 50
    function action_dest_41 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(ExposureTeamView.Claimant, ExposureTeamView.ExposureClaim)
    }
    
    // 'value' attribute on TextCell (id=Exposures_CaseID) at TeamExposuresLV.pcf: line 57, column 49
    function valueRoot_25 () : java.lang.Object {
      return ExposureTeamView
    }
    
    // 'value' attribute on TextCell (id=Exposures_CaseID) at TeamExposuresLV.pcf: line 57, column 49
    function value_21 () : java.lang.String {
      return ExposureTeamView.ClaimNumber
    }
    
    // 'value' attribute on TextCell (id=Exposures_Order) at TeamExposuresLV.pcf: line 63, column 42
    function value_26 () : java.lang.Integer {
      return ExposureTeamView.ClaimOrder
    }
    
    // 'value' attribute on TypeKeyCell (id=Exposures_Type) at TeamExposuresLV.pcf: line 69, column 45
    function value_31 () : typekey.ExposureType {
      return ExposureTeamView.ExposureType
    }
    
    // 'value' attribute on TypeKeyCell (id=Exposures_Coverage) at TeamExposuresLV.pcf: line 74, column 45
    function value_36 () : typekey.CoverageType {
      return ExposureTeamView.PrimaryCoverage
    }
    
    // 'value' attribute on TextCell (id=Claims_Claimant) at TeamExposuresLV.pcf: line 80, column 50
    function value_39 () : java.lang.String {
      return ExposureTeamView.ClaimantName
    }
    
    // 'value' attribute on TextCell (id=Exposures_Assignee) at TeamExposuresLV.pcf: line 85, column 59
    function value_44 () : java.lang.String {
      return ExposureTeamView.AssigneeDisplayString
    }
    
    // 'value' attribute on TextCell (id=Exposures_WorkloadWeight) at TeamExposuresLV.pcf: line 91, column 111
    function value_48 () : java.lang.Integer {
      return ExposureTeamView.WorkloadWeight
    }
    
    // 'value' attribute on CurrencyCell (id=Exposures_TotalIncurredNet) at TeamExposuresLV.pcf: line 97, column 61
    function value_52 () : gw.api.financials.CurrencyAmount {
      return ExposureTeamView.TotalIncurredNet
    }
    
    // 'visible' attribute on TextCell (id=Exposures_WorkloadWeight) at TeamExposuresLV.pcf: line 91, column 111
    function visible_47 () : java.lang.Boolean {
      return gw.api.system.CCConfigParameters.WeightedAssignmentEnabled.Value and perm.System.wwlview
    }
    
    // 'visible' attribute on CurrencyCell (id=Exposures_TotalIncurredNet) at TeamExposuresLV.pcf: line 97, column 61
    function visible_51 () : java.lang.Boolean {
      return perm.Claim.genericviewnettotalincurred
    }
    
    property get ExposureTeamView () : entity.ExposureTeamView {
      return getIteratedValue(1) as entity.ExposureTeamView
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/team/exposures/TeamExposuresLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamExposuresLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'cacheKey' attribute on ToolbarFilter at TeamExposuresLV.pcf: line 30, column 36
    function cacheKey_9 () : java.lang.String {
      return FilterSet.CacheKey
    }
    
    // 'filter' attribute on ToolbarFilterOption at TeamExposuresLV.pcf: line 34, column 33
    function filter_0 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenOwnedFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at TeamExposuresLV.pcf: line 37, column 81
    function filter_1 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenNewOwnedFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at TeamExposuresLV.pcf: line 41, column 52
    function filter_2 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.getClosedLastNDaysOwnedFilter(90)
    }
    
    // 'filter' attribute on ToolbarFilterOption at TeamExposuresLV.pcf: line 45, column 54
    function filter_5 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenRelatedFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at TeamExposuresLV.pcf: line 49, column 54
    function filter_7 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenNewRelatedFilter
    }
    
    // 'label' attribute on ToolbarFilterOption at TeamExposuresLV.pcf: line 41, column 52
    function label_3 () : java.lang.Object {
      return DisplayKey.get("Java.ToolBar.Exposures.ClosedLastNDays", 90)
    }
    
    // 'value' attribute on RowIterator at TeamExposuresLV.pcf: line 57, column 49
    function sortValue_10 (ExposureTeamView :  entity.ExposureTeamView) : java.lang.Object {
      return ExposureTeamView.ClaimNumber
    }
    
    // 'value' attribute on RowIterator at TeamExposuresLV.pcf: line 63, column 42
    function sortValue_11 (ExposureTeamView :  entity.ExposureTeamView) : java.lang.Object {
      return ExposureTeamView.ClaimOrder
    }
    
    // 'value' attribute on RowIterator at TeamExposuresLV.pcf: line 69, column 45
    function sortValue_12 (ExposureTeamView :  entity.ExposureTeamView) : java.lang.Object {
      return ExposureTeamView.ExposureType
    }
    
    // 'value' attribute on RowIterator at TeamExposuresLV.pcf: line 74, column 45
    function sortValue_13 (ExposureTeamView :  entity.ExposureTeamView) : java.lang.Object {
      return ExposureTeamView.PrimaryCoverage
    }
    
    // 'sortBy' attribute on RowIterator at TeamExposuresLV.pcf: line 85, column 59
    function sortValue_14 (ExposureTeamView :  entity.ExposureTeamView) : java.lang.Object {
      return ExposureTeamView.AssignmentStatus
    }
    
    // 'sortBy' attribute on RowIterator at TeamExposuresLV.pcf: line 85, column 59
    function sortValue_15 (ExposureTeamView :  entity.ExposureTeamView) : java.lang.Object {
      return ExposureTeamView.AssignedUser
    }
    
    // 'sortBy' attribute on RowIterator at TeamExposuresLV.pcf: line 85, column 59
    function sortValue_16 (ExposureTeamView :  entity.ExposureTeamView) : java.lang.Object {
      return ExposureTeamView.AssignedQueue
    }
    
    // 'value' attribute on RowIterator at TeamExposuresLV.pcf: line 91, column 111
    function sortValue_18 (ExposureTeamView :  entity.ExposureTeamView) : java.lang.Object {
      return ExposureTeamView.WorkloadWeight
    }
    
    // 'value' attribute on RowIterator at TeamExposuresLV.pcf: line 97, column 61
    function sortValue_20 (ExposureTeamView :  entity.ExposureTeamView) : java.lang.Object {
      return ExposureTeamView.TotalIncurredNet
    }
    
    // 'value' attribute on RowIterator at TeamExposuresLV.pcf: line 25, column 87
    function value_55 () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return ExposureTeamViewList
    }
    
    // 'visible' attribute on RowIterator at TeamExposuresLV.pcf: line 91, column 111
    function visible_17 () : java.lang.Boolean {
      return gw.api.system.CCConfigParameters.WeightedAssignmentEnabled.Value and perm.System.wwlview
    }
    
    // 'visible' attribute on RowIterator at TeamExposuresLV.pcf: line 97, column 61
    function visible_19 () : java.lang.Boolean {
      return perm.Claim.genericviewnettotalincurred
    }
    
    // 'visible' attribute on ToolbarFilterOption at TeamExposuresLV.pcf: line 41, column 52
    function visible_4 () : java.lang.Boolean {
      return FilterSet.ClosedFilterEnabled
    }
    
    // 'visible' attribute on ToolbarFilterOption at TeamExposuresLV.pcf: line 45, column 54
    function visible_6 () : java.lang.Boolean {
      return FilterSet.RelatedFiltersEnabled
    }
    
    property get ExposureTeamViewList () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return getRequireValue("ExposureTeamViewList", 0) as gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>
    }
    
    property set ExposureTeamViewList ($arg :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) {
      setRequireValue("ExposureTeamViewList", 0, $arg)
    }
    
    property get FilterSet () : gw.api.team.TeamExposureFilterSet {
      return getRequireValue("FilterSet", 0) as gw.api.team.TeamExposureFilterSet
    }
    
    property set FilterSet ($arg :  gw.api.team.TeamExposureFilterSet) {
      setRequireValue("FilterSet", 0, $arg)
    }
    
    
  }
  
  
}