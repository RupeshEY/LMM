package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/desktop/queues/DesktopQueuedActivities.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DesktopQueuedActivitiesExpressions {
  @javax.annotation.Generated("config/web/pcf/desktop/queues/DesktopQueuedActivities.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopQueuedActivitiesExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=DesktopQueuedActivities_AssignNextButton) at DesktopQueuedActivities.pcf: line 63, column 73
    function action_16 () : void {
      gw.api.desktop.DesktopQueuedActivitiesUtil.assignNextQueuedActivityToMe()
    }
    
    // 'action' attribute on ToolbarButton (id=DesktopQueuedActivities_AssignNextButton2) at DesktopQueuedActivities.pcf: line 69, column 74
    function action_19 () : void {
      gw.api.desktop.DesktopQueuedActivitiesUtil.assignNextQueuedActivityToMe()
    }
    
    // 'action' attribute on ToolbarButton (id=DesktopQueuedActivities_RefreshButton) at DesktopQueuedActivities.pcf: line 74, column 63
    function action_20 () : void {
      gw.api.desktop.DesktopQueuedActivitiesUtil.refresh()
    }
    
    // 'action' attribute on ToolbarButton (id=DesktopQueuedActivities_PrintButton) at DesktopQueuedActivities.pcf: line 81, column 25
    function action_22 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewWithOptions(PrintTargetLV)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=DesktopQueuedActivities_AssignSelectedButton) at DesktopQueuedActivities.pcf: line 47, column 50
    function allCheckedRowsAction_11 (CheckedValues :  entity.ActivityDesktopView[], CheckedValuesErrors :  java.util.Map) : void {
      gw.api.desktop.DesktopQueuedActivitiesUtil.assignActivitiesToMe(CheckedValues)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=DesktopQueuedActivities_AssignButton) at DesktopQueuedActivities.pcf: line 55, column 50
    function allCheckedRowsAction_13 (CheckedValues :  entity.ActivityDesktopView[], CheckedValuesErrors :  java.util.Map) : void {
      gw.api.desktop.DesktopQueuedActivitiesUtil.clearErrors(); AssignActivitiesPopup.push(new gw.api.activity.ActivityAssignmentPopup(CheckedValues))
    }
    
    // 'available' attribute on ToolbarButton (id=DesktopQueuedActivities_AssignNextButton) at DesktopQueuedActivities.pcf: line 63, column 73
    function available_14 () : java.lang.Boolean {
      return !gw.api.desktop.DesktopQueuedActivitiesUtil.isSelectedQueueEmpty()
    }
    
    // 'available' attribute on ToolbarButton (id=DesktopQueuedActivities_PrintButton) at DesktopQueuedActivities.pcf: line 81, column 25
    function available_21 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'canVisit' attribute on Page (id=DesktopQueuedActivities) at DesktopQueuedActivities.pcf: line 9, column 69
    static function canVisit_25 () : java.lang.Boolean {
      return perm.Activity.viewqueue and perm.System.viewdesktop
    }
    
    // 'def' attribute on PanelRef at DesktopQueuedActivities.pcf: line 84, column 118
    function def_onEnter_23 (def :  pcf.DesktopQueuedActivitiesLV) : void {
      def.onEnter(gw.api.desktop.DesktopQueuedActivitiesUtil.getActivitiesForSelectedQueue())
    }
    
    // 'def' attribute on PanelRef at DesktopQueuedActivities.pcf: line 84, column 118
    function def_refreshVariables_24 (def :  pcf.DesktopQueuedActivitiesLV) : void {
      def.refreshVariables(gw.api.desktop.DesktopQueuedActivitiesUtil.getActivitiesForSelectedQueue())
    }
    
    // 'value' attribute on ToolbarRangeInput (id=AvailableQueues) at DesktopQueuedActivities.pcf: line 37, column 46
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      selectedQueue = (__VALUE_TO_SET as entity.AssignableQueue)
    }
    
    // 'initialValue' attribute on Variable at DesktopQueuedActivities.pcf: line 15, column 23
    function initialValue_0 () : boolean {
      return perm.Activity.pickfromqueue
    }
    
    // 'initialValue' attribute on Variable at DesktopQueuedActivities.pcf: line 23, column 38
    function initialValue_1 () : entity.AssignableQueue {
      return gw.api.desktop.DesktopQueuedActivitiesUtil.getSelectedQueue()
    }
    
    // 'onChange' attribute on PostOnChange at DesktopQueuedActivities.pcf: line 39, column 102
    function onChange_2 () : void {
      gw.api.desktop.DesktopQueuedActivitiesUtil.setSelectedQueue( selectedQueue )
    }
    
    // 'optionLabel' attribute on ToolbarRangeInput (id=AvailableQueues) at DesktopQueuedActivities.pcf: line 37, column 46
    function optionLabel_6 (VALUE :  entity.AssignableQueue) : java.lang.String {
      return gw.api.desktop.DesktopQueuedActivitiesUtil.getLabel(VALUE)
    }
    
    // Page (id=DesktopQueuedActivities) at DesktopQueuedActivities.pcf: line 9, column 69
    static function parent_26 () : pcf.api.Destination {
      return pcf.Desktop.createDestination()
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=AvailableQueues) at DesktopQueuedActivities.pcf: line 37, column 46
    function valueRange_7 () : java.lang.Object {
      return gw.api.desktop.DesktopQueuedActivitiesUtil.getQueues()
    }
    
    // 'value' attribute on ToolbarRangeInput (id=AvailableQueues) at DesktopQueuedActivities.pcf: line 37, column 46
    function value_3 () : entity.AssignableQueue {
      return selectedQueue
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=AvailableQueues) at DesktopQueuedActivities.pcf: line 37, column 46
    function verifyValueRangeIsAllowedType_8 ($$arg :  entity.AssignableQueue[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=AvailableQueues) at DesktopQueuedActivities.pcf: line 37, column 46
    function verifyValueRangeIsAllowedType_8 ($$arg :  gw.api.database.IQueryBeanResult<entity.AssignableQueue>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=AvailableQueues) at DesktopQueuedActivities.pcf: line 37, column 46
    function verifyValueRangeIsAllowedType_8 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=AvailableQueues) at DesktopQueuedActivities.pcf: line 37, column 46
    function verifyValueRange_9 () : void {
      var __valueRangeArg = gw.api.desktop.DesktopQueuedActivitiesUtil.getQueues()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_8(__valueRangeArg)
    }
    
    // 'visible' attribute on CheckedValuesToolbarButton (id=DesktopQueuedActivities_AssignSelectedButton) at DesktopQueuedActivities.pcf: line 47, column 50
    function visible_10 () : java.lang.Boolean {
      return perm.Activity.pickfromqueue
    }
    
    // 'visible' attribute on ToolbarButton (id=DesktopQueuedActivities_AssignNextButton) at DesktopQueuedActivities.pcf: line 63, column 73
    function visible_15 () : java.lang.Boolean {
      return  hasPickPermission and perm.Activity.nextfromqueue
    }
    
    // 'visible' attribute on ToolbarButton (id=DesktopQueuedActivities_AssignNextButton2) at DesktopQueuedActivities.pcf: line 69, column 74
    function visible_18 () : java.lang.Boolean {
      return  !hasPickPermission and perm.Activity.nextfromqueue
    }
    
    override property get CurrentLocation () : pcf.DesktopQueuedActivities {
      return super.CurrentLocation as pcf.DesktopQueuedActivities
    }
    
    property get PrintTargetLV () : java.lang.String {
      return getVariableValue("PrintTargetLV", 0) as java.lang.String
    }
    
    property set PrintTargetLV ($arg :  java.lang.String) {
      setVariableValue("PrintTargetLV", 0, $arg)
    }
    
    property get hasPickPermission () : boolean {
      return getVariableValue("hasPickPermission", 0) as java.lang.Boolean
    }
    
    property set hasPickPermission ($arg :  boolean) {
      setVariableValue("hasPickPermission", 0, $arg)
    }
    
    property get selectedQueue () : entity.AssignableQueue {
      return getVariableValue("selectedQueue", 0) as entity.AssignableQueue
    }
    
    property set selectedQueue ($arg :  entity.AssignableQueue) {
      setVariableValue("selectedQueue", 0, $arg)
    }
    
    
  }
  
  
}