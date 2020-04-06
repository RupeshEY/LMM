package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/assignment/AssignmentQueueLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AssignmentQueueLVExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/assignment/AssignmentQueueLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignmentQueueLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at AssignmentQueueLV.pcf: line 23, column 47
    function sortValue_0 (Queue :  entity.AssignableQueue) : java.lang.Object {
      return Queue
    }
    
    // 'value' attribute on RowIterator at AssignmentQueueLV.pcf: line 33, column 38
    function sortValue_1 (Queue :  entity.AssignableQueue) : java.lang.Object {
      return Queue.Description
    }
    
    // 'value' attribute on RowIterator at AssignmentQueueLV.pcf: line 16, column 82
    function value_20 () : gw.api.database.IQueryBeanResult<entity.AssignableQueue> {
      return Queues
    }
    
    property get Queues () : gw.api.database.IQueryBeanResult<AssignableQueue> {
      return getRequireValue("Queues", 0) as gw.api.database.IQueryBeanResult<AssignableQueue>
    }
    
    property set Queues ($arg :  gw.api.database.IQueryBeanResult<AssignableQueue>) {
      setRequireValue("Queues", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/assignment/AssignmentQueueLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends AssignmentQueueLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on GroupCell (id=Group) at GroupWidget.xml: line 10, column 49
    function action_5 () : void {
      pcf.GroupSearchPopup.push()
    }
    
    // 'action' attribute on GroupCell (id=Group) at GroupWidget.xml: line 13, column 49
    function action_7 () : void {
      pcf.OrganizationGroupTreePopup.push()
    }
    
    // 'action' attribute on GroupCell (id=Group) at GroupWidget.xml: line 10, column 49
    function action_dest_6 () : pcf.api.Destination {
      return pcf.GroupSearchPopup.createDestination()
    }
    
    // 'action' attribute on GroupCell (id=Group) at GroupWidget.xml: line 13, column 49
    function action_dest_8 () : pcf.api.Destination {
      return pcf.OrganizationGroupTreePopup.createDestination()
    }
    
    // 'pickValue' attribute on RowIterator at AssignmentQueueLV.pcf: line 16, column 82
    function pickValue_19 () : gw.api.assignment.Assignee {
      return Queue
    }
    
    // 'valueRange' attribute on GroupCell (id=Group) at GroupWidget.xml: line 7, column 52
    function valueRange_11 () : java.lang.Object {
      return gw.api.admin.BaseAdminUtil.getGroupsForCurrentUser()
    }
    
    // 'value' attribute on GroupCell (id=Group) at GroupWidget.xml: line 7, column 52
    function valueRoot_10 () : java.lang.Object {
      return Queue
    }
    
    // 'value' attribute on TextCell (id=Description) at AssignmentQueueLV.pcf: line 33, column 38
    function value_16 () : java.lang.String {
      return Queue.Description
    }
    
    // 'value' attribute on TextCell (id=Name) at AssignmentQueueLV.pcf: line 23, column 47
    function value_2 () : entity.AssignableQueue {
      return Queue
    }
    
    // 'value' attribute on GroupCell (id=Group) at AssignmentQueueLV.pcf: line 29, column 32
    function value_4 () : entity.Group {
      return Queue.Group
    }
    
    // 'valueRange' attribute on GroupCell (id=Group) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_12 ($$arg :  entity.Group[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupCell (id=Group) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_12 ($$arg :  gw.api.database.IQueryBeanResult<entity.Group>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupCell (id=Group) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_12 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupCell (id=Group) at GroupWidget.xml: line 7, column 52
    function verifyValueRange_13 () : void {
      var __valueRangeArg = gw.api.admin.BaseAdminUtil.getGroupsForCurrentUser()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_12(__valueRangeArg)
    }
    
    property get Queue () : entity.AssignableQueue {
      return getIteratedValue(1) as entity.AssignableQueue
    }
    
    
  }
  
  
}