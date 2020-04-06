package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/litigation/MatterActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class MatterActivitiesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/litigation/MatterActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends MatterActivitiesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Subject) at MatterActivitiesLV.pcf: line 37, column 135
    function action_14 () : void {
      ClaimWorkplan.go(Claim); ActivityDetailForward.goInWorkspace(Claim, Activity)
    }
    
    // 'fontColor' attribute on DateCell (id=DueDate) at MatterActivitiesLV.pcf: line 24, column 40
    function fontColor_7 () : java.lang.String {
      return Activity.Overdue == true ? "Red" : ""
    }
    
    // 'value' attribute on DateCell (id=DueDate) at MatterActivitiesLV.pcf: line 24, column 40
    function valueRoot_9 () : java.lang.Object {
      return Activity
    }
    
    // 'value' attribute on TypeKeyCell (id=Priority) at MatterActivitiesLV.pcf: line 30, column 41
    function value_10 () : typekey.Priority {
      return Activity.Priority
    }
    
    // 'value' attribute on TextCell (id=Subject) at MatterActivitiesLV.pcf: line 37, column 135
    function value_13 () : java.lang.String {
      return String.isEmpty(Activity.Subject) ? DisplayKey.get("LV.Activity.Activities.NoSubject") : Activity.Subject
    }
    
    // 'value' attribute on TextCell (id=AssignedUser) at MatterActivitiesLV.pcf: line 42, column 51
    function value_16 () : java.lang.String {
      return Activity.AssigneeDisplayString
    }
    
    // 'value' attribute on DateCell (id=DueDate) at MatterActivitiesLV.pcf: line 24, column 40
    function value_6 () : java.util.Date {
      return Activity.TargetDate
    }
    
    property get Activity () : entity.Activity {
      return getIteratedValue(1) as entity.Activity
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/litigation/MatterActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MatterActivitiesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at MatterActivitiesLV.pcf: line 24, column 40
    function sortValue_0 (Activity :  entity.Activity) : java.lang.Object {
      return Activity.TargetDate
    }
    
    // 'value' attribute on RowIterator at MatterActivitiesLV.pcf: line 30, column 41
    function sortValue_1 (Activity :  entity.Activity) : java.lang.Object {
      return Activity.Priority
    }
    
    // 'sortBy' attribute on RowIterator at MatterActivitiesLV.pcf: line 37, column 135
    function sortValue_2 (Activity :  entity.Activity) : java.lang.Object {
      return Activity.Subject
    }
    
    // 'sortBy' attribute on RowIterator at MatterActivitiesLV.pcf: line 42, column 51
    function sortValue_3 (Activity :  entity.Activity) : java.lang.Object {
      return Activity.AssignmentStatus
    }
    
    // 'sortBy' attribute on RowIterator at MatterActivitiesLV.pcf: line 42, column 51
    function sortValue_4 (Activity :  entity.Activity) : java.lang.Object {
      return Activity.AssignedUser
    }
    
    // 'sortBy' attribute on RowIterator at MatterActivitiesLV.pcf: line 42, column 51
    function sortValue_5 (Activity :  entity.Activity) : java.lang.Object {
      return Activity.AssignedQueue
    }
    
    // 'value' attribute on RowIterator at MatterActivitiesLV.pcf: line 17, column 75
    function value_19 () : gw.api.database.IQueryBeanResult<entity.Activity> {
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
    
    
  }
  
  
}