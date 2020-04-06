package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/activity/CalendarActivityDetailWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CalendarActivityDetailWorksheetExpressions {
  @javax.annotation.Generated("config/web/pcf/workspace/activity/CalendarActivityDetailWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CalendarActivityDetailWorksheetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Activity :  Activity) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Worksheet (id=CalendarActivityDetailWorksheet) at CalendarActivityDetailWorksheet.pcf: line 11, column 101
    function beforeCommit_14 (pickedValue :  java.lang.Object) : void {
      activityDetailHelper.beforeCommit(Activity)
    }
    
    // 'canEdit' attribute on Worksheet (id=CalendarActivityDetailWorksheet) at CalendarActivityDetailWorksheet.pcf: line 11, column 101
    function canEdit_15 () : java.lang.Boolean {
      return canEdit
    }
    
    // 'canVisit' attribute on Worksheet (id=CalendarActivityDetailWorksheet) at CalendarActivityDetailWorksheet.pcf: line 11, column 101
    static function canVisit_16 (Activity :  Activity) : java.lang.Boolean {
      return perm.Activity.view(Activity)
    }
    
    // 'def' attribute on ScreenRef at CalendarActivityDetailWorksheet.pcf: line 42, column 69
    function def_onEnter_11 (def :  pcf.ActivityDetailScreen_readonly) : void {
      def.onEnter(Activity, activityDetailHelper, true) // no, it doesn't actually have a parent, but this preserves the existing behavior
    }
    
    // 'def' attribute on ScreenRef at CalendarActivityDetailWorksheet.pcf: line 42, column 69
    function def_onEnter_9 (def :  pcf.ActivityDetailScreen_editable) : void {
      def.onEnter(Activity, activityDetailHelper, true) // no, it doesn't actually have a parent, but this preserves the existing behavior
    }
    
    // 'def' attribute on ScreenRef at CalendarActivityDetailWorksheet.pcf: line 42, column 69
    function def_refreshVariables_10 (def :  pcf.ActivityDetailScreen_editable) : void {
      def.refreshVariables(Activity, activityDetailHelper, true) // no, it doesn't actually have a parent, but this preserves the existing behavior
    }
    
    // 'def' attribute on ScreenRef at CalendarActivityDetailWorksheet.pcf: line 42, column 69
    function def_refreshVariables_12 (def :  pcf.ActivityDetailScreen_readonly) : void {
      def.refreshVariables(Activity, activityDetailHelper, true) // no, it doesn't actually have a parent, but this preserves the existing behavior
    }
    
    // 'initialValue' attribute on Variable at CalendarActivityDetailWorksheet.pcf: line 35, column 23
    function initialValue_7 () : boolean {
      return Activity.canEdit()
    }
    
    // 'initialValue' attribute on Variable at CalendarActivityDetailWorksheet.pcf: line 39, column 52
    function initialValue_8 () : gw.api.activity.ActivityDetailHelper {
      return new gw.api.activity.ActivityDetailHelper(Activity, \ a -> CalendarActivityDetailWorksheet.goInWorkspace(a))
    }
    
    // 'location' attribute on Scope at CalendarActivityDetailWorksheet.pcf: line 15, column 42
    function location_0 () : pcf.api.Destination {
      return pcf.DesktopCalendarGroup.createDestination()
    }
    
    // 'location' attribute on Scope at CalendarActivityDetailWorksheet.pcf: line 17, column 54
    function location_1 () : pcf.api.Destination {
      return pcf.ClaimCalendarGroup.createDestination(Activity.Claim)
    }
    
    // 'location' attribute on Scope at CalendarActivityDetailWorksheet.pcf: line 19, column 41
    function location_2 () : pcf.api.Destination {
      return pcf.Claim.createDestination(Activity.Claim)
    }
    
    // 'location' attribute on Scope at CalendarActivityDetailWorksheet.pcf: line 21, column 72
    function location_3 () : pcf.api.Destination {
      return pcf.ClaimMatterCalendar.createDestination(Activity.Claim, Activity.Matter)
    }
    
    // 'location' attribute on Scope at CalendarActivityDetailWorksheet.pcf: line 23, column 82
    function location_4 () : pcf.api.Destination {
      return pcf.SupervisorClaimMatterCalendar.createDestination(Activity.Claim, Activity.Matter)
    }
    
    // 'location' attribute on Scope at CalendarActivityDetailWorksheet.pcf: line 25, column 59
    function location_5 () : pcf.api.Destination {
      return pcf.ClaimAllMattersCalendar.createDestination(Activity.Claim)
    }
    
    // 'location' attribute on Scope at CalendarActivityDetailWorksheet.pcf: line 27, column 69
    function location_6 () : pcf.api.Destination {
      return pcf.SupervisorClaimAllMattersCalendar.createDestination(Activity.Claim)
    }
    
    // 'mode' attribute on ScreenRef at CalendarActivityDetailWorksheet.pcf: line 42, column 69
    function mode_13 () : java.lang.Object {
      return canEdit ? "editable" : "readonly"
    }
    
    // 'title' attribute on Worksheet (id=CalendarActivityDetailWorksheet) at CalendarActivityDetailWorksheet.pcf: line 11, column 101
    static function title_17 (Activity :  Activity) : java.lang.Object {
      return DisplayKey.get("JSP.ActivityDetail.Detail.Title", Activity.Claim.ClaimNumber)
    }
    
    property get Activity () : Activity {
      return getVariableValue("Activity", 0) as Activity
    }
    
    property set Activity ($arg :  Activity) {
      setVariableValue("Activity", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.CalendarActivityDetailWorksheet {
      return super.CurrentLocation as pcf.CalendarActivityDetailWorksheet
    }
    
    property get activityDetailHelper () : gw.api.activity.ActivityDetailHelper {
      return getVariableValue("activityDetailHelper", 0) as gw.api.activity.ActivityDetailHelper
    }
    
    property set activityDetailHelper ($arg :  gw.api.activity.ActivityDetailHelper) {
      setVariableValue("activityDetailHelper", 0, $arg)
    }
    
    property get canEdit () : boolean {
      return getVariableValue("canEdit", 0) as java.lang.Boolean
    }
    
    property set canEdit ($arg :  boolean) {
      setVariableValue("canEdit", 0, $arg)
    }
    
    
  }
  
  
}