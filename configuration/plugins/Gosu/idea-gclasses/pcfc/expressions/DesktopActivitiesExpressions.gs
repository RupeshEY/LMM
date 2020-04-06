package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/desktop/activities/DesktopActivities.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DesktopActivitiesExpressions {
  @javax.annotation.Generated("config/web/pcf/desktop/activities/DesktopActivities.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopActivitiesExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=DesktopActivities_PrintButton) at DesktopActivities.pcf: line 68, column 25
    function action_7 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewWithOptions(PrintTargetLV)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=DesktopActivities_AssignButton) at DesktopActivities.pcf: line 32, column 25
    function allCheckedRowsAction_1 (CheckedValues :  entity.ActivityDesktopView[], CheckedValuesErrors :  java.util.Map) : void {
      AssignActivitiesPopup.push(new gw.api.activity.ActivityAssignmentPopup(CheckedValues))
    }
    
    // 'available' attribute on ToolbarButton (id=DesktopActivities_PrintButton) at DesktopActivities.pcf: line 68, column 25
    function available_6 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'canVisit' attribute on Page (id=DesktopActivities) at DesktopActivities.pcf: line 9, column 63
    static function canVisit_10 () : java.lang.Boolean {
      return perm.Activity.own and perm.System.viewdesktop
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=DesktopActivities_SkipButton) at DesktopActivities.pcf: line 39, column 25
    function checkedRowAction_2 (element :  entity.ActivityDesktopView, CheckedValue :  entity.ActivityDesktopView) : void {
      CheckedValue.Activity.skip()
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=DesktopActivities_CompleteButton) at DesktopActivities.pcf: line 46, column 25
    function checkedRowAction_3 (element :  entity.ActivityDesktopView, CheckedValue :  entity.ActivityDesktopView) : void {
      CheckedValue.Activity.complete()
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=DesktopActivities_ApproveButton) at DesktopActivities.pcf: line 54, column 25
    function checkedRowAction_4 (element :  entity.ActivityDesktopView, CheckedValue :  entity.ActivityDesktopView) : void {
      CheckedValue.Activity.approve()
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=DesktopActivities_RejectButton) at DesktopActivities.pcf: line 60, column 77
    function checkedRowAction_5 (element :  entity.ActivityDesktopView, CheckedValue :  entity.ActivityDesktopView) : void {
      CheckedValue.Activity.reject()
    }
    
    // 'def' attribute on PanelRef at DesktopActivities.pcf: line 71, column 61
    function def_onEnter_8 (def :  pcf.DesktopActivitiesLV) : void {
      def.onEnter(ActivityDesktopViewList)
    }
    
    // 'def' attribute on PanelRef at DesktopActivities.pcf: line 71, column 61
    function def_refreshVariables_9 (def :  pcf.DesktopActivitiesLV) : void {
      def.refreshVariables(ActivityDesktopViewList)
    }
    
    // 'initialValue' attribute on Variable at DesktopActivities.pcf: line 15, column 75
    function initialValue_0 () : gw.api.database.IQueryBeanResult<ActivityDesktopView> {
      return Activity.finder.getActivityDesktopViewsAssignedToCurrentUser()
    }
    
    // Page (id=DesktopActivities) at DesktopActivities.pcf: line 9, column 63
    static function parent_11 () : pcf.api.Destination {
      return pcf.Desktop.createDestination()
    }
    
    property get ActivityDesktopViewList () : gw.api.database.IQueryBeanResult<ActivityDesktopView> {
      return getVariableValue("ActivityDesktopViewList", 0) as gw.api.database.IQueryBeanResult<ActivityDesktopView>
    }
    
    property set ActivityDesktopViewList ($arg :  gw.api.database.IQueryBeanResult<ActivityDesktopView>) {
      setVariableValue("ActivityDesktopViewList", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.DesktopActivities {
      return super.CurrentLocation as pcf.DesktopActivities
    }
    
    property get PrintTargetLV () : java.lang.String {
      return getVariableValue("PrintTargetLV", 0) as java.lang.String
    }
    
    property set PrintTargetLV ($arg :  java.lang.String) {
      setVariableValue("PrintTargetLV", 0, $arg)
    }
    
    
  }
  
  
}