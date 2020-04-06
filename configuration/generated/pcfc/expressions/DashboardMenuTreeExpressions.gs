package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/dashboard/DashboardMenuTree.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DashboardMenuTreeExpressions {
  @javax.annotation.Generated("config/web/pcf/dashboard/DashboardMenuTree.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DashboardMenuTree2ExpressionsImpl extends DashboardMenuTreeExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'elementLabel' attribute on TreeView (id=DashboardMenuTree) at DashboardMenuTree.pcf: line 19, column 30
    function elementLabel_1 () : java.lang.Object {
      return element
    }
    
    // 'elementName' attribute on TreeView (id=DashboardMenuTree) at DashboardMenuTree.pcf: line 19, column 30
    function elementValueSetter_2 (__VALUE :  java.lang.Object) : void {
      element =  (__VALUE as gw.api.web.team.CCTeamTreeViewModel)
    }
    
    // 'onClickElement' attribute on TreeView (id=DashboardMenuTree) at DashboardMenuTree.pcf: line 19, column 30
    function onClickElement_3 () : void {
      element.treeElementClicked(CurrentLocation)
    }
    
    // 'value' attribute on TreeView (id=DashboardMenuTree) at DashboardMenuTree.pcf: line 19, column 30
    function value_4 () : gw.api.tree.TreeNode {
      return dashboardRoot
    }
    
    property get element () : gw.api.web.team.CCTeamTreeViewModel {
      return getTreeViewValue(1) as gw.api.web.team.CCTeamTreeViewModel
    }
    
    property set element ($arg :  gw.api.web.team.CCTeamTreeViewModel) {
      setTreeViewValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/dashboard/DashboardMenuTree.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DashboardMenuTreeExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at DashboardMenuTree.pcf: line 12, column 58
    function initialValue_0 () : gw.api.web.team.DashboardTreeViewRootModel {
      return new gw.api.web.team.DashboardTreeViewRootModel()
    }
    
    // 'visible' attribute on MenuTree (id=DashboardMenuTree) at DashboardMenuTree.pcf: line 8, column 36
    function visible_5 () : java.lang.Boolean {
      return perm.User.viewanyedb
    }
    
    property get dashboardRoot () : gw.api.web.team.DashboardTreeViewRootModel {
      return getVariableValue("dashboardRoot", 0) as gw.api.web.team.DashboardTreeViewRootModel
    }
    
    property set dashboardRoot ($arg :  gw.api.web.team.DashboardTreeViewRootModel) {
      setVariableValue("dashboardRoot", 0, $arg)
    }
    
    
  }
  
  
}