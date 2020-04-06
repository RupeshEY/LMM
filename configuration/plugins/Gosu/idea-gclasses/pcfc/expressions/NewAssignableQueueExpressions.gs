package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/groups/NewAssignableQueue.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewAssignableQueueExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/groups/NewAssignableQueue.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewAssignableQueueExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Group :  Group) : int {
      return 0
    }
    
    // 'afterCancel' attribute on Page (id=NewAssignableQueue) at NewAssignableQueue.pcf: line 13, column 70
    function afterCancel_3 () : void {
      GroupDetailPage.go(Group)
    }
    
    // 'afterCancel' attribute on Page (id=NewAssignableQueue) at NewAssignableQueue.pcf: line 13, column 70
    function afterCancel_dest_4 () : pcf.api.Destination {
      return pcf.GroupDetailPage.createDestination(Group)
    }
    
    // 'afterCommit' attribute on Page (id=NewAssignableQueue) at NewAssignableQueue.pcf: line 13, column 70
    function afterCommit_5 (TopLocation :  pcf.api.Location) : void {
      GroupDetailPage.go(Group)
    }
    
    // 'def' attribute on ScreenRef at NewAssignableQueue.pcf: line 24, column 68
    function def_onEnter_1 (def :  pcf.GroupDetail_QueueDetailScreen) : void {
      def.onEnter(AssignableQueue, Group)
    }
    
    // 'def' attribute on ScreenRef at NewAssignableQueue.pcf: line 24, column 68
    function def_refreshVariables_2 (def :  pcf.GroupDetail_QueueDetailScreen) : void {
      def.refreshVariables(AssignableQueue, Group)
    }
    
    // 'initialValue' attribute on Variable at NewAssignableQueue.pcf: line 22, column 31
    function initialValue_0 () : AssignableQueue {
      return createQueue()
    }
    
    // 'parent' attribute on Page (id=NewAssignableQueue) at NewAssignableQueue.pcf: line 13, column 70
    static function parent_6 (Group :  Group) : pcf.api.Destination {
      return pcf.GroupDetailPage.createDestination(Group)
    }
    
    property get AssignableQueue () : AssignableQueue {
      return getVariableValue("AssignableQueue", 0) as AssignableQueue
    }
    
    property set AssignableQueue ($arg :  AssignableQueue) {
      setVariableValue("AssignableQueue", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.NewAssignableQueue {
      return super.CurrentLocation as pcf.NewAssignableQueue
    }
    
    property get Group () : Group {
      return getVariableValue("Group", 0) as Group
    }
    
    property set Group ($arg :  Group) {
      setVariableValue("Group", 0, $arg)
    }
    
    
          function createQueue() : AssignableQueue {
            var queue = new AssignableQueue(Group);
            queue.Group = Group;
            return queue
          }
        
    
    
  }
  
  
}