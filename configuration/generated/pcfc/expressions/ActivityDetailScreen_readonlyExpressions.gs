package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/activity/ActivityDetailScreen.readonly.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ActivityDetailScreen_readonlyExpressions {
  @javax.annotation.Generated("config/web/pcf/workspace/activity/ActivityDetailScreen.readonly.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityDetailScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=ReadOnlyActivityDetailWorksheet_AssignButton) at ActivityDetailScreen.readonly.pcf: line 23, column 70
    function action_1 () : void {
      gw.api.assignment.AssignmentUtil.assignActivity(Activity)
    }
    
    // 'action' attribute on ToolbarButton (id=ReadOnlyActivityDetailWorksheet_NotesButton) at ActivityDetailScreen.readonly.pcf: line 30, column 112
    function action_3 () : void {
      ActivityNotesPage.goInMain(Activity.Claim, Activity)
    }
    
    // 'action' attribute on ToolbarButton (id=Close) at ActivityDetailScreen.readonly.pcf: line 36, column 48
    function action_6 () : void {
      gw.api.web.workspace.WorkspaceUtil.closeActiveWorksheet(); activityDetailHelper.worksheetClosed(Activity)
    }
    
    // 'action' attribute on ToolbarButton (id=MessageDetails) at ActivityDetailScreen.readonly.pcf: line 43, column 98
    function action_8 () : void {
      gw.api.web.workspace.WorkspaceUtil.closeActiveWorksheet(); activityDetailHelper.worksheetClosed(Activity); ECFMessageDetailsPopup.push(Activity.LMMessage_Ext as ECFMessageClaimData_Ext)
    }
    
    // 'action' attribute on ToolbarButton (id=ReadOnlyActivityDetailWorksheet_NotesButton) at ActivityDetailScreen.readonly.pcf: line 30, column 112
    function action_dest_4 () : pcf.api.Destination {
      return pcf.ActivityNotesPage.createDestination(Activity.Claim, Activity)
    }
    
    // 'def' attribute on PanelRef at ActivityDetailScreen.readonly.pcf: line 47, column 45
    function def_onEnter_11 (def :  pcf.ActivitySansNoteDV_catastrophe_review) : void {
      def.onEnter(Activity)
    }
    
    // 'def' attribute on PanelRef at ActivityDetailScreen.readonly.pcf: line 47, column 45
    function def_onEnter_13 (def :  pcf.ActivitySansNoteDV_default) : void {
      def.onEnter(Activity)
    }
    
    // 'def' attribute on PanelRef at ActivityDetailScreen.readonly.pcf: line 47, column 45
    function def_onEnter_9 (def :  pcf.ActivitySansNoteDV_approve_ecf_transaction) : void {
      def.onEnter(Activity)
    }
    
    // 'def' attribute on PanelRef at ActivityDetailScreen.readonly.pcf: line 47, column 45
    function def_refreshVariables_10 (def :  pcf.ActivitySansNoteDV_approve_ecf_transaction) : void {
      def.refreshVariables(Activity)
    }
    
    // 'def' attribute on PanelRef at ActivityDetailScreen.readonly.pcf: line 47, column 45
    function def_refreshVariables_12 (def :  pcf.ActivitySansNoteDV_catastrophe_review) : void {
      def.refreshVariables(Activity)
    }
    
    // 'def' attribute on PanelRef at ActivityDetailScreen.readonly.pcf: line 47, column 45
    function def_refreshVariables_14 (def :  pcf.ActivitySansNoteDV_default) : void {
      def.refreshVariables(Activity)
    }
    
    // 'mode' attribute on PanelRef at ActivityDetailScreen.readonly.pcf: line 47, column 45
    function mode_15 () : java.lang.Object {
      return Activity.ActivityPattern.Code
    }
    
    // 'visible' attribute on ToolbarButton (id=ReadOnlyActivityDetailWorksheet_AssignButton) at ActivityDetailScreen.readonly.pcf: line 23, column 70
    function visible_0 () : java.lang.Boolean {
      return Activity.canAssign() and not Activity.ECFApproval
    }
    
    // 'visible' attribute on ToolbarButton (id=ReadOnlyActivityDetailWorksheet_NotesButton) at ActivityDetailScreen.readonly.pcf: line 30, column 112
    function visible_2 () : java.lang.Boolean {
      return perm.Claim.view(Activity.Claim) and perm.System.viewclaimnotes and not Activity.ECFApproval
    }
    
    // 'visible' attribute on ToolbarButton (id=Close) at ActivityDetailScreen.readonly.pcf: line 36, column 48
    function visible_5 () : java.lang.Boolean {
      return !CurrentLocation.InEditMode
    }
    
    // 'visible' attribute on ToolbarButton (id=MessageDetails) at ActivityDetailScreen.readonly.pcf: line 43, column 98
    function visible_7 () : java.lang.Boolean {
      return ECFMessageClaimData_Ext.Type.isAssignableFrom(typeof Activity?.LMMessage_Ext)
    }
    
    property get Activity () : Activity {
      return getRequireValue("Activity", 0) as Activity
    }
    
    property set Activity ($arg :  Activity) {
      setRequireValue("Activity", 0, $arg)
    }
    
    property get activityDetailHelper () : gw.api.activity.ActivityDetailHelper {
      return getRequireValue("activityDetailHelper", 0) as gw.api.activity.ActivityDetailHelper
    }
    
    property set activityDetailHelper ($arg :  gw.api.activity.ActivityDetailHelper) {
      setRequireValue("activityDetailHelper", 0, $arg)
    }
    
    property get hasParent () : boolean {
      return getRequireValue("hasParent", 0) as java.lang.Boolean
    }
    
    property set hasParent ($arg :  boolean) {
      setRequireValue("hasParent", 0, $arg)
    }
    
    
  }
  
  
}