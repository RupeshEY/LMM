package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/WorkQueueWorkItemsLDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WorkQueueWorkItemsLDVExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/WorkQueueWorkItemsLDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkQueueWorkItemsLDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=WorkItem_Restart) at WorkQueueWorkItemsLDV.pcf: line 27, column 25
    function allCheckedRowsAction_0 (CheckedValues :  entity.WorkItem[], CheckedValuesErrors :  java.util.Map) : void {
      Helper.restart(CheckedValues)
    }
    
    // 'def' attribute on PanelRef at WorkQueueWorkItemsLDV.pcf: line 17, column 30
    function def_onEnter_1 (def :  pcf.WorkQueueWorkItemsLV_ActivityEsc) : void {
      def.onEnter(Helper, Queue)
    }
    
    // 'def' attribute on PanelRef at WorkQueueWorkItemsLDV.pcf: line 17, column 30
    function def_onEnter_3 (def :  pcf.WorkQueueWorkItemsLV_Archive) : void {
      def.onEnter(Helper, Queue)
    }
    
    // 'def' attribute on PanelRef at WorkQueueWorkItemsLDV.pcf: line 17, column 30
    function def_onEnter_5 (def :  pcf.WorkQueueWorkItemsLV_default) : void {
      def.onEnter(Helper, Queue)
    }
    
    // 'def' attribute on PanelRef at WorkQueueWorkItemsLDV.pcf: line 17, column 30
    function def_refreshVariables_2 (def :  pcf.WorkQueueWorkItemsLV_ActivityEsc) : void {
      def.refreshVariables(Helper, Queue)
    }
    
    // 'def' attribute on PanelRef at WorkQueueWorkItemsLDV.pcf: line 17, column 30
    function def_refreshVariables_4 (def :  pcf.WorkQueueWorkItemsLV_Archive) : void {
      def.refreshVariables(Helper, Queue)
    }
    
    // 'def' attribute on PanelRef at WorkQueueWorkItemsLDV.pcf: line 17, column 30
    function def_refreshVariables_6 (def :  pcf.WorkQueueWorkItemsLV_default) : void {
      def.refreshVariables(Helper, Queue)
    }
    
    // 'mode' attribute on PanelRef at WorkQueueWorkItemsLDV.pcf: line 17, column 30
    function mode_7 () : java.lang.Object {
      return Queue.QueueType
    }
    
    // 'value' attribute on TextInput (id=Exception) at WorkQueueWorkItemsLDV.pcf: line 42, column 51
    function valueRoot_10 () : java.lang.Object {
      return SelectedWorkItem
    }
    
    // 'value' attribute on TextInput (id=Exception) at WorkQueueWorkItemsLDV.pcf: line 42, column 51
    function value_8 () : java.lang.String {
      return SelectedWorkItem.Exception
    }
    
    // 'visible' attribute on Card (id=WorkItemExceptionCard) at WorkQueueWorkItemsLDV.pcf: line 35, column 54
    function visible_11 () : java.lang.Boolean {
      return SelectedWorkItem.Exception != null
    }
    
    property get Helper () : gw.api.web.tools.WorkQueueInfoPage {
      return getRequireValue("Helper", 0) as gw.api.web.tools.WorkQueueInfoPage
    }
    
    property set Helper ($arg :  gw.api.web.tools.WorkQueueInfoPage) {
      setRequireValue("Helper", 0, $arg)
    }
    
    property get Queue () : gw.api.web.tools.WorkQueueDisplayInfo {
      return getRequireValue("Queue", 0) as gw.api.web.tools.WorkQueueDisplayInfo
    }
    
    property set Queue ($arg :  gw.api.web.tools.WorkQueueDisplayInfo) {
      setRequireValue("Queue", 0, $arg)
    }
    
    property get SelectedWorkItem () : WorkItem {
      return getCurrentSelection(0) as WorkItem
    }
    
    property set SelectedWorkItem ($arg :  WorkItem) {
      setCurrentSelection(0, $arg)
    }
    
    
  }
  
  
}