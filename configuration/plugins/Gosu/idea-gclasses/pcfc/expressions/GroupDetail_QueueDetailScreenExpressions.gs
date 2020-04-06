package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/groups/GroupDetail_QueueDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class GroupDetail_QueueDetailScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/groups/GroupDetail_QueueDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupDetail_QueueDetailScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at GroupDetail_QueueDetailScreen.pcf: line 17, column 62
    function def_onEnter_1 (def :  pcf.AssignableQueueDetailDV) : void {
      def.onEnter(AssignableQueue, Group)
    }
    
    // 'def' attribute on PanelRef at GroupDetail_QueueDetailScreen.pcf: line 17, column 62
    function def_refreshVariables_2 (def :  pcf.AssignableQueueDetailDV) : void {
      def.refreshVariables(AssignableQueue, Group)
    }
    
    // EditButtons at GroupDetail_QueueDetailScreen.pcf: line 14, column 21
    function label_0 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    property get AssignableQueue () : AssignableQueue {
      return getRequireValue("AssignableQueue", 0) as AssignableQueue
    }
    
    property set AssignableQueue ($arg :  AssignableQueue) {
      setRequireValue("AssignableQueue", 0, $arg)
    }
    
    property get Group () : Group {
      return getRequireValue("Group", 0) as Group
    }
    
    property set Group ($arg :  Group) {
      setRequireValue("Group", 0, $arg)
    }
    
    
  }
  
  
}