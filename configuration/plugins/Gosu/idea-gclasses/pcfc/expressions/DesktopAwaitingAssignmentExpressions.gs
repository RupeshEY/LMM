package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/desktop/pendingassignment/DesktopAwaitingAssignment.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DesktopAwaitingAssignmentExpressions {
  @javax.annotation.Generated("config/web/pcf/desktop/pendingassignment/DesktopAwaitingAssignment.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopAwaitingAssignmentExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=DesktopAwaitingAssignment_PrintButton) at DesktopAwaitingAssignment.pcf: line 49, column 25
    function action_4 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewWithOptions(PrintTargetLV)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=DesktopAwaitingAssignment_AssignButton) at DesktopAwaitingAssignment.pcf: line 34, column 25
    function allCheckedRowsAction_1 (CheckedValues :  entity.ActivityUnassignedView[], CheckedValuesErrors :  java.util.Map) : void {
      gw.api.assignment.AssignmentUtil.assignUnassignedViews(CurrentLocation, CheckedValues)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=DesktopAwaitingAssignment_ReassignButton) at DesktopAwaitingAssignment.pcf: line 41, column 25
    function allCheckedRowsAction_2 (CheckedValues :  entity.ActivityUnassignedView[], CheckedValuesErrors :  java.util.Map) : void {
      AssignActivitiesPopup.push(new gw.api.activity.ActivityAssignmentPopup(CheckedValues))
    }
    
    // 'available' attribute on ToolbarButton (id=DesktopAwaitingAssignment_PrintButton) at DesktopAwaitingAssignment.pcf: line 49, column 25
    function available_3 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'canVisit' attribute on Page (id=DesktopAwaitingAssignment) at DesktopAwaitingAssignment.pcf: line 9, column 71
    static function canVisit_7 () : java.lang.Boolean {
      return perm.Activity.reviewassignment and perm.System.viewdesktop
    }
    
    // 'def' attribute on PanelRef at DesktopAwaitingAssignment.pcf: line 52, column 72
    function def_onEnter_5 (def :  pcf.DesktopAwaitingAssignmentLV) : void {
      def.onEnter(ActivityUnassignedViewList)
    }
    
    // 'def' attribute on PanelRef at DesktopAwaitingAssignment.pcf: line 52, column 72
    function def_refreshVariables_6 (def :  pcf.DesktopAwaitingAssignmentLV) : void {
      def.refreshVariables(ActivityUnassignedViewList)
    }
    
    // 'initialValue' attribute on Variable at DesktopAwaitingAssignment.pcf: line 16, column 85
    function initialValue_0 () : gw.api.database.IQueryBeanResult<entity.ActivityUnassignedView> {
      return Activity.finder.getAllActivityAwaitingAssignmentViews()
    }
    
    // Page (id=DesktopAwaitingAssignment) at DesktopAwaitingAssignment.pcf: line 9, column 71
    static function parent_8 () : pcf.api.Destination {
      return pcf.Desktop.createDestination()
    }
    
    property get ActivityUnassignedViewList () : gw.api.database.IQueryBeanResult<entity.ActivityUnassignedView> {
      return getVariableValue("ActivityUnassignedViewList", 0) as gw.api.database.IQueryBeanResult<entity.ActivityUnassignedView>
    }
    
    property set ActivityUnassignedViewList ($arg :  gw.api.database.IQueryBeanResult<entity.ActivityUnassignedView>) {
      setVariableValue("ActivityUnassignedViewList", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.DesktopAwaitingAssignment {
      return super.CurrentLocation as pcf.DesktopAwaitingAssignment
    }
    
    property get PrintTargetLV () : String {
      return getVariableValue("PrintTargetLV", 0) as String
    }
    
    property set PrintTargetLV ($arg :  String) {
      setVariableValue("PrintTargetLV", 0, $arg)
    }
    
    
  }
  
  
}