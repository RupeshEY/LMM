package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/groups/GroupDetail_QueueDetailPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class GroupDetail_QueueDetailPageExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/groups/GroupDetail_QueueDetailPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupDetail_QueueDetailPageExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Group :  Group, AssignableQueue :  AssignableQueue) : int {
      return 0
    }
    
    // 'canEdit' attribute on Page (id=GroupDetail_QueueDetailPage) at GroupDetail_QueueDetailPage.pcf: line 11, column 91
    function canEdit_2 () : java.lang.Boolean {
      return perm.Group.edit
    }
    
    // 'canVisit' attribute on Page (id=GroupDetail_QueueDetailPage) at GroupDetail_QueueDetailPage.pcf: line 11, column 91
    static function canVisit_3 (AssignableQueue :  AssignableQueue, Group :  Group) : java.lang.Boolean {
      return perm.Group.view
    }
    
    // 'def' attribute on ScreenRef at GroupDetail_QueueDetailPage.pcf: line 21, column 68
    function def_onEnter_0 (def :  pcf.GroupDetail_QueueDetailScreen) : void {
      def.onEnter(AssignableQueue, Group)
    }
    
    // 'def' attribute on ScreenRef at GroupDetail_QueueDetailPage.pcf: line 21, column 68
    function def_refreshVariables_1 (def :  pcf.GroupDetail_QueueDetailScreen) : void {
      def.refreshVariables(AssignableQueue, Group)
    }
    
    // 'parent' attribute on Page (id=GroupDetail_QueueDetailPage) at GroupDetail_QueueDetailPage.pcf: line 11, column 91
    static function parent_4 (AssignableQueue :  AssignableQueue, Group :  Group) : pcf.api.Destination {
      return pcf.GroupDetailPage.createDestination(Group)
    }
    
    // 'title' attribute on Page (id=GroupDetail_QueueDetailPage) at GroupDetail_QueueDetailPage.pcf: line 11, column 91
    static function title_5 (AssignableQueue :  AssignableQueue, Group :  Group) : java.lang.Object {
      return DisplayKey.get("Web.Admin.GroupDetail.Queue", AssignableQueue.Name)
    }
    
    property get AssignableQueue () : AssignableQueue {
      return getVariableValue("AssignableQueue", 0) as AssignableQueue
    }
    
    property set AssignableQueue ($arg :  AssignableQueue) {
      setVariableValue("AssignableQueue", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.GroupDetail_QueueDetailPage {
      return super.CurrentLocation as pcf.GroupDetail_QueueDetailPage
    }
    
    property get Group () : Group {
      return getVariableValue("Group", 0) as Group
    }
    
    property set Group ($arg :  Group) {
      setVariableValue("Group", 0, $arg)
    }
    
    
  }
  
  
}