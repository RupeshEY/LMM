package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/workplan/WorkplanLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WorkplanLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/workplan/WorkplanLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends WorkplanLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Subject) at WorkplanLV.pcf: line 115, column 135
    function action_47 () : void {
      if(not gw.api.activity.ActivityUtil.isWorksheetOpen(Activity.ID)) ActivityDetailForward.goInWorkspace(Claim, Activity)
    }
    
    // 'available' attribute on TextCell (id=Subject) at WorkplanLV.pcf: line 115, column 135
    function available_44 () : java.lang.Boolean {
      return perm.Activity.view(Activity)
    }
    
    // 'condition' attribute on ToolbarFlag at WorkplanLV.pcf: line 30, column 35
    function condition_24 () : java.lang.Boolean {
      return Activity.canAssign() && !gw.api.activity.ActivityUtil.isWorksheetOpen(Activity?.ID)
    }
    
    // 'condition' attribute on ToolbarFlag at WorkplanLV.pcf: line 33, column 33
    function condition_25 () : java.lang.Boolean {
      return Activity.canSkip() && !gw.api.activity.ActivityUtil.isWorksheetOpen(Activity?.ID)
    }
    
    // 'condition' attribute on ToolbarFlag at WorkplanLV.pcf: line 36, column 37
    function condition_26 () : java.lang.Boolean {
      return Activity.canComplete() && !gw.api.activity.ActivityUtil.isWorksheetOpen(Activity?.ID)
    }
    
    // 'condition' attribute on ToolbarFlag at WorkplanLV.pcf: line 39, column 36
    function condition_27 () : java.lang.Boolean {
      return Activity.canApprove() && !gw.api.activity.ActivityUtil.isWorksheetOpen(Activity?.ID)
    }
    
    // 'fontColor' attribute on DateCell (id=DueDate) at WorkplanLV.pcf: line 94, column 40
    function fontColor_35 () : java.lang.String {
      return gw.api.activity.ActivityUtil.isOverdue(Activity) ? "Red" : ""
    }
    
    // 'value' attribute on BooleanRadioCell (id=Updated) at WorkplanLV.pcf: line 79, column 52
    function valueRoot_30 () : java.lang.Object {
      return Activity
    }
    
    // 'value' attribute on BooleanRadioCell (id=Updated) at WorkplanLV.pcf: line 79, column 52
    function value_28 () : java.lang.Boolean {
      return Activity.UpdatedSinceLastViewed
    }
    
    // 'value' attribute on BooleanRadioCell (id=Escalated) at WorkplanLV.pcf: line 87, column 39
    function value_31 () : java.lang.Boolean {
      return Activity.Escalated
    }
    
    // 'value' attribute on DateCell (id=DueDate) at WorkplanLV.pcf: line 94, column 40
    function value_34 () : java.util.Date {
      return Activity.TargetDate
    }
    
    // 'value' attribute on TypeKeyCell (id=Priority) at WorkplanLV.pcf: line 101, column 41
    function value_38 () : typekey.Priority {
      return Activity.Priority
    }
    
    // 'value' attribute on TextCell (id=Status) at WorkplanLV.pcf: line 107, column 44
    function value_41 () : java.lang.String {
      return Activity.ActivityStatus
    }
    
    // 'value' attribute on TextCell (id=Subject) at WorkplanLV.pcf: line 115, column 135
    function value_45 () : java.lang.String {
      return String.isEmpty(Activity.Subject) ? DisplayKey.get("LV.Activity.Activities.NoSubject") : Activity.Subject
    }
    
    // 'value' attribute on TextCell (id=Exposure) at WorkplanLV.pcf: line 122, column 49
    function value_49 () : java.lang.String {
      return getExposuresString(Activity)
    }
    
    // 'value' attribute on BooleanRadioCell (id=ExternallyOwned) at WorkplanLV.pcf: line 127, column 45
    function value_51 () : java.lang.Boolean {
      return Activity.ExternallyOwned
    }
    
    // 'value' attribute on TextCell (id=ExternalOwner) at WorkplanLV.pcf: line 134, column 39
    function value_54 () : entity.Contact {
      return Activity.ExternalOwner
    }
    
    // 'value' attribute on TextCell (id=Assigner) at WorkplanLV.pcf: line 140, column 178
    function value_57 () : java.lang.String {
      return (Activity.AssignedByUser.Contact == null) ? DisplayKey.get("Java.Activity.AssignedByUser.SystemUser") : Activity.AssignedByUser.Contact.DisplayName
    }
    
    // 'value' attribute on TextCell (id=AssignedUser) at WorkplanLV.pcf: line 146, column 51
    function value_59 () : java.lang.String {
      return Activity.AssigneeDisplayString
    }
    
    property get Activity () : entity.Activity {
      return getIteratedValue(1) as entity.Activity
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/workplan/WorkplanLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkplanLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'filter' attribute on ToolbarFilterOption at WorkplanLV.pcf: line 45, column 33
    function filter_1 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.NotReviewOpenFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at WorkplanLV.pcf: line 66, column 88
    function filter_11 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.NotReviewExternalOpenFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at WorkplanLV.pcf: line 69, column 87
    function filter_12 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.MyNotReviewExternalOpenFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at WorkplanLV.pcf: line 48, column 79
    function filter_2 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.MyNotReviewNotExternalOpenFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at WorkplanLV.pcf: line 51, column 76
    function filter_3 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.NotReviewFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at WorkplanLV.pcf: line 54, column 75
    function filter_4 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.MyNotReviewNotExternalFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at WorkplanLV.pcf: line 57, column 94
    function filter_5 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.getMyNotReviewNotExternalOpenDueInNDaysFilter(7)
    }
    
    // 'filter' attribute on ToolbarFilterOption at WorkplanLV.pcf: line 60, column 95
    function filter_7 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.getMyNotReviewNotExternalOpenDueInNDaysFilter(14)
    }
    
    // 'filter' attribute on ToolbarFilterOption at WorkplanLV.pcf: line 63, column 95
    function filter_9 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.getMyNotReviewNotExternalOpenDueInNDaysFilter(30)
    }
    
    // 'initialValue' attribute on Variable at WorkplanLV.pcf: line 21, column 49
    function initialValue_0 () : gw.api.activity.WorkplanFilterSet {
      return gw.api.activity.WorkplanFilterSet.INSTANCE
    }
    
    // 'label' attribute on ToolbarFilterOption at WorkplanLV.pcf: line 63, column 95
    function label_10 () : java.lang.Object {
      return DisplayKey.get("Java.Workplan.MyOpenActivitiesDueNextNDays", 30)
    }
    
    // 'label' attribute on ToolbarFilterOption at WorkplanLV.pcf: line 57, column 94
    function label_6 () : java.lang.Object {
      return DisplayKey.get("Java.Workplan.MyOpenActivitiesDueNextNDays", 7)
    }
    
    // 'label' attribute on ToolbarFilterOption at WorkplanLV.pcf: line 60, column 95
    function label_8 () : java.lang.Object {
      return DisplayKey.get("Java.Workplan.MyOpenActivitiesDueNextNDays", 14)
    }
    
    // 'value' attribute on RowIterator at WorkplanLV.pcf: line 94, column 40
    function sortValue_13 (Activity :  entity.Activity) : java.lang.Object {
      return Activity.TargetDate
    }
    
    // 'value' attribute on RowIterator at WorkplanLV.pcf: line 101, column 41
    function sortValue_14 (Activity :  entity.Activity) : java.lang.Object {
      return Activity.Priority
    }
    
    // 'sortBy' attribute on RowIterator at WorkplanLV.pcf: line 107, column 44
    function sortValue_15 (Activity :  entity.Activity) : java.lang.Object {
      return Activity.Status
    }
    
    // 'sortBy' attribute on RowIterator at WorkplanLV.pcf: line 115, column 135
    function sortValue_16 (Activity :  entity.Activity) : java.lang.Object {
      return Activity.Subject
    }
    
    // 'sortBy' attribute on RowIterator at WorkplanLV.pcf: line 122, column 49
    function sortValue_17 (Activity :  entity.Activity) : java.lang.Object {
      return Activity.Exposure
    }
    
    // 'value' attribute on RowIterator at WorkplanLV.pcf: line 127, column 45
    function sortValue_18 (Activity :  entity.Activity) : java.lang.Object {
      return Activity.ExternallyOwned
    }
    
    // 'sortBy' attribute on RowIterator at WorkplanLV.pcf: line 134, column 39
    function sortValue_19 (Activity :  entity.Activity) : java.lang.Object {
      return Activity.ExternalOwnerCC.Contact
    }
    
    // 'sortBy' attribute on RowIterator at WorkplanLV.pcf: line 140, column 178
    function sortValue_20 (Activity :  entity.Activity) : java.lang.Object {
      return Activity.AssignedByUser.Contact
    }
    
    // 'sortBy' attribute on RowIterator at WorkplanLV.pcf: line 146, column 51
    function sortValue_21 (Activity :  entity.Activity) : java.lang.Object {
      return Activity.AssignmentStatus
    }
    
    // 'sortBy' attribute on RowIterator at WorkplanLV.pcf: line 146, column 51
    function sortValue_22 (Activity :  entity.Activity) : java.lang.Object {
      return  Activity.AssignedUser
    }
    
    // 'sortBy' attribute on RowIterator at WorkplanLV.pcf: line 146, column 51
    function sortValue_23 (Activity :  entity.Activity) : java.lang.Object {
      return  Activity.AssignedQueue
    }
    
    // 'value' attribute on RowIterator at WorkplanLV.pcf: line 27, column 75
    function value_62 () : gw.api.database.IQueryBeanResult<entity.Activity> {
      return ActivityList
    }
    
    property get ActivityList () : gw.api.database.IQueryBeanResult<Activity> {
      return getRequireValue("ActivityList", 0) as gw.api.database.IQueryBeanResult<Activity>
    }
    
    property set ActivityList ($arg :  gw.api.database.IQueryBeanResult<Activity>) {
      setRequireValue("ActivityList", 0, $arg)
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get FilterSet () : gw.api.activity.WorkplanFilterSet {
      return getVariableValue("FilterSet", 0) as gw.api.activity.WorkplanFilterSet
    }
    
    property set FilterSet ($arg :  gw.api.activity.WorkplanFilterSet) {
      setVariableValue("FilterSet", 0, $arg)
    }
    
    function getExposuresString( activity : Activity ) : String {
      if( activity.Exposure == null and activity.Claimant != null ) {
        return Claim.getExposuresForClaimant( activity.Claimant ).join( ", " )
      } else if( activity.Exposure != null ) {
        return activity.Exposure as String
      } else {
        return ""
      }
    }
    
    
  }
  
  
}