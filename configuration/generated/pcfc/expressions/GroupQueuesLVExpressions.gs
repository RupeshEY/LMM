package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/groups/GroupQueuesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class GroupQueuesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/groups/GroupQueuesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupQueuesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at GroupQueuesLV.pcf: line 36, column 41
    function sortValue_0 (AssignableQueue :  entity.AssignableQueue) : java.lang.Object {
      return AssignableQueue.Name
    }
    
    // 'value' attribute on RowIterator at GroupQueuesLV.pcf: line 41, column 48
    function sortValue_1 (AssignableQueue :  entity.AssignableQueue) : java.lang.Object {
      return AssignableQueue.Description
    }
    
    // 'value' attribute on RowIterator at GroupQueuesLV.pcf: line 47, column 52
    function sortValue_2 (AssignableQueue :  entity.AssignableQueue) : java.lang.Object {
      return AssignableQueue.SubGroupVisible
    }
    
    // 'toAdd' attribute on RowIterator at GroupQueuesLV.pcf: line 22, column 44
    function toAdd_18 (AssignableQueue :  entity.AssignableQueue) : void {
      Group.addToAssignableQueues(AssignableQueue)
    }
    
    // 'toRemove' attribute on RowIterator at GroupQueuesLV.pcf: line 22, column 44
    function toRemove_19 (AssignableQueue :  entity.AssignableQueue) : void {
      Group.removeFromAssignableQueues(AssignableQueue)
    }
    
    // 'value' attribute on RowIterator at GroupQueuesLV.pcf: line 22, column 44
    function value_20 () : entity.AssignableQueue[] {
      return Group.AssignableQueues
    }
    
    property get Group () : Group {
      return getRequireValue("Group", 0) as Group
    }
    
    property set Group ($arg :  Group) {
      setRequireValue("Group", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/groups/GroupQueuesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends GroupQueuesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Name) at GroupQueuesLV.pcf: line 36, column 41
    function action_5 () : void {
      GroupDetail_QueueDetailPage.go(Group, AssignableQueue)
    }
    
    // 'action' attribute on TextCell (id=Name) at GroupQueuesLV.pcf: line 36, column 41
    function action_dest_6 () : pcf.api.Destination {
      return pcf.GroupDetail_QueueDetailPage.createDestination(Group, AssignableQueue)
    }
    
    // 'condition' attribute on ToolbarFlag at GroupQueuesLV.pcf: line 27, column 35
    function condition_3 () : java.lang.Boolean {
      return AssignableQueue.queueCanBeDeleted()
    }
    
    // 'value' attribute on TextCell (id=Description) at GroupQueuesLV.pcf: line 41, column 48
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssignableQueue.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioCell (id=SubGroupVisible) at GroupQueuesLV.pcf: line 47, column 52
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssignableQueue.SubGroupVisible = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextCell (id=Name) at GroupQueuesLV.pcf: line 36, column 41
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssignableQueue.Name = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextCell (id=Name) at GroupQueuesLV.pcf: line 36, column 41
    function valueRoot_9 () : java.lang.Object {
      return AssignableQueue
    }
    
    // 'value' attribute on TextCell (id=Description) at GroupQueuesLV.pcf: line 41, column 48
    function value_10 () : java.lang.String {
      return AssignableQueue.Description
    }
    
    // 'value' attribute on BooleanRadioCell (id=SubGroupVisible) at GroupQueuesLV.pcf: line 47, column 52
    function value_14 () : java.lang.Boolean {
      return AssignableQueue.SubGroupVisible
    }
    
    // 'value' attribute on TextCell (id=Name) at GroupQueuesLV.pcf: line 36, column 41
    function value_4 () : java.lang.String {
      return AssignableQueue.Name
    }
    
    property get AssignableQueue () : entity.AssignableQueue {
      return getIteratedValue(1) as entity.AssignableQueue
    }
    
    
  }
  
  
}