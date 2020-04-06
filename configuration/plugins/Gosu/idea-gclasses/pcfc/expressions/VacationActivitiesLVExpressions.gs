package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/user/VacationActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class VacationActivitiesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/team/user/VacationActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends VacationActivitiesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Subject) at VacationActivitiesLV.pcf: line 100, column 49
    function action_39 () : void {
      ClaimWorkplan.go(ActivityVacationView.Claim); ActivityDetailForward.goInWorkspace(ActivityVacationView.Claim, ActivityVacationView.Activity)
    }
    
    // 'action' attribute on TextCell (id=CaseID) at VacationActivitiesLV.pcf: line 107, column 53
    function action_43 () : void {
      pcf.Claim.go(ActivityVacationView.Claim)
    }
    
    // 'action' attribute on TextCell (id=Insured) at VacationActivitiesLV.pcf: line 113, column 58
    function action_48 () : void {
      ClaimContactDetailPopup.push(ActivityVacationView.ClaimInsured, ActivityVacationView.Claim)
    }
    
    // 'action' attribute on TextCell (id=CaseID) at VacationActivitiesLV.pcf: line 107, column 53
    function action_dest_44 () : pcf.api.Destination {
      return pcf.Claim.createDestination(ActivityVacationView.Claim)
    }
    
    // 'action' attribute on TextCell (id=Insured) at VacationActivitiesLV.pcf: line 113, column 58
    function action_dest_49 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(ActivityVacationView.ClaimInsured, ActivityVacationView.Claim)
    }
    
    // 'condition' attribute on ToolbarFlag at VacationActivitiesLV.pcf: line 27, column 35
    function condition_18 () : java.lang.Boolean {
      return ActivityVacationView.canAssign() && !gw.api.activity.ActivityUtil.isWorksheetOpen(ActivityVacationView.ID)
    }
    
    // 'condition' attribute on ToolbarFlag at VacationActivitiesLV.pcf: line 30, column 33
    function condition_19 () : java.lang.Boolean {
      return ActivityVacationView.canSkip() && !gw.api.activity.ActivityUtil.isWorksheetOpen(ActivityVacationView.ID)
    }
    
    // 'condition' attribute on ToolbarFlag at VacationActivitiesLV.pcf: line 33, column 37
    function condition_20 () : java.lang.Boolean {
      return ActivityVacationView.canComplete() && !gw.api.activity.ActivityUtil.isWorksheetOpen(ActivityVacationView.ID)
    }
    
    // 'condition' attribute on ToolbarFlag at VacationActivitiesLV.pcf: line 36, column 36
    function condition_21 () : java.lang.Boolean {
      return ActivityVacationView.canApprove() && !gw.api.activity.ActivityUtil.isWorksheetOpen(ActivityVacationView.ID)
    }
    
    // 'fontColor' attribute on DateCell (id=DueDate) at VacationActivitiesLV.pcf: line 87, column 52
    function fontColor_32 () : java.lang.String {
      return ActivityVacationView.Overdue ? "Red" : ""
    }
    
    // 'value' attribute on BooleanRadioCell (id=NewActivity) at VacationActivitiesLV.pcf: line 67, column 64
    function valueRoot_24 () : java.lang.Object {
      return ActivityVacationView
    }
    
    // 'value' attribute on BooleanRadioCell (id=NewActivity) at VacationActivitiesLV.pcf: line 67, column 64
    function value_22 () : java.lang.Boolean {
      return ActivityVacationView.UpdatedSinceLastViewed
    }
    
    // 'value' attribute on BooleanRadioCell (id=Escalated) at VacationActivitiesLV.pcf: line 75, column 51
    function value_25 () : java.lang.Boolean {
      return ActivityVacationView.Escalated
    }
    
    // 'value' attribute on TextCell (id=AssignedUser) at VacationActivitiesLV.pcf: line 81, column 58
    function value_28 () : java.lang.String {
      return ActivityVacationView.AssignedUserName
    }
    
    // 'value' attribute on DateCell (id=DueDate) at VacationActivitiesLV.pcf: line 87, column 52
    function value_31 () : java.util.Date {
      return ActivityVacationView.TargetDate
    }
    
    // 'value' attribute on TypeKeyCell (id=Priority) at VacationActivitiesLV.pcf: line 94, column 41
    function value_35 () : typekey.Priority {
      return ActivityVacationView.Priority
    }
    
    // 'value' attribute on TextCell (id=Subject) at VacationActivitiesLV.pcf: line 100, column 49
    function value_38 () : java.lang.String {
      return ActivityVacationView.Subject
    }
    
    // 'value' attribute on TextCell (id=CaseID) at VacationActivitiesLV.pcf: line 107, column 53
    function value_42 () : java.lang.String {
      return ActivityVacationView.ClaimNumber
    }
    
    // 'value' attribute on TextCell (id=Insured) at VacationActivitiesLV.pcf: line 113, column 58
    function value_47 () : java.lang.String {
      return ActivityVacationView.ClaimInsuredName
    }
    
    // 'value' attribute on TextCell (id=Exposure) at VacationActivitiesLV.pcf: line 120, column 50
    function value_52 () : java.lang.String {
      return ActivityVacationView.Exposure
    }
    
    // 'value' attribute on BooleanRadioCell (id=ExternallyOwned) at VacationActivitiesLV.pcf: line 125, column 57
    function value_55 () : java.lang.Boolean {
      return ActivityVacationView.ExternallyOwned
    }
    
    // 'value' attribute on TypeKeyCell (id=LOB) at VacationActivitiesLV.pcf: line 131, column 40
    function value_58 () : typekey.LOBCode {
      return ActivityVacationView.LOBCode
    }
    
    // 'value' attribute on TypeKeyCell (id=State) at VacationActivitiesLV.pcf: line 137, column 45
    function value_61 () : typekey.Jurisdiction {
      return ActivityVacationView.JurisdictionState
    }
    
    property get ActivityVacationView () : entity.ActivityVacationView {
      return getIteratedValue(1) as entity.ActivityVacationView
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/team/user/VacationActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VacationActivitiesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'filter' attribute on ToolbarFilterOption at VacationActivitiesLV.pcf: line 42, column 33
    function filter_1 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.NotReviewOpenDueTodayFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at VacationActivitiesLV.pcf: line 45, column 84
    function filter_2 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.getNotReviewOpenDueInNDaysFilter(7)
    }
    
    // 'filter' attribute on ToolbarFilterOption at VacationActivitiesLV.pcf: line 48, column 80
    function filter_4 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.NotReviewOpenFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at VacationActivitiesLV.pcf: line 51, column 80
    function filter_5 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.NotReviewOpenOverdueFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at VacationActivitiesLV.pcf: line 54, column 88
    function filter_6 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.NotReviewExternalOpenFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at VacationActivitiesLV.pcf: line 57, column 92
    function filter_7 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.getNotReviewCompletedLastNDaysFilter(30)
    }
    
    // 'initialValue' attribute on Variable at VacationActivitiesLV.pcf: line 18, column 55
    function initialValue_0 () : gw.api.desktop.DesktopActivityFilterSet {
      return new gw.api.desktop.DesktopActivityFilterSet()
    }
    
    // 'label' attribute on ToolbarFilterOption at VacationActivitiesLV.pcf: line 45, column 84
    function label_3 () : java.lang.Object {
      return DisplayKey.get("Java.ToolBar.Activities.DueNDays", 7)
    }
    
    // 'label' attribute on ToolbarFilterOption at VacationActivitiesLV.pcf: line 57, column 92
    function label_8 () : java.lang.Object {
      return DisplayKey.get("Java.ToolBar.Activities.ClosedLastNDays", 30)
    }
    
    // 'value' attribute on RowIterator at VacationActivitiesLV.pcf: line 87, column 52
    function sortValue_10 (ActivityVacationView :  entity.ActivityVacationView) : java.lang.Object {
      return ActivityVacationView.TargetDate
    }
    
    // 'value' attribute on RowIterator at VacationActivitiesLV.pcf: line 94, column 41
    function sortValue_11 (ActivityVacationView :  entity.ActivityVacationView) : java.lang.Object {
      return ActivityVacationView.Priority
    }
    
    // 'value' attribute on RowIterator at VacationActivitiesLV.pcf: line 100, column 49
    function sortValue_12 (ActivityVacationView :  entity.ActivityVacationView) : java.lang.Object {
      return ActivityVacationView.Subject
    }
    
    // 'value' attribute on RowIterator at VacationActivitiesLV.pcf: line 107, column 53
    function sortValue_13 (ActivityVacationView :  entity.ActivityVacationView) : java.lang.Object {
      return ActivityVacationView.ClaimNumber
    }
    
    // 'value' attribute on RowIterator at VacationActivitiesLV.pcf: line 113, column 58
    function sortValue_14 (ActivityVacationView :  entity.ActivityVacationView) : java.lang.Object {
      return ActivityVacationView.ClaimInsuredName
    }
    
    // 'value' attribute on RowIterator at VacationActivitiesLV.pcf: line 125, column 57
    function sortValue_15 (ActivityVacationView :  entity.ActivityVacationView) : java.lang.Object {
      return ActivityVacationView.ExternallyOwned
    }
    
    // 'value' attribute on RowIterator at VacationActivitiesLV.pcf: line 131, column 40
    function sortValue_16 (ActivityVacationView :  entity.ActivityVacationView) : java.lang.Object {
      return ActivityVacationView.LOBCode
    }
    
    // 'value' attribute on RowIterator at VacationActivitiesLV.pcf: line 137, column 45
    function sortValue_17 (ActivityVacationView :  entity.ActivityVacationView) : java.lang.Object {
      return ActivityVacationView.JurisdictionState
    }
    
    // 'value' attribute on RowIterator at VacationActivitiesLV.pcf: line 81, column 58
    function sortValue_9 (ActivityVacationView :  entity.ActivityVacationView) : java.lang.Object {
      return ActivityVacationView.AssignedUserName
    }
    
    // 'value' attribute on RowIterator at VacationActivitiesLV.pcf: line 24, column 87
    function value_64 () : gw.api.database.IQueryBeanResult<entity.ActivityVacationView> {
      return ActivityVacationViewList
    }
    
    property get ActivityVacationViewList () : gw.api.database.IQueryBeanResult<ActivityVacationView> {
      return getRequireValue("ActivityVacationViewList", 0) as gw.api.database.IQueryBeanResult<ActivityVacationView>
    }
    
    property set ActivityVacationViewList ($arg :  gw.api.database.IQueryBeanResult<ActivityVacationView>) {
      setRequireValue("ActivityVacationViewList", 0, $arg)
    }
    
    property get FilterSet () : gw.api.desktop.DesktopActivityFilterSet {
      return getVariableValue("FilterSet", 0) as gw.api.desktop.DesktopActivityFilterSet
    }
    
    property set FilterSet ($arg :  gw.api.desktop.DesktopActivityFilterSet) {
      setVariableValue("FilterSet", 0, $arg)
    }
    
    
  }
  
  
}