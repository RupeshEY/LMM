package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/summary/ClaimSummaryActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSummaryActivitiesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/summary/ClaimSummaryActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSummaryActivitiesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ClaimSummaryActivitiesLV.pcf: line 14, column 64
    function initialValue_0 () : gw.api.database.IQueryBeanResult<Activity> {
      return gw.api.claim.ClaimUtil.getActivities(Claim)
    }
    
    // 'value' attribute on RowIterator at ClaimSummaryActivitiesLV.pcf: line 27, column 23
    function sortValue_1 (Activity :  entity.Activity) : java.lang.Object {
      return Activity.TargetDate
    }
    
    // 'value' attribute on RowIterator at ClaimSummaryActivitiesLV.pcf: line 33, column 41
    function sortValue_2 (Activity :  entity.Activity) : java.lang.Object {
      return Activity.Priority
    }
    
    // 'sortBy' attribute on RowIterator at ClaimSummaryActivitiesLV.pcf: line 42, column 24
    function sortValue_3 (Activity :  entity.Activity) : java.lang.Object {
      return Activity.Subject
    }
    
    // 'sortBy' attribute on RowIterator at ClaimSummaryActivitiesLV.pcf: line 50, column 24
    function sortValue_4 (Activity :  entity.Activity) : java.lang.Object {
      return Activity.AssignmentStatus
    }
    
    // 'sortBy' attribute on RowIterator at ClaimSummaryActivitiesLV.pcf: line 50, column 24
    function sortValue_5 (Activity :  entity.Activity) : java.lang.Object {
      return  Activity.AssignedUser
    }
    
    // 'sortBy' attribute on RowIterator at ClaimSummaryActivitiesLV.pcf: line 50, column 24
    function sortValue_6 (Activity :  entity.Activity) : java.lang.Object {
      return  Activity.AssignedQueue
    }
    
    // 'value' attribute on RowIterator at ClaimSummaryActivitiesLV.pcf: line 19, column 75
    function value_24 () : gw.api.database.IQueryBeanResult<entity.Activity> {
      return ActivityList
    }
    
    property get ActivityList () : gw.api.database.IQueryBeanResult<Activity> {
      return getVariableValue("ActivityList", 0) as gw.api.database.IQueryBeanResult<Activity>
    }
    
    property set ActivityList ($arg :  gw.api.database.IQueryBeanResult<Activity>) {
      setVariableValue("ActivityList", 0, $arg)
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/summary/ClaimSummaryActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSummaryActivitiesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Subject) at ClaimSummaryActivitiesLV.pcf: line 42, column 24
    function action_17 () : void {
      ClaimWorkplan.go(Claim); ActivityDetailForward.goInWorkspace(Claim, Activity)
    }
    
    // 'action' attribute on TextCell (id=AssignedUser) at ClaimSummaryActivitiesLV.pcf: line 50, column 24
    function action_20 () : void {
      UserContactDetailPopup.push(Activity.AssignedUser)
    }
    
    // 'action' attribute on TextCell (id=AssignedUser) at ClaimSummaryActivitiesLV.pcf: line 50, column 24
    function action_dest_21 () : pcf.api.Destination {
      return pcf.UserContactDetailPopup.createDestination(Activity.AssignedUser)
    }
    
    // 'available' attribute on TextCell (id=Subject) at ClaimSummaryActivitiesLV.pcf: line 42, column 24
    function available_14 () : java.lang.Boolean {
      return perm.Activity.view(Activity)
    }
    
    // 'fontColor' attribute on DateCell (id=DueDate) at ClaimSummaryActivitiesLV.pcf: line 27, column 23
    function fontColor_8 () : java.lang.String {
      return Activity.Overdue ? "Red" : ""
    }
    
    // 'value' attribute on DateCell (id=DueDate) at ClaimSummaryActivitiesLV.pcf: line 27, column 23
    function valueRoot_10 () : java.lang.Object {
      return Activity
    }
    
    // 'value' attribute on TypeKeyCell (id=Priority) at ClaimSummaryActivitiesLV.pcf: line 33, column 41
    function value_11 () : typekey.Priority {
      return Activity.Priority
    }
    
    // 'value' attribute on TextCell (id=Subject) at ClaimSummaryActivitiesLV.pcf: line 42, column 24
    function value_15 () : java.lang.String {
      return String.isEmpty(Activity.Subject) ? DisplayKey.get("LV.Activity.Activities.NoSubject") : Activity.Subject
    }
    
    // 'value' attribute on TextCell (id=AssignedUser) at ClaimSummaryActivitiesLV.pcf: line 50, column 24
    function value_19 () : java.lang.String {
      return Activity.AssigneeDisplayString
    }
    
    // 'value' attribute on DateCell (id=DueDate) at ClaimSummaryActivitiesLV.pcf: line 27, column 23
    function value_7 () : java.util.Date {
      return Activity.TargetDate
    }
    
    property get Activity () : entity.Activity {
      return getIteratedValue(1) as entity.Activity
    }
    
    
  }
  
  
}