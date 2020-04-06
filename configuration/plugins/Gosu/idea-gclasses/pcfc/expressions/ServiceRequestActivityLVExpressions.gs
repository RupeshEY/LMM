package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/ServiceRequestActivityLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ServiceRequestActivityLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/ServiceRequestActivityLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ServiceRequestActivityLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Subject) at ServiceRequestActivityLV.pcf: line 112, column 135
    function action_44 () : void {
      openWorksheet(activity)
    }
    
    // 'available' attribute on TextCell (id=Subject) at ServiceRequestActivityLV.pcf: line 112, column 135
    function available_41 () : java.lang.Boolean {
      return perm.Activity.view(activity)
    }
    
    // 'condition' attribute on ToolbarFlag at ServiceRequestActivityLV.pcf: line 27, column 35
    function condition_21 () : java.lang.Boolean {
      return activity.canAssign() && !gw.api.activity.ActivityUtil.isWorksheetOpen(activity?.ID)
    }
    
    // 'condition' attribute on ToolbarFlag at ServiceRequestActivityLV.pcf: line 30, column 33
    function condition_22 () : java.lang.Boolean {
      return activity.canSkip() && !gw.api.activity.ActivityUtil.isWorksheetOpen(activity?.ID)
    }
    
    // 'condition' attribute on ToolbarFlag at ServiceRequestActivityLV.pcf: line 33, column 37
    function condition_23 () : java.lang.Boolean {
      return activity.canComplete() && !gw.api.activity.ActivityUtil.isWorksheetOpen(activity?.ID)
    }
    
    // 'condition' attribute on ToolbarFlag at ServiceRequestActivityLV.pcf: line 36, column 36
    function condition_24 () : java.lang.Boolean {
      return activity.canApprove() && !gw.api.activity.ActivityUtil.isWorksheetOpen(activity?.ID)
    }
    
    // 'fontColor' attribute on DateCell (id=DueDate) at ServiceRequestActivityLV.pcf: line 91, column 40
    function fontColor_32 () : java.lang.String {
      return activity.Overdue ? "Red" : ""
    }
    
    // 'value' attribute on BooleanRadioCell (id=Updated) at ServiceRequestActivityLV.pcf: line 76, column 52
    function valueRoot_27 () : java.lang.Object {
      return activity
    }
    
    // 'value' attribute on BooleanRadioCell (id=Updated) at ServiceRequestActivityLV.pcf: line 76, column 52
    function value_25 () : java.lang.Boolean {
      return activity.UpdatedSinceLastViewed
    }
    
    // 'value' attribute on BooleanRadioCell (id=Escalated) at ServiceRequestActivityLV.pcf: line 84, column 39
    function value_28 () : java.lang.Boolean {
      return activity.Escalated
    }
    
    // 'value' attribute on DateCell (id=DueDate) at ServiceRequestActivityLV.pcf: line 91, column 40
    function value_31 () : java.util.Date {
      return activity.TargetDate
    }
    
    // 'value' attribute on TypeKeyCell (id=Priority) at ServiceRequestActivityLV.pcf: line 98, column 41
    function value_35 () : typekey.Priority {
      return activity.Priority
    }
    
    // 'value' attribute on TextCell (id=Status) at ServiceRequestActivityLV.pcf: line 104, column 44
    function value_38 () : java.lang.String {
      return activity.ActivityStatus
    }
    
    // 'value' attribute on TextCell (id=Subject) at ServiceRequestActivityLV.pcf: line 112, column 135
    function value_42 () : java.lang.String {
      return String.isEmpty(activity.Subject) ? DisplayKey.get("LV.Activity.Activities.NoSubject") : activity.Subject
    }
    
    // 'value' attribute on TextCell (id=Assigner) at ServiceRequestActivityLV.pcf: line 118, column 178
    function value_46 () : java.lang.String {
      return (activity.AssignedByUser.Contact == null) ? DisplayKey.get("Java.Activity.AssignedByUser.SystemUser") : activity.AssignedByUser.Contact.DisplayName
    }
    
    // 'value' attribute on TextCell (id=AssignedUser) at ServiceRequestActivityLV.pcf: line 124, column 51
    function value_48 () : java.lang.String {
      return activity.AssigneeDisplayString
    }
    
    property get activity () : entity.Activity {
      return getIteratedValue(1) as entity.Activity
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/ServiceRequestActivityLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServiceRequestActivityLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'filter' attribute on ToolbarFilterOption at ServiceRequestActivityLV.pcf: line 42, column 33
    function filter_1 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return filterSet.NotReviewOpenFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at ServiceRequestActivityLV.pcf: line 63, column 88
    function filter_11 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return filterSet.NotReviewExternalOpenFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at ServiceRequestActivityLV.pcf: line 66, column 87
    function filter_12 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return filterSet.MyNotReviewExternalOpenFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at ServiceRequestActivityLV.pcf: line 45, column 79
    function filter_2 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return filterSet.MyNotReviewNotExternalOpenFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at ServiceRequestActivityLV.pcf: line 48, column 76
    function filter_3 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return filterSet.NotReviewFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at ServiceRequestActivityLV.pcf: line 51, column 75
    function filter_4 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return filterSet.MyNotReviewNotExternalFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at ServiceRequestActivityLV.pcf: line 54, column 94
    function filter_5 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return filterSet.getMyNotReviewNotExternalOpenDueInNDaysFilter(7)
    }
    
    // 'filter' attribute on ToolbarFilterOption at ServiceRequestActivityLV.pcf: line 57, column 95
    function filter_7 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return filterSet.getMyNotReviewNotExternalOpenDueInNDaysFilter(14)
    }
    
    // 'filter' attribute on ToolbarFilterOption at ServiceRequestActivityLV.pcf: line 60, column 95
    function filter_9 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return filterSet.getMyNotReviewNotExternalOpenDueInNDaysFilter(30)
    }
    
    // 'initialValue' attribute on Variable at ServiceRequestActivityLV.pcf: line 13, column 49
    function initialValue_0 () : gw.api.activity.WorkplanFilterSet {
      return gw.api.activity.WorkplanFilterSet.INSTANCE
    }
    
    // 'label' attribute on ToolbarFilterOption at ServiceRequestActivityLV.pcf: line 60, column 95
    function label_10 () : java.lang.Object {
      return DisplayKey.get("Java.Workplan.MyOpenActivitiesDueNextNDays", 30)
    }
    
    // 'label' attribute on ToolbarFilterOption at ServiceRequestActivityLV.pcf: line 54, column 94
    function label_6 () : java.lang.Object {
      return DisplayKey.get("Java.Workplan.MyOpenActivitiesDueNextNDays", 7)
    }
    
    // 'label' attribute on ToolbarFilterOption at ServiceRequestActivityLV.pcf: line 57, column 95
    function label_8 () : java.lang.Object {
      return DisplayKey.get("Java.Workplan.MyOpenActivitiesDueNextNDays", 14)
    }
    
    // 'value' attribute on RowIterator at ServiceRequestActivityLV.pcf: line 91, column 40
    function sortValue_13 (activity :  entity.Activity) : java.lang.Object {
      return activity.TargetDate
    }
    
    // 'value' attribute on RowIterator at ServiceRequestActivityLV.pcf: line 98, column 41
    function sortValue_14 (activity :  entity.Activity) : java.lang.Object {
      return activity.Priority
    }
    
    // 'sortBy' attribute on RowIterator at ServiceRequestActivityLV.pcf: line 104, column 44
    function sortValue_15 (activity :  entity.Activity) : java.lang.Object {
      return activity.Status
    }
    
    // 'sortBy' attribute on RowIterator at ServiceRequestActivityLV.pcf: line 112, column 135
    function sortValue_16 (activity :  entity.Activity) : java.lang.Object {
      return activity.Subject
    }
    
    // 'sortBy' attribute on RowIterator at ServiceRequestActivityLV.pcf: line 118, column 178
    function sortValue_17 (activity :  entity.Activity) : java.lang.Object {
      return activity.AssignedByUser.Contact
    }
    
    // 'sortBy' attribute on RowIterator at ServiceRequestActivityLV.pcf: line 124, column 51
    function sortValue_18 (activity :  entity.Activity) : java.lang.Object {
      return activity.AssignmentStatus
    }
    
    // 'sortBy' attribute on RowIterator at ServiceRequestActivityLV.pcf: line 124, column 51
    function sortValue_19 (activity :  entity.Activity) : java.lang.Object {
      return  activity.AssignedUser
    }
    
    // 'sortBy' attribute on RowIterator at ServiceRequestActivityLV.pcf: line 124, column 51
    function sortValue_20 (activity :  entity.Activity) : java.lang.Object {
      return  activity.AssignedQueue
    }
    
    // 'value' attribute on RowIterator at ServiceRequestActivityLV.pcf: line 24, column 75
    function value_51 () : gw.api.database.IQueryBeanResult<entity.Activity> {
      return activityList
    }
    
    property get activityList () : gw.api.database.IQueryBeanResult<Activity> {
      return getRequireValue("activityList", 0) as gw.api.database.IQueryBeanResult<Activity>
    }
    
    property set activityList ($arg :  gw.api.database.IQueryBeanResult<Activity>) {
      setRequireValue("activityList", 0, $arg)
    }
    
    property get filterSet () : gw.api.activity.WorkplanFilterSet {
      return getVariableValue("filterSet", 0) as gw.api.activity.WorkplanFilterSet
    }
    
    property set filterSet ($arg :  gw.api.activity.WorkplanFilterSet) {
      setVariableValue("filterSet", 0, $arg)
    }
    
    function openWorksheet(act : Activity) {
      if(not gw.api.activity.ActivityUtil.isWorksheetOpen(act.ID)) {
        gw.api.activity.ActivityUtil.markActivityAsViewed(act)
        ActivityDetailViaClaimWorksheet.goInWorkspace(act.Claim, act)
      }
    }
    
    
  }
  
  
}