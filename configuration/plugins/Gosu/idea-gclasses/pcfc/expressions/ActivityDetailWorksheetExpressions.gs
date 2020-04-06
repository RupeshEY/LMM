package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/activity/ActivityDetailWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ActivityDetailWorksheetExpressions {
  @javax.annotation.Generated("config/web/pcf/workspace/activity/ActivityDetailWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityDetailWorksheetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, Activity :  Activity) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Worksheet (id=ActivityDetailWorksheet) at ActivityDetailWorksheet.pcf: line 12, column 101
    function beforeCommit_8 (pickedValue :  java.lang.Object) : void {
      activityDetailHelper.beforeCommit(Activity)
    }
    
    // 'canEdit' attribute on Worksheet (id=ActivityDetailWorksheet) at ActivityDetailWorksheet.pcf: line 12, column 101
    function canEdit_9 () : java.lang.Boolean {
      return canEdit
    }
    
    // 'canVisit' attribute on Worksheet (id=ActivityDetailWorksheet) at ActivityDetailWorksheet.pcf: line 12, column 101
    static function canVisit_10 (Activity :  Activity, Claim :  Claim) : java.lang.Boolean {
      return perm.Activity.view(Activity)
    }
    
    // 'def' attribute on ScreenRef at ActivityDetailWorksheet.pcf: line 34, column 69
    function def_onEnter_3 (def :  pcf.ActivityDetailScreen_editable) : void {
      def.onEnter(Activity, activityDetailHelper, true)
    }
    
    // 'def' attribute on ScreenRef at ActivityDetailWorksheet.pcf: line 34, column 69
    function def_onEnter_5 (def :  pcf.ActivityDetailScreen_readonly) : void {
      def.onEnter(Activity, activityDetailHelper, true)
    }
    
    // 'def' attribute on ScreenRef at ActivityDetailWorksheet.pcf: line 34, column 69
    function def_refreshVariables_4 (def :  pcf.ActivityDetailScreen_editable) : void {
      def.refreshVariables(Activity, activityDetailHelper, true)
    }
    
    // 'def' attribute on ScreenRef at ActivityDetailWorksheet.pcf: line 34, column 69
    function def_refreshVariables_6 (def :  pcf.ActivityDetailScreen_readonly) : void {
      def.refreshVariables(Activity, activityDetailHelper, true)
    }
    
    // 'initialValue' attribute on Variable at ActivityDetailWorksheet.pcf: line 27, column 23
    function initialValue_1 () : boolean {
      return Activity.canEdit()
    }
    
    // 'initialValue' attribute on Variable at ActivityDetailWorksheet.pcf: line 31, column 52
    function initialValue_2 () : gw.api.activity.ActivityDetailHelper {
      return new gw.api.activity.ActivityDetailHelper(Activity, \ a -> ActivityDetailWorksheet.goInWorkspace(a.Claim, a))
    }
    
    // 'location' attribute on Scope at ActivityDetailWorksheet.pcf: line 16, column 32
    function location_0 () : pcf.api.Destination {
      return pcf.Claim.createDestination(Claim)
    }
    
    // 'mode' attribute on ScreenRef at ActivityDetailWorksheet.pcf: line 34, column 69
    function mode_7 () : java.lang.Object {
      return canEdit ? "editable" : "readonly"
    }
    
    // 'parent' attribute on Worksheet (id=ActivityDetailWorksheet) at ActivityDetailWorksheet.pcf: line 12, column 101
    static function parent_11 (Activity :  Activity, Claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimWorkplan.createDestination(Activity.Claim)
    }
    
    // 'title' attribute on Worksheet (id=ActivityDetailWorksheet) at ActivityDetailWorksheet.pcf: line 12, column 101
    static function title_12 (Activity :  Activity, Claim :  Claim) : java.lang.Object {
      return DisplayKey.get("JSP.ActivityDetail.Detail.Title", Activity.Claim.ClaimNumber)
    }
    
    property get Activity () : Activity {
      return getVariableValue("Activity", 0) as Activity
    }
    
    property set Activity ($arg :  Activity) {
      setVariableValue("Activity", 0, $arg)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ActivityDetailWorksheet {
      return super.CurrentLocation as pcf.ActivityDetailWorksheet
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
    
    function returnToWorksheet() {
      ActivityDetailForward.goInWorkspace(Activity.Claim, Activity)
    }
    
    
  }
  
  
}