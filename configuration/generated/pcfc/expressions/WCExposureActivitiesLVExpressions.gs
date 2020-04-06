package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/WCExposureActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WCExposureActivitiesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/WCExposureActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends WCExposureActivitiesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Subject) at WCExposureActivitiesLV.pcf: line 34, column 135
    function action_14 () : void {
      ClaimWorkplan.go(Activity.Claim); ActivityDetailForward.goInWorkspace(Activity.Claim, Activity)
    }
    
    // 'action' attribute on TextCell (id=AssignedUser) at WCExposureActivitiesLV.pcf: line 41, column 51
    function action_17 () : void {
      UserContactDetailPopup.push(Activity.AssignedUser)
    }
    
    // 'action' attribute on TextCell (id=AssignedUser) at WCExposureActivitiesLV.pcf: line 41, column 51
    function action_dest_18 () : pcf.api.Destination {
      return pcf.UserContactDetailPopup.createDestination(Activity.AssignedUser)
    }
    
    // 'fontColor' attribute on DateCell (id=DueDate) at WCExposureActivitiesLV.pcf: line 21, column 40
    function fontColor_7 () : java.lang.String {
      return Activity.Overdue ? "Red" : ""
    }
    
    // 'value' attribute on DateCell (id=DueDate) at WCExposureActivitiesLV.pcf: line 21, column 40
    function valueRoot_9 () : java.lang.Object {
      return Activity
    }
    
    // 'value' attribute on TypeKeyCell (id=Priority) at WCExposureActivitiesLV.pcf: line 27, column 41
    function value_10 () : typekey.Priority {
      return Activity.Priority
    }
    
    // 'value' attribute on TextCell (id=Subject) at WCExposureActivitiesLV.pcf: line 34, column 135
    function value_13 () : java.lang.String {
      return String.isEmpty(Activity.Subject) ? DisplayKey.get("LV.Activity.Activities.NoSubject") : Activity.Subject
    }
    
    // 'value' attribute on TextCell (id=AssignedUser) at WCExposureActivitiesLV.pcf: line 41, column 51
    function value_16 () : java.lang.String {
      return Activity.AssigneeDisplayString
    }
    
    // 'value' attribute on DateCell (id=DueDate) at WCExposureActivitiesLV.pcf: line 21, column 40
    function value_6 () : java.util.Date {
      return Activity.TargetDate
    }
    
    property get Activity () : entity.Activity {
      return getIteratedValue(1) as entity.Activity
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/exposures/WCExposureActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WCExposureActivitiesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at WCExposureActivitiesLV.pcf: line 21, column 40
    function sortValue_0 (Activity :  entity.Activity) : java.lang.Object {
      return Activity.TargetDate
    }
    
    // 'value' attribute on RowIterator at WCExposureActivitiesLV.pcf: line 27, column 41
    function sortValue_1 (Activity :  entity.Activity) : java.lang.Object {
      return Activity.Priority
    }
    
    // 'sortBy' attribute on RowIterator at WCExposureActivitiesLV.pcf: line 34, column 135
    function sortValue_2 (Activity :  entity.Activity) : java.lang.Object {
      return Activity.Subject
    }
    
    // 'sortBy' attribute on RowIterator at WCExposureActivitiesLV.pcf: line 41, column 51
    function sortValue_3 (Activity :  entity.Activity) : java.lang.Object {
      return Activity.AssignmentStatus
    }
    
    // 'sortBy' attribute on RowIterator at WCExposureActivitiesLV.pcf: line 41, column 51
    function sortValue_4 (Activity :  entity.Activity) : java.lang.Object {
      return  Activity.AssignedUser
    }
    
    // 'sortBy' attribute on RowIterator at WCExposureActivitiesLV.pcf: line 41, column 51
    function sortValue_5 (Activity :  entity.Activity) : java.lang.Object {
      return  Activity.AssignedQueue
    }
    
    // 'value' attribute on RowIterator at WCExposureActivitiesLV.pcf: line 14, column 75
    function value_21 () : gw.api.database.IQueryBeanResult<entity.Activity> {
      return activityList
    }
    
    property get activityList () : gw.api.database.IQueryBeanResult<Activity> {
      return getRequireValue("activityList", 0) as gw.api.database.IQueryBeanResult<Activity>
    }
    
    property set activityList ($arg :  gw.api.database.IQueryBeanResult<Activity>) {
      setRequireValue("activityList", 0, $arg)
    }
    
    
  }
  
  
}