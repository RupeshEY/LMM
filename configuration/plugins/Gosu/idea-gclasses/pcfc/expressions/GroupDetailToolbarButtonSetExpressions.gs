package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/groups/GroupDetailToolbarButtonSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class GroupDetailToolbarButtonSetExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/groups/GroupDetailToolbarButtonSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupDetailToolbarButtonSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=GroupDetailPage_RegionsCard_DeleteButton) at GroupDetailToolbarButtonSet.pcf: line 19, column 36
    function action_3 () : void {
      gw.api.admin.BaseAdminUtil.deleteGroup(group); AdminWelcome.go() 
    }
    
    // 'available' attribute on ToolbarButton (id=GroupDetailPage_RegionsCard_DeleteButton) at GroupDetailToolbarButtonSet.pcf: line 19, column 36
    function available_1 () : java.lang.Boolean {
      return safeToDelete()
    }
    
    // EditButtons at GroupDetailToolbarButtonSet.pcf: line 10, column 19
    function label_0 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'tooltip' attribute on ToolbarButton (id=GroupDetailPage_RegionsCard_DeleteButton) at GroupDetailToolbarButtonSet.pcf: line 19, column 36
    function tooltip_4 () : java.lang.String {
      return safeToDelete()?"":DisplayKey.get("Web.Admin.GroupDetail.DeleteTooltip")
    }
    
    // 'visible' attribute on ToolbarButton (id=GroupDetailPage_RegionsCard_DeleteButton) at GroupDetailToolbarButtonSet.pcf: line 19, column 36
    function visible_2 () : java.lang.Boolean {
      return perm.Group.delete
    }
    
    property get group () : Group {
      return getRequireValue("group", 0) as Group
    }
    
    property set group ($arg :  Group) {
      setRequireValue("group", 0, $arg)
    }
    
    function safeToDelete():boolean {
      return group.SafeToDelete && group.AssignableQueues?.IsEmpty
    }
    
    
  }
  
  
}