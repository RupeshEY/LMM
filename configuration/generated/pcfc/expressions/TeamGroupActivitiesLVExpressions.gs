package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/activities/TeamGroupActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TeamGroupActivitiesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/team/activities/TeamGroupActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends TeamGroupActivitiesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Subject) at TeamGroupActivitiesLV.pcf: line 90, column 45
    function action_36 () : void {
      ClaimWorkplan.go(ActivityTeamView.Claim); ActivityDetailForward.goInWorkspace(ActivityTeamView.Claim, ActivityTeamView.Activity)
    }
    
    // 'action' attribute on TextCell (id=CaseID) at TeamGroupActivitiesLV.pcf: line 97, column 49
    function action_40 () : void {
      pcf.Claim.go(ActivityTeamView.Claim)
    }
    
    // 'action' attribute on TextCell (id=Insured) at TeamGroupActivitiesLV.pcf: line 103, column 54
    function action_45 () : void {
      ClaimContactDetailPopup.push(ActivityTeamView.ClaimInsured, ActivityTeamView.Claim)
    }
    
    // 'action' attribute on TextCell (id=CaseID) at TeamGroupActivitiesLV.pcf: line 97, column 49
    function action_dest_41 () : pcf.api.Destination {
      return pcf.Claim.createDestination(ActivityTeamView.Claim)
    }
    
    // 'action' attribute on TextCell (id=Insured) at TeamGroupActivitiesLV.pcf: line 103, column 54
    function action_dest_46 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(ActivityTeamView.ClaimInsured, ActivityTeamView.Claim)
    }
    
    // 'condition' attribute on ToolbarFlag at TeamGroupActivitiesLV.pcf: line 27, column 35
    function condition_24 () : java.lang.Boolean {
      return ActivityTeamView.canAssign() && !gw.api.activity.ActivityUtil.isWorksheetOpen(ActivityTeamView.ID)
    }
    
    // 'fontColor' attribute on DateCell (id=DueDate) at TeamGroupActivitiesLV.pcf: line 77, column 48
    function fontColor_29 () : java.lang.String {
      return ActivityTeamView.Overdue ? "Red" : ""
    }
    
    // 'value' attribute on BooleanRadioCell (id=Escalated) at TeamGroupActivitiesLV.pcf: line 70, column 47
    function valueRoot_27 () : java.lang.Object {
      return ActivityTeamView
    }
    
    // 'value' attribute on BooleanRadioCell (id=Escalated) at TeamGroupActivitiesLV.pcf: line 70, column 47
    function value_25 () : java.lang.Boolean {
      return ActivityTeamView.Escalated
    }
    
    // 'value' attribute on DateCell (id=DueDate) at TeamGroupActivitiesLV.pcf: line 77, column 48
    function value_28 () : java.util.Date {
      return ActivityTeamView.TargetDate
    }
    
    // 'value' attribute on TypeKeyCell (id=Priority) at TeamGroupActivitiesLV.pcf: line 84, column 41
    function value_32 () : typekey.Priority {
      return ActivityTeamView.Priority
    }
    
    // 'value' attribute on TextCell (id=Subject) at TeamGroupActivitiesLV.pcf: line 90, column 45
    function value_35 () : java.lang.String {
      return ActivityTeamView.Subject
    }
    
    // 'value' attribute on TextCell (id=CaseID) at TeamGroupActivitiesLV.pcf: line 97, column 49
    function value_39 () : java.lang.String {
      return ActivityTeamView.ClaimNumber
    }
    
    // 'value' attribute on TextCell (id=Insured) at TeamGroupActivitiesLV.pcf: line 103, column 54
    function value_44 () : java.lang.String {
      return ActivityTeamView.ClaimInsuredName
    }
    
    // 'value' attribute on TextCell (id=AssignedUser) at TeamGroupActivitiesLV.pcf: line 109, column 58
    function value_49 () : java.lang.String {
      return ActivityTeamView.ActivityAssignedUser
    }
    
    // 'value' attribute on BooleanRadioCell (id=ExternallyOwned) at TeamGroupActivitiesLV.pcf: line 114, column 53
    function value_52 () : java.lang.Boolean {
      return ActivityTeamView.ExternallyOwned
    }
    
    // 'value' attribute on TypeKeyCell (id=LOB) at TeamGroupActivitiesLV.pcf: line 120, column 40
    function value_55 () : typekey.LOBCode {
      return ActivityTeamView.LOBCode
    }
    
    // 'value' attribute on TypeKeyCell (id=State) at TeamGroupActivitiesLV.pcf: line 126, column 45
    function value_58 () : typekey.Jurisdiction {
      return ActivityTeamView.JurisdictionState
    }
    
    property get ActivityTeamView () : entity.ActivityTeamView {
      return getIteratedValue(1) as entity.ActivityTeamView
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/team/activities/TeamGroupActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupActivitiesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'filter' attribute on ToolbarFilterOption at TeamGroupActivitiesLV.pcf: line 34, column 80
    function filter_0 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at TeamGroupActivitiesLV.pcf: line 37, column 88
    function filter_1 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenDueTodayFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at TeamGroupActivitiesLV.pcf: line 56, column 48
    function filter_10 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.getSkippedLastNDaysFilter(30)
    }
    
    // 'filter' attribute on ToolbarFilterOption at TeamGroupActivitiesLV.pcf: line 60, column 48
    function filter_13 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.NotReviewExternalOpenFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at TeamGroupActivitiesLV.pcf: line 40, column 84
    function filter_2 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.getOpenDueInNDaysFilter(7)
    }
    
    // 'filter' attribute on ToolbarFilterOption at TeamGroupActivitiesLV.pcf: line 44, column 33
    function filter_4 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenOverdueFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at TeamGroupActivitiesLV.pcf: line 48, column 48
    function filter_5 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenEscalatedFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at TeamGroupActivitiesLV.pcf: line 52, column 48
    function filter_7 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.getCompletedLastNDaysFilter(30)
    }
    
    // 'label' attribute on ToolbarFilterOption at TeamGroupActivitiesLV.pcf: line 56, column 48
    function label_11 () : java.lang.Object {
      return DisplayKey.get("Java.ToolBar.Activities.SkippedLastNDays", 30)
    }
    
    // 'label' attribute on ToolbarFilterOption at TeamGroupActivitiesLV.pcf: line 40, column 84
    function label_3 () : java.lang.Object {
      return DisplayKey.get("Java.ToolBar.Activities.DueNDays", 7)
    }
    
    // 'label' attribute on ToolbarFilterOption at TeamGroupActivitiesLV.pcf: line 52, column 48
    function label_8 () : java.lang.Object {
      return DisplayKey.get("Java.ToolBar.Activities.ClosedLastNDays", 30)
    }
    
    // 'value' attribute on RowIterator at TeamGroupActivitiesLV.pcf: line 77, column 48
    function sortValue_15 (ActivityTeamView :  entity.ActivityTeamView) : java.lang.Object {
      return ActivityTeamView.TargetDate
    }
    
    // 'value' attribute on RowIterator at TeamGroupActivitiesLV.pcf: line 84, column 41
    function sortValue_16 (ActivityTeamView :  entity.ActivityTeamView) : java.lang.Object {
      return ActivityTeamView.Priority
    }
    
    // 'value' attribute on RowIterator at TeamGroupActivitiesLV.pcf: line 90, column 45
    function sortValue_17 (ActivityTeamView :  entity.ActivityTeamView) : java.lang.Object {
      return ActivityTeamView.Subject
    }
    
    // 'value' attribute on RowIterator at TeamGroupActivitiesLV.pcf: line 97, column 49
    function sortValue_18 (ActivityTeamView :  entity.ActivityTeamView) : java.lang.Object {
      return ActivityTeamView.ClaimNumber
    }
    
    // 'value' attribute on RowIterator at TeamGroupActivitiesLV.pcf: line 103, column 54
    function sortValue_19 (ActivityTeamView :  entity.ActivityTeamView) : java.lang.Object {
      return ActivityTeamView.ClaimInsuredName
    }
    
    // 'sortBy' attribute on RowIterator at TeamGroupActivitiesLV.pcf: line 109, column 58
    function sortValue_20 (ActivityTeamView :  entity.ActivityTeamView) : java.lang.Object {
      return ActivityTeamView.AssignedUserName
    }
    
    // 'value' attribute on RowIterator at TeamGroupActivitiesLV.pcf: line 114, column 53
    function sortValue_21 (ActivityTeamView :  entity.ActivityTeamView) : java.lang.Object {
      return ActivityTeamView.ExternallyOwned
    }
    
    // 'value' attribute on RowIterator at TeamGroupActivitiesLV.pcf: line 120, column 40
    function sortValue_22 (ActivityTeamView :  entity.ActivityTeamView) : java.lang.Object {
      return ActivityTeamView.LOBCode
    }
    
    // 'value' attribute on RowIterator at TeamGroupActivitiesLV.pcf: line 126, column 45
    function sortValue_23 (ActivityTeamView :  entity.ActivityTeamView) : java.lang.Object {
      return ActivityTeamView.JurisdictionState
    }
    
    // 'value' attribute on RowIterator at TeamGroupActivitiesLV.pcf: line 24, column 83
    function value_61 () : gw.api.database.IQueryBeanResult<entity.ActivityTeamView> {
      return ActivityTeamViewList
    }
    
    // 'visible' attribute on ToolbarFilterOption at TeamGroupActivitiesLV.pcf: line 48, column 48
    function visible_6 () : java.lang.Boolean {
      return !FilterSet.QueueOrPending
    }
    
    property get ActivityTeamViewList () : gw.api.database.IQueryBeanResult<ActivityTeamView> {
      return getRequireValue("ActivityTeamViewList", 0) as gw.api.database.IQueryBeanResult<ActivityTeamView>
    }
    
    property set ActivityTeamViewList ($arg :  gw.api.database.IQueryBeanResult<ActivityTeamView>) {
      setRequireValue("ActivityTeamViewList", 0, $arg)
    }
    
    property get FilterSet () : gw.api.team.TeamGroupActivityFilterSet {
      return getRequireValue("FilterSet", 0) as gw.api.team.TeamGroupActivityFilterSet
    }
    
    property set FilterSet ($arg :  gw.api.team.TeamGroupActivityFilterSet) {
      setRequireValue("FilterSet", 0, $arg)
    }
    
    
  }
  
  
}