package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/user/TeamUserActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TeamUserActivitiesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/team/user/TeamUserActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends TeamUserActivitiesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Subject) at TeamUserActivitiesLV.pcf: line 90, column 45
    function action_35 () : void {
      ClaimWorkplan.go(ActivityTeamView.Claim); ActivityDetailForward.goInWorkspace(ActivityTeamView.Claim, ActivityTeamView.Activity)
    }
    
    // 'action' attribute on TextCell (id=CaseID) at TeamUserActivitiesLV.pcf: line 97, column 49
    function action_39 () : void {
      pcf.Claim.go(ActivityTeamView.Claim)
    }
    
    // 'action' attribute on TextCell (id=Insured) at TeamUserActivitiesLV.pcf: line 103, column 54
    function action_44 () : void {
      ClaimContactDetailPopup.push(ActivityTeamView.ClaimInsured, ActivityTeamView.Claim)
    }
    
    // 'action' attribute on TextCell (id=CaseID) at TeamUserActivitiesLV.pcf: line 97, column 49
    function action_dest_40 () : pcf.api.Destination {
      return pcf.Claim.createDestination(ActivityTeamView.Claim)
    }
    
    // 'action' attribute on TextCell (id=Insured) at TeamUserActivitiesLV.pcf: line 103, column 54
    function action_dest_45 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(ActivityTeamView.ClaimInsured, ActivityTeamView.Claim)
    }
    
    // 'condition' attribute on ToolbarFlag at TeamUserActivitiesLV.pcf: line 27, column 35
    function condition_23 () : java.lang.Boolean {
      return ActivityTeamView.canAssign() && !gw.api.activity.ActivityUtil.isWorksheetOpen(ActivityTeamView.ID)
    }
    
    // 'fontColor' attribute on DateCell (id=DueDate) at TeamUserActivitiesLV.pcf: line 77, column 48
    function fontColor_28 () : java.lang.String {
      return ActivityTeamView.Overdue ? "Red" : ""
    }
    
    // 'value' attribute on BooleanRadioCell (id=Escalated) at TeamUserActivitiesLV.pcf: line 70, column 47
    function valueRoot_26 () : java.lang.Object {
      return ActivityTeamView
    }
    
    // 'value' attribute on BooleanRadioCell (id=Escalated) at TeamUserActivitiesLV.pcf: line 70, column 47
    function value_24 () : java.lang.Boolean {
      return ActivityTeamView.Escalated
    }
    
    // 'value' attribute on DateCell (id=DueDate) at TeamUserActivitiesLV.pcf: line 77, column 48
    function value_27 () : java.util.Date {
      return ActivityTeamView.TargetDate
    }
    
    // 'value' attribute on TypeKeyCell (id=Priority) at TeamUserActivitiesLV.pcf: line 84, column 41
    function value_31 () : typekey.Priority {
      return ActivityTeamView.Priority
    }
    
    // 'value' attribute on TextCell (id=Subject) at TeamUserActivitiesLV.pcf: line 90, column 45
    function value_34 () : java.lang.String {
      return ActivityTeamView.Subject
    }
    
    // 'value' attribute on TextCell (id=CaseID) at TeamUserActivitiesLV.pcf: line 97, column 49
    function value_38 () : java.lang.String {
      return ActivityTeamView.ClaimNumber
    }
    
    // 'value' attribute on TextCell (id=Insured) at TeamUserActivitiesLV.pcf: line 103, column 54
    function value_43 () : java.lang.String {
      return ActivityTeamView.ClaimInsuredName
    }
    
    // 'value' attribute on BooleanRadioCell (id=ExternallyOwned) at TeamUserActivitiesLV.pcf: line 108, column 53
    function value_48 () : java.lang.Boolean {
      return ActivityTeamView.ExternallyOwned
    }
    
    // 'value' attribute on TypeKeyCell (id=LOB) at TeamUserActivitiesLV.pcf: line 114, column 40
    function value_51 () : typekey.LOBCode {
      return ActivityTeamView.LOBCode
    }
    
    // 'value' attribute on TypeKeyCell (id=State) at TeamUserActivitiesLV.pcf: line 120, column 45
    function value_54 () : typekey.Jurisdiction {
      return ActivityTeamView.JurisdictionState
    }
    
    property get ActivityTeamView () : entity.ActivityTeamView {
      return getIteratedValue(1) as entity.ActivityTeamView
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/team/user/TeamUserActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamUserActivitiesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'filter' attribute on ToolbarFilterOption at TeamUserActivitiesLV.pcf: line 34, column 80
    function filter_0 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at TeamUserActivitiesLV.pcf: line 37, column 88
    function filter_1 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenDueTodayFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at TeamUserActivitiesLV.pcf: line 56, column 48
    function filter_10 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.getSkippedLastNDaysFilter(30)
    }
    
    // 'filter' attribute on ToolbarFilterOption at TeamUserActivitiesLV.pcf: line 60, column 48
    function filter_13 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.NotReviewExternalOpenFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at TeamUserActivitiesLV.pcf: line 40, column 84
    function filter_2 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.getOpenDueInNDaysFilter(7)
    }
    
    // 'filter' attribute on ToolbarFilterOption at TeamUserActivitiesLV.pcf: line 44, column 33
    function filter_4 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenOverdueFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at TeamUserActivitiesLV.pcf: line 48, column 48
    function filter_5 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenEscalatedFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at TeamUserActivitiesLV.pcf: line 52, column 48
    function filter_7 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.getCompletedLastNDaysFilter(30)
    }
    
    // 'label' attribute on ToolbarFilterOption at TeamUserActivitiesLV.pcf: line 56, column 48
    function label_11 () : java.lang.Object {
      return DisplayKey.get("Java.ToolBar.Activities.SkippedLastNDays", 30)
    }
    
    // 'label' attribute on ToolbarFilterOption at TeamUserActivitiesLV.pcf: line 40, column 84
    function label_3 () : java.lang.Object {
      return DisplayKey.get("Java.ToolBar.Activities.DueNDays", 7)
    }
    
    // 'label' attribute on ToolbarFilterOption at TeamUserActivitiesLV.pcf: line 52, column 48
    function label_8 () : java.lang.Object {
      return DisplayKey.get("Java.ToolBar.Activities.ClosedLastNDays", 30)
    }
    
    // 'value' attribute on RowIterator at TeamUserActivitiesLV.pcf: line 77, column 48
    function sortValue_15 (ActivityTeamView :  entity.ActivityTeamView) : java.lang.Object {
      return ActivityTeamView.TargetDate
    }
    
    // 'value' attribute on RowIterator at TeamUserActivitiesLV.pcf: line 84, column 41
    function sortValue_16 (ActivityTeamView :  entity.ActivityTeamView) : java.lang.Object {
      return ActivityTeamView.Priority
    }
    
    // 'value' attribute on RowIterator at TeamUserActivitiesLV.pcf: line 90, column 45
    function sortValue_17 (ActivityTeamView :  entity.ActivityTeamView) : java.lang.Object {
      return ActivityTeamView.Subject
    }
    
    // 'value' attribute on RowIterator at TeamUserActivitiesLV.pcf: line 97, column 49
    function sortValue_18 (ActivityTeamView :  entity.ActivityTeamView) : java.lang.Object {
      return ActivityTeamView.ClaimNumber
    }
    
    // 'value' attribute on RowIterator at TeamUserActivitiesLV.pcf: line 103, column 54
    function sortValue_19 (ActivityTeamView :  entity.ActivityTeamView) : java.lang.Object {
      return ActivityTeamView.ClaimInsuredName
    }
    
    // 'value' attribute on RowIterator at TeamUserActivitiesLV.pcf: line 108, column 53
    function sortValue_20 (ActivityTeamView :  entity.ActivityTeamView) : java.lang.Object {
      return ActivityTeamView.ExternallyOwned
    }
    
    // 'value' attribute on RowIterator at TeamUserActivitiesLV.pcf: line 114, column 40
    function sortValue_21 (ActivityTeamView :  entity.ActivityTeamView) : java.lang.Object {
      return ActivityTeamView.LOBCode
    }
    
    // 'value' attribute on RowIterator at TeamUserActivitiesLV.pcf: line 120, column 45
    function sortValue_22 (ActivityTeamView :  entity.ActivityTeamView) : java.lang.Object {
      return ActivityTeamView.JurisdictionState
    }
    
    // 'value' attribute on RowIterator at TeamUserActivitiesLV.pcf: line 24, column 83
    function value_57 () : gw.api.database.IQueryBeanResult<entity.ActivityTeamView> {
      return ActivityTeamViewList
    }
    
    // 'visible' attribute on ToolbarFilterOption at TeamUserActivitiesLV.pcf: line 48, column 48
    function visible_6 () : java.lang.Boolean {
      return !FilterSet.QueueOrPending
    }
    
    property get ActivityTeamViewList () : gw.api.database.IQueryBeanResult<ActivityTeamView> {
      return getRequireValue("ActivityTeamViewList", 0) as gw.api.database.IQueryBeanResult<ActivityTeamView>
    }
    
    property set ActivityTeamViewList ($arg :  gw.api.database.IQueryBeanResult<ActivityTeamView>) {
      setRequireValue("ActivityTeamViewList", 0, $arg)
    }
    
    property get FilterSet () : gw.api.team.TeamUserActivityFilterSet {
      return getRequireValue("FilterSet", 0) as gw.api.team.TeamUserActivityFilterSet
    }
    
    property set FilterSet ($arg :  gw.api.team.TeamUserActivityFilterSet) {
      setRequireValue("FilterSet", 0, $arg)
    }
    
    
  }
  
  
}